package tv.danmaku.ijk.media.streamer;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import p153l.gb20;
import p153l.jt2;
import p153l.pej;
import p153l.qmq0;
import p153l.qnw;
import p153l.t9c;
import p153l.zej;
import project.android.imageprocessing.ext.C22417a;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
class TextureRender {

    /* JADX INFO: renamed from: E */
    private final Queue<Runnable> f209704E;

    /* JADX INFO: renamed from: F */
    private final Queue<Runnable> f209705F;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f209720a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f209721b;

    /* JADX INFO: renamed from: c */
    pej f209722c;

    /* JADX INFO: renamed from: d */
    gb20 f209723d;

    /* JADX INFO: renamed from: e */
    qnw f209724e;

    /* JADX INFO: renamed from: f */
    qmq0 f209725f;

    /* JADX INFO: renamed from: g */
    C22417a f209726g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f209727h;

    /* JADX INFO: renamed from: i */
    GLMergeTextureFilterManager f209728i;

    /* JADX INFO: renamed from: j */
    qmq0.InterfaceC19603a f209729j;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f209731l;

    /* JADX INFO: renamed from: m */
    private jt2 f209732m;

    /* JADX INFO: renamed from: n */
    private zej f209733n;

    /* JADX INFO: renamed from: o */
    private zej f209734o;

    /* JADX INFO: renamed from: p */
    private zej f209735p;

    /* JADX INFO: renamed from: q */
    private C22417a f209736q;

    /* JADX INFO: renamed from: r */
    private VideoQuality f209737r;

    /* JADX INFO: renamed from: s */
    private int f209738s;

    /* JADX INFO: renamed from: t */
    private int f209739t;

    /* JADX INFO: renamed from: w */
    private boolean f209742w;

    /* JADX INFO: renamed from: x */
    private int f209743x;

    /* JADX INFO: renamed from: k */
    private int f209730k = -12345;

    /* JADX INFO: renamed from: u */
    private int f209740u = 480;

    /* JADX INFO: renamed from: v */
    private int f209741v = 640;

    /* JADX INFO: renamed from: y */
    private int f209744y = -1;

    /* JADX INFO: renamed from: z */
    private int f209745z = 0;

    /* JADX INFO: renamed from: A */
    private SurfaceTexture f209700A = null;

    /* JADX INFO: renamed from: B */
    private int f209701B = 0;

    /* JADX INFO: renamed from: C */
    private int f209702C = 0;

    /* JADX INFO: renamed from: D */
    private Bitmap f209703D = null;

    /* JADX INFO: renamed from: G */
    private int f209706G = 0;

    /* JADX INFO: renamed from: H */
    private int f209707H = 0;

    /* JADX INFO: renamed from: I */
    private boolean f209708I = false;

    /* JADX INFO: renamed from: J */
    private int f209709J = 0;

    /* JADX INFO: renamed from: K */
    private int f209710K = 0;

    /* JADX INFO: renamed from: L */
    private int f209711L = 0;

    /* JADX INFO: renamed from: M */
    private int f209712M = 0;

    /* JADX INFO: renamed from: N */
    private int f209713N = 0;

    /* JADX INFO: renamed from: O */
    private int f209714O = -1;

    /* JADX INFO: renamed from: P */
    private int f209715P = -1;

    /* JADX INFO: renamed from: Q */
    private int f209716Q = -1;

    /* JADX INFO: renamed from: R */
    private int f209717R = -1;

    /* JADX INFO: renamed from: S */
    private boolean f209718S = false;

    /* JADX INFO: renamed from: T */
    private int f209719T = 1;

