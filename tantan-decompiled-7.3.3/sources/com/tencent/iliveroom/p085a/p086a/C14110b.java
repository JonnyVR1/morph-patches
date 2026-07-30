package com.tencent.iliveroom.p085a.p086a;

import android.os.HandlerThread;
import android.os.Looper;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.HandlerC14177g;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14110b {

    /* JADX INFO: renamed from: a */
    private final Object f58617a = new Object();

    /* JADX INFO: renamed from: b */
    private HandlerC14177g f58618b = null;

    /* JADX INFO: renamed from: c */
    private HandlerThread f58619c = null;

    /* JADX INFO: renamed from: a */
    public void m83767a(Object obj) {
        synchronized (this.f58617a) {
            try {
                HandlerC14177g handlerC14177g = this.f58618b;
                if (handlerC14177g != null && obj != null) {
                    if (obj instanceof EGLContext) {
                        handlerC14177g.f59007d = false;
                        handlerC14177g.f59011h = (EGLContext) obj;
                        handlerC14177g.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14177g.f59005b = 720;
                        handlerC14177g.sendEmptyMessage(100);
                        TXCLog.m84152i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Attach EGL10Context " + obj);
                    } else if (obj instanceof android.opengl.EGLContext) {
                        handlerC14177g.f59007d = true;
                        handlerC14177g.f59009f = (android.opengl.EGLContext) obj;
                        handlerC14177g.f59004a = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                        handlerC14177g.f59005b = 720;
                        handlerC14177g.sendEmptyMessage(100);
                        TXCLog.m84152i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Attach EGL14Context " + obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83769b(final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        m83768a(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.1
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
    public void m83771c() {
        synchronized (this.f58617a) {
            try {
                HandlerC14177g handlerC14177g = this.f58618b;
                if (handlerC14177g != null) {
                    HandlerC14177g.m83954a(handlerC14177g, this.f58619c);
                    TXCLog.m84152i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> Destroy GL Thread");
                }
                this.f58618b = null;
                this.f58619c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m83770b() {
        boolean z;
        synchronized (this.f58617a) {
            z = this.f58618b != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public void m83766a() {
        synchronized (this.f58617a) {
            try {
                if (this.f58618b == null) {
                    HandlerThread handlerThread = new HandlerThread("liveRoomGLThread");
                    this.f58619c = handlerThread;
                    handlerThread.start();
                    this.f58618b = new HandlerC14177g(this.f58619c.getLooper());
                    TXCLog.m84152i("TRTCAdapter-TRTCGLThreadHelper", "GLThread -> GLThread start.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83768a(Runnable runnable) {
        HandlerC14177g handlerC14177g = this.f58618b;
        if (handlerC14177g != null) {
            if (handlerC14177g.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handlerC14177g.post(runnable);
            }
        }
    }
}
