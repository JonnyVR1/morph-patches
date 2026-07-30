package com.tencent.liteav.basic.p088c;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC14051e;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.g */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC14014g extends HandlerC14051e {

    /* JADX INFO: renamed from: a */
    public int f58156a;

    /* JADX INFO: renamed from: b */
    public int f58157b;

    /* JADX INFO: renamed from: c */
    public Surface f58158c;

    /* JADX INFO: renamed from: d */
    public boolean f58159d;

    /* JADX INFO: renamed from: e */
    public C14010c f58160e;

    /* JADX INFO: renamed from: f */
    public EGLContext f58161f;

    /* JADX INFO: renamed from: g */
    public C14009b f58162g;

    /* JADX INFO: renamed from: h */
    public javax.microedition.khronos.egl.EGLContext f58163h;

    /* JADX INFO: renamed from: i */
    private a f58164i;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.g$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo82751c();

        /* JADX INFO: renamed from: d */
        void mo82752d();

        /* JADX INFO: renamed from: e */
        void mo82753e();
    }

    public HandlerC14014g(Looper looper) {
        super(looper);
        this.f58156a = 720;
        this.f58157b = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.f58158c = null;
        this.f58164i = null;
        this.f58159d = false;
        this.f58160e = null;
        this.f58161f = null;
        this.f58162g = null;
        this.f58163h = null;
    }

    /* JADX INFO: renamed from: a */
    private void m82772a(Message message) {
        try {
            m82775e();
        } catch (Exception unused) {
            TXCLog.m82966e("TXGLThreadHandler", "surface-render: init egl context exception " + this.f58158c);
            this.f58158c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m82773b(Message message) {
        m82776f();
    }

    /* JADX INFO: renamed from: c */
    private void m82774c(Message message) {
        try {
            a aVar = this.f58164i;
            if (aVar != null) {
                aVar.mo82752d();
            }
        } catch (Exception e) {
            TXCLog.m82966e("TXGLThreadHandler", "onMsgRend Exception " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m82775e() {
        TXCLog.m82969i("TXGLThreadHandler", String.format("init egl size[%d/%d]", Integer.valueOf(this.f58156a), Integer.valueOf(this.f58157b)));
        if (this.f58159d) {
            this.f58160e = C14010c.m82725a(null, this.f58161f, this.f58158c, this.f58156a, this.f58157b);
        } else {
            this.f58162g = C14009b.m82715a(null, this.f58163h, this.f58158c, this.f58156a, this.f58157b);
        }
        if (this.f58162g == null && this.f58160e == null) {
            return false;
        }
        TXCLog.m82973w("TXGLThreadHandler", "surface-render: create egl context " + this.f58158c);
        a aVar = this.f58164i;
        if (aVar == null) {
            return true;
        }
        aVar.mo82751c();
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m82776f() {
        TXCLog.m82973w("TXGLThreadHandler", "surface-render: destroy egl context " + this.f58158c);
        a aVar = this.f58164i;
        if (aVar != null) {
            aVar.mo82753e();
        }
        C14009b c14009b = this.f58162g;
        if (c14009b != null) {
            c14009b.m82721c();
            this.f58162g = null;
        }
        C14010c c14010c = this.f58160e;
        if (c14010c != null) {
            c14010c.m82731c();
            this.f58160e = null;
        }
        this.f58158c = null;
    }

    /* JADX INFO: renamed from: d */
    public void m82781d() {
        C14009b c14009b = this.f58162g;
        if (c14009b != null) {
            c14009b.m82720b();
        }
        C14010c c14010c = this.f58160e;
        if (c14010c != null) {
            c14010c.m82730b();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 100:
                m82772a(message);
                break;
            case 101:
                m82773b(message);
                break;
            case 102:
                m82774c(message);
                break;
        }
        Object obj = message.obj;
        if (obj != null) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: b */
    public Surface m82779b() {
        return this.f58158c;
    }

    /* JADX INFO: renamed from: a */
    public void m82778a(a aVar) {
        this.f58164i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public javax.microedition.khronos.egl.EGLContext m82777a() {
        C14009b c14009b = this.f58162g;
        if (c14009b != null) {
            return c14009b.m82722d();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m82771a(final Handler handler, final HandlerThread handlerThread) {
        if (handler == null || handlerThread == null) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        message.obj = new Runnable() { // from class: com.tencent.liteav.basic.c.g.1
            @Override // java.lang.Runnable
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.basic.c.g.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        HandlerThread handlerThread2 = handlerThread;
                        if (handlerThread2 != null) {
                            handlerThread2.quitSafely();
                        }
                    }
                });
            }
        };
        handler.sendMessage(message);
    }

    /* JADX INFO: renamed from: c */
    public void m82780c() {
        C14009b c14009b = this.f58162g;
        if (c14009b != null) {
            c14009b.m82719a();
        }
        C14010c c14010c = this.f58160e;
        if (c14010c != null) {
            c14010c.m82732d();
        }
    }
}
