package com.p069ss.bytertc.base.media.screen;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.p069ss.bytertc.base.media.screen.ScreenAudioCaptureAndroidManager;
import com.p069ss.bytertc.base.media.screen.ScreenCaptureAndroidManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.up40;

/* JADX INFO: loaded from: classes12.dex */
public class RXScreenCaptureService extends Service {
    private static final String ACTION = "ACTION";
    public static final int COMMAND_AUDIO_DISPOSE = 8;
    public static final int COMMAND_AUDIO_START = 6;
    public static final int COMMAND_AUDIO_STOP = 7;
    public static final int COMMAND_CHANGE_CAPTURE_FORMAT = 3;
    public static final int COMMAND_DISPOSE = 5;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_LAUNCH = 0;
    public static final int COMMAND_ON_FRAME = 4;
    public static final int COMMAND_START = 1;
    public static final int COMMAND_STOP = 2;
    public static final int COMMAND_STOP_SERVICE = 9;
    private static final String DATA = "DATA";
    public static final String KEY_CONTENT_TEXT = "contentText";
    public static final String KEY_HASHCODE = "hc";
    public static final String KEY_HEIGHT = "h";
    public static final String KEY_IFRAMERATE = "if";
    public static final String KEY_INDEX = "i";
    public static final String KEY_LARGE_ICON = "largei";
    public static final String KEY_LAUNCH_ACTIVITY = "activity";
    public static final String KEY_MIN_FRAMERATE = "minfr";
    public static final String KEY_PICO_CREATE_MEDIA_PROJECTION = "pico_create_media_projection";
    public static final String KEY_PICO_NEED_CAPTURE_2D_TEXTURE = "pico_need_capture_2d_texture";
    public static final String KEY_PICO_NOT_CHECK_ORIENTATION = "pico_not_check_orientation";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_DPI = "pico_virtual_display_dpi";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_FLAG = "pico_virtual_display_flags";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_NAME = "pico_virtual_display_name";
    public static final String KEY_RESULT_DATA = "PermissionResult";
    public static final String KEY_SMALL_ICON = "largei";
    public static final String KEY_WIDTH = "w";
    public static final String METHOD_PICO_CREATE_MEDIA_PROJECTION = "createMediaProjection";
    private static final String TAG = "RXScreenCaptureService";
    public static AtomicBoolean serviceStarted = new AtomicBoolean(false);
    String mContentText;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    String mLaunchActivity;
    private MediaProjection mMediaProjection;
    private MediaProjectionManager mMediaProjectionManager;
    private Intent mPermissionReulstData;
    int mLargeIcon = -1;
    int mSmallIcon = -1;
    private boolean mPicoCreateMediaProjection = false;

