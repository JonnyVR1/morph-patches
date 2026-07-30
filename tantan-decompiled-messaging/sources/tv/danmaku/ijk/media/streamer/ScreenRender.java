package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import p149l.fcj;
import p149l.ldq0;
import p149l.n8c;
import p149l.obj;
import p149l.pcj;
import p149l.rkw;
import p149l.ts2;
import p149l.vbj;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;

/* JADX INFO: loaded from: classes3.dex */
class ScreenRender {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f208546a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f208547b;

    /* JADX INFO: renamed from: c */
    vbj f208548c;

    /* JADX INFO: renamed from: d */
    rkw f208549d;

    /* JADX INFO: renamed from: e */
    ldq0 f208550e;

    /* JADX INFO: renamed from: f */
    obj f208551f;

    /* JADX INFO: renamed from: g */
    pcj f208552g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f208553h;

    /* JADX INFO: renamed from: i */
    ldq0.InterfaceC18199a f208554i;

    /* JADX INFO: renamed from: k */
    private SurfaceTexture f208556k;

    /* JADX INFO: renamed from: l */
    private ts2 f208557l;

    /* JADX INFO: renamed from: m */
    private fcj f208558m;

    /* JADX INFO: renamed from: n */
    private VideoQuality f208559n;

    /* JADX INFO: renamed from: o */
    private int f208560o;

    /* JADX INFO: renamed from: p */
    private int f208561p;

    /* JADX INFO: renamed from: u */
    private boolean f208566u;

    /* JADX INFO: renamed from: x */
    private final Queue<Runnable> f208569x;

    /* JADX INFO: renamed from: y */
    private final Queue<Runnable> f208570y;

    /* JADX INFO: renamed from: j */
    private int f208555j = -12345;

    /* JADX INFO: renamed from: q */
    private int f208562q = 480;

    /* JADX INFO: renamed from: r */
    private int f208563r = 640;

    /* JADX INFO: renamed from: s */
    private float f208564s = 1.0f;

    /* JADX INFO: renamed from: t */
    private PointF f208565t = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: v */
    private int f208567v = 0;

    /* JADX INFO: renamed from: w */
    private int f208568w = 0;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$1 */
    class RunnableC225011 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ldq0.InterfaceC18199a f208571a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ScreenRender f208572b;

        @Override // java.lang.Runnable
        public void run() {
            ldq0.InterfaceC18199a interfaceC18199a = this.f208571a;
            ScreenRender screenRender = this.f208572b;
            if (interfaceC18199a != null) {
                screenRender.f208554i = interfaceC18199a;
                if (screenRender.f208550e == null) {
                    screenRender.f208550e = new ldq0();
                    ScreenRender screenRender2 = this.f208572b;
                    screenRender2.f208550e.setRenderSize(screenRender2.f208560o, this.f208572b.f208561p);
                    ScreenRender screenRender3 = this.f208572b;
                    GLMergeTextureFilter gLMergeTextureFilter = screenRender3.f208553h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.addTarget(screenRender3.f208550e);
                    } else {
                        pcj pcjVar = screenRender3.f208552g;
                        if (pcjVar.f148176a) {
                            pcjVar.addTarget(screenRender3.f208550e);
                        } else {
                            screenRender3.f208551f.addTarget(screenRender3.f208550e);
                        }
                    }
                }
                ScreenRender screenRender4 = this.f208572b;
                ldq0 ldq0Var = screenRender4.f208550e;
                if (ldq0Var != null) {
                    ldq0Var.f127576a = screenRender4.f208554i;
                    return;
                }
                return;
            }
            ldq0 ldq0Var2 = screenRender.f208550e;
            if (ldq0Var2 != null) {
                GLMergeTextureFilter gLMergeTextureFilter2 = screenRender.f208553h;
                if (gLMergeTextureFilter2 != null) {
                    gLMergeTextureFilter2.removeTarget(ldq0Var2);
                } else {
                    pcj pcjVar2 = screenRender.f208552g;
                    if (pcjVar2.f148176a) {
                        pcjVar2.removeTarget(ldq0Var2);
                    } else {
                        screenRender.f208551f.removeTarget(ldq0Var2);
                    }
                }
                ScreenRender screenRender5 = this.f208572b;
                screenRender5.f208548c.m197712a(screenRender5.f208550e);
                ScreenRender screenRender6 = this.f208572b;
                if (screenRender6.f208553h != null) {
                    screenRender6.f208553h = null;
                } else if (screenRender6.f208552g.f148176a) {
                    screenRender6.f208552g = null;
                } else {
                    screenRender6.f208551f = null;
                }
                screenRender6.f208550e = null;
            }
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$2 */
    class RunnableC225022 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f208573a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f208574b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f208575c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f208576d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ScreenRender f208577e;

