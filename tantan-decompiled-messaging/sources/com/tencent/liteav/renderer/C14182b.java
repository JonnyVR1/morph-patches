package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14009b;
import com.tencent.liteav.basic.p088c.C14010c;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.b */
/* JADX INFO: loaded from: classes2.dex */
class C14182b extends Thread {

    /* JADX INFO: renamed from: a */
    private WeakReference<C14181a> f59740a;

    /* JADX INFO: renamed from: b */
    private boolean f59741b = false;

    /* JADX INFO: renamed from: c */
    private int f59742c = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;

    /* JADX INFO: renamed from: d */
    private int f59743d = 720;

    /* JADX INFO: renamed from: e */
    private Object f59744e = new Object();

    /* JADX INFO: renamed from: f */
    private C14010c f59745f = null;

    /* JADX INFO: renamed from: g */
    private C14009b f59746g = null;

    /* JADX INFO: renamed from: h */
    private Object f59747h = null;

    public C14182b(WeakReference<C14181a> weakReference) {
        this.f59740a = weakReference;
    }

    /* JADX INFO: renamed from: f */
    private void m83866f() {
        try {
            C14181a c14181a = this.f59740a.get();
            if (c14181a != null) {
                c14181a.m83857a(this);
            }
        } catch (Exception e) {
            TXCLog.m82967e("TXCVideoRenderThread", "init texture render failed.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m83867g() {
        try {
            C14181a c14181a = this.f59740a.get();
            if (c14181a != null) {
                c14181a.m83861b(this);
            }
        } catch (Exception e) {
            TXCLog.m82967e("TXCVideoRenderThread", "destroy texture render failed", e);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m83868h() {
        C14181a c14181a;
        try {
            WeakReference<C14181a> weakReference = this.f59740a;
            if (weakReference == null || (c14181a = weakReference.get()) == null) {
                return false;
            }
            return c14181a.m83863c();
        } catch (Exception e) {
            TXCLog.m82966e("TXCVideoRenderThread", "drawFrame failed." + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m83869i() {
        C14181a c14181a;
        WeakReference<C14181a> weakReference = this.f59740a;
        if (weakReference == null || (c14181a = weakReference.get()) == null) {
            return;
        }
        c14181a.m83933k();
    }

    /* JADX INFO: renamed from: j */
    private void m83870j() {
        C14181a c14181a;
        WeakReference<C14181a> weakReference = this.f59740a;
        if (weakReference == null || (c14181a = weakReference.get()) == null) {
            return;
        }
        c14181a.m83934l();
    }

    /* JADX INFO: renamed from: k */
    private void m83871k() {
        C14181a c14181a = this.f59740a.get();
        if (c14181a == null) {
            return;
        }
        SurfaceTexture surfaceTextureM83864d = c14181a.m83864d();
        Surface surface = surfaceTextureM83864d != null ? new Surface(surfaceTextureM83864d) : null;
        Object obj = this.f59747h;
        if (obj == null || (obj instanceof EGLContext)) {
            this.f59746g = C14009b.m82715a(null, (EGLContext) obj, surface, this.f59742c, this.f59743d);
        } else {
            this.f59745f = C14010c.m82725a(null, (android.opengl.EGLContext) obj, surface, this.f59742c, this.f59743d);
        }
        TXCLog.m82973w("TXCVideoRenderThread", "vrender: init egl share context " + this.f59747h + ", create context" + m83873a());
        m83878e();
    }

    /* JADX INFO: renamed from: l */
    private void m83872l() {
        TXCLog.m82973w("TXCVideoRenderThread", "vrender: uninit egl " + m83873a());
        C14009b c14009b = this.f59746g;
        if (c14009b != null) {
            c14009b.m82721c();
            this.f59746g = null;
        }
        C14010c c14010c = this.f59745f;
        if (c14010c != null) {
            c14010c.m82731c();
            this.f59745f = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m83873a() {
        C14009b c14009b = this.f59746g;
        if (c14009b != null) {
            return c14009b.m82722d();
        }
        C14010c c14010c = this.f59745f;
        if (c14010c != null) {
            return c14010c.m82733e();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m83875b() {
        this.f59741b = false;
        m83876c();
    }

    /* JADX INFO: renamed from: c */
    public void m83876c() {
        synchronized (this.f59744e) {
            this.f59744e.notifyAll();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m83877d() {
        C14009b c14009b = this.f59746g;
        if (c14009b != null) {
            c14009b.m82719a();
        }
        C14010c c14010c = this.f59745f;
        if (c14010c != null) {
            c14010c.m82732d();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m83878e() {
        C14009b c14009b = this.f59746g;
        if (c14009b != null) {
            c14009b.m82720b();
        }
        C14010c c14010c = this.f59745f;
        if (c14010c != null) {
            c14010c.m82730b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("VRender-" + getId());
        try {
            this.f59741b = true;
            m83871k();
            m83866f();
            m83869i();
            while (this.f59741b) {
                if (m83868h()) {
                    WeakReference<C14181a> weakReference = this.f59740a;
                    C14181a c14181a = weakReference == null ? null : weakReference.get();
                    if (c14181a != null && c14181a.m83864d() != null) {
                        m83877d();
                    }
                }
                synchronized (this.f59744e) {
                    try {
                        this.f59744e.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            m83870j();
            m83867g();
            m83872l();
        } catch (Exception e) {
            TXCLog.m82967e("TXCVideoRenderThread", "render failed.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83874a(Object obj) {
        this.f59747h = obj;
    }
}
