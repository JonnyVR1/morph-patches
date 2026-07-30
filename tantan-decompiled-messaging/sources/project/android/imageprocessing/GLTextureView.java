package project.android.imageprocessing;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import com.heytap.mcssdk.mode.CommandMessage;
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
import p149l.ig3;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k */
    private static final C22298k f207017k = new C22298k();

    /* JADX INFO: renamed from: a */
    private final WeakReference<GLTextureView> f207018a;

    /* JADX INFO: renamed from: b */
    private C22297j f207019b;

    /* JADX INFO: renamed from: c */
    private GLSurfaceView.Renderer f207020c;

    /* JADX INFO: renamed from: d */
    private boolean f207021d;

    /* JADX INFO: renamed from: e */
    private InterfaceC22293f f207022e;

    /* JADX INFO: renamed from: f */
    private InterfaceC22294g f207023f;

    /* JADX INFO: renamed from: g */
    private InterfaceC22295h f207024g;

    /* JADX INFO: renamed from: h */
    private int f207025h;

    /* JADX INFO: renamed from: i */
    private int f207026i;

    /* JADX INFO: renamed from: j */
    private boolean f207027j;

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$b */
    public abstract class AbstractC22289b implements InterfaceC22293f {

        /* JADX INFO: renamed from: a */
        protected int[] f207028a;

        public AbstractC22289b(int[] iArr) {
            this.f207028a = m221245b(iArr);
        }

        /* JADX INFO: renamed from: b */
        private int[] m221245b(int[] iArr) {
            if (GLTextureView.this.f207026i != 2) {
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
        public abstract EGLConfig mo221246a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22293f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207028a, null, 0, iArr)) {
                ig3.m135964a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207028a, eGLConfigArr, i, iArr)) {
                ig3.m135964a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo221246a = mo221246a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo221246a != null) {
                return eGLConfigMo221246a;
            }
            ig3.m135964a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$c */
    public class C22290c extends AbstractC22289b {

        /* JADX INFO: renamed from: c */
        private int[] f207030c;

        /* JADX INFO: renamed from: d */
        protected int f207031d;

        /* JADX INFO: renamed from: e */
        protected int f207032e;

        /* JADX INFO: renamed from: f */
        protected int f207033f;

        /* JADX INFO: renamed from: g */
        protected int f207034g;

        /* JADX INFO: renamed from: h */
        protected int f207035h;

        /* JADX INFO: renamed from: i */
        protected int f207036i;

        public C22290c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f207030c = new int[1];
            this.f207031d = i;
            this.f207032e = i2;
            this.f207033f = i3;
            this.f207034g = i4;
            this.f207035h = i5;
            this.f207036i = i6;
        }

        /* JADX INFO: renamed from: c */
        private int m221247c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f207030c) ? this.f207030c[0] : i2;
        }

        @Override // project.android.imageprocessing.GLTextureView.AbstractC22289b
        /* JADX INFO: renamed from: a */
        public EGLConfig mo221246a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C22290c c22290c = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM221247c = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM221247c2 = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM221247c >= c22290c.f207035h && iM221247c2 >= c22290c.f207036i) {
                    int iM221247c3 = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM221247c4 = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM221247c5 = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM221247c6 = c22290c.m221247c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM221247c3 == c22290c.f207031d && iM221247c4 == c22290c.f207032e && iM221247c5 == c22290c.f207033f && iM221247c6 == c22290c.f207034g) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c22290c;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$d */
    public class C22291d implements InterfaceC22294g {

        /* JADX INFO: renamed from: a */
        private int f207038a;

        private C22291d() {
            this.f207038a = 12440;
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22294g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f207038a, GLTextureView.this.f207026i, 12344};
            if (GLTextureView.this.f207026i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22294g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C22296i.m221252k("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$e */
    public static class C22292e implements InterfaceC22295h {
        private C22292e() {
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22295h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22295h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$f */
    public interface InterfaceC22293f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$g */
    public interface InterfaceC22294g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$h */
    public interface InterfaceC22295h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$i */
    public static class C22296i {

        /* JADX INFO: renamed from: a */
        private WeakReference<GLTextureView> f207040a;

        /* JADX INFO: renamed from: b */
        EGL10 f207041b;

        /* JADX INFO: renamed from: c */
        EGLDisplay f207042c;

        /* JADX INFO: renamed from: d */
        EGLSurface f207043d;

        /* JADX INFO: renamed from: e */
        EGLConfig f207044e;

        /* JADX INFO: renamed from: f */
        EGLContext f207045f;

        public C22296i(WeakReference<GLTextureView> weakReference) {
            this.f207040a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        private void m221248d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f207043d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f207041b.eglMakeCurrent(this.f207042c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f207040a.get();
            if (gLTextureView != null) {
                gLTextureView.f207024g.destroySurface(this.f207041b, this.f207042c, this.f207043d);
            }
            this.f207043d = null;
        }

        /* JADX INFO: renamed from: f */
        public static String m221249f(String str, int i) {
            return str + " failed";
        }

        /* JADX INFO: renamed from: g */
        public static void m221250g(String str, String str2, int i) {
            m221249f(str2, i);
        }

        /* JADX INFO: renamed from: j */
        private void m221251j(String str) {
            m221252k(str, this.f207041b.eglGetError());
        }

        /* JADX INFO: renamed from: k */
        public static void m221252k(String str, int i) {
            throw new RuntimeException(m221249f(str, i));
        }

        /* JADX INFO: renamed from: a */
        public GL m221253a() {
            GL gl = this.f207045f.getGL();
            GLTextureView gLTextureView = this.f207040a.get();
            if (gLTextureView != null) {
                GLTextureView.m221238f(gLTextureView);
                if ((gLTextureView.f207025h & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.f207025h & 1) == 0 ? 0 : 1, (gLTextureView.f207025h & 2) != 0 ? new C22300m() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: b */
        public boolean m221254b() {
            if (this.f207041b == null) {
                upk0.m194883a("egl not initialized");
                return false;
            }
            if (this.f207042c == null) {
                upk0.m194883a("eglDisplay not initialized");
                return false;
            }
            if (this.f207044e == null) {
                upk0.m194883a("mEglConfig not initialized");
                return false;
            }
            m221248d();
            GLTextureView gLTextureView = this.f207040a.get();
            if (gLTextureView != null) {
                this.f207043d = gLTextureView.f207024g.createWindowSurface(this.f207041b, this.f207042c, this.f207044e, gLTextureView.getSurfaceTexture());
            } else {
                this.f207043d = null;
            }
            EGLSurface eGLSurface = this.f207043d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f207041b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f207041b.eglMakeCurrent(this.f207042c, eGLSurface, eGLSurface, this.f207045f)) {
                return true;
            }
            m221250g("EGLHelper", "eglMakeCurrent", this.f207041b.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m221255c() {
            m221248d();
        }

        /* JADX INFO: renamed from: e */
        public void m221256e() {
            if (this.f207045f != null) {
                GLTextureView gLTextureView = this.f207040a.get();
                if (gLTextureView != null) {
                    gLTextureView.f207023f.destroyContext(this.f207041b, this.f207042c, this.f207045f);
                }
                this.f207045f = null;
            }
            EGLDisplay eGLDisplay = this.f207042c;
            if (eGLDisplay != null) {
                this.f207041b.eglTerminate(eGLDisplay);
                this.f207042c = null;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m221257h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f207041b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f207042c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m194883a("eglGetDisplay failed");
                return;
            }
            if (!this.f207041b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m194883a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.f207040a.get();
            if (gLTextureView == null) {
                this.f207044e = null;
                this.f207045f = null;
            } else {
                this.f207044e = gLTextureView.f207022e.chooseConfig(this.f207041b, this.f207042c);
                this.f207045f = gLTextureView.f207023f.createContext(this.f207041b, this.f207042c, this.f207044e);
            }
            EGLContext eGLContext = this.f207045f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f207045f = null;
                m221251j("createContext");
            }
            this.f207043d = null;
        }

        /* JADX INFO: renamed from: i */
        public int m221258i() {
            return !this.f207041b.eglSwapBuffers(this.f207042c, this.f207043d) ? this.f207041b.eglGetError() : CommandMessage.COMMAND_BASE;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$j */
    public static class C22297j extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f207046a;

        /* JADX INFO: renamed from: b */
        private boolean f207047b;

        /* JADX INFO: renamed from: c */
        private boolean f207048c;

        /* JADX INFO: renamed from: d */
        private boolean f207049d;

        /* JADX INFO: renamed from: e */
        private boolean f207050e;

        /* JADX INFO: renamed from: f */
        private boolean f207051f;

        /* JADX INFO: renamed from: g */
        private boolean f207052g;

        /* JADX INFO: renamed from: h */
        private boolean f207053h;

        /* JADX INFO: renamed from: i */
        private boolean f207054i;

        /* JADX INFO: renamed from: j */
        private boolean f207055j;

        /* JADX INFO: renamed from: k */
        private boolean f207056k;

        /* JADX INFO: renamed from: p */
        private boolean f207061p;

        /* JADX INFO: renamed from: s */
        private C22296i f207064s;

        /* JADX INFO: renamed from: t */
        private WeakReference<GLTextureView> f207065t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f207062q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f207063r = true;

        /* JADX INFO: renamed from: l */
        private int f207057l = 0;

        /* JADX INFO: renamed from: m */
        private int f207058m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f207060o = true;

        /* JADX INFO: renamed from: n */
        private int f207059n = 1;

        public C22297j(WeakReference<GLTextureView> weakReference) {
            this.f207065t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        private void m221260d() throws InterruptedException {
            boolean z;
            boolean z2;
            this.f207064s = new C22296i(this.f207065t);
            this.f207053h = false;
            this.f207054i = false;
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
                        synchronized (GLTextureView.f207017k) {
                            while (true) {
                                if (this.f207046a) {
                                    synchronized (GLTextureView.f207017k) {
                                        m221263l();
                                        m221262k();
                                    }
                                    return;
                                }
                                if (!this.f207062q.isEmpty()) {
                                    runnableRemove = this.f207062q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f207049d;
                                boolean z12 = this.f207048c;
                                if (z11 != z12) {
                                    this.f207049d = z12;
                                    GLTextureView.f207017k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f207056k) {
                                    m221263l();
                                    m221262k();
                                    this.f207056k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    m221263l();
                                    m221262k();
                                    z3 = false;
                                }
                                if (z12 && this.f207054i) {
                                    m221263l();
                                }
                                if (z12 && this.f207053h) {
                                    GLTextureView gLTextureView = this.f207065t.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f207027j) || GLTextureView.f207017k.m221276d()) {
                                        m221262k();
                                    }
                                }
                                if (z12 && GLTextureView.f207017k.m221277e()) {
                                    this.f207064s.m221256e();
                                }
                                if (!this.f207050e && !this.f207052g) {
                                    if (this.f207054i) {
                                        m221263l();
                                    }
                                    this.f207052g = true;
                                    this.f207051f = false;
                                    GLTextureView.f207017k.notifyAll();
                                }
                                if (this.f207050e && this.f207052g) {
                                    this.f207052g = false;
                                    GLTextureView.f207017k.notifyAll();
                                }
                                if (z4) {
                                    this.f207061p = true;
                                    GLTextureView.f207017k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (m221261f()) {
                                    if (!this.f207053h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.f207017k.m221279g(this)) {
                                            try {
                                                this.f207064s.m221257h();
                                                this.f207053h = true;
                                                GLTextureView.f207017k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.f207017k.m221275c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.f207053h && !this.f207054i) {
                                        this.f207054i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f207054i) {
                                        if (this.f207063r) {
                                            i = this.f207057l;
                                            i2 = this.f207058m;
                                            z = false;
                                            this.f207063r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f207060o = z;
                                        GLTextureView.f207017k.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.f207017k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.f207064s.m221254b()) {
                                synchronized (GLTextureView.f207017k) {
                                    this.f207055j = true;
                                    GLTextureView.f207017k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.f207017k) {
                                    this.f207055j = true;
                                    this.f207051f = true;
                                    GLTextureView.f207017k.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.f207017k) {
                                m221263l();
                                m221262k();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.f207064s.m221253a();
                            GLTextureView.f207017k.m221274a(gl11);
                            gl10 = gl11;
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.f207065t.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.f207020c.onSurfaceCreated(gl10, this.f207064s.f207044e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.f207065t.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f207020c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.f207065t.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f207020c.onDrawFrame(gl10);
                        }
                        int iM221258i = this.f207064s.m221258i();
                        if (iM221258i == 12288) {
                            z2 = true;
                        } else if (iM221258i != 12302) {
                            C22296i.m221250g("GLThread", "eglSwapBuffers", iM221258i);
                            synchronized (GLTextureView.f207017k) {
                                z2 = true;
                                this.f207051f = true;
                                GLTextureView.f207017k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f207017k) {
                            m221263l();
                            m221262k();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m221261f() {
            if (this.f207049d || !this.f207050e || this.f207051f || this.f207057l <= 0 || this.f207058m <= 0) {
                return false;
            }
            return this.f207060o || this.f207059n == 1;
        }

        /* JADX INFO: renamed from: k */
        private void m221262k() {
            if (this.f207053h) {
                this.f207064s.m221256e();
                this.f207053h = false;
                GLTextureView.f207017k.m221275c(this);
            }
        }

        /* JADX INFO: renamed from: l */
        private void m221263l() {
            if (this.f207054i) {
                this.f207054i = false;
                this.f207064s.m221255c();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m221264a() {
            return this.f207053h && this.f207054i && m221261f();
        }

        /* JADX INFO: renamed from: c */
        public int m221265c() {
            int i;
            synchronized (GLTextureView.f207017k) {
                i = this.f207059n;
            }
            return i;
        }

        /* JADX INFO: renamed from: e */
        public void m221266e(int i, int i2) {
            synchronized (GLTextureView.f207017k) {
                this.f207057l = i;
                this.f207058m = i2;
                this.f207063r = true;
                this.f207060o = true;
                this.f207061p = false;
                GLTextureView.f207017k.notifyAll();
                while (!this.f207047b && !this.f207049d && !this.f207061p && m221264a()) {
                    try {
                        GLTextureView.f207017k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m221267g() {
            synchronized (GLTextureView.f207017k) {
                this.f207046a = true;
                GLTextureView.f207017k.notifyAll();
                while (!this.f207047b) {
                    try {
                        GLTextureView.f207017k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m221268h() {
            this.f207056k = true;
            GLTextureView.f207017k.notifyAll();
        }

        /* JADX INFO: renamed from: i */
        public void m221269i() {
            synchronized (GLTextureView.f207017k) {
                this.f207060o = true;
                GLTextureView.f207017k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m221270j(int i) {
            if (i < 0 || i > 1) {
                ig3.m135964a("renderMode");
                return;
            }
            synchronized (GLTextureView.f207017k) {
                this.f207059n = i;
                GLTextureView.f207017k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: m */
        public void m221271m() {
            synchronized (GLTextureView.f207017k) {
                this.f207050e = true;
                this.f207055j = false;
                GLTextureView.f207017k.notifyAll();
                while (this.f207052g && !this.f207055j && !this.f207047b) {
                    try {
                        GLTextureView.f207017k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m221272n() {
            synchronized (GLTextureView.f207017k) {
                this.f207050e = false;
                GLTextureView.f207017k.notifyAll();
                while (!this.f207052g && !this.f207047b) {
                    try {
                        GLTextureView.f207017k.wait();
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
                m221260d();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.f207017k.m221278f(this);
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$k */
    public static class C22298k {

        /* JADX INFO: renamed from: a */
        private boolean f207066a;

        /* JADX INFO: renamed from: b */
        private int f207067b;

        /* JADX INFO: renamed from: c */
        private boolean f207068c;

        /* JADX INFO: renamed from: d */
        private boolean f207069d;

        /* JADX INFO: renamed from: e */
        private boolean f207070e;

        /* JADX INFO: renamed from: f */
        private C22297j f207071f;

        private C22298k() {
        }

        /* JADX INFO: renamed from: b */
        private void m221273b() {
            if (this.f207066a) {
                return;
            }
            this.f207069d = true;
            this.f207066a = true;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m221274a(GL10 gl10) {
            try {
                if (!this.f207068c) {
                    m221273b();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f207067b < 131072) {
                        this.f207069d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f207070e = !this.f207069d;
                    this.f207068c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m221275c(C22297j c22297j) {
            if (this.f207071f == c22297j) {
                this.f207071f = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m221276d() {
            return this.f207070e;
        }

        /* JADX INFO: renamed from: e */
        public synchronized boolean m221277e() {
            m221273b();
            return !this.f207069d;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m221278f(C22297j c22297j) {
            try {
                c22297j.f207047b = true;
                if (this.f207071f == c22297j) {
                    this.f207071f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m221279g(C22297j c22297j) {
            C22297j c22297j2 = this.f207071f;
            if (c22297j2 == c22297j || c22297j2 == null) {
                this.f207071f = c22297j;
                notifyAll();
                return true;
            }
            m221273b();
            if (this.f207069d) {
                return true;
            }
            C22297j c22297j3 = this.f207071f;
            if (c22297j3 == null) {
                return false;
            }
            c22297j3.m221268h();
            return false;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$l */
    public interface InterfaceC22299l {
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$m */
    public static class C22300m extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f207072a = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private void m221280k() {
            if (this.f207072a.length() > 0) {
                this.f207072a.toString();
                StringBuilder sb = this.f207072a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m221280k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m221280k();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m221280k();
                } else {
                    this.f207072a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$n */
    public class C22301n extends C22290c {
        public C22301n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f207018a = new WeakReference<>(this);
        m221243k();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC22299l m221238f(GLTextureView gLTextureView) {
        gLTextureView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m221242j() {
        if (this.f207019b == null) {
            return;
        }
        qkq0.m175383a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: k */
    private void m221243k() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            C22297j c22297j = this.f207019b;
            if (c22297j != null) {
                c22297j.m221267g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f207025h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f207027j;
    }

    public int getRenderMode() {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            return c22297j.m221265c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m221244l() {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221269i();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f207021d && this.f207020c != null) {
            C22297j c22297j = this.f207019b;
            int iM221265c = c22297j != null ? c22297j.m221265c() : 1;
            C22297j c22297j2 = new C22297j(this.f207018a);
            this.f207019b = c22297j2;
            if (iM221265c != 1) {
                c22297j2.m221270j(iM221265c);
            }
            this.f207019b.start();
        }
        this.f207021d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221267g();
        }
        this.f207021d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221266e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221271m();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22297j c22297j = this.f207019b;
        if (c22297j == null) {
            return true;
        }
        c22297j.m221272n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221266e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C22297j c22297j = this.f207019b;
        if (c22297j == null || c22297j.m221265c() == 0) {
            return;
        }
        m221244l();
    }

    public void setDebugFlags(int i) {
        this.f207025h = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C22301n(z));
    }

    public void setEGLContextClientVersion(int i) {
        m221242j();
        this.f207026i = i;
    }

    public void setEGLContextFactory(InterfaceC22294g interfaceC22294g) {
        m221242j();
        this.f207023f = interfaceC22294g;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC22295h interfaceC22295h) {
        m221242j();
        this.f207024g = interfaceC22295h;
    }

    public void setGLWrapper(InterfaceC22299l interfaceC22299l) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f207027j = z;
    }

    public void setRenderMode(int i) {
        C22297j c22297j = this.f207019b;
        if (c22297j != null) {
            c22297j.m221270j(i);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m221242j();
        if (this.f207022e == null) {
            this.f207022e = new C22301n(true);
        }
        if (this.f207023f == null) {
            this.f207023f = new C22291d();
        }
        if (this.f207024g == null) {
            this.f207024g = new C22292e();
        }
        this.f207020c = renderer;
        C22297j c22297j = new C22297j(this.f207018a);
        this.f207019b = c22297j;
        c22297j.start();
    }

    public void setEGLConfigChooser(InterfaceC22293f interfaceC22293f) {
        m221242j();
        this.f207022e = interfaceC22293f;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207018a = new WeakReference<>(this);
        m221243k();
    }
}