        @Override // java.lang.Runnable
        public void run() {
            this.f208577e.m222515v();
            int i = this.f208573a;
            if (i == 90 || i == 270) {
                this.f208577e.f208563r = this.f208574b;
                this.f208577e.f208562q = this.f208575c;
            } else {
                this.f208577e.f208562q = this.f208574b;
                this.f208577e.f208563r = this.f208575c;
            }
            ScreenRender screenRender = this.f208577e;
            screenRender.f208560o = screenRender.f208562q;
            if (this.f208577e.f208568w == 0 && this.f208577e.f208567v == 0) {
                ScreenRender screenRender2 = this.f208577e;
                screenRender2.f208561p = screenRender2.f208563r;
            } else {
                ScreenRender screenRender3 = this.f208577e;
                screenRender3.f208561p = screenRender3.f208568w - this.f208577e.f208567v;
            }
            ScreenRender screenRender4 = this.f208577e;
            if (screenRender4.f208551f != null) {
                if (screenRender4.f208568w == 0 && this.f208577e.f208567v == 0) {
                    float f = this.f208577e.f208565t.x;
                    float f2 = this.f208577e.f208565t.y;
                    float f3 = f2 / f;
                    float f4 = this.f208577e.f208562q / this.f208577e.f208563r;
                    ScreenRender screenRender5 = this.f208577e;
                    if (f3 <= f4) {
                        screenRender5.f208561p = screenRender5.f208563r;
                        float f5 = this.f208577e.f208563r * f;
                        float f6 = this.f208577e.f208562q * f2;
                        ScreenRender screenRender6 = this.f208577e;
                        if (f5 != f6) {
                            screenRender6.f208560o = (((screenRender6.f208561p * ((int) f2)) / ((int) f)) / 16) * 16;
                        } else {
                            screenRender6.f208560o = screenRender6.f208562q;
                        }
                    } else {
                        screenRender5.f208560o = screenRender5.f208562q;
                        float f7 = this.f208577e.f208563r * f;
                        float f8 = this.f208577e.f208562q * f2;
                        ScreenRender screenRender7 = this.f208577e;
                        if (f7 != f8) {
                            screenRender7.f208561p = (((screenRender7.f208560o * ((int) f)) / ((int) f2)) / 16) * 16;
                        } else {
                            screenRender7.f208561p = screenRender7.f208563r;
                        }
                    }
                } else {
                    ScreenRender screenRender8 = this.f208577e;
                    screenRender8.f208551f.m163444Q1(screenRender8.f208567v, this.f208577e.f208568w);
                }
                ScreenRender screenRender9 = this.f208577e;
                screenRender9.f208551f.setRenderSize(screenRender9.f208560o, this.f208577e.f208561p);
            }
            ScreenRender screenRender10 = this.f208577e;
            if (screenRender10.f208552g.f148176a) {
                int unused = screenRender10.f208560o;
                int unused2 = this.f208577e.f208561p;
                ScreenRender screenRender11 = this.f208577e;
                screenRender11.f208560o = (int) (((double) screenRender11.f208560o) * 1.0d * ((double) this.f208577e.f208564s));
                ScreenRender screenRender12 = this.f208577e;
                screenRender12.f208561p = (int) (((double) screenRender12.f208561p) * 1.0d * ((double) this.f208577e.f208564s));
                if (this.f208577e.f208560o < 160) {
                    this.f208577e.f208560o = 160;
                }
                if (this.f208577e.f208561p < 160) {
                    this.f208577e.f208561p = 160;
                }
                ScreenRender screenRender13 = this.f208577e;
                screenRender13.f208552g.setRenderSize(screenRender13.f208560o, this.f208577e.f208561p);
            }
            ScreenRender screenRender14 = this.f208577e;
            GLMergeTextureFilter gLMergeTextureFilter = screenRender14.f208553h;
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m222063y2(0L, 0, 0, screenRender14.f208560o, this.f208577e.f208561p, 0);
                ScreenRender screenRender15 = this.f208577e;
                screenRender15.f208553h.setRenderSize(screenRender15.f208560o, this.f208577e.f208561p);
            }
            this.f208577e.f208558m.setRenderSize(this.f208577e.f208560o, this.f208577e.f208561p);
            boolean z = this.f208576d;
            ScreenRender screenRender16 = this.f208577e;
            if (z) {
                screenRender16.f208549d.changeCurRotation(360 - this.f208573a);
                this.f208577e.f208549d.flipPosition(2);
            } else {
                screenRender16.f208549d.changeCurRotation(this.f208573a);
                this.f208577e.f208549d.flipPosition(1);
            }
            this.f208577e.f208549d.setRenderSize(this.f208574b, this.f208575c);
        }
    }

    public ScreenRender(ts2 ts2Var, VideoQuality videoQuality) {
        this.f208560o = 352;
        this.f208561p = 640;
        if (videoQuality != null) {
            this.f208559n = videoQuality;
            this.f208560o = videoQuality.resX;
            this.f208561p = videoQuality.resY;
        }
        this.f208566u = false;
        this.f208569x = new LinkedList();
        this.f208570y = new LinkedList();
        m222516w(ts2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m222515v() {
        if (this.f208566u) {
            return;
        }
        boolean z = this.f208552g.f148176a;
        ts2 ts2Var = this.f208557l;
        if (z) {
            ts2Var.clearTarget();
            this.f208551f.clearTarget();
            this.f208557l.addTarget(this.f208551f);
            this.f208551f.addTarget(this.f208552g);
            GLMergeTextureFilter gLMergeTextureFilter = this.f208553h;
            pcj pcjVar = this.f208552g;
            if (gLMergeTextureFilter != null) {
                pcjVar.clearTarget();
                this.f208552g.addTarget(this.f208553h);
                this.f208553h.clearTarget();
                this.f208553h.addTarget(this.f208558m);
            } else {
                pcjVar.clearTarget();
                this.f208552g.addTarget(this.f208558m);
            }
        } else {
            ts2Var.clearTarget();
            this.f208557l.addTarget(this.f208551f);
            GLMergeTextureFilter gLMergeTextureFilter2 = this.f208553h;
            obj objVar = this.f208551f;
            if (gLMergeTextureFilter2 != null) {
                objVar.clearTarget();
                this.f208551f.addTarget(this.f208553h);
                this.f208553h.clearTarget();
                this.f208553h.addTarget(this.f208558m);
            } else {
                objVar.clearTarget();
                this.f208551f.addTarget(this.f208558m);
            }
        }
        this.f208566u = true;
    }

    /* JADX INFO: renamed from: w */
    private void m222516w(ts2 ts2Var) {
        this.f208557l = ts2Var;
        ts2Var.useCache = false;
        rkw rkwVar = new rkw();
        this.f208549d = rkwVar;
        rkwVar.useCache = false;
        vbj vbjVar = new vbj();
        vbjVar.m197714c(this.f208560o, this.f208561p);
        this.f208549d.addTarget(this.f208557l);
        this.f208558m = new fcj();
        this.f208553h = null;
        obj objVar = new obj();
        this.f208551f = objVar;
        objVar.useCache = false;
        pcj pcjVar = new pcj();
        this.f208552g = pcjVar;
        pcjVar.useCache = false;
        vbjVar.m197713b(this.f208549d);
        vbjVar.m197721k();
        this.f208548c = vbjVar;
    }

    /* JADX INFO: renamed from: y */
    private void m222517y(Queue<Runnable> queue) {
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
    public void m222518A(PointF pointF) {
        this.f208565t = pointF;
    }

    /* JADX INFO: renamed from: B */
    public void m222519B() {
        this.f208556k = m222521p();
    }

    /* JADX INFO: renamed from: o */
    public void m222520o(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            n8c.m158485c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: p */
    public SurfaceTexture m222521p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f208555j = i;
        GLES20.glBindTexture(36197, i);
        m222520o("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m222520o("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f208555j);
        this.f208556k = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: q */
    public void m222522q(int i, SurfaceTexture surfaceTexture) {
        m222517y(this.f208569x);
        if (this.f208548c != null) {
            rkw rkwVar = this.f208549d;
            if (rkwVar != null) {
                rkwVar.loadTexture(i, surfaceTexture);
            }
            this.f208548c.m197718h();
        }
        m222517y(this.f208570y);
    }

    /* JADX INFO: renamed from: r */
    public void m222523r() {
        ldq0 ldq0Var = this.f208550e;
        if (ldq0Var != null) {
            ldq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m222524s() {
        m222517y(this.f208569x);
        fcj fcjVar = this.f208558m;
        if (fcjVar != null) {
            fcjVar.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m222525t() {
        return this.f208556k;
    }

    /* JADX INFO: renamed from: u */
    public int m222526u() {
        return this.f208555j;
    }

    /* JADX INFO: renamed from: x */
    public void m222527x() {
        this.f208556k = null;
        vbj vbjVar = this.f208548c;
        if (vbjVar != null) {
            vbjVar.m197715d();
            this.f208548c = null;
        }
        obj objVar = this.f208551f;
        if (objVar != null) {
            objVar.destroy();
            this.f208551f = null;
        }
        pcj pcjVar = this.f208552g;
        if (pcjVar != null) {
            pcjVar.destroy();
            this.f208552g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f208553h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f208553h = null;
        }
        fcj fcjVar = this.f208558m;
        if (fcjVar != null) {
            fcjVar.destroy();
            this.f208558m = null;
        }
        ldq0 ldq0Var = this.f208550e;
        if (ldq0Var != null) {
            ldq0Var.destroy();
            this.f208550e = null;
        }
        ts2 ts2Var = this.f208557l;
        if (ts2Var != null) {
            ts2Var.destroy();
            this.f208557l = null;
        }
        ByteBuffer byteBuffer = this.f208547b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f208547b = null;
        }
        ByteBuffer byteBuffer2 = this.f208546a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f208546a = null;
        }
        Queue<Runnable> queue = this.f208569x;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f208570y;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m222528z(ts2 ts2Var) {
        ts2 ts2Var2 = this.f208557l;
        if (ts2Var2 != null) {
            ts2Var2.clearTarget();
            this.f208549d.removeTarget(this.f208557l);
            this.f208548c.m197712a(this.f208557l);
        }
        this.f208557l = ts2Var;
        this.f208549d.addTarget(ts2Var);
        this.f208557l.addTarget(this.f208551f);
    }
}
