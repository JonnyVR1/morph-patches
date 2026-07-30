package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import p153l.iej;
import p153l.jfj;
import p153l.jt2;
import p153l.pej;
import p153l.qmq0;
import p153l.qnw;
import p153l.t9c;
import p153l.zej;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;

/* JADX INFO: loaded from: classes3.dex */
class ScreenRender {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f209468a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f209469b;

    /* JADX INFO: renamed from: c */
    pej f209470c;

    /* JADX INFO: renamed from: d */
    qnw f209471d;

    /* JADX INFO: renamed from: e */
    qmq0 f209472e;

    /* JADX INFO: renamed from: f */
    iej f209473f;

    /* JADX INFO: renamed from: g */
    jfj f209474g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f209475h;

    /* JADX INFO: renamed from: i */
    qmq0.InterfaceC19603a f209476i;

    /* JADX INFO: renamed from: k */
    private SurfaceTexture f209478k;

    /* JADX INFO: renamed from: l */
    private jt2 f209479l;

    /* JADX INFO: renamed from: m */
    private zej f209480m;

    /* JADX INFO: renamed from: n */
    private VideoQuality f209481n;

    /* JADX INFO: renamed from: o */
    private int f209482o;

    /* JADX INFO: renamed from: p */
    private int f209483p;

    /* JADX INFO: renamed from: u */
    private boolean f209488u;

    /* JADX INFO: renamed from: x */
    private final Queue<Runnable> f209491x;

    /* JADX INFO: renamed from: y */
    private final Queue<Runnable> f209492y;

    /* JADX INFO: renamed from: j */
    private int f209477j = -12345;

    /* JADX INFO: renamed from: q */
    private int f209484q = 480;

    /* JADX INFO: renamed from: r */
    private int f209485r = 640;

    /* JADX INFO: renamed from: s */
    private float f209486s = 1.0f;

    /* JADX INFO: renamed from: t */
    private PointF f209487t = new PointF(16.0f, 9.0f);

    /* JADX INFO: renamed from: v */
    private int f209489v = 0;

    /* JADX INFO: renamed from: w */
    private int f209490w = 0;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$1 */
    class RunnableC226161 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qmq0.InterfaceC19603a f209493a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ScreenRender f209494b;

        @Override // java.lang.Runnable
        public void run() {
            qmq0.InterfaceC19603a interfaceC19603a = this.f209493a;
            ScreenRender screenRender = this.f209494b;
            if (interfaceC19603a != null) {
                screenRender.f209476i = interfaceC19603a;
                if (screenRender.f209472e == null) {
                    screenRender.f209472e = new qmq0();
                    ScreenRender screenRender2 = this.f209494b;
                    screenRender2.f209472e.setRenderSize(screenRender2.f209482o, this.f209494b.f209483p);
                    ScreenRender screenRender3 = this.f209494b;
                    GLMergeTextureFilter gLMergeTextureFilter = screenRender3.f209475h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.addTarget(screenRender3.f209472e);
                    } else {
                        jfj jfjVar = screenRender3.f209474g;
                        if (jfjVar.f120591a) {
                            jfjVar.addTarget(screenRender3.f209472e);
                        } else {
                            screenRender3.f209473f.addTarget(screenRender3.f209472e);
                        }
                    }
                }
                ScreenRender screenRender4 = this.f209494b;
                qmq0 qmq0Var = screenRender4.f209472e;
                if (qmq0Var != null) {
                    qmq0Var.f158394a = screenRender4.f209476i;
                    return;
                }
                return;
            }
            qmq0 qmq0Var2 = screenRender.f209472e;
            if (qmq0Var2 != null) {
                GLMergeTextureFilter gLMergeTextureFilter2 = screenRender.f209475h;
                if (gLMergeTextureFilter2 != null) {
                    gLMergeTextureFilter2.removeTarget(qmq0Var2);
                } else {
                    jfj jfjVar2 = screenRender.f209474g;
                    if (jfjVar2.f120591a) {
                        jfjVar2.removeTarget(qmq0Var2);
                    } else {
                        screenRender.f209473f.removeTarget(qmq0Var2);
                    }
                }
                ScreenRender screenRender5 = this.f209494b;
                screenRender5.f209470c.m172018a(screenRender5.f209472e);
                ScreenRender screenRender6 = this.f209494b;
                if (screenRender6.f209475h != null) {
                    screenRender6.f209475h = null;
                } else if (screenRender6.f209474g.f120591a) {
                    screenRender6.f209474g = null;
                } else {
                    screenRender6.f209473f = null;
                }
                screenRender6.f209472e = null;
            }
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.streamer.ScreenRender$2 */
    class RunnableC226172 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f209495a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f209496b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f209497c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f209498d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ScreenRender f209499e;

