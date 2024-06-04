# Kotlin Setup

## On Windows (11)

- Installed IDE

  - **IntelliJ IDEA** (rekomendasi) [Link Download Intellij IDEA](https://www.jetbrains.com/idea/download/)
  - **Android Studio** [Link Download Android Studio](https://developer.android.com/studio)
  - **VS Code** (nb : klo leptop kentang gk kuat pake Intellij IDE) [Link Download VS Code](https://code.visualstudio.com/download)

    - Installed JDK
      - Download dan Install [Link Download JDK](https://www.oracle.com/id/java/technologies/downloads/)
      - cek version `java -version`
    - Install Kotlin **Command-line compiler**
      - Download [kotlin-compiler-2.0.0.zip](https://github.com/JetBrains/kotlin/releases/tag/v2.0.0)
      - Ekstrak dan replace in Local C
      - Tambahkan PATH **C:\kotlinc\bin** di **System Variables**
      - Cek pada CMD
        ` kotlinc`
    - Install Extension untuk kotlin

      1.  [Kotlin Language](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin)
      2.  [Code Runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner)

          konfigurasi **code runner** pada vs code agar dapat digunakan.

          - Buka **Extension**
          - Cari **Core Runner**
          - Pilih **icon** setting pada core runner
          - Pilih **Extension Settings**
          - Pilih **Executor Map**
          - Klick **Edit in settings.json**
          - Tambahkan 1 line ini di bawah java dan save

            ```
            "kotlin": "cd $dir && kotlinc $fileName -include-runtime -d $fileNameWithoutExt.jar && kotlin $fileNameWithoutExt.jar",

            ```

          - dan jangan lupa ceklis **Run In Terminal**

- Bikin 1 file baru di VS Code, Contoh `HelloWorld.kt` dan masukan code berikut

    ```kotlin
    fun main() {
        println("Hello World")
    }

- Klick kanan pada VS Code dan pilih **Run Code**

- Okey Cek Output pada terminal

- Thanks


## On Mac (Soon)
