# 課題
## 入出力処理(ファイル操作)と例外処理を実装する。
---


## 目次
- [はじめに](#はじめに)
- [開発環境](#開発環境)
- [実行方法](#実行方法)
- [プログラムの内容](#プログラムの内容)
- [実行結果](#実行結果)
- [終わりに](#終わりに)
---




## 📖はじめに
### このプロジェクトは、Java を用いて「入出力処理と例外処理」を行う練習用プログラムです。
---



## 🛠開発環境
- 使用OS:Windows11
- 使用言語:Java
- JDK: Windows版のOracle JDK 21.0.8 (LTS)　⚠️LTSサポート有効期間:2026年9月まで
- 使用IDE:IntelliJ IDEA Commnunity Edition(無料版)

---



## 🚀実行方法
・Windowsの場合
「Shift + F10」のキーボードを同時に押して実行して下さい。



・Macの場合
「Control + R 」のキーボードを同時に押して実行して下さい。


---


## 💻プログラムの内容

1.throws IOExceptionをmainメソッドの所に書く。









<img width="621" height="70" alt="スクリーンショット 2025-09-09 074821" src="https://github.com/user-attachments/assets/35b76a89-44db-4956-9ddf-15e92a06e981" />



















2.パスを指定して、新規ファイルを作成する。









<img width="592" height="71" alt="スクリーンショット 2025-09-08 222305" src="https://github.com/user-attachments/assets/8a191a7c-a2f8-4506-b26e-eed5e1300425" />





※新規ファイルを作る前にパスを指定する時、try文の前にグローバル変数を作る事でどこでも使えるようになる。








<img width="135" height="35" alt="スクリーンショット 2025-09-09 080430" src="https://github.com/user-attachments/assets/3020b774-150a-416d-8e6b-8dc3073a0535" />







3.2で作成したファイルに内容を入力する。




<img width="575" height="70" alt="スクリーンショット 2025-09-09 074802" src="https://github.com/user-attachments/assets/3bc4902c-d6a1-45a5-aef2-7cd75fb9b0b8" />








4.ファイルを保存する。



<img width="474" height="69" alt="スクリーンショット 2025-09-09 074812" src="https://github.com/user-attachments/assets/ef449a03-f70a-41ac-9921-c008177cdb17" />











 
5.入出力処理(ファイル操作)を実装して、作ったファイルに文章を追加する。












<img width="918" height="190" alt="スクリーンショット 2025-09-09 080441" src="https://github.com/user-attachments/assets/c0352eb1-c2d1-4b21-80cc-0e101f37b8f2" />

























<img width="862" height="62" alt="スクリーンショット 2025-09-09 074855" src="https://github.com/user-attachments/assets/6e17b951-2006-4afc-b724-9e1fb59300fd" />


















6.2で作ったファイルを削除して、もう一度実行すると例外になるので、その例外の例外処理を行う。






<img width="297" height="95" alt="スクリーンショット 2025-09-09 080452" src="https://github.com/user-attachments/assets/797575d5-cda1-4109-a9f9-9017af215711" />









7.catchした中で更にファイルを書き込もうとして例外になった場合、どうなるのか確認する。










<img width="758" height="129" alt="スクリーンショット 2025-09-09 211437" src="https://github.com/user-attachments/assets/d84f59ad-2793-45ac-89d0-a78ac9fd13c6" />









---
## ✅実行結果
### 

3.新規ファイル作成時に、入力したファイル内容





<img width="247" height="29" alt="スクリーンショット 2025-09-09 081406" src="https://github.com/user-attachments/assets/07f3f31a-c98b-4ea3-b24a-881694a189d8" />






5.ファイル内容に追加された内容








<img width="471" height="28" alt="スクリーンショット 2025-09-09 081412" src="https://github.com/user-attachments/assets/a46db2fa-265a-41e7-8137-ceca7b15afc4" />











7.catchした中で更にファイルを書き込もうとして例外の結果







<img width="369" height="26" alt="スクリーンショット 2025-09-09 210354" src="https://github.com/user-attachments/assets/72505d38-5673-4dda-bf2d-42d54a5ef8e1" />
















---
## 🔚終わりに
これは、Javaの基本文法を学習する事を目的としています。
