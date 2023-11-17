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

## Logs
We are logging the key value added in the local.properties file. Check for the entry in the debug console

> D/**Razor Pay Debug**(28439): RazorPay Key: YOUR_KEY_HERE

## Error Logs:
These are the error logs on tapping any button on the widget.

```java
I/ViewRootImpl@5a02b6b[MainActivity](29280): ViewPostIme pointer 0
W/dability_widget(29280): Accessing hidden method Landroid/view/MotionEvent;->getEventTimeNano()J (unsupported, reflection, allowed)
I/ViewRootImpl@5a02b6b[MainActivity](29280): ViewPostIme pointer 1
E/FrameEvents(29280): updateAcquireFence: Did not find frame.
D/InputMethodManager(29280): startInputInner - Id : 0
I/InputMethodManager(29280): startInputInner - mService.startInputOrWindowGainedFocus
E/FrameEvents(29280): updateAcquireFence: Did not find frame.
E/GPUAUX  (29280): [AUX]GuiExtAuxCheckAuxPath:663: Null anb
E/GPUAUX  (29280): [AUX]GuiExtAuxCheckAuxPath:663: Null anb
E/GPUAUX  (29280): [AUX]GuiExtAuxCheckAuxPath:663: Null anb
E/GPUAUX  (29280): [AUX]GuiExtAuxCheckAuxPath:663: Null anb
E/GPUAUX  (29280): [AUX]GuiExtAuxCheckAuxPath:663: Null anb
E/FrameEvents(29280): updateAcquireFence: Did not find frame.
E/FrameEvents(29280): updateAcquireFence: Did not find frame.
D/CompatibilityChangeReporter(29280): Compat change id reported: 210923482; UID 10738; state: ENABLED
I/DecorView(29280): setWindowBackground: isPopOver=false color=0 d=android.graphics.drawable.ColorDrawable@737a5e0
I/DecorView(29280): setWindowBackground: isPopOver=false color=0 d=android.graphics.drawable.ColorDrawable@737a5e0
I/DecorView(29280): [INFO] isPopOver=false config=false
I/DecorView(29280): updateCaptionType: isFloating=true isApplication=true hasWindowDecorCaption=false this=DecorView@d8cef3f[]
D/DecorView(29280): setCaptionType = 0, this = DecorView@d8cef3f[]
I/DecorView(29280): setWindowBackground: isPopOver=false color=0 d=android.graphics.drawable.ColorDrawable@e741d55
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
E/dability_widget(29280): Invalid ID 0x00000000.
D/ScrollView(29280): initGoToTop
D/ScrollView(29280): initGoToTop
W/Settings(29280): Setting show_button_background has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
D/NativeCustomFrequencyManager(29280): [NativeCFMS] BpCustomFrequencyManager::BpCustomFrequencyManager()
D/InsetsController(29280): onStateChanged: InsetsState: {mDisplayFrame=Rect(0, 0 - 1080, 2400), mDisplayCutout=DisplayCutout{insets=Rect(0, 78 - 0, 0) waterfall=Insets{left=0, top=0, right=0, bottom=0} boundingRect={Bounds=[Rect(0, 0 - 0, 0), Rect(468, 0 - 612, 78), Rect(0, 0 - 0, 0), Rect(0, 0 - 0, 0)]} cutoutPathParserInfo={CutoutPathParserInfo{displayWidth=1080 displayHeight=2400 physicalDisplayWidth=1080 physicalDisplayHeight=2400 density={2.8125} cutoutSpec={M 0,0 H -25.6 V 27.73333333333333 H 25.6 V 0 H 0 Z @dp} rotation={0} scale={1.0} physicalPixelDisplaySizeRatio={1.0}}}}, mRoundedCorners=RoundedCorners{[RoundedCorner{position=TopLeft, radius=90, center=Point(90, 90)}, RoundedCorner{position=TopRight, radius=90, center=Point(990, 90)}, RoundedCorner{position=BottomRight, radius=90, center=Point(990, 2310)}, RoundedCorner{position=BottomLeft, radius=90, center=Point(90, 2310)}]}  mRoundedCornerFrame=Rect(0, 0 - 1080, 2400), mPrivacyIndicatorBounds=PrivacyIndicatorBounds {static bounds=Rect(956, 0 - 1080, 78) rotation=0}, mSources= { InsetsSource: {mType=ITYPE_STATUS_BAR, mFrame=[0,0][1080,78], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_NAVIGATION_BAR, mFrame=[0,2358][1080,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_LEFT_GESTURES, mFrame=[0,0][84,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_RIGHT_GESTURES, mFrame=[996,0][1080,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_TOP_MANDATORY_GESTURES, mFrame=[0,0][1080,112], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_BOTTOM_MANDATORY_GESTURES, mFrame=[0,2310][1080,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_LEFT_DISPLAY_CUTOUT, mFrame=[0,0][-100000,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_TOP_DISPLAY_CUTOUT, mFrame=[0,0][1080,78], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_RIGHT_DISPLAY_CUTOUT, mFrame=[100000,0][1080,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_BOTTOM_DISPLAY_CUTOUT, mFrame=[0,100000][1080,2400], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_TOP_TAPPABLE_ELEMENT, mFrame=[0,0][1080,78], mVisible=true, mInsetsRoundedCornerFrame=false}, InsetsSource: {mType=ITYPE_BOTTOM_TAPPABLE_ELEMENT, mFrame=[0,0][0,0], mVisible=true, mInsetsRoundedCornerFrame=false} } host=com.example.flutter_affordability_widget/com.example.flutter_affordability_widget.MainActivity from=android.view.ViewRootImpl.setView:1732
I/ViewRootImpl@a5fab58[MainActivity](29280): setView = com.android.internal.policy.DecorView@d8cef3f TM=true
I/IMM_LC  (29280): hsifw() - flag : 0
I/IMM_LC  (29280): closeCurrentInput: mService.hideSoftInput
I/IMM_LC  (29280): hsifw() ignore mServedView == null or mServedView.getWindowToken() != windowToken, mServedView :0
D/AndroidRuntime(29280): Shutting down VM
E/AndroidRuntime(29280): FATAL EXCEPTION: main
E/AndroidRuntime(29280): Process: com.example.flutter_affordability_widget, PID: 29280
E/AndroidRuntime(29280): java.lang.ClassCastException: android.content.MutableContextWrapper cannot be cast to android.app.Activity
E/AndroidRuntime(29280): 	at a.a$b.invoke(SourceFile:2)
E/AndroidRuntime(29280): 	at a.a.b(Unknown Source:5)
E/AndroidRuntime(29280): 	at a.a$$ExternalSyntheticLambda2.run(Unknown Source:2)
E/AndroidRuntime(29280): 	at android.os.Handler.handleCallback(Handler.java:942)
E/AndroidRuntime(29280): 	at android.os.Handler.dispatchMessage(Handler.java:99)
E/AndroidRuntime(29280): 	at android.os.Looper.loopOnce(Looper.java:226)
E/AndroidRuntime(29280): 	at android.os.Looper.loop(Looper.java:313)
E/AndroidRuntime(29280): 	at android.app.ActivityThread.main(ActivityThread.java:8779)
E/AndroidRuntime(29280): 	at java.lang.reflect.Method.invoke(Native Method)
E/AndroidRuntime(29280): 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:604)
E/AndroidRuntime(29280): 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1067)
D/OpenGLRenderer(29280): setSurface called with nullptr
D/InputTransport(29280): Input channel destroyed: 'ClientS', fd=264
D/OpenGLRenderer(29280): setSurface called with nullptr
D/BufferQueueConsumer(29280): [SurfaceTexture-0-29280-0](id:726000000002,api:0,p:-1,c:29280) disconnect
D/BufferQueueConsumer(29280): [SurfaceTexture-0-29280-1](id:726000000003,api:0,p:-1,c:29280) disconnect
I/Process (29280): Sending signal. PID: 29280 SIG: 9
Lost connection to device.
the Dart compiler exited unexpectedly.

```
