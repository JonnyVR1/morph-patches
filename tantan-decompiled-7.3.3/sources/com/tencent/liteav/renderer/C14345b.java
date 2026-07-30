package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14172b;
import com.tencent.liteav.basic.p093c.C14173c;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.b */
/* JADX INFO: loaded from: classes2.dex */
class C14345b extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference<C14344a> f60588a;

    /* JADX INFO: renamed from: b */
    private boolean f60589b = false;

    /* JADX INFO: renamed from: c */
    private int f60590c = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: d */
    private int f60591d = 720;

    /* JADX INFO: renamed from: e */
    private Object f60592e = new Object();

    /* JADX INFO: renamed from: f */
    private C14173c f60593f = null;

    /* JADX INFO: renamed from: g */
    private C14172b f60594g = null;

    /* JADX INFO: renamed from: h */
    private Object f60595h = null;

    public C14345b(WeakReference<C14344a> weakReference) {
        this.f60588a = weakReference;
    }

    /* JADX INFO: renamed from: f */
    private void m85049f() {
        try {
            C14344a c14344a = this.f60588a.get();
            if (c14344a != null) {
                c14344a.m85040a(this);
            }
        } catch (Exception e) {
            TXCLog.m84150e("TXCVideoRenderThread", "init texture render failed.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m85050g() {
        try {
            C14344a c14344a = this.f60588a.get();
            if (c14344a != null) {
                c14344a.m85044b(this);
            }
        } catch (Exception e) {
            TXCLog.m84150e("TXCVideoRenderThread", "destroy texture render failed", e);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m85051h() {
        C14344a c14344a;
        try {
            WeakReference<C14344a> weakReference = this.f60588a;
            if (weakReference == null || (c14344a = weakReference.get()) == null) {
                return false;
            }
            return c14344a.m85046c();
        } catch (Exception e) {
            TXCLog.m84149e("TXCVideoRenderThread", "drawFrame failed." + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m85052i() {
        C14344a c14344a;
        WeakReference<C14344a> weakReference = this.f60588a;
        if (weakReference == null || (c14344a = weakReference.get()) == null) {
            return;
        }
        c14344a.m85116k();
    }

    /* JADX INFO: renamed from: j */
    private void m85053j() {
        C14344a c14344a;
        WeakReference<C14344a> weakReference = this.f60588a;
        if (weakReference == null || (c14344a = weakReference.get()) == null) {
            return;
        }
        c14344a.m85117l();
    }

    /* JADX INFO: renamed from: k */
    private void m85054k() {
        C14344a c14344a = this.f60588a.get();
        if (c14344a == null) {
            return;
        }
        SurfaceTexture surfaceTextureM85047d = c14344a.m85047d();
        Surface surface = surfaceTextureM85047d != null ? new Surface(surfaceTextureM85047d) : null;
        Object obj = this.f60595h;
        if (obj == null || (obj instanceof EGLContext)) {
            this.f60594g = C14172b.m83898a(null, (EGLContext) obj, surface, this.f60590c, this.f60591d);
        } else {
            this.f60593f = C14173c.m83908a(null, (android.opengl.EGLContext) obj, surface, this.f60590c, this.f60591d);
        }
        TXCLog.m84156w("TXCVideoRenderThread", "vrender: init egl share context " + this.f60595h + ", create context" + m85056a());
        m85061e();
    }

    /* JADX INFO: renamed from: l */
    private void m85055l() {
        TXCLog.m84156w("TXCVideoRenderThread", "vrender: uninit egl " + m85056a());
        C14172b c14172b = this.f60594g;
        if (c14172b != null) {
            c14172b.m83904c();
            this.f60594g = null;
        }
        C14173c c14173c = this.f60593f;
        if (c14173c != null) {
            c14173c.m83914c();
            this.f60593f = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m85056a() {
        C14172b c14172b = this.f60594g;
        if (c14172b != null) {
            return c14172b.m83905d();
        }
        C14173c c14173c = this.f60593f;
        if (c14173c != null) {
            return c14173c.m83916e();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m85058b() {
        this.f60589b = false;
        m85059c();
    }

    /* JADX INFO: renamed from: c */
    public void m85059c() {
        synchronized (this.f60592e) {
            this.f60592e.notifyAll();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85060d() {
        C14172b c14172b = this.f60594g;
        if (c14172b != null) {
            c14172b.m83902a();
        }
        C14173c c14173c = this.f60593f;
        if (c14173c != null) {
            c14173c.m83915d();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m85061e() {
        C14172b c14172b = this.f60594g;
        if (c14172b != null) {
            c14172b.m83903b();
        }
        C14173c c14173c = this.f60593f;
        if (c14173c != null) {
            c14173c.m83913b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("VRender-" + getId());
        try {
            this.f60589b = true;
            m85054k();
            m85049f();
            m85052i();
            while (this.f60589b) {
                if (m85051h()) {
                    WeakReference<C14344a> weakReference = this.f60588a;
                    C14344a c14344a = weakReference == null ? null : weakReference.get();
                    if (c14344a != null && c14344a.m85047d() != null) {
                        m85060d();
                    }
                }
                synchronized (this.f60592e) {
                    try {
                        this.f60592e.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            m85053j();
            m85050g();
            m85055l();
        } catch (Exception e) {
            TXCLog.m84150e("TXCVideoRenderThread", "render failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85057a(Object obj) {
        this.f60595h = obj;
    }
}
