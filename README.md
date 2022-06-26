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
![](../../Raisetech課題用キャプチャ/Task7.GET結果.png) 

### POSTリクエスト実行結果
![](../../Raisetech課題用キャプチャ/Task7.POST結果.png)

### PATCHリクエスト実行結果
![](../../Raisetech課題用キャプチャ/Task7.PATCH結果.png)

### DELETEリクエスト実行結果
![](../../Raisetech課題用キャプチャ/Task7.DELETE結果.png)


## 3.オリジナルの仕様を加えてみる
### ***追加した仕様***
・クエリ文字をGET Controllerで受け取れるように実装（URLパラメータはGETメソッドで使うのがいいかと思いGET Controllerに実装しました）

・映画の公開年も受け取れるよう、POSTとPATCHそれぞれの"form"のフィールドに"releaseYear"メンバを追加

・POSTとPATCHにバリデーションをかけ、"movieTitle"が空文字、null、20文字以上の場合はエラーとなるように実装

### バリデーションをかけた結果の例（POSTで"movieTitle"が20文字以上だった場合）
![](../../../../Desktop/Task7.PostValidation.png)
※　全ての実行結果のキャプチャを添付するとREADMEが読みにくくなりそうだったので、実行結果については一部のみを添付（他のパターンについても全て実行確認済みです）