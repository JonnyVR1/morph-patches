package tech.sud.runtime.component.p144c;

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
import javax.microedition.khronos.opengles.GL10;
import p153l.azk0;
import p153l.wg3;
import p153l.wtq0;
import tech.sud.runtime.component.p145d.C22532a;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.C22560d;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.d */
/* JADX INFO: loaded from: classes3.dex */
public class TextureViewSurfaceTextureListenerC22525d extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    private static final String f208495a = "d";

    /* JADX INFO: renamed from: c */
    private static final g f208496c = new g();

    /* JADX INFO: renamed from: b */
    private C22532a f208497b;

    /* JADX INFO: renamed from: d */
    private final WeakReference<TextureViewSurfaceTextureListenerC22525d> f208498d;

    /* JADX INFO: renamed from: e */
    private f f208499e;

    /* JADX INFO: renamed from: f */
    private GLSurfaceView.Renderer f208500f;

    /* JADX INFO: renamed from: g */
    private C22560d.a f208501g;

    /* JADX INFO: renamed from: h */
    private boolean f208502h;

    /* JADX INFO: renamed from: i */
    private GLSurfaceView.EGLConfigChooser f208503i;

    /* JADX INFO: renamed from: j */
    private GLSurfaceView.EGLContextFactory f208504j;

    /* JADX INFO: renamed from: k */
    private GLSurfaceView.EGLWindowSurfaceFactory f208505k;

    /* JADX INFO: renamed from: l */
    private GLSurfaceView.GLWrapper f208506l;

    /* JADX INFO: renamed from: m */
    private int f208507m;

    /* JADX INFO: renamed from: n */
    private int f208508n;

    /* JADX INFO: renamed from: o */
    private boolean f208509o;

    /* JADX INFO: renamed from: p */
    private final List<TextureView.SurfaceTextureListener> f208510p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$a */
    public abstract class a implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: a */
        protected int[] f208511a;

        public a(int[] iArr) {
            this.f208511a = m222895a(iArr);
        }

        /* JADX INFO: renamed from: a */
        private int[] m222895a(int[] iArr) {
            if (TextureViewSurfaceTextureListenerC22525d.this.f208508n != 2 && TextureViewSurfaceTextureListenerC22525d.this.f208508n != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (TextureViewSurfaceTextureListenerC22525d.this.f208508n == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        /* JADX INFO: renamed from: a */
        public abstract EGLConfig mo222896a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f208511a, null, 0, iArr)) {
                wg3.m206174a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f208511a, eGLConfigArr, i, iArr)) {
                wg3.m206174a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigMo222896a = mo222896a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigMo222896a != null) {
                return eGLConfigMo222896a;
            }
            wg3.m206174a("No config chosen");
            return null;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$c */
    public class c implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: b */
        private int f208522b;

        private c() {
            this.f208522b = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f208522b, TextureViewSurfaceTextureListenerC22525d.this.f208508n, 12344};
            if (TextureViewSurfaceTextureListenerC22525d.this.f208508n == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            C22550f.m223106e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            StringBuilder sb = new StringBuilder("tid=");
            sb.append(Thread.currentThread().getId());
            C22550f.m223104c("DefaultContextFactory", sb.toString());
            e.m222899a("eglDestroyContex", egl10.eglGetError());
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
                C22550f.m223103b(TextureViewSurfaceTextureListenerC22525d.f208495a, "eglCreateWindowSurface", e);
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
        private static String f208552a = "GLThreadManager";

        private g() {
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m222925a(f fVar) {
            C22550f.m223104c(f208552a, "exiting tid=" + fVar.getId());
            fVar.f208531c = true;
            notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m222926b(f fVar) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$h */
    public static class h extends Writer {

        /* JADX INFO: renamed from: a */
        private StringBuilder f208553a = new StringBuilder();

        /* JADX INFO: renamed from: a */
        private void m222927a() {
            if (this.f208553a.length() > 0) {
                C22550f.m223099a("GLTextureView", this.f208553a.toString());
                StringBuilder sb = this.f208553a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m222927a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m222927a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m222927a();
                } else {
                    this.f208553a.append(c);
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

    public TextureViewSurfaceTextureListenerC22525d(Context context) {
        super(context);
        this.f208498d = new WeakReference<>(this);
        this.f208510p = new ArrayList();
        m222884e();
    }

    /* JADX INFO: renamed from: a */
    public static String m222876a(int i2) {
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
                return m222878b(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m222878b(int i2) {
        return "0x" + Integer.toHexString(i2);
    }

    /* JADX INFO: renamed from: e */
    private void m222884e() {
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: f */
    private void m222886f() {
        if (this.f208499e == null) {
            return;
        }
        wtq0.m207906a("setRenderer has already been called for this instance.");
    }

    /* JADX INFO: renamed from: a_ */
    public void m222892a_() {
        this.f208499e.m222921c();
    }

    public void finalize() throws Throwable {
        C22550f.m223102b(f208495a, "finalize");
        try {
            f fVar = this.f208499e;
            if (fVar != null) {
                fVar.m222924e(this.f208497b);
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f208507m;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f208509o;
    }

    public int getRenderMode() {
        return this.f208499e.m222919b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22550f.m223102b(f208495a, "onAttachedToWindow reattach =" + this.f208502h);
        if (this.f208502h && this.f208500f != null) {
            C22532a c22532a = this.f208497b;
            if (c22532a != null) {
                c22532a.m222986a("GameViewOnAttachedToWindowReload", "");
                this.f208502h = false;
                return;
            }
            f fVar = this.f208499e;
            int iM222919b = fVar != null ? fVar.m222919b() : 1;
            f fVar2 = new f(this.f208498d);
            this.f208499e = fVar2;
            if (iM222919b != 1) {
                fVar2.m222914a(iM222919b);
            }
            this.f208499e.start();
        }
        this.f208502h = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        C22550f.m223102b(f208495a, "onDetachedFromWindow");
        f fVar = this.f208499e;
        if (fVar != null) {
            fVar.m222924e(this.f208497b);
        }
        this.f208502h = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m222891a(getSurfaceTexture(), 0, i4 - i2, i5 - i3);
    }

    public void onPause() {
        this.f208499e.m222922c(this.f208497b);
    }

    public void onResume() {
        this.f208499e.m222923d(this.f208497b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C22532a c22532a = this.f208497b;
        if (c22532a != null) {
            c22532a.m222986a("GameViewOnSurfaceCreated", "");
        }
        mo222890a(surfaceTexture);
        m222891a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f208510p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureAvailable(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C22532a c22532a = this.f208497b;
        if (c22532a != null) {
            c22532a.m222986a("GameViewOnSurfaceDestroyed", "");
        }
        mo222894b(surfaceTexture);
        Iterator<TextureView.SurfaceTextureListener> it = this.f208510p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        m222891a(surfaceTexture, 0, i2, i3);
        Iterator<TextureView.SurfaceTextureListener> it = this.f208510p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        m222892a_();
        Iterator<TextureView.SurfaceTextureListener> it = this.f208510p.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void queueEvent(Runnable runnable) {
        this.f208499e.m222915a(runnable);
    }

    public void setDebugFlags(int i2) {
        this.f208507m = i2;
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
        setEGLConfigChooser(new b(i2, i3, i4, i5, i6, i7));
    }

    public void setEGLContextClientVersion(int i2) {
        m222886f();
        this.f208508n = i2;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        m222886f();
        this.f208504j = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        m222886f();
        this.f208505k = eGLWindowSurfaceFactory;
    }

    public void setExternalInterface(C22532a c22532a) {
        this.f208497b = c22532a;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f208506l = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f208509o = z;
    }

    public void setRenderMode(int i2) {
        this.f208499e.m222914a(i2);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        m222886f();
        if (this.f208503i == null) {
            this.f208503i = new i(true);
        }
        if (this.f208504j == null) {
            this.f208504j = new c();
        }
        if (this.f208505k == null) {
            this.f208505k = new d();
        }
        this.f208500f = renderer;
        if (renderer instanceof C22560d) {
            this.f208501g = ((C22560d) renderer).m223226f();
        }
        f fVar = new f(this.f208498d);
        this.f208499e = fVar;
        fVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new i(z));
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        m222886f();
        this.f208503i = eGLConfigChooser;
    }

    /* JADX INFO: renamed from: b */
    public void mo222894b(SurfaceTexture surfaceTexture) {
        this.f208499e.m222920b(this.f208497b);
    }

    /* JADX INFO: renamed from: b */
    public void mo222893b() {
    }

    /* JADX INFO: renamed from: a */
    public void mo222890a(SurfaceTexture surfaceTexture) {
        this.f208499e.m222916a(this.f208497b);
    }

    /* JADX INFO: renamed from: a */
    public void m222891a(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
        this.f208499e.m222917a(this.f208497b, i3, i4);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$b */
    public class b extends a {

        /* JADX INFO: renamed from: c */
        protected int f208513c;

        /* JADX INFO: renamed from: d */
        protected int f208514d;

        /* JADX INFO: renamed from: e */
        protected int f208515e;

        /* JADX INFO: renamed from: f */
        protected int f208516f;

        /* JADX INFO: renamed from: g */
        protected int f208517g;

        /* JADX INFO: renamed from: h */
        protected int f208518h;

        /* JADX INFO: renamed from: j */
        private int[] f208520j;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f208520j = new int[1];
            this.f208513c = i;
            this.f208514d = i2;
            this.f208515e = i3;
            this.f208516f = i4;
            this.f208517g = i5;
            this.f208518h = i6;
        }

        @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.a
        /* JADX INFO: renamed from: a */
        public EGLConfig mo222896a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                b bVar = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iM222897a = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iM222897a2 = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iM222897a >= bVar.f208517g && iM222897a2 >= bVar.f208518h) {
                    int iM222897a3 = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iM222897a4 = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iM222897a5 = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iM222897a6 = bVar.m222897a(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iM222897a3 == bVar.f208513c && iM222897a4 == bVar.f208514d && iM222897a5 == bVar.f208515e && iM222897a6 == bVar.f208516f) {
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
        private int m222897a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f208520j) ? this.f208520j[0] : i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$f */
    public static class f extends Thread {

        /* JADX INFO: renamed from: b */
        private boolean f208530b;

        /* JADX INFO: renamed from: c */
        private boolean f208531c;

        /* JADX INFO: renamed from: d */
        private boolean f208532d;

        /* JADX INFO: renamed from: e */
        private boolean f208533e;

        /* JADX INFO: renamed from: f */
        private boolean f208534f;

        /* JADX INFO: renamed from: g */
        private boolean f208535g;

        /* JADX INFO: renamed from: h */
        private boolean f208536h;

        /* JADX INFO: renamed from: i */
        private boolean f208537i;

        /* JADX INFO: renamed from: j */
        private boolean f208538j;

        /* JADX INFO: renamed from: k */
        private boolean f208539k;

        /* JADX INFO: renamed from: l */
        private boolean f208540l;

        /* JADX INFO: renamed from: r */
        private boolean f208546r;

        /* JADX INFO: renamed from: v */
        private e f208550v;

        /* JADX INFO: renamed from: w */
        private WeakReference<TextureViewSurfaceTextureListenerC22525d> f208551w;

        /* JADX INFO: renamed from: a */
        private final String f208529a = "GLThread";

        /* JADX INFO: renamed from: s */
        private ArrayList<Runnable> f208547s = new ArrayList<>();

        /* JADX INFO: renamed from: t */
        private boolean f208548t = true;

        /* JADX INFO: renamed from: u */
        private Runnable f208549u = null;

        /* JADX INFO: renamed from: m */
        private int f208541m = 0;

        /* JADX INFO: renamed from: n */
        private int f208542n = 0;

        /* JADX INFO: renamed from: p */
        private boolean f208544p = true;

        /* JADX INFO: renamed from: o */
        private int f208543o = 1;

        /* JADX INFO: renamed from: q */
        private boolean f208545q = false;

        public f(WeakReference<TextureViewSurfaceTextureListenerC22525d> weakReference) {
            this.f208551w = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:203:0x0463 A[Catch: all -> 0x0467, TryCatch #2 {all -> 0x0467, blocks: (B:201:0x0459, B:203:0x0463, B:206:0x0469, B:207:0x046f), top: B:214:0x0459 }] */
        /* JADX WARN: Code duplicated, block: B:214:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0250, code lost:
        
            if (r5 == false) goto L238;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0252, code lost:
        
            tech.sud.runtime.component.p149h.C22550f.m223105d("GLThread", "egl createSurface");
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x025f, code lost:
        
            if (r1.f208550v.m222904b() == false) goto L240;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0261, code lost:
        
            r3 = tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0265, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0267, code lost:
        
            r1.f208539k = true;
            tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0270, code lost:
        
            monitor-exit(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0271, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0276, code lost:
        
            r3 = tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
        
            monitor-enter(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x027c, code lost:
        
            r1.f208539k = true;
            r1.f208535g = true;
            tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
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
        
            r3 = (javax.microedition.khronos.opengles.GL10) r1.f208550v.m222905c();
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
        
            r3 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x029f, code lost:
        
            if (r4 == false) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
        
            tech.sud.runtime.component.p149h.C22550f.m223105d("GLThread", "onSurfaceCreated");
            r0 = r1.f208551w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x02b0, code lost:
        
            if (r0 == null) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
        
            r0.f208500f.onSurfaceCreated(r3, r1.f208550v.f208526d);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
        
            r4 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x02be, code lost:
        
            if (r8 == false) goto L216;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
        
            tech.sud.runtime.component.p149h.C22550f.m223105d("GLThread", "onSurfaceChanged(" + r12 + ", " + r13 + ")");
            r0 = r1.f208551w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x02eb, code lost:
        
            if (r0 == null) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x02ed, code lost:
        
            r0.f208500f.onSurfaceChanged(r3, r12, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x02f4, code lost:
        
            r8 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x02f5, code lost:
        
            r0 = r1.f208551w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x02fd, code lost:
        
            if (r0 == null) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x02ff, code lost:
        
            r0.f208500f.onDrawFrame(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x030a, code lost:
        
            if (r0.f208501g == null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x030c, code lost:
        
            r0 = r0.f208501g.f208834a;
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
        
            r0 = r1.f208550v.m222906d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x0326, code lost:
        
            if (r0 == 12288) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x032a, code lost:
        
            if (r0 == 12302) goto L160;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x032c, code lost:
        
            tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.e.m222900a("GLThread", "eglSwapBuffers", r0);
            r2 = tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x0339, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x033b, code lost:
        
            r1.f208535g = true;
            tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x0344, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x034c, code lost:
        
            tech.sud.runtime.component.p149h.C22550f.m223104c("GLThread", "egl context lost tid=" + getId());
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
        
            r1 = tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d.f208496c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x0427, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x0428, code lost:
        
            r0 = r2.f208551w.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x0430, code lost:
        
            if (r0 == null) goto L188;
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x0432, code lost:
        
            r0.mo222893b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x0436, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x0438, code lost:
        
            r2.m222910d();
            r2.m222911e();
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
        */
        private void m222912f() throws Throwable {
            f fVar;
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d;
            Runnable runnable;
            boolean z;
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d2;
            f fVar2 = this;
            fVar2.f208550v = new e(fVar2.f208551w);
            fVar2.f208537i = false;
            fVar2.f208538j = false;
            fVar2.f208545q = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            GL10 gl10 = null;
            Runnable runnableRemove = null;
            Runnable runnable2 = null;
            while (true) {
                try {
                    synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                        while (true) {
                            try {
                                if (!fVar2.f208530b) {
                                    if (!fVar2.f208547s.isEmpty()) {
                                        runnableRemove = fVar2.f208547s.remove(0);
                                        gl10 = gl10;
                                        runnable = null;
                                        break;
                                    }
                                    boolean z10 = fVar2.f208533e;
                                    boolean z11 = fVar2.f208532d;
                                    if (z10 != z11) {
                                        fVar2.f208533e = z11;
                                        TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                        z = z11;
                                        C22550f.m223104c("GLThread", "mPaused is now " + fVar2.f208533e + " tid=" + fVar2.getId());
                                    } else {
                                        z = false;
                                    }
                                    if (fVar2.f208540l) {
                                        C22550f.m223104c("GLThread", "releasing EGL context because asked to tid=" + fVar2.getId());
                                        fVar2.m222910d();
                                        fVar2.m222911e();
                                        fVar2.f208540l = false;
                                        z9 = true;
                                    }
                                    if (z5) {
                                        fVar2.m222910d();
                                        fVar2.m222911e();
                                        z5 = false;
                                    }
                                    if (z && fVar2.f208538j) {
                                        C22550f.m223104c("GLThread", "releasing EGL surface because paused tid=" + fVar2.getId());
                                        fVar2.m222910d();
                                    }
                                    if (z && fVar2.f208537i && ((textureViewSurfaceTextureListenerC22525d2 = fVar2.f208551w.get()) == null || !textureViewSurfaceTextureListenerC22525d2.f208509o)) {
                                        fVar2.m222911e();
                                        C22550f.m223104c("GLThread", "releasing EGL context because paused tid=" + fVar2.getId());
                                    }
                                    if (!fVar2.f208534f && !fVar2.f208536h) {
                                        C22550f.m223104c("GLThread", "noticed textureView surface lost tid=" + fVar2.getId());
                                        if (fVar2.f208538j) {
                                            fVar2.m222910d();
                                        }
                                        fVar2.f208536h = true;
                                        fVar2.f208535g = false;
                                        TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                    }
                                    if (fVar2.f208534f && fVar2.f208536h) {
                                        C22550f.m223104c("GLThread", "noticed textureView surface acquired tid=" + fVar2.getId());
                                        fVar2.f208536h = false;
                                        TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                    }
                                    if (z8) {
                                        C22550f.m223104c("GLThread", "sending render notification tid=" + fVar2.getId());
                                        fVar2.f208545q = false;
                                        fVar2.f208546r = true;
                                        TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                        z8 = false;
                                    }
                                    Runnable runnable3 = fVar2.f208549u;
                                    if (runnable3 != null) {
                                        runnable = null;
                                        fVar2.f208549u = null;
                                        runnable2 = runnable3;
                                    } else {
                                        runnable = null;
                                    }
                                    if (fVar2.m222913g()) {
                                        if (fVar2.f208537i) {
                                            z2 = z2;
                                        } else if (z9) {
                                            z2 = z2;
                                            z9 = false;
                                        } else {
                                            try {
                                                fVar2.f208550v.m222903a();
                                                fVar2.f208537i = true;
                                                TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                                z2 = true;
                                            } catch (RuntimeException e) {
                                                TextureViewSurfaceTextureListenerC22525d.f208496c.m222926b(fVar2);
                                                throw e;
                                            }
                                        }
                                        if (fVar2.f208537i && !fVar2.f208538j) {
                                            fVar2.f208538j = true;
                                            z3 = true;
                                            z4 = true;
                                            z6 = true;
                                        }
                                        if (fVar2.f208538j) {
                                            if (fVar2.f208548t) {
                                                i = fVar2.f208541m;
                                                i2 = fVar2.f208542n;
                                                fVar2.f208545q = true;
                                                C22550f.m223104c("GLThread", "noticing that we want render notification tid=" + fVar2.getId());
                                                fVar2.f208548t = false;
                                                z3 = true;
                                                z6 = true;
                                            }
                                            fVar2.f208544p = false;
                                            TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                                            z2 = z2;
                                            if (!fVar2.f208545q) {
                                                break;
                                            }
                                            z7 = true;
                                            break;
                                        }
                                    } else if (runnable2 != null) {
                                        C22550f.m223105d("GLThread", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                        runnable2.run();
                                        z2 = z2;
                                        runnable2 = null;
                                    } else {
                                        z2 = z2;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("waiting tid=");
                                    sb.append(getId());
                                    sb.append(" mHaveEglContext: ");
                                    fVar = this;
                                    try {
                                        sb.append(fVar.f208537i);
                                        sb.append(" mHaveEglSurface: ");
                                        sb.append(fVar.f208538j);
                                        sb.append(" mFinishedCreatingEglSurface: ");
                                        sb.append(fVar.f208539k);
                                        sb.append(" mPaused: ");
                                        sb.append(fVar.f208533e);
                                        sb.append(" mHasSurface: ");
                                        sb.append(fVar.f208534f);
                                        sb.append(" mSurfaceIsBad: ");
                                        sb.append(fVar.f208535g);
                                        sb.append(" mWaitingForSurface: ");
                                        sb.append(fVar.f208536h);
                                        sb.append(" mWidth: ");
                                        sb.append(fVar.f208541m);
                                        sb.append(" mHeight: ");
                                        sb.append(fVar.f208542n);
                                        sb.append(" mRequestRender: ");
                                        sb.append(fVar.f208544p);
                                        sb.append(" mRenderMode: ");
                                        sb.append(fVar.f208543o);
                                        C22550f.m223104c("GLThread", sb.toString());
                                        if (!fVar.f208530b) {
                                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                                            fVar2 = fVar;
                                            gl10 = gl10;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                                                try {
                                                    textureViewSurfaceTextureListenerC22525d = fVar.f208551w.get();
                                                    if (textureViewSurfaceTextureListenerC22525d != null) {
                                                        textureViewSurfaceTextureListenerC22525d.mo222893b();
                                                    }
                                                    fVar.m222910d();
                                                    fVar.m222911e();
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fVar = fVar2;
                            }
                        }
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            fVar = this;
                            throw th;
                        }
                    }
                    synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                        try {
                            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d3 = fVar2.f208551w.get();
                            if (textureViewSurfaceTextureListenerC22525d3 != null) {
                                textureViewSurfaceTextureListenerC22525d3.mo222893b();
                            }
                            fVar2.m222910d();
                            fVar2.m222911e();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    fVar = fVar2;
                    synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                        textureViewSurfaceTextureListenerC22525d = fVar.f208551w.get();
                        if (textureViewSurfaceTextureListenerC22525d != null) {
                            textureViewSurfaceTextureListenerC22525d.mo222893b();
                        }
                        fVar.m222910d();
                        fVar.m222911e();
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        private boolean m222913g() {
            if (this.f208533e || !this.f208534f || this.f208535g || this.f208541m <= 0 || this.f208542n <= 0) {
                return false;
            }
            return this.f208544p || this.f208543o == 1;
        }

        /* JADX INFO: renamed from: a */
        public void m222917a(C22532a c22532a, int i, int i2) {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    this.f208541m = i;
                    this.f208542n = i2;
                    this.f208548t = true;
                    this.f208544p = true;
                    boolean z = false;
                    this.f208546r = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    while (!this.f208531c && !this.f208533e && !this.f208546r && m222918a()) {
                        C22550f.m223104c("GLThread", "onWindowResize waiting for render complete from tid=" + getId());
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22550f.m223104c("GLThread", "onWindowResize 触发了anr监控");
                                    if (c22532a != null) {
                                        c22532a.m222986a("onGameANRDetected", "");
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
        public void m222920b(C22532a c22532a) {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    C22550f.m223104c("GLThread", "surfaceDestroyed tid=" + getId());
                    boolean z = false;
                    this.f208534f = false;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    while (!this.f208536h && !this.f208531c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                z = true;
                                C22550f.m223104c("GLThread", "surfaceDestroyed 触发了anr监控");
                                if (c22532a != null) {
                                    c22532a.m222986a("onGameANRDetected", "");
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
        public void m222922c(C22532a c22532a) {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    C22550f.m223104c("GLThread", "onPause tid=" + getId());
                    this.f208532d = true;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    boolean z = false;
                    while (!this.f208531c && !this.f208533e) {
                        C22550f.m223104c("GLThread", "onPause waiting for mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22550f.m223104c("GLThread", "onPause 触发了anr监控");
                                    if (c22532a != null) {
                                        c22532a.m222986a("onGameANRDetected", "");
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
        public void m222923d(C22532a c22532a) {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    C22550f.m223104c("GLThread", "onResume tid=" + getId());
                    boolean z = false;
                    this.f208532d = false;
                    this.f208544p = true;
                    this.f208546r = false;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    while (!this.f208531c && this.f208533e && !this.f208546r) {
                        C22550f.m223104c("GLThread", "onResume waiting for !mPaused.");
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22550f.m223104c("GLThread", "onResume 触发了anr监控");
                                    if (c22532a != null) {
                                        c22532a.m222986a("onGameANRDetected", "");
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
        public void m222924e(C22532a c22532a) {
            C22550f.m223104c("GLThread", "requestExitAndWait");
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    this.f208530b = true;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    boolean z = false;
                    while (!this.f208531c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22550f.m223104c("GLThread", "requestExitAndWait 触发了anr监控");
                                    if (c22532a != null) {
                                        c22532a.m222986a("onGameANRDetected", "");
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
            C22550f.m223104c("GLThread", "starting tid=" + getId());
            try {
                m222912f();
            } catch (InterruptedException unused) {
            } finally {
                TextureViewSurfaceTextureListenerC22525d.f208496c.m222925a(this);
            }
        }

        /* JADX INFO: renamed from: e */
        private void m222911e() {
            if (this.f208537i) {
                this.f208550v.m222908f();
                this.f208537i = false;
                TextureViewSurfaceTextureListenerC22525d.f208496c.m222926b(this);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m222919b() {
            int i;
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                i = this.f208543o;
            }
            return i;
        }

        /* JADX INFO: renamed from: c */
        public void m222921c() {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                this.f208544p = true;
                TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
            }
        }

        /* JADX INFO: renamed from: d */
        private void m222910d() {
            if (this.f208538j) {
                this.f208538j = false;
                this.f208550v.m222907e();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m222918a() {
            return this.f208537i && this.f208538j && m222913g();
        }

        /* JADX INFO: renamed from: a */
        public void m222914a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                    this.f208543o = i;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                }
                return;
            }
            wg3.m206174a("renderMode");
        }

        /* JADX INFO: renamed from: a */
        public void m222916a(C22532a c22532a) {
            synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                try {
                    C22550f.m223104c("GLThread", "surfaceCreated tid=" + getId());
                    this.f208534f = true;
                    boolean z = false;
                    this.f208539k = false;
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                    while (this.f208536h && !this.f208539k && !this.f208531c) {
                        if (z) {
                            try {
                                TextureViewSurfaceTextureListenerC22525d.f208496c.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            long jNanoTime = System.nanoTime() / 1000000;
                            TextureViewSurfaceTextureListenerC22525d.f208496c.wait(4000L);
                            if ((System.nanoTime() / 1000000) - jNanoTime >= 4000) {
                                try {
                                    C22550f.m223104c("GLThread", "surfaceCreated 触发了anr监控");
                                    if (c22532a != null) {
                                        c22532a.m222986a("onGameANRDetected", "");
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
        public void m222915a(Runnable runnable) {
            if (runnable != null) {
                synchronized (TextureViewSurfaceTextureListenerC22525d.f208496c) {
                    this.f208547s.add(runnable);
                    TextureViewSurfaceTextureListenerC22525d.f208496c.notifyAll();
                }
                return;
            }
            wg3.m206174a("r must not be null");
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        EGL10 f208523a;

        /* JADX INFO: renamed from: b */
        EGLDisplay f208524b;

        /* JADX INFO: renamed from: c */
        EGLSurface f208525c;

        /* JADX INFO: renamed from: d */
        EGLConfig f208526d;

        /* JADX INFO: renamed from: e */
        EGLContext f208527e;

        /* JADX INFO: renamed from: f */
        private WeakReference<TextureViewSurfaceTextureListenerC22525d> f208528f;

        public e(WeakReference<TextureViewSurfaceTextureListenerC22525d> weakReference) {
            this.f208528f = weakReference;
        }

        /* JADX INFO: renamed from: g */
        private void m222902g() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f208525c;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f208523a.eglMakeCurrent(this.f208524b, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d = this.f208528f.get();
            if (textureViewSurfaceTextureListenerC22525d != null) {
                textureViewSurfaceTextureListenerC22525d.f208505k.destroySurface(this.f208523a, this.f208524b, this.f208525c);
            }
            this.f208525c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m222903a() {
            C22550f.m223105d("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f208523a = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f208524b = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                azk0.m101074a("eglGetDisplay failed");
                return;
            }
            if (!this.f208523a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                azk0.m101074a("eglInitialize failed");
                return;
            }
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d = this.f208528f.get();
            if (textureViewSurfaceTextureListenerC22525d == null) {
                this.f208526d = null;
                this.f208527e = null;
            } else {
                this.f208526d = textureViewSurfaceTextureListenerC22525d.f208503i.chooseConfig(this.f208523a, this.f208524b);
                this.f208527e = textureViewSurfaceTextureListenerC22525d.f208504j.createContext(this.f208523a, this.f208524b, this.f208526d);
            }
            EGLContext eGLContext = this.f208527e;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f208527e = null;
                m222898a("createContext");
            }
            C22550f.m223105d("EglHelper", "createContext " + this.f208527e + " tid=" + Thread.currentThread().getId());
            this.f208525c = null;
        }

        /* JADX INFO: renamed from: b */
        public boolean m222904b() {
            C22550f.m223105d("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.f208523a == null) {
                azk0.m101074a("egl not initialized");
                return false;
            }
            if (this.f208524b == null) {
                azk0.m101074a("eglDisplay not initialized");
                return false;
            }
            if (this.f208526d == null) {
                azk0.m101074a("mEglConfig not initialized");
                return false;
            }
            m222902g();
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d = this.f208528f.get();
            if (textureViewSurfaceTextureListenerC22525d != null) {
                this.f208525c = textureViewSurfaceTextureListenerC22525d.f208505k.createWindowSurface(this.f208523a, this.f208524b, this.f208526d, textureViewSurfaceTextureListenerC22525d.getSurfaceTexture());
            } else {
                this.f208525c = null;
            }
            EGLSurface eGLSurface = this.f208525c;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f208523a.eglGetError() == 12299) {
                    C22550f.m223106e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f208523a.eglMakeCurrent(this.f208524b, eGLSurface, eGLSurface, this.f208527e)) {
                return true;
            }
            m222900a("EGLHelper", "eglMakeCurrent", this.f208523a.eglGetError());
            return false;
        }

        /* JADX INFO: renamed from: c */
        public GL m222905c() {
            GL gl = this.f208527e.getGL();
            TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d = this.f208528f.get();
            if (textureViewSurfaceTextureListenerC22525d != null) {
                if (textureViewSurfaceTextureListenerC22525d.f208506l != null) {
                    gl = textureViewSurfaceTextureListenerC22525d.f208506l.wrap(gl);
                }
                if ((textureViewSurfaceTextureListenerC22525d.f208507m & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (textureViewSurfaceTextureListenerC22525d.f208507m & 1) == 0 ? 0 : 1, (textureViewSurfaceTextureListenerC22525d.f208507m & 2) != 0 ? new h() : null);
                }
            }
            return gl;
        }

        /* JADX INFO: renamed from: d */
        public int m222906d() {
            return !this.f208523a.eglSwapBuffers(this.f208524b, this.f208525c) ? this.f208523a.eglGetError() : CommandMessage.COMMAND_BASE;
        }

        /* JADX INFO: renamed from: e */
        public void m222907e() {
            C22550f.m223105d("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            m222902g();
        }

        /* JADX INFO: renamed from: f */
        public void m222908f() {
            C22550f.m223105d("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f208527e != null) {
                TextureViewSurfaceTextureListenerC22525d textureViewSurfaceTextureListenerC22525d = this.f208528f.get();
                if (textureViewSurfaceTextureListenerC22525d != null) {
                    textureViewSurfaceTextureListenerC22525d.f208504j.destroyContext(this.f208523a, this.f208524b, this.f208527e);
                }
                this.f208527e = null;
            }
            EGLDisplay eGLDisplay = this.f208524b;
            if (eGLDisplay != null) {
                this.f208523a.eglTerminate(eGLDisplay);
                this.f208524b = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m222901b(String str, int i) {
            return str + " failed: " + TextureViewSurfaceTextureListenerC22525d.m222876a(i);
        }

        /* JADX INFO: renamed from: a */
        private void m222898a(String str) {
            m222899a(str, this.f208523a.eglGetError());
        }

        /* JADX INFO: renamed from: a */
        public static void m222899a(String str, int i) {
            String strM222901b = m222901b(str, i);
            C22550f.m223106e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM222901b);
            throw new RuntimeException(strM222901b);
        }

        /* JADX INFO: renamed from: a */
        public static void m222900a(String str, String str2, int i) {
            C22550f.m223105d(str, m222901b(str2, i));
        }
    }
}
