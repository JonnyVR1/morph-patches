package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import l.n8c;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.fcj;
import p003l.ldq0;
import p003l.obj;
import p003l.pcj;
import p003l.rkw;
import p003l.ts2;
import p003l.vbj;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class ScreenRender {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f12171a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f12172b;

    /* JADX INFO: renamed from: c */
    vbj f12173c;

    /* JADX INFO: renamed from: d */
    rkw f12174d;

    /* JADX INFO: renamed from: e */
    ldq0 f12175e;

    /* JADX INFO: renamed from: f */
    obj f12176f;

    /* JADX INFO: renamed from: g */
    pcj f12177g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f12178h;

    /* JADX INFO: renamed from: i */
    ldq0.InterfaceC0404a f12179i;

    /* JADX INFO: renamed from: k */
    private SurfaceTexture f12181k;

    /* JADX INFO: renamed from: l */
    private ts2 f12182l;

    /* JADX INFO: renamed from: m */
    private fcj f12183m;

    /* JADX INFO: renamed from: n */
    private VideoQuality f12184n;

    /* JADX INFO: renamed from: o */
    private int f12185o;

    /* JADX INFO: renamed from: p */
    private int f12186p;

    /* JADX INFO: renamed from: u */
    private boolean f12191u;

    /* JADX INFO: renamed from: x */
    private final Queue<Runnable> f12194x;

    /* JADX INFO: renamed from: y */
    private final Queue<Runnable> f12195y;

    /* JADX INFO: renamed from: j */
    private int f12180j = -12345;

    /* JADX INFO: renamed from: q */
    private int f12187q = 480;

    /* JADX INFO: renamed from: r */
    private int f12188r = 640;

    /* JADX INFO: renamed from: s */
    private float f12189s = 1.0f;

    /* JADX INFO: renamed from: t */
    private PointF f12190t = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: v */
    private int f12192v = 0;

    /* JADX INFO: renamed from: w */
    private int f12193w = 0;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$1 */
    class RunnableC12941 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ldq0.InterfaceC0404a f12196a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ScreenRender f12197b;

        @Override // java.lang.Runnable
        public void run() {
            ldq0.InterfaceC0404a interfaceC0404a = this.f12196a;
            ScreenRender screenRender = this.f12197b;
            if (interfaceC0404a != null) {
                screenRender.f12179i = interfaceC0404a;
                if (screenRender.f12175e == null) {
                    screenRender.f12175e = new ldq0();
                    ScreenRender screenRender2 = this.f12197b;
                    screenRender2.f12175e.setRenderSize(screenRender2.f12185o, this.f12197b.f12186p);
                    ScreenRender screenRender3 = this.f12197b;
                    GLMergeTextureFilter gLMergeTextureFilter = screenRender3.f12178h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.addTarget(screenRender3.f12175e);
                    } else {
                        pcj pcjVar = screenRender3.f12177g;
                        if (pcjVar.f6360a) {
                            pcjVar.addTarget(screenRender3.f12175e);
                        } else {
                            screenRender3.f12176f.addTarget(screenRender3.f12175e);
                        }
                    }
                }
                ScreenRender screenRender4 = this.f12197b;
                ldq0 ldq0Var = screenRender4.f12175e;
                if (ldq0Var != null) {
                    ldq0Var.f5263a = screenRender4.f12179i;
                    return;
                }
                return;
            }
            ldq0 ldq0Var2 = screenRender.f12175e;
            if (ldq0Var2 != null) {
                GLMergeTextureFilter gLMergeTextureFilter2 = screenRender.f12178h;
                if (gLMergeTextureFilter2 != null) {
                    gLMergeTextureFilter2.removeTarget(ldq0Var2);
                } else {
                    pcj pcjVar2 = screenRender.f12177g;
                    if (pcjVar2.f6360a) {
                        pcjVar2.removeTarget(ldq0Var2);
                    } else {
                        screenRender.f12176f.removeTarget(ldq0Var2);
                    }
                }
                ScreenRender screenRender5 = this.f12197b;
                screenRender5.f12173c.m8351a(screenRender5.f12175e);
                ScreenRender screenRender6 = this.f12197b;
                if (screenRender6.f12178h != null) {
                    screenRender6.f12178h = null;
                } else if (screenRender6.f12177g.f6360a) {
                    screenRender6.f12177g = null;
                } else {
                    screenRender6.f12176f = null;
                }
                screenRender6.f12175e = null;
            }
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$2 */
    class RunnableC12952 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f12198a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f12199b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f12200c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f12201d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ScreenRender f12202e;

        @Override // java.lang.Runnable
        public void run() {
            this.f12202e.m10986v();
            int i = this.f12198a;
            if (i == 90 || i == 270) {
                this.f12202e.f12188r = this.f12199b;
                this.f12202e.f12187q = this.f12200c;
            } else {
                this.f12202e.f12187q = this.f12199b;
                this.f12202e.f12188r = this.f12200c;
            }
            ScreenRender screenRender = this.f12202e;
            screenRender.f12185o = screenRender.f12187q;
            if (this.f12202e.f12193w == 0 && this.f12202e.f12192v == 0) {
                ScreenRender screenRender2 = this.f12202e;
                screenRender2.f12186p = screenRender2.f12188r;
            } else {
                ScreenRender screenRender3 = this.f12202e;
                screenRender3.f12186p = screenRender3.f12193w - this.f12202e.f12192v;
            }
            ScreenRender screenRender4 = this.f12202e;
            if (screenRender4.f12176f != null) {
                if (screenRender4.f12193w == 0 && this.f12202e.f12192v == 0) {
                    float f = this.f12202e.f12190t.x;
                    float f2 = this.f12202e.f12190t.y;
                    float f3 = f2 / f;
                    float f4 = this.f12202e.f12187q / this.f12202e.f12188r;
                    ScreenRender screenRender5 = this.f12202e;
                    if (f3 <= f4) {
                        screenRender5.f12186p = screenRender5.f12188r;
                        float f5 = this.f12202e.f12188r * f;
                        float f6 = this.f12202e.f12187q * f2;
                        ScreenRender screenRender6 = this.f12202e;
                        if (f5 != f6) {
                            screenRender6.f12185o = (((screenRender6.f12186p * ((int) f2)) / ((int) f)) / 16) * 16;
                        } else {
                            screenRender6.f12185o = screenRender6.f12187q;
                        }
                    } else {
                        screenRender5.f12185o = screenRender5.f12187q;
                        float f7 = this.f12202e.f12188r * f;
                        float f8 = this.f12202e.f12187q * f2;
                        ScreenRender screenRender7 = this.f12202e;
                        if (f7 != f8) {
                            screenRender7.f12186p = (((screenRender7.f12185o * ((int) f)) / ((int) f2)) / 16) * 16;
                        } else {
                            screenRender7.f12186p = screenRender7.f12188r;
                        }
                    }
                } else {
                    ScreenRender screenRender8 = this.f12202e;
                    screenRender8.f12176f.m6600Q1(screenRender8.f12192v, this.f12202e.f12193w);
                }
                ScreenRender screenRender9 = this.f12202e;
                screenRender9.f12176f.setRenderSize(screenRender9.f12185o, this.f12202e.f12186p);
            }
            ScreenRender screenRender10 = this.f12202e;
            if (screenRender10.f12177g.f6360a) {
                int unused = screenRender10.f12185o;
                int unused2 = this.f12202e.f12186p;
                ScreenRender screenRender11 = this.f12202e;
                screenRender11.f12185o = (int) (((double) screenRender11.f12185o) * 1.0d * ((double) this.f12202e.f12189s));
                ScreenRender screenRender12 = this.f12202e;
                screenRender12.f12186p = (int) (((double) screenRender12.f12186p) * 1.0d * ((double) this.f12202e.f12189s));
                if (this.f12202e.f12185o < 160) {
                    this.f12202e.f12185o = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
                }
                if (this.f12202e.f12186p < 160) {
                    this.f12202e.f12186p = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
                }
                ScreenRender screenRender13 = this.f12202e;
                screenRender13.f12177g.setRenderSize(screenRender13.f12185o, this.f12202e.f12186p);
            }
            ScreenRender screenRender14 = this.f12202e;
            GLMergeTextureFilter gLMergeTextureFilter = screenRender14.f12178h;
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m10534y2(0L, 0, 0, screenRender14.f12185o, this.f12202e.f12186p, 0);
                ScreenRender screenRender15 = this.f12202e;
                screenRender15.f12178h.setRenderSize(screenRender15.f12185o, this.f12202e.f12186p);
            }
            this.f12202e.f12183m.setRenderSize(this.f12202e.f12185o, this.f12202e.f12186p);
            boolean z = this.f12201d;
            ScreenRender screenRender16 = this.f12202e;
            if (z) {
                screenRender16.f12174d.changeCurRotation(360 - this.f12198a);
                this.f12202e.f12174d.flipPosition(2);
            } else {
                screenRender16.f12174d.changeCurRotation(this.f12198a);
                this.f12202e.f12174d.flipPosition(1);
            }
            this.f12202e.f12174d.setRenderSize(this.f12199b, this.f12200c);
        }
    }

    public ScreenRender(ts2 ts2Var, VideoQuality videoQuality) {
        this.f12185o = 352;
        this.f12186p = 640;
        if (videoQuality != null) {
            this.f12184n = videoQuality;
            this.f12185o = videoQuality.resX;
            this.f12186p = videoQuality.resY;
        }
        this.f12191u = false;
        this.f12194x = new LinkedList();
        this.f12195y = new LinkedList();
        m10987w(ts2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m10986v() {
        if (this.f12191u) {
            return;
        }
        boolean z = this.f12177g.f6360a;
        ts2 ts2Var = this.f12182l;
        if (z) {
            ts2Var.clearTarget();
            this.f12176f.clearTarget();
            this.f12182l.addTarget(this.f12176f);
            this.f12176f.addTarget(this.f12177g);
            GLMergeTextureFilter gLMergeTextureFilter = this.f12178h;
            pcj pcjVar = this.f12177g;
            if (gLMergeTextureFilter != null) {
                pcjVar.clearTarget();
                this.f12177g.addTarget(this.f12178h);
                this.f12178h.clearTarget();
                this.f12178h.addTarget(this.f12183m);
            } else {
                pcjVar.clearTarget();
                this.f12177g.addTarget(this.f12183m);
            }
        } else {
            ts2Var.clearTarget();
            this.f12182l.addTarget(this.f12176f);
            GLMergeTextureFilter gLMergeTextureFilter2 = this.f12178h;
            obj objVar = this.f12176f;
            if (gLMergeTextureFilter2 != null) {
                objVar.clearTarget();
                this.f12176f.addTarget(this.f12178h);
                this.f12178h.clearTarget();
                this.f12178h.addTarget(this.f12183m);
            } else {
                objVar.clearTarget();
                this.f12176f.addTarget(this.f12183m);
            }
        }
        this.f12191u = true;
    }

    /* JADX INFO: renamed from: w */
    private void m10987w(ts2 ts2Var) {
        this.f12182l = ts2Var;
        ts2Var.useCache = false;
        rkw rkwVar = new rkw();
        this.f12174d = rkwVar;
        rkwVar.useCache = false;
        vbj vbjVar = new vbj();
        vbjVar.m8353c(this.f12185o, this.f12186p);
        this.f12174d.addTarget(this.f12182l);
        this.f12183m = new fcj();
        this.f12178h = null;
        obj objVar = new obj();
        this.f12176f = objVar;
        objVar.useCache = false;
        pcj pcjVar = new pcj();
        this.f12177g = pcjVar;
        pcjVar.useCache = false;
        vbjVar.m8352b(this.f12174d);
        vbjVar.m8360k();
        this.f12173c = vbjVar;
    }

    /* JADX INFO: renamed from: y */
    private void m10988y(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    queue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m10989A(PointF pointF) {
        this.f12190t = pointF;
    }

    /* JADX INFO: renamed from: B */
    public void m10990B() {
        this.f12181k = m10992p();
    }

    /* JADX INFO: renamed from: o */
    public void m10991o(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            n8c.c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: p */
    public SurfaceTexture m10992p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f12180j = i;
        GLES20.glBindTexture(36197, i);
        m10991o("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m10991o("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12180j);
        this.f12181k = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: q */
    public void m10993q(int i, SurfaceTexture surfaceTexture) {
        m10988y(this.f12194x);
        if (this.f12173c != null) {
            rkw rkwVar = this.f12174d;
            if (rkwVar != null) {
                rkwVar.loadTexture(i, surfaceTexture);
            }
            this.f12173c.m8357h();
        }
        m10988y(this.f12195y);
    }

    /* JADX INFO: renamed from: r */
    public void m10994r() {
        ldq0 ldq0Var = this.f12175e;
        if (ldq0Var != null) {
            ldq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10995s() {
        m10988y(this.f12194x);
        fcj fcjVar = this.f12183m;
        if (fcjVar != null) {
            fcjVar.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m10996t() {
        return this.f12181k;
    }

    /* JADX INFO: renamed from: u */
    public int m10997u() {
        return this.f12180j;
    }

    /* JADX INFO: renamed from: x */
    public void m10998x() {
        this.f12181k = null;
        vbj vbjVar = this.f12173c;
        if (vbjVar != null) {
            vbjVar.m8354d();
            this.f12173c = null;
        }
        obj objVar = this.f12176f;
        if (objVar != null) {
            objVar.destroy();
            this.f12176f = null;
        }
        pcj pcjVar = this.f12177g;
        if (pcjVar != null) {
            pcjVar.destroy();
            this.f12177g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f12178h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f12178h = null;
        }
        fcj fcjVar = this.f12183m;
        if (fcjVar != null) {
            fcjVar.destroy();
            this.f12183m = null;
        }
        ldq0 ldq0Var = this.f12175e;
        if (ldq0Var != null) {
            ldq0Var.destroy();
            this.f12175e = null;
        }
        ts2 ts2Var = this.f12182l;
        if (ts2Var != null) {
            ts2Var.destroy();
            this.f12182l = null;
        }
        ByteBuffer byteBuffer = this.f12172b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f12172b = null;
        }
        ByteBuffer byteBuffer2 = this.f12171a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f12171a = null;
        }
        Queue<Runnable> queue = this.f12194x;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f12195y;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m10999z(ts2 ts2Var) {
        ts2 ts2Var2 = this.f12182l;
        if (ts2Var2 != null) {
            ts2Var2.clearTarget();
            this.f12174d.removeTarget(this.f12182l);
            this.f12173c.m8351a(this.f12182l);
        }
        this.f12182l = ts2Var;
        this.f12174d.addTarget(ts2Var);
        this.f12182l.addTarget(this.f12176f);
    }
}
