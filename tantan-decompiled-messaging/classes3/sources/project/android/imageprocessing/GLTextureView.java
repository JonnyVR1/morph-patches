package project.android.imageprocessing;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import l.ig3;
import l.qkq0;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k */
    private static final C1091k f10642k = new C1091k();

    /* JADX INFO: renamed from: a */
    private final WeakReference<GLTextureView> f10643a;

    /* JADX INFO: renamed from: b */
    private C1090j f10644b;

    /* JADX INFO: renamed from: c */
    private GLSurfaceView.Renderer f10645c;

    /* JADX INFO: renamed from: d */
    private boolean f10646d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1086f f10647e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1087g f10648f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1088h f10649g;

    /* JADX INFO: renamed from: h */
    private int f10650h;

    /* JADX INFO: renamed from: i */
    private int f10651i;

    /* JADX INFO: renamed from: j */
    private boolean f10652j;

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$b */
    public abstract class AbstractC1082b implements InterfaceC1086f {

        /* JADX INFO: renamed from: a */
        protected int[] f10653a;

        public AbstractC1082b(int[] iArr) {
            this.f10653a = m9702b(iArr);
        }

        /* JADX INFO: renamed from: b */
        private int[] m9702b(int[] iArr) {
            if (GLTextureView.this.f10651i != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo9703a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC1086f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f10653a, null, 0, iArr)) {
                ig3.a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f10653a, eGLConfigArr, i, iArr)) {
                ig3.a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo9703a = mo9703a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo9703a != null) {
                return eGLConfigMo9703a;
            }
            ig3.a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$c */
    public class C1083c extends AbstractC1082b {

        /* JADX INFO: renamed from: c */
        private int[] f10655c;

        /* JADX INFO: renamed from: d */
        protected int f10656d;

        /* JADX INFO: renamed from: e */
        protected int f10657e;

        /* JADX INFO: renamed from: f */
        protected int f10658f;

        /* JADX INFO: renamed from: g */
        protected int f10659g;

        /* JADX INFO: renamed from: h */
        protected int f10660h;

        /* JADX INFO: renamed from: i */
        protected int f10661i;

        public C1083c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f10655c = new int[1];
            this.f10656d = i;
            this.f10657e = i2;
            this.f10658f = i3;
            this.f10659g = i4;
            this.f10660h = i5;
            this.f10661i = i6;
        }

        /* JADX INFO: renamed from: c */
        private int m9704c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f10655c) ? this.f10655c[0] : i2;
        }

        @Override // project.android.imageprocessing.GLTextureView.AbstractC1082b
        /* JADX INFO: renamed from: a */
        public EGLConfig mo9703a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C1083c c1083c = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM9704c = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM9704c2 = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM9704c >= c1083c.f10660h && iM9704c2 >= c1083c.f10661i) {
                    int iM9704c3 = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM9704c4 = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM9704c5 = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM9704c6 = c1083c.m9704c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM9704c3 == c1083c.f10656d && iM9704c4 == c1083c.f10657e && iM9704c5 == c1083c.f10658f && iM9704c6 == c1083c.f10659g) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c1083c;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$d */
    public class C1084d implements InterfaceC1087g {

        /* JADX INFO: renamed from: a */
        private int f10663a;

        private C1084d() {
            this.f10663a = 12440;
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC1087g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f10663a, GLTextureView.this.f10651i, 12344};
            if (GLTextureView.this.f10651i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC1087g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C1089i.m9709k("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$e */
    public static class C1085e implements InterfaceC1088h {
        private C1085e() {
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC1088h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC1088h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$f */
    public interface InterfaceC1086f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$g */
    public interface InterfaceC1087g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$h */
    public interface InterfaceC1088h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$i */
    public static class C1089i {

        /* JADX INFO: renamed from: a */
        private WeakReference<GLTextureView> f10665a;

        /* JADX INFO: renamed from: b */
        EGL10 f10666b;

        /* JADX INFO: renamed from: c */
        EGLDisplay f10667c;

        /* JADX INFO: renamed from: d */
        EGLSurface f10668d;

        /* JADX INFO: renamed from: e */
        EGLConfig f10669e;

        /* JADX INFO: renamed from: f */
        EGLContext f10670f;

        public C1089i(WeakReference<GLTextureView> weakReference) {
            this.f10665a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        private void m9705d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f10668d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f10666b.eglMakeCurrent(this.f10667c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f10665a.get();
            if (gLTextureView != null) {
                gLTextureView.f10649g.destroySurface(this.f10666b, this.f10667c, this.f10668d);
            }
            this.f10668d = null;
        }

        /* JADX INFO: renamed from: f */
        public static String m9706f(String str, int i) {
            return str + " failed";
        }

        /* JADX INFO: renamed from: g */
        public static void m9707g(String str, String str2, int i) {
            m9706f(str2, i);
        }

        /* JADX INFO: renamed from: j */
        private void m9708j(String str) {
            m9709k(str, this.f10666b.eglGetError());
        }

        /* JADX INFO: renamed from: k */
        public static void m9709k(String str, int i) {
            throw new RuntimeException(m9706f(str, i));
        }

        /* JADX INFO: renamed from: a */
        public GL m9710a() {
            GL gl = this.f10670f.getGL();
            GLTextureView gLTextureView = this.f10665a.get();
            if (gLTextureView != null) {
                GLTextureView.m9695f(gLTextureView);
                if ((gLTextureView.f10650h & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.f10650h & 1) == 0 ? 0 : 1, (gLTextureView.f10650h & 2) != 0 ? new C1093m() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: b */
        public boolean m9711b() {
            if (this.f10666b == null) {
                upk0.m8197a("egl not initialized");
                return false;
            }
            if (this.f10667c == null) {
                upk0.m8197a("eglDisplay not initialized");
                return false;
            }
            if (this.f10669e == null) {
                upk0.m8197a("mEglConfig not initialized");
                return false;
            }
            m9705d();
            GLTextureView gLTextureView = this.f10665a.get();
            if (gLTextureView != null) {
                this.f10668d = gLTextureView.f10649g.createWindowSurface(this.f10666b, this.f10667c, this.f10669e, gLTextureView.getSurfaceTexture());
            } else {
                this.f10668d = null;
            }
            EGLSurface eGLSurface = this.f10668d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f10666b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f10666b.eglMakeCurrent(this.f10667c, eGLSurface, eGLSurface, this.f10670f)) {
                return true;
            }
            m9707g("EGLHelper", "eglMakeCurrent", this.f10666b.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m9712c() {
            m9705d();
        }

        /* JADX INFO: renamed from: e */
        public void m9713e() {
            if (this.f10670f != null) {
                GLTextureView gLTextureView = this.f10665a.get();
                if (gLTextureView != null) {
                    gLTextureView.f10648f.destroyContext(this.f10666b, this.f10667c, this.f10670f);
                }
                this.f10670f = null;
            }
            EGLDisplay eGLDisplay = this.f10667c;
            if (eGLDisplay != null) {
                this.f10666b.eglTerminate(eGLDisplay);
                this.f10667c = null;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m9714h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f10666b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f10667c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m8197a("eglGetDisplay failed");
                return;
            }
            if (!this.f10666b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m8197a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.f10665a.get();
            if (gLTextureView == null) {
                this.f10669e = null;
                this.f10670f = null;
            } else {
                this.f10669e = gLTextureView.f10647e.chooseConfig(this.f10666b, this.f10667c);
                this.f10670f = gLTextureView.f10648f.createContext(this.f10666b, this.f10667c, this.f10669e);
            }
            EGLContext eGLContext = this.f10670f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f10670f = null;
                m9708j("createContext");
            }
            this.f10668d = null;
        }

        /* JADX INFO: renamed from: i */
        public int m9715i() {
            if (this.f10666b.eglSwapBuffers(this.f10667c, this.f10668d)) {
                return 12288;
            }
            return this.f10666b.eglGetError();
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$j */
    public static class C1090j extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f10671a;

        /* JADX INFO: renamed from: b */
        private boolean f10672b;

        /* JADX INFO: renamed from: c */
        private boolean f10673c;

        /* JADX INFO: renamed from: d */
        private boolean f10674d;

        /* JADX INFO: renamed from: e */
        private boolean f10675e;

        /* JADX INFO: renamed from: f */
        private boolean f10676f;

        /* JADX INFO: renamed from: g */
        private boolean f10677g;

        /* JADX INFO: renamed from: h */
        private boolean f10678h;

        /* JADX INFO: renamed from: i */
        private boolean f10679i;

        /* JADX INFO: renamed from: j */
        private boolean f10680j;

        /* JADX INFO: renamed from: k */
        private boolean f10681k;

        /* JADX INFO: renamed from: p */
        private boolean f10686p;

        /* JADX INFO: renamed from: s */
        private C1089i f10689s;

        /* JADX INFO: renamed from: t */
        private WeakReference<GLTextureView> f10690t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f10687q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f10688r = true;

        /* JADX INFO: renamed from: l */
        private int f10682l = 0;

        /* JADX INFO: renamed from: m */
        private int f10683m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f10685o = true;

        /* JADX INFO: renamed from: n */
        private int f10684n = 1;

        public C1090j(WeakReference<GLTextureView> weakReference) {
            this.f10690t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        private void m9717d() throws InterruptedException {
            boolean z;
            boolean z2;
            this.f10689s = new C1089i(this.f10690t);
            this.f10678h = false;
            this.f10679i = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            boolean z10 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (GLTextureView.f10642k) {
                            while (true) {
                                if (this.f10671a) {
                                    synchronized (GLTextureView.f10642k) {
                                        m9720l();
                                        m9719k();
                                    }
                                    return;
                                }
                                if (!this.f10687q.isEmpty()) {
                                    runnableRemove = this.f10687q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f10674d;
                                boolean z12 = this.f10673c;
                                if (z11 != z12) {
                                    this.f10674d = z12;
                                    GLTextureView.f10642k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f10681k) {
                                    m9720l();
                                    m9719k();
                                    this.f10681k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    m9720l();
                                    m9719k();
                                    z3 = false;
                                }
                                if (z12 && this.f10679i) {
                                    m9720l();
                                }
                                if (z12 && this.f10678h) {
                                    GLTextureView gLTextureView = this.f10690t.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f10652j) || GLTextureView.f10642k.m9733d()) {
                                        m9719k();
                                    }
                                }
                                if (z12 && GLTextureView.f10642k.m9734e()) {
                                    this.f10689s.m9713e();
                                }
                                if (!this.f10675e && !this.f10677g) {
                                    if (this.f10679i) {
                                        m9720l();
                                    }
                                    this.f10677g = true;
                                    this.f10676f = false;
                                    GLTextureView.f10642k.notifyAll();
                                }
                                if (this.f10675e && this.f10677g) {
                                    this.f10677g = false;
                                    GLTextureView.f10642k.notifyAll();
                                }
                                if (z4) {
                                    this.f10686p = true;
                                    GLTextureView.f10642k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (m9718f()) {
                                    if (!this.f10678h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.f10642k.m9736g(this)) {
                                            try {
                                                this.f10689s.m9714h();
                                                this.f10678h = true;
                                                GLTextureView.f10642k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.f10642k.m9732c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.f10678h && !this.f10679i) {
                                        this.f10679i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f10679i) {
                                        if (this.f10688r) {
                                            i = this.f10682l;
                                            i2 = this.f10683m;
                                            z = false;
                                            this.f10688r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f10685o = z;
                                        GLTextureView.f10642k.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.f10642k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.f10689s.m9711b()) {
                                synchronized (GLTextureView.f10642k) {
                                    this.f10680j = true;
                                    GLTextureView.f10642k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.f10642k) {
                                    this.f10680j = true;
                                    this.f10676f = true;
                                    GLTextureView.f10642k.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.f10642k) {
                                m9720l();
                                m9719k();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.f10689s.m9710a();
                            GLTextureView.f10642k.m9731a(gl11);
                            gl10 = gl11;
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.f10690t.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.f10645c.onSurfaceCreated(gl10, this.f10689s.f10669e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.f10690t.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f10645c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.f10690t.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f10645c.onDrawFrame(gl10);
                        }
                        int iM9715i = this.f10689s.m9715i();
                        if (iM9715i == 12288) {
                            z2 = true;
                        } else if (iM9715i != 12302) {
                            C1089i.m9707g("GLThread", "eglSwapBuffers", iM9715i);
                            synchronized (GLTextureView.f10642k) {
                                z2 = true;
                                this.f10676f = true;
                                GLTextureView.f10642k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f10642k) {
                            m9720l();
                            m9719k();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m9718f() {
            if (this.f10674d || !this.f10675e || this.f10676f || this.f10682l <= 0 || this.f10683m <= 0) {
                return false;
            }
            return this.f10685o || this.f10684n == 1;
        }

        /* JADX INFO: renamed from: k */
        private void m9719k() {
            if (this.f10678h) {
                this.f10689s.m9713e();
                this.f10678h = false;
                GLTextureView.f10642k.m9732c(this);
            }
        }

        /* JADX INFO: renamed from: l */
        private void m9720l() {
            if (this.f10679i) {
                this.f10679i = false;
                this.f10689s.m9712c();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m9721a() {
            return this.f10678h && this.f10679i && m9718f();
        }

        /* JADX INFO: renamed from: c */
        public int m9722c() {
            int i;
            synchronized (GLTextureView.f10642k) {
                i = this.f10684n;
            }
            return i;
        }

        /* JADX INFO: renamed from: e */
        public void m9723e(int i, int i2) {
            synchronized (GLTextureView.f10642k) {
                this.f10682l = i;
                this.f10683m = i2;
                this.f10688r = true;
                this.f10685o = true;
                this.f10686p = false;
                GLTextureView.f10642k.notifyAll();
                while (!this.f10672b && !this.f10674d && !this.f10686p && m9721a()) {
                    try {
                        GLTextureView.f10642k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m9724g() {
            synchronized (GLTextureView.f10642k) {
                this.f10671a = true;
                GLTextureView.f10642k.notifyAll();
                while (!this.f10672b) {
                    try {
                        GLTextureView.f10642k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m9725h() {
            this.f10681k = true;
            GLTextureView.f10642k.notifyAll();
        }

        /* JADX INFO: renamed from: i */
        public void m9726i() {
            synchronized (GLTextureView.f10642k) {
                this.f10685o = true;
                GLTextureView.f10642k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m9727j(int i) {
            if (i < 0 || i > 1) {
                ig3.a("renderMode");
                return;
            }
            synchronized (GLTextureView.f10642k) {
                this.f10684n = i;
                GLTextureView.f10642k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9728m() {
            synchronized (GLTextureView.f10642k) {
                this.f10675e = true;
                this.f10680j = false;
                GLTextureView.f10642k.notifyAll();
                while (this.f10677g && !this.f10680j && !this.f10672b) {
                    try {
                        GLTextureView.f10642k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9729n() {
            synchronized (GLTextureView.f10642k) {
                this.f10675e = false;
                GLTextureView.f10642k.notifyAll();
                while (!this.f10677g && !this.f10672b) {
                    try {
                        GLTextureView.f10642k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                m9717d();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.f10642k.m9735f(this);
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$k */
    public static class C1091k {

        /* JADX INFO: renamed from: a */
        private boolean f10691a;

        /* JADX INFO: renamed from: b */
        private int f10692b;

        /* JADX INFO: renamed from: c */
        private boolean f10693c;

        /* JADX INFO: renamed from: d */
        private boolean f10694d;

        /* JADX INFO: renamed from: e */
        private boolean f10695e;

        /* JADX INFO: renamed from: f */
        private C1090j f10696f;

        private C1091k() {
        }

        /* JADX INFO: renamed from: b */
        private void m9730b() {
            if (this.f10691a) {
                return;
            }
            this.f10694d = true;
            this.f10691a = true;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m9731a(GL10 gl10) {
            try {
                if (!this.f10693c) {
                    m9730b();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f10692b < 131072) {
                        this.f10694d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f10695e = !this.f10694d;
                    this.f10693c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9732c(C1090j c1090j) {
            if (this.f10696f == c1090j) {
                this.f10696f = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m9733d() {
            return this.f10695e;
        }

        /* JADX INFO: renamed from: e */
        public synchronized boolean m9734e() {
            m9730b();
            return !this.f10694d;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m9735f(C1090j c1090j) {
            try {
                c1090j.f10672b = true;
                if (this.f10696f == c1090j) {
                    this.f10696f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m9736g(C1090j c1090j) {
            C1090j c1090j2 = this.f10696f;
            if (c1090j2 == c1090j || c1090j2 == null) {
                this.f10696f = c1090j;
                notifyAll();
                return true;
            }
            m9730b();
            if (this.f10694d) {
                return true;
            }
            C1090j c1090j3 = this.f10696f;
            if (c1090j3 == null) {
                return false;
            }
            c1090j3.m9725h();
            return false;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$l */
    public interface InterfaceC1092l {
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$m */
    public static class C1093m extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f10697a = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private void m9737k() {
            if (this.f10697a.length() > 0) {
                this.f10697a.toString();
                StringBuilder sb = this.f10697a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m9737k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m9737k();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m9737k();
                } else {
                    this.f10697a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$n */
    public class C1094n extends C1083c {
        public C1094n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f10643a = new WeakReference<>(this);
        m9700k();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC1092l m9695f(GLTextureView gLTextureView) {
        gLTextureView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m9699j() {
        if (this.f10644b == null) {
            return;
        }
        qkq0.a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: k */
    private void m9700k() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            C1090j c1090j = this.f10644b;
            if (c1090j != null) {
                c1090j.m9724g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f10650h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f10652j;
    }

    public int getRenderMode() {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            return c1090j.m9722c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m9701l() {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9726i();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10646d && this.f10645c != null) {
            C1090j c1090j = this.f10644b;
            int iM9722c = c1090j != null ? c1090j.m9722c() : 1;
            C1090j c1090j2 = new C1090j(this.f10643a);
            this.f10644b = c1090j2;
            if (iM9722c != 1) {
                c1090j2.m9727j(iM9722c);
            }
            this.f10644b.start();
        }
        this.f10646d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9724g();
        }
        this.f10646d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9723e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9728m();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1090j c1090j = this.f10644b;
        if (c1090j == null) {
            return true;
        }
        c1090j.m9729n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9723e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C1090j c1090j = this.f10644b;
        if (c1090j == null || c1090j.m9722c() == 0) {
            return;
        }
        m9701l();
    }

    public void setDebugFlags(int i) {
        this.f10650h = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C1094n(z));
    }

    public void setEGLContextClientVersion(int i) {
        m9699j();
        this.f10651i = i;
    }

    public void setEGLContextFactory(InterfaceC1087g interfaceC1087g) {
        m9699j();
        this.f10648f = interfaceC1087g;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC1088h interfaceC1088h) {
        m9699j();
        this.f10649g = interfaceC1088h;
    }

    public void setGLWrapper(InterfaceC1092l interfaceC1092l) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f10652j = z;
    }

    public void setRenderMode(int i) {
        C1090j c1090j = this.f10644b;
        if (c1090j != null) {
            c1090j.m9727j(i);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m9699j();
        if (this.f10647e == null) {
            this.f10647e = new C1094n(true);
        }
        if (this.f10648f == null) {
            this.f10648f = new C1084d();
        }
        if (this.f10649g == null) {
            this.f10649g = new C1085e();
        }
        this.f10645c = renderer;
        C1090j c1090j = new C1090j(this.f10643a);
        this.f10644b = c1090j;
        c1090j.start();
    }

    public void setEGLConfigChooser(InterfaceC1086f interfaceC1086f) {
        m9699j();
        this.f10647e = interfaceC1086f;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10643a = new WeakReference<>(this);
        m9700k();
    }
}
