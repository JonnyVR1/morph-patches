package tech.sud.runtime.component.p021c;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.view.TextureView;
import android.view.View;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import l.ig3;
import l.qkq0;
import p003l.upk0;
import tech.sud.runtime.component.p022d.C1210a;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.C1238d;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TextureViewSurfaceTextureListenerC1203d extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    private static final String f11198a = "d";

    /* JADX INFO: renamed from: c */
    private static final g f11199c = new g();

    /* JADX INFO: renamed from: b */
    private C1210a f11200b;

    /* JADX INFO: renamed from: d */
    private final WeakReference<TextureViewSurfaceTextureListenerC1203d> f11201d;

    /* JADX INFO: renamed from: e */
    private f f11202e;

    /* JADX INFO: renamed from: f */
    private GLSurfaceView.Renderer f11203f;

    /* JADX INFO: renamed from: g */
    private C1238d.a f11204g;

    /* JADX INFO: renamed from: h */
    private boolean f11205h;

    /* JADX INFO: renamed from: i */
    private GLSurfaceView.EGLConfigChooser f11206i;

    /* JADX INFO: renamed from: j */
    private GLSurfaceView.EGLContextFactory f11207j;

    /* JADX INFO: renamed from: k */
    private GLSurfaceView.EGLWindowSurfaceFactory f11208k;

    /* JADX INFO: renamed from: l */
    private GLSurfaceView.GLWrapper f11209l;

    /* JADX INFO: renamed from: m */
    private int f11210m;

    /* JADX INFO: renamed from: n */
    private int f11211n;

    /* JADX INFO: renamed from: o */
    private boolean f11212o;

    /* JADX INFO: renamed from: p */
    private final List<TextureView.SurfaceTextureListener> f11213p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$a */
    public abstract class a implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: a */
        protected int[] f11214a;

        public a(int[] iArr) {
            this.f11214a = m10120a(iArr);
        }

        /* JADX INFO: renamed from: a */
        private int[] m10120a(int[] iArr) {
            if (TextureViewSurfaceTextureListenerC1203d.this.f11211n != 2 && TextureViewSurfaceTextureListenerC1203d.this.f11211n != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (TextureViewSurfaceTextureListenerC1203d.this.f11211n == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo10121a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f11214a, null, 0, iArr)) {
                ig3.a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f11214a, eGLConfigArr, i, iArr)) {
                ig3.a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo10121a = mo10121a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo10121a != null) {
                return eGLConfigMo10121a;
            }
            ig3.a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$c */
    public class c implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: b */
        private int f11225b;

        private c() {
            this.f11225b = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f11225b, TextureViewSurfaceTextureListenerC1203d.this.f11211n, 12344};
            if (TextureViewSurfaceTextureListenerC1203d.this.f11211n == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            C1228f.m10331e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            StringBuilder sb = new StringBuilder("tid=");
            sb.append(Thread.currentThread().getId());
            C1228f.m10329c("DefaultContextFactory", sb.toString());
            e.m10124a("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$d */
    public static class d implements GLSurfaceView.EGLWindowSurfaceFactory {
        private d() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                C1228f.m10328b(TextureViewSurfaceTextureListenerC1203d.f11198a, "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        private static String f11255a = "GLThreadManager";

        private g() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m10150a(f fVar) {
            C1228f.m10329c(f11255a, "exiting tid=" + fVar.getId());
            fVar.f11234c = true;
            notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m10151b(f fVar) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$h */
    public static class h extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f11256a = new StringBuilder();

        /* JADX INFO: renamed from: a */
        private void m10152a() {
            if (this.f11256a.length() > 0) {
                C1228f.m10324a("GLTextureView", this.f11256a.toString());
                StringBuilder sb = this.f11256a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m10152a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m10152a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m10152a();
                } else {
                    this.f11256a.append(c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$i */
    public class i extends b {
        public i(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public TextureViewSurfaceTextureListenerC1203d(Context context) {
        super(context);
        this.f11201d = new WeakReference<>(this);
        this.f11213p = new ArrayList();
        m10109e();
    }

    /* JADX INFO: renamed from: a */
    public static String m10101a(int i2) {
        switch (i2) {
            case 12288:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return m10103b(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m10103b(int i2) {
        return "0x" + Integer.toHexString(i2);
    }

    /* JADX INFO: renamed from: e */
    private void m10109e() {
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: f */
    private void m10111f() {
        if (this.f11202e == null) {
            return;
        }
        qkq0.a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: a_ */
    public void m10117a_() {
        this.f11202e.m10146c();
    }

    public void finalize() throws Throwable {
        C1228f.m10327b(f11198a, "finalize");
        try {
            f fVar = this.f11202e;
            if (fVar != null) {
                fVar.m10149e(this.f11200b);
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f11210m;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f11212o;
    }

    public int getRenderMode() {
        return this.f11202e.m10144b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1228f.m10327b(f11198a, "onAttachedToWindow reattach =" + this.f11205h);
        if (this.f11205h && this.f11203f != null) {
            C1210a c1210a = this.f11200b;
            if (c1210a != null) {
                c1210a.m10211a("GameViewOnAttachedToWindowReload", "");
                this.f11205h = false;
                return;
            }
            f fVar = this.f11202e;
            int iM10144b = fVar != null ? fVar.m10144b() : 1;
            f fVar2 = new f(this.f11201d);
            this.f11202e = fVar2;
            if (iM10144b != 1) {
                fVar2.m10139a(iM10144b);
            }
            this.f11202e.start();
        }
        this.f11205h = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C1228f.m10327b(f11198a, "onDetachedFromWindow");
        f fVar = this.f11202e;
        if (fVar != null) {
            fVar.m10149e(this.f11200b);
        }
        this.f11205h = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m10116a(getSurfaceTexture(), 0, i4 - i2, i5 - i3);
    }

    public void onPause() {
        this.f11202e.m10147c(this.f11200b);
    }

    public void onResume() {
        this.f11202e.m10148d(this.f11200b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C1210a c1210a = this.f11200b;
        if (c1210a != null) {
            c1210a.m10211a("GameViewOnSurfaceCreated", "");
        }
        mo10115a(surfaceTexture);
        m10116a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f11213p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1210a c1210a = this.f11200b;
        if (c1210a != null) {
            c1210a.m10211a("GameViewOnSurfaceDestroyed", "");
        }
        mo10119b(surfaceTexture);
        Iterator<TextureView.SurfaceTextureListener> it = this.f11213p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        m10116a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f11213p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        m10117a_();
        Iterator<TextureView.SurfaceTextureListener> it = this.f11213p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void queueEvent(Runnable runnable) {
        this.f11202e.m10140a(runnable);
    }

    public void setDebugFlags(int i2) {
        this.f11210m = i2;
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
        setEGLConfigChooser(new b(i2, i3, i4, i5, i6, i7));
    }

    public void setEGLContextClientVersion(int i2) {
        m10111f();
        this.f11211n = i2;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        m10111f();
        this.f11207j = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        m10111f();
        this.f11208k = eGLWindowSurfaceFactory;
    }

    public void setExternalInterface(C1210a c1210a) {
        this.f11200b = c1210a;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f11209l = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f11212o = z;
    }

    public void setRenderMode(int i2) {
        this.f11202e.m10139a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m10111f();
        if (this.f11206i == null) {
            this.f11206i = new i(true);
        }
        if (this.f11207j == null) {
            this.f11207j = new c();
        }
        if (this.f11208k == null) {
            this.f11208k = new d();
        }
        this.f11203f = renderer;
        if (renderer instanceof C1238d) {
            this.f11204g = ((C1238d) renderer).m10451f();
        }
        f fVar = new f(this.f11201d);
        this.f11202e = fVar;
        fVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new i(z));
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        m10111f();
        this.f11206i = eGLConfigChooser;
    }

    /* JADX INFO: renamed from: b */
    public void mo10119b(SurfaceTexture surfaceTexture) {
        this.f11202e.m10145b(this.f11200b);
    }

    /* JADX INFO: renamed from: b */
    public void mo10118b() {
    }

    /* JADX INFO: renamed from: a */
    public void mo10115a(SurfaceTexture surfaceTexture) {
        this.f11202e.m10141a(this.f11200b);
    }

    /* JADX INFO: renamed from: a */
    public void m10116a(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
        this.f11202e.m10142a(this.f11200b, i3, i4);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$b */
    public class b extends a {

        /* JADX INFO: renamed from: c */
        protected int f11216c;

        /* JADX INFO: renamed from: d */
        protected int f11217d;

        /* JADX INFO: renamed from: e */
        protected int f11218e;

        /* JADX INFO: renamed from: f */
        protected int f11219f;

        /* JADX INFO: renamed from: g */
        protected int f11220g;

        /* JADX INFO: renamed from: h */
        protected int f11221h;

        /* JADX INFO: renamed from: j */
        private int[] f11223j;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f11223j = new int[1];
            this.f11216c = i;
            this.f11217d = i2;
            this.f11218e = i3;
            this.f11219f = i4;
            this.f11220g = i5;
            this.f11221h = i6;
        }

        @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.a
        /* JADX INFO: renamed from: a */
        public EGLConfig mo10121a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                b bVar = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM10122a = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM10122a2 = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM10122a >= bVar.f11220g && iM10122a2 >= bVar.f11221h) {
                    int iM10122a3 = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM10122a4 = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM10122a5 = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM10122a6 = bVar.m10122a(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM10122a3 == bVar.f11216c && iM10122a4 == bVar.f11217d && iM10122a5 == bVar.f11218e && iM10122a6 == bVar.f11219f) {
                        return eGLConfig;
                    }
                }
                i++;
                this = bVar;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private int m10122a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f11223j) ? this.f11223j[0] : i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$f */
    public static class f extends Thread {

        /* JADX INFO: renamed from: b */
        private boolean f11233b;

        /* JADX INFO: renamed from: c */
        private boolean f11234c;

        /* JADX INFO: renamed from: d */
        private boolean f11235d;

        /* JADX INFO: renamed from: e */
        private boolean f11236e;

        /* JADX INFO: renamed from: f */
        private boolean f11237f;

        /* JADX INFO: renamed from: g */
        private boolean f11238g;

        /* JADX INFO: renamed from: h */
        private boolean f11239h;

        /* JADX INFO: renamed from: i */
        private boolean f11240i;

        /* JADX INFO: renamed from: j */
        private boolean f11241j;

        /* JADX INFO: renamed from: k */
        private boolean f11242k;

        /* JADX INFO: renamed from: l */
        private boolean f11243l;

        /* JADX INFO: renamed from: r */
        private boolean f11249r;

        /* JADX INFO: renamed from: v */
        private e f11253v;

        /* JADX INFO: renamed from: w */
        private WeakReference<TextureViewSurfaceTextureListenerC1203d> f11254w;

        /* JADX INFO: renamed from: a */
        private final String f11232a = "GLThread";

        /* JADX INFO: renamed from: s */
        private ArrayList<Runnable> f11250s = new ArrayList<>();

        /* JADX INFO: renamed from: t */
        private boolean f11251t = true;

        /* JADX INFO: renamed from: u */
        private Runnable f11252u = null;

        /* JADX INFO: renamed from: m */
        private int f11244m = 0;

        /* JADX INFO: renamed from: n */
        private int f11245n = 0;

        /* JADX INFO: renamed from: p */
        private boolean f11247p = true;

        /* JADX INFO: renamed from: o */
        private int f11246o = 1;

        /* JADX INFO: renamed from: q */
        private boolean f11248q = false;

        public f(WeakReference<TextureViewSurfaceTextureListenerC1203d> weakReference) {
            this.f11254w = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:203:0x0463 A[Catch: all -> 0x0467, TryCatch #2 {all -> 0x0467, blocks: (B:201:0x0459, B:203:0x0463, B:206:0x0469, B:207:0x046f), top: B:214:0x0459 }] */
        /* JADX WARN: Code duplicated, block: B:214:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0250, code lost:
        
            if (r5 == false) goto L238;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0252, code lost:
        
            tech.sud.runtime.component.p026h.C1228f.m10330d("GLThread", "egl createSurface");
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x025f, code lost:
        
            if (r1.f11253v.m10129b() == false) goto L240;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0261, code lost:
        
            r3 = tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0265, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0267, code lost:
        
            r1.f11242k = true;
            tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0270, code lost:
        
            monitor-exit(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0271, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0276, code lost:
        
            r3 = tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x027c, code lost:
        
            r1.f11242k = true;
            r1.f11238g = true;
            tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0287, code lost:
        
            monitor-exit(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0288, code lost:
        
            r3 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0290, code lost:
        
            if (r6 == false) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0292, code lost:
        
            r3 = (javax.microedition.khronos.opengles.GL10) r1.f11253v.m10130c();
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
        
            r3 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x029f, code lost:
        
            if (r4 == false) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
        
            tech.sud.runtime.component.p026h.C1228f.m10330d("GLThread", "onSurfaceCreated");
            r0 = r1.f11254w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x02b0, code lost:
        
            if (r0 == null) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
        
            r0.f11203f.onSurfaceCreated(r3, r1.f11253v.f11229d);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
        
            r4 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x02be, code lost:
        
            if (r8 == false) goto L216;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
        
            tech.sud.runtime.component.p026h.C1228f.m10330d("GLThread", "onSurfaceChanged(" + r12 + ", " + r13 + ")");
            r0 = r1.f11254w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x02eb, code lost:
        
            if (r0 == null) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x02ed, code lost:
        
            r0.f11203f.onSurfaceChanged(r3, r12, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x02f4, code lost:
        
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x02f5, code lost:
        
            r0 = r1.f11254w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x02fd, code lost:
        
            if (r0 == null) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x02ff, code lost:
        
            r0.f11203f.onDrawFrame(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x030a, code lost:
        
            if (r0.f11204g == null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x030c, code lost:
        
            r0 = r0.f11204g.f11537a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x0313, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0314, code lost:
        
            if (r15 == null) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0316, code lost:
        
            r15.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x0319, code lost:
        
            r15 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x031b, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x031c, code lost:
        
            if (r0 == false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x031e, code lost:
        
            r0 = r1.f11253v.m10131d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x0326, code lost:
        
            if (r0 == 12288) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x032a, code lost:
        
            if (r0 == 12302) goto L160;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x032c, code lost:
        
            tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.e.m10125a("GLThread", "eglSwapBuffers", r0);
            r2 = tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x0339, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x033b, code lost:
        
            r1.f11238g = true;
            tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x0344, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x034c, code lost:
        
            tech.sud.runtime.component.p026h.C1228f.m10329c("GLThread", "egl context lost tid=" + getId());
         */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x0366, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x0368, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:164:0x0369, code lost:
        
            r2 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x0370, code lost:
        
            if (r9 == false) goto L169;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0372, code lost:
        
            r9 = false;
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:169:0x0374, code lost:
        
            r1 = r21;
            r3 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x0423, code lost:
        
            r1 = tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f11199c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x0427, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x0428, code lost:
        
            r0 = r2.f11254w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x0430, code lost:
        
            if (r0 == null) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x0432, code lost:
        
            r0.mo10118b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x0436, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x0438, code lost:
        
            r2.m10135d();
            r2.m10136e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:0x043e, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:190:0x043f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x0441, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        
            if (r14 == null) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        
            r14.run();
            r14 = r2;
            r3 = r19;
         */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m10137f() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1139
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d.f.m10137f():void");
        }

        /* JADX INFO: renamed from: g */
        private boolean m10138g() {
            if (this.f11236e || !this.f11237f || this.f11238g || this.f11244m <= 0 || this.f11245n <= 0) {
                return false;
            }
            return this.f11247p || this.f11246o == 1;
        }

        /* JADX INFO: renamed from: a */
        public void m10142a(C1210a c1210a, int i, int i2) {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    this.f11244m = i;
                    this.f11245n = i2;
                    this.f11251t = true;
                    this.f11247p = true;
                    boolean z = false;
                    this.f11249r = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    while (!this.f11234c && !this.f11236e && !this.f11249r && m10143a()) {
                        C1228f.m10329c("GLThread", "onWindowResize waiting for render complete from tid=" + getId());
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C1228f.m10329c("GLThread", "onWindowResize 触发了anr监控");
                                    if (c1210a != null) {
                                        c1210a.m10211a("onGameANRDetected", "");
                                    }
                                    z = true;
                                } catch (InterruptedException unused2) {
                                    z = true;
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m10145b(C1210a c1210a) {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    C1228f.m10329c("GLThread", "surfaceDestroyed tid=" + getId());
                    boolean z = false;
                    this.f11237f = false;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    while (!this.f11239h && !this.f11234c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                z = true;
                                C1228f.m10329c("GLThread", "surfaceDestroyed 触发了anr监控");
                                if (c1210a != null) {
                                    c1210a.m10211a("onGameANRDetected", "");
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10147c(C1210a c1210a) {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    C1228f.m10329c("GLThread", "onPause tid=" + getId());
                    this.f11235d = true;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    boolean z = false;
                    while (!this.f11234c && !this.f11236e) {
                        C1228f.m10329c("GLThread", "onPause waiting for mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C1228f.m10329c("GLThread", "onPause 触发了anr监控");
                                    if (c1210a != null) {
                                        c1210a.m10211a("onGameANRDetected", "");
                                    }
                                    z = true;
                                } catch (InterruptedException unused2) {
                                    z = true;
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m10148d(C1210a c1210a) {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    C1228f.m10329c("GLThread", "onResume tid=" + getId());
                    boolean z = false;
                    this.f11235d = false;
                    this.f11247p = true;
                    this.f11249r = false;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    while (!this.f11234c && this.f11236e && !this.f11249r) {
                        C1228f.m10329c("GLThread", "onResume waiting for !mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C1228f.m10329c("GLThread", "onResume 触发了anr监控");
                                    if (c1210a != null) {
                                        c1210a.m10211a("onGameANRDetected", "");
                                    }
                                    z = true;
                                } catch (InterruptedException unused2) {
                                    z = true;
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m10149e(C1210a c1210a) {
            C1228f.m10329c("GLThread", "requestExitAndWait");
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    this.f11233b = true;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    boolean z = false;
                    while (!this.f11234c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C1228f.m10329c("GLThread", "requestExitAndWait 触发了anr监控");
                                    if (c1210a != null) {
                                        c1210a.m10211a("onGameANRDetected", "");
                                    }
                                    z = true;
                                } catch (InterruptedException unused2) {
                                    z = true;
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            C1228f.m10329c("GLThread", "starting tid=" + getId());
            try {
                m10137f();
            } catch (InterruptedException unused) {
            } finally {
                TextureViewSurfaceTextureListenerC1203d.f11199c.m10150a(this);
            }
        }

        /* JADX INFO: renamed from: e */
        private void m10136e() {
            if (this.f11240i) {
                this.f11253v.m10133f();
                this.f11240i = false;
                TextureViewSurfaceTextureListenerC1203d.f11199c.m10151b(this);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m10144b() {
            int i;
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                i = this.f11246o;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m10146c() {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                this.f11247p = true;
                TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
            }
        }

        /* JADX INFO: renamed from: d */
        private void m10135d() {
            if (this.f11241j) {
                this.f11241j = false;
                this.f11253v.m10132e();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m10143a() {
            return this.f11240i && this.f11241j && m10138g();
        }

        /* JADX INFO: renamed from: a */
        public void m10139a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                    this.f11246o = i;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                }
                return;
            }
            ig3.a("renderMode");
        }

        /* JADX INFO: renamed from: a */
        public void m10141a(C1210a c1210a) {
            synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                try {
                    C1228f.m10329c("GLThread", "surfaceCreated tid=" + getId());
                    this.f11237f = true;
                    boolean z = false;
                    this.f11242k = false;
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                    while (this.f11239h && !this.f11242k && !this.f11234c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC1203d.f11199c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC1203d.f11199c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C1228f.m10329c("GLThread", "surfaceCreated 触发了anr监控");
                                    if (c1210a != null) {
                                        c1210a.m10211a("onGameANRDetected", "");
                                    }
                                    z = true;
                                } catch (InterruptedException unused2) {
                                    z = true;
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m10140a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TextureViewSurfaceTextureListenerC1203d.f11199c) {
                    this.f11250s.add(runnable);
                    TextureViewSurfaceTextureListenerC1203d.f11199c.notifyAll();
                }
                return;
            }
            ig3.a("r must not be null");
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        EGL10 f11226a;

        /* JADX INFO: renamed from: b */
        EGLDisplay f11227b;

        /* JADX INFO: renamed from: c */
        EGLSurface f11228c;

        /* JADX INFO: renamed from: d */
        EGLConfig f11229d;

        /* JADX INFO: renamed from: e */
        EGLContext f11230e;

        /* JADX INFO: renamed from: f */
        private WeakReference<TextureViewSurfaceTextureListenerC1203d> f11231f;

        public e(WeakReference<TextureViewSurfaceTextureListenerC1203d> weakReference) {
            this.f11231f = weakReference;
        }

        /* JADX INFO: renamed from: g */
        private void m10127g() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f11228c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f11226a.eglMakeCurrent(this.f11227b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TextureViewSurfaceTextureListenerC1203d textureViewSurfaceTextureListenerC1203d = this.f11231f.get();
            if (textureViewSurfaceTextureListenerC1203d != null) {
                textureViewSurfaceTextureListenerC1203d.f11208k.destroySurface(this.f11226a, this.f11227b, this.f11228c);
            }
            this.f11228c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m10128a() {
            C1228f.m10330d("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f11226a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f11227b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m8197a("eglGetDisplay failed");
                return;
            }
            if (!this.f11226a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m8197a("eglInitialize failed");
                return;
            }
            TextureViewSurfaceTextureListenerC1203d textureViewSurfaceTextureListenerC1203d = this.f11231f.get();
            if (textureViewSurfaceTextureListenerC1203d == null) {
                this.f11229d = null;
                this.f11230e = null;
            } else {
                this.f11229d = textureViewSurfaceTextureListenerC1203d.f11206i.chooseConfig(this.f11226a, this.f11227b);
                this.f11230e = textureViewSurfaceTextureListenerC1203d.f11207j.createContext(this.f11226a, this.f11227b, this.f11229d);
            }
            EGLContext eGLContext = this.f11230e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f11230e = null;
                m10123a("createContext");
            }
            C1228f.m10330d("EglHelper", "createContext " + this.f11230e + " tid=" + Thread.currentThread().getId());
            this.f11228c = null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m10129b() {
            C1228f.m10330d("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.f11226a == null) {
                upk0.m8197a("egl not initialized");
                return false;
            }
            if (this.f11227b == null) {
                upk0.m8197a("eglDisplay not initialized");
                return false;
            }
            if (this.f11229d == null) {
                upk0.m8197a("mEglConfig not initialized");
                return false;
            }
            m10127g();
            TextureViewSurfaceTextureListenerC1203d textureViewSurfaceTextureListenerC1203d = this.f11231f.get();
            if (textureViewSurfaceTextureListenerC1203d != null) {
                this.f11228c = textureViewSurfaceTextureListenerC1203d.f11208k.createWindowSurface(this.f11226a, this.f11227b, this.f11229d, textureViewSurfaceTextureListenerC1203d.getSurfaceTexture());
            } else {
                this.f11228c = null;
            }
            EGLSurface eGLSurface = this.f11228c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f11226a.eglGetError() == 12299) {
                    C1228f.m10331e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f11226a.eglMakeCurrent(this.f11227b, eGLSurface, eGLSurface, this.f11230e)) {
                return true;
            }
            m10125a("EGLHelper", "eglMakeCurrent", this.f11226a.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public GL m10130c() {
            GL gl = this.f11230e.getGL();
            TextureViewSurfaceTextureListenerC1203d textureViewSurfaceTextureListenerC1203d = this.f11231f.get();
            if (textureViewSurfaceTextureListenerC1203d != null) {
                if (textureViewSurfaceTextureListenerC1203d.f11209l != null) {
                    gl = textureViewSurfaceTextureListenerC1203d.f11209l.wrap(gl);
                }
                if ((textureViewSurfaceTextureListenerC1203d.f11210m & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (textureViewSurfaceTextureListenerC1203d.f11210m & 1) == 0 ? 0 : 1, (textureViewSurfaceTextureListenerC1203d.f11210m & 2) != 0 ? new h() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: d */
        public int m10131d() {
            if (this.f11226a.eglSwapBuffers(this.f11227b, this.f11228c)) {
                return 12288;
            }
            return this.f11226a.eglGetError();
        }

        /* JADX INFO: renamed from: e */
        public void m10132e() {
            C1228f.m10330d("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            m10127g();
        }

        /* JADX INFO: renamed from: f */
        public void m10133f() {
            C1228f.m10330d("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f11230e != null) {
                TextureViewSurfaceTextureListenerC1203d textureViewSurfaceTextureListenerC1203d = this.f11231f.get();
                if (textureViewSurfaceTextureListenerC1203d != null) {
                    textureViewSurfaceTextureListenerC1203d.f11207j.destroyContext(this.f11226a, this.f11227b, this.f11230e);
                }
                this.f11230e = null;
            }
            EGLDisplay eGLDisplay = this.f11227b;
            if (eGLDisplay != null) {
                this.f11226a.eglTerminate(eGLDisplay);
                this.f11227b = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m10126b(String str, int i) {
            return str + " failed: " + TextureViewSurfaceTextureListenerC1203d.m10101a(i);
        }

        /* JADX INFO: renamed from: a */
        private void m10123a(String str) {
            m10124a(str, this.f11226a.eglGetError());
        }

        /* JADX INFO: renamed from: a */
        public static void m10124a(String str, int i) {
            String strM10126b = m10126b(str, i);
            C1228f.m10331e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + " " + strM10126b);
            throw new RuntimeException(strM10126b);
        }

        /* JADX INFO: renamed from: a */
        public static void m10125a(String str, String str2, int i) {
            C1228f.m10330d(str, m10126b(str2, i));
        }
    }
}
