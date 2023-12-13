# 在Android Studio 上顯示網路圖片

#### 最終成果

<img  src="https://i.imgur.com/yp6V6cR.png" width = "20%">

範例圖片: https://web2.mcu.edu.tw/wp-content/uploads/2023/02/download_0.png

------------


### 1.在Manifest.XML 中加入網路使用權限
<img src="https://i.imgur.com/DdVVIn8.png" width="50%">

網路使用權限

`<uses-permission android:name="android.permission.INTERNET"></uses-permission>`

------------
### 2.加入ImageView UI元件
<img src="https://i.imgur.com/yoBugf0.png" width="80%">

#### XML

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:srcCompat="@tools:sample/avatars" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

### 3.加入implementation 並同步

<img src="https://i.imgur.com/7sKpOVe.png">

#### 進入build.gradle(Module internetimg)並加入

```xml
implementation "com.github.bumptech.glide:compose:1.0.0-beta01"
```

------------

### 4.撰寫JAVA程式碼
Glide用法
`Glide.with(context).load(url).into(imageView);
`
```java
package com.example.internetimg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView; // 宣告imageView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://web2.mcu.edu.tw/wp-content/uploads/2023/02/download_0.png"; //圖片網址
        imageView = findViewById(R.id.imageView); //連接前端
        Glide.with(this).load(url).into(imageView); //顯示圖片
    }
}


```
------------

### 執行結果

<img src="https://i.imgur.com/jwqbvsw.png">


------------



參考網站 : https://blog.fasterinfo.top/22874.html