    private void audioDispose() {
        this.mHandler.post(new Runnable() { // from class: l.nbc0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenAudioCaptureAndroidManager.INSTANCE().dispose();
            }
        });
    }

    private void changeCaptureFormat(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra("w", 0);
        final int intExtra2 = data.getIntExtra("h", 0);
        final int intExtra3 = data.getIntExtra(KEY_IFRAMERATE, 0);
        this.mHandler.post(new Runnable() { // from class: l.kbc0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(intExtra, intExtra2, intExtra3);
            }
        });
    }

    @RequiresApi(api = 16)
    private void createNotificationChannel() {
        Class<?> cls;
        try {
            cls = Class.forName(this.mLaunchActivity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls == null) {
            return;
        }
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        Intent intent = new Intent(this, cls);
        int i = Build.VERSION.SDK_INT;
        builder.setContentIntent(PendingIntent.getActivity(this, 0, intent, i > 30 ? 201326592 : 134217728)).setLargeIcon(BitmapFactory.decodeResource(getResources(), this.mLargeIcon)).setSmallIcon(this.mSmallIcon).setContentText(this.mContentText).setWhen(System.currentTimeMillis());
        if (i >= 26) {
            builder.setChannelId("notification_id");
        }
        if (i >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(up40.m194605a("notification_id", "notification_name", 2));
        }
        Notification notificationBuild = builder.build();
        notificationBuild.defaults = 1;
        if (i >= 33) {
            startForeground(110, notificationBuild, 32);
        } else {
            startForeground(110, notificationBuild);
        }
    }

    private void createOrGetMediaProjection() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (this.mMediaProjection == null) {
            if (this.mMediaProjectionManager == null && applicationContext != null) {
                this.mMediaProjectionManager = (MediaProjectionManager) applicationContext.getSystemService("media_projection");
            }
            MediaProjectionManager mediaProjectionManager = this.mMediaProjectionManager;
            if (mediaProjectionManager != null) {
                this.mMediaProjection = mediaProjectionManager.getMediaProjection(-1, this.mPermissionReulstData);
            }
            if (this.mMediaProjection == null && this.mPicoCreateMediaProjection) {
                try {
                    this.mMediaProjection = (MediaProjection) MediaProjectionManager.class.getMethod(METHOD_PICO_CREATE_MEDIA_PROJECTION, null).invoke(this.mMediaProjectionManager, null);
                } catch (Exception unused) {
                    this.mMediaProjection = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80871d(RXScreenCaptureService rXScreenCaptureService) {
        rXScreenCaptureService.getClass();
        ScreenAudioCaptureAndroidManager.INSTANCE().startAudioCapture(rXScreenCaptureService.mMediaProjection);
    }

    private void dispose(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra(KEY_HASHCODE, 0);
        this.mHandler.post(new Runnable() { // from class: l.ibc0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenCaptureAndroidManager.INSTANCE().dispose(intExtra);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80873f(RXScreenCaptureService rXScreenCaptureService, int i, int i2, int i3, int i4) {
        rXScreenCaptureService.getClass();
        ScreenCaptureAndroidManager.INSTANCE().startCapture(i, i2, i3, i4, rXScreenCaptureService.mMediaProjection);
    }

    private static int getCommand(Intent intent) {
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra(ACTION, -1);
    }

    private static Intent getData(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra(DATA);
    }

    public static Intent getServiceIntent(Context context, int i, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) RXScreenCaptureService.class);
        intent2.putExtra(ACTION, i);
        if (intent != null) {
            intent2.putExtra(DATA, intent);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m80875h(RXScreenCaptureService rXScreenCaptureService) {
        rXScreenCaptureService.stopMediaProjection();
        rXScreenCaptureService.stopForeground(true);
        rXScreenCaptureService.stopSelf();
    }

    private void startAudioCapture() {
        createOrGetMediaProjection();
        this.mHandler.post(new Runnable() { // from class: l.pbc0
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.m80871d(this.f148074a);
            }
        });
    }

    private void startCapture(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        createOrGetMediaProjection();
        final int intExtra = data.getIntExtra("w", 0);
        final int intExtra2 = data.getIntExtra("h", 0);
        final int intExtra3 = data.getIntExtra(KEY_IFRAMERATE, 0);
        final int intExtra4 = data.getIntExtra(KEY_MIN_FRAMERATE, 0);
        this.mHandler.post(new Runnable() { // from class: l.jbc0
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.m80873f(this.f117172a, intExtra, intExtra2, intExtra3, intExtra4);
            }
        });
    }

    @RequiresApi(api = 16)
    private void startLaunch(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        this.mLargeIcon = data.getIntExtra("largei", -1);
        this.mSmallIcon = data.getIntExtra("largei", -1);
        this.mLaunchActivity = data.getStringExtra("activity");
        this.mContentText = data.getStringExtra(KEY_CONTENT_TEXT);
        this.mPicoCreateMediaProjection = data.getBooleanExtra(KEY_PICO_CREATE_MEDIA_PROJECTION, false);
        if (TextUtils.isEmpty(this.mLaunchActivity)) {
            return;
        }
        int i = this.mLargeIcon;
        if (i == -1 && this.mSmallIcon == -1) {
            return;
        }
        if (this.mSmallIcon == -1) {
            this.mSmallIcon = i;
        }
        if (i == -1) {
            this.mLargeIcon = this.mSmallIcon;
        }
        this.mPermissionReulstData = (Intent) data.getParcelableExtra(KEY_RESULT_DATA);
        createNotificationChannel();
    }

    @RequiresApi(api = 21)
    private void stop() {
        serviceStarted.compareAndSet(true, false);
        this.mHandler.post(new Runnable() { // from class: l.mbc0
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.m80875h(this.f133004a);
            }
        });
    }

    private void stopAudioCapture() {
        this.mHandler.post(new Runnable() { // from class: l.obc0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenAudioCaptureAndroidManager.INSTANCE().stopAudioCapture();
            }
        });
    }

    private void stopCapture(Intent intent) {
        this.mHandler.post(new Runnable() { // from class: l.lbc0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenCaptureAndroidManager.INSTANCE().stopCapture();
            }
        });
    }

    @RequiresApi(api = 21)
    private void stopMediaProjection() {
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.mMediaProjection = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        serviceStarted.compareAndSet(false, true);
        RXLogging.m5692w(TAG, String.format("[ScreenCapture] RXScreenCaptureService::onCreate success!", new Object[0]));
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    @Override // android.app.Service
    public void onDestroy() {
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        switch (getCommand(intent)) {
            case 0:
                startLaunch(intent);
                break;
            case 1:
                startCapture(intent);
                break;
            case 2:
                stopCapture(intent);
                break;
            case 3:
                changeCaptureFormat(intent);
                break;
            case 5:
                dispose(intent);
                break;
            case 6:
                startAudioCapture();
                break;
            case 7:
                stopAudioCapture();
                break;
            case 8:
                audioDispose();
                break;
            case 9:
                stop();
                break;
        }
        return 2;
    }
}
