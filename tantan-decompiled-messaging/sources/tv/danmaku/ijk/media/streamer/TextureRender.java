package tv.danmaku.ijk.media.streamer;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import p149l.fcj;
import p149l.ldq0;
import p149l.n8c;
import p149l.rkw;
import p149l.ts2;
import p149l.vbj;
import p149l.y220;
import project.android.imageprocessing.ext.C22302a;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilter;
import tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
class TextureRender {

    /* JADX INFO: renamed from: E */
    private final Queue<Runnable> f208782E;

    /* JADX INFO: renamed from: F */
    private final Queue<Runnable> f208783F;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f208798a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f208799b;

    /* JADX INFO: renamed from: c */
    vbj f208800c;

    /* JADX INFO: renamed from: d */
    y220 f208801d;

    /* JADX INFO: renamed from: e */
    rkw f208802e;

    /* JADX INFO: renamed from: f */
    ldq0 f208803f;

    /* JADX INFO: renamed from: g */
    C22302a f208804g;

    /* JADX INFO: renamed from: h */
    GLMergeTextureFilter f208805h;

    /* JADX INFO: renamed from: i */
    GLMergeTextureFilterManager f208806i;

    /* JADX INFO: renamed from: j */
    ldq0.InterfaceC18199a f208807j;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f208809l;

    /* JADX INFO: renamed from: m */
    private ts2 f208810m;

    /* JADX INFO: renamed from: n */
    private fcj f208811n;

    /* JADX INFO: renamed from: o */
    private fcj f208812o;

    /* JADX INFO: renamed from: p */
    private fcj f208813p;

    /* JADX INFO: renamed from: q */
    private C22302a f208814q;

    /* JADX INFO: renamed from: r */
    private VideoQuality f208815r;

    /* JADX INFO: renamed from: s */
    private int f208816s;

    /* JADX INFO: renamed from: t */
    private int f208817t;

    /* JADX INFO: renamed from: w */
    private boolean f208820w;

    /* JADX INFO: renamed from: x */
    private int f208821x;

    /* JADX INFO: renamed from: k */
    private int f208808k = -12345;

    /* JADX INFO: renamed from: u */
    private int f208818u = 480;

    /* JADX INFO: renamed from: v */
    private int f208819v = 640;

    /* JADX INFO: renamed from: y */
    private int f208822y = -1;

    /* JADX INFO: renamed from: z */
    private int f208823z = 0;

    /* JADX INFO: renamed from: A */
    private SurfaceTexture f208778A = null;

    /* JADX INFO: renamed from: B */
    private int f208779B = 0;

    /* JADX INFO: renamed from: C */
    private int f208780C = 0;

    /* JADX INFO: renamed from: D */
    private Bitmap f208781D = null;

    /* JADX INFO: renamed from: G */
    private int f208784G = 0;

    /* JADX INFO: renamed from: H */
    private int f208785H = 0;

    /* JADX INFO: renamed from: I */
    private boolean f208786I = false;

    /* JADX INFO: renamed from: J */
    private int f208787J = 0;

    /* JADX INFO: renamed from: K */
    private int f208788K = 0;

    /* JADX INFO: renamed from: L */
    private int f208789L = 0;

    /* JADX INFO: renamed from: M */
    private int f208790M = 0;

    /* JADX INFO: renamed from: N */
    private int f208791N = 0;

    /* JADX INFO: renamed from: O */
    private int f208792O = -1;

    /* JADX INFO: renamed from: P */
    private int f208793P = -1;

    /* JADX INFO: renamed from: Q */
    private int f208794Q = -1;

    /* JADX INFO: renamed from: R */
    private int f208795R = -1;

    /* JADX INFO: renamed from: S */
    private boolean f208796S = false;

    /* JADX INFO: renamed from: T */
    private int f208797T = 1;

