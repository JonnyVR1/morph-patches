package com.tencent.liteav.basic.p093c;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC14214e;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.g */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC14177g extends HandlerC14214e {

    /* JADX INFO: renamed from: a */
    public int f59004a;

    /* JADX INFO: renamed from: b */
    public int f59005b;

    /* JADX INFO: renamed from: c */
    public Surface f59006c;

    /* JADX INFO: renamed from: d */
    public boolean f59007d;

    /* JADX INFO: renamed from: e */
    public C14173c f59008e;

    /* JADX INFO: renamed from: f */
    public EGLContext f59009f;

    /* JADX INFO: renamed from: g */
    public C14172b f59010g;

    /* JADX INFO: renamed from: h */
    public javax.microedition.khronos.egl.EGLContext f59011h;

    /* JADX INFO: renamed from: i */
    private a f59012i;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.g$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo83934c();

        /* JADX INFO: renamed from: d */
        void mo83935d();

        /* JADX INFO: renamed from: e */
        void mo83936e();
    }

    public HandlerC14177g(Looper looper) {
        super(looper);
        this.f59004a = 720;
        this.f59005b = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.f59006c = null;
        this.f59012i = null;
        this.f59007d = false;
        this.f59008e = null;
        this.f59009f = null;
        this.f59010g = null;
        this.f59011h = null;
    }

    /* JADX INFO: renamed from: a */
    private void m83955a(Message message) {
        try {
            m83958e();
        } catch (Exception unused) {
            TXCLog.m84149e("TXGLThreadHandler", "surface-render: init egl context exception " + this.f59006c);
            this.f59006c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m83956b(Message message) {
        m83959f();
    }

    /* JADX INFO: renamed from: c */
    private void m83957c(Message message) {
        try {
            a aVar = this.f59012i;
            if (aVar != null) {
                aVar.mo83935d();
            }
        } catch (Exception e) {
            TXCLog.m84149e("TXGLThreadHandler", "onMsgRend Exception " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m83958e() {
        TXCLog.m84152i("TXGLThreadHandler", String.format("init egl size[%d/%d]", Integer.valueOf(this.f59004a), Integer.valueOf(this.f59005b)));
        if (this.f59007d) {
            this.f59008e = C14173c.m83908a(null, this.f59009f, this.f59006c, this.f59004a, this.f59005b);
        } else {
            this.f59010g = C14172b.m83898a(null, this.f59011h, this.f59006c, this.f59004a, this.f59005b);
        }
        if (this.f59010g == null && this.f59008e == null) {
            return false;
        }
        TXCLog.m84156w("TXGLThreadHandler", "surface-render: create egl context " + this.f59006c);
        a aVar = this.f59012i;
        if (aVar == null) {
            return true;
        }
        aVar.mo83934c();
        return true;
    }

    /* JADX INFO: renamed from: f */
    private void m83959f() {
        TXCLog.m84156w("TXGLThreadHandler", "surface-render: destroy egl context " + this.f59006c);
        a aVar = this.f59012i;
        if (aVar != null) {
            aVar.mo83936e();
        }
        C14172b c14172b = this.f59010g;
        if (c14172b != null) {
            c14172b.m83904c();
            this.f59010g = null;
        }
        C14173c c14173c = this.f59008e;
        if (c14173c != null) {
            c14173c.m83914c();
            this.f59008e = null;
        }
        this.f59006c = null;
    }

    /* JADX INFO: renamed from: d */
    public void m83964d() {
        C14172b c14172b = this.f59010g;
        if (c14172b != null) {
            c14172b.m83903b();
        }
        C14173c c14173c = this.f59008e;
        if (c14173c != null) {
            c14173c.m83913b();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 100:
                m83955a(message);
                break;
            case 101:
                m83956b(message);
                break;
            case 102:
                m83957c(message);
                break;
        }
        Object obj = message.obj;
        if (obj != null) {
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: renamed from: b */
    public Surface m83962b() {
        return this.f59006c;
    }

    /* JADX INFO: renamed from: a */
    public void m83961a(a aVar) {
        this.f59012i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public javax.microedition.khronos.egl.EGLContext m83960a() {
        C14172b c14172b = this.f59010g;
        if (c14172b != null) {
            return c14172b.m83905d();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m83954a(final Handler handler, final HandlerThread handlerThread) {
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
    public void m83963c() {
        C14172b c14172b = this.f59010g;
        if (c14172b != null) {
            c14172b.m83902a();
        }
        C14173c c14173c = this.f59008e;
        if (c14173c != null) {
            c14173c.m83915d();
        }
    }
}
