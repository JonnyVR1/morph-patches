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
import p153l.azk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k */
    private static final C22413k f207939k = new C22413k();

    /* JADX INFO: renamed from: a */
    private final WeakReference<GLTextureView> f207940a;

    /* JADX INFO: renamed from: b */
    private C22412j f207941b;

    /* JADX INFO: renamed from: c */
    private GLSurfaceView.Renderer f207942c;

    /* JADX INFO: renamed from: d */
    private boolean f207943d;

    /* JADX INFO: renamed from: e */
    private InterfaceC22408f f207944e;

    /* JADX INFO: renamed from: f */
    private InterfaceC22409g f207945f;

    /* JADX INFO: renamed from: g */
    private InterfaceC22410h f207946g;

    /* JADX INFO: renamed from: h */
    private int f207947h;

    /* JADX INFO: renamed from: i */
    private int f207948i;

    /* JADX INFO: renamed from: j */
    private boolean f207949j;

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$b */
    public abstract class AbstractC22404b implements InterfaceC22408f {

        /* JADX INFO: renamed from: a */
        protected int[] f207950a;

        public AbstractC22404b(int[] iArr) {
            this.f207950a = m222491b(iArr);
        }

        /* JADX INFO: renamed from: b */
        private int[] m222491b(int[] iArr) {
            if (GLTextureView.this.f207948i != 2) {
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
        public abstract EGLConfig mo222492a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22408f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207950a, null, 0, iArr)) {
                wg3.m206174a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207950a, eGLConfigArr, i, iArr)) {
                wg3.m206174a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo222492a = mo222492a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo222492a != null) {
                return eGLConfigMo222492a;
            }
            wg3.m206174a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$c */
    public class C22405c extends AbstractC22404b {

        /* JADX INFO: renamed from: c */
        private int[] f207952c;

        /* JADX INFO: renamed from: d */
        protected int f207953d;

        /* JADX INFO: renamed from: e */
        protected int f207954e;

        /* JADX INFO: renamed from: f */
        protected int f207955f;

        /* JADX INFO: renamed from: g */
        protected int f207956g;

        /* JADX INFO: renamed from: h */
        protected int f207957h;

        /* JADX INFO: renamed from: i */
        protected int f207958i;

        public C22405c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f207952c = new int[1];
            this.f207953d = i;
            this.f207954e = i2;
            this.f207955f = i3;
            this.f207956g = i4;
            this.f207957h = i5;
            this.f207958i = i6;
        }

        /* JADX INFO: renamed from: c */
        private int m222493c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f207952c) ? this.f207952c[0] : i2;
        }

        @Override // project.android.imageprocessing.GLTextureView.AbstractC22404b
        /* JADX INFO: renamed from: a */
        public EGLConfig mo222492a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C22405c c22405c = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM222493c = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM222493c2 = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM222493c >= c22405c.f207957h && iM222493c2 >= c22405c.f207958i) {
                    int iM222493c3 = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM222493c4 = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM222493c5 = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM222493c6 = c22405c.m222493c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM222493c3 == c22405c.f207953d && iM222493c4 == c22405c.f207954e && iM222493c5 == c22405c.f207955f && iM222493c6 == c22405c.f207956g) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c22405c;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$d */
    public class C22406d implements InterfaceC22409g {

        /* JADX INFO: renamed from: a */
        private int f207960a;

        private C22406d() {
            this.f207960a = 12440;
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22409g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f207960a, GLTextureView.this.f207948i, 12344};
            if (GLTextureView.this.f207948i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22409g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C22411i.m222498k("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$e */
    public static class C22407e implements InterfaceC22410h {
        private C22407e() {
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22410h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // project.android.imageprocessing.GLTextureView.InterfaceC22410h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$f */
    public interface InterfaceC22408f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$g */
    public interface InterfaceC22409g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$h */
    public interface InterfaceC22410h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$i */
    public static class C22411i {

        /* JADX INFO: renamed from: a */
        private WeakReference<GLTextureView> f207962a;

        /* JADX INFO: renamed from: b */
        EGL10 f207963b;

        /* JADX INFO: renamed from: c */
        EGLDisplay f207964c;

        /* JADX INFO: renamed from: d */
        EGLSurface f207965d;

        /* JADX INFO: renamed from: e */
        EGLConfig f207966e;

        /* JADX INFO: renamed from: f */
        EGLContext f207967f;

        public C22411i(WeakReference<GLTextureView> weakReference) {
            this.f207962a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        private void m222494d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f207965d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f207963b.eglMakeCurrent(this.f207964c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f207962a.get();
            if (gLTextureView != null) {
                gLTextureView.f207946g.destroySurface(this.f207963b, this.f207964c, this.f207965d);
            }
            this.f207965d = null;
        }

        /* JADX INFO: renamed from: f */
        public static String m222495f(String str, int i) {
            return str + " failed";
        }

        /* JADX INFO: renamed from: g */
        public static void m222496g(String str, String str2, int i) {
            m222495f(str2, i);
        }

        /* JADX INFO: renamed from: j */
        private void m222497j(String str) {
            m222498k(str, this.f207963b.eglGetError());
        }

        /* JADX INFO: renamed from: k */
        public static void m222498k(String str, int i) {
            throw new RuntimeException(m222495f(str, i));
        }

        /* JADX INFO: renamed from: a */
        public GL m222499a() {
            GL gl = this.f207967f.getGL();
            GLTextureView gLTextureView = this.f207962a.get();
            if (gLTextureView != null) {
                GLTextureView.m222484f(gLTextureView);
                if ((gLTextureView.f207947h & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.f207947h & 1) == 0 ? 0 : 1, (gLTextureView.f207947h & 2) != 0 ? new C22415m() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: b */
        public boolean m222500b() {
            if (this.f207963b == null) {
                azk0.m101074a("egl not initialized");
                return false;
            }
            if (this.f207964c == null) {
                azk0.m101074a("eglDisplay not initialized");
                return false;
            }
            if (this.f207966e == null) {
                azk0.m101074a("mEglConfig not initialized");
                return false;
            }
            m222494d();
            GLTextureView gLTextureView = this.f207962a.get();
            if (gLTextureView != null) {
                this.f207965d = gLTextureView.f207946g.createWindowSurface(this.f207963b, this.f207964c, this.f207966e, gLTextureView.getSurfaceTexture());
            } else {
                this.f207965d = null;
            }
            EGLSurface eGLSurface = this.f207965d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f207963b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f207963b.eglMakeCurrent(this.f207964c, eGLSurface, eGLSurface, this.f207967f)) {
                return true;
            }
            m222496g("EGLHelper", "eglMakeCurrent", this.f207963b.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m222501c() {
            m222494d();
        }

        /* JADX INFO: renamed from: e */
        public void m222502e() {
            if (this.f207967f != null) {
                GLTextureView gLTextureView = this.f207962a.get();
                if (gLTextureView != null) {
                    gLTextureView.f207945f.destroyContext(this.f207963b, this.f207964c, this.f207967f);
                }
                this.f207967f = null;
            }
            EGLDisplay eGLDisplay = this.f207964c;
            if (eGLDisplay != null) {
                this.f207963b.eglTerminate(eGLDisplay);
                this.f207964c = null;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m222503h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f207963b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f207964c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                azk0.m101074a("eglGetDisplay failed");
                return;
            }
            if (!this.f207963b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                azk0.m101074a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.f207962a.get();
            if (gLTextureView == null) {
                this.f207966e = null;
                this.f207967f = null;
            } else {
                this.f207966e = gLTextureView.f207944e.chooseConfig(this.f207963b, this.f207964c);
                this.f207967f = gLTextureView.f207945f.createContext(this.f207963b, this.f207964c, this.f207966e);
            }
            EGLContext eGLContext = this.f207967f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f207967f = null;
                m222497j("createContext");
            }
            this.f207965d = null;
        }

        /* JADX INFO: renamed from: i */
        public int m222504i() {
            return !this.f207963b.eglSwapBuffers(this.f207964c, this.f207965d) ? this.f207963b.eglGetError() : CommandMessage.COMMAND_BASE;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$j */
    public static class C22412j extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f207968a;

        /* JADX INFO: renamed from: b */
        private boolean f207969b;

        /* JADX INFO: renamed from: c */
        private boolean f207970c;

        /* JADX INFO: renamed from: d */
        private boolean f207971d;

        /* JADX INFO: renamed from: e */
        private boolean f207972e;

        /* JADX INFO: renamed from: f */
        private boolean f207973f;

        /* JADX INFO: renamed from: g */
        private boolean f207974g;

        /* JADX INFO: renamed from: h */
        private boolean f207975h;

        /* JADX INFO: renamed from: i */
        private boolean f207976i;

        /* JADX INFO: renamed from: j */
        private boolean f207977j;

        /* JADX INFO: renamed from: k */
        private boolean f207978k;

        /* JADX INFO: renamed from: p */
        private boolean f207983p;

        /* JADX INFO: renamed from: s */
        private C22411i f207986s;

        /* JADX INFO: renamed from: t */
        private WeakReference<GLTextureView> f207987t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f207984q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f207985r = true;

        /* JADX INFO: renamed from: l */
        private int f207979l = 0;

        /* JADX INFO: renamed from: m */
        private int f207980m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f207982o = true;

        /* JADX INFO: renamed from: n */
        private int f207981n = 1;

        public C22412j(WeakReference<GLTextureView> weakReference) {
            this.f207987t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        private void m222506d() throws InterruptedException {
            boolean z;
            boolean z2;
            this.f207986s = new C22411i(this.f207987t);
            this.f207975h = false;
            this.f207976i = false;
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
                        synchronized (GLTextureView.f207939k) {
                            while (true) {
                                if (this.f207968a) {
                                    synchronized (GLTextureView.f207939k) {
                                        m222509l();
                                        m222508k();
                                    }
                                    return;
                                }
                                if (!this.f207984q.isEmpty()) {
                                    runnableRemove = this.f207984q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f207971d;
                                boolean z12 = this.f207970c;
                                if (z11 != z12) {
                                    this.f207971d = z12;
                                    GLTextureView.f207939k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f207978k) {
                                    m222509l();
                                    m222508k();
                                    this.f207978k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    m222509l();
                                    m222508k();
                                    z3 = false;
                                }
                                if (z12 && this.f207976i) {
                                    m222509l();
                                }
                                if (z12 && this.f207975h) {
                                    GLTextureView gLTextureView = this.f207987t.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f207949j) || GLTextureView.f207939k.m222522d()) {
                                        m222508k();
                                    }
                                }
                                if (z12 && GLTextureView.f207939k.m222523e()) {
                                    this.f207986s.m222502e();
                                }
                                if (!this.f207972e && !this.f207974g) {
                                    if (this.f207976i) {
                                        m222509l();
                                    }
                                    this.f207974g = true;
                                    this.f207973f = false;
                                    GLTextureView.f207939k.notifyAll();
                                }
                                if (this.f207972e && this.f207974g) {
                                    this.f207974g = false;
                                    GLTextureView.f207939k.notifyAll();
                                }
                                if (z4) {
                                    this.f207983p = true;
                                    GLTextureView.f207939k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (m222507f()) {
                                    if (!this.f207975h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.f207939k.m222525g(this)) {
                                            try {
                                                this.f207986s.m222503h();
                                                this.f207975h = true;
                                                GLTextureView.f207939k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.f207939k.m222521c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.f207975h && !this.f207976i) {
                                        this.f207976i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f207976i) {
                                        if (this.f207985r) {
                                            i = this.f207979l;
                                            i2 = this.f207980m;
                                            z = false;
                                            this.f207985r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f207982o = z;
                                        GLTextureView.f207939k.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.f207939k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.f207986s.m222500b()) {
                                synchronized (GLTextureView.f207939k) {
                                    this.f207977j = true;
                                    GLTextureView.f207939k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.f207939k) {
                                    this.f207977j = true;
                                    this.f207973f = true;
                                    GLTextureView.f207939k.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.f207939k) {
                                m222509l();
                                m222508k();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.f207986s.m222499a();
                            GLTextureView.f207939k.m222520a(gl11);
                            gl10 = gl11;
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.f207987t.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.f207942c.onSurfaceCreated(gl10, this.f207986s.f207966e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.f207987t.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f207942c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.f207987t.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f207942c.onDrawFrame(gl10);
                        }
                        int iM222504i = this.f207986s.m222504i();
                        if (iM222504i == 12288) {
                            z2 = true;
                        } else if (iM222504i != 12302) {
                            C22411i.m222496g("GLThread", "eglSwapBuffers", iM222504i);
                            synchronized (GLTextureView.f207939k) {
                                z2 = true;
                                this.f207973f = true;
                                GLTextureView.f207939k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f207939k) {
                            m222509l();
                            m222508k();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m222507f() {
            if (this.f207971d || !this.f207972e || this.f207973f || this.f207979l <= 0 || this.f207980m <= 0) {
                return false;
            }
            return this.f207982o || this.f207981n == 1;
        }

        /* JADX INFO: renamed from: k */
        private void m222508k() {
            if (this.f207975h) {
                this.f207986s.m222502e();
                this.f207975h = false;
                GLTextureView.f207939k.m222521c(this);
            }
        }

        /* JADX INFO: renamed from: l */
        private void m222509l() {
            if (this.f207976i) {
                this.f207976i = false;
                this.f207986s.m222501c();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m222510a() {
            return this.f207975h && this.f207976i && m222507f();
        }

        /* JADX INFO: renamed from: c */
        public int m222511c() {
            int i;
            synchronized (GLTextureView.f207939k) {
                i = this.f207981n;
            }
            return i;
        }

        /* JADX INFO: renamed from: e */
        public void m222512e(int i, int i2) {
            synchronized (GLTextureView.f207939k) {
                this.f207979l = i;
                this.f207980m = i2;
                this.f207985r = true;
                this.f207982o = true;
                this.f207983p = false;
                GLTextureView.f207939k.notifyAll();
                while (!this.f207969b && !this.f207971d && !this.f207983p && m222510a()) {
                    try {
                        GLTextureView.f207939k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m222513g() {
            synchronized (GLTextureView.f207939k) {
                this.f207968a = true;
                GLTextureView.f207939k.notifyAll();
                while (!this.f207969b) {
                    try {
                        GLTextureView.f207939k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m222514h() {
            this.f207978k = true;
            GLTextureView.f207939k.notifyAll();
        }

        /* JADX INFO: renamed from: i */
        public void m222515i() {
            synchronized (GLTextureView.f207939k) {
                this.f207982o = true;
                GLTextureView.f207939k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m222516j(int i) {
            if (i < 0 || i > 1) {
                wg3.m206174a("renderMode");
                return;
            }
            synchronized (GLTextureView.f207939k) {
                this.f207981n = i;
                GLTextureView.f207939k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: m */
        public void m222517m() {
            synchronized (GLTextureView.f207939k) {
                this.f207972e = true;
                this.f207977j = false;
                GLTextureView.f207939k.notifyAll();
                while (this.f207974g && !this.f207977j && !this.f207969b) {
                    try {
                        GLTextureView.f207939k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m222518n() {
            synchronized (GLTextureView.f207939k) {
                this.f207972e = false;
                GLTextureView.f207939k.notifyAll();
                while (!this.f207974g && !this.f207969b) {
                    try {
                        GLTextureView.f207939k.wait();
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
                m222506d();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.f207939k.m222524f(this);
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$k */
    public static class C22413k {

        /* JADX INFO: renamed from: a */
        private boolean f207988a;

        /* JADX INFO: renamed from: b */
        private int f207989b;

        /* JADX INFO: renamed from: c */
        private boolean f207990c;

        /* JADX INFO: renamed from: d */
        private boolean f207991d;

        /* JADX INFO: renamed from: e */
        private boolean f207992e;

        /* JADX INFO: renamed from: f */
        private C22412j f207993f;

        private C22413k() {
        }

        /* JADX INFO: renamed from: b */
        private void m222519b() {
            if (this.f207988a) {
                return;
            }
            this.f207991d = true;
            this.f207988a = true;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m222520a(GL10 gl10) {
            try {
                if (!this.f207990c) {
                    m222519b();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f207989b < 131072) {
                        this.f207991d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f207992e = !this.f207991d;
                    this.f207990c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m222521c(C22412j c22412j) {
            if (this.f207993f == c22412j) {
                this.f207993f = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m222522d() {
            return this.f207992e;
        }

        /* JADX INFO: renamed from: e */
        public synchronized boolean m222523e() {
            m222519b();
            return !this.f207991d;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m222524f(C22412j c22412j) {
            try {
                c22412j.f207969b = true;
                if (this.f207993f == c22412j) {
                    this.f207993f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m222525g(C22412j c22412j) {
            C22412j c22412j2 = this.f207993f;
            if (c22412j2 == c22412j || c22412j2 == null) {
                this.f207993f = c22412j;
                notifyAll();
                return true;
            }
            m222519b();
            if (this.f207991d) {
                return true;
            }
            C22412j c22412j3 = this.f207993f;
            if (c22412j3 == null) {
                return false;
            }
            c22412j3.m222514h();
            return false;
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$l */
    public interface InterfaceC22414l {
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$m */
    public static class C22415m extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f207994a = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private void m222526k() {
            if (this.f207994a.length() > 0) {
                this.f207994a.toString();
                StringBuilder sb = this.f207994a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m222526k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m222526k();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m222526k();
                } else {
                    this.f207994a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: project.android.imageprocessing.GLTextureView$n */
    public class C22416n extends C22405c {
        public C22416n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f207940a = new WeakReference<>(this);
        m222489k();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC22414l m222484f(GLTextureView gLTextureView) {
        gLTextureView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m222488j() {
        if (this.f207941b == null) {
            return;
        }
        wtq0.m207906a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: k */
    private void m222489k() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            C22412j c22412j = this.f207941b;
            if (c22412j != null) {
                c22412j.m222513g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f207947h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f207949j;
    }

    public int getRenderMode() {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            return c22412j.m222511c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m222490l() {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222515i();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f207943d && this.f207942c != null) {
            C22412j c22412j = this.f207941b;
            int iM222511c = c22412j != null ? c22412j.m222511c() : 1;
            C22412j c22412j2 = new C22412j(this.f207940a);
            this.f207941b = c22412j2;
            if (iM222511c != 1) {
                c22412j2.m222516j(iM222511c);
            }
            this.f207941b.start();
        }
        this.f207943d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222513g();
        }
        this.f207943d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222512e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222517m();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22412j c22412j = this.f207941b;
        if (c22412j == null) {
            return true;
        }
        c22412j.m222518n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222512e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C22412j c22412j = this.f207941b;
        if (c22412j == null || c22412j.m222511c() == 0) {
            return;
        }
        m222490l();
    }

    public void setDebugFlags(int i) {
        this.f207947h = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C22416n(z));
    }

    public void setEGLContextClientVersion(int i) {
        m222488j();
        this.f207948i = i;
    }

    public void setEGLContextFactory(InterfaceC22409g interfaceC22409g) {
        m222488j();
        this.f207945f = interfaceC22409g;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC22410h interfaceC22410h) {
        m222488j();
        this.f207946g = interfaceC22410h;
    }

    public void setGLWrapper(InterfaceC22414l interfaceC22414l) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f207949j = z;
    }

    public void setRenderMode(int i) {
        C22412j c22412j = this.f207941b;
        if (c22412j != null) {
            c22412j.m222516j(i);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m222488j();
        if (this.f207944e == null) {
            this.f207944e = new C22416n(true);
        }
        if (this.f207945f == null) {
            this.f207945f = new C22406d();
        }
        if (this.f207946g == null) {
            this.f207946g = new C22407e();
        }
        this.f207942c = renderer;
        C22412j c22412j = new C22412j(this.f207940a);
        this.f207941b = c22412j;
        c22412j.start();
    }

    public void setEGLConfigChooser(InterfaceC22408f interfaceC22408f) {
        m222488j();
        this.f207944e = interfaceC22408f;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207940a = new WeakReference<>(this);
        m222489k();
    }
}