    public TextureRender(ts2 ts2Var, VideoQuality videoQuality, int i) {
        this.f208816s = 352;
        this.f208817t = 640;
        this.f208821x = i;
        if (videoQuality != null) {
            this.f208815r = videoQuality;
            this.f208816s = videoQuality.resX;
            this.f208817t = videoQuality.resY;
        }
        this.f208820w = false;
        this.f208782E = new LinkedList();
        this.f208783F = new LinkedList();
        m222761x(ts2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m222750S(int i, int i2, int i3) {
        int i4;
        if (this.f208821x != 0) {
            this.f208816s = i;
            this.f208817t = i2;
        } else if (i3 == 1) {
            if (i > i2) {
                this.f208816s = i2;
                this.f208817t = i;
            } else {
                this.f208816s = i;
                this.f208817t = i2;
            }
        } else if (i3 == 2) {
            if (i2 > i) {
                this.f208816s = i2;
                this.f208817t = i;
            } else {
                this.f208816s = i;
                this.f208817t = i2;
            }
        }
        this.f208804g.m221289W1(i3);
        this.f208804g.setRenderSize(this.f208816s, this.f208817t);
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            int i5 = this.f208797T;
            if (i5 == 1) {
                this.f208792O = 0;
                this.f208793P = 0;
                this.f208794Q = this.f208816s;
                this.f208795R = this.f208817t;
                i4 = 0;
            } else {
                if (this.f208792O == -1 || this.f208793P == -1 || this.f208794Q < 0 || this.f208795R < 0) {
                    this.f208792O = 0;
                    this.f208793P = 0;
                    this.f208794Q = this.f208816s;
                    this.f208795R = this.f208817t;
                }
                i4 = 1;
            }
            gLMergeTextureFilterManager.m222104v2(i5 == 2);
            this.f208806i.m222106x2(this.f208792O, this.f208793P, this.f208794Q, this.f208795R, i4);
            this.f208806i.m222105w2(this.f208821x);
            this.f208806i.m222103u2(i3);
            this.f208806i.setRenderSize(this.f208816s, this.f208817t);
            this.f208806i.m222107z2(this.f208816s, this.f208817t);
            if (this.f208821x == 1 && i3 == 3) {
                this.f208806i.m222090A2(this.f208822y);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            int i6 = this.f208797T;
            if (i6 != 1 && i6 == 2) {
                if (this.f208792O == -1 || this.f208793P == -1 || this.f208794Q <= 0 || this.f208795R <= 0) {
                    this.f208792O = 0;
                    this.f208793P = 0;
                    this.f208794Q = this.f208816s;
                    this.f208795R = this.f208817t;
                }
                gLMergeTextureFilter.m222059u2(true);
            } else {
                this.f208792O = 0;
                this.f208793P = 0;
                this.f208794Q = this.f208816s;
                this.f208795R = this.f208817t;
                gLMergeTextureFilter.m222059u2(false);
            }
            this.f208805h.m222063y2(0L, this.f208792O, this.f208793P, this.f208794Q, this.f208795R, 0);
            this.f208805h.m222056r2(this.f208821x);
            this.f208805h.m222057s2(i3);
            this.f208805h.setRenderSize(this.f208816s, this.f208817t);
            if (this.f208821x == 1) {
                GLMergeTextureFilter gLMergeTextureFilter2 = this.f208805h;
                if (i3 == 3) {
                    gLMergeTextureFilter2.m222058t2(this.f208822y);
                } else {
                    gLMergeTextureFilter2.m222058t2(-1);
                }
            }
        }
        fcj fcjVar = this.f208811n;
        if (fcjVar != null) {
            fcjVar.setRenderSize(this.f208816s, this.f208817t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m222760w() {
        ts2 ts2Var;
        if (this.f208820w || (ts2Var = this.f208810m) == null || this.f208804g == null) {
            return;
        }
        if (this.f208805h == null && this.f208806i == null) {
            return;
        }
        ts2Var.clearTarget();
        this.f208810m.addTarget(this.f208804g);
        this.f208804g.clearTarget();
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        C22302a c22302a = this.f208804g;
        if (gLMergeTextureFilterManager != null) {
            c22302a.addTarget(gLMergeTextureFilterManager);
            this.f208806i.clearTarget();
            this.f208806i.addTarget(this.f208811n);
        } else {
            c22302a.addTarget(this.f208805h);
            this.f208805h.clearTarget();
            this.f208805h.addTarget(this.f208811n);
        }
        this.f208820w = true;
    }

    /* JADX INFO: renamed from: x */
    private void m222761x(ts2 ts2Var) {
        this.f208810m = ts2Var;
        this.f208801d = new y220();
        this.f208802e = new rkw();
        vbj vbjVar = new vbj();
        vbjVar.m197714c(this.f208816s, this.f208817t);
        if (this.f208821x == 0) {
            this.f208801d.addTarget(this.f208810m);
        } else {
            this.f208802e.addTarget(this.f208810m);
        }
        this.f208811n = new fcj();
        this.f208805h = null;
        this.f208806i = new GLMergeTextureFilterManager(vbjVar);
        this.f208804g = new C22302a();
        if (this.f208821x == 0) {
            vbjVar.m197713b(this.f208801d);
        } else {
            vbjVar.m197713b(this.f208802e);
        }
        vbjVar.m197721k();
        this.f208800c = vbjVar;
    }

    /* JADX INFO: renamed from: z */
    private void m222762z(Queue<Runnable> queue) {
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
    public void m222763A(Runnable runnable) {
        synchronized (this.f208782E) {
            this.f208782E.add(runnable);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m222764B(ts2 ts2Var) {
        ts2 ts2Var2 = this.f208810m;
        if (ts2Var2 != null) {
            ts2Var2.clearTarget();
            if (this.f208821x == 0) {
                this.f208801d.removeTarget(this.f208810m);
            } else {
                this.f208802e.removeTarget(this.f208810m);
            }
            this.f208800c.m197712a(this.f208810m);
        }
        this.f208810m = ts2Var;
        if (this.f208821x == 0) {
            this.f208801d.addTarget(ts2Var);
        } else {
            this.f208802e.addTarget(ts2Var);
        }
        this.f208810m.addTarget(this.f208804g);
    }

    /* JADX INFO: renamed from: C */
    public void m222765C(int i) {
        n8c.m158485c("TextureRender", "switch input capture:" + this.f208821x + "--->" + i);
        if (i != this.f208821x) {
            this.f208800c.m197719i();
            if (i == 0) {
                this.f208802e.removeTarget(this.f208810m);
                this.f208800c.m197720j(this.f208802e);
                this.f208801d.addTarget(this.f208810m);
                this.f208800c.m197714c(this.f208816s, this.f208817t);
                this.f208800c.m197713b(this.f208801d);
                n8c.m158485c("TextureRender", "camera###");
            } else {
                rkw rkwVar = this.f208802e;
                if (i == 1) {
                    rkwVar.setOESMode(true);
                } else {
                    rkwVar.setOESMode(false);
                }
                this.f208801d.removeTarget(this.f208810m);
                this.f208800c.m197720j(this.f208801d);
                this.f208802e.addTarget(this.f208810m);
                this.f208800c.m197714c(this.f208816s, this.f208817t);
                this.f208800c.m197713b(this.f208802e);
                n8c.m158485c("TextureRender", "texture###");
            }
            this.f208800c.m197721k();
        }
        this.f208821x = i;
    }

    /* JADX INFO: renamed from: D */
    public void m222766D(final ldq0.InterfaceC18199a interfaceC18199a) {
        m222763A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.1
            @Override // java.lang.Runnable
            public void run() {
                ldq0.InterfaceC18199a interfaceC18199a2 = interfaceC18199a;
                TextureRender textureRender = TextureRender.this;
                if (interfaceC18199a2 == null) {
                    ldq0 ldq0Var = textureRender.f208803f;
                    if (ldq0Var != null) {
                        GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender.f208806i;
                        if (gLMergeTextureFilterManager != null) {
                            gLMergeTextureFilterManager.removeTarget(ldq0Var);
                        } else {
                            textureRender.f208805h.removeTarget(ldq0Var);
                        }
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f208800c.m197712a(textureRender2.f208803f);
                        TextureRender.this.f208803f = null;
                        return;
                    }
                    return;
                }
                textureRender.f208807j = interfaceC18199a2;
                if (textureRender.f208803f == null) {
                    textureRender.f208803f = new ldq0();
                    TextureRender textureRender3 = TextureRender.this;
                    textureRender3.f208803f.setRenderSize(textureRender3.f208816s, TextureRender.this.f208817t);
                    TextureRender textureRender4 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager2 = textureRender4.f208806i;
                    if (gLMergeTextureFilterManager2 != null) {
                        gLMergeTextureFilterManager2.addTarget(textureRender4.f208803f);
                    } else {
                        textureRender4.f208805h.addTarget(textureRender4.f208803f);
                    }
                }
                TextureRender textureRender5 = TextureRender.this;
                ldq0 ldq0Var2 = textureRender5.f208803f;
                if (ldq0Var2 != null) {
                    ldq0Var2.f127576a = textureRender5.f208807j;
                }
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m222767E(int i) {
        if (this.f208821x == 1) {
            this.f208822y = i;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m222090A2(i);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m222768F(VideoQuality videoQuality) {
        if ((this.f208805h == null && this.f208806i == null) || this.f208811n == null) {
            return;
        }
        m222762z(this.f208782E);
        if (videoQuality == null) {
            this.f208811n.setRenderSize(this.f208816s, this.f208817t);
            return;
        }
        int i = videoQuality.resX;
        int i2 = this.f208816s;
        if (i == i2) {
            int i3 = videoQuality.resY;
            int i4 = this.f208817t;
            if (i3 == i4) {
                this.f208811n.setRenderSize(i2, i4);
                return;
            }
        }
        this.f208811n.setRenderSize(i, videoQuality.resY);
    }

    /* JADX INFO: renamed from: G */
    public void m222769G(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222060v2(j, firstFrameDrawCallback);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m222099j2(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m222770H(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222061w2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m222094E2(j, z);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m222771I(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222062x2(j, z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m222772J(long j, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (j == 0) {
            this.f208792O = i;
            this.f208793P = i2;
            this.f208794Q = i3;
            this.f208795R = i4;
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
            if (gLMergeTextureFilterManager != null) {
                this.f208796S = true;
                gLMergeTextureFilterManager.m222106x2(i, i2, i3, i4, 1);
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
            if (this.f208806i != null) {
                n8c.m158485c("TextureRender", "@@@ (mergeFilterManager)setSubVideoPos: id[" + j + "], view[" + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i8 + Constants.SEPARATOR_COMMA + i9);
                this.f208806i.m222091B2(j, (float) i6, (float) i7, (float) i8, (float) i9, i5);
            }
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222063y2(j, i6, i7, i8, i9, i5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m222773K(long j, int i, int i2, int i3, int i4) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222064z2(j, i, i2, i3, i4);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m222092C2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m222774L(int i) {
        n8c.m158485c("TextureRender", "@@@ S merge(setViewShowMode):" + i + com.meituan.robust.Constants.PACKNAME_END + this.f208797T);
        if (i == this.f208797T) {
            return;
        }
        this.f208797T = i;
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (i == 2) {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m222059u2(true);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
            if (gLMergeTextureFilterManager != null) {
                gLMergeTextureFilterManager.m222104v2(true);
            }
        } else {
            if (gLMergeTextureFilter != null) {
                gLMergeTextureFilter.m222059u2(false);
            }
            GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f208806i;
            if (gLMergeTextureFilterManager2 != null) {
                gLMergeTextureFilterManager2.m222104v2(false);
            }
        }
        n8c.m158485c("TextureRender", "@@@ merge(setViewShowMode):" + i + com.meituan.robust.Constants.PACKNAME_END + this.f208797T);
    }

    /* JADX INFO: renamed from: M */
    public void m222775M(long j, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222050A2(j, z);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.m222101r2(j);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m222776N() {
        this.f208809l = m222787o();
    }

    /* JADX INFO: renamed from: O */
    public void m222777O(final int i, final int i2, final boolean z, final int i3, final int i4, int i5, final int i6, final int i7) {
        synchronized (this.f208782E) {
            this.f208782E.clear();
        }
        this.f208784G = i;
        this.f208785H = i2;
        this.f208786I = z;
        this.f208787J = i3;
        this.f208788K = i5;
        this.f208789L = i4;
        this.f208790M = i6;
        this.f208791N = i7;
        m222763A(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.TextureRender.2
            @Override // java.lang.Runnable
            public void run() {
                n8c.m158485c("TextureRender", "----updateCamera: " + i + Constants.SEPARATOR_COMMA + i2 + ", O:" + i6 + Constants.SEPARATOR_COMMA + i7);
                if (TextureRender.this.f208812o != null) {
                    TextureRender textureRender = TextureRender.this;
                    GLMergeTextureFilter gLMergeTextureFilter = textureRender.f208805h;
                    if (gLMergeTextureFilter != null) {
                        gLMergeTextureFilter.removeTarget(textureRender.f208812o);
                        TextureRender textureRender2 = TextureRender.this;
                        textureRender2.f208800c.m197712a(textureRender2.f208812o);
                        TextureRender.this.f208812o = null;
                    }
                    TextureRender textureRender3 = TextureRender.this;
                    GLMergeTextureFilterManager gLMergeTextureFilterManager = textureRender3.f208806i;
                    if (gLMergeTextureFilterManager != null) {
                        gLMergeTextureFilterManager.removeTarget(textureRender3.f208812o);
                        TextureRender textureRender4 = TextureRender.this;
                        textureRender4.f208800c.m197712a(textureRender4.f208812o);
                        TextureRender.this.f208812o = null;
                    }
                }
                TextureRender.this.m222760w();
                if (TextureRender.this.f208821x == 2) {
                    TextureRender.this.f208818u = i;
                    TextureRender.this.f208819v = i2;
                } else {
                    int i8 = i3;
                    if (i8 == 90 || i8 == 270) {
                        TextureRender.this.f208819v = i;
                        TextureRender.this.f208818u = i2;
                    } else {
                        TextureRender.this.f208818u = i;
                        TextureRender.this.f208819v = i2;
                    }
                }
                if (TextureRender.this.f208821x == 0) {
                    boolean z2 = z;
                    TextureRender textureRender5 = TextureRender.this;
                    if (z2) {
                        textureRender5.f208801d.changeCurRotation(360 - i3);
                        TextureRender.this.f208801d.flipPosition(2);
                    } else {
                        textureRender5.f208801d.changeCurRotation(i3);
                        TextureRender.this.f208801d.flipPosition(1);
                    }
                    TextureRender.this.f208801d.setRenderSize(i, i2);
                } else {
                    TextureRender.this.f208802e.changeCurRotation(i3);
                    TextureRender.this.f208802e.flipPosition(1);
                    if (TextureRender.this.f208821x == 1) {
                        TextureRender.this.f208802e.setRenderSize(i, i2);
                    }
                }
                TextureRender.this.m222750S(i6, i7, i4);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m222778P(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f208798a = byteBuffer;
        this.f208799b = byteBuffer2;
    }

    /* JADX INFO: renamed from: Q */
    public void m222779Q(Bitmap bitmap) {
        Bitmap bitmap2 = this.f208781D;
        if (bitmap == bitmap2) {
            n8c.m158485c("TextureRender", "----updatePipLineBitmap: bitmap same, bitmap not drawed");
            return;
        }
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            n8c.m158485c("TextureRender", "----updatePipLineBitmap: free Bitmap<>");
            this.f208781D.recycle();
            this.f208781D = null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f208781D = bitmap;
        int width = bitmap.getWidth();
        int height = this.f208781D.getHeight();
        if (this.f208779B == width && this.f208780C == height) {
            return;
        }
        n8c.m158485c("TextureRender", "----updatePipLineBitmap: [" + this.f208779B + Constants.SEPARATOR_COMMA + this.f208780C + "]--->[" + width + Constants.SEPARATOR_COMMA + height + Constants.AES_SUFFIX);
        this.f208779B = width;
        this.f208780C = height;
    }

    /* JADX INFO: renamed from: R */
    public void m222780R(SurfaceTexture surfaceTexture, int i) {
        this.f208823z = i;
        this.f208778A = surfaceTexture;
    }

    /* JADX INFO: renamed from: T */
    public void m222781T(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222051C2(j, surfaceTexture, i, bitmap);
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            if (bitmap != null) {
                gLMergeTextureFilterManager.m222096G2(j, bitmap);
            } else {
                gLMergeTextureFilterManager.m222095F2(j, i, surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m222782j(VideoQuality videoQuality) {
        if (videoQuality != null) {
            fcj fcjVar = new fcj();
            this.f208813p = fcjVar;
            fcjVar.setRenderSize(videoQuality.resX, videoQuality.resY);
            C22302a c22302a = new C22302a();
            this.f208814q = c22302a;
            c22302a.clearTarget();
            this.f208814q.setRenderSize(videoQuality.resX, videoQuality.resY);
            this.f208804g.removeTarget(this.f208814q);
            this.f208804g.addTarget(this.f208814q);
            return;
        }
        C22302a c22302a2 = this.f208814q;
        if (c22302a2 != null) {
            this.f208804g.removeTarget(c22302a2);
            this.f208814q.removeTarget(this.f208813p);
            this.f208800c.m197712a(this.f208814q);
        }
        this.f208814q = null;
        fcj fcjVar2 = this.f208813p;
        if (fcjVar2 != null) {
            this.f208800c.m197712a(fcjVar2);
        }
        this.f208813p = null;
    }

    /* JADX INFO: renamed from: k */
    public void m222783k(ts2 ts2Var) {
        vbj vbjVar = this.f208800c;
        if (vbjVar != null) {
            vbjVar.m197712a(ts2Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m222784l(long j, int i, int i2) {
        if (this.f208806i != null) {
            n8c.m158485c("TextureRender", "@@@ addSubView:ID[" + j + "];" + i + com.meituan.robust.Constants.PACKNAME_END + i2);
            this.f208806i.m222097h2(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m222785m(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            n8c.m158485c("TextureRender", str + ": glError " + iGlGetError);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m222786n(float f, float f2, float f3, float f4, boolean z) {
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.m222052e2(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: o */
    public SurfaceTexture m222787o() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f208808k = i;
        GLES20.glBindTexture(36197, i);
        m222785m("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        m222785m("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f208808k);
        this.f208809l = surfaceTexture;
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: p */
    public void m222788p() {
        m222762z(this.f208782E);
        C22302a c22302a = this.f208814q;
        if (c22302a != null) {
            c22302a.addTarget(this.f208813p);
            this.f208814q.onDrawFrame();
            this.f208814q.removeTarget(this.f208813p);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m222789q() {
        m222762z(this.f208782E);
        fcj fcjVar = this.f208812o;
        if (fcjVar != null) {
            if (fcjVar != null) {
                fcjVar.onDrawFrame();
                GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
                if (gLMergeTextureFilterManager != null) {
                    gLMergeTextureFilterManager.removeTarget(this.f208812o);
                    return;
                } else {
                    this.f208805h.removeTarget(this.f208812o);
                    return;
                }
            }
            return;
        }
        n8c.m158485c("TextureRender", "----drawCodecFrame:" + this.f208816s + Constants.SEPARATOR_COMMA + this.f208817t);
        this.f208812o = new fcj();
        GLMergeTextureFilterManager gLMergeTextureFilterManager2 = this.f208806i;
        if (gLMergeTextureFilterManager2 != null) {
            gLMergeTextureFilterManager2.setRenderSize(this.f208816s, this.f208817t);
            this.f208806i.clearTarget();
            this.f208806i.addTarget(this.f208812o);
            this.f208806i.addTarget(this.f208811n);
            return;
        }
        this.f208805h.setRenderSize(this.f208816s, this.f208817t);
        this.f208805h.clearTarget();
        this.f208805h.addTarget(this.f208812o);
        this.f208805h.addTarget(this.f208811n);
    }

    /* JADX INFO: renamed from: r */
    public void m222790r() {
        Bitmap bitmap;
        m222762z(this.f208782E);
        if (this.f208800c != null) {
            int i = this.f208821x;
            if (i == 0) {
                y220 y220Var = this.f208801d;
                if (y220Var != null) {
                    y220Var.updateYUVBuffer(this.f208798a, this.f208799b);
                }
            } else if (i == 1) {
                rkw rkwVar = this.f208802e;
                if (rkwVar != null) {
                    rkwVar.loadTexture(this.f208823z, this.f208778A);
                }
            } else if (i == 2 && this.f208802e != null && (bitmap = this.f208781D) != null && !bitmap.isRecycled()) {
                this.f208802e.loadTexture(this.f208781D);
            }
            this.f208800c.m197718h();
        }
        m222762z(this.f208783F);
    }

    /* JADX INFO: renamed from: s */
    public void m222791s() {
        ldq0 ldq0Var = this.f208803f;
        if (ldq0Var != null) {
            ldq0Var.onDrawFrame();
        }
    }

    /* JADX INFO: renamed from: t */
    public SurfaceTexture m222792t() {
        return this.f208809l;
    }

    /* JADX INFO: renamed from: u */
    public int m222793u() {
        GLES20.glFinish();
        C22302a c22302a = this.f208814q;
        if (c22302a != null) {
            return c22302a.getTextOutID();
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        return gLMergeTextureFilterManager != null ? gLMergeTextureFilterManager.getTextOutID() : this.f208805h.getTextOutID();
    }

    /* JADX INFO: renamed from: v */
    public int m222794v() {
        return this.f208808k;
    }

    /* JADX INFO: renamed from: y */
    public void m222795y() {
        this.f208809l = null;
        vbj vbjVar = this.f208800c;
        if (vbjVar != null) {
            vbjVar.m197715d();
            this.f208800c = null;
        }
        C22302a c22302a = this.f208804g;
        if (c22302a != null) {
            c22302a.destroy();
            this.f208804g = null;
        }
        GLMergeTextureFilter gLMergeTextureFilter = this.f208805h;
        if (gLMergeTextureFilter != null) {
            gLMergeTextureFilter.destroy();
            this.f208805h = null;
        }
        GLMergeTextureFilterManager gLMergeTextureFilterManager = this.f208806i;
        if (gLMergeTextureFilterManager != null) {
            gLMergeTextureFilterManager.destroy();
            this.f208806i = null;
        }
        fcj fcjVar = this.f208812o;
        if (fcjVar != null) {
            fcjVar.destroy();
            this.f208812o = null;
        }
        fcj fcjVar2 = this.f208811n;
        if (fcjVar2 != null) {
            fcjVar2.destroy();
            this.f208811n = null;
        }
        ldq0 ldq0Var = this.f208803f;
        if (ldq0Var != null) {
            ldq0Var.destroy();
            this.f208803f = null;
        }
        ts2 ts2Var = this.f208810m;
        if (ts2Var != null) {
            ts2Var.destroy();
            this.f208810m = null;
        }
        ByteBuffer byteBuffer = this.f208799b;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f208799b = null;
        }
        ByteBuffer byteBuffer2 = this.f208798a;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.f208798a = null;
        }
        Queue<Runnable> queue = this.f208782E;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f208783F;
        if (queue2 != null) {
            queue2.clear();
        }
    }
}
