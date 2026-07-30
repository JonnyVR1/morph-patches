package com.tencent.iliveroom.p080a.p081a;

import android.os.HandlerThread;
import android.os.Looper;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.HandlerC14014g;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13947b {

    /* JADX INFO: renamed from: a */
    private final Object f57769a = new Object();

    /* JADX INFO: renamed from: b */
    private HandlerC14014g f57770b = null;

    /* JADX INFO: renamed from: c */
    private HandlerThread f57771c = null;

    /* JADX INFO: renamed from: a */
    public void m82584a(Object obj) {
        synchronized (this.f57769a) {
            try {
                HandlerC14014g handlerC14014g = this.f57770b;
                if (handlerC14014g != null && obj != null) {
                    if (obj instanceof EGLContext) {
                        handlerC14014g.f58159d = false;
                        handlerC14014g.f58163h = (EGLContext) obj;
                        handlerC14014g.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14014g.f58157b = 720;
                        handlerC14014g.sendEmptyMessage(100);
                        TXCLog.m82969i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Attach EGL10Context " + obj);
                    } else if (obj instanceof android.opengl.EGLContext) {
                        handlerC14014g.f58159d = true;
                        handlerC14014g.f58161f = (android.opengl.EGLContext) obj;
                        handlerC14014g.f58156a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14014g.f58157b = 720;
                        handlerC14014g.sendEmptyMessage(100);
                        TXCLog.m82969i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Attach EGL14Context " + obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82586b(final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        m82585a(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m82588c() {
        synchronized (this.f57769a) {
            try {
                HandlerC14014g handlerC14014g = this.f57770b;
                if (handlerC14014g != null) {
                    HandlerC14014g.m82771a(handlerC14014g, this.f57771c);
                    TXCLog.m82969i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Destroy GL Thread");
                }
                this.f57770b = null;
                this.f57771c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m82587b() {
        boolean z;
        synchronized (this.f57769a) {
            z = this.f57770b != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public void m82583a() {
        synchronized (this.f57769a) {
            try {
                if (this.f57770b == null) {
                    HandlerThread handlerThread = new HandlerThread("liveRoomGLThread");
                    this.f57771c = handlerThread;
                    handlerThread.start();
                    this.f57770b = new HandlerC14014g(this.f57771c.getLooper());
                    TXCLog.m82969i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> GLThread start.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82585a(Runnable runnable) {
        HandlerC14014g handlerC14014g = this.f57770b;
        if (handlerC14014g != null) {
            if (handlerC14014g.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handlerC14014g.post(runnable);
            }
        }
    }
}
