package com.immomo.moment.media.momofilter;

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

/* JADX INFO: loaded from: classes7.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k */
    private static final C3833k f13169k = new C3833k();

    /* JADX INFO: renamed from: a */
    private final WeakReference<GLTextureView> f13170a;

    /* JADX INFO: renamed from: b */
    private C3832j f13171b;

    /* JADX INFO: renamed from: c */
    private GLSurfaceView.Renderer f13172c;

    /* JADX INFO: renamed from: d */
    private boolean f13173d;

    /* JADX INFO: renamed from: e */
    private InterfaceC3828f f13174e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3829g f13175f;

    /* JADX INFO: renamed from: g */
    private InterfaceC3830h f13176g;

    /* JADX INFO: renamed from: h */
    private int f13177h;

    /* JADX INFO: renamed from: i */
    private int f13178i;

    /* JADX INFO: renamed from: j */
    private boolean f13179j;

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$b */
    public abstract class AbstractC3824b implements InterfaceC3828f {

        /* JADX INFO: renamed from: a */
        protected int[] f13180a;

        public AbstractC3824b(int[] iArr) {
            this.f13180a = m18643b(iArr);
        }

        /* JADX INFO: renamed from: b */
        private int[] m18643b(int[] iArr) {
            if (GLTextureView.this.f13178i != 2) {
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
        public abstract EGLConfig mo18644a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3828f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f13180a, null, 0, iArr)) {
                ig3.m135964a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f13180a, eGLConfigArr, i, iArr)) {
                ig3.m135964a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo18644a = mo18644a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo18644a != null) {
                return eGLConfigMo18644a;
            }
            ig3.m135964a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$c */
    public class C3825c extends AbstractC3824b {

        /* JADX INFO: renamed from: c */
        private int[] f13182c;

        /* JADX INFO: renamed from: d */
        protected int f13183d;

        /* JADX INFO: renamed from: e */
        protected int f13184e;

        /* JADX INFO: renamed from: f */
        protected int f13185f;

        /* JADX INFO: renamed from: g */
        protected int f13186g;

        /* JADX INFO: renamed from: h */
        protected int f13187h;

        /* JADX INFO: renamed from: i */
        protected int f13188i;

        public C3825c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f13182c = new int[1];
            this.f13183d = i;
            this.f13184e = i2;
            this.f13185f = i3;
            this.f13186g = i4;
            this.f13187h = i5;
            this.f13188i = i6;
        }

        /* JADX INFO: renamed from: c */
        private int m18645c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f13182c) ? this.f13182c[0] : i2;
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.AbstractC3824b
        /* JADX INFO: renamed from: a */
        public EGLConfig mo18644a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C3825c c3825c = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM18645c = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM18645c2 = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM18645c >= c3825c.f13187h && iM18645c2 >= c3825c.f13188i) {
                    int iM18645c3 = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM18645c4 = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM18645c5 = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM18645c6 = c3825c.m18645c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM18645c3 == c3825c.f13183d && iM18645c4 == c3825c.f13184e && iM18645c5 == c3825c.f13185f && iM18645c6 == c3825c.f13186g) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c3825c;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$d */
    public class C3826d implements InterfaceC3829g {

        /* JADX INFO: renamed from: a */
        private int f13190a;

        private C3826d() {
            this.f13190a = 12440;
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3829g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f13190a, GLTextureView.this.f13178i, 12344};
            if (GLTextureView.this.f13178i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3829g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C3831i.m18650k("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$e */
    public static class C3827e implements InterfaceC3830h {
        private C3827e() {
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3830h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3830h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$f */
    public interface InterfaceC3828f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$g */
    public interface InterfaceC3829g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$h */
    public interface InterfaceC3830h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$i */
    public static class C3831i {

        /* JADX INFO: renamed from: a */
        private WeakReference<GLTextureView> f13192a;

        /* JADX INFO: renamed from: b */
        EGL10 f13193b;

        /* JADX INFO: renamed from: c */
        EGLDisplay f13194c;

        /* JADX INFO: renamed from: d */
        EGLSurface f13195d;

        /* JADX INFO: renamed from: e */
        EGLConfig f13196e;

        /* JADX INFO: renamed from: f */
        EGLContext f13197f;

        public C3831i(WeakReference<GLTextureView> weakReference) {
            this.f13192a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        private void m18646d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f13195d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f13193b.eglMakeCurrent(this.f13194c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f13192a.get();
            if (gLTextureView != null) {
                gLTextureView.f13176g.destroySurface(this.f13193b, this.f13194c, this.f13195d);
            }
            this.f13195d = null;
        }

        /* JADX INFO: renamed from: f */
        public static String m18647f(String str, int i) {
            return str + " failed";
        }

        /* JADX INFO: renamed from: g */
        public static void m18648g(String str, String str2, int i) {
            m18647f(str2, i);
        }

        /* JADX INFO: renamed from: j */
        private void m18649j(String str) {
            m18650k(str, this.f13193b.eglGetError());
        }

        /* JADX INFO: renamed from: k */
        public static void m18650k(String str, int i) {
            throw new RuntimeException(m18647f(str, i));
        }

        /* JADX INFO: renamed from: a */
        public GL m18651a() {
            GL gl = this.f13197f.getGL();
            GLTextureView gLTextureView = this.f13192a.get();
            if (gLTextureView != null) {
                GLTextureView.m18636f(gLTextureView);
                if ((gLTextureView.f13177h & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.f13177h & 1) == 0 ? 0 : 1, (gLTextureView.f13177h & 2) != 0 ? new C3835m() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: b */
        public boolean m18652b() {
            if (this.f13193b == null) {
                upk0.m194883a("egl not initialized");
                return false;
            }
            if (this.f13194c == null) {
                upk0.m194883a("eglDisplay not initialized");
                return false;
            }
            if (this.f13196e == null) {
                upk0.m194883a("mEglConfig not initialized");
                return false;
            }
            m18646d();
            GLTextureView gLTextureView = this.f13192a.get();
            if (gLTextureView != null) {
                this.f13195d = gLTextureView.f13176g.createWindowSurface(this.f13193b, this.f13194c, this.f13196e, gLTextureView.getSurfaceTexture());
            } else {
                this.f13195d = null;
            }
            EGLSurface eGLSurface = this.f13195d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f13193b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f13193b.eglMakeCurrent(this.f13194c, eGLSurface, eGLSurface, this.f13197f)) {
                return true;
            }
            m18648g("EGLHelper", "eglMakeCurrent", this.f13193b.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m18653c() {
            m18646d();
        }

        /* JADX INFO: renamed from: e */
        public void m18654e() {
            if (this.f13197f != null) {
                GLTextureView gLTextureView = this.f13192a.get();
                if (gLTextureView != null) {
                    gLTextureView.f13175f.destroyContext(this.f13193b, this.f13194c, this.f13197f);
                }
                this.f13197f = null;
            }
            EGLDisplay eGLDisplay = this.f13194c;
            if (eGLDisplay != null) {
                this.f13193b.eglTerminate(eGLDisplay);
                this.f13194c = null;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m18655h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f13193b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f13194c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m194883a("eglGetDisplay failed");
                return;
            }
            if (!this.f13193b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m194883a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.f13192a.get();
            if (gLTextureView == null) {
                this.f13196e = null;
                this.f13197f = null;
            } else {
                this.f13196e = gLTextureView.f13174e.chooseConfig(this.f13193b, this.f13194c);
                this.f13197f = gLTextureView.f13175f.createContext(this.f13193b, this.f13194c, this.f13196e);
            }
            EGLContext eGLContext = this.f13197f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f13197f = null;
                m18649j("createContext");
            }
            this.f13195d = null;
        }

        /* JADX INFO: renamed from: i */
        public int m18656i() {
            return !this.f13193b.eglSwapBuffers(this.f13194c, this.f13195d) ? this.f13193b.eglGetError() : CommandMessage.COMMAND_BASE;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$j */
    public static class C3832j extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f13198a;

        /* JADX INFO: renamed from: b */
        private boolean f13199b;

        /* JADX INFO: renamed from: c */
        private boolean f13200c;

        /* JADX INFO: renamed from: d */
        private boolean f13201d;

        /* JADX INFO: renamed from: e */
        private boolean f13202e;

        /* JADX INFO: renamed from: f */
        private boolean f13203f;

        /* JADX INFO: renamed from: g */
        private boolean f13204g;

        /* JADX INFO: renamed from: h */
        private boolean f13205h;

        /* JADX INFO: renamed from: i */
        private boolean f13206i;

        /* JADX INFO: renamed from: j */
        private boolean f13207j;

        /* JADX INFO: renamed from: k */
        private boolean f13208k;

        /* JADX INFO: renamed from: p */
        private boolean f13213p;

        /* JADX INFO: renamed from: s */
        private C3831i f13216s;

        /* JADX INFO: renamed from: t */
        private WeakReference<GLTextureView> f13217t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f13214q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f13215r = true;

        /* JADX INFO: renamed from: l */
        private int f13209l = 0;

        /* JADX INFO: renamed from: m */
        private int f13210m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f13212o = true;

        /* JADX INFO: renamed from: n */
        private int f13211n = 1;

        public C3832j(WeakReference<GLTextureView> weakReference) {
            this.f13217t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        private void m18658d() throws InterruptedException {
            boolean z;
            boolean z2;
            this.f13216s = new C3831i(this.f13217t);
            this.f13205h = false;
            this.f13206i = false;
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
                        synchronized (GLTextureView.f13169k) {
                            while (true) {
                                if (this.f13198a) {
                                    synchronized (GLTextureView.f13169k) {
                                        m18661l();
                                        m18660k();
                                    }
                                    return;
                                }
                                if (!this.f13214q.isEmpty()) {
                                    runnableRemove = this.f13214q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f13201d;
                                boolean z12 = this.f13200c;
                                if (z11 != z12) {
                                    this.f13201d = z12;
                                    GLTextureView.f13169k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f13208k) {
                                    m18661l();
                                    m18660k();
                                    this.f13208k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    m18661l();
                                    m18660k();
                                    z3 = false;
                                }
                                if (z12 && this.f13206i) {
                                    m18661l();
                                }
                                if (z12 && this.f13205h) {
                                    GLTextureView gLTextureView = this.f13217t.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f13179j) || GLTextureView.f13169k.m18674d()) {
                                        m18660k();
                                    }
                                }
                                if (z12 && GLTextureView.f13169k.m18675e()) {
                                    this.f13216s.m18654e();
                                }
                                if (!this.f13202e && !this.f13204g) {
                                    if (this.f13206i) {
                                        m18661l();
                                    }
                                    this.f13204g = true;
                                    this.f13203f = false;
                                    GLTextureView.f13169k.notifyAll();
                                }
                                if (this.f13202e && this.f13204g) {
                                    this.f13204g = false;
                                    GLTextureView.f13169k.notifyAll();
                                }
                                if (z4) {
                                    this.f13213p = true;
                                    GLTextureView.f13169k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (m18659f()) {
                                    if (!this.f13205h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.f13169k.m18677g(this)) {
                                            try {
                                                this.f13216s.m18655h();
                                                this.f13205h = true;
                                                GLTextureView.f13169k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.f13169k.m18673c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.f13205h && !this.f13206i) {
                                        this.f13206i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f13206i) {
                                        if (this.f13215r) {
                                            i = this.f13209l;
                                            i2 = this.f13210m;
                                            z = false;
                                            this.f13215r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f13212o = z;
                                        GLTextureView.f13169k.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.f13169k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.f13216s.m18652b()) {
                                synchronized (GLTextureView.f13169k) {
                                    this.f13207j = true;
                                    GLTextureView.f13169k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.f13169k) {
                                    this.f13207j = true;
                                    this.f13203f = true;
                                    GLTextureView.f13169k.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.f13169k) {
                                m18661l();
                                m18660k();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.f13216s.m18651a();
                            GLTextureView.f13169k.m18672a(gl11);
                            gl10 = gl11;
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.f13217t.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.f13172c.onSurfaceCreated(gl10, this.f13216s.f13196e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.f13217t.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f13172c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.f13217t.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f13172c.onDrawFrame(gl10);
                        }
                        int iM18656i = this.f13216s.m18656i();
                        if (iM18656i == 12288) {
                            z2 = true;
                        } else if (iM18656i != 12302) {
                            C3831i.m18648g("GLThread", "eglSwapBuffers", iM18656i);
                            synchronized (GLTextureView.f13169k) {
                                z2 = true;
                                this.f13203f = true;
                                GLTextureView.f13169k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f13169k) {
                            m18661l();
                            m18660k();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m18659f() {
            if (this.f13201d || !this.f13202e || this.f13203f || this.f13209l <= 0 || this.f13210m <= 0) {
                return false;
            }
            return this.f13212o || this.f13211n == 1;
        }

        /* JADX INFO: renamed from: k */
        private void m18660k() {
            if (this.f13205h) {
                this.f13216s.m18654e();
                this.f13205h = false;
                GLTextureView.f13169k.m18673c(this);
            }
        }

        /* JADX INFO: renamed from: l */
        private void m18661l() {
            if (this.f13206i) {
                this.f13206i = false;
                this.f13216s.m18653c();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m18662a() {
            return this.f13205h && this.f13206i && m18659f();
        }

        /* JADX INFO: renamed from: c */
        public int m18663c() {
            int i;
            synchronized (GLTextureView.f13169k) {
                i = this.f13211n;
            }
            return i;
        }

        /* JADX INFO: renamed from: e */
        public void m18664e(int i, int i2) {
            synchronized (GLTextureView.f13169k) {
                this.f13209l = i;
                this.f13210m = i2;
                this.f13215r = true;
                this.f13212o = true;
                this.f13213p = false;
                GLTextureView.f13169k.notifyAll();
                while (!this.f13199b && !this.f13201d && !this.f13213p && m18662a()) {
                    try {
                        GLTextureView.f13169k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m18665g() {
            synchronized (GLTextureView.f13169k) {
                this.f13198a = true;
                GLTextureView.f13169k.notifyAll();
                while (!this.f13199b) {
                    try {
                        GLTextureView.f13169k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m18666h() {
            this.f13208k = true;
            GLTextureView.f13169k.notifyAll();
        }

        /* JADX INFO: renamed from: i */
        public void m18667i() {
            synchronized (GLTextureView.f13169k) {
                this.f13212o = true;
                GLTextureView.f13169k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m18668j(int i) {
            if (i < 0 || i > 1) {
                ig3.m135964a("renderMode");
                return;
            }
            synchronized (GLTextureView.f13169k) {
                this.f13211n = i;
                GLTextureView.f13169k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: m */
        public void m18669m() {
            synchronized (GLTextureView.f13169k) {
                this.f13202e = true;
                this.f13207j = false;
                GLTextureView.f13169k.notifyAll();
                while (this.f13204g && !this.f13207j && !this.f13199b) {
                    try {
                        GLTextureView.f13169k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m18670n() {
            synchronized (GLTextureView.f13169k) {
                this.f13202e = false;
                GLTextureView.f13169k.notifyAll();
                while (!this.f13204g && !this.f13199b) {
                    try {
                        GLTextureView.f13169k.wait();
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
                m18658d();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.f13169k.m18676f(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$k */
    public static class C3833k {

        /* JADX INFO: renamed from: a */
        private boolean f13218a;

        /* JADX INFO: renamed from: b */
        private int f13219b;

        /* JADX INFO: renamed from: c */
        private boolean f13220c;

        /* JADX INFO: renamed from: d */
        private boolean f13221d;

        /* JADX INFO: renamed from: e */
        private boolean f13222e;

        /* JADX INFO: renamed from: f */
        private C3832j f13223f;

        private C3833k() {
        }

        /* JADX INFO: renamed from: b */
        private void m18671b() {
            if (this.f13218a) {
                return;
            }
            this.f13221d = true;
            this.f13218a = true;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m18672a(GL10 gl10) {
            try {
                if (!this.f13220c) {
                    m18671b();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f13219b < 131072) {
                        this.f13221d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f13222e = !this.f13221d;
                    this.f13220c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m18673c(C3832j c3832j) {
            if (this.f13223f == c3832j) {
                this.f13223f = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m18674d() {
            return this.f13222e;
        }

        /* JADX INFO: renamed from: e */
        public synchronized boolean m18675e() {
            m18671b();
            return !this.f13221d;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m18676f(C3832j c3832j) {
            try {
                c3832j.f13199b = true;
                if (this.f13223f == c3832j) {
                    this.f13223f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m18677g(C3832j c3832j) {
            C3832j c3832j2 = this.f13223f;
            if (c3832j2 == c3832j || c3832j2 == null) {
                this.f13223f = c3832j;
                notifyAll();
                return true;
            }
            m18671b();
            if (this.f13221d) {
                return true;
            }
            C3832j c3832j3 = this.f13223f;
            if (c3832j3 == null) {
                return false;
            }
            c3832j3.m18666h();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$l */
    public interface InterfaceC3834l {
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$m */
    public static class C3835m extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f13224a = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private void m18678k() {
            if (this.f13224a.length() > 0) {
                this.f13224a.toString();
                StringBuilder sb = this.f13224a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m18678k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m18678k();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m18678k();
                } else {
                    this.f13224a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$n */
    public class C3836n extends C3825c {
        public C3836n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f13170a = new WeakReference<>(this);
        m18641k();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC3834l m18636f(GLTextureView gLTextureView) {
        gLTextureView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m18640j() {
        if (this.f13171b == null) {
            return;
        }
        qkq0.m175383a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: k */
    private void m18641k() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            C3832j c3832j = this.f13171b;
            if (c3832j != null) {
                c3832j.m18665g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f13177h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f13179j;
    }

    public int getRenderMode() {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            return c3832j.m18663c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m18642l() {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18667i();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13173d && this.f13172c != null) {
            C3832j c3832j = this.f13171b;
            int iM18663c = c3832j != null ? c3832j.m18663c() : 1;
            C3832j c3832j2 = new C3832j(this.f13170a);
            this.f13171b = c3832j2;
            if (iM18663c != 1) {
                c3832j2.m18668j(iM18663c);
            }
            this.f13171b.start();
        }
        this.f13173d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18665g();
        }
        this.f13173d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18664e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18669m();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3832j c3832j = this.f13171b;
        if (c3832j == null) {
            return true;
        }
        c3832j.m18670n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18664e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C3832j c3832j = this.f13171b;
        if (c3832j == null || c3832j.m18663c() == 0) {
            return;
        }
        m18642l();
    }

    public void setDebugFlags(int i) {
        this.f13177h = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C3836n(z));
    }

    public void setEGLContextClientVersion(int i) {
        m18640j();
        this.f13178i = i;
    }

    public void setEGLContextFactory(InterfaceC3829g interfaceC3829g) {
        m18640j();
        this.f13175f = interfaceC3829g;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC3830h interfaceC3830h) {
        m18640j();
        this.f13176g = interfaceC3830h;
    }

    public void setGLWrapper(InterfaceC3834l interfaceC3834l) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f13179j = z;
    }

    public void setRenderMode(int i) {
        C3832j c3832j = this.f13171b;
        if (c3832j != null) {
            c3832j.m18668j(i);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m18640j();
        if (this.f13174e == null) {
            this.f13174e = new C3836n(true);
        }
        if (this.f13175f == null) {
            this.f13175f = new C3826d();
        }
        if (this.f13176g == null) {
            this.f13176g = new C3827e();
        }
        this.f13172c = renderer;
        C3832j c3832j = new C3832j(this.f13170a);
        this.f13171b = c3832j;
        c3832j.start();
    }

    public void setEGLConfigChooser(InterfaceC3828f interfaceC3828f) {
        m18640j();
        this.f13174e = interfaceC3828f;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13170a = new WeakReference<>(this);
        m18641k();
    }
}
