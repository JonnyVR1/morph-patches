package com.tencent.liteav.beauty.p093b;

import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.x */
/* JADX INFO: loaded from: classes2.dex */
public class C14096x {

    /* JADX INFO: renamed from: b */
    private static final String f58795b = "x";

    /* JADX INFO: renamed from: a */
    SurfaceTexture.OnFrameAvailableListener f58796a;

    /* JADX INFO: renamed from: c */
    private SurfaceTexture f58797c;

    /* JADX INFO: renamed from: f */
    private MediaExtractor f58800f;

    /* JADX INFO: renamed from: g */
    private AssetFileDescriptor f58801g;

    /* JADX INFO: renamed from: l */
    private long f58806l;

    /* JADX INFO: renamed from: m */
    private MediaCodec f58807m;

    /* JADX INFO: renamed from: o */
    private boolean f58809o;

    /* JADX INFO: renamed from: p */
    private Handler f58810p;

    /* JADX INFO: renamed from: d */
    private int f58798d = -1;

    /* JADX INFO: renamed from: e */
    private boolean f58799e = false;

    /* JADX INFO: renamed from: h */
    private int f58802h = -1;

    /* JADX INFO: renamed from: i */
    private int f58803i = -1;

    /* JADX INFO: renamed from: j */
    private int f58804j = -1;

    /* JADX INFO: renamed from: k */
    private int f58805k = -1;

    /* JADX INFO: renamed from: n */
    private boolean f58808n = false;

    /* JADX INFO: renamed from: q */
    private Object f58811q = new Object();

    /* JADX INFO: renamed from: b */
    private void m83161b() {
        if (this.f58799e) {
            this.f58799e = false;
            MediaExtractor mediaExtractor = this.f58800f;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.f58800f = null;
            }
            try {
                try {
                    this.f58807m.stop();
                    try {
                        try {
                            this.f58807m.release();
                        } catch (Exception e) {
                            TXCLog.m82966e(f58795b, "release decoder exception: " + e.toString());
                        }
                    } finally {
                        this.f58807m = null;
                    }
                } catch (Exception e2) {
                    TXCLog.m82966e(f58795b, "stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.f58807m.release();
                        } catch (Exception e3) {
                            TXCLog.m82966e(f58795b, "release decoder exception: " + e3.toString());
                        }
                    } finally {
                        this.f58807m = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        this.f58807m.release();
                    } finally {
                        this.f58807m = null;
                    }
                } catch (Exception e4) {
                    TXCLog.m82966e(f58795b, "release decoder exception: " + e4.toString());
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83163c() {
        m83161b();
        this.f58796a = null;
        this.f58806l = 0L;
        this.f58809o = false;
        SurfaceTexture surfaceTexture = this.f58797c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f58797c = null;
        }
        synchronized (this.f58811q) {
            try {
                Handler handler = this.f58810p;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f58810p.getLooper().quit();
                    this.f58810p = null;
                    this.f58811q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AssetFileDescriptor assetFileDescriptor = this.f58801g;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.f58801g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83164a() {
        synchronized (this.f58811q) {
            try {
                if (this.f58810p != null) {
                    if (Looper.myLooper() == this.f58810p.getLooper()) {
                        m83163c();
                    } else {
                        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.beauty.b.x.1
                            @Override // java.lang.Runnable
                            public void run() {
                                synchronized (C14096x.this.f58811q) {
                                    C14096x.this.m83163c();
                                    C14096x.this.f58811q.notify();
                                }
                            }
                        };
                        this.f58810p.removeCallbacksAndMessages(null);
                        this.f58810p.post(runnable);
                        this.f58810p.getLooper().quitSafely();
                        while (true) {
                            try {
                                this.f58811q.wait();
                                break;
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
