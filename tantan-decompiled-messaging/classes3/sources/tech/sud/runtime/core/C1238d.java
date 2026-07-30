package tech.sud.runtime.core;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import tech.sud.runtime.component.p021c.C1207h;
import tech.sud.runtime.component.p023e.C1214d;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: renamed from: tech.sud.runtime.core.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1238d implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: b */
    private boolean f11519b;

    /* JADX INFO: renamed from: f */
    private boolean f11523f;

    /* JADX INFO: renamed from: g */
    private final float f11524g;

    /* JADX INFO: renamed from: h */
    private final C1241g f11525h;

    /* JADX INFO: renamed from: k */
    private long f11528k;

    /* JADX INFO: renamed from: l */
    private C1214d f11529l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1237c f11530m;

    /* JADX INFO: renamed from: n */
    private final View f11531n;

    /* JADX INFO: renamed from: a */
    private final Object f11518a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f11520c = false;

    /* JADX INFO: renamed from: d */
    private boolean f11521d = false;

    /* JADX INFO: renamed from: e */
    private boolean f11522e = false;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f11526i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    private long f11527j = 16666666;

    /* JADX INFO: renamed from: o */
    private a f11532o = new a();

    /* JADX INFO: renamed from: tech.sud.runtime.core.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f11537a;
    }

    public <GLViewC extends View & InterfaceC1237c> C1238d(C1241g c1241g, GLViewC glviewc) {
        this.f11519b = false;
        this.f11523f = false;
        this.f11524g = glviewc.getContext().getApplicationContext().getResources().getDisplayMetrics().density;
        this.f11525h = c1241g;
        GLViewC glviewc2 = glviewc;
        this.f11530m = glviewc2;
        this.f11531n = glviewc;
        glviewc2.setEGLContextClientVersion(2);
        glviewc.setFocusableInTouchMode(true);
        glviewc2.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        glviewc2.setEGLContextFactory(new GLSurfaceView.EGLContextFactory() { // from class: tech.sud.runtime.core.d.1
            @Override // android.opengl.GLSurfaceView.EGLContextFactory
            public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            }

            @Override // android.opengl.GLSurfaceView.EGLContextFactory
            public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                C1238d.this.m10440j();
                if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    return;
                }
                C1228f.m10331e("SudNative", "GLView.eglDestroyContext failed");
            }
        });
        this.f11519b = false;
        this.f11523f = true;
        this.f11528k = System.nanoTime();
        glviewc2.setRenderer(this);
        glviewc2.setRenderMode(1);
    }

    /* JADX INFO: renamed from: b */
    private void m10434b(MotionEvent motionEvent) {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount < 0) {
            return;
        }
        if (actionMasked == 0 || actionMasked == 1) {
            int actionIndex = motionEvent.getActionIndex();
            int[] iArr2 = {motionEvent.getPointerId(actionIndex)};
            fArr = new float[]{motionEvent.getX(actionIndex)};
            fArr2 = new float[]{motionEvent.getY(actionIndex)};
            iArr = iArr2;
        } else if (actionMasked == 2 || actionMasked == 3) {
            int[] iArr3 = new int[pointerCount];
            fArr = new float[pointerCount];
            fArr2 = new float[pointerCount];
            for (int i = 0; i < pointerCount; i++) {
                iArr3[i] = motionEvent.getPointerId(i);
                fArr[i] = motionEvent.getX(i);
                fArr2[i] = motionEvent.getY(i);
            }
            iArr = iArr3;
        } else {
            if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
            int actionIndex2 = motionEvent.getActionIndex();
            int[] iArr4 = {motionEvent.getPointerId(actionIndex2)};
            fArr = new float[]{motionEvent.getX(actionIndex2)};
            fArr2 = new float[]{motionEvent.getY(actionIndex2)};
            iArr = iArr4;
        }
        this.f11525h.m10460a(actionMasked % 5, iArr, fArr, fArr2, motionEvent.getEventTime() / 1000.0d);
    }

    /* JADX INFO: renamed from: g */
    private boolean m10437g() {
        if (this.f11522e) {
            return true;
        }
        return this.f11525h.m10468e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m10438h() {
        this.f11520c = true;
        if (this.f11522e) {
            return;
        }
        this.f11525h.m10469f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m10439i() {
        if (!this.f11522e) {
            this.f11525h.m10470g();
        }
        this.f11520c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m10440j() {
        if (this.f11522e) {
            return;
        }
        this.f11522e = true;
        this.f11525h.m10471h();
    }

    /* JADX INFO: renamed from: a */
    public void m10441a() {
        synchronized (this.f11518a) {
            this.f11521d = true;
            this.f11519b = true;
        }
        this.f11530m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.2
            @Override // java.lang.Runnable
            public void run() {
                C1238d.this.m10440j();
            }
        });
        synchronized (this.f11518a) {
            this.f11518a.notify();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10448c() {
        synchronized (this.f11518a) {
            this.f11519b = true;
        }
        this.f11530m.setRenderMode(0);
        this.f11530m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.4
            @Override // java.lang.Runnable
            public void run() {
                C1238d.this.m10438h();
            }
        });
        synchronized (this.f11518a) {
            this.f11518a.notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m10449d() {
        boolean z;
        synchronized (this.f11518a) {
            z = this.f11521d;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m10450e() {
        m10440j();
    }

    /* JADX INFO: renamed from: f */
    public a m10451f() {
        return this.f11532o;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f11522e || this.f11520c) {
            return;
        }
        synchronized (this.f11518a) {
            if (!this.f11519b && !this.f11523f && !this.f11521d) {
                if (this.f11526i.get()) {
                    return;
                }
                synchronized (this.f11518a) {
                    if (!this.f11519b && !this.f11523f) {
                        boolean zM10437g = m10437g();
                        long jNanoTime = System.nanoTime() - this.f11528k;
                        long j = this.f11527j;
                        if (jNanoTime < j) {
                            long j2 = j - jNanoTime;
                            if (j2 > 1000000) {
                                try {
                                    synchronized (this.f11518a) {
                                        try {
                                            this.f11518a.wait(j2 / 1000000);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        this.f11528k = System.nanoTime();
                        this.f11532o.f11537a = zM10437g;
                    }
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m10432a(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (this.f11518a) {
            this.f11523f = false;
            this.f11518a.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10444a(C1214d c1214d) {
        this.f11529l = c1214d;
    }

    /* JADX INFO: renamed from: a */
    public void m10445a(boolean z) {
        synchronized (this.f11518a) {
            this.f11523f = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10443a(MotionEvent motionEvent) {
        m10434b(motionEvent);
        C1214d c1214d = this.f11529l;
        if (c1214d != null) {
            c1214d.m10260b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v5 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m10442a(int i) {
        int i2 = 1;
        if (i < 1) {
            i = i2;
        } else {
            i2 = 60;
            if (i > 60) {
                i = i2;
            }
        }
        this.f11527j = (long) ((1.0d / ((double) i)) * 1.0E9d);
    }

    /* JADX INFO: renamed from: a */
    private void m10432a(int i, int i2) {
        if (this.f11522e) {
            return;
        }
        this.f11525h.m10456a(i, i2, C1207h.m10191a(this.f11531n.getContext()), 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m10446b() {
        this.f11530m.setRenderMode(1);
        this.f11530m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.3
            @Override // java.lang.Runnable
            public void run() {
                C1238d.this.m10439i();
            }
        });
        synchronized (this.f11518a) {
            this.f11519b = false;
            this.f11518a.notify();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10447b(boolean z) {
        this.f11526i.set(z);
        if (z) {
            synchronized (this.f11518a) {
                this.f11518a.notify();
            }
        }
    }
}
