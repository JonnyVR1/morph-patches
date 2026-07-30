package com.core.glcore.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import p149l.mnl;

/* JADX INFO: loaded from: classes.dex */
public class CameraDataCallThread extends HandlerThread {
    private static final int WHAT_DELAY = 1000;
    private mnl.InterfaceC18511b cameraDataCallback;
    private int duration;
    private Handler handler;
    private final Object object;

    public class CameraDataCallBack implements Handler.Callback {
        private CameraDataCallBack() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (CameraDataCallThread.this.object) {
                CameraDataCallThread.access$200(CameraDataCallThread.this);
            }
            return true;
        }
    }

    public CameraDataCallThread(String str, int i, mnl.InterfaceC18511b interfaceC18511b) {
        super(str);
        this.object = new Object();
        this.duration = 1000 / i;
    }

    public static /* synthetic */ mnl.InterfaceC18511b access$200(CameraDataCallThread cameraDataCallThread) {
        cameraDataCallThread.getClass();
        return null;
    }

    public void destroyThread() {
        synchronized (this.object) {
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(1000);
        }
        quitSafely();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        synchronized (this.object) {
        }
    }
}
