package com.p074ss.bytertc.audio.device.router;

import com.bytedance.realx.base.RXLogging;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes11.dex */
public class AudioRouteController implements IAudioRouteCallback {
    public static int EVENT_ONLY_LOG = 0;
    public static int EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE = 1;
    private static final String TAG = "AudioRouteController";

    @AudioRouteDeviceManager.RoutingDeviceType
    private int currentRouting = -1;
    private boolean isMediaMode = true;
    private ReadWriteLock lock;
    private AudioRouteDeviceManager mAudioRouteDeviceManager;
    private long nativeAudioRouteControllerPtr;
    private Lock rLock;
    private Lock wLock;

    private AudioRouteController(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = this.lock.writeLock();
        this.nativeAudioRouteControllerPtr = j;
        this.mAudioRouteDeviceManager = new AudioRouteDeviceManager(this);
    }

    private String getCaptureDeviceName() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getCaptureDeviceName();
        } finally {
            this.rLock.unlock();
        }
    }

    private String getRenderDeviceName() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getRenderDeviceName();
        } finally {
            this.rLock.unlock();
        }
    }

    private String getSessionInfo() {
        this.rLock.lock();
        try {
            return this.nativeAudioRouteControllerPtr == 0 ? "nativePtr is 0" : this.mAudioRouteDeviceManager.getSessionInfo();
        } finally {
            this.rLock.unlock();
        }
    }

    private int init() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0 && initAudioRouteDeviceManager() == 0) {
                return this.mAudioRouteDeviceManager.getDeviceState();
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    private int initAudioRouteDeviceManager() {
        int iInit = this.mAudioRouteDeviceManager.init();
        if (iInit != 0) {
            release();
            RXLogging.m5742e(TAG, "init failed. code: " + iInit);
        }
        return iInit;
    }

    private native void onDeviceEvent(long j, int i, boolean z, String str);

    private native void onError(long j, int i);

    private int release() {
        int iRelease;
        this.wLock.lock();
        RXLogging.m5746w(TAG, "AudioRouteController: release begin");
        try {
            this.nativeAudioRouteControllerPtr = 0L;
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                iRelease = audioRouteDeviceManager.release();
                this.mAudioRouteDeviceManager = null;
            } else {
                iRelease = 0;
            }
            this.currentRouting = -1;
            this.isMediaMode = true;
            return iRelease;
        } finally {
            RXLogging.m5746w(TAG, "AudioRouteController: release end");
            this.wLock.unlock();
        }
    }

    private void restartBluetoothSco() {
        AudioRouteDeviceManager audioRouteDeviceManager;
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0 && (audioRouteDeviceManager = this.mAudioRouteDeviceManager) != null) {
                audioRouteDeviceManager.restartBluetoothSco();
            }
        } finally {
            this.rLock.unlock();
        }
    }

    private int setAudioRoute(@AudioRouteDeviceManager.RoutingDeviceType int i, boolean z) {
        this.rLock.lock();
        StringBuilder sb = new StringBuilder("AudioRouteController: setAudioRoute, begin, routing: ");
        sb.append(i);
        sb.append(", isMediaMode: ");
        sb.append(z);
        RXLogging.m5746w(TAG, sb.toString());
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return -5;
            }
            this.isMediaMode = z;
            int audioRoute = this.mAudioRouteDeviceManager.setAudioRoute(i, z);
            this.currentRouting = audioRoute == 0 ? i : this.currentRouting;
            return audioRoute;
        } finally {
            RXLogging.m5746w(TAG, "AudioRouteController: setAudioRoute, end, routing: " + i + ", isMediaMode: " + z);
            this.rLock.unlock();
        }
    }

    private int setUseAudioDeviceCallback(boolean z) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0) {
                AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
                if (audioRouteDeviceManager == null) {
                    return 0;
                }
                audioRouteDeviceManager.release();
                this.mAudioRouteDeviceManager.setUseAudioDeviceCallback(z, this);
                if (initAudioRouteDeviceManager() == 0) {
                    return this.mAudioRouteDeviceManager.getDeviceState();
                }
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onDeviceEvent(int i, boolean z, String str) throws Throwable {
        AudioRouteController audioRouteController;
        Lock lock;
        this.rLock.lock();
        RXLogging.m5746w(TAG, "onDeviceEvent, begin, deviceType: " + i + ", connected: " + z + ", deviceInfo:" + str);
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                RXLogging.m5746w(TAG, "AudioRouteController: onDeviceEvent, end");
                lock = this.rLock;
            } else {
                RXLogging.m5742e(TAG, "AudioRouteController: onDeviceEvent(Java) deviceType:" + i + ", connected:" + z + ", deviceInfo:" + str);
                audioRouteController = this;
                try {
                    audioRouteController.onDeviceEvent(this.nativeAudioRouteControllerPtr, i, z, str);
                    RXLogging.m5746w(TAG, "AudioRouteController: onDeviceEvent, end");
                    lock = audioRouteController.rLock;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    RXLogging.m5746w(TAG, "AudioRouteController: onDeviceEvent, end");
                    audioRouteController.rLock.unlock();
                    throw th2;
                }
            }
            lock.unlock();
        } catch (Throwable th3) {
            th = th3;
            audioRouteController = this;
        }
    }

    @Override // com.p074ss.bytertc.audio.device.router.IAudioRouteCallback
    public void onError(int i, String str) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0) {
                RXLogging.m5742e(TAG, "AudioRouteController: ERROR-" + i + ":" + str);
                if (i == EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE) {
                    onError(this.nativeAudioRouteControllerPtr, i);
                }
            }
        } finally {
            this.rLock.unlock();
        }
    }
}
