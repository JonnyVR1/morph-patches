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
import tech.sud.runtime.component.p144c.C22529h;
import tech.sud.runtime.component.p146e.C22536d;
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: renamed from: tech.sud.runtime.core.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22560d implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: b */
    private boolean f208816b;

    /* JADX INFO: renamed from: f */
    private boolean f208820f;

    /* JADX INFO: renamed from: g */
    private final float f208821g;

    /* JADX INFO: renamed from: h */
    private final C22563g f208822h;

    /* JADX INFO: renamed from: k */
    private long f208825k;

    /* JADX INFO: renamed from: l */
    private C22536d f208826l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC22559c f208827m;

    /* JADX INFO: renamed from: n */
    private final View f208828n;

    /* JADX INFO: renamed from: a */
    private final Object f208815a = new Object();

    /* JADX INFO: renamed from: c */
    private boolean f208817c = false;

    /* JADX INFO: renamed from: d */
    private boolean f208818d = false;

    /* JADX INFO: renamed from: e */
    private boolean f208819e = false;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f208823i = new AtomicBoolean();

    /* JADX INFO: renamed from: j */
    private long f208824j = 16666666;

    /* JADX INFO: renamed from: o */
    private a f208829o = new a();

    /* JADX INFO: renamed from: tech.sud.runtime.core.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f208834a;
    }

    public <GLViewC extends View & InterfaceC22559c> C22560d(C22563g c22563g, GLViewC glviewc) {
        this.f208816b = false;
        this.f208820f = false;
        this.f208821g = glviewc.getContext().getApplicationContext().getResources().getDisplayMetrics().density;
        this.f208822h = c22563g;
        GLViewC glviewc2 = glviewc;
        this.f208827m = glviewc2;
        this.f208828n = glviewc;
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
                C22560d.this.m223215j();
                if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    return;
                }
                C22550f.m223106e("SudNative", "GLView.eglDestroyContext failed");
            }
        });
        this.f208816b = false;
        this.f208820f = true;
        this.f208825k = System.nanoTime();
        glviewc2.setRenderer(this);
        glviewc2.setRenderMode(1);
    }

    /* JADX INFO: renamed from: b */
    private void m223209b(MotionEvent motionEvent) {
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
        this.f208822h.m223235a(actionMasked % 5, iArr, fArr, fArr2, motionEvent.getEventTime() / 1000.0d);
    }

    /* JADX INFO: renamed from: g */
    private boolean m223212g() {
        if (this.f208819e) {
            return true;
        }
        return this.f208822h.m223243e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m223213h() {
        this.f208817c = true;
        if (this.f208819e) {
            return;
        }
        this.f208822h.m223244f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m223214i() {
        if (!this.f208819e) {
            this.f208822h.m223245g();
        }
        this.f208817c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m223215j() {
        if (this.f208819e) {
            return;
        }
        this.f208819e = true;
        this.f208822h.m223246h();
    }

    /* JADX INFO: renamed from: a */
    public void m223216a() {
        synchronized (this.f208815a) {
            this.f208818d = true;
            this.f208816b = true;
        }
        this.f208827m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.2
            @Override // java.lang.Runnable
            public void run() {
                C22560d.this.m223215j();
            }
        });
        synchronized (this.f208815a) {
            this.f208815a.notify();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m223223c() {
        synchronized (this.f208815a) {
            this.f208816b = true;
        }
        this.f208827m.setRenderMode(0);
        this.f208827m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.4
            @Override // java.lang.Runnable
            public void run() {
                C22560d.this.m223213h();
            }
        });
        synchronized (this.f208815a) {
            this.f208815a.notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m223224d() {
        boolean z;
        synchronized (this.f208815a) {
            z = this.f208818d;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m223225e() {
        m223215j();
    }

    /* JADX INFO: renamed from: f */
    public a m223226f() {
        return this.f208829o;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f208819e || this.f208817c) {
            return;
        }
        synchronized (this.f208815a) {
            if (!this.f208816b && !this.f208820f && !this.f208818d) {
                if (this.f208823i.get()) {
                    return;
                }
                synchronized (this.f208815a) {
                    if (!this.f208816b && !this.f208820f) {
                        boolean zM223212g = m223212g();
                        long jNanoTime = System.nanoTime() - this.f208825k;
                        long j = this.f208824j;
                        if (jNanoTime < j) {
                            long j2 = j - jNanoTime;
                            if (j2 > 1000000) {
                                try {
                                    synchronized (this.f208815a) {
                                        try {
                                            this.f208815a.wait(j2 / 1000000);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        this.f208825k = System.nanoTime();
                        this.f208829o.f208834a = zM223212g;
                    }
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m223207a(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (this.f208815a) {
            this.f208820f = false;
            this.f208815a.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223219a(C22536d c22536d) {
        this.f208826l = c22536d;
    }

    /* JADX INFO: renamed from: a */
    public void m223220a(boolean z) {
        synchronized (this.f208815a) {
            this.f208820f = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223218a(MotionEvent motionEvent) {
        m223209b(motionEvent);
        C22536d c22536d = this.f208826l;
        if (c22536d != null) {
            c22536d.m223035b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v5 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m223217a(int i) {
        int i2 = 1;
        if (i < 1) {
            i = i2;
        } else {
            i2 = 60;
            if (i > 60) {
                i = i2;
            }
        }
        this.f208824j = (long) ((1.0d / ((double) i)) * 1.0E9d);
    }

    /* JADX INFO: renamed from: a */
    private void m223207a(int i, int i2) {
        if (this.f208819e) {
            return;
        }
        this.f208822h.m223231a(i, i2, C22529h.m222966a(this.f208828n.getContext()), 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m223221b() {
        this.f208827m.setRenderMode(1);
        this.f208827m.queueEvent(new Runnable() { // from class: tech.sud.runtime.core.d.3
            @Override // java.lang.Runnable
            public void run() {
                C22560d.this.m223214i();
            }
        });
        synchronized (this.f208815a) {
            this.f208816b = false;
            this.f208815a.notify();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m223222b(boolean z) {
        this.f208823i.set(z);
        if (z) {
            synchronized (this.f208815a) {
                this.f208815a.notify();
            }
        }
    }
}
