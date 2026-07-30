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
import p153l.azk0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: k */
    private static final C3976k f13863k = new C3976k();

    /* JADX INFO: renamed from: a */
    private final WeakReference<GLTextureView> f13864a;

    /* JADX INFO: renamed from: b */
    private C3975j f13865b;

    /* JADX INFO: renamed from: c */
    private GLSurfaceView.Renderer f13866c;

    /* JADX INFO: renamed from: d */
    private boolean f13867d;

    /* JADX INFO: renamed from: e */
    private InterfaceC3971f f13868e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3972g f13869f;

    /* JADX INFO: renamed from: g */
    private InterfaceC3973h f13870g;

    /* JADX INFO: renamed from: h */
    private int f13871h;

    /* JADX INFO: renamed from: i */
    private int f13872i;

    /* JADX INFO: renamed from: j */
    private boolean f13873j;

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$b */
    public abstract class AbstractC3967b implements InterfaceC3971f {

        /* JADX INFO: renamed from: a */
        protected int[] f13874a;

        public AbstractC3967b(int[] iArr) {
            this.f13874a = m19623b(iArr);
        }

        /* JADX INFO: renamed from: b */
        private int[] m19623b(int[] iArr) {
            if (GLTextureView.this.f13872i != 2) {
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
        public abstract EGLConfig mo19624a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3971f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f13874a, null, 0, iArr)) {
                wg3.m206174a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f13874a, eGLConfigArr, i, iArr)) {
                wg3.m206174a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo19624a = mo19624a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo19624a != null) {
                return eGLConfigMo19624a;
            }
            wg3.m206174a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$c */
    public class C3968c extends AbstractC3967b {

        /* JADX INFO: renamed from: c */
        private int[] f13876c;

        /* JADX INFO: renamed from: d */
        protected int f13877d;

        /* JADX INFO: renamed from: e */
        protected int f13878e;

        /* JADX INFO: renamed from: f */
        protected int f13879f;

        /* JADX INFO: renamed from: g */
        protected int f13880g;

        /* JADX INFO: renamed from: h */
        protected int f13881h;

        /* JADX INFO: renamed from: i */
        protected int f13882i;

        public C3968c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f13876c = new int[1];
            this.f13877d = i;
            this.f13878e = i2;
            this.f13879f = i3;
            this.f13880g = i4;
            this.f13881h = i5;
            this.f13882i = i6;
        }

        /* JADX INFO: renamed from: c */
        private int m19625c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f13876c) ? this.f13876c[0] : i2;
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.AbstractC3967b
        /* JADX INFO: renamed from: a */
        public EGLConfig mo19624a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C3968c c3968c = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM19625c = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM19625c2 = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM19625c >= c3968c.f13881h && iM19625c2 >= c3968c.f13882i) {
                    int iM19625c3 = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM19625c4 = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM19625c5 = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM19625c6 = c3968c.m19625c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM19625c3 == c3968c.f13877d && iM19625c4 == c3968c.f13878e && iM19625c5 == c3968c.f13879f && iM19625c6 == c3968c.f13880g) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c3968c;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$d */
    public class C3969d implements InterfaceC3972g {

        /* JADX INFO: renamed from: a */
        private int f13884a;

        private C3969d() {
            this.f13884a = 12440;
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3972g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f13884a, GLTextureView.this.f13872i, 12344};
            if (GLTextureView.this.f13872i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3972g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C3974i.m19630k("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$e */
    public static class C3970e implements InterfaceC3973h {
        private C3970e() {
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3973h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.immomo.moment.media.momofilter.GLTextureView.InterfaceC3973h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$f */
    public interface InterfaceC3971f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$g */
    public interface InterfaceC3972g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$h */
    public interface InterfaceC3973h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$i */
    public static class C3974i {

        /* JADX INFO: renamed from: a */
        private WeakReference<GLTextureView> f13886a;

        /* JADX INFO: renamed from: b */
        EGL10 f13887b;

        /* JADX INFO: renamed from: c */
        EGLDisplay f13888c;

        /* JADX INFO: renamed from: d */
        EGLSurface f13889d;

        /* JADX INFO: renamed from: e */
        EGLConfig f13890e;

        /* JADX INFO: renamed from: f */
        EGLContext f13891f;

        public C3974i(WeakReference<GLTextureView> weakReference) {
            this.f13886a = weakReference;
        }

        /* JADX INFO: renamed from: d */
        private void m19626d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f13889d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f13887b.eglMakeCurrent(this.f13888c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f13886a.get();
            if (gLTextureView != null) {
                gLTextureView.f13870g.destroySurface(this.f13887b, this.f13888c, this.f13889d);
            }
            this.f13889d = null;
        }

        /* JADX INFO: renamed from: f */
        public static String m19627f(String str, int i) {
            return str + " failed";
        }

        /* JADX INFO: renamed from: g */
        public static void m19628g(String str, String str2, int i) {
            m19627f(str2, i);
        }

        /* JADX INFO: renamed from: j */
        private void m19629j(String str) {
            m19630k(str, this.f13887b.eglGetError());
        }

        /* JADX INFO: renamed from: k */
        public static void m19630k(String str, int i) {
            throw new RuntimeException(m19627f(str, i));
        }

        /* JADX INFO: renamed from: a */
        public GL m19631a() {
            GL gl = this.f13891f.getGL();
            GLTextureView gLTextureView = this.f13886a.get();
            if (gLTextureView != null) {
                GLTextureView.m19616f(gLTextureView);
                if ((gLTextureView.f13871h & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.f13871h & 1) == 0 ? 0 : 1, (gLTextureView.f13871h & 2) != 0 ? new C3978m() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: b */
        public boolean m19632b() {
            if (this.f13887b == null) {
                azk0.m101074a("egl not initialized");
                return false;
            }
            if (this.f13888c == null) {
                azk0.m101074a("eglDisplay not initialized");
                return false;
            }
            if (this.f13890e == null) {
                azk0.m101074a("mEglConfig not initialized");
                return false;
            }
            m19626d();
            GLTextureView gLTextureView = this.f13886a.get();
            if (gLTextureView != null) {
                this.f13889d = gLTextureView.f13870g.createWindowSurface(this.f13887b, this.f13888c, this.f13890e, gLTextureView.getSurfaceTexture());
            } else {
                this.f13889d = null;
            }
            EGLSurface eGLSurface = this.f13889d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f13887b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f13887b.eglMakeCurrent(this.f13888c, eGLSurface, eGLSurface, this.f13891f)) {
                return true;
            }
            m19628g("EGLHelper", "eglMakeCurrent", this.f13887b.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m19633c() {
            m19626d();
        }

        /* JADX INFO: renamed from: e */
        public void m19634e() {
            if (this.f13891f != null) {
                GLTextureView gLTextureView = this.f13886a.get();
                if (gLTextureView != null) {
                    gLTextureView.f13869f.destroyContext(this.f13887b, this.f13888c, this.f13891f);
                }
                this.f13891f = null;
            }
            EGLDisplay eGLDisplay = this.f13888c;
            if (eGLDisplay != null) {
                this.f13887b.eglTerminate(eGLDisplay);
                this.f13888c = null;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m19635h() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f13887b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f13888c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                azk0.m101074a("eglGetDisplay failed");
                return;
            }
            if (!this.f13887b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                azk0.m101074a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.f13886a.get();
            if (gLTextureView == null) {
                this.f13890e = null;
                this.f13891f = null;
            } else {
                this.f13890e = gLTextureView.f13868e.chooseConfig(this.f13887b, this.f13888c);
                this.f13891f = gLTextureView.f13869f.createContext(this.f13887b, this.f13888c, this.f13890e);
            }
            EGLContext eGLContext = this.f13891f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f13891f = null;
                m19629j("createContext");
            }
            this.f13889d = null;
        }

        /* JADX INFO: renamed from: i */
        public int m19636i() {
            return !this.f13887b.eglSwapBuffers(this.f13888c, this.f13889d) ? this.f13887b.eglGetError() : CommandMessage.COMMAND_BASE;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$j */
    public static class C3975j extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f13892a;

        /* JADX INFO: renamed from: b */
        private boolean f13893b;

        /* JADX INFO: renamed from: c */
        private boolean f13894c;

        /* JADX INFO: renamed from: d */
        private boolean f13895d;

        /* JADX INFO: renamed from: e */
        private boolean f13896e;

        /* JADX INFO: renamed from: f */
        private boolean f13897f;

        /* JADX INFO: renamed from: g */
        private boolean f13898g;

        /* JADX INFO: renamed from: h */
        private boolean f13899h;

        /* JADX INFO: renamed from: i */
        private boolean f13900i;

        /* JADX INFO: renamed from: j */
        private boolean f13901j;

        /* JADX INFO: renamed from: k */
        private boolean f13902k;

        /* JADX INFO: renamed from: p */
        private boolean f13907p;

        /* JADX INFO: renamed from: s */
        private C3974i f13910s;

        /* JADX INFO: renamed from: t */
        private WeakReference<GLTextureView> f13911t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f13908q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f13909r = true;

        /* JADX INFO: renamed from: l */
        private int f13903l = 0;

        /* JADX INFO: renamed from: m */
        private int f13904m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f13906o = true;

        /* JADX INFO: renamed from: n */
        private int f13905n = 1;

        public C3975j(WeakReference<GLTextureView> weakReference) {
            this.f13911t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: d */
        private void m19638d() throws InterruptedException {
            boolean z;
            boolean z2;
            this.f13910s = new C3974i(this.f13911t);
            this.f13899h = false;
            this.f13900i = false;
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
                        synchronized (GLTextureView.f13863k) {
                            while (true) {
                                if (this.f13892a) {
                                    synchronized (GLTextureView.f13863k) {
                                        m19641l();
                                        m19640k();
                                    }
                                    return;
                                }
                                if (!this.f13908q.isEmpty()) {
                                    runnableRemove = this.f13908q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.f13895d;
                                boolean z12 = this.f13894c;
                                if (z11 != z12) {
                                    this.f13895d = z12;
                                    GLTextureView.f13863k.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.f13902k) {
                                    m19641l();
                                    m19640k();
                                    this.f13902k = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    m19641l();
                                    m19640k();
                                    z3 = false;
                                }
                                if (z12 && this.f13900i) {
                                    m19641l();
                                }
                                if (z12 && this.f13899h) {
                                    GLTextureView gLTextureView = this.f13911t.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.f13873j) || GLTextureView.f13863k.m19654d()) {
                                        m19640k();
                                    }
                                }
                                if (z12 && GLTextureView.f13863k.m19655e()) {
                                    this.f13910s.m19634e();
                                }
                                if (!this.f13896e && !this.f13898g) {
                                    if (this.f13900i) {
                                        m19641l();
                                    }
                                    this.f13898g = true;
                                    this.f13897f = false;
                                    GLTextureView.f13863k.notifyAll();
                                }
                                if (this.f13896e && this.f13898g) {
                                    this.f13898g = false;
                                    GLTextureView.f13863k.notifyAll();
                                }
                                if (z4) {
                                    this.f13907p = true;
                                    GLTextureView.f13863k.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (m19639f()) {
                                    if (!this.f13899h) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.f13863k.m19657g(this)) {
                                            try {
                                                this.f13910s.m19635h();
                                                this.f13899h = true;
                                                GLTextureView.f13863k.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.f13863k.m19653c(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.f13899h && !this.f13900i) {
                                        this.f13900i = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.f13900i) {
                                        if (this.f13909r) {
                                            i = this.f13903l;
                                            i2 = this.f13904m;
                                            z = false;
                                            this.f13909r = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f13906o = z;
                                        GLTextureView.f13863k.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.f13863k.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.f13910s.m19632b()) {
                                synchronized (GLTextureView.f13863k) {
                                    this.f13901j = true;
                                    GLTextureView.f13863k.notifyAll();
                                }
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.f13863k) {
                                    this.f13901j = true;
                                    this.f13897f = true;
                                    GLTextureView.f13863k.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.f13863k) {
                                m19641l();
                                m19640k();
                                throw th;
                            }
                        }
                        if (z8) {
                            GL10 gl11 = (GL10) this.f13910s.m19631a();
                            GLTextureView.f13863k.m19652a(gl11);
                            gl10 = gl11;
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.f13911t.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.f13866c.onSurfaceCreated(gl10, this.f13910s.f13890e);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.f13911t.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f13866c.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.f13911t.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f13866c.onDrawFrame(gl10);
                        }
                        int iM19636i = this.f13910s.m19636i();
                        if (iM19636i == 12288) {
                            z2 = true;
                        } else if (iM19636i != 12302) {
                            C3974i.m19628g("GLThread", "eglSwapBuffers", iM19636i);
                            synchronized (GLTextureView.f13863k) {
                                z2 = true;
                                this.f13897f = true;
                                GLTextureView.f13863k.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.f13863k) {
                            m19641l();
                            m19640k();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: f */
        private boolean m19639f() {
            if (this.f13895d || !this.f13896e || this.f13897f || this.f13903l <= 0 || this.f13904m <= 0) {
                return false;
            }
            return this.f13906o || this.f13905n == 1;
        }

        /* JADX INFO: renamed from: k */
        private void m19640k() {
            if (this.f13899h) {
                this.f13910s.m19634e();
                this.f13899h = false;
                GLTextureView.f13863k.m19653c(this);
            }
        }

        /* JADX INFO: renamed from: l */
        private void m19641l() {
            if (this.f13900i) {
                this.f13900i = false;
                this.f13910s.m19633c();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m19642a() {
            return this.f13899h && this.f13900i && m19639f();
        }

        /* JADX INFO: renamed from: c */
        public int m19643c() {
            int i;
            synchronized (GLTextureView.f13863k) {
                i = this.f13905n;
            }
            return i;
        }

        /* JADX INFO: renamed from: e */
        public void m19644e(int i, int i2) {
            synchronized (GLTextureView.f13863k) {
                this.f13903l = i;
                this.f13904m = i2;
                this.f13909r = true;
                this.f13906o = true;
                this.f13907p = false;
                GLTextureView.f13863k.notifyAll();
                while (!this.f13893b && !this.f13895d && !this.f13907p && m19642a()) {
                    try {
                        GLTextureView.f13863k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m19645g() {
            synchronized (GLTextureView.f13863k) {
                this.f13892a = true;
                GLTextureView.f13863k.notifyAll();
                while (!this.f13893b) {
                    try {
                        GLTextureView.f13863k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m19646h() {
            this.f13902k = true;
            GLTextureView.f13863k.notifyAll();
        }

        /* JADX INFO: renamed from: i */
        public void m19647i() {
            synchronized (GLTextureView.f13863k) {
                this.f13906o = true;
                GLTextureView.f13863k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m19648j(int i) {
            if (i < 0 || i > 1) {
                wg3.m206174a("renderMode");
                return;
            }
            synchronized (GLTextureView.f13863k) {
                this.f13905n = i;
                GLTextureView.f13863k.notifyAll();
            }
        }

        /* JADX INFO: renamed from: m */
        public void m19649m() {
            synchronized (GLTextureView.f13863k) {
                this.f13896e = true;
                this.f13901j = false;
                GLTextureView.f13863k.notifyAll();
                while (this.f13898g && !this.f13901j && !this.f13893b) {
                    try {
                        GLTextureView.f13863k.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m19650n() {
            synchronized (GLTextureView.f13863k) {
                this.f13896e = false;
                GLTextureView.f13863k.notifyAll();
                while (!this.f13898g && !this.f13893b) {
                    try {
                        GLTextureView.f13863k.wait();
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
                m19638d();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.f13863k.m19656f(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$k */
    public static class C3976k {

        /* JADX INFO: renamed from: a */
        private boolean f13912a;

        /* JADX INFO: renamed from: b */
        private int f13913b;

        /* JADX INFO: renamed from: c */
        private boolean f13914c;

        /* JADX INFO: renamed from: d */
        private boolean f13915d;

        /* JADX INFO: renamed from: e */
        private boolean f13916e;

        /* JADX INFO: renamed from: f */
        private C3975j f13917f;

        private C3976k() {
        }

        /* JADX INFO: renamed from: b */
        private void m19651b() {
            if (this.f13912a) {
                return;
            }
            this.f13915d = true;
            this.f13912a = true;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m19652a(GL10 gl10) {
            try {
                if (!this.f13914c) {
                    m19651b();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f13913b < 131072) {
                        this.f13915d = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f13916e = !this.f13915d;
                    this.f13914c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m19653c(C3975j c3975j) {
            if (this.f13917f == c3975j) {
                this.f13917f = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m19654d() {
            return this.f13916e;
        }

        /* JADX INFO: renamed from: e */
        public synchronized boolean m19655e() {
            m19651b();
            return !this.f13915d;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m19656f(C3975j c3975j) {
            try {
                c3975j.f13893b = true;
                if (this.f13917f == c3975j) {
                    this.f13917f = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: g */
        public boolean m19657g(C3975j c3975j) {
            C3975j c3975j2 = this.f13917f;
            if (c3975j2 == c3975j || c3975j2 == null) {
                this.f13917f = c3975j;
                notifyAll();
                return true;
            }
            m19651b();
            if (this.f13915d) {
                return true;
            }
            C3975j c3975j3 = this.f13917f;
            if (c3975j3 == null) {
                return false;
            }
            c3975j3.m19646h();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$l */
    public interface InterfaceC3977l {
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$m */
    public static class C3978m extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f13918a = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private void m19658k() {
            if (this.f13918a.length() > 0) {
                this.f13918a.toString();
                StringBuilder sb = this.f13918a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m19658k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m19658k();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m19658k();
                } else {
                    this.f13918a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.media.momofilter.GLTextureView$n */
    public class C3979n extends C3968c {
        public C3979n(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f13864a = new WeakReference<>(this);
        m19621k();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC3977l m19616f(GLTextureView gLTextureView) {
        gLTextureView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: j */
    private void m19620j() {
        if (this.f13865b == null) {
            return;
        }
        wtq0.m207906a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: k */
    private void m19621k() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            C3975j c3975j = this.f13865b;
            if (c3975j != null) {
                c3975j.m19645g();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f13871h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f13873j;
    }

    public int getRenderMode() {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            return c3975j.m19643c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m19622l() {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19647i();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13867d && this.f13866c != null) {
            C3975j c3975j = this.f13865b;
            int iM19643c = c3975j != null ? c3975j.m19643c() : 1;
            C3975j c3975j2 = new C3975j(this.f13864a);
            this.f13865b = c3975j2;
            if (iM19643c != 1) {
                c3975j2.m19648j(iM19643c);
            }
            this.f13865b.start();
        }
        this.f13867d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19645g();
        }
        this.f13867d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19644e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19649m();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C3975j c3975j = this.f13865b;
        if (c3975j == null) {
            return true;
        }
        c3975j.m19650n();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19644e(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C3975j c3975j = this.f13865b;
        if (c3975j == null || c3975j.m19643c() == 0) {
            return;
        }
        m19622l();
    }

    public void setDebugFlags(int i) {
        this.f13871h = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C3979n(z));
    }

    public void setEGLContextClientVersion(int i) {
        m19620j();
        this.f13872i = i;
    }

    public void setEGLContextFactory(InterfaceC3972g interfaceC3972g) {
        m19620j();
        this.f13869f = interfaceC3972g;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC3973h interfaceC3973h) {
        m19620j();
        this.f13870g = interfaceC3973h;
    }

    public void setGLWrapper(InterfaceC3977l interfaceC3977l) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f13873j = z;
    }

    public void setRenderMode(int i) {
        C3975j c3975j = this.f13865b;
        if (c3975j != null) {
            c3975j.m19648j(i);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m19620j();
        if (this.f13868e == null) {
            this.f13868e = new C3979n(true);
        }
        if (this.f13869f == null) {
            this.f13869f = new C3969d();
        }
        if (this.f13870g == null) {
            this.f13870g = new C3970e();
        }
        this.f13866c = renderer;
        C3975j c3975j = new C3975j(this.f13864a);
        this.f13865b = c3975j;
        c3975j.start();
    }

    public void setEGLConfigChooser(InterfaceC3971f interfaceC3971f) {
        m19620j();
        this.f13868e = interfaceC3971f;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13864a = new WeakReference<>(this);
        m19621k();
    }
}
