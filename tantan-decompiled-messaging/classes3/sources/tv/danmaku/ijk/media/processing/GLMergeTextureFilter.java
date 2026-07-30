package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Queue;
import l.n8c;
import l.ysf;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.jcj;
import p003l.mcj;
import p003l.og3;
import p003l.rbj;
import p003l.rkw;
import p003l.vbj;
import p003l.ybj;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GLMergeTextureFilter extends mcj implements jcj {

    /* JADX INFO: renamed from: A */
    private FloatBuffer[] f11570A;

    /* JADX INFO: renamed from: B */
    private float[] f11571B;

    /* JADX INFO: renamed from: C */
    private float[] f11572C;

    /* JADX INFO: renamed from: D */
    private float[] f11573D;

    /* JADX INFO: renamed from: E */
    private float[] f11574E;

    /* JADX INFO: renamed from: E0 */
    private final Queue<Runnable> f11575E0;

    /* JADX INFO: renamed from: F */
    private boolean f11576F;

    /* JADX INFO: renamed from: F0 */
    private final Queue<Runnable> f11577F0;

    /* JADX INFO: renamed from: G */
    private int f11578G;

    /* JADX INFO: renamed from: H */
    private int f11579H;

    /* JADX INFO: renamed from: I */
    private int f11580I;

    /* JADX INFO: renamed from: J */
    private int f11581J;

    /* JADX INFO: renamed from: K */
    private boolean f11582K;

    /* JADX INFO: renamed from: L */
    private int f11583L;

    /* JADX INFO: renamed from: M */
    private int f11584M;

    /* JADX INFO: renamed from: N */
    private float f11585N;

    /* JADX INFO: renamed from: O */
    private int f11586O;

    /* JADX INFO: renamed from: P */
    private int f11587P;

    /* JADX INFO: renamed from: Q */
    private float f11588Q;

    /* JADX INFO: renamed from: R */
    private float f11589R;

    /* JADX INFO: renamed from: S */
    private boolean f11590S;

    /* JADX INFO: renamed from: T */
    private int[] f11591T;

    /* JADX INFO: renamed from: U */
    private boolean f11592U;

    /* JADX INFO: renamed from: V */
    private boolean f11593V;

    /* JADX INFO: renamed from: W */
    private int f11594W;

    /* JADX INFO: renamed from: X */
    private int f11595X;

    /* JADX INFO: renamed from: Y */
    protected rkw f11596Y;

    /* JADX INFO: renamed from: Z */
    private int f11597Z;

    /* JADX INFO: renamed from: a */
    private vbj f11598a;

    /* JADX INFO: renamed from: b */
    private int f11599b;

    /* JADX INFO: renamed from: c */
    private int f11600c;

    /* JADX INFO: renamed from: d */
    protected int[] f11601d;

    /* JADX INFO: renamed from: e */
    protected int[] f11602e;

    /* JADX INFO: renamed from: f */
    protected int[] f11603f;

    /* JADX INFO: renamed from: g */
    protected int[] f11604g;

    /* JADX INFO: renamed from: i */
    protected int[] f11605i;

    /* JADX INFO: renamed from: j */
    protected int[] f11606j;

    /* JADX INFO: renamed from: k */
    protected rkw[] f11607k;

    /* JADX INFO: renamed from: k0 */
    private SurfaceTexture f11608k0;

    /* JADX INFO: renamed from: l */
    protected Bitmap[] f11609l;

    /* JADX INFO: renamed from: m */
    protected int[] f11610m;

    /* JADX INFO: renamed from: n */
    protected SurfaceTexture[] f11611n;

    /* JADX INFO: renamed from: o */
    protected boolean[] f11612o;

    /* JADX INFO: renamed from: p */
    protected int[] f11613p;

    /* JADX INFO: renamed from: p0 */
    private int f11614p0;

    /* JADX INFO: renamed from: q */
    protected int[] f11615q;

    /* JADX INFO: renamed from: r */
    protected int[] f11616r;

    /* JADX INFO: renamed from: s */
    protected int[] f11617s;

    /* JADX INFO: renamed from: t */
    protected long[] f11618t;

    /* JADX INFO: renamed from: u */
    protected AidSource.FirstFrameDrawCallback[] f11619u;

    /* JADX INFO: renamed from: v */
    protected int[] f11620v;

    /* JADX INFO: renamed from: x */
    protected int f11621x;

    /* JADX INFO: renamed from: y */
    protected int f11622y;

    /* JADX INFO: renamed from: z */
    private int f11623z;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilter$1 */
    class RunnableC12521 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f11624a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ GLMergeTextureFilter f11625b;

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f11624a;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            GLMergeTextureFilter gLMergeTextureFilter = this.f11625b;
            if (gLMergeTextureFilter.f11596Y == null) {
                gLMergeTextureFilter.f11596Y = new rkw();
                if (this.f11625b.f11596Y != null) {
                    int height = this.f11624a.getHeight();
                    int width = this.f11624a.getWidth();
                    this.f11625b.f11596Y.setOESMode(false);
                    this.f11625b.f11596Y.initWithGLContext();
                    this.f11625b.f11596Y.loadTexture(this.f11624a);
                    GLMergeTextureFilter gLMergeTextureFilter2 = this.f11625b;
                    gLMergeTextureFilter2.f11597Z = gLMergeTextureFilter2.f11596Y.getBitmapTextureID();
                    GLMergeTextureFilter gLMergeTextureFilter3 = this.f11625b;
                    gLMergeTextureFilter3.f11608k0 = gLMergeTextureFilter3.f11596Y.getBitmapSurfaceTexture();
                    if (this.f11625b.f11608k0 != null && this.f11625b.f11597Z >= 0) {
                        this.f11625b.f11594W = height;
                        this.f11625b.f11595X = width;
                    }
                }
            }
            if (this.f11625b.f11596Y != null) {
                int height2 = this.f11624a.getHeight();
                int width2 = this.f11624a.getWidth();
                this.f11625b.f11596Y.loadTexture(this.f11624a);
                GLMergeTextureFilter gLMergeTextureFilter4 = this.f11625b;
                gLMergeTextureFilter4.f11597Z = gLMergeTextureFilter4.f11596Y.getBitmapTextureID();
                GLMergeTextureFilter gLMergeTextureFilter5 = this.f11625b;
                gLMergeTextureFilter5.f11608k0 = gLMergeTextureFilter5.f11596Y.getBitmapSurfaceTexture();
                if (this.f11625b.f11608k0 != null && this.f11625b.f11597Z >= 0) {
                    this.f11625b.f11594W = height2;
                    this.f11625b.f11595X = width2;
                }
                this.f11625b.f11596Y.drawFrame();
                GLES20.glFlush();
                GLMergeTextureFilter gLMergeTextureFilter6 = this.f11625b;
                gLMergeTextureFilter6.f11614p0 = gLMergeTextureFilter6.f11596Y.getTextOutID();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public void m10497B2(int i) {
        n8c.c("mergeFilter", "swap(S): s0Pos[" + this.f11601d[0] + "," + this.f11602e[0] + "," + this.f11603f[0] + "," + this.f11604g[0] + "]--->s" + i + "Pos[" + this.f11601d[i] + "," + this.f11602e[i] + "," + this.f11603f[i] + "," + this.f11604g[i] + "], fsi:" + this.f11623z + ", svn:" + this.f11621x);
        int[] iArr = this.f11601d;
        int i2 = iArr[0];
        int[] iArr2 = this.f11602e;
        int i3 = iArr2[0];
        int[] iArr3 = this.f11603f;
        int i4 = iArr3[0];
        int[] iArr4 = this.f11604g;
        int i5 = iArr4[0];
        int[] iArr5 = this.f11605i;
        int i6 = iArr5[0];
        iArr[0] = iArr[i];
        iArr2[0] = iArr2[i];
        iArr3[0] = iArr3[i];
        iArr4[0] = iArr4[i];
        iArr5[0] = iArr5[i];
        iArr[i] = i2;
        iArr2[i] = i3;
        iArr3[i] = i4;
        iArr4[i] = i5;
        iArr5[i] = i6;
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ int m10507Z1(GLMergeTextureFilter gLMergeTextureFilter, int i) {
        int i2 = gLMergeTextureFilter.f11623z - i;
        gLMergeTextureFilter.f11623z = i2;
        return i2;
    }

    private void drawIndeed() {
        int iM10516j2;
        if (this.texture_in == 0 && this.f11622y == 0) {
            n8c.c("mergeFilter", "draw: " + this.texture_in + ", " + this.f11622y + "), FID:" + this.f11623z);
            return;
        }
        if (this.f11622y >= this.f11621x) {
            n8c.c("mergeFilter", "currence ID[" + this.f11622y + "]>" + this.f11621x);
            return;
        }
        int i = this.f11581J;
        if (i == 2) {
            iM10516j2 = m10515i2();
        } else {
            iM10516j2 = i == 1 ? m10516j2() : 0;
        }
        int[] iArr = this.f11601d;
        int i2 = this.f11622y;
        GLES20.glViewport(iArr[i2], iM10516j2, this.f11603f[i2], this.f11604g[i2]);
        GLES20.glUseProgram(this.programHandle);
        int i3 = this.f11623z;
        int i4 = this.f11622y;
        if (i3 == i4) {
            if (this.f11579H == 2 || this.f11593V) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
                this.f11593V = false;
                n8c.c("mergeFilter", "----drawIndeed: Clean=" + this.f11593V + ";" + this.f11592U);
            } else if (this.f11621x == 1 && (this.f11601d[i4] != 0 || this.f11602e[i4] != 0 || this.f11603f[i4] < this.f11613p[i4] || this.f11604g[i4] < this.f11615q[i4])) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
            }
        }
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        int[] iArr2 = this.f11620v;
        int i5 = this.f11622y;
        if (iArr2[i5] == 0) {
            iArr2[i5] = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public void m10512f2(int i) {
        int i2;
        if (this.f11601d[i] == -1 || this.f11602e[i] == -1 || this.f11603f[i] == -1 || this.f11604g[i] == -1) {
            this.f11606j[i] = -1;
            return;
        }
        rkw[] rkwVarArr = this.f11607k;
        rkw rkwVar = rkwVarArr[i];
        if (rkwVar != null) {
            if (this.f11615q[i] == -1 || this.f11613p[i] == -1) {
                this.f11606j[i] = -1;
                return;
            }
            if (this.f11616r[i] == 7) {
                rkwVar.loadTexture(this.f11609l[i]);
                this.f11610m[i] = this.f11607k[i].getBitmapTextureID();
                this.f11611n[i] = this.f11607k[i].getBitmapSurfaceTexture();
            } else {
                rkwVar.loadTexture(this.f11610m[i], this.f11611n[i]);
            }
            int i3 = this.f11616r[i];
            if (i3 == 2 || i3 == 3 || i3 == 9) {
                this.f11607k[i].setDisplayMode(this.f11613p[i], this.f11615q[i], 2);
                this.f11607k[i].setRenderSize(this.f11603f[i], this.f11604g[i]);
            } else {
                this.f11607k[i].setRenderSize(this.f11613p[i], this.f11615q[i]);
            }
            this.f11607k[i].drawFrame();
            GLES20.glFlush();
            this.f11606j[i] = this.f11607k[i].getTextOutID();
            return;
        }
        rkwVarArr[i] = new rkw();
        if (this.f11616r[i] == 7) {
            this.f11607k[i].setOESMode(false);
        }
        this.f11607k[i].initWithGLContext();
        int i4 = this.f11615q[i];
        if (i4 == -1 || (i2 = this.f11613p[i]) == -1) {
            this.f11606j[i] = -1;
            return;
        }
        int i5 = this.f11616r[i];
        if (i5 == 2 || i5 == 3 || i5 == 9) {
            this.f11607k[i].setDisplayMode(i2, i4, 2);
            this.f11607k[i].setRenderSize(this.f11603f[i], this.f11604g[i]);
        } else {
            this.f11607k[i].setRenderSize(i2, i4);
        }
        int i6 = this.f11616r[i];
        rkw[] rkwVarArr2 = this.f11607k;
        if (i6 == 7) {
            rkwVarArr2[i].loadTexture(this.f11609l[i]);
            this.f11610m[i] = this.f11607k[i].getBitmapTextureID();
            this.f11611n[i] = this.f11607k[i].getBitmapSurfaceTexture();
        } else {
            rkwVarArr2[i].loadTexture(this.f11610m[i], this.f11611n[i]);
        }
        this.f11607k[i].drawFrame();
        GLES20.glFlush();
        this.f11606j[i] = this.f11607k[i].getTextOutID();
    }

    /* JADX INFO: renamed from: g2 */
    private void m10513g2(int i, int i2, float f) {
        float f2;
        float f3;
        float f4 = i2;
        int i3 = (int) (f4 / f);
        float f5 = i;
        int i4 = (int) (f * f5);
        float f6 = 0.0f;
        float f7 = 1.0f;
        if (i3 < i) {
            float f8 = ((i - i3) * 0.5f) / f5;
            float f9 = 1.0f - f8;
            f6 = f8;
            f2 = 0.0f;
            f7 = f9;
            f3 = 1.0f;
        } else {
            f2 = ((i2 - i4) * 0.5f) / f4;
            f3 = 1.0f - f2;
        }
        m10520p2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: h2 */
    private void m10514h2(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int i5 = (i * i4) / i3;
        int i6 = (i3 * i2) / i4;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i6 <= i) {
            float f5 = ((i - i6) * 0.5f) / i;
            f4 = 1.0f - f5;
            f = 0.0f;
            f3 = f5;
            f2 = 1.0f;
        } else {
            f = ((i2 - i5) * 0.5f) / i2;
            f2 = 1.0f - f;
        }
        m10520p2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: i2 */
    private int m10515i2() {
        int i;
        int i2;
        int i3;
        this.f11588Q = 0.0f;
        this.f11589R = 0.0f;
        int i4 = this.f11622y;
        int i5 = this.f11623z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f11617s[i5];
                int[] iArr = this.f11613p;
                if (i6 == 1) {
                    m10514h2(iArr[i5], this.f11615q[i5], getHeight(), getWidth());
                } else {
                    m10514h2(iArr[i5], this.f11615q[i5], getWidth(), getHeight());
                }
                return this.f11602e[this.f11622y];
            }
            if (this.f11579H != 2) {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f11602e[this.f11622y];
            }
            m10513g2(this.f11613p[i4], this.f11615q[i4], (this.f11603f[i4] * 1.0f) / this.f11604g[i4]);
            i = this.f11599b;
            int[] iArr2 = this.f11602e;
            int i7 = this.f11622y;
            i2 = iArr2[i7];
            i3 = this.f11604g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f11616r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f11615q[i4];
                int i10 = this.f11613p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f11604g[i4] * 1.0f) / this.f11603f[i4];
                if (f2 != f) {
                    m10513g2(i10, i9, f2);
                } else {
                    m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f11613p;
                int i11 = this.f11622y;
                this.f11588Q = 1.0f / iArr3[i11];
                this.f11589R = 1.0f / this.f11615q[i11];
            }
            i = this.f11599b;
            int[] iArr4 = this.f11602e;
            int i12 = this.f11622y;
            i2 = iArr4[i12];
            i3 = this.f11604g[i12];
        } else {
            int i13 = this.f11615q[i4];
            int i14 = this.f11613p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f11603f[i4] * 1.0f) / this.f11604g[i4];
            if (f4 != f3) {
                m10513g2(i14, i13, f4);
            } else {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f11599b;
            int[] iArr5 = this.f11602e;
            int i15 = this.f11622y;
            i2 = iArr5[i15];
            i3 = this.f11604g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: j2 */
    private int m10516j2() {
        int i;
        int i2;
        int i3;
        this.f11588Q = 0.0f;
        this.f11589R = 0.0f;
        int i4 = this.f11622y;
        int i5 = this.f11623z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f11617s[i5];
                int[] iArr = this.f11613p;
                if (i6 == 1) {
                    m10514h2(iArr[i5], this.f11615q[i5], getWidth(), getHeight());
                } else {
                    m10514h2(iArr[i5], this.f11615q[i5], getHeight(), getWidth());
                }
                return this.f11602e[this.f11622y];
            }
            if (this.f11579H != 2 && !this.f11592U) {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f11602e[this.f11622y];
            }
            m10513g2(this.f11613p[i4], this.f11615q[i4], (this.f11604g[i4] * 1.0f) / this.f11603f[i4]);
            i = this.f11599b;
            int[] iArr2 = this.f11602e;
            int i7 = this.f11622y;
            i2 = iArr2[i7];
            i3 = this.f11604g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f11616r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f11615q[i4];
                int i10 = this.f11613p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f11604g[i4] * 1.0f) / this.f11603f[i4];
                if (f2 != f) {
                    m10513g2(i10, i9, f2);
                } else {
                    m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f11613p;
                int i11 = this.f11622y;
                this.f11588Q = 1.0f / iArr3[i11];
                this.f11589R = 1.0f / this.f11615q[i11];
            }
            i = this.f11599b;
            int[] iArr4 = this.f11602e;
            int i12 = this.f11622y;
            i2 = iArr4[i12];
            i3 = this.f11604g[i12];
        } else {
            int i13 = this.f11615q[i4];
            int i14 = this.f11613p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f11604g[i4] * 1.0f) / this.f11603f[i4];
            if (f4 != f3) {
                m10513g2(i14, i13, f4);
            } else {
                m10520p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f11599b;
            int[] iArr5 = this.f11602e;
            int i15 = this.f11622y;
            i2 = iArr5[i15];
            i3 = this.f11604g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: l2 */
    private int m10517l2() {
        int i = this.curRotation;
        if (this.f11579H == 2 && this.f11622y == 0) {
            return i + 3;
        }
        int i2 = this.f11622y;
        int i3 = this.f11623z;
        if (i2 == i3 && i2 == 0) {
            return i;
        }
        if (i3 == 0 || i2 != 0) {
            return (i2 != i3 || i2 == 0) ? i : i + 1;
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: m2 */
    private int m10518m2() {
        int i = this.curRotation;
        int i2 = this.f11578G;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: n2 */
    private void m10519n2(Queue<Runnable> queue) {
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

    /* JADX INFO: renamed from: p2 */
    private void m10520p2(float f, float f2, float f3, float f4) {
        if (!this.f11576F) {
            if (this.f11571B == null || this.f11572C == null || this.f11573D == null || this.f11574E == null || this.f11570A == null) {
                this.f11570A = new FloatBuffer[4];
                this.f11571B = new float[8];
                this.f11572C = new float[8];
                this.f11573D = new float[8];
                this.f11574E = new float[8];
            } else {
                this.f11576F = true;
            }
        }
        if (this.f11576F) {
            float[] fArr = this.f11571B;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f11570A;
            floatBufferArr[0] = og3.m6707a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f11572C;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f11570A;
            floatBufferArr2[1] = og3.m6707a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f11573D;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f11570A;
            floatBufferArr3[2] = og3.m6707a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f11574E;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f11570A;
            floatBufferArr4[3] = og3.m6707a(floatBufferArr4[3], fArr4);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m10521A2(final long j, final boolean z) {
        n8c.c("mergeFilter", "close(S): " + j + ",svn:" + this.f11621x + "," + z);
        if (j > 9 || j <= 0) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.2
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i;
                int i2 = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    i = gLMergeTextureFilter.f11621x;
                    if (i2 >= i) {
                        i2 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f11618t[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1 || i <= 1) {
                    n8c.c("mergeFilter", "close: " + j + ", ind=" + i2 + ",svn:" + GLMergeTextureFilter.this.f11621x);
                    return;
                }
                if (gLMergeTextureFilter.f11623z == i2 && i2 != -1 && i2 != 0) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    int[] iArr = gLMergeTextureFilter2.f11601d;
                    iArr[0] = iArr[i2];
                    int[] iArr2 = gLMergeTextureFilter2.f11602e;
                    iArr2[0] = iArr2[i2];
                    int[] iArr3 = gLMergeTextureFilter2.f11603f;
                    iArr3[0] = iArr3[i2];
                    int[] iArr4 = gLMergeTextureFilter2.f11604g;
                    iArr4[0] = iArr4[i2];
                    int[] iArr5 = gLMergeTextureFilter2.f11605i;
                    iArr5[0] = iArr5[i2];
                    gLMergeTextureFilter2.f11623z = 0;
                }
                if (!z) {
                    n8c.c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f11623z + ", svn=" + GLMergeTextureFilter.this.f11621x + ", ind=" + i2 + ", viewTexture=" + GLMergeTextureFilter.this.f11610m[i2]);
                    return;
                }
                rkw rkwVar = GLMergeTextureFilter.this.f11607k[i2];
                if (rkwVar != null) {
                    rkwVar.destroy();
                    GLMergeTextureFilter.this.f11607k[i2] = null;
                }
                Bitmap bitmap = GLMergeTextureFilter.this.f11609l[i2];
                if (bitmap != null) {
                    bitmap.recycle();
                    GLMergeTextureFilter.this.f11609l[i2] = null;
                }
                SurfaceTexture surfaceTexture = GLMergeTextureFilter.this.f11611n[i2];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLMergeTextureFilter.this.f11611n[i2] = null;
                }
                int i3 = i2;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    int i4 = gLMergeTextureFilter3.f11621x;
                    if (i3 >= i4 - 1) {
                        gLMergeTextureFilter3.f11612o[i4 - 1] = false;
                        gLMergeTextureFilter3.f11601d[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11602e[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11603f[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11604g[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11605i[i4 - 1] = 0;
                        gLMergeTextureFilter3.f11613p[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11615q[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11616r[i4 - 1] = 0;
                        gLMergeTextureFilter3.f11617s[i4 - 1] = 1;
                        gLMergeTextureFilter3.f11618t[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11611n[i4 - 1] = null;
                        gLMergeTextureFilter3.f11610m[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11609l[i4 - 1] = null;
                        gLMergeTextureFilter3.f11606j[i4 - 1] = -1;
                        gLMergeTextureFilter3.f11607k[i4 - 1] = null;
                        gLMergeTextureFilter3.f11619u[i4 - 1] = null;
                        gLMergeTextureFilter3.f11620v[i4 - 1] = 0;
                        gLMergeTextureFilter3.f11621x = i4 - 1;
                        n8c.c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f11623z + ", svn=" + GLMergeTextureFilter.this.f11621x + ", ind=" + i2 + "s0Pos[" + GLMergeTextureFilter.this.f11601d[0] + "," + GLMergeTextureFilter.this.f11602e[0] + "," + GLMergeTextureFilter.this.f11603f[0] + "," + GLMergeTextureFilter.this.f11604g[0] + "]");
                        return;
                    }
                    boolean[] zArr = gLMergeTextureFilter3.f11612o;
                    int i5 = i3 + 1;
                    zArr[i3] = zArr[i5];
                    int[] iArr6 = gLMergeTextureFilter3.f11601d;
                    iArr6[i3] = iArr6[i5];
                    int[] iArr7 = gLMergeTextureFilter3.f11602e;
                    iArr7[i3] = iArr7[i5];
                    int[] iArr8 = gLMergeTextureFilter3.f11603f;
                    iArr8[i3] = iArr8[i5];
                    int[] iArr9 = gLMergeTextureFilter3.f11604g;
                    iArr9[i3] = iArr9[i5];
                    int[] iArr10 = gLMergeTextureFilter3.f11605i;
                    iArr10[i3] = iArr10[i5];
                    int[] iArr11 = gLMergeTextureFilter3.f11613p;
                    iArr11[i3] = iArr11[i5];
                    int[] iArr12 = gLMergeTextureFilter3.f11615q;
                    iArr12[i3] = iArr12[i5];
                    int[] iArr13 = gLMergeTextureFilter3.f11616r;
                    iArr13[i3] = iArr13[i5];
                    int[] iArr14 = gLMergeTextureFilter3.f11617s;
                    iArr14[i3] = iArr14[i5];
                    long[] jArr = gLMergeTextureFilter3.f11618t;
                    jArr[i3] = jArr[i5];
                    SurfaceTexture[] surfaceTextureArr = gLMergeTextureFilter3.f11611n;
                    surfaceTextureArr[i3] = surfaceTextureArr[i5];
                    int[] iArr15 = gLMergeTextureFilter3.f11610m;
                    iArr15[i3] = iArr15[i5];
                    Bitmap[] bitmapArr = gLMergeTextureFilter3.f11609l;
                    bitmapArr[i3] = bitmapArr[i5];
                    int[] iArr16 = gLMergeTextureFilter3.f11606j;
                    iArr16[i3] = iArr16[i5];
                    rkw[] rkwVarArr = gLMergeTextureFilter3.f11607k;
                    rkwVarArr[i3] = rkwVarArr[i5];
                    AidSource.FirstFrameDrawCallback[] firstFrameDrawCallbackArr = gLMergeTextureFilter3.f11619u;
                    firstFrameDrawCallbackArr[i3] = firstFrameDrawCallbackArr[i5];
                    int[] iArr17 = gLMergeTextureFilter3.f11620v;
                    iArr17[i3] = iArr17[i5];
                    if (gLMergeTextureFilter3.f11623z > i2) {
                        GLMergeTextureFilter.m10507Z1(GLMergeTextureFilter.this, 1);
                    }
                    i3 = i5;
                }
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m10522C2(final long j, final SurfaceTexture surfaceTexture, final int i, final Bitmap bitmap) {
        if (i == -1 && bitmap == null) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.4
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i2;
                int i3 = 1;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i3 >= gLMergeTextureFilter2.f11621x) {
                        i3 = -1;
                        break;
                    }
                    if (j == gLMergeTextureFilter2.f11618t[i3]) {
                        int[] iArr = gLMergeTextureFilter2.f11610m;
                        int i4 = iArr[i3];
                        int i5 = i;
                        if (i4 == i5) {
                            SurfaceTexture surfaceTexture2 = gLMergeTextureFilter2.f11611n[i3];
                        }
                        iArr[i3] = i5;
                        gLMergeTextureFilter2.f11611n[i3] = surfaceTexture;
                        gLMergeTextureFilter2.f11609l[i3] = bitmap;
                        gLMergeTextureFilter2.m10512f2(i3);
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 || (i2 = (gLMergeTextureFilter = GLMergeTextureFilter.this).f11621x) >= 9) {
                    return;
                }
                gLMergeTextureFilter.f11609l[i2] = bitmap;
                gLMergeTextureFilter.f11610m[i2] = i;
                gLMergeTextureFilter.f11611n[i2] = surfaceTexture;
                gLMergeTextureFilter.f11618t[i2] = j;
                gLMergeTextureFilter.m10512f2(i2);
                GLMergeTextureFilter.this.f11621x++;
                n8c.c("mergeFilter", "----update: " + j + ", TID=" + i + ",svn=" + GLMergeTextureFilter.this.f11621x + ", fsi=" + GLMergeTextureFilter.this.f11623z + ", ind=" + i3);
            }
        });
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        n8c.c("mergeFilter", "destroy(S)");
        this.f11590S = true;
        super.destroy();
        Queue<Runnable> queue = this.f11575E0;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f11577F0;
        if (queue2 != null) {
            queue2.clear();
        }
        int[] iArr = this.f11591T;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f11591T = null;
        }
        this.f11621x = 1;
        for (int i = 0; i < 9; i++) {
            this.f11619u[i] = null;
            this.f11620v[i] = 0;
            this.f11601d[i] = -1;
            this.f11602e[i] = -1;
            this.f11603f[i] = -1;
            this.f11604g[i] = -1;
            this.f11605i[i] = 0;
            this.f11610m[i] = -1;
            Bitmap bitmap = this.f11609l[i];
            if (bitmap != null) {
                bitmap.recycle();
                this.f11609l[i] = null;
            }
            this.f11606j[i] = -1;
            this.f11613p[i] = -1;
            this.f11615q[i] = -1;
            this.f11616r[i] = 0;
            this.f11612o[i] = false;
            this.f11618t[i] = -1;
            SurfaceTexture surfaceTexture = this.f11611n[i];
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f11611n[i] = null;
            }
            this.f11617s[i] = 1;
            rkw rkwVar = this.f11607k[i];
            if (rkwVar != null) {
                rkwVar.destroy();
                this.f11607k[i] = null;
            }
        }
        n8c.c("mergeFilter", "destroy");
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.c("mergeFilter", "width:" + getWidth() + ", height:" + getHeight());
                return;
            }
            initFBO();
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m7172h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.c("mergeFilter", "width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m7172h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m10523e2(float f, float f2, float f3, float f4, boolean z) {
        n8c.c("mergeFilter", "clear screen," + z);
        this.f11582K = true;
        if (z) {
            this.f11583L = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
            return;
        }
        n8c.c("mergeFilter", "clear screen, " + z + ",mSubWndChanged=" + this.f11583L + "/160");
        this.f11583L = 40;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (imageStep.x != 0.0 && imageStep.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, -imageStep.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, -imageStep.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
    }

    @Override // p003l.mcj
    public int getTextOutID() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            return rbjVar.m7173i()[0];
        }
        return 0;
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float imageClear; \nuniform float widthStep; \nuniform float heightStep; \nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main() {\nclear_image = imageClear; \nimageStep = vec2(widthStep, heightStep); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    @Override // p003l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m7169e();
        }
        rbj rbjVarM9175c = ybj.m9172d().m9175c(getWidth(), getHeight());
        this.glFrameBuffer = rbjVarM9175c;
        rbjVarM9175c.m7166b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f11584M = GLES20.glGetUniformLocation(this.programHandle, "imageClear");
        this.f11586O = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f11587P = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: k2 */
    public AidSource.FirstFrameDrawCallback m10524k2(int i) {
        return this.f11619u[i];
    }

    @Override // p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        int i2;
        m10519n2(this.f11575E0);
        if (z) {
            markAsDirty();
        } else {
            n8c.c("mergeFilter", "newfata=" + z + ", dirty=" + this.dirty);
        }
        if (!this.f11590S) {
            this.f11622y = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f11621x;
                if (i3 >= i4) {
                    break;
                }
                this.f11622y = i3;
                if (this.f11582K || this.f11583L > 0) {
                    this.f11585N = 0.0f;
                    int i5 = this.f11583L;
                    if (i5 > 0) {
                        this.f11583L = i5 - 1;
                    }
                } else {
                    this.f11585N = 1.0f;
                }
                int i6 = this.f11623z;
                if (i6 != 0) {
                    if (i3 == 0) {
                        this.f11622y = i6;
                    } else if (i3 == i6) {
                        this.f11622y = 0;
                    } else {
                        this.f11622y = i3;
                    }
                }
                if (this.f11592U && i4 >= 2) {
                    this.f11593V = false;
                    if (i3 == 0) {
                        for (int i7 = 1; i7 < this.f11621x; i7++) {
                            if (this.f11616r[i7] == 7) {
                                this.f11622y = i7;
                                break;
                            }
                        }
                    } else if (this.f11616r[i3] == 7) {
                        this.f11622y = 0;
                    }
                }
                boolean[] zArr = this.f11612o;
                int i8 = this.f11622y;
                if (zArr[i8]) {
                    int i9 = this.f11610m[i8];
                    if ((i9 == -1 || i9 != i) && i8 == 0) {
                        n8c.c("mergeFilter", "index:" + this.f11622y + ", " + this.f11610m[this.f11622y] + "--->" + i);
                        this.f11610m[this.f11622y] = i;
                    }
                    int[] iArr = this.f11610m;
                    int i10 = this.f11622y;
                    int i11 = iArr[i10];
                    if (((i11 != -1 || this.f11609l[i10] != null) && this.f11613p[i10] > 0 && this.f11615q[i10] > 0) || i10 == 0) {
                        if (i10 != 0) {
                            if (this.f11606j[i10] == -1 || this.f11611n[i10] == null) {
                                m10512f2(i10);
                            }
                            int[] iArr2 = this.f11606j;
                            int i12 = this.f11622y;
                            int i13 = iArr2[i12];
                            if (i13 != -1 && this.f11611n[i12] != null) {
                                this.texture_in = i13;
                            }
                        } else {
                            this.texture_in = i11;
                        }
                        if (i3 == 0) {
                            int height = getHeight();
                            int width = getWidth();
                            if (height != this.f11599b || width != this.f11600c) {
                                this.f11599b = height;
                                this.f11600c = width;
                                setWidth(width);
                                setHeight(this.f11599b);
                            }
                        }
                        int width2 = mcjVar.getWidth();
                        int height2 = mcjVar.getHeight();
                        int[] iArr3 = this.f11613p;
                        int i14 = this.f11622y;
                        int i15 = iArr3[i14];
                        if (i15 == -1 || (i2 = this.f11615q[i14]) == -1) {
                            iArr3[i14] = mcjVar.getWidth();
                            this.f11615q[this.f11622y] = mcjVar.getHeight();
                        } else if ((width2 != i15 || height2 != i2) && i14 == 0) {
                            n8c.c("mergeFilter", "w/h:[" + this.f11613p[this.f11622y] + "," + this.f11615q[this.f11622y] + "]===>[" + width2 + "," + height2 + "], ID=" + this.f11622y);
                            int[] iArr4 = this.f11613p;
                            int i16 = this.f11622y;
                            iArr4[i16] = width2;
                            this.f11615q[i16] = height2;
                        }
                        this.f11598a.m8353c(this.f11600c, this.f11599b);
                        onDrawFrame();
                    }
                }
                i3++;
            }
            for (int i17 = 1; i17 < this.f11621x; i17++) {
                int[] iArr5 = this.f11620v;
                int i18 = iArr5[i17];
                if (i18 == 1) {
                    iArr5[i17] = i18 + 1;
                    if (m10524k2(i17) != null) {
                        n8c.c("mergeFilter", "---- sub view " + i17 + "call callback");
                        m10524k2(i17).mo10697a();
                    } else {
                        n8c.c("mergeFilter", "---- sub view " + i17 + "call callback null");
                    }
                }
            }
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    rbj rbjVar = this.glFrameBuffer;
                    if (rbjVar != null) {
                        jcjVar.newTextureReady(rbjVar.m7173i()[0], this, z);
                    } else {
                        n8c.c("mergeFilter", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mcjVar.unlockRenderBuffer();
        m10519n2(this.f11577F0);
    }

    /* JADX INFO: renamed from: o2 */
    public void m10525o2(Runnable runnable) {
        synchronized (this.f11575E0) {
            this.f11575E0.add(runnable);
        }
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        int iM10518m2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f11584M, this.f11585N);
        GLES20.glUniform1f(this.f11586O, this.f11588Q);
        GLES20.glUniform1f(this.f11587P, this.f11589R);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f11581J;
        if (i == 2) {
            iM10518m2 = m10517l2();
        } else if (i == 1) {
            iM10518m2 = m10518m2();
        }
        int i2 = iM10518m2 % 4;
        this.f11570A[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f11570A[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: q2 */
    public void m10526q2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback, int i) {
        this.f11619u[i] = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: r2 */
    public void m10527r2(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.f11580I = i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m10528s2(int i) {
        this.f11581J = i;
    }

    @Override // p003l.ccj
    public void setRenderSize(int i, int i2) {
        this.f11599b = i2;
        this.f11600c = i;
        this.f11582K = false;
        this.f11578G = -1;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m10529t2(int i) {
        if (this.f11580I == 1) {
            this.f11578G = i;
        } else {
            this.f11578G = -1;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m10530u2(boolean z) {
        if (z == this.f11592U) {
            return;
        }
        n8c.c("mergeFilter", "----setSmallViewScreen(S): smallView=" + z);
        this.f11592U = z;
        this.f11593V = z;
        n8c.c("mergeFilter", "----setSmallViewScreen(E): Clean=" + this.f11593V + ";" + this.f11592U);
    }

    /* JADX INFO: renamed from: v2 */
    public void m10531v2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        if (j > 9 || j <= 0 || firstFrameDrawCallback == null) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.7
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f11621x) {
                        i = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f11618t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    gLMergeTextureFilter.m10526q2(firstFrameDrawCallback, i);
                    GLMergeTextureFilter.this.f11620v[i] = 0;
                }
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public void m10532w2(final long j, final boolean z) {
        n8c.c("mergeFilter", "full screen(S): " + j + ", " + z + "; fsi:" + this.f11623z + ", svn:" + this.f11621x);
        if (j > 9 || j <= 0) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.5
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 0;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f11621x) {
                        i = 0;
                        break;
                    } else if (j == gLMergeTextureFilter.f11618t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == 0) {
                    if (gLMergeTextureFilter.f11623z != 0 && z) {
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter2.m10497B2(gLMergeTextureFilter2.f11623z);
                        GLMergeTextureFilter.this.f11623z = 0;
                    }
                } else if (gLMergeTextureFilter.f11623z == 0) {
                    if (i != 0 && z) {
                        GLMergeTextureFilter.this.m10497B2(i);
                        GLMergeTextureFilter.this.f11623z = i;
                    }
                } else if (GLMergeTextureFilter.this.f11623z != i) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter3.m10497B2(gLMergeTextureFilter3.f11623z);
                    GLMergeTextureFilter.this.f11623z = 0;
                    GLMergeTextureFilter.this.m10497B2(i);
                    GLMergeTextureFilter.this.f11623z = i;
                } else if (!z) {
                    GLMergeTextureFilter.this.m10497B2(i);
                    GLMergeTextureFilter.this.f11623z = 0;
                }
                n8c.c("mergeFilter", "full screen:" + j + ",fsi=" + GLMergeTextureFilter.this.f11623z + ",svn=" + GLMergeTextureFilter.this.f11621x + ", s0Pos[" + GLMergeTextureFilter.this.f11601d[0] + "," + GLMergeTextureFilter.this.f11602e[0] + "," + GLMergeTextureFilter.this.f11603f[0] + "," + GLMergeTextureFilter.this.f11604g[0] + "], ind=" + i);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public void m10533x2(final long j, final boolean z) {
        n8c.c("mergeFilter", "hide(S): " + j + ", " + z + "; fsi:" + this.f11623z + ", svn:" + this.f11621x);
        if (j > 9 || j <= 0) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.6
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f11621x) {
                        break;
                    }
                    if (j == gLMergeTextureFilter.f11618t[i]) {
                        if (z && gLMergeTextureFilter.f11623z == i) {
                            GLMergeTextureFilter.this.m10532w2(j, false);
                        }
                        GLMergeTextureFilter.this.f11612o[i] = !z;
                        break;
                    }
                    i++;
                }
                n8c.c("mergeFilter", "hide: " + j + ", " + z + "; fsi:" + GLMergeTextureFilter.this.f11623z + ",svn" + GLMergeTextureFilter.this.f11621x + ", viewShow[" + i + "]=" + GLMergeTextureFilter.this.f11612o[i] + ", s0Pos[" + GLMergeTextureFilter.this.f11601d[0] + "," + GLMergeTextureFilter.this.f11602e[0] + "," + GLMergeTextureFilter.this.f11603f[0] + "," + GLMergeTextureFilter.this.f11604g[0] + "]");
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public void m10534y2(final long j, final int i, final int i2, final int i3, final int i4, final int i5) {
        n8c.c("mergeFilter", "----pos(S): " + j + ", [" + i + "," + i2 + "," + i3 + "," + i4 + "],fsi=" + this.f11623z + ", svn=" + this.f11621x);
        if (j > 9 || j < 0 || i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
            return;
        }
        m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.3
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i6;
                int[] iArr;
                int i7;
                int i8;
                int i9 = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    i6 = gLMergeTextureFilter.f11621x;
                    if (i9 >= i6) {
                        i9 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f11618t[i9]) {
                        break;
                    } else {
                        i9++;
                    }
                }
                long j2 = j;
                if (j2 == 0) {
                    int i10 = gLMergeTextureFilter.f11623z;
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i10 == 0) {
                        gLMergeTextureFilter2.f11612o[0] = true;
                        gLMergeTextureFilter2.f11601d[0] = i;
                        gLMergeTextureFilter2.f11602e[0] = i2;
                        gLMergeTextureFilter2.f11603f[0] = i3;
                        gLMergeTextureFilter2.f11604g[0] = i4;
                        gLMergeTextureFilter2.f11605i[0] = i5;
                        gLMergeTextureFilter2.f11618t[0] = j;
                    } else {
                        gLMergeTextureFilter2.f11601d[gLMergeTextureFilter2.f11623z] = i;
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter3.f11602e[gLMergeTextureFilter3.f11623z] = i2;
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter4.f11603f[gLMergeTextureFilter4.f11623z] = i3;
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter5.f11604g[gLMergeTextureFilter5.f11623z] = i4;
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter6.f11605i[gLMergeTextureFilter6.f11623z] = i5;
                    }
                } else if (i9 == -1) {
                    if (i6 >= 9) {
                        n8c.c("mergeFilter", "----pos: svn[" + GLMergeTextureFilter.this.f11621x + "] over max=9!!!!");
                        return;
                    }
                    gLMergeTextureFilter.f11601d[i6] = i;
                    gLMergeTextureFilter.f11602e[i6] = i2;
                    gLMergeTextureFilter.f11603f[i6] = i3;
                    gLMergeTextureFilter.f11604g[i6] = i4;
                    gLMergeTextureFilter.f11605i[i6] = i5;
                    gLMergeTextureFilter.f11618t[i6] = j2;
                    gLMergeTextureFilter.f11612o[i6] = true;
                    gLMergeTextureFilter.f11621x = i6 + 1;
                } else if (gLMergeTextureFilter.f11623z == 0 || GLMergeTextureFilter.this.f11623z != i9) {
                    GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                    int i11 = gLMergeTextureFilter7.f11616r[i9];
                    if ((i11 == 3 || i11 == 9) && gLMergeTextureFilter7.f11612o[i9] && (((i7 = (iArr = gLMergeTextureFilter7.f11601d)[i9]) != (i8 = i) || gLMergeTextureFilter7.f11602e[i9] != i2 || gLMergeTextureFilter7.f11603f[i9] != i3 || gLMergeTextureFilter7.f11604g[i9] != i4) && i7 != -1)) {
                        int[] iArr2 = gLMergeTextureFilter7.f11615q;
                        if (iArr2[i9] > 0) {
                            int[] iArr3 = gLMergeTextureFilter7.f11613p;
                            if (iArr3[i9] > 0) {
                                iArr[i9] = i8;
                                gLMergeTextureFilter7.f11602e[i9] = i2;
                                gLMergeTextureFilter7.f11603f[i9] = i3;
                                gLMergeTextureFilter7.f11604g[i9] = i4;
                                rkw rkwVar = gLMergeTextureFilter7.f11607k[i9];
                                if (rkwVar != null) {
                                    rkwVar.setDisplayMode(iArr3[i9], iArr2[i9], 2);
                                    GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter8.f11607k[i9].setRenderSize(gLMergeTextureFilter8.f11603f[i9], gLMergeTextureFilter8.f11604g[i9]);
                                    GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter9.f11607k[i9].loadTexture(gLMergeTextureFilter9.f11610m[i9], gLMergeTextureFilter9.f11611n[i9]);
                                    GLMergeTextureFilter.this.f11607k[i9].drawFrame();
                                    GLES20.glFinish();
                                    GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter10.f11606j[i9] = gLMergeTextureFilter10.f11607k[i9].getTextOutID();
                                }
                            }
                        }
                    }
                    GLMergeTextureFilter gLMergeTextureFilter11 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter11.f11601d[i9] = i;
                    gLMergeTextureFilter11.f11602e[i9] = i2;
                    gLMergeTextureFilter11.f11603f[i9] = i3;
                    gLMergeTextureFilter11.f11604g[i9] = i4;
                    gLMergeTextureFilter11.f11605i[i9] = i5;
                    gLMergeTextureFilter11.f11612o[i9] = true;
                } else {
                    GLMergeTextureFilter gLMergeTextureFilter12 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter12.f11601d[0] = i;
                    gLMergeTextureFilter12.f11602e[0] = i2;
                    gLMergeTextureFilter12.f11603f[0] = i3;
                    gLMergeTextureFilter12.f11604g[0] = i4;
                    gLMergeTextureFilter12.f11605i[0] = i5;
                    gLMergeTextureFilter12.f11612o[i9] = true;
                }
                long j3 = j;
                if (i9 != -1) {
                    n8c.c("mergeFilter", "----pos: " + j3 + ", s" + i9 + "Pos[" + GLMergeTextureFilter.this.f11601d[i9] + "," + GLMergeTextureFilter.this.f11602e[i9] + "," + GLMergeTextureFilter.this.f11603f[i9] + "," + GLMergeTextureFilter.this.f11604g[i9] + "],fsi:" + GLMergeTextureFilter.this.f11623z + ", svn:" + GLMergeTextureFilter.this.f11621x);
                    return;
                }
                StringBuilder sb = new StringBuilder("----pos: ");
                sb.append(j3);
                sb.append(", s");
                sb.append(GLMergeTextureFilter.this.f11621x - 1);
                sb.append("Pos[");
                GLMergeTextureFilter gLMergeTextureFilter13 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter13.f11601d[gLMergeTextureFilter13.f11621x - 1]);
                sb.append(",");
                GLMergeTextureFilter gLMergeTextureFilter14 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter14.f11602e[gLMergeTextureFilter14.f11621x - 1]);
                sb.append(",");
                GLMergeTextureFilter gLMergeTextureFilter15 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter15.f11603f[gLMergeTextureFilter15.f11621x - 1]);
                sb.append(",");
                GLMergeTextureFilter gLMergeTextureFilter16 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter16.f11604g[gLMergeTextureFilter16.f11621x - 1]);
                sb.append("],fsi:");
                sb.append(GLMergeTextureFilter.this.f11623z);
                sb.append(", svn:");
                sb.append(GLMergeTextureFilter.this.f11621x);
                sb.append(", ind=");
                sb.append(i9);
                n8c.c("mergeFilter", sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public void m10535z2(final long j, final int i, final int i2, final int i3, final int i4) {
        n8c.c("mergeFilter", "----size(S): " + j + ", [" + i + "," + i2 + "],changed=" + i3 + " fsi:" + this.f11623z + ", svn:" + this.f11621x + IjkMediaMeta.IJKM_KEY_TYPE + i4);
        if (j > 9 || j <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            m10525o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.8
                @Override // java.lang.Runnable
                public void run() {
                    GLMergeTextureFilter gLMergeTextureFilter;
                    int i5;
                    int i6 = 1;
                    while (true) {
                        gLMergeTextureFilter = GLMergeTextureFilter.this;
                        i5 = gLMergeTextureFilter.f11621x;
                        if (i6 >= i5) {
                            i6 = -1;
                            break;
                        } else if (j == gLMergeTextureFilter.f11618t[i6]) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 == -1) {
                        if (i5 >= 9) {
                            n8c.c("mergeFilter", "----size: svn[" + GLMergeTextureFilter.this.f11621x + "] over max=9!!!!");
                            return;
                        }
                        gLMergeTextureFilter.f11613p[i5] = i;
                        gLMergeTextureFilter.f11615q[i5] = i2;
                        gLMergeTextureFilter.f11616r[i5] = i4;
                        gLMergeTextureFilter.f11618t[i5] = j;
                        gLMergeTextureFilter.f11621x = i5 + 1;
                        StringBuilder sb = new StringBuilder("----size: ");
                        sb.append(j);
                        sb.append(", size[");
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter2.f11613p[gLMergeTextureFilter2.f11621x - 1]);
                        sb.append(",");
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter3.f11615q[gLMergeTextureFilter3.f11621x - 1]);
                        sb.append("], O:");
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter4.f11617s[gLMergeTextureFilter4.f11621x - 1]);
                        sb.append(", s");
                        sb.append(GLMergeTextureFilter.this.f11621x - 1);
                        sb.append("Pos[");
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter5.f11601d[gLMergeTextureFilter5.f11621x - 1]);
                        sb.append(",");
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter6.f11602e[gLMergeTextureFilter6.f11621x - 1]);
                        sb.append(",");
                        GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter7.f11603f[gLMergeTextureFilter7.f11621x - 1]);
                        sb.append(",");
                        GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter8.f11604g[gLMergeTextureFilter8.f11621x - 1]);
                        sb.append("],fsi:");
                        sb.append(GLMergeTextureFilter.this.f11623z);
                        sb.append(", svn:");
                        sb.append(GLMergeTextureFilter.this.f11621x);
                        sb.append(", ind=");
                        sb.append(i6);
                        sb.append(IjkMediaMeta.IJKM_KEY_TYPE);
                        GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter9.f11616r[gLMergeTextureFilter9.f11621x - 1]);
                        n8c.c("mergeFilter", sb.toString());
                        return;
                    }
                    if (gLMergeTextureFilter.f11613p[i6] != i || gLMergeTextureFilter.f11615q[i6] != i2) {
                        n8c.c("mergeFilter", "----size[changed]: ID[" + j + "], size[" + GLMergeTextureFilter.this.f11613p[i6] + "," + GLMergeTextureFilter.this.f11615q[i6] + "]--->[" + i + "," + i2 + "], fsi:" + GLMergeTextureFilter.this.f11623z + ", svn:" + GLMergeTextureFilter.this.f11621x + ",ind=" + i6);
                        GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter10.f11613p[i6] = i;
                        gLMergeTextureFilter10.f11615q[i6] = i2;
                        int[] iArr = gLMergeTextureFilter10.f11616r;
                        int i7 = i4;
                        iArr[i6] = i7;
                        if (i7 == 2 || i7 == 3 || i7 == 8 || i7 == 9 || i3 != 1) {
                            gLMergeTextureFilter10.f11583L = 0;
                        } else {
                            gLMergeTextureFilter10.f11583L = 40;
                        }
                    }
                    n8c.c("mergeFilter", "----size: " + j + ", len=" + GLMergeTextureFilter.this.f11583L + ", size[" + GLMergeTextureFilter.this.f11613p[i6] + "," + GLMergeTextureFilter.this.f11615q[i6] + "], O:" + GLMergeTextureFilter.this.f11617s[i6] + ", s" + i6 + "Pos[" + GLMergeTextureFilter.this.f11601d[i6] + "," + GLMergeTextureFilter.this.f11602e[i6] + "," + GLMergeTextureFilter.this.f11603f[i6] + "," + GLMergeTextureFilter.this.f11604g[i6] + "],fsi:" + GLMergeTextureFilter.this.f11623z + ", svn:" + GLMergeTextureFilter.this.f11621x + ", ind=" + i6 + ", type=" + GLMergeTextureFilter.this.f11616r[i6]);
                }
            });
            return;
        }
        for (int i5 = 1; i5 < this.f11621x; i5++) {
            if (j == this.f11618t[i5] && !this.f11612o[i5]) {
                this.f11613p[i5] = -1;
                this.f11615q[i5] = -1;
                this.f11616r[i5] = 0;
            }
        }
    }
}
