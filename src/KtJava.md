# Kotlin Ref
https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/
     
# 環境
* Kotlin 1.3.50
* Java11
    * 今回はJava8でも動くレベルのコードしかないのでどちらでも可
    
* とにかく今回はJavaとKotlinが動く環境を用意すれば大丈夫

* 最悪オンラインエディターでも
     
# Description
     
## 変数定義

| プリミティブ型 | Java | Kotlin |
|:-----------|------------:|:------------:|
| ダブル | double | Double |
| フロート | float | Float |
| ロング | long | Long |
| イント | int | int |
| バイト | byte | Byte |
| 真偽値 | boolean | Boolean |

※ Javaには参照型のBooleanもあることに注意

## 関数宣言の仕方

```java
public void hoge() {
  return;
}

public int getNumOfCode() {
  return 2500;
}
```

```kotlin
fun hoge() {
  //
}

fun getNumOfCode(): Int {
  return 2500
}

fun getNumOfCode(): Int = 2500

// 型推論
fun getNumOfCode() = 2500
```

### 型推論

* 型推論
    * 静的型付け言語における機能、明示的に型を記述しなくてもコンパイラが自動的に型を決定してくれる

* 動的型付け
    * 動的型付け言語における言語機能、実行時に型が決定される
    * 代表的な動的型付け言語
        * Python, Ruby, JavaScript
    * 静的型付け言語
        * Java, Kotlin, TypeScript
        

        

