# MessageView

![alt tag](https://github.com/ar-android/MessageView/raw/master/screen_shoot.png)

### Simple Message View Android Library
This is an Android project allowing to realize a MessageView instead of RelativeLayout in the simplest way possible.

# Usage
To make a MessageView add in your layout XML and add MessageView library in your project or you can also grab it via Gradle:

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
   repositories {
    maven { url "https://jitpack.io" }
   }
}
```

Add dependencies :
```gradle
dependencies {
     compile 'com.github.ar-android:MessageView:1.0.0'
}
```

# XML
```xml
<com.ahmadrosid.lib.MessageView
	android:id="@+id/message_view"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
```

# JAVA
```java
MessageView messageView = (MessageView)findViewById(R.id.message_view);
messageView.setLeft();
messageView.setTitleMessages("Tittle Message");
messageView.setDecsMessages("Description messages bla bla bla");
```

You also can set to right
```java
messageView.setRight();
```

LICENCE
PercentView by [Ahmad Rosid](https://github.com/ar-android) is licensed under a [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
