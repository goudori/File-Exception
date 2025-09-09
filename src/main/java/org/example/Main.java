package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * 課題 1.入出力処理(ファイル操作)を実装して、作ったファイルに文章を追加する。 2.1で作ったファイルを削除して、もう一度実行すると例外になるので、その例外の例外処理を行う。
 * 3.catchした中で更にファイルを書き込もうとして例外になった場合、どうなるのか確認する。
 */
public class Main {

  // throws IOException は例外処理
  public static void main(String[] args) throws IOException {

    Path path;
    // 新規ファイルをどこに作る
    try {
      path = Path.of(System.getProperty("user.dir"), "test.txt");

      // ファイルの場所、ファイルの内容、ファイル内容の追加を書く
      Files.writeString(path, "Javaコースを継続して頑張ろう", StandardOpenOption.APPEND);
      // ファイルを保存する
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      // 存在しないファイルなので、ファイル作成はしない
      System.out.println(Files.readString(Path.of("nazo.txt")));
      // 意図的に例外を発生させる　：→ファイル名を無効にする記号
      System.out.println(
          Files.writeString(Path.of(":name.txt"), "この行は実行されません",
              StandardOpenOption.CREATE));
    }

  }
}
