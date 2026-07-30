package com.p069ss.bytertc.base.media.screen;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.lang.ref.WeakReference;
import p149l.e16;
import p149l.s4e0;
import p149l.t4e0;
import p149l.upk0;

/* JADX INFO: loaded from: classes12.dex */
public class ScreenAudioCaptureAndroidManager extends MediaProjection.Callback {
    private static final int NUM_SAMPLES_PER_READ = 1024;
    private static final int SAMPLE_RATE = 48000;
    private int mAudioMode;
    private AudioRecord mAudioRecord;
    private ScreenAudioCaptureObserver mCaptureObserver;
    private WeakReference<Context> mContextRef;
    private boolean mIsDisposed;
    private volatile boolean mIsRecording;
    private MediaProjection mMediaProjection;
    private Thread mRecordingThread;
    private Handler sHandler;
    private HandlerThread sHandlerThread;

    public static final class HOLDER {
        private static final ScreenAudioCaptureAndroidManager INSTANCE = new ScreenAudioCaptureAndroidManager();

        private HOLDER() {
        }
    }

    private ScreenAudioCaptureAndroidManager() {
        HandlerThread handlerThread = new HandlerThread("sdk-audio-share");
        this.sHandlerThread = handlerThread;
        handlerThread.start();
        this.sHandler = new Handler(this.sHandlerThread.getLooper());
        this.mIsRecording = false;
        this.mCaptureObserver = null;
        this.mAudioRecord = null;
        this.mRecordingThread = null;
        this.mIsDisposed = false;
    }

    public static ScreenAudioCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    private void checkNotDisposed() {
        if (this.mIsDisposed) {
            upk0.m194883a("screen audio capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRun() {
        AudioRecord audioRecord;
        short[] sArr = new short[1024];
        while (this.mIsRecording && (audioRecord = this.mAudioRecord) != null) {
            if (audioRecord.read(sArr, 0, 1024) >= 0) {
                byte[] bArrShort2byte = short2byte(sArr);
                ScreenAudioCaptureObserver screenAudioCaptureObserver = this.mCaptureObserver;
                if (screenAudioCaptureObserver == null) {
                    return;
                } else {
                    screenAudioCaptureObserver.onAudioFrameCapture(bArrShort2byte, 1024, 48000, 1);
                }
            }
        }
    }

    private static boolean hasPermissions(Context context, String... strArr) {
        for (String str : strArr) {
            if (!selfPermissionGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean selfPermissionGranted(Context context, String str) {
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            return context.checkSelfPermission(str) == 0;
        }
        return e16.m114373a(context, str) == 0;
    }

    private void setMusicMode(boolean z) {
        AudioManager audioManager = (AudioManager) this.mContextRef.get().getSystemService("audio");
        try {
            if (!z) {
                audioManager.setMode(this.mAudioMode);
            } else {
                this.mAudioMode = audioManager.getMode();
                audioManager.setMode(0);
            }
        } catch (Exception e) {
            Log.e("ScreenAudioCapture", z + ", " + e.getMessage());
        }
    }

    private byte[] short2byte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2] = (byte) (s & 255);
            bArr[i2 + 1] = (byte) (s >> 8);
            sArr[i] = 0;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAudioCapture_(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT > 28 && !this.mIsRecording) {
            this.mMediaProjection = mediaProjection;
            if (mediaProjection == null) {
                return;
            }
            t4e0.m187178a();
            try {
                AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(16).build()).setBufferSizeInBytes(2048).setAudioPlaybackCaptureConfig(s4e0.m182218a(this.mMediaProjection).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build()).build();
                this.mAudioRecord = audioRecordBuild;
                if (audioRecordBuild.getState() == 0) {
                    Log.e("ScreenAudioCapture", "audioRecord init fail, permission: " + hasPermissions(this.mContextRef.get(), "android.permission.RECORD_AUDIO"));
                    this.mAudioRecord = null;
                    return;
                }
                this.mMediaProjection.registerCallback(this, this.sHandler);
                this.mCaptureObserver.onCapturerStarted();
                setMusicMode(true);
                this.mIsRecording = true;
                this.mAudioRecord.startRecording();
                Thread thread = new Thread(new Runnable() { // from class: l.u4e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f174592a.doRun();
                    }
                });
                this.mRecordingThread = thread;
                thread.start();
                setMusicMode(false);
            } catch (UnsupportedOperationException e) {
                Log.e("ScreenAudioCapture", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAudioCapture_() {
        if (Build.VERSION.SDK_INT > 28 && this.mIsRecording) {
            this.mIsRecording = false;
            AudioRecord audioRecord = this.mAudioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
                this.mAudioRecord.release();
                this.mAudioRecord = null;
            }
            this.mCaptureObserver.onCapturerStopped();
            this.mMediaProjection = null;
        }
    }

    public void dispose() {
        this.mIsDisposed = true;
    }

    public void initialize(Context context, ScreenAudioCaptureObserver screenAudioCaptureObserver) {
        if (screenAudioCaptureObserver == null) {
            upk0.m194883a("audio capture observer not set.");
            return;
        }
        this.mCaptureObserver = screenAudioCaptureObserver;
        this.mContextRef = new WeakReference<>(context);
        this.mIsDisposed = false;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        super.onStop();
        stopAudioCapture_();
    }

    public void startAudioCapture(final MediaProjection mediaProjection) {
        checkNotDisposed();
        this.sHandler.post(new Runnable() { // from class: l.w4e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184551a.startAudioCapture_(mediaProjection);
            }
        });
    }

    public void stopAudioCapture() {
        checkNotDisposed();
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this);
        }
        this.sHandler.removeCallbacksAndMessages(null);
        this.sHandler.post(new Runnable() { // from class: l.v4e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179910a.stopAudioCapture_();
            }
        });
    }
}
