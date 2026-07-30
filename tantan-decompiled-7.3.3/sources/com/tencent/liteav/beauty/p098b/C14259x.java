package com.tencent.liteav.beauty.p098b;

import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.x */
/* JADX INFO: loaded from: classes2.dex */
public class C14259x {

    /* JADX INFO: renamed from: b */
    private static final String f59643b = "x";

    /* JADX INFO: renamed from: a */
    SurfaceTexture.OnFrameAvailableListener f59644a;

    /* JADX INFO: renamed from: c */
    private SurfaceTexture f59645c;

    /* JADX INFO: renamed from: f */
    private MediaExtractor f59648f;

    /* JADX INFO: renamed from: g */
    private AssetFileDescriptor f59649g;

    /* JADX INFO: renamed from: l */
    private long f59654l;

    /* JADX INFO: renamed from: m */
    private MediaCodec f59655m;

    /* JADX INFO: renamed from: o */
    private boolean f59657o;

    /* JADX INFO: renamed from: p */
    private Handler f59658p;

    /* JADX INFO: renamed from: d */
    private int f59646d = -1;

    /* JADX INFO: renamed from: e */
    private boolean f59647e = false;

    /* JADX INFO: renamed from: h */
    private int f59650h = -1;

    /* JADX INFO: renamed from: i */
    private int f59651i = -1;

    /* JADX INFO: renamed from: j */
    private int f59652j = -1;

    /* JADX INFO: renamed from: k */
    private int f59653k = -1;

    /* JADX INFO: renamed from: n */
    private boolean f59656n = false;

    /* JADX INFO: renamed from: q */
    private Object f59659q = new Object();

    /* JADX INFO: renamed from: b */
    private void m84344b() {
        if (this.f59647e) {
            this.f59647e = false;
            MediaExtractor mediaExtractor = this.f59648f;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.f59648f = null;
            }
            try {
                try {
                    this.f59655m.stop();
                    try {
                        try {
                            this.f59655m.release();
                        } catch (Exception e) {
                            TXCLog.m84149e(f59643b, "release decoder exception: " + e.toString());
                        }
                    } finally {
                        this.f59655m = null;
                    }
                } catch (Exception e2) {
                    TXCLog.m84149e(f59643b, "stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.f59655m.release();
                        } catch (Exception e3) {
                            TXCLog.m84149e(f59643b, "release decoder exception: " + e3.toString());
                        }
                    } finally {
                        this.f59655m = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        this.f59655m.release();
                    } finally {
                        this.f59655m = null;
                    }
                } catch (Exception e4) {
                    TXCLog.m84149e(f59643b, "release decoder exception: " + e4.toString());
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m84346c() {
        m84344b();
        this.f59644a = null;
        this.f59654l = 0L;
        this.f59657o = false;
        SurfaceTexture surfaceTexture = this.f59645c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f59645c = null;
        }
        synchronized (this.f59659q) {
            try {
                Handler handler = this.f59658p;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f59658p.getLooper().quit();
                    this.f59658p = null;
                    this.f59659q.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AssetFileDescriptor assetFileDescriptor = this.f59649g;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.f59649g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84347a() {
        synchronized (this.f59659q) {
            try {
                if (this.f59658p != null) {
                    if (Looper.myLooper() == this.f59658p.getLooper()) {
                        m84346c();
                    } else {
                        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.beauty.b.x.1
                            @Override // java.lang.Runnable
                            public void run() {
                                synchronized (C14259x.this.f59659q) {
                                    C14259x.this.m84346c();
                                    C14259x.this.f59659q.notify();
                                }
                            }
                        };
                        this.f59658p.removeCallbacksAndMessages(null);
                        this.f59658p.post(runnable);
                        this.f59658p.getLooper().quitSafely();
                        while (true) {
                            try {
                                this.f59659q.wait();
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
