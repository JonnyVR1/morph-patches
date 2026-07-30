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
import tech.sud.runtime.component.p140c.C22414h;
import tech.sud.runtime.component.p142e.C22421d;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: renamed from: tech.sud.runtime.core.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22445d implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: b */
    private boolean f207894b;

    /* JADX INFO: renamed from: f */
    private boolean f207898f;

    /* JADX INFO: renamed from: g */
    private final float f207899g;

    /* JADX INFO: renamed from: h */
    private final C22448g f207900h;

    /* JADX INFO: renamed from: k */
    private long f207903k;

    /* JADX INFO: renamed from: l */
    private C22421d f207904l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC22444c f207905m;

    /* JADX INFO: renamed from: n */
    private final View f207906n;

    /* JADX INFO: renamed from: a */
    private final Object f207893a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f207895c = false;

    /* JADX INFO: renamed from: d */
    private boolean f207896d = false;

    /* JADX INFO: renamed from: e */
    private boolean f207897e = false;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f207901i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    private long f207902j = 16666666;

    /* JADX INFO: renamed from: o */
    private a f207907o = new a();

    /* JADX INFO: renamed from: tech.sud.runtime.core.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f207912a;
    }

    public <GLViewC extends View & InterfaceC22444c> C22445d(C22448g c22448g, GLViewC glviewc) {
        this.f207894b = false;
        this.f207898f = false;
        this.f207899g = glviewc.getContext().getApplicationContext().getResources().getDisplayMetrics().density;
        this.f207900h = c22448g;
        GLViewC glviewc2 = glviewc;
        this.f207905m = glviewc2;
        this.f207906n = glviewc;
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
                C22445d.this.m221969j();
                if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    return;
                }
                C22435f.m221860e("SudNative", "GLView.eglDestroyContext failed");
            }
        });
        this.f207894b = false;
        this.f207898f = true;
        this.f207903k = System.nanoTime();
        glviewc2.setRenderer(this);
        glviewc2.setRenderMode(1);
    }

    /* JADX INFO: renamed from: b */
    private void m221963b(MotionEvent motionEvent) {
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
        this.f207900h.m221989a(actionMasked % 5, iArr, fArr, fArr2, motionEvent.getEventTime() / 1000.0d);
    }

    /* JADX INFO: renamed from: g */
    private boolean m221966g() {
        if (this.f207897e) {
            return true;
        }
        return this.f207900h.m221997e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m221967h() {
        this.f207895c = true;
        if (this.f207897e) {
            return;
        }
        this.f207900h.m221998f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m221968i() {
        if (!this.f207897e) {
            this.f207900h.m221999g();
        }
        this.f207895c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m221969j() {
        if (this.f207897e) {
            return;
        }
        this.f207897e = true;
        this.f207900h.m222000h();
    }

    /* JADX INFO: renamed from: a */
    public void m221970a() {
        synchronized (this.f207893a) {
            this.f207896d = true;
            this.f207894b = true;
        }
        this.f207905m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.2
            @Override // java.lang.Runnable
            public void run() {
                C22445d.this.m221969j();
            }
        });
        synchronized (this.f207893a) {
            this.f207893a.notify();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m221977c() {
        synchronized (this.f207893a) {
            this.f207894b = true;
        }
        this.f207905m.setRenderMode(0);
        this.f207905m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.4
            @Override // java.lang.Runnable
            public void run() {
                C22445d.this.m221967h();
            }
        });
        synchronized (this.f207893a) {
            this.f207893a.notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m221978d() {
        boolean z;
        synchronized (this.f207893a) {
            z = this.f207896d;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m221979e() {
        m221969j();
    }

    /* JADX INFO: renamed from: f */
    public a m221980f() {
        return this.f207907o;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f207897e || this.f207895c) {
            return;
        }
        synchronized (this.f207893a) {
            if (!this.f207894b && !this.f207898f && !this.f207896d) {
                if (this.f207901i.get()) {
                    return;
                }
                synchronized (this.f207893a) {
                    if (!this.f207894b && !this.f207898f) {
                        boolean zM221966g = m221966g();
                        long jNanoTime = System.nanoTime() - this.f207903k;
                        long j = this.f207902j;
                        if (jNanoTime < j) {
                            long j2 = j - jNanoTime;
                            if (j2 > 1000000) {
                                try {
                                    synchronized (this.f207893a) {
                                        try {
                                            this.f207893a.wait(j2 / 1000000);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        this.f207903k = System.nanoTime();
                        this.f207907o.f207912a = zM221966g;
                    }
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m221961a(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (this.f207893a) {
            this.f207898f = false;
            this.f207893a.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221973a(C22421d c22421d) {
        this.f207904l = c22421d;
    }

    /* JADX INFO: renamed from: a */
    public void m221974a(boolean z) {
        synchronized (this.f207893a) {
            this.f207898f = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221972a(MotionEvent motionEvent) {
        m221963b(motionEvent);
        C22421d c22421d = this.f207904l;
        if (c22421d != null) {
            c22421d.m221789b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v5 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m221971a(int i) {
        int i2 = 1;
        if (i < 1) {
            i = i2;
        } else {
            i2 = 60;
            if (i > 60) {
                i = i2;
            }
        }
        this.f207902j = (long) ((1.0d / ((double) i)) * 1.0E9d);
    }

    /* JADX INFO: renamed from: a */
    private void m221961a(int i, int i2) {
        if (this.f207897e) {
            return;
        }
        this.f207900h.m221985a(i, i2, C22414h.m221720a(this.f207906n.getContext()), 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m221975b() {
        this.f207905m.setRenderMode(1);
        this.f207905m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.3
            @Override // java.lang.Runnable
            public void run() {
                C22445d.this.m221968i();
            }
        });
        synchronized (this.f207893a) {
            this.f207894b = false;
            this.f207893a.notify();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m221976b(boolean z) {
        this.f207901i.set(z);
        if (z) {
            synchronized (this.f207893a) {
                this.f207893a.notify();
            }
        }
    }
}
