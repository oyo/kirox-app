# Android Wrapper for the Kirox web app

A simple WebView wrapper Android app for the Kirox web app to use the apps in full screen mode.

https://oyo.github.io/kirox/

There are two ways to install the app:

Download the latest debug apk on your device from
https://github.com/oyo/kirox-app/releases/latest/
and install using 'Package Installer'

or

Build on your computer and install to your phone/tablet via adb

```bash
# on Mac
brew install openjdk@17 android-platform-tools
chmod +x ./gradlew
./gradlew assembleDebug
adb install $(find app/build -name \*debug.apk)
```

Assuming you have:
* homebrew installed
* development mode activated on your Android device
* device is connected to your computer
* adb set up

Note that we only provide the debug APK as it can be installed without signing.
Obviously the code can be used as a base for any other pure WebView app.