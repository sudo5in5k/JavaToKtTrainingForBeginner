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

## 変数宣言

```java

// Java8まで
int length = 9;
final int length = 9; // 読み取り専用

// Java11
var length = 9;
```

```kotlin
var length = 9
val length = 9 // 読み取り専用
```

※ 基本的にはメモリの節約のため読み取り変数を使いましょう

## 関数宣言の仕方

```java
public void hoge() {
  return;
}

public void huga(String piyo) {
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

fun huga(piyo: String) {
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

## Null-Safety

* null参照時のエラーを防ぐ仕組み
    * Javaの場合は特段それが認識されないため、実行してからNullPointerExceptionでアプリやサービスが落ちる
        * OMG
        
### KotlinのNull-Safety

nullableとnon-nullの概念

#### nullable
nullがok

#### non-null
nullはだめ
        
## レシピ

### クラス編

* 関数宣言

* 継承

* データクラス

* Enum

### 基本構文編

* if

* 配列/コレクション

* for/forEach

* switch/when

以下余裕があれば

* スコープ関数

* filter
        

        

