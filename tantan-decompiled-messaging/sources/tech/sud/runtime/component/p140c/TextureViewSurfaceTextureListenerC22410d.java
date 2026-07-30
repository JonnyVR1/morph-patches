package tech.sud.runtime.component.p140c;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.view.TextureView;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.CommandMessage;
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
import p149l.ig3;
import p149l.qkq0;
import p149l.upk0;
import tech.sud.runtime.component.p141d.C22417a;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.C22445d;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.d */
/* JADX INFO: loaded from: classes3.dex */
public class TextureViewSurfaceTextureListenerC22410d extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    private static final String f207573a = "d";

    /* JADX INFO: renamed from: c */
    private static final g f207574c = new g();

    /* JADX INFO: renamed from: b */
    private C22417a f207575b;

    /* JADX INFO: renamed from: d */
    private final WeakReference<TextureViewSurfaceTextureListenerC22410d> f207576d;

    /* JADX INFO: renamed from: e */
    private f f207577e;

    /* JADX INFO: renamed from: f */
    private GLSurfaceView.Renderer f207578f;

    /* JADX INFO: renamed from: g */
    private C22445d.a f207579g;

    /* JADX INFO: renamed from: h */
    private boolean f207580h;

    /* JADX INFO: renamed from: i */
    private GLSurfaceView.EGLConfigChooser f207581i;

    /* JADX INFO: renamed from: j */
    private GLSurfaceView.EGLContextFactory f207582j;

    /* JADX INFO: renamed from: k */
    private GLSurfaceView.EGLWindowSurfaceFactory f207583k;

    /* JADX INFO: renamed from: l */
    private GLSurfaceView.GLWrapper f207584l;

    /* JADX INFO: renamed from: m */
    private int f207585m;

    /* JADX INFO: renamed from: n */
    private int f207586n;

    /* JADX INFO: renamed from: o */
    private boolean f207587o;

    /* JADX INFO: renamed from: p */
    private final List<TextureView.SurfaceTextureListener> f207588p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$a */
    public abstract class a implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: a */
        protected int[] f207589a;

        public a(int[] iArr) {
            this.f207589a = m221649a(iArr);
        }

        /* JADX INFO: renamed from: a */
        private int[] m221649a(int[] iArr) {
            if (TextureViewSurfaceTextureListenerC22410d.this.f207586n != 2 && TextureViewSurfaceTextureListenerC22410d.this.f207586n != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (TextureViewSurfaceTextureListenerC22410d.this.f207586n == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo221650a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207589a, null, 0, iArr)) {
                ig3.m135964a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f207589a, eGLConfigArr, i, iArr)) {
                ig3.m135964a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo221650a = mo221650a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo221650a != null) {
                return eGLConfigMo221650a;
            }
            ig3.m135964a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$c */
    public class c implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: b */
        private int f207600b;

        private c() {
            this.f207600b = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f207600b, TextureViewSurfaceTextureListenerC22410d.this.f207586n, 12344};
            if (TextureViewSurfaceTextureListenerC22410d.this.f207586n == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            C22435f.m221860e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            StringBuilder sb = new StringBuilder("tid=");
            sb.append(Thread.currentThread().getId());
            C22435f.m221858c("DefaultContextFactory", sb.toString());
            e.m221653a("eglDestroyContex", egl10.eglGetError());
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
                C22435f.m221857b(TextureViewSurfaceTextureListenerC22410d.f207573a, "eglCreateWindowSurface", e);
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
        private static String f207630a = "GLThreadManager";

        private g() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m221679a(f fVar) {
            C22435f.m221858c(f207630a, "exiting tid=" + fVar.getId());
            fVar.f207609c = true;
            notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m221680b(f fVar) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$h */
    public static class h extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f207631a = new StringBuilder();

        /* JADX INFO: renamed from: a */
        private void m221681a() {
            if (this.f207631a.length() > 0) {
                C22435f.m221853a("GLTextureView", this.f207631a.toString());
                StringBuilder sb = this.f207631a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m221681a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m221681a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m221681a();
                } else {
                    this.f207631a.append(c);
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

    public TextureViewSurfaceTextureListenerC22410d(Context context) {
        super(context);
        this.f207576d = new WeakReference<>(this);
        this.f207588p = new ArrayList();
        m221638e();
    }

    /* JADX INFO: renamed from: a */
    public static String m221630a(int i2) {
        switch (i2) {
            case CommandMessage.COMMAND_BASE /* 12288 */:
                return "EGL_SUCCESS";
            case CommandMessage.COMMAND_REGISTER /* 12289 */:
                return "EGL_NOT_INITIALIZED";
            case CommandMessage.COMMAND_UNREGISTER /* 12290 */:
                return "EGL_BAD_ACCESS";
            case CommandMessage.COMMAND_STATISTIC /* 12291 */:
                return "EGL_BAD_ALLOC";
            case CommandMessage.COMMAND_SET_ALIAS /* 12292 */:
                return "EGL_BAD_ATTRIBUTE";
            case CommandMessage.COMMAND_GET_ALIAS /* 12293 */:
                return "EGL_BAD_CONFIG";
            case CommandMessage.COMMAND_UNSET_ALIAS /* 12294 */:
                return "EGL_BAD_CONTEXT";
            case CommandMessage.COMMAND_SET_TAGS /* 12295 */:
                return "EGL_BAD_CURRENT_SURFACE";
            case CommandMessage.COMMAND_GET_TAGS /* 12296 */:
                return "EGL_BAD_DISPLAY";
            case CommandMessage.COMMAND_UNSET_TAGS /* 12297 */:
                return "EGL_BAD_MATCH";
            case CommandMessage.COMMAND_SET_PUSH_TIME /* 12298 */:
                return "EGL_BAD_NATIVE_PIXMAP";
            case CommandMessage.COMMAND_PAUSE_PUSH /* 12299 */:
                return "EGL_BAD_NATIVE_WINDOW";
            case CommandMessage.COMMAND_RESUME_PUSH /* 12300 */:
                return "EGL_BAD_PARAMETER";
            case CommandMessage.COMMAND_SET_ACCOUNTS /* 12301 */:
                return "EGL_BAD_SURFACE";
            case CommandMessage.COMMAND_GET_ACCOUNTS /* 12302 */:
                return "EGL_CONTEXT_LOST";
            default:
                return m221632b(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m221632b(int i2) {
        return "0x" + Integer.toHexString(i2);
    }

    /* JADX INFO: renamed from: e */
    private void m221638e() {
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: f */
    private void m221640f() {
        if (this.f207577e == null) {
            return;
        }
        qkq0.m175383a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: a_ */
    public void m221646a_() {
        this.f207577e.m221675c();
    }

    public void finalize() throws Throwable {
        C22435f.m221856b(f207573a, "finalize");
        try {
            f fVar = this.f207577e;
            if (fVar != null) {
                fVar.m221678e(this.f207575b);
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f207585m;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f207587o;
    }

    public int getRenderMode() {
        return this.f207577e.m221673b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22435f.m221856b(f207573a, "onAttachedToWindow reattach =" + this.f207580h);
        if (this.f207580h && this.f207578f != null) {
            C22417a c22417a = this.f207575b;
            if (c22417a != null) {
                c22417a.m221740a("GameViewOnAttachedToWindowReload", "");
                this.f207580h = false;
                return;
            }
            f fVar = this.f207577e;
            int iM221673b = fVar != null ? fVar.m221673b() : 1;
            f fVar2 = new f(this.f207576d);
            this.f207577e = fVar2;
            if (iM221673b != 1) {
                fVar2.m221668a(iM221673b);
            }
            this.f207577e.start();
        }
        this.f207580h = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C22435f.m221856b(f207573a, "onDetachedFromWindow");
        f fVar = this.f207577e;
        if (fVar != null) {
            fVar.m221678e(this.f207575b);
        }
        this.f207580h = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m221645a(getSurfaceTexture(), 0, i4 - i2, i5 - i3);
    }

    public void onPause() {
        this.f207577e.m221676c(this.f207575b);
    }

    public void onResume() {
        this.f207577e.m221677d(this.f207575b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C22417a c22417a = this.f207575b;
        if (c22417a != null) {
            c22417a.m221740a("GameViewOnSurfaceCreated", "");
        }
        mo221644a(surfaceTexture);
        m221645a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f207588p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22417a c22417a = this.f207575b;
        if (c22417a != null) {
            c22417a.m221740a("GameViewOnSurfaceDestroyed", "");
        }
        mo221648b(surfaceTexture);
        Iterator<TextureView.SurfaceTextureListener> it = this.f207588p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        m221645a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f207588p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        m221646a_();
        Iterator<TextureView.SurfaceTextureListener> it = this.f207588p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void queueEvent(Runnable runnable) {
        this.f207577e.m221669a(runnable);
    }

    public void setDebugFlags(int i2) {
        this.f207585m = i2;
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
        setEGLConfigChooser(new b(i2, i3, i4, i5, i6, i7));
    }

    public void setEGLContextClientVersion(int i2) {
        m221640f();
        this.f207586n = i2;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        m221640f();
        this.f207582j = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        m221640f();
        this.f207583k = eGLWindowSurfaceFactory;
    }

    public void setExternalInterface(C22417a c22417a) {
        this.f207575b = c22417a;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f207584l = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f207587o = z;
    }

    public void setRenderMode(int i2) {
        this.f207577e.m221668a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m221640f();
        if (this.f207581i == null) {
            this.f207581i = new i(true);
        }
        if (this.f207582j == null) {
            this.f207582j = new c();
        }
        if (this.f207583k == null) {
            this.f207583k = new d();
        }
        this.f207578f = renderer;
        if (renderer instanceof C22445d) {
            this.f207579g = ((C22445d) renderer).m221980f();
        }
        f fVar = new f(this.f207576d);
        this.f207577e = fVar;
        fVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new i(z));
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        m221640f();
        this.f207581i = eGLConfigChooser;
    }

    /* JADX INFO: renamed from: b */
    public void mo221648b(SurfaceTexture surfaceTexture) {
        this.f207577e.m221674b(this.f207575b);
    }

    /* JADX INFO: renamed from: b */
    public void mo221647b() {
    }

    /* JADX INFO: renamed from: a */
    public void mo221644a(SurfaceTexture surfaceTexture) {
        this.f207577e.m221670a(this.f207575b);
    }

    /* JADX INFO: renamed from: a */
    public void m221645a(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
        this.f207577e.m221671a(this.f207575b, i3, i4);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$b */
    public class b extends a {

        /* JADX INFO: renamed from: c */
        protected int f207591c;

        /* JADX INFO: renamed from: d */
        protected int f207592d;

        /* JADX INFO: renamed from: e */
        protected int f207593e;

        /* JADX INFO: renamed from: f */
        protected int f207594f;

        /* JADX INFO: renamed from: g */
        protected int f207595g;

        /* JADX INFO: renamed from: h */
        protected int f207596h;

        /* JADX INFO: renamed from: j */
        private int[] f207598j;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f207598j = new int[1];
            this.f207591c = i;
            this.f207592d = i2;
            this.f207593e = i3;
            this.f207594f = i4;
            this.f207595g = i5;
            this.f207596h = i6;
        }

        @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.a
        /* JADX INFO: renamed from: a */
        public EGLConfig mo221650a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                b bVar = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM221651a = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM221651a2 = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM221651a >= bVar.f207595g && iM221651a2 >= bVar.f207596h) {
                    int iM221651a3 = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM221651a4 = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM221651a5 = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM221651a6 = bVar.m221651a(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM221651a3 == bVar.f207591c && iM221651a4 == bVar.f207592d && iM221651a5 == bVar.f207593e && iM221651a6 == bVar.f207594f) {
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
        private int m221651a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f207598j) ? this.f207598j[0] : i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$f */
    public static class f extends Thread {

        /* JADX INFO: renamed from: b */
        private boolean f207608b;

        /* JADX INFO: renamed from: c */
        private boolean f207609c;

        /* JADX INFO: renamed from: d */
        private boolean f207610d;

        /* JADX INFO: renamed from: e */
        private boolean f207611e;

        /* JADX INFO: renamed from: f */
        private boolean f207612f;

        /* JADX INFO: renamed from: g */
        private boolean f207613g;

        /* JADX INFO: renamed from: h */
        private boolean f207614h;

        /* JADX INFO: renamed from: i */
        private boolean f207615i;

        /* JADX INFO: renamed from: j */
        private boolean f207616j;

        /* JADX INFO: renamed from: k */
        private boolean f207617k;

        /* JADX INFO: renamed from: l */
        private boolean f207618l;

        /* JADX INFO: renamed from: r */
        private boolean f207624r;

        /* JADX INFO: renamed from: v */
        private e f207628v;

        /* JADX INFO: renamed from: w */
        private WeakReference<TextureViewSurfaceTextureListenerC22410d> f207629w;

        /* JADX INFO: renamed from: a */
        private final String f207607a = "GLThread";

        /* JADX INFO: renamed from: s */
        private ArrayList<Runnable> f207625s = new ArrayList<>();

        /* JADX INFO: renamed from: t */
        private boolean f207626t = true;

        /* JADX INFO: renamed from: u */
        private Runnable f207627u = null;

        /* JADX INFO: renamed from: m */
        private int f207619m = 0;

        /* JADX INFO: renamed from: n */
        private int f207620n = 0;

        /* JADX INFO: renamed from: p */
        private boolean f207622p = true;

        /* JADX INFO: renamed from: o */
        private int f207621o = 1;

        /* JADX INFO: renamed from: q */
        private boolean f207623q = false;

        public f(WeakReference<TextureViewSurfaceTextureListenerC22410d> weakReference) {
            this.f207629w = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:203:0x0463 A[Catch: all -> 0x0467, TryCatch #2 {all -> 0x0467, blocks: (B:201:0x0459, B:203:0x0463, B:206:0x0469, B:207:0x046f), top: B:214:0x0459 }] */
        /* JADX WARN: Code duplicated, block: B:214:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0250, code lost:
        
            if (r5 == false) goto L238;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0252, code lost:
        
            tech.sud.runtime.component.p145h.C22435f.m221859d("GLThread", "egl createSurface");
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x025f, code lost:
        
            if (r1.f207628v.m221658b() == false) goto L240;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0261, code lost:
        
            r3 = tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0265, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0267, code lost:
        
            r1.f207617k = true;
            tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0270, code lost:
        
            monitor-exit(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0271, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0276, code lost:
        
            r3 = tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x027c, code lost:
        
            r1.f207617k = true;
            r1.f207613g = true;
            tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
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
        
            r3 = (javax.microedition.khronos.opengles.GL10) r1.f207628v.m221659c();
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
        
            r3 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x029f, code lost:
        
            if (r4 == false) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
        
            tech.sud.runtime.component.p145h.C22435f.m221859d("GLThread", "onSurfaceCreated");
            r0 = r1.f207629w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x02b0, code lost:
        
            if (r0 == null) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
        
            r0.f207578f.onSurfaceCreated(r3, r1.f207628v.f207604d);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
        
            r4 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x02be, code lost:
        
            if (r8 == false) goto L216;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
        
            tech.sud.runtime.component.p145h.C22435f.m221859d("GLThread", "onSurfaceChanged(" + r12 + ", " + r13 + ")");
            r0 = r1.f207629w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x02eb, code lost:
        
            if (r0 == null) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x02ed, code lost:
        
            r0.f207578f.onSurfaceChanged(r3, r12, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x02f4, code lost:
        
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x02f5, code lost:
        
            r0 = r1.f207629w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x02fd, code lost:
        
            if (r0 == null) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x02ff, code lost:
        
            r0.f207578f.onDrawFrame(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x030a, code lost:
        
            if (r0.f207579g == null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x030c, code lost:
        
            r0 = r0.f207579g.f207912a;
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
        
            r0 = r1.f207628v.m221660d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x0326, code lost:
        
            if (r0 == 12288) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x032a, code lost:
        
            if (r0 == 12302) goto L160;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x032c, code lost:
        
            tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.e.m221654a("GLThread", "eglSwapBuffers", r0);
            r2 = tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x0339, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x033b, code lost:
        
            r1.f207613g = true;
            tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x0344, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x034c, code lost:
        
            tech.sud.runtime.component.p145h.C22435f.m221858c("GLThread", "egl context lost tid=" + getId());
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
        
            r1 = tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f207574c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x0427, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x0428, code lost:
        
            r0 = r2.f207629w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x0430, code lost:
        
            if (r0 == null) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x0432, code lost:
        
            r0.mo221647b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x0436, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x0438, code lost:
        
            r2.m221664d();
            r2.m221665e();
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
        private void m221666f() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1139
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d.f.m221666f():void");
        }

        /* JADX INFO: renamed from: g */
        private boolean m221667g() {
            if (this.f207611e || !this.f207612f || this.f207613g || this.f207619m <= 0 || this.f207620n <= 0) {
                return false;
            }
            return this.f207622p || this.f207621o == 1;
        }

        /* JADX INFO: renamed from: a */
        public void m221671a(C22417a c22417a, int i, int i2) {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    this.f207619m = i;
                    this.f207620n = i2;
                    this.f207626t = true;
                    this.f207622p = true;
                    boolean z = false;
                    this.f207624r = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    while (!this.f207609c && !this.f207611e && !this.f207624r && m221672a()) {
                        C22435f.m221858c("GLThread", "onWindowResize waiting for render complete from tid=" + getId());
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22435f.m221858c("GLThread", "onWindowResize 触发了anr监控");
                                    if (c22417a != null) {
                                        c22417a.m221740a("onGameANRDetected", "");
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
        public void m221674b(C22417a c22417a) {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    C22435f.m221858c("GLThread", "surfaceDestroyed tid=" + getId());
                    boolean z = false;
                    this.f207612f = false;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    while (!this.f207614h && !this.f207609c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                z = true;
                                C22435f.m221858c("GLThread", "surfaceDestroyed 触发了anr监控");
                                if (c22417a != null) {
                                    c22417a.m221740a("onGameANRDetected", "");
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
        public void m221676c(C22417a c22417a) {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    C22435f.m221858c("GLThread", "onPause tid=" + getId());
                    this.f207610d = true;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    boolean z = false;
                    while (!this.f207609c && !this.f207611e) {
                        C22435f.m221858c("GLThread", "onPause waiting for mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22435f.m221858c("GLThread", "onPause 触发了anr监控");
                                    if (c22417a != null) {
                                        c22417a.m221740a("onGameANRDetected", "");
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
        public void m221677d(C22417a c22417a) {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    C22435f.m221858c("GLThread", "onResume tid=" + getId());
                    boolean z = false;
                    this.f207610d = false;
                    this.f207622p = true;
                    this.f207624r = false;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    while (!this.f207609c && this.f207611e && !this.f207624r) {
                        C22435f.m221858c("GLThread", "onResume waiting for !mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22435f.m221858c("GLThread", "onResume 触发了anr监控");
                                    if (c22417a != null) {
                                        c22417a.m221740a("onGameANRDetected", "");
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
        public void m221678e(C22417a c22417a) {
            C22435f.m221858c("GLThread", "requestExitAndWait");
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    this.f207608b = true;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    boolean z = false;
                    while (!this.f207609c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22435f.m221858c("GLThread", "requestExitAndWait 触发了anr监控");
                                    if (c22417a != null) {
                                        c22417a.m221740a("onGameANRDetected", "");
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
            C22435f.m221858c("GLThread", "starting tid=" + getId());
            try {
                m221666f();
            } catch (InterruptedException unused) {
            } finally {
                TextureViewSurfaceTextureListenerC22410d.f207574c.m221679a(this);
            }
        }

        /* JADX INFO: renamed from: e */
        private void m221665e() {
            if (this.f207615i) {
                this.f207628v.m221662f();
                this.f207615i = false;
                TextureViewSurfaceTextureListenerC22410d.f207574c.m221680b(this);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m221673b() {
            int i;
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                i = this.f207621o;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m221675c() {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                this.f207622p = true;
                TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
            }
        }

        /* JADX INFO: renamed from: d */
        private void m221664d() {
            if (this.f207616j) {
                this.f207616j = false;
                this.f207628v.m221661e();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m221672a() {
            return this.f207615i && this.f207616j && m221667g();
        }

        /* JADX INFO: renamed from: a */
        public void m221668a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                    this.f207621o = i;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                }
                return;
            }
            ig3.m135964a("renderMode");
        }

        /* JADX INFO: renamed from: a */
        public void m221670a(C22417a c22417a) {
            synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                try {
                    C22435f.m221858c("GLThread", "surfaceCreated tid=" + getId());
                    this.f207612f = true;
                    boolean z = false;
                    this.f207617k = false;
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                    while (this.f207614h && !this.f207617k && !this.f207609c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22410d.f207574c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22410d.f207574c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22435f.m221858c("GLThread", "surfaceCreated 触发了anr监控");
                                    if (c22417a != null) {
                                        c22417a.m221740a("onGameANRDetected", "");
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
        public void m221669a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TextureViewSurfaceTextureListenerC22410d.f207574c) {
                    this.f207625s.add(runnable);
                    TextureViewSurfaceTextureListenerC22410d.f207574c.notifyAll();
                }
                return;
            }
            ig3.m135964a("r must not be null");
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        EGL10 f207601a;

        /* JADX INFO: renamed from: b */
        EGLDisplay f207602b;

        /* JADX INFO: renamed from: c */
        EGLSurface f207603c;

        /* JADX INFO: renamed from: d */
        EGLConfig f207604d;

        /* JADX INFO: renamed from: e */
        EGLContext f207605e;

        /* JADX INFO: renamed from: f */
        private WeakReference<TextureViewSurfaceTextureListenerC22410d> f207606f;

        public e(WeakReference<TextureViewSurfaceTextureListenerC22410d> weakReference) {
            this.f207606f = weakReference;
        }

        /* JADX INFO: renamed from: g */
        private void m221656g() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f207603c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f207601a.eglMakeCurrent(this.f207602b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TextureViewSurfaceTextureListenerC22410d textureViewSurfaceTextureListenerC22410d = this.f207606f.get();
            if (textureViewSurfaceTextureListenerC22410d != null) {
                textureViewSurfaceTextureListenerC22410d.f207583k.destroySurface(this.f207601a, this.f207602b, this.f207603c);
            }
            this.f207603c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m221657a() {
            C22435f.m221859d("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f207601a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f207602b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m194883a("eglGetDisplay failed");
                return;
            }
            if (!this.f207601a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m194883a("eglInitialize failed");
                return;
            }
            TextureViewSurfaceTextureListenerC22410d textureViewSurfaceTextureListenerC22410d = this.f207606f.get();
            if (textureViewSurfaceTextureListenerC22410d == null) {
                this.f207604d = null;
                this.f207605e = null;
            } else {
                this.f207604d = textureViewSurfaceTextureListenerC22410d.f207581i.chooseConfig(this.f207601a, this.f207602b);
                this.f207605e = textureViewSurfaceTextureListenerC22410d.f207582j.createContext(this.f207601a, this.f207602b, this.f207604d);
            }
            EGLContext eGLContext = this.f207605e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f207605e = null;
                m221652a("createContext");
            }
            C22435f.m221859d("EglHelper", "createContext " + this.f207605e + " tid=" + Thread.currentThread().getId());
            this.f207603c = null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m221658b() {
            C22435f.m221859d("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.f207601a == null) {
                upk0.m194883a("egl not initialized");
                return false;
            }
            if (this.f207602b == null) {
                upk0.m194883a("eglDisplay not initialized");
                return false;
            }
            if (this.f207604d == null) {
                upk0.m194883a("mEglConfig not initialized");
                return false;
            }
            m221656g();
            TextureViewSurfaceTextureListenerC22410d textureViewSurfaceTextureListenerC22410d = this.f207606f.get();
            if (textureViewSurfaceTextureListenerC22410d != null) {
                this.f207603c = textureViewSurfaceTextureListenerC22410d.f207583k.createWindowSurface(this.f207601a, this.f207602b, this.f207604d, textureViewSurfaceTextureListenerC22410d.getSurfaceTexture());
            } else {
                this.f207603c = null;
            }
            EGLSurface eGLSurface = this.f207603c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f207601a.eglGetError() == 12299) {
                    C22435f.m221860e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f207601a.eglMakeCurrent(this.f207602b, eGLSurface, eGLSurface, this.f207605e)) {
                return true;
            }
            m221654a("EGLHelper", "eglMakeCurrent", this.f207601a.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public GL m221659c() {
            GL gl = this.f207605e.getGL();
            TextureViewSurfaceTextureListenerC22410d textureViewSurfaceTextureListenerC22410d = this.f207606f.get();
            if (textureViewSurfaceTextureListenerC22410d != null) {
                if (textureViewSurfaceTextureListenerC22410d.f207584l != null) {
                    gl = textureViewSurfaceTextureListenerC22410d.f207584l.wrap(gl);
                }
                if ((textureViewSurfaceTextureListenerC22410d.f207585m & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (textureViewSurfaceTextureListenerC22410d.f207585m & 1) == 0 ? 0 : 1, (textureViewSurfaceTextureListenerC22410d.f207585m & 2) != 0 ? new h() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: d */
        public int m221660d() {
            return !this.f207601a.eglSwapBuffers(this.f207602b, this.f207603c) ? this.f207601a.eglGetError() : CommandMessage.COMMAND_BASE;
        }

        /* JADX INFO: renamed from: e */
        public void m221661e() {
            C22435f.m221859d("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            m221656g();
        }

        /* JADX INFO: renamed from: f */
        public void m221662f() {
            C22435f.m221859d("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f207605e != null) {
                TextureViewSurfaceTextureListenerC22410d textureViewSurfaceTextureListenerC22410d = this.f207606f.get();
                if (textureViewSurfaceTextureListenerC22410d != null) {
                    textureViewSurfaceTextureListenerC22410d.f207582j.destroyContext(this.f207601a, this.f207602b, this.f207605e);
                }
                this.f207605e = null;
            }
            EGLDisplay eGLDisplay = this.f207602b;
            if (eGLDisplay != null) {
                this.f207601a.eglTerminate(eGLDisplay);
                this.f207602b = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m221655b(String str, int i) {
            return str + " failed: " + TextureViewSurfaceTextureListenerC22410d.m221630a(i);
        }

        /* JADX INFO: renamed from: a */
        private void m221652a(String str) {
            m221653a(str, this.f207601a.eglGetError());
        }

        /* JADX INFO: renamed from: a */
        public static void m221653a(String str, int i) {
            String strM221655b = m221655b(str, i);
            C22435f.m221860e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM221655b);
            throw new RuntimeException(strM221655b);
        }

        /* JADX INFO: renamed from: a */
        public static void m221654a(String str, String str2, int i) {
            C22435f.m221859d(str, m221655b(str2, i));
        }
    }
}
