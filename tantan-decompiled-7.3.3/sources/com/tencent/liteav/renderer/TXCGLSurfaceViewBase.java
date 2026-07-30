package com.tencent.liteav.renderer;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.liteav.basic.log.TXCLog;
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

/* JADX INFO: loaded from: classes2.dex */
public class TXCGLSurfaceViewBase extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    private static final C14340j f60501a = new C14340j();

    /* JADX INFO: renamed from: b */
    protected boolean f60502b;

    /* JADX INFO: renamed from: c */
    protected boolean f60503c;

    /* JADX INFO: renamed from: d */
    protected final WeakReference<TXCGLSurfaceViewBase> f60504d;

    /* JADX INFO: renamed from: e */
    protected boolean f60505e;

    /* JADX INFO: renamed from: f */
    protected boolean f60506f;

    /* JADX INFO: renamed from: g */
    private C14339i f60507g;

    /* JADX INFO: renamed from: h */
    private GLSurfaceView.Renderer f60508h;

    /* JADX INFO: renamed from: i */
    private boolean f60509i;

    /* JADX INFO: renamed from: j */
    private InterfaceC14335e f60510j;

    /* JADX INFO: renamed from: k */
    private InterfaceC14336f f60511k;

    /* JADX INFO: renamed from: l */
    private InterfaceC14337g f60512l;

    /* JADX INFO: renamed from: m */
    private InterfaceC14341k f60513m;

    /* JADX INFO: renamed from: n */
    private int f60514n;

    /* JADX INFO: renamed from: o */
    private int f60515o;

    /* JADX INFO: renamed from: p */
    private boolean f60516p;

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$e */
    public interface InterfaceC14335e {
        /* JADX INFO: renamed from: a */
        EGLConfig mo84984a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$f */
    public interface InterfaceC14336f {
        /* JADX INFO: renamed from: a */
        EGLContext mo84987a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* JADX INFO: renamed from: a */
        void mo84988a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$g */
    public interface InterfaceC14337g {
        /* JADX INFO: renamed from: a */
        EGLSurface mo84989a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* JADX INFO: renamed from: a */
        void mo84990a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$k */
    public interface InterfaceC14341k {
        /* JADX INFO: renamed from: a */
        GL m85028a(GL gl);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$l */
    public static class C14342l extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f60565a = new StringBuilder();

        /* JADX INFO: renamed from: a */
        private void m85029a() {
            if (this.f60565a.length() > 0) {
                TXCLog.m84154v("TXCGLSurfaceViewBase", this.f60565a.toString());
                StringBuilder sb = this.f60565a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m85029a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m85029a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m85029a();
                } else {
                    this.f60565a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$m */
    public class C14343m extends C14332b {
        public C14343m(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public TXCGLSurfaceViewBase(Context context) {
        super(context);
        this.f60502b = false;
        this.f60503c = false;
        this.f60504d = new WeakReference<>(this);
        m84968a();
    }

    /* JADX INFO: renamed from: g */
    private void m84977g() {
        if (this.f60507g == null) {
            return;
        }
        wtq0.m207906a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: a */
    public void m84979a(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new C14332b(i, i2, i3, i4, i5, i6));
    }

    /* JADX INFO: renamed from: b */
    public void m84980b(boolean z) {
        this.f60502b = z;
        if (z || !this.f60503c || this.f60507g == null) {
            return;
        }
        TXCLog.m84156w("TXCGLSurfaceViewBase", "background capture destroy surface when not enable background run");
        this.f60507g.m85011a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.mo84965b();
            }
        });
        this.f60507g.m85018g();
    }

    /* JADX INFO: renamed from: d */
    public boolean m84981d() {
        return this.f60507g.m85012a();
    }

    /* JADX INFO: renamed from: e */
    public int m84982e() {
        return this.f60507g.m85013b();
    }

    public void finalize() throws Throwable {
        try {
            C14339i c14339i = this.f60507g;
            if (c14339i != null) {
                c14339i.m85019h();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f60514n;
    }

    public C14338h getEGLHelper() {
        return this.f60507g.m85014c();
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f60516p;
    }

    public int getRenderMode() {
        return this.f60507g.m85016e();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60509i && this.f60508h != null) {
            C14339i c14339i = this.f60507g;
            int iM85016e = c14339i != null ? c14339i.m85016e() : 1;
            C14339i c14339i2 = new C14339i(this.f60504d);
            this.f60507g = c14339i2;
            if (iM85016e != 1) {
                c14339i2.m85009a(iM85016e);
            }
            this.f60507g.start();
        }
        this.f60509i = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f60502b && this.f60507g != null) {
            TXCLog.m84156w("TXCGLSurfaceViewBase", "background capture destroy surface when onDetachedFromWindow");
            this.f60507g.m85011a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.3
                @Override // java.lang.Runnable
                public void run() {
                    TXCGLSurfaceViewBase.this.mo84965b();
                }
            });
            this.f60507g.m85018g();
        }
        C14339i c14339i = this.f60507g;
        if (c14339i != null) {
            c14339i.m85019h();
        }
        this.f60509i = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i) {
        this.f60514n = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C14343m(z));
    }

    public void setEGLContextClientVersion(int i) {
        m84977g();
        this.f60515o = i;
    }

    public void setEGLContextFactory(InterfaceC14336f interfaceC14336f) {
        m84977g();
        this.f60511k = interfaceC14336f;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC14337g interfaceC14337g) {
        m84977g();
        this.f60512l = interfaceC14337g;
    }

    public void setGLWrapper(InterfaceC14341k interfaceC14341k) {
        this.f60513m = interfaceC14341k;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f60516p = z;
    }

    public void setRenderMode(int i) {
        this.f60507g.m85009a(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m84977g();
        if (this.f60510j == null) {
            this.f60510j = new C14343m(true);
        }
        if (this.f60511k == null) {
            this.f60511k = new C14333c();
        }
        if (this.f60512l == null) {
            this.f60512l = new C14334d();
        }
        this.f60508h = renderer;
        C14339i c14339i = new C14339i(this.f60504d);
        this.f60507g = c14339i;
        c14339i.start();
        TXCLog.m84152i("TXCGLSurfaceViewBase", "setRenderer-->mGLThread.start");
    }

    public void setRunInBackground(boolean z) {
        this.f60503c = z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f60507g.m85010a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f60507g.m85017f();
        setRunInBackground(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        setRunInBackground(true);
        if (this.f60502b) {
            return;
        }
        this.f60507g.m85011a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.mo84965b();
            }
        });
        this.f60507g.m85018g();
    }

    /* JADX INFO: renamed from: c */
    public int mo84967c() {
        return 0;
    }

    public void setEGLConfigChooser(InterfaceC14335e interfaceC14335e) {
        m84977g();
        this.f60510j = interfaceC14335e;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$j */
    public static class C14340j {

        /* JADX INFO: renamed from: a */
        private static String f60558a = "GLThreadManager";

        /* JADX INFO: renamed from: b */
        private boolean f60559b;

        /* JADX INFO: renamed from: c */
        private int f60560c;

        /* JADX INFO: renamed from: d */
        private boolean f60561d;

        /* JADX INFO: renamed from: e */
        private boolean f60562e;

        /* JADX INFO: renamed from: f */
        private boolean f60563f;

        /* JADX INFO: renamed from: g */
        private C14339i f60564g;

        private C14340j() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m85023a(GL10 gl10) {
            try {
                if (!this.f60561d) {
                    m85021c();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f60560c < 131072) {
                        this.f60562e = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f60563f = !this.f60562e;
                    this.f60561d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m85026b(C14339i c14339i) {
            C14339i c14339i2 = this.f60564g;
            if (c14339i2 == c14339i || c14339i2 == null) {
                this.f60564g = c14339i;
                notifyAll();
                return true;
            }
            m85021c();
            if (this.f60562e) {
                return true;
            }
            C14339i c14339i3 = this.f60564g;
            if (c14339i3 == null) {
                return false;
            }
            c14339i3.m85020i();
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m85027c(C14339i c14339i) {
            if (this.f60564g == c14339i) {
                this.f60564g = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: c */
        private void m85021c() {
            this.f60560c = 131072;
            this.f60562e = true;
            this.f60559b = true;
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m85025b() {
            m85021c();
            return !this.f60562e;
        }

        /* JADX INFO: renamed from: a */
        public synchronized boolean m85024a() {
            return this.f60563f;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m85022a(C14339i c14339i) {
            try {
                c14339i.f60539b = true;
                if (this.f60564g == c14339i) {
                    this.f60564g = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84968a() {
        getHolder().addCallback(this);
    }

    public TXCGLSurfaceViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60502b = false;
        this.f60503c = false;
        this.f60504d = new WeakReference<>(this);
        m84968a();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$d */
    public static class C14334d implements InterfaceC14337g {
        private C14334d() {
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14337g
        /* JADX INFO: renamed from: a */
        public EGLSurface mo84989a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                TXCLog.m84149e("TXCGLSurfaceViewBase", "eglCreateWindowSurface");
                TXCLog.m84149e("TXCGLSurfaceViewBase", e.toString());
                return null;
            }
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14337g
        /* JADX INFO: renamed from: a */
        public void mo84990a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo84965b() {
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$c */
    public class C14333c implements InterfaceC14336f {

        /* JADX INFO: renamed from: b */
        private int f60531b;

        private C14333c() {
            this.f60531b = 12440;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14336f
        /* JADX INFO: renamed from: a */
        public void mo84988a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            TXCLog.m84149e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C14338h.m84992a("eglDestroyContex", egl10.eglGetError());
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14336f
        /* JADX INFO: renamed from: a */
        public EGLContext mo84987a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f60531b, TXCGLSurfaceViewBase.this.f60515o, 12344};
            if (TXCGLSurfaceViewBase.this.f60515o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$a */
    public abstract class AbstractC14331a implements InterfaceC14335e {

        /* JADX INFO: renamed from: a */
        protected int[] f60520a;

        public AbstractC14331a(int[] iArr) {
            this.f60520a = m84983a(iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14335e
        /* JADX INFO: renamed from: a */
        public EGLConfig mo84984a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f60520a, null, 0, iArr)) {
                wg3.m206174a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f60520a, eGLConfigArr, i, iArr)) {
                wg3.m206174a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo84985a = mo84985a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo84985a != null) {
                return eGLConfigMo84985a;
            }
            wg3.m206174a("No config chosen");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo84985a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* JADX INFO: renamed from: a */
        private int[] m84983a(int[] iArr) {
            if (TXCGLSurfaceViewBase.this.f60515o != 2) {
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
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$i */
    public static class C14339i extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f60538a;

        /* JADX INFO: renamed from: b */
        private boolean f60539b;

        /* JADX INFO: renamed from: c */
        private boolean f60540c;

        /* JADX INFO: renamed from: d */
        private boolean f60541d;

        /* JADX INFO: renamed from: e */
        private boolean f60542e;

        /* JADX INFO: renamed from: f */
        private boolean f60543f;

        /* JADX INFO: renamed from: g */
        private boolean f60544g;

        /* JADX INFO: renamed from: h */
        private boolean f60545h;

        /* JADX INFO: renamed from: i */
        private boolean f60546i;

        /* JADX INFO: renamed from: j */
        private boolean f60547j;

        /* JADX INFO: renamed from: k */
        private boolean f60548k;

        /* JADX INFO: renamed from: p */
        private boolean f60553p;

        /* JADX INFO: renamed from: s */
        private C14338h f60556s;

        /* JADX INFO: renamed from: t */
        private WeakReference<TXCGLSurfaceViewBase> f60557t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f60554q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f60555r = true;

        /* JADX INFO: renamed from: l */
        private int f60549l = 0;

        /* JADX INFO: renamed from: m */
        private int f60550m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f60552o = true;

        /* JADX INFO: renamed from: n */
        private int f60551n = 1;

        public C14339i(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f60557t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:166:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: j */
        private void m85005j() throws InterruptedException {
            boolean z;
            int iMo84967c;
            boolean z2;
            boolean z3;
            this.f60556s = new C14338h(this.f60557t);
            this.f60545h = false;
            this.f60546i = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            int i = 0;
            int i2 = 0;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (TXCGLSurfaceViewBase.f60501a) {
                            while (true) {
                                if (this.f60538a) {
                                    synchronized (TXCGLSurfaceViewBase.f60501a) {
                                        m85006k();
                                        m85007l();
                                    }
                                    return;
                                }
                                if (!this.f60554q.isEmpty()) {
                                    runnableRemove = this.f60554q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z12 = this.f60541d;
                                boolean z13 = this.f60540c;
                                if (z12 != z13) {
                                    this.f60541d = z13;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                } else {
                                    z13 = false;
                                }
                                if (this.f60548k) {
                                    m85006k();
                                    m85007l();
                                    this.f60548k = false;
                                    z6 = true;
                                }
                                if (z4) {
                                    m85006k();
                                    m85007l();
                                    z3 = false;
                                } else {
                                    z3 = z4;
                                }
                                if (z13 && this.f60546i) {
                                    m85006k();
                                }
                                if (z13 && this.f60545h) {
                                    TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60557t.get();
                                    if (!(tXCGLSurfaceViewBase == null ? false : tXCGLSurfaceViewBase.f60516p) || TXCGLSurfaceViewBase.f60501a.m85024a()) {
                                        m85007l();
                                    }
                                }
                                if (z13 && TXCGLSurfaceViewBase.f60501a.m85025b()) {
                                    this.f60556s.m85003h();
                                }
                                if (!this.f60542e && !this.f60544g) {
                                    if (this.f60546i) {
                                        m85006k();
                                    }
                                    this.f60544g = true;
                                    this.f60543f = false;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                }
                                if (this.f60542e && this.f60544g) {
                                    this.f60544g = false;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                }
                                if (z5) {
                                    this.f60553p = true;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                    z5 = false;
                                    z11 = false;
                                }
                                if (m85008m()) {
                                    if (!this.f60545h) {
                                        if (z6) {
                                            z6 = false;
                                        } else if (TXCGLSurfaceViewBase.f60501a.m85026b(this)) {
                                            try {
                                                this.f60556s.m84996a();
                                            } catch (RuntimeException e) {
                                                TXCGLSurfaceViewBase.f60501a.m85027c(this);
                                                TXCLog.m84150e("TXCGLSurfaceViewBase", "egl start error ", e);
                                            }
                                            this.f60545h = true;
                                            TXCGLSurfaceViewBase.f60501a.notifyAll();
                                            z7 = true;
                                        }
                                    }
                                    if (this.f60545h && !this.f60546i) {
                                        this.f60546i = true;
                                        z8 = true;
                                        z9 = true;
                                        z10 = true;
                                    }
                                    if (this.f60546i) {
                                        if (this.f60555r) {
                                            i = this.f60549l;
                                            i2 = this.f60550m;
                                            z = false;
                                            this.f60555r = false;
                                            z8 = true;
                                            z10 = true;
                                            z11 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f60552o = z;
                                        TXCGLSurfaceViewBase.f60501a.notifyAll();
                                        z4 = z3;
                                        break;
                                    }
                                }
                                TXCGLSurfaceViewBase.f60501a.wait();
                                z4 = z3;
                                throw th;
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z8) {
                            if (this.f60556s.m84997b()) {
                                synchronized (TXCGLSurfaceViewBase.f60501a) {
                                    this.f60547j = true;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                }
                                z8 = z;
                            } else {
                                synchronized (TXCGLSurfaceViewBase.f60501a) {
                                    this.f60547j = true;
                                    this.f60543f = true;
                                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                                }
                            }
                            synchronized (TXCGLSurfaceViewBase.f60501a) {
                                m85006k();
                                m85007l();
                                throw th;
                            }
                        }
                        if (z9) {
                            GL10 gl11 = (GL10) this.f60556s.m85000e();
                            TXCGLSurfaceViewBase.f60501a.m85023a(gl11);
                            z9 = z;
                            gl10 = gl11;
                        }
                        if (z7) {
                            TXCGLSurfaceViewBase tXCGLSurfaceViewBase2 = this.f60557t.get();
                            if (tXCGLSurfaceViewBase2 != null) {
                                tXCGLSurfaceViewBase2.f60508h.onSurfaceCreated(gl10, this.f60556s.f60535d);
                            }
                            z7 = z;
                        }
                        if (z10) {
                            TXCGLSurfaceViewBase tXCGLSurfaceViewBase3 = this.f60557t.get();
                            if (tXCGLSurfaceViewBase3 != null) {
                                tXCGLSurfaceViewBase3.f60508h.onSurfaceChanged(gl10, i, i2);
                            }
                            z10 = z;
                        }
                        TXCGLSurfaceViewBase tXCGLSurfaceViewBase4 = this.f60557t.get();
                        if (tXCGLSurfaceViewBase4 != null) {
                            tXCGLSurfaceViewBase4.f60508h.onDrawFrame(gl10);
                            iMo84967c = tXCGLSurfaceViewBase4.mo84967c();
                        } else {
                            iMo84967c = 12288;
                        }
                        if (iMo84967c == 12288) {
                            z2 = true;
                        } else if (iMo84967c != 12302) {
                            C14338h.m84993a("GLThread", "eglSwapBuffers", iMo84967c);
                            synchronized (TXCGLSurfaceViewBase.f60501a) {
                                z2 = true;
                                this.f60543f = true;
                                TXCGLSurfaceViewBase.f60501a.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z4 = true;
                        }
                        if (z11) {
                            z5 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (TXCGLSurfaceViewBase.f60501a) {
                            m85006k();
                            m85007l();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: k */
        private void m85006k() {
            if (this.f60546i) {
                this.f60546i = false;
                this.f60556s.m85002g();
            }
        }

        /* JADX INFO: renamed from: l */
        private void m85007l() {
            if (this.f60545h) {
                this.f60556s.m85003h();
                this.f60545h = false;
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60557t.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f60506f = false;
                }
                TXCGLSurfaceViewBase.f60501a.m85027c(this);
            }
        }

        /* JADX INFO: renamed from: m */
        private boolean m85008m() {
            if (this.f60541d || !this.f60542e || this.f60543f || this.f60549l <= 0 || this.f60550m <= 0) {
                return false;
            }
            return this.f60552o || this.f60551n == 1;
        }

        /* JADX INFO: renamed from: a */
        public void m85010a(int i, int i2) {
            synchronized (TXCGLSurfaceViewBase.f60501a) {
                this.f60549l = i;
                this.f60550m = i2;
                this.f60555r = true;
                this.f60552o = true;
                this.f60553p = false;
                TXCGLSurfaceViewBase.f60501a.notifyAll();
                while (!this.f60539b && !this.f60541d && !this.f60553p && m85015d()) {
                    try {
                        TXCGLSurfaceViewBase.f60501a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public int m85013b() {
            return this.f60556s.m84999d();
        }

        /* JADX INFO: renamed from: c */
        public C14338h m85014c() {
            return this.f60556s;
        }

        /* JADX INFO: renamed from: d */
        public boolean m85015d() {
            return this.f60545h && this.f60546i && m85008m();
        }

        /* JADX INFO: renamed from: e */
        public int m85016e() {
            int i;
            synchronized (TXCGLSurfaceViewBase.f60501a) {
                i = this.f60551n;
            }
            return i;
        }

        /* JADX INFO: renamed from: f */
        public void m85017f() {
            synchronized (TXCGLSurfaceViewBase.f60501a) {
                this.f60542e = true;
                this.f60547j = false;
                TXCGLSurfaceViewBase.f60501a.notifyAll();
                while (this.f60544g && !this.f60547j && !this.f60539b) {
                    try {
                        TXCGLSurfaceViewBase.f60501a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m85018g() {
            synchronized (TXCGLSurfaceViewBase.f60501a) {
                this.f60542e = false;
                TXCGLSurfaceViewBase.f60501a.notifyAll();
                while (!this.f60544g && !this.f60539b) {
                    try {
                        TXCGLSurfaceViewBase.f60501a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m85019h() {
            synchronized (TXCGLSurfaceViewBase.f60501a) {
                this.f60538a = true;
                TXCGLSurfaceViewBase.f60501a.notifyAll();
                while (!this.f60539b) {
                    try {
                        TXCGLSurfaceViewBase.f60501a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m85020i() {
            this.f60548k = true;
            TXCGLSurfaceViewBase.f60501a.notifyAll();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                m85005j();
            } catch (InterruptedException unused) {
            } finally {
                TXCGLSurfaceViewBase.f60501a.m85022a(this);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m85012a() {
            return this.f60556s.m84998c();
        }

        /* JADX INFO: renamed from: a */
        public void m85009a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (TXCGLSurfaceViewBase.f60501a) {
                    this.f60551n = i;
                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                }
                return;
            }
            wg3.m206174a("renderMode");
        }

        /* JADX INFO: renamed from: a */
        public void m85011a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TXCGLSurfaceViewBase.f60501a) {
                    this.f60554q.add(runnable);
                    TXCGLSurfaceViewBase.f60501a.notifyAll();
                }
                return;
            }
            wg3.m206174a("r must not be null");
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$b */
    public class C14332b extends AbstractC14331a {

        /* JADX INFO: renamed from: c */
        protected int f60522c;

        /* JADX INFO: renamed from: d */
        protected int f60523d;

        /* JADX INFO: renamed from: e */
        protected int f60524e;

        /* JADX INFO: renamed from: f */
        protected int f60525f;

        /* JADX INFO: renamed from: g */
        protected int f60526g;

        /* JADX INFO: renamed from: h */
        protected int f60527h;

        /* JADX INFO: renamed from: j */
        private int[] f60529j;

        public C14332b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f60529j = new int[1];
            this.f60522c = i;
            this.f60523d = i2;
            this.f60524e = i3;
            this.f60525f = i4;
            this.f60526g = i5;
            this.f60527h = i6;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.AbstractC14331a
        /* JADX INFO: renamed from: a */
        public EGLConfig mo84985a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C14332b c14332b = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM84986a = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM84986a2 = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM84986a >= c14332b.f60526g && iM84986a2 >= c14332b.f60527h) {
                    int iM84986a3 = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM84986a4 = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM84986a5 = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM84986a6 = c14332b.m84986a(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM84986a3 == c14332b.f60522c && iM84986a4 == c14332b.f60523d && iM84986a5 == c14332b.f60524e && iM84986a6 == c14332b.f60525f) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c14332b;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private int m84986a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f60529j) ? this.f60529j[0] : i2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$h */
    public static class C14338h {

        /* JADX INFO: renamed from: a */
        EGL10 f60532a;

        /* JADX INFO: renamed from: b */
        EGLDisplay f60533b;

        /* JADX INFO: renamed from: c */
        EGLSurface f60534c;

        /* JADX INFO: renamed from: d */
        EGLConfig f60535d;

        /* JADX INFO: renamed from: e */
        EGLContext f60536e;

        /* JADX INFO: renamed from: f */
        private WeakReference<TXCGLSurfaceViewBase> f60537f;

        public C14338h(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f60537f = weakReference;
        }

        /* JADX INFO: renamed from: i */
        private void m84995i() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f60534c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f60532a.eglMakeCurrent(this.f60533b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60537f.get();
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f60512l.mo84990a(this.f60532a, this.f60533b, this.f60534c);
                tXCGLSurfaceViewBase.f60505e = false;
            }
            this.f60534c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m84996a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f60532a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f60533b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                azk0.m101074a("eglGetDisplay failed");
                return;
            }
            if (!this.f60532a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                azk0.m101074a("eglInitialize failed");
                return;
            }
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60537f.get();
            if (tXCGLSurfaceViewBase == null) {
                this.f60535d = null;
                this.f60536e = null;
                TXCLog.m84156w("TXCGLSurfaceViewBase", "start() error when view is null ");
            } else {
                this.f60535d = tXCGLSurfaceViewBase.f60510j.mo84984a(this.f60532a, this.f60533b);
                this.f60536e = tXCGLSurfaceViewBase.f60511k.mo84987a(this.f60532a, this.f60533b, this.f60535d);
            }
            EGLContext eGLContext = this.f60536e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f60536e = null;
                m84991a("createContext");
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f60506f = true;
            }
            this.f60534c = null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m84997b() {
            if (this.f60532a == null) {
                azk0.m101074a("egl not initialized");
                return false;
            }
            if (this.f60533b == null) {
                azk0.m101074a("eglDisplay not initialized");
                return false;
            }
            if (this.f60535d == null) {
                azk0.m101074a("mEglConfig not initialized");
                return false;
            }
            m84995i();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60537f.get();
            if (tXCGLSurfaceViewBase != null) {
                this.f60534c = tXCGLSurfaceViewBase.f60512l.mo84989a(this.f60532a, this.f60533b, this.f60535d, tXCGLSurfaceViewBase.getHolder());
            } else {
                this.f60534c = null;
            }
            EGLSurface eGLSurface = this.f60534c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f60532a.eglGetError() == 12299) {
                    TXCLog.m84149e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (!this.f60532a.eglMakeCurrent(this.f60533b, eGLSurface, eGLSurface, this.f60536e)) {
                m84993a("EGLHelper", "eglMakeCurrent", this.f60532a.eglGetError());
                return false;
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f60505e = true;
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m84998c() {
            EGL10 egl10 = this.f60532a;
            EGLDisplay eGLDisplay = this.f60533b;
            EGLSurface eGLSurface = this.f60534c;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f60536e)) {
                return true;
            }
            m84993a("EGLHelper", "eglMakeCurrent", this.f60532a.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: d */
        public int m84999d() {
            return m85001f();
        }

        /* JADX INFO: renamed from: e */
        public GL m85000e() {
            GL gl = this.f60536e.getGL();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60537f.get();
            if (tXCGLSurfaceViewBase != null) {
                if (tXCGLSurfaceViewBase.f60513m != null) {
                    gl = tXCGLSurfaceViewBase.f60513m.m85028a(gl);
                }
                if ((tXCGLSurfaceViewBase.f60514n & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (tXCGLSurfaceViewBase.f60514n & 1) == 0 ? 0 : 1, (tXCGLSurfaceViewBase.f60514n & 2) != 0 ? new C14342l() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: f */
        public int m85001f() {
            return !this.f60532a.eglSwapBuffers(this.f60533b, this.f60534c) ? this.f60532a.eglGetError() : CommandMessage.COMMAND_BASE;
        }

        /* JADX INFO: renamed from: g */
        public void m85002g() {
            m84995i();
        }

        /* JADX INFO: renamed from: h */
        public void m85003h() {
            if (this.f60536e != null) {
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f60537f.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f60511k.mo84988a(this.f60532a, this.f60533b, this.f60536e);
                }
                this.f60536e = null;
            }
            EGLDisplay eGLDisplay = this.f60533b;
            if (eGLDisplay != null) {
                this.f60532a.eglTerminate(eGLDisplay);
                this.f60533b = null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m84991a(String str) {
            m84992a(str, this.f60532a.eglGetError());
        }

        /* JADX INFO: renamed from: a */
        public static void m84992a(String str, int i) {
            throw new RuntimeException(m84994b(str, i));
        }

        /* JADX INFO: renamed from: a */
        public static void m84993a(String str, String str2, int i) {
            TXCLog.m84156w(str, m84994b(str2, i));
        }

        /* JADX INFO: renamed from: b */
        public static String m84994b(String str, int i) {
            return str + " failed: " + i;
        }
    }
}
