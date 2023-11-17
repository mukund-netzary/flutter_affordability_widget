# Flutter Razorpay Affordability Widget

Razorpay Affordability Widget integration for flutter. Uses hybrid composition to call android native view as mentioned in the [Hosting Native views on flutter](https://docs.flutter.dev/platform-integration/android/platform-views?tab=android-platform-views-kotlin-tab)

## Run Locally

Fork the project.

Add the key in android/local.properties file

```flutter
  razorPay.testKey="YOUR_KEY_HERE"
```

-  Open the project as android project in android studio.
-  Open files in android studio, then select Build.
-  Select Make Project.

By doing so, the local properties value will get synced with the project.

Clean the project on flutter module.

```flutter
flutter clean
flutter pub get
```
Run the app. When the widget is loaded, pressing on any of the buttons will crash the application.
