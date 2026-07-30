package tv.danmaku.ijk.media.streamer;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import l.n8c;
import p003l.fcj;
import p003l.ldq0;
import p003l.rkw;
import p003l.ts2;
import p003l.vbj;
import p003l.y220;
import project.android.imageprocessing.ext.C1095a;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class TextureRender {

    /* JADX INFO: renamed from: E */
    private final Queue<Runnable> f12407E;

    /* JADX INFO: renamed from: F */
    private final Queue<Runnable> f12408F;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f12423a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f12424b;

    /* JADX INFO: renamed from: c */
    vbj f12425c;

    /* JADX INFO: renamed from: d */
    y220 f12426d;

    /* JADX INFO: renamed from: e */
    rkw f12427e;

    /* JADX INFO: renamed from: f */
    ldq0 f12428f;

    /* JADX INFO: renamed from: g */
    C1095a f12429g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f12430h;

    /* JADX INFO: renamed from: i */
    GLMergeTextureFilterManager f12431i;

    /* JADX INFO: renamed from: j */
    ldq0.InterfaceC0404a f12432j;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f12434l;

    /* JADX INFO: renamed from: m */
    private ts2 f12435m;

    /* JADX INFO: renamed from: n */
    private fcj f12436n;

    /* JADX INFO: renamed from: o */
    private fcj f12437o;

    /* JADX INFO: renamed from: p */
    private fcj f12438p;

    /* JADX INFO: renamed from: q */
    private C1095a f12439q;

    /* JADX INFO: renamed from: r */
    private VideoQuality f12440r;

    /* JADX INFO: renamed from: s */
    private int f12441s;

    /* JADX INFO: renamed from: t */
    private int f12442t;

    /* JADX INFO: renamed from: w */
    private boolean f12445w;

    /* JADX INFO: renamed from: x */
    private int f12446x;

    /* JADX INFO: renamed from: k */
    private int f12433k = -12345;

    /* JADX INFO: renamed from: u */
    private int f12443u = 480;

    /* JADX INFO: renamed from: v */
    private int f12444v = 640;

    /* JADX INFO: renamed from: y */
    private int f12447y = -1;

    /* JADX INFO: renamed from: z */
    private int f12448z = 0;

    /* JADX INFO: renamed from: A */
    private SurfaceTexture f12403A = null;

    /* JADX INFO: renamed from: B */
    private int f12404B = 0;

    /* JADX INFO: renamed from: C */
    private int f12405C = 0;

    /* JADX INFO: renamed from: D */
    private Bitmap f12406D = null;

    /* JADX INFO: renamed from: G */
    private int f12409G = 0;

    /* JADX INFO: renamed from: H */
    private int f12410H = 0;

    /* JADX INFO: renamed from: I */
    private boolean f12411I = false;

    /* JADX INFO: renamed from: J */
    private int f12412J = 0;

    /* JADX INFO: renamed from: K */
    private int f12413K = 0;

    /* JADX INFO: renamed from: L */
    private int f12414L = 0;

    /* JADX INFO: renamed from: M */
    private int f12415M = 0;

    /* JADX INFO: renamed from: N */
    private int f12416N = 0;

    /* JADX INFO: renamed from: O */
    private int f12417O = -1;

    /* JADX INFO: renamed from: P */
    private int f12418P = -1;

    /* JADX INFO: renamed from: Q */
    private int f12419Q = -1;

    /* JADX INFO: renamed from: R */
    private int f12420R = -1;

    /* JADX INFO: renamed from: S */
    private boolean f12421S = false;

    /* JADX INFO: renamed from: T */
    private int f12422T = 1;

    public TextureRender(ts2 ts2Var, VideoQuality videoQuality, int i) {
        this.f12441s = 352;
        this.f12442t = 640;
        this.f12446x = i;
        if (videoQuality != null) {
            this.f12440r = videoQuality;
            this.f12441s = videoQuality.resX;
            this.f12442t = videoQuality.resY;
        }
        this.f12445w = false;
        this.f12407E = new LinkedList();
        this.f12408F = new LinkedList();
        m11232x(ts2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m11221S(int i, int i2, int i3) {
        int i4;
        if (this.f12446x != 0) {
            this.f12441s = i;
            this.f12442t = i2;
        } else if (i3 == 1) {
            if (i > i2) {
                this.f12441s = i2;
                this.f12442t = i;
            } else {
                this.f12441s = i;
                this.f12442t = i2;
            }
        } else if (i3 == 2) {
            if (i2 > i) {
                this.f12441s = i2;
                this.f12442t = i;
            } else {
                this.f12441s = i;
                this.f12442t = i2;
            }
        }
        this.f12429g.m9746W1(i3);
        this.f12429g.setRenderSize(this.f12441s, this.f12442t);
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            int i5 = this.f12422T;
            if (i5 == 1) {
                this.f12417O = 0;
                this.f12418P = 0;
                this.f12419Q = this.f12441s;
                this.f12420R = this.f12442t;
                i4 = 0;
            } else {
                if (this.f12417O == -1 || this.f12418P == -1 || this.f12419Q < 0 || this.f12420R < 0) {
                    this.f12417O = 0;
                    this.f12418P = 0;
                    this.f12419Q = this.f12441s;
                    this.f12420R = this.f12442t;
                }
                i4 = 1;
            }
            gLMergeTextureFilterManager.m10575v2(i5 == 2);
            this.f12431i.m10577x2(this.f12417O, this.f12418P, this.f12419Q, this.f12420R, i4);
            this.f12431i.m10576w2(this.f12446x);
            this.f12431i.m10574u2(i3);
            this.f12431i.setRenderSize(this.f12441s, this.f12442t);
            this.f12431i.m10578z2(this.f12441s, this.f12442t);
            if (this.f12446x == 1 && i3 == 3) {
                this.f12431i.m10561A2(this.f12447y);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            int i6 = this.f12422T;
            if (i6 != 1 && i6 == 2) {
                if (this.f12417O == -1 || this.f12418P == -1 || this.f12419Q <= 0 || this.f12420R <= 0) {
                    this.f12417O = 0;
                    this.f12418P = 0;
                    this.f12419Q = this.f12441s;
                    this.f12420R = this.f12442t;
                }
                gLMergeTextureFilter.m10530u2(true);
            } else {
                this.f12417O = 0;
                this.f12418P = 0;
                this.f12419Q = this.f12441s;
                this.f12420R = this.f12442t;
                gLMergeTextureFilter.m10530u2(false);
            }
            this.f12430h.m10534y2(0L, this.f12417O, this.f12418P, this.f12419Q, this.f12420R, 0);
            this.f12430h.m10527r2(this.f12446x);
            this.f12430h.m10528s2(i3);
            this.f12430h.setRenderSize(this.f12441s, this.f12442t);
            if (this.f12446x == 1) {
                GLMergeTextureFilter gLMergeTextureFilter2 = this.f12430h;
                if (i3 == 3) {
                    gLMergeTextureFilter2.m10529t2(this.f12447y);
                } else {
                    gLMergeTextureFilter2.m10529t2(-1);
                }
            }
        }
        fcj fcjVar = this.f12436n;
        if (fcjVar != null) {
            fcjVar.setRenderSize(this.f12441s, this.f12442t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m11231w() {
        ts2 ts2Var;
        if (this.f12445w || (ts2Var = this.f12435m) == null || this.f12429g == null) {
            return;
        }
        if (this.f12430h == null && this.f12431i == null) {
            return;
        }
        ts2Var.clearTarget();
        this.f12435m.addTarget(this.f12429g);
        this.f12429g.clearTarget();
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        C1095a c1095a = this.f12429g;
        if (gLMergeTextureFilterManager != null) {
            c1095a.addTarget(gLMergeTextureFilterManager);
            this.f12431i.clearTarget();
            this.f12431i.addTarget(this.f12436n);
        } else {
            c1095a.addTarget(this.f12430h);
            this.f12430h.clearTarget();
            this.f12430h.addTarget(this.f12436n);
        }
        this.f12445w = true;
    }

    /* JADX INFO: renamed from: x */
    private void m11232x(ts2 ts2Var) {
        this.f12435m = ts2Var;
        this.f12426d = new y220();
        this.f12427e = new rkw();
        vbj vbjVar = new vbj();
        vbjVar.m8353c(this.f12441s, this.f12442t);
        if (this.f12446x == 0) {
            this.f12426d.addTarget(this.f12435m);
        } else {
            this.f12427e.addTarget(this.f12435m);
        }
        this.f12436n = new fcj();
        this.f12430h = null;
        this.f12431i = new GLMergeTextureFilterManager(vbjVar);
        this.f12429g = new C1095a();
        if (this.f12446x == 0) {
            vbjVar.m8352b(this.f12426d);
        } else {
            vbjVar.m8352b(this.f12427e);
        }
        vbjVar.m8360k();
        this.f12425c = vbjVar;
    }

    /* JADX INFO: renamed from: z */
    private void m11233z(Queue<Runnable> queue) {
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
    public void m11234A(Runnable runnable) {
        synchronized (this.f12407E) {
            this.f12407E.add(runnable);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m11235B(ts2 ts2Var) {
        ts2 ts2Var2 = this.f12435m;
        if (ts2Var2 != null) {
            ts2Var2.clearTarget();
            if (this.f12446x == 0) {
                this.f12426d.removeTarget(this.f12435m);
            } else {
                this.f12427e.removeTarget(this.f12435m);
            }
            this.f12425c.m8351a(this.f12435m);
        }
        this.f12435m = ts2Var;
        if (this.f12446x == 0) {
            this.f12426d.addTarget(ts2Var);
        } else {
            this.f12427e.addTarget(ts2Var);
        }
        this.f12435m.addTarget(this.f12429g);
    }

    /* JADX INFO: renamed from: C */
    public void m11236C(int i) {
        n8c.c("TextureRender", "switch input capture:" + this.f12446x + "--->" + i);
        if (i != this.f12446x) {
            this.f12425c.m8358i();
            if (i == 0) {
                this.f12427e.removeTarget(this.f12435m);
                this.f12425c.m8359j(this.f12427e);
                this.f12426d.addTarget(this.f12435m);
                this.f12425c.m8353c(this.f12441s, this.f12442t);
                this.f12425c.m8352b(this.f12426d);
                n8c.c("TextureRender", "camera###");
            } else {
                rkw rkwVar = this.f12427e;
                if (i == 1) {
                    rkwVar.setOESMode(true);
                } else {
                    rkwVar.setOESMode(false);
                }
                this.f12426d.removeTarget(this.f12435m);
                this.f12425c.m8359j(this.f12426d);
                this.f12427e.addTarget(this.f12435m);
                this.f12425c.m8353c(this.f12441s, this.f12442t);
                this.f12425c.m8352b(this.f12427e);
                n8c.c("TextureRender", "texture###");
            }
            this.f12425c.m8360k();
        }
        this.f12446x = i;
    }

    /* JADX INFO: renamed from: D */
    public void m11237D(final ldq0.InterfaceC0404a interfaceC0404a) {
        m11234A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.1
            @Override // java.lang.Runnable
            public void run() {
                ldq0.InterfaceC0404a interfaceC0404a2 = interfaceC0404a;
                TextureRender textureRender = TextureRender.this;
                if (interfaceC0404a2 == null) {
                    ldq0 ldq0Var = textureRender.f12428f;
                    if (ldq0Var != null) {
                        GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender.f12431i;
                        if (gLMergeTextureFilterManager != null) {
                            gLMergeTextureFilterManager.removeTarget(ldq0Var);
                        } else {
                            textureRender.f12430h.removeTarget(ldq0Var);
                        }
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f12425c.m8351a(textureRender2.f12428f);
                        TextureRender.this.f12428f = null;
                        return;
                    }
                    return;
                }
                textureRender.f12432j = interfaceC0404a2;
                if (textureRender.f12428f == null) {
                    textureRender.f12428f = new ldq0();
                    TextureRender textureRender3 = TextureRender.this;
                    textureRender3.f12428f.setRenderSize(textureRender3.f12441s, TextureRender.this.f12442t);
                    TextureRender textureRender4 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager2 = textureRender4.f12431i;
                    if (gLMergeTextureFilterManager2 != null) {
                        gLMergeTextureFilterManager2.addTarget(textureRender4.f12428f);
                    } else {
                        textureRender4.f12430h.addTarget(textureRender4.f12428f);
                    }
                }
                TextureRender textureRender5 = TextureRender.this;
                ldq0 ldq0Var2 = textureRender5.f12428f;
                if (ldq0Var2 != null) {
                    ldq0Var2.f5263a = textureRender5.f12432j;
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m11238E(int i) {
        if (this.f12446x == 1) {
            this.f12447y = i;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m10561A2(i);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m11239F(VideoQuality videoQuality) {
        if ((this.f12430h == null && this.f12431i == null) || this.f12436n == null) {
            return;
        }
        m11233z(this.f12407E);
        if (videoQuality == null) {
            this.f12436n.setRenderSize(this.f12441s, this.f12442t);
            return;
        }
        int i = videoQuality.resX;
        int i2 = this.f12441s;
        if (i == i2) {
            int i3 = videoQuality.resY;
            int i4 = this.f12442t;
            if (i3 == i4) {
                this.f12436n.setRenderSize(i2, i4);
                return;
            }
        }
        this.f12436n.setRenderSize(i, videoQuality.resY);
    }

    /* JADX INFO: renamed from: G */
    public void m11240G(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10531v2(j, firstFrameDrawCallback);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m10570j2(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m11241H(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10532w2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m10565E2(j, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m11242I(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10533x2(j, z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m11243J(long j, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (j == 0) {
            this.f12417O = i;
            this.f12418P = i2;
            this.f12419Q = i3;
            this.f12420R = i4;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
            if (gLMergeTextureFilterManager != null) {
                this.f12421S = true;
                gLMergeTextureFilterManager.m10577x2(i, i2, i3, i4, 1);
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
            if (this.f12431i != null) {
                n8c.c("TextureRender", "@@@ (mergeFilterManager)setSubVideoPos: id[" + j + "], view[" + i6 + "," + i7 + "," + i8 + "," + i9);
                this.f12431i.m10562B2(j, (float) i6, (float) i7, (float) i8, (float) i9, i5);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10534y2(j, i6, i7, i8, i9, i5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m11244K(long j, int i, int i2, int i3, int i4) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10535z2(j, i, i2, i3, i4);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m10563C2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m11245L(int i) {
        n8c.c("TextureRender", "@@@ S merge(setViewShowMode):" + i + ";" + this.f12422T);
        if (i == this.f12422T) {
            return;
        }
        this.f12422T = i;
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (i == 2) {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m10530u2(true);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m10575v2(true);
            }
        } else {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m10530u2(false);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f12431i;
            if (gLMergeTextureFilterManager2 != null) {
                gLMergeTextureFilterManager2.m10575v2(false);
            }
        }
        n8c.c("TextureRender", "@@@ merge(setViewShowMode):" + i + ";" + this.f12422T);
    }

    /* JADX INFO: renamed from: M */
    public void m11246M(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10521A2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m10572r2(j);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m11247N() {
        this.f12434l = m11258o();
    }

    /* JADX INFO: renamed from: O */
    public void m11248O(final int i, final int i2, final boolean z, final int i3, final int i4, int i5, final int i6, final int i7) {
        synchronized (this.f12407E) {
            this.f12407E.clear();
        }
        this.f12409G = i;
        this.f12410H = i2;
        this.f12411I = z;
        this.f12412J = i3;
        this.f12413K = i5;
        this.f12414L = i4;
        this.f12415M = i6;
        this.f12416N = i7;
        m11234A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.2
            @Override // java.lang.Runnable
            public void run() {
                n8c.c("TextureRender", "----updateCamera: " + i + "," + i2 + ", O:" + i6 + "," + i7);
                if (TextureRender.this.f12437o != null) {
                    TextureRender textureRender = TextureRender.this;
                    GLMergeTextureFilter gLMergeTextureFilter = textureRender.f12430h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.removeTarget(textureRender.f12437o);
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f12425c.m8351a(textureRender2.f12437o);
                        TextureRender.this.f12437o = null;
                    }
                    TextureRender textureRender3 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender3.f12431i;
                    if (gLMergeTextureFilterManager != null) {
                        gLMergeTextureFilterManager.removeTarget(textureRender3.f12437o);
                        TextureRender textureRender4 = TextureRender.this;
                        textureRender4.f12425c.m8351a(textureRender4.f12437o);
                        TextureRender.this.f12437o = null;
                    }
                }
                TextureRender.this.m11231w();
                if (TextureRender.this.f12446x == 2) {
                    TextureRender.this.f12443u = i;
                    TextureRender.this.f12444v = i2;
                } else {
                    int i8 = i3;
                    if (i8 == 90 || i8 == 270) {
                        TextureRender.this.f12444v = i;
                        TextureRender.this.f12443u = i2;
                    } else {
                        TextureRender.this.f12443u = i;
                        TextureRender.this.f12444v = i2;
                    }
                }
                if (TextureRender.this.f12446x == 0) {
                    boolean z2 = z;
                    TextureRender textureRender5 = TextureRender.this;
                    if (z2) {
                        textureRender5.f12426d.changeCurRotation(360 - i3);
                        TextureRender.this.f12426d.flipPosition(2);
                    } else {
                        textureRender5.f12426d.changeCurRotation(i3);
                        TextureRender.this.f12426d.flipPosition(1);
                    }
                    TextureRender.this.f12426d.setRenderSize(i, i2);
                } else {
                    TextureRender.this.f12427e.changeCurRotation(i3);
                    TextureRender.this.f12427e.flipPosition(1);
                    if (TextureRender.this.f12446x == 1) {
                        TextureRender.this.f12427e.setRenderSize(i, i2);
                    }
                }
                TextureRender.this.m11221S(i6, i7, i4);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m11249P(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f12423a = byteBuffer;
        this.f12424b = byteBuffer2;
    }

    /* JADX INFO: renamed from: Q */
    public void m11250Q(Bitmap bitmap) {
        Bitmap bitmap2 = this.f12406D;
        if (bitmap == bitmap2) {
            n8c.c("TextureRender", "----updatePipLineBitmap: bitmap same, bitmap not drawed");
            return;
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            n8c.c("TextureRender", "----updatePipLineBitmap: free Bitmap<>");
            this.f12406D.recycle();
            this.f12406D = null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f12406D = bitmap;
        int width = bitmap.getWidth();
        int height = this.f12406D.getHeight();
        if (this.f12404B == width && this.f12405C == height) {
            return;
        }
        n8c.c("TextureRender", "----updatePipLineBitmap: [" + this.f12404B + "," + this.f12405C + "]--->[" + width + "," + height + "]");
        this.f12404B = width;
        this.f12405C = height;
    }

    /* JADX INFO: renamed from: R */
    public void m11251R(SurfaceTexture surfaceTexture, int i) {
        this.f12448z = i;
        this.f12403A = surfaceTexture;
    }

    /* JADX INFO: renamed from: T */
    public void m11252T(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10522C2(j, surfaceTexture, i, bitmap);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            if (bitmap != null) {
                gLMergeTextureFilterManager.m10567G2(j, bitmap);
            } else {
                gLMergeTextureFilterManager.m10566F2(j, i, surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11253j(VideoQuality videoQuality) {
        if (videoQuality != null) {
            fcj fcjVar = new fcj();
            this.f12438p = fcjVar;
            fcjVar.setRenderSize(videoQuality.resX, videoQuality.resY);
            C1095a c1095a = new C1095a();
            this.f12439q = c1095a;
            c1095a.clearTarget();
            this.f12439q.setRenderSize(videoQuality.resX, videoQuality.resY);
            this.f12429g.removeTarget(this.f12439q);
            this.f12429g.addTarget(this.f12439q);
            return;
        }
        C1095a c1095a2 = this.f12439q;
        if (c1095a2 != null) {
            this.f12429g.removeTarget(c1095a2);
            this.f12439q.removeTarget(this.f12438p);
            this.f12425c.m8351a(this.f12439q);
        }
        this.f12439q = null;
        fcj fcjVar2 = this.f12438p;
        if (fcjVar2 != null) {
            this.f12425c.m8351a(fcjVar2);
        }
        this.f12438p = null;
    }

    /* JADX INFO: renamed from: k */
    public void m11254k(ts2 ts2Var) {
        vbj vbjVar = this.f12425c;
        if (vbjVar != null) {
            vbjVar.m8351a(ts2Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11255l(long j, int i, int i2) {
        if (this.f12431i != null) {
            n8c.c("TextureRender", "@@@ addSubView:ID[" + j + "];" + i + ";" + i2);
            this.f12431i.m10568h2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m11256m(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            n8c.c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11257n(float f, float f2, float f3, float f4, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m10523e2(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public SurfaceTexture m11258o() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f12433k = i;
        GLES20.glBindTexture(36197, i);
        m11256m("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m11256m("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12433k);
        this.f12434l = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: p */
    public void m11259p() {
        m11233z(this.f12407E);
        C1095a c1095a = this.f12439q;
        if (c1095a != null) {
            c1095a.addTarget(this.f12438p);
            this.f12439q.onDrawFrame();
            this.f12439q.removeTarget(this.f12438p);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11260q() {
        m11233z(this.f12407E);
        fcj fcjVar = this.f12437o;
        if (fcjVar != null) {
            if (fcjVar != null) {
                fcjVar.onDrawFrame();
                GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
                if (gLMergeTextureFilterManager != null) {
                    gLMergeTextureFilterManager.removeTarget(this.f12437o);
                    return;
                } else {
                    this.f12430h.removeTarget(this.f12437o);
                    return;
                }
            }
            return;
        }
        n8c.c("TextureRender", "----drawCodecFrame:" + this.f12441s + "," + this.f12442t);
        this.f12437o = new fcj();
        GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f12431i;
        if (gLMergeTextureFilterManager2 != null) {
            gLMergeTextureFilterManager2.setRenderSize(this.f12441s, this.f12442t);
            this.f12431i.clearTarget();
            this.f12431i.addTarget(this.f12437o);
            this.f12431i.addTarget(this.f12436n);
            return;
        }
        this.f12430h.setRenderSize(this.f12441s, this.f12442t);
        this.f12430h.clearTarget();
        this.f12430h.addTarget(this.f12437o);
        this.f12430h.addTarget(this.f12436n);
    }

    /* JADX INFO: renamed from: r */
    public void m11261r() {
        Bitmap bitmap;
        m11233z(this.f12407E);
        if (this.f12425c != null) {
            int i = this.f12446x;
            if (i == 0) {
                y220 y220Var = this.f12426d;
                if (y220Var != null) {
                    y220Var.updateYUVBuffer(this.f12423a, this.f12424b);
                }
            } else if (i == 1) {
                rkw rkwVar = this.f12427e;
                if (rkwVar != null) {
                    rkwVar.loadTexture(this.f12448z, this.f12403A);
                }
            } else if (i == 2 && this.f12427e != null && (bitmap = this.f12406D) != null && !bitmap.isRecycled()) {
                this.f12427e.loadTexture(this.f12406D);
            }
            this.f12425c.m8357h();
        }
        m11233z(this.f12408F);
    }

    /* JADX INFO: renamed from: s */
    public void m11262s() {
        ldq0 ldq0Var = this.f12428f;
        if (ldq0Var != null) {
            ldq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m11263t() {
        return this.f12434l;
    }

    /* JADX INFO: renamed from: u */
    public int m11264u() {
        GLES20.glFinish();
        C1095a c1095a = this.f12439q;
        if (c1095a != null) {
            return c1095a.getTextOutID();
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        return gLMergeTextureFilterManager != null ? gLMergeTextureFilterManager.getTextOutID() : this.f12430h.getTextOutID();
    }

    /* JADX INFO: renamed from: v */
    public int m11265v() {
        return this.f12433k;
    }

    /* JADX INFO: renamed from: y */
    public void m11266y() {
        this.f12434l = null;
        vbj vbjVar = this.f12425c;
        if (vbjVar != null) {
            vbjVar.m8354d();
            this.f12425c = null;
        }
        C1095a c1095a = this.f12429g;
        if (c1095a != null) {
            c1095a.destroy();
            this.f12429g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f12430h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f12430h = null;
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f12431i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.destroy();
            this.f12431i = null;
        }
        fcj fcjVar = this.f12437o;
        if (fcjVar != null) {
            fcjVar.destroy();
            this.f12437o = null;
        }
        fcj fcjVar2 = this.f12436n;
        if (fcjVar2 != null) {
            fcjVar2.destroy();
            this.f12436n = null;
        }
        ldq0 ldq0Var = this.f12428f;
        if (ldq0Var != null) {
            ldq0Var.destroy();
            this.f12428f = null;
        }
        ts2 ts2Var = this.f12435m;
        if (ts2Var != null) {
            ts2Var.destroy();
            this.f12435m = null;
        }
        ByteBuffer byteBuffer = this.f12424b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f12424b = null;
        }
        ByteBuffer byteBuffer2 = this.f12423a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f12423a = null;
        }
        Queue<Runnable> queue = this.f12407E;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f12408F;
        if (queue2 != null) {
            queue2.clear();
        }
    }
}
