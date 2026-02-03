# Android Wrapper for Kirox WebApp

This is a simple WebView wrapper Android app for the Kirox web app.

https://oyo.github.io/kirox/


Steps to build and install on your phone

```bash
# on Mac
brew install openjdk@17 android-platform-tools
./gradlew assembleDebug
adb install $(find app/build -name \*debug.apk)
```

Assuming you have:
* homebrew installed
* development mode activated on your Android device
* connected the device to your computer
* adb set up