    public TextureRender(jt2 jt2Var, VideoQuality videoQuality, int i) {
        this.f209738s = 352;
        this.f209739t = 640;
        this.f209743x = i;
        if (videoQuality != null) {
            this.f209737r = videoQuality;
            this.f209738s = videoQuality.resX;
            this.f209739t = videoQuality.resY;
        }
        this.f209742w = false;
        this.f209704E = new LinkedList();
        this.f209705F = new LinkedList();
        m224007x(jt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m223996S(int i, int i2, int i3) {
        int i4;
        if (this.f209743x != 0) {
            this.f209738s = i;
            this.f209739t = i2;
        } else if (i3 == 1) {
            if (i > i2) {
                this.f209738s = i2;
                this.f209739t = i;
            } else {
                this.f209738s = i;
                this.f209739t = i2;
            }
        } else if (i3 == 2) {
            if (i2 > i) {
                this.f209738s = i2;
                this.f209739t = i;
            } else {
                this.f209738s = i;
                this.f209739t = i2;
            }
        }
        this.f209726g.m222535W1(i3);
        this.f209726g.setRenderSize(this.f209738s, this.f209739t);
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            int i5 = this.f209719T;
            if (i5 == 1) {
                this.f209714O = 0;
                this.f209715P = 0;
                this.f209716Q = this.f209738s;
                this.f209717R = this.f209739t;
                i4 = 0;
            } else {
                if (this.f209714O == -1 || this.f209715P == -1 || this.f209716Q < 0 || this.f209717R < 0) {
                    this.f209714O = 0;
                    this.f209715P = 0;
                    this.f209716Q = this.f209738s;
                    this.f209717R = this.f209739t;
                }
                i4 = 1;
            }
            gLMergeTextureFilterManager.m223350v2(i5 == 2);
            this.f209728i.m223352x2(this.f209714O, this.f209715P, this.f209716Q, this.f209717R, i4);
            this.f209728i.m223351w2(this.f209743x);
            this.f209728i.m223349u2(i3);
            this.f209728i.setRenderSize(this.f209738s, this.f209739t);
            this.f209728i.m223353z2(this.f209738s, this.f209739t);
            if (this.f209743x == 1 && i3 == 3) {
                this.f209728i.m223336A2(this.f209744y);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            int i6 = this.f209719T;
            if (i6 != 1 && i6 == 2) {
                if (this.f209714O == -1 || this.f209715P == -1 || this.f209716Q <= 0 || this.f209717R <= 0) {
                    this.f209714O = 0;
                    this.f209715P = 0;
                    this.f209716Q = this.f209738s;
                    this.f209717R = this.f209739t;
                }
                gLMergeTextureFilter.m223305u2(true);
            } else {
                this.f209714O = 0;
                this.f209715P = 0;
                this.f209716Q = this.f209738s;
                this.f209717R = this.f209739t;
                gLMergeTextureFilter.m223305u2(false);
            }
            this.f209727h.m223309y2(0L, this.f209714O, this.f209715P, this.f209716Q, this.f209717R, 0);
            this.f209727h.m223302r2(this.f209743x);
            this.f209727h.m223303s2(i3);
            this.f209727h.setRenderSize(this.f209738s, this.f209739t);
            if (this.f209743x == 1) {
                GLMergeTextureFilter gLMergeTextureFilter2 = this.f209727h;
                if (i3 == 3) {
                    gLMergeTextureFilter2.m223304t2(this.f209744y);
                } else {
                    gLMergeTextureFilter2.m223304t2(-1);
                }
            }
        }
        zej zejVar = this.f209733n;
        if (zejVar != null) {
            zejVar.setRenderSize(this.f209738s, this.f209739t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m224006w() {
        jt2 jt2Var;
        if (this.f209742w || (jt2Var = this.f209732m) == null || this.f209726g == null) {
            return;
        }
        if (this.f209727h == null && this.f209728i == null) {
            return;
        }
        jt2Var.clearTarget();
        this.f209732m.addTarget(this.f209726g);
        this.f209726g.clearTarget();
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        C22417a c22417a = this.f209726g;
        if (gLMergeTextureFilterManager != null) {
            c22417a.addTarget(gLMergeTextureFilterManager);
            this.f209728i.clearTarget();
            this.f209728i.addTarget(this.f209733n);
        } else {
            c22417a.addTarget(this.f209727h);
            this.f209727h.clearTarget();
            this.f209727h.addTarget(this.f209733n);
        }
        this.f209742w = true;
    }

    /* JADX INFO: renamed from: x */
    private void m224007x(jt2 jt2Var) {
        this.f209732m = jt2Var;
        this.f209723d = new gb20();
        this.f209724e = new qnw();
        pej pejVar = new pej();
        pejVar.m172020c(this.f209738s, this.f209739t);
        if (this.f209743x == 0) {
            this.f209723d.addTarget(this.f209732m);
        } else {
            this.f209724e.addTarget(this.f209732m);
        }
        this.f209733n = new zej();
        this.f209727h = null;
        this.f209728i = new GLMergeTextureFilterManager(pejVar);
        this.f209726g = new C22417a();
        if (this.f209743x == 0) {
            pejVar.m172019b(this.f209723d);
        } else {
            pejVar.m172019b(this.f209724e);
        }
        pejVar.m172027k();
        this.f209722c = pejVar;
    }

    /* JADX INFO: renamed from: z */
    private void m224008z(Queue<Runnable> queue) {
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
    public void m224009A(Runnable runnable) {
        synchronized (this.f209704E) {
            this.f209704E.add(runnable);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m224010B(jt2 jt2Var) {
        jt2 jt2Var2 = this.f209732m;
        if (jt2Var2 != null) {
            jt2Var2.clearTarget();
            if (this.f209743x == 0) {
                this.f209723d.removeTarget(this.f209732m);
            } else {
                this.f209724e.removeTarget(this.f209732m);
            }
            this.f209722c.m172018a(this.f209732m);
        }
        this.f209732m = jt2Var;
        if (this.f209743x == 0) {
            this.f209723d.addTarget(jt2Var);
        } else {
            this.f209724e.addTarget(jt2Var);
        }
        this.f209732m.addTarget(this.f209726g);
    }

    /* JADX INFO: renamed from: C */
    public void m224011C(int i) {
        t9c.m189745c("TextureRender", "switch input capture:" + this.f209743x + "--->" + i);
        if (i != this.f209743x) {
            this.f209722c.m172025i();
            if (i == 0) {
                this.f209724e.removeTarget(this.f209732m);
                this.f209722c.m172026j(this.f209724e);
                this.f209723d.addTarget(this.f209732m);
                this.f209722c.m172020c(this.f209738s, this.f209739t);
                this.f209722c.m172019b(this.f209723d);
                t9c.m189745c("TextureRender", "camera###");
            } else {
                qnw qnwVar = this.f209724e;
                if (i == 1) {
                    qnwVar.setOESMode(true);
                } else {
                    qnwVar.setOESMode(false);
                }
                this.f209723d.removeTarget(this.f209732m);
                this.f209722c.m172026j(this.f209723d);
                this.f209724e.addTarget(this.f209732m);
                this.f209722c.m172020c(this.f209738s, this.f209739t);
                this.f209722c.m172019b(this.f209724e);
                t9c.m189745c("TextureRender", "texture###");
            }
            this.f209722c.m172027k();
        }
        this.f209743x = i;
    }

    /* JADX INFO: renamed from: D */
    public void m224012D(final qmq0.InterfaceC19603a interfaceC19603a) {
        m224009A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.1
            @Override // java.lang.Runnable
            public void run() {
                qmq0.InterfaceC19603a interfaceC19603a2 = interfaceC19603a;
                TextureRender textureRender = TextureRender.this;
                if (interfaceC19603a2 == null) {
                    qmq0 qmq0Var = textureRender.f209725f;
                    if (qmq0Var != null) {
                        GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender.f209728i;
                        if (gLMergeTextureFilterManager != null) {
                            gLMergeTextureFilterManager.removeTarget(qmq0Var);
                        } else {
                            textureRender.f209727h.removeTarget(qmq0Var);
                        }
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f209722c.m172018a(textureRender2.f209725f);
                        TextureRender.this.f209725f = null;
                        return;
                    }
                    return;
                }
                textureRender.f209729j = interfaceC19603a2;
                if (textureRender.f209725f == null) {
                    textureRender.f209725f = new qmq0();
                    TextureRender textureRender3 = TextureRender.this;
                    textureRender3.f209725f.setRenderSize(textureRender3.f209738s, TextureRender.this.f209739t);
                    TextureRender textureRender4 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager2 = textureRender4.f209728i;
                    if (gLMergeTextureFilterManager2 != null) {
                        gLMergeTextureFilterManager2.addTarget(textureRender4.f209725f);
                    } else {
                        textureRender4.f209727h.addTarget(textureRender4.f209725f);
                    }
                }
                TextureRender textureRender5 = TextureRender.this;
                qmq0 qmq0Var2 = textureRender5.f209725f;
                if (qmq0Var2 != null) {
                    qmq0Var2.f158394a = textureRender5.f209729j;
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m224013E(int i) {
        if (this.f209743x == 1) {
            this.f209744y = i;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m223336A2(i);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m224014F(VideoQuality videoQuality) {
        if ((this.f209727h == null && this.f209728i == null) || this.f209733n == null) {
            return;
        }
        m224008z(this.f209704E);
        if (videoQuality == null) {
            this.f209733n.setRenderSize(this.f209738s, this.f209739t);
            return;
        }
        int i = videoQuality.resX;
        int i2 = this.f209738s;
        if (i == i2) {
            int i3 = videoQuality.resY;
            int i4 = this.f209739t;
            if (i3 == i4) {
                this.f209733n.setRenderSize(i2, i4);
                return;
            }
        }
        this.f209733n.setRenderSize(i, videoQuality.resY);
    }

    /* JADX INFO: renamed from: G */
    public void m224015G(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223306v2(j, firstFrameDrawCallback);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m223345j2(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m224016H(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223307w2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m223340E2(j, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m224017I(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223308x2(j, z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m224018J(long j, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (j == 0) {
            this.f209714O = i;
            this.f209715P = i2;
            this.f209716Q = i3;
            this.f209717R = i4;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
            if (gLMergeTextureFilterManager != null) {
                this.f209718S = true;
                gLMergeTextureFilterManager.m223352x2(i, i2, i3, i4, 1);
                i6 = i;
                i7 = i2;
                i8 = i3;
                i9 = i4;
            } else {
                i6 = i;
                i7 = i2;
                i8 = i3;
                i9 = i4;
            }
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            if (this.f209728i != null) {
                t9c.m189745c("TextureRender", "@@@ (mergeFilterManager)setSubVideoPos: id[" + j + "], view[" + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i8 + Constants.SEPARATOR_COMMA + i9);
                this.f209728i.m223337B2(j, (float) i6, (float) i7, (float) i8, (float) i9, i5);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223309y2(j, i6, i7, i8, i9, i5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m224019K(long j, int i, int i2, int i3, int i4) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223310z2(j, i, i2, i3, i4);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m223338C2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m224020L(int i) {
        t9c.m189745c("TextureRender", "@@@ S merge(setViewShowMode):" + i + com.meituan.robust.Constants.PACKNAME_END + this.f209719T);
        if (i == this.f209719T) {
            return;
        }
        this.f209719T = i;
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (i == 2) {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m223305u2(true);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m223350v2(true);
            }
        } else {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m223305u2(false);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f209728i;
            if (gLMergeTextureFilterManager2 != null) {
                gLMergeTextureFilterManager2.m223350v2(false);
            }
        }
        t9c.m189745c("TextureRender", "@@@ merge(setViewShowMode):" + i + com.meituan.robust.Constants.PACKNAME_END + this.f209719T);
    }

    /* JADX INFO: renamed from: M */
    public void m224021M(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223296A2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m223347r2(j);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m224022N() {
        this.f209731l = m224033o();
    }

    /* JADX INFO: renamed from: O */
    public void m224023O(final int i, final int i2, final boolean z, final int i3, final int i4, int i5, final int i6, final int i7) {
        synchronized (this.f209704E) {
            this.f209704E.clear();
        }
        this.f209706G = i;
        this.f209707H = i2;
        this.f209708I = z;
        this.f209709J = i3;
        this.f209710K = i5;
        this.f209711L = i4;
        this.f209712M = i6;
        this.f209713N = i7;
        m224009A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.2
            @Override // java.lang.Runnable
            public void run() {
                t9c.m189745c("TextureRender", "----updateCamera: " + i + Constants.SEPARATOR_COMMA + i2 + ", O:" + i6 + Constants.SEPARATOR_COMMA + i7);
                if (TextureRender.this.f209734o != null) {
                    TextureRender textureRender = TextureRender.this;
                    GLMergeTextureFilter gLMergeTextureFilter = textureRender.f209727h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.removeTarget(textureRender.f209734o);
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f209722c.m172018a(textureRender2.f209734o);
                        TextureRender.this.f209734o = null;
                    }
                    TextureRender textureRender3 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender3.f209728i;
                    if (gLMergeTextureFilterManager != null) {
                        gLMergeTextureFilterManager.removeTarget(textureRender3.f209734o);
                        TextureRender textureRender4 = TextureRender.this;
                        textureRender4.f209722c.m172018a(textureRender4.f209734o);
                        TextureRender.this.f209734o = null;
                    }
                }
                TextureRender.this.m224006w();
                if (TextureRender.this.f209743x == 2) {
                    TextureRender.this.f209740u = i;
                    TextureRender.this.f209741v = i2;
                } else {
                    int i8 = i3;
                    if (i8 == 90 || i8 == 270) {
                        TextureRender.this.f209741v = i;
                        TextureRender.this.f209740u = i2;
                    } else {
                        TextureRender.this.f209740u = i;
                        TextureRender.this.f209741v = i2;
                    }
                }
                if (TextureRender.this.f209743x == 0) {
                    boolean z2 = z;
                    TextureRender textureRender5 = TextureRender.this;
                    if (z2) {
                        textureRender5.f209723d.changeCurRotation(360 - i3);
                        TextureRender.this.f209723d.flipPosition(2);
                    } else {
                        textureRender5.f209723d.changeCurRotation(i3);
                        TextureRender.this.f209723d.flipPosition(1);
                    }
                    TextureRender.this.f209723d.setRenderSize(i, i2);
                } else {
                    TextureRender.this.f209724e.changeCurRotation(i3);
                    TextureRender.this.f209724e.flipPosition(1);
                    if (TextureRender.this.f209743x == 1) {
                        TextureRender.this.f209724e.setRenderSize(i, i2);
                    }
                }
                TextureRender.this.m223996S(i6, i7, i4);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m224024P(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f209720a = byteBuffer;
        this.f209721b = byteBuffer2;
    }

    /* JADX INFO: renamed from: Q */
    public void m224025Q(Bitmap bitmap) {
        Bitmap bitmap2 = this.f209703D;
        if (bitmap == bitmap2) {
            t9c.m189745c("TextureRender", "----updatePipLineBitmap: bitmap same, bitmap not drawed");
            return;
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            t9c.m189745c("TextureRender", "----updatePipLineBitmap: free Bitmap<>");
            this.f209703D.recycle();
            this.f209703D = null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f209703D = bitmap;
        int width = bitmap.getWidth();
        int height = this.f209703D.getHeight();
        if (this.f209701B == width && this.f209702C == height) {
            return;
        }
        t9c.m189745c("TextureRender", "----updatePipLineBitmap: [" + this.f209701B + Constants.SEPARATOR_COMMA + this.f209702C + "]--->[" + width + Constants.SEPARATOR_COMMA + height + Constants.AES_SUFFIX);
        this.f209701B = width;
        this.f209702C = height;
    }

    /* JADX INFO: renamed from: R */
    public void m224026R(SurfaceTexture surfaceTexture, int i) {
        this.f209745z = i;
        this.f209700A = surfaceTexture;
    }

    /* JADX INFO: renamed from: T */
    public void m224027T(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223297C2(j, surfaceTexture, i, bitmap);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            if (bitmap != null) {
                gLMergeTextureFilterManager.m223342G2(j, bitmap);
            } else {
                gLMergeTextureFilterManager.m223341F2(j, i, surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m224028j(VideoQuality videoQuality) {
        if (videoQuality != null) {
            zej zejVar = new zej();
            this.f209735p = zejVar;
            zejVar.setRenderSize(videoQuality.resX, videoQuality.resY);
            C22417a c22417a = new C22417a();
            this.f209736q = c22417a;
            c22417a.clearTarget();
            this.f209736q.setRenderSize(videoQuality.resX, videoQuality.resY);
            this.f209726g.removeTarget(this.f209736q);
            this.f209726g.addTarget(this.f209736q);
            return;
        }
        C22417a c22417a2 = this.f209736q;
        if (c22417a2 != null) {
            this.f209726g.removeTarget(c22417a2);
            this.f209736q.removeTarget(this.f209735p);
            this.f209722c.m172018a(this.f209736q);
        }
        this.f209736q = null;
        zej zejVar2 = this.f209735p;
        if (zejVar2 != null) {
            this.f209722c.m172018a(zejVar2);
        }
        this.f209735p = null;
    }

    /* JADX INFO: renamed from: k */
    public void m224029k(jt2 jt2Var) {
        pej pejVar = this.f209722c;
        if (pejVar != null) {
            pejVar.m172018a(jt2Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m224030l(long j, int i, int i2) {
        if (this.f209728i != null) {
            t9c.m189745c("TextureRender", "@@@ addSubView:ID[" + j + "];" + i + com.meituan.robust.Constants.PACKNAME_END + i2);
            this.f209728i.m223343h2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m224031m(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            t9c.m189745c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m224032n(float f, float f2, float f3, float f4, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m223298e2(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public SurfaceTexture m224033o() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f209730k = i;
        GLES20.glBindTexture(36197, i);
        m224031m("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m224031m("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f209730k);
        this.f209731l = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: p */
    public void m224034p() {
        m224008z(this.f209704E);
        C22417a c22417a = this.f209736q;
        if (c22417a != null) {
            c22417a.addTarget(this.f209735p);
            this.f209736q.onDrawFrame();
            this.f209736q.removeTarget(this.f209735p);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m224035q() {
        m224008z(this.f209704E);
        zej zejVar = this.f209734o;
        if (zejVar != null) {
            if (zejVar != null) {
                zejVar.onDrawFrame();
                GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
                if (gLMergeTextureFilterManager != null) {
                    gLMergeTextureFilterManager.removeTarget(this.f209734o);
                    return;
                } else {
                    this.f209727h.removeTarget(this.f209734o);
                    return;
                }
            }
            return;
        }
        t9c.m189745c("TextureRender", "----drawCodecFrame:" + this.f209738s + Constants.SEPARATOR_COMMA + this.f209739t);
        this.f209734o = new zej();
        GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f209728i;
        if (gLMergeTextureFilterManager2 != null) {
            gLMergeTextureFilterManager2.setRenderSize(this.f209738s, this.f209739t);
            this.f209728i.clearTarget();
            this.f209728i.addTarget(this.f209734o);
            this.f209728i.addTarget(this.f209733n);
            return;
        }
        this.f209727h.setRenderSize(this.f209738s, this.f209739t);
        this.f209727h.clearTarget();
        this.f209727h.addTarget(this.f209734o);
        this.f209727h.addTarget(this.f209733n);
    }

    /* JADX INFO: renamed from: r */
    public void m224036r() {
        Bitmap bitmap;
        m224008z(this.f209704E);
        if (this.f209722c != null) {
            int i = this.f209743x;
            if (i == 0) {
                gb20 gb20Var = this.f209723d;
                if (gb20Var != null) {
                    gb20Var.updateYUVBuffer(this.f209720a, this.f209721b);
                }
            } else if (i == 1) {
                qnw qnwVar = this.f209724e;
                if (qnwVar != null) {
                    qnwVar.loadTexture(this.f209745z, this.f209700A);
                }
            } else if (i == 2 && this.f209724e != null && (bitmap = this.f209703D) != null && !bitmap.isRecycled()) {
                this.f209724e.loadTexture(this.f209703D);
            }
            this.f209722c.m172024h();
        }
        m224008z(this.f209705F);
    }

    /* JADX INFO: renamed from: s */
    public void m224037s() {
        qmq0 qmq0Var = this.f209725f;
        if (qmq0Var != null) {
            qmq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m224038t() {
        return this.f209731l;
    }

    /* JADX INFO: renamed from: u */
    public int m224039u() {
        GLES20.glFinish();
        C22417a c22417a = this.f209736q;
        if (c22417a != null) {
            return c22417a.getTextOutID();
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        return gLMergeTextureFilterManager != null ? gLMergeTextureFilterManager.getTextOutID() : this.f209727h.getTextOutID();
    }

    /* JADX INFO: renamed from: v */
    public int m224040v() {
        return this.f209730k;
    }

    /* JADX INFO: renamed from: y */
    public void m224041y() {
        this.f209731l = null;
        pej pejVar = this.f209722c;
        if (pejVar != null) {
            pejVar.m172021d();
            this.f209722c = null;
        }
        C22417a c22417a = this.f209726g;
        if (c22417a != null) {
            c22417a.destroy();
            this.f209726g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f209727h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f209727h = null;
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f209728i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.destroy();
            this.f209728i = null;
        }
        zej zejVar = this.f209734o;
        if (zejVar != null) {
            zejVar.destroy();
            this.f209734o = null;
        }
        zej zejVar2 = this.f209733n;
        if (zejVar2 != null) {
            zejVar2.destroy();
            this.f209733n = null;
        }
        qmq0 qmq0Var = this.f209725f;
        if (qmq0Var != null) {
            qmq0Var.destroy();
            this.f209725f = null;
        }
        jt2 jt2Var = this.f209732m;
        if (jt2Var != null) {
            jt2Var.destroy();
            this.f209732m = null;
        }
        ByteBuffer byteBuffer = this.f209721b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f209721b = null;
        }
        ByteBuffer byteBuffer2 = this.f209720a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f209720a = null;
        }
        Queue<Runnable> queue = this.f209704E;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f209705F;
        if (queue2 != null) {
            queue2.clear();
        }
    }
}
