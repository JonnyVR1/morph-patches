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
import p149l.ig3;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGLSurfaceViewBase extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    private static final C14177j f59653a = new C14177j();

    /* JADX INFO: renamed from: b */
    protected boolean f59654b;

    /* JADX INFO: renamed from: c */
    protected boolean f59655c;

    /* JADX INFO: renamed from: d */
    protected final WeakReference<TXCGLSurfaceViewBase> f59656d;

    /* JADX INFO: renamed from: e */
    protected boolean f59657e;

    /* JADX INFO: renamed from: f */
    protected boolean f59658f;

    /* JADX INFO: renamed from: g */
    private C14176i f59659g;

    /* JADX INFO: renamed from: h */
    private GLSurfaceView.Renderer f59660h;

    /* JADX INFO: renamed from: i */
    private boolean f59661i;

    /* JADX INFO: renamed from: j */
    private InterfaceC14172e f59662j;

    /* JADX INFO: renamed from: k */
    private InterfaceC14173f f59663k;

    /* JADX INFO: renamed from: l */
    private InterfaceC14174g f59664l;

    /* JADX INFO: renamed from: m */
    private InterfaceC14178k f59665m;

    /* JADX INFO: renamed from: n */
    private int f59666n;

    /* JADX INFO: renamed from: o */
    private int f59667o;

    /* JADX INFO: renamed from: p */
    private boolean f59668p;

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$e */
    public interface InterfaceC14172e {
        /* JADX INFO: renamed from: a */
        EGLConfig mo83801a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$f */
    public interface InterfaceC14173f {
        /* JADX INFO: renamed from: a */
        EGLContext mo83804a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* JADX INFO: renamed from: a */
        void mo83805a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$g */
    public interface InterfaceC14174g {
        /* JADX INFO: renamed from: a */
        EGLSurface mo83806a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* JADX INFO: renamed from: a */
        void mo83807a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$k */
    public interface InterfaceC14178k {
        /* JADX INFO: renamed from: a */
        GL m83845a(GL gl);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$l */
    public static class C14179l extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f59717a = new StringBuilder();

        /* JADX INFO: renamed from: a */
        private void m83846a() {
            if (this.f59717a.length() > 0) {
                TXCLog.m82971v("TXCGLSurfaceViewBase", this.f59717a.toString());
                StringBuilder sb = this.f59717a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m83846a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m83846a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m83846a();
                } else {
                    this.f59717a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$m */
    public class C14180m extends C14169b {
        public C14180m(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public TXCGLSurfaceViewBase(Context context) {
        super(context);
        this.f59654b = false;
        this.f59655c = false;
        this.f59656d = new WeakReference<>(this);
        m83785a();
    }

    /* JADX INFO: renamed from: g */
    private void m83794g() {
        if (this.f59659g == null) {
            return;
        }
        qkq0.m175383a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: a */
    public void m83796a(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new C14169b(i, i2, i3, i4, i5, i6));
    }

    /* JADX INFO: renamed from: b */
    public void m83797b(boolean z) {
        this.f59654b = z;
        if (z || !this.f59655c || this.f59659g == null) {
            return;
        }
        TXCLog.m82973w("TXCGLSurfaceViewBase", "background capture destroy surface when not enable background run");
        this.f59659g.m83828a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.mo83782b();
            }
        });
        this.f59659g.m83835g();
    }

    /* JADX INFO: renamed from: d */
    public boolean m83798d() {
        return this.f59659g.m83829a();
    }

    /* JADX INFO: renamed from: e */
    public int m83799e() {
        return this.f59659g.m83830b();
    }

    public void finalize() throws Throwable {
        try {
            C14176i c14176i = this.f59659g;
            if (c14176i != null) {
                c14176i.m83836h();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f59666n;
    }

    public C14175h getEGLHelper() {
        return this.f59659g.m83831c();
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f59668p;
    }

    public int getRenderMode() {
        return this.f59659g.m83833e();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f59661i && this.f59660h != null) {
            C14176i c14176i = this.f59659g;
            int iM83833e = c14176i != null ? c14176i.m83833e() : 1;
            C14176i c14176i2 = new C14176i(this.f59656d);
            this.f59659g = c14176i2;
            if (iM83833e != 1) {
                c14176i2.m83826a(iM83833e);
            }
            this.f59659g.start();
        }
        this.f59661i = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f59654b && this.f59659g != null) {
            TXCLog.m82973w("TXCGLSurfaceViewBase", "background capture destroy surface when onDetachedFromWindow");
            this.f59659g.m83828a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.3
                @Override // java.lang.Runnable
                public void run() {
                    TXCGLSurfaceViewBase.this.mo83782b();
                }
            });
            this.f59659g.m83835g();
        }
        C14176i c14176i = this.f59659g;
        if (c14176i != null) {
            c14176i.m83836h();
        }
        this.f59661i = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i) {
        this.f59666n = i;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C14180m(z));
    }

    public void setEGLContextClientVersion(int i) {
        m83794g();
        this.f59667o = i;
    }

    public void setEGLContextFactory(InterfaceC14173f interfaceC14173f) {
        m83794g();
        this.f59663k = interfaceC14173f;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC14174g interfaceC14174g) {
        m83794g();
        this.f59664l = interfaceC14174g;
    }

    public void setGLWrapper(InterfaceC14178k interfaceC14178k) {
        this.f59665m = interfaceC14178k;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f59668p = z;
    }

    public void setRenderMode(int i) {
        this.f59659g.m83826a(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m83794g();
        if (this.f59662j == null) {
            this.f59662j = new C14180m(true);
        }
        if (this.f59663k == null) {
            this.f59663k = new C14170c();
        }
        if (this.f59664l == null) {
            this.f59664l = new C14171d();
        }
        this.f59660h = renderer;
        C14176i c14176i = new C14176i(this.f59656d);
        this.f59659g = c14176i;
        c14176i.start();
        TXCLog.m82969i("TXCGLSurfaceViewBase", "setRenderer-->mGLThread.start");
    }

    public void setRunInBackground(boolean z) {
        this.f59655c = z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f59659g.m83827a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f59659g.m83834f();
        setRunInBackground(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        setRunInBackground(true);
        if (this.f59654b) {
            return;
        }
        this.f59659g.m83828a(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceViewBase.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceViewBase.this.mo83782b();
            }
        });
        this.f59659g.m83835g();
    }

    /* JADX INFO: renamed from: c */
    public int mo83784c() {
        return 0;
    }

    public void setEGLConfigChooser(InterfaceC14172e interfaceC14172e) {
        m83794g();
        this.f59662j = interfaceC14172e;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$j */
    public static class C14177j {

        /* JADX INFO: renamed from: a */
        private static String f59710a = "GLThreadManager";

        /* JADX INFO: renamed from: b */
        private boolean f59711b;

        /* JADX INFO: renamed from: c */
        private int f59712c;

        /* JADX INFO: renamed from: d */
        private boolean f59713d;

        /* JADX INFO: renamed from: e */
        private boolean f59714e;

        /* JADX INFO: renamed from: f */
        private boolean f59715f;

        /* JADX INFO: renamed from: g */
        private C14176i f59716g;

        private C14177j() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m83840a(GL10 gl10) {
            try {
                if (!this.f59713d) {
                    m83838c();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.f59712c < 131072) {
                        this.f59714e = !strGlGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    this.f59715f = !this.f59714e;
                    this.f59713d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m83843b(C14176i c14176i) {
            C14176i c14176i2 = this.f59716g;
            if (c14176i2 == c14176i || c14176i2 == null) {
                this.f59716g = c14176i;
                notifyAll();
                return true;
            }
            m83838c();
            if (this.f59714e) {
                return true;
            }
            C14176i c14176i3 = this.f59716g;
            if (c14176i3 == null) {
                return false;
            }
            c14176i3.m83837i();
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void m83844c(C14176i c14176i) {
            if (this.f59716g == c14176i) {
                this.f59716g = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: c */
        private void m83838c() {
            this.f59712c = 131072;
            this.f59714e = true;
            this.f59711b = true;
        }

        /* JADX INFO: renamed from: b */
        public synchronized boolean m83842b() {
            m83838c();
            return !this.f59714e;
        }

        /* JADX INFO: renamed from: a */
        public synchronized boolean m83841a() {
            return this.f59715f;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m83839a(C14176i c14176i) {
            try {
                c14176i.f59691b = true;
                if (this.f59716g == c14176i) {
                    this.f59716g = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83785a() {
        getHolder().addCallback(this);
    }

    public TXCGLSurfaceViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59654b = false;
        this.f59655c = false;
        this.f59656d = new WeakReference<>(this);
        m83785a();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$d */
    public static class C14171d implements InterfaceC14174g {
        private C14171d() {
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14174g
        /* JADX INFO: renamed from: a */
        public EGLSurface mo83806a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                TXCLog.m82966e("TXCGLSurfaceViewBase", "eglCreateWindowSurface");
                TXCLog.m82966e("TXCGLSurfaceViewBase", e.toString());
                return null;
            }
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14174g
        /* JADX INFO: renamed from: a */
        public void mo83807a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo83782b() {
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$c */
    public class C14170c implements InterfaceC14173f {

        /* JADX INFO: renamed from: b */
        private int f59683b;

        private C14170c() {
            this.f59683b = 12440;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14173f
        /* JADX INFO: renamed from: a */
        public void mo83805a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            TXCLog.m82966e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            C14175h.m83809a("eglDestroyContex", egl10.eglGetError());
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14173f
        /* JADX INFO: renamed from: a */
        public EGLContext mo83804a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f59683b, TXCGLSurfaceViewBase.this.f59667o, 12344};
            if (TXCGLSurfaceViewBase.this.f59667o == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$a */
    public abstract class AbstractC14168a implements InterfaceC14172e {

        /* JADX INFO: renamed from: a */
        protected int[] f59672a;

        public AbstractC14168a(int[] iArr) {
            this.f59672a = m83800a(iArr);
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.InterfaceC14172e
        /* JADX INFO: renamed from: a */
        public EGLConfig mo83801a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f59672a, null, 0, iArr)) {
                ig3.m135964a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f59672a, eGLConfigArr, i, iArr)) {
                ig3.m135964a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo83802a = mo83802a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo83802a != null) {
                return eGLConfigMo83802a;
            }
            ig3.m135964a("No config chosen");
            return null;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo83802a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* JADX INFO: renamed from: a */
        private int[] m83800a(int[] iArr) {
            if (TXCGLSurfaceViewBase.this.f59667o != 2) {
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
    public static class C14176i extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f59690a;

        /* JADX INFO: renamed from: b */
        private boolean f59691b;

        /* JADX INFO: renamed from: c */
        private boolean f59692c;

        /* JADX INFO: renamed from: d */
        private boolean f59693d;

        /* JADX INFO: renamed from: e */
        private boolean f59694e;

        /* JADX INFO: renamed from: f */
        private boolean f59695f;

        /* JADX INFO: renamed from: g */
        private boolean f59696g;

        /* JADX INFO: renamed from: h */
        private boolean f59697h;

        /* JADX INFO: renamed from: i */
        private boolean f59698i;

        /* JADX INFO: renamed from: j */
        private boolean f59699j;

        /* JADX INFO: renamed from: k */
        private boolean f59700k;

        /* JADX INFO: renamed from: p */
        private boolean f59705p;

        /* JADX INFO: renamed from: s */
        private C14175h f59708s;

        /* JADX INFO: renamed from: t */
        private WeakReference<TXCGLSurfaceViewBase> f59709t;

        /* JADX INFO: renamed from: q */
        private ArrayList<Runnable> f59706q = new ArrayList<>();

        /* JADX INFO: renamed from: r */
        private boolean f59707r = true;

        /* JADX INFO: renamed from: l */
        private int f59701l = 0;

        /* JADX INFO: renamed from: m */
        private int f59702m = 0;

        /* JADX INFO: renamed from: o */
        private boolean f59704o = true;

        /* JADX INFO: renamed from: n */
        private int f59703n = 1;

        public C14176i(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f59709t = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:166:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: j */
        private void m83822j() throws InterruptedException {
            boolean z;
            int iMo83784c;
            boolean z2;
            boolean z3;
            this.f59708s = new C14175h(this.f59709t);
            this.f59697h = false;
            this.f59698i = false;
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
                        synchronized (TXCGLSurfaceViewBase.f59653a) {
                            while (true) {
                                if (this.f59690a) {
                                    synchronized (TXCGLSurfaceViewBase.f59653a) {
                                        m83823k();
                                        m83824l();
                                    }
                                    return;
                                }
                                if (!this.f59706q.isEmpty()) {
                                    runnableRemove = this.f59706q.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z12 = this.f59693d;
                                boolean z13 = this.f59692c;
                                if (z12 != z13) {
                                    this.f59693d = z13;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                } else {
                                    z13 = false;
                                }
                                if (this.f59700k) {
                                    m83823k();
                                    m83824l();
                                    this.f59700k = false;
                                    z6 = true;
                                }
                                if (z4) {
                                    m83823k();
                                    m83824l();
                                    z3 = false;
                                } else {
                                    z3 = z4;
                                }
                                if (z13 && this.f59698i) {
                                    m83823k();
                                }
                                if (z13 && this.f59697h) {
                                    TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59709t.get();
                                    if (!(tXCGLSurfaceViewBase == null ? false : tXCGLSurfaceViewBase.f59668p) || TXCGLSurfaceViewBase.f59653a.m83841a()) {
                                        m83824l();
                                    }
                                }
                                if (z13 && TXCGLSurfaceViewBase.f59653a.m83842b()) {
                                    this.f59708s.m83820h();
                                }
                                if (!this.f59694e && !this.f59696g) {
                                    if (this.f59698i) {
                                        m83823k();
                                    }
                                    this.f59696g = true;
                                    this.f59695f = false;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                }
                                if (this.f59694e && this.f59696g) {
                                    this.f59696g = false;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                }
                                if (z5) {
                                    this.f59705p = true;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                    z5 = false;
                                    z11 = false;
                                }
                                if (m83825m()) {
                                    if (!this.f59697h) {
                                        if (z6) {
                                            z6 = false;
                                        } else if (TXCGLSurfaceViewBase.f59653a.m83843b(this)) {
                                            try {
                                                this.f59708s.m83813a();
                                            } catch (RuntimeException e) {
                                                TXCGLSurfaceViewBase.f59653a.m83844c(this);
                                                TXCLog.m82967e("TXCGLSurfaceViewBase", "egl start error ", e);
                                            }
                                            this.f59697h = true;
                                            TXCGLSurfaceViewBase.f59653a.notifyAll();
                                            z7 = true;
                                        }
                                    }
                                    if (this.f59697h && !this.f59698i) {
                                        this.f59698i = true;
                                        z8 = true;
                                        z9 = true;
                                        z10 = true;
                                    }
                                    if (this.f59698i) {
                                        if (this.f59707r) {
                                            i = this.f59701l;
                                            i2 = this.f59702m;
                                            z = false;
                                            this.f59707r = false;
                                            z8 = true;
                                            z10 = true;
                                            z11 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.f59704o = z;
                                        TXCGLSurfaceViewBase.f59653a.notifyAll();
                                        z4 = z3;
                                        break;
                                    }
                                }
                                TXCGLSurfaceViewBase.f59653a.wait();
                                z4 = z3;
                                throw th;
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z8) {
                            if (this.f59708s.m83814b()) {
                                synchronized (TXCGLSurfaceViewBase.f59653a) {
                                    this.f59699j = true;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                }
                                z8 = z;
                            } else {
                                synchronized (TXCGLSurfaceViewBase.f59653a) {
                                    this.f59699j = true;
                                    this.f59695f = true;
                                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                                }
                            }
                            synchronized (TXCGLSurfaceViewBase.f59653a) {
                                m83823k();
                                m83824l();
                                throw th;
                            }
                        }
                        if (z9) {
                            GL10 gl11 = (GL10) this.f59708s.m83817e();
                            TXCGLSurfaceViewBase.f59653a.m83840a(gl11);
                            z9 = z;
                            gl10 = gl11;
                        }
                        if (z7) {
                            TXCGLSurfaceViewBase tXCGLSurfaceViewBase2 = this.f59709t.get();
                            if (tXCGLSurfaceViewBase2 != null) {
                                tXCGLSurfaceViewBase2.f59660h.onSurfaceCreated(gl10, this.f59708s.f59687d);
                            }
                            z7 = z;
                        }
                        if (z10) {
                            TXCGLSurfaceViewBase tXCGLSurfaceViewBase3 = this.f59709t.get();
                            if (tXCGLSurfaceViewBase3 != null) {
                                tXCGLSurfaceViewBase3.f59660h.onSurfaceChanged(gl10, i, i2);
                            }
                            z10 = z;
                        }
                        TXCGLSurfaceViewBase tXCGLSurfaceViewBase4 = this.f59709t.get();
                        if (tXCGLSurfaceViewBase4 != null) {
                            tXCGLSurfaceViewBase4.f59660h.onDrawFrame(gl10);
                            iMo83784c = tXCGLSurfaceViewBase4.mo83784c();
                        } else {
                            iMo83784c = 12288;
                        }
                        if (iMo83784c == 12288) {
                            z2 = true;
                        } else if (iMo83784c != 12302) {
                            C14175h.m83810a("GLThread", "eglSwapBuffers", iMo83784c);
                            synchronized (TXCGLSurfaceViewBase.f59653a) {
                                z2 = true;
                                this.f59695f = true;
                                TXCGLSurfaceViewBase.f59653a.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z4 = true;
                        }
                        if (z11) {
                            z5 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (TXCGLSurfaceViewBase.f59653a) {
                            m83823k();
                            m83824l();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        /* JADX INFO: renamed from: k */
        private void m83823k() {
            if (this.f59698i) {
                this.f59698i = false;
                this.f59708s.m83819g();
            }
        }

        /* JADX INFO: renamed from: l */
        private void m83824l() {
            if (this.f59697h) {
                this.f59708s.m83820h();
                this.f59697h = false;
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59709t.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f59658f = false;
                }
                TXCGLSurfaceViewBase.f59653a.m83844c(this);
            }
        }

        /* JADX INFO: renamed from: m */
        private boolean m83825m() {
            if (this.f59693d || !this.f59694e || this.f59695f || this.f59701l <= 0 || this.f59702m <= 0) {
                return false;
            }
            return this.f59704o || this.f59703n == 1;
        }

        /* JADX INFO: renamed from: a */
        public void m83827a(int i, int i2) {
            synchronized (TXCGLSurfaceViewBase.f59653a) {
                this.f59701l = i;
                this.f59702m = i2;
                this.f59707r = true;
                this.f59704o = true;
                this.f59705p = false;
                TXCGLSurfaceViewBase.f59653a.notifyAll();
                while (!this.f59691b && !this.f59693d && !this.f59705p && m83832d()) {
                    try {
                        TXCGLSurfaceViewBase.f59653a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public int m83830b() {
            return this.f59708s.m83816d();
        }

        /* JADX INFO: renamed from: c */
        public C14175h m83831c() {
            return this.f59708s;
        }

        /* JADX INFO: renamed from: d */
        public boolean m83832d() {
            return this.f59697h && this.f59698i && m83825m();
        }

        /* JADX INFO: renamed from: e */
        public int m83833e() {
            int i;
            synchronized (TXCGLSurfaceViewBase.f59653a) {
                i = this.f59703n;
            }
            return i;
        }

        /* JADX INFO: renamed from: f */
        public void m83834f() {
            synchronized (TXCGLSurfaceViewBase.f59653a) {
                this.f59694e = true;
                this.f59699j = false;
                TXCGLSurfaceViewBase.f59653a.notifyAll();
                while (this.f59696g && !this.f59699j && !this.f59691b) {
                    try {
                        TXCGLSurfaceViewBase.f59653a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m83835g() {
            synchronized (TXCGLSurfaceViewBase.f59653a) {
                this.f59694e = false;
                TXCGLSurfaceViewBase.f59653a.notifyAll();
                while (!this.f59696g && !this.f59691b) {
                    try {
                        TXCGLSurfaceViewBase.f59653a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m83836h() {
            synchronized (TXCGLSurfaceViewBase.f59653a) {
                this.f59690a = true;
                TXCGLSurfaceViewBase.f59653a.notifyAll();
                while (!this.f59691b) {
                    try {
                        TXCGLSurfaceViewBase.f59653a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m83837i() {
            this.f59700k = true;
            TXCGLSurfaceViewBase.f59653a.notifyAll();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                m83822j();
            } catch (InterruptedException unused) {
            } finally {
                TXCGLSurfaceViewBase.f59653a.m83839a(this);
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m83829a() {
            return this.f59708s.m83815c();
        }

        /* JADX INFO: renamed from: a */
        public void m83826a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (TXCGLSurfaceViewBase.f59653a) {
                    this.f59703n = i;
                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                }
                return;
            }
            ig3.m135964a("renderMode");
        }

        /* JADX INFO: renamed from: a */
        public void m83828a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TXCGLSurfaceViewBase.f59653a) {
                    this.f59706q.add(runnable);
                    TXCGLSurfaceViewBase.f59653a.notifyAll();
                }
                return;
            }
            ig3.m135964a("r must not be null");
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$b */
    public class C14169b extends AbstractC14168a {

        /* JADX INFO: renamed from: c */
        protected int f59674c;

        /* JADX INFO: renamed from: d */
        protected int f59675d;

        /* JADX INFO: renamed from: e */
        protected int f59676e;

        /* JADX INFO: renamed from: f */
        protected int f59677f;

        /* JADX INFO: renamed from: g */
        protected int f59678g;

        /* JADX INFO: renamed from: h */
        protected int f59679h;

        /* JADX INFO: renamed from: j */
        private int[] f59681j;

        public C14169b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f59681j = new int[1];
            this.f59674c = i;
            this.f59675d = i2;
            this.f59676e = i3;
            this.f59677f = i4;
            this.f59678g = i5;
            this.f59679h = i6;
        }

        @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase.AbstractC14168a
        /* JADX INFO: renamed from: a */
        public EGLConfig mo83802a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                C14169b c14169b = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM83803a = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM83803a2 = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM83803a >= c14169b.f59678g && iM83803a2 >= c14169b.f59679h) {
                    int iM83803a3 = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM83803a4 = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM83803a5 = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM83803a6 = c14169b.m83803a(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM83803a3 == c14169b.f59674c && iM83803a4 == c14169b.f59675d && iM83803a5 == c14169b.f59676e && iM83803a6 == c14169b.f59677f) {
                        return eGLConfig;
                    }
                }
                i++;
                this = c14169b;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private int m83803a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f59681j) ? this.f59681j[0] : i2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.TXCGLSurfaceViewBase$h */
    public static class C14175h {

        /* JADX INFO: renamed from: a */
        EGL10 f59684a;

        /* JADX INFO: renamed from: b */
        EGLDisplay f59685b;

        /* JADX INFO: renamed from: c */
        EGLSurface f59686c;

        /* JADX INFO: renamed from: d */
        EGLConfig f59687d;

        /* JADX INFO: renamed from: e */
        EGLContext f59688e;

        /* JADX INFO: renamed from: f */
        private WeakReference<TXCGLSurfaceViewBase> f59689f;

        public C14175h(WeakReference<TXCGLSurfaceViewBase> weakReference) {
            this.f59689f = weakReference;
        }

        /* JADX INFO: renamed from: i */
        private void m83812i() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f59686c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f59684a.eglMakeCurrent(this.f59685b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59689f.get();
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f59664l.mo83807a(this.f59684a, this.f59685b, this.f59686c);
                tXCGLSurfaceViewBase.f59657e = false;
            }
            this.f59686c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m83813a() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f59684a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f59685b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m194883a("eglGetDisplay failed");
                return;
            }
            if (!this.f59684a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m194883a("eglInitialize failed");
                return;
            }
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59689f.get();
            if (tXCGLSurfaceViewBase == null) {
                this.f59687d = null;
                this.f59688e = null;
                TXCLog.m82973w("TXCGLSurfaceViewBase", "start() error when view is null ");
            } else {
                this.f59687d = tXCGLSurfaceViewBase.f59662j.mo83801a(this.f59684a, this.f59685b);
                this.f59688e = tXCGLSurfaceViewBase.f59663k.mo83804a(this.f59684a, this.f59685b, this.f59687d);
            }
            EGLContext eGLContext = this.f59688e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f59688e = null;
                m83808a("createContext");
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f59658f = true;
            }
            this.f59686c = null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m83814b() {
            if (this.f59684a == null) {
                upk0.m194883a("egl not initialized");
                return false;
            }
            if (this.f59685b == null) {
                upk0.m194883a("eglDisplay not initialized");
                return false;
            }
            if (this.f59687d == null) {
                upk0.m194883a("mEglConfig not initialized");
                return false;
            }
            m83812i();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59689f.get();
            if (tXCGLSurfaceViewBase != null) {
                this.f59686c = tXCGLSurfaceViewBase.f59664l.mo83806a(this.f59684a, this.f59685b, this.f59687d, tXCGLSurfaceViewBase.getHolder());
            } else {
                this.f59686c = null;
            }
            EGLSurface eGLSurface = this.f59686c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f59684a.eglGetError() == 12299) {
                    TXCLog.m82966e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (!this.f59684a.eglMakeCurrent(this.f59685b, eGLSurface, eGLSurface, this.f59688e)) {
                m83810a("EGLHelper", "eglMakeCurrent", this.f59684a.eglGetError());
                return false;
            }
            if (tXCGLSurfaceViewBase != null) {
                tXCGLSurfaceViewBase.f59657e = true;
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public boolean m83815c() {
            EGL10 egl10 = this.f59684a;
            EGLDisplay eGLDisplay = this.f59685b;
            EGLSurface eGLSurface = this.f59686c;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f59688e)) {
                return true;
            }
            m83810a("EGLHelper", "eglMakeCurrent", this.f59684a.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: d */
        public int m83816d() {
            return m83818f();
        }

        /* JADX INFO: renamed from: e */
        public GL m83817e() {
            GL gl = this.f59688e.getGL();
            TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59689f.get();
            if (tXCGLSurfaceViewBase != null) {
                if (tXCGLSurfaceViewBase.f59665m != null) {
                    gl = tXCGLSurfaceViewBase.f59665m.m83845a(gl);
                }
                if ((tXCGLSurfaceViewBase.f59666n & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (tXCGLSurfaceViewBase.f59666n & 1) == 0 ? 0 : 1, (tXCGLSurfaceViewBase.f59666n & 2) != 0 ? new C14179l() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: f */
        public int m83818f() {
            return !this.f59684a.eglSwapBuffers(this.f59685b, this.f59686c) ? this.f59684a.eglGetError() : CommandMessage.COMMAND_BASE;
        }

        /* JADX INFO: renamed from: g */
        public void m83819g() {
            m83812i();
        }

        /* JADX INFO: renamed from: h */
        public void m83820h() {
            if (this.f59688e != null) {
                TXCGLSurfaceViewBase tXCGLSurfaceViewBase = this.f59689f.get();
                if (tXCGLSurfaceViewBase != null) {
                    tXCGLSurfaceViewBase.f59663k.mo83805a(this.f59684a, this.f59685b, this.f59688e);
                }
                this.f59688e = null;
            }
            EGLDisplay eGLDisplay = this.f59685b;
            if (eGLDisplay != null) {
                this.f59684a.eglTerminate(eGLDisplay);
                this.f59685b = null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m83808a(String str) {
            m83809a(str, this.f59684a.eglGetError());
        }

        /* JADX INFO: renamed from: a */
        public static void m83809a(String str, int i) {
            throw new RuntimeException(m83811b(str, i));
        }

        /* JADX INFO: renamed from: a */
        public static void m83810a(String str, String str2, int i) {
            TXCLog.m82973w(str, m83811b(str2, i));
        }

        /* JADX INFO: renamed from: b */
        public static String m83811b(String str, int i) {
            return str + " failed: " + i;
        }
    }
}
