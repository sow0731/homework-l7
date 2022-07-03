# 第7回課題概要

## 課題内容

***1***. HTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装\
***2***. 作成したソースコードをGitHubにpushする\
***3***. オリジナルの仕様を加えてみる\
例)\
・クエリ文字列を受け取れるようにする\
・名前以外にも生年月日を受け取れるよう実装する\
・バリデーションについて調べてnameが空文字、null、20文字以上の場合はエラーとする

## 1.HTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装

### GETリクエスト実行結果
![Task7 GET結果](https://user-images.githubusercontent.com/103630732/175551804-eb4755d7-7032-40a4-8c40-4065543dd9ae.png)

### POSTリクエスト実行結果
![Task7 POST結果](https://user-images.githubusercontent.com/103630732/175551830-2e1d2487-2643-47a9-9677-7d7b2d435a57.png)

### PATCHリクエスト実行結果
![Task7 PATCH結果](https://user-images.githubusercontent.com/103630732/175551912-59522ed4-e467-48da-b7ab-1740f7f85d2a.png)

### DELETEリクエスト実行結果
![Task7 DELETE結果](https://user-images.githubusercontent.com/103630732/175814978-a6242083-6831-4d8a-ad63-301fee3837ca.png)


## 3.オリジナルの仕様を加えてみる
### ***追加した仕様***
・クエリ文字をGET Controllerで受け取れるように実装（URLパラメータはGETメソッドで使うのがいいかと思いGET Controllerに実装しました）

・映画の公開年も受け取れるよう、POSTとPATCHそれぞれの"form"のフィールドに"releaseYear"メンバを追加

・POSTとPATCHにバリデーションをかけ、"movieTitle"が空文字、null、20文字以上の場合はエラーとなるように実装

### バリデーションをかけた結果の例（POSTで"movieTitle"が20文字以上だった場合）
![Task7 PostValidation](https://user-images.githubusercontent.com/103630732/175815001-01fedcc1-9341-4dc5-b940-1c32230de3e9.png)

※　全ての実行結果のキャプチャを添付するとREADMEが読みにくくなりそうだったので、実行結果については一部のみを添付（他のパターンについても全て実行確認済みです）

## レビュー指摘の対応
### ***指摘内容とその対応***
・URL設計のリソース名を複数形に変更　→　movie-info -> moviesに変更

・ワイルドカードインポートは避ける　→　https://qiita.com/Yuki10/items/9ebb7f1bdf4c800765a　を参考にIntelli Jの設定を変更し対応

・こちらの指摘についての対応　https://github.com/sow0731/homework-l7/pull/1#discussion_r906816487　 \
→　"movieId"で0~2の数値を受け取り、その値によって表示が変わる仕様に変更。(0を受け取った場合は全て出力される)\
0 ~ 2以外の値を受けた場合は例外処理されるように処理を追加

***実行結果***

0を受け取った場合

![スクリーンショット 2022-07-03 22 50 10](https://user-images.githubusercontent.com/103630732/177043980-0eab197f-dc09-49a1-af7f-f2f296795415.png)

指定の値以外を受け取った場合

![スクリーンショット 2022-07-03 22 50 30](https://user-images.githubusercontent.com/103630732/177044077-c9ad72c6-342b-46cc-b5cc-6e6cccf77c47.png)



・パッケージ名を全て小文字に変更