        @Override // java.lang.Runnable
        public void run() {
            this.f209499e.m223761v();
            int i = this.f209495a;
            if (i == 90 || i == 270) {
                this.f209499e.f209485r = this.f209496b;
                this.f209499e.f209484q = this.f209497c;
            } else {
                this.f209499e.f209484q = this.f209496b;
                this.f209499e.f209485r = this.f209497c;
            }
            ScreenRender screenRender = this.f209499e;
            screenRender.f209482o = screenRender.f209484q;
            if (this.f209499e.f209490w == 0 && this.f209499e.f209489v == 0) {
                ScreenRender screenRender2 = this.f209499e;
                screenRender2.f209483p = screenRender2.f209485r;
            } else {
                ScreenRender screenRender3 = this.f209499e;
                screenRender3.f209483p = screenRender3.f209490w - this.f209499e.f209489v;
            }
            ScreenRender screenRender4 = this.f209499e;
            if (screenRender4.f209473f != null) {
                if (screenRender4.f209490w == 0 && this.f209499e.f209489v == 0) {
                    float f = this.f209499e.f209487t.x;
                    float f2 = this.f209499e.f209487t.y;
                    float f3 = f2 / f;
                    float f4 = this.f209499e.f209484q / this.f209499e.f209485r;
                    ScreenRender screenRender5 = this.f209499e;
                    if (f3 <= f4) {
                        screenRender5.f209483p = screenRender5.f209485r;
                        float f5 = this.f209499e.f209485r * f;
                        float f6 = this.f209499e.f209484q * f2;
                        ScreenRender screenRender6 = this.f209499e;
                        if (f5 != f6) {
                            screenRender6.f209482o = (((screenRender6.f209483p * ((int) f2)) / ((int) f)) / 16) * 16;
                        } else {
                            screenRender6.f209482o = screenRender6.f209484q;
                        }
                    } else {
                        screenRender5.f209482o = screenRender5.f209484q;
                        float f7 = this.f209499e.f209485r * f;
                        float f8 = this.f209499e.f209484q * f2;
                        ScreenRender screenRender7 = this.f209499e;
                        if (f7 != f8) {
                            screenRender7.f209483p = (((screenRender7.f209482o * ((int) f)) / ((int) f2)) / 16) * 16;
                        } else {
                            screenRender7.f209483p = screenRender7.f209485r;
                        }
                    }
                } else {
                    ScreenRender screenRender8 = this.f209499e;
                    screenRender8.f209473f.m139616Q1(screenRender8.f209489v, this.f209499e.f209490w);
                }
                ScreenRender screenRender9 = this.f209499e;
                screenRender9.f209473f.setRenderSize(screenRender9.f209482o, this.f209499e.f209483p);
            }
            ScreenRender screenRender10 = this.f209499e;
            if (screenRender10.f209474g.f120591a) {
                int unused = screenRender10.f209482o;
                int unused2 = this.f209499e.f209483p;
                ScreenRender screenRender11 = this.f209499e;
                screenRender11.f209482o = (int) (((double) screenRender11.f209482o) * 1.0d * ((double) this.f209499e.f209486s));
                ScreenRender screenRender12 = this.f209499e;
                screenRender12.f209483p = (int) (((double) screenRender12.f209483p) * 1.0d * ((double) this.f209499e.f209486s));
                if (this.f209499e.f209482o < 160) {
                    this.f209499e.f209482o = 160;
                }
                if (this.f209499e.f209483p < 160) {
                    this.f209499e.f209483p = 160;
                }
                ScreenRender screenRender13 = this.f209499e;
                screenRender13.f209474g.setRenderSize(screenRender13.f209482o, this.f209499e.f209483p);
            }
            ScreenRender screenRender14 = this.f209499e;
            GLMergeTextureFilter gLMergeTextureFilter = screenRender14.f209475h;
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m223309y2(0L, 0, 0, screenRender14.f209482o, this.f209499e.f209483p, 0);
                ScreenRender screenRender15 = this.f209499e;
                screenRender15.f209475h.setRenderSize(screenRender15.f209482o, this.f209499e.f209483p);
            }
            this.f209499e.f209480m.setRenderSize(this.f209499e.f209482o, this.f209499e.f209483p);
            boolean z = this.f209498d;
            ScreenRender screenRender16 = this.f209499e;
            if (z) {
                screenRender16.f209471d.changeCurRotation(360 - this.f209495a);
                this.f209499e.f209471d.flipPosition(2);
            } else {
                screenRender16.f209471d.changeCurRotation(this.f209495a);
                this.f209499e.f209471d.flipPosition(1);
            }
            this.f209499e.f209471d.setRenderSize(this.f209496b, this.f209497c);
        }
    }

    public ScreenRender(jt2 jt2Var, VideoQuality videoQuality) {
        this.f209482o = 352;
        this.f209483p = 640;
        if (videoQuality != null) {
            this.f209481n = videoQuality;
            this.f209482o = videoQuality.resX;
            this.f209483p = videoQuality.resY;
        }
        this.f209488u = false;
        this.f209491x = new LinkedList();
        this.f209492y = new LinkedList();
        m223762w(jt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m223761v() {
        if (this.f209488u) {
            return;
        }
        boolean z = this.f209474g.f120591a;
        jt2 jt2Var = this.f209479l;
        if (z) {
            jt2Var.clearTarget();
            this.f209473f.clearTarget();
            this.f209479l.addTarget(this.f209473f);
            this.f209473f.addTarget(this.f209474g);
            GLMergeTextureFilter gLMergeTextureFilter = this.f209475h;
            jfj jfjVar = this.f209474g;
            if (gLMergeTextureFilter != null) {
                jfjVar.clearTarget();
                this.f209474g.addTarget(this.f209475h);
                this.f209475h.clearTarget();
                this.f209475h.addTarget(this.f209480m);
            } else {
                jfjVar.clearTarget();
                this.f209474g.addTarget(this.f209480m);
            }
        } else {
            jt2Var.clearTarget();
            this.f209479l.addTarget(this.f209473f);
            GLMergeTextureFilter gLMergeTextureFilter2 = this.f209475h;
            iej iejVar = this.f209473f;
            if (gLMergeTextureFilter2 != null) {
                iejVar.clearTarget();
                this.f209473f.addTarget(this.f209475h);
                this.f209475h.clearTarget();
                this.f209475h.addTarget(this.f209480m);
            } else {
                iejVar.clearTarget();
                this.f209473f.addTarget(this.f209480m);
            }
        }
        this.f209488u = true;
    }

    /* JADX INFO: renamed from: w */
    private void m223762w(jt2 jt2Var) {
        this.f209479l = jt2Var;
        jt2Var.useCache = false;
        qnw qnwVar = new qnw();
        this.f209471d = qnwVar;
        qnwVar.useCache = false;
        pej pejVar = new pej();
        pejVar.m172020c(this.f209482o, this.f209483p);
        this.f209471d.addTarget(this.f209479l);
        this.f209480m = new zej();
        this.f209475h = null;
        iej iejVar = new iej();
        this.f209473f = iejVar;
        iejVar.useCache = false;
        jfj jfjVar = new jfj();
        this.f209474g = jfjVar;
        jfjVar.useCache = false;
        pejVar.m172019b(this.f209471d);
        pejVar.m172027k();
        this.f209470c = pejVar;
    }

    /* JADX INFO: renamed from: y */
    private void m223763y(Queue<Runnable> queue) {
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
    public void m223764A(PointF pointF) {
        this.f209487t = pointF;
    }

    /* JADX INFO: renamed from: B */
    public void m223765B() {
        this.f209478k = m223767p();
    }

    /* JADX INFO: renamed from: o */
    public void m223766o(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            t9c.m189745c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: p */
    public SurfaceTexture m223767p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f209477j = i;
        GLES20.glBindTexture(36197, i);
        m223766o("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m223766o("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f209477j);
        this.f209478k = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: q */
    public void m223768q(int i, SurfaceTexture surfaceTexture) {
        m223763y(this.f209491x);
        if (this.f209470c != null) {
            qnw qnwVar = this.f209471d;
            if (qnwVar != null) {
                qnwVar.loadTexture(i, surfaceTexture);
            }
            this.f209470c.m172024h();
        }
        m223763y(this.f209492y);
    }

    /* JADX INFO: renamed from: r */
    public void m223769r() {
        qmq0 qmq0Var = this.f209472e;
        if (qmq0Var != null) {
            qmq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m223770s() {
        m223763y(this.f209491x);
        zej zejVar = this.f209480m;
        if (zejVar != null) {
            zejVar.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m223771t() {
        return this.f209478k;
    }

    /* JADX INFO: renamed from: u */
    public int m223772u() {
        return this.f209477j;
    }

    /* JADX INFO: renamed from: x */
    public void m223773x() {
        this.f209478k = null;
        pej pejVar = this.f209470c;
        if (pejVar != null) {
            pejVar.m172021d();
            this.f209470c = null;
        }
        iej iejVar = this.f209473f;
        if (iejVar != null) {
            iejVar.destroy();
            this.f209473f = null;
        }
        jfj jfjVar = this.f209474g;
        if (jfjVar != null) {
            jfjVar.destroy();
            this.f209474g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f209475h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f209475h = null;
        }
        zej zejVar = this.f209480m;
        if (zejVar != null) {
            zejVar.destroy();
            this.f209480m = null;
        }
        qmq0 qmq0Var = this.f209472e;
        if (qmq0Var != null) {
            qmq0Var.destroy();
            this.f209472e = null;
        }
        jt2 jt2Var = this.f209479l;
        if (jt2Var != null) {
            jt2Var.destroy();
            this.f209479l = null;
        }
        ByteBuffer byteBuffer = this.f209469b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f209469b = null;
        }
        ByteBuffer byteBuffer2 = this.f209468a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f209468a = null;
        }
        Queue<Runnable> queue = this.f209491x;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f209492y;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m223774z(jt2 jt2Var) {
        jt2 jt2Var2 = this.f209479l;
        if (jt2Var2 != null) {
            jt2Var2.clearTarget();
            this.f209471d.removeTarget(this.f209479l);
            this.f209470c.m172018a(this.f209479l);
        }
        this.f209479l = jt2Var;
        this.f209471d.addTarget(jt2Var);
        this.f209479l.addTarget(this.f209473f);
    }
}
