# Android Wrapper for Kirox WebApp

This is a simple app for my the Kirox web app.

https://oyo.github.io/kirox/


Steps to build

```bash
# on Mac
brew install openjdk@17 android-platform-tools
./gradlew assemble
adb install $(find app/build -name \*debug.apk)
```

This assumes you have your Android device connected and adb is set up