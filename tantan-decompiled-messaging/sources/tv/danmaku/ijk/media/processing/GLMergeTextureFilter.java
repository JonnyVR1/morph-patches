package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Queue;
import p149l.jcj;
import p149l.mcj;
import p149l.n8c;
import p149l.og3;
import p149l.rbj;
import p149l.rkw;
import p149l.vbj;
import p149l.ybj;
import p149l.ysf;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMergeTextureFilter extends mcj implements jcj {

    /* JADX INFO: renamed from: A */
    private FloatBuffer[] f207945A;

    /* JADX INFO: renamed from: B */
    private float[] f207946B;

    /* JADX INFO: renamed from: C */
    private float[] f207947C;

    /* JADX INFO: renamed from: D */
    private float[] f207948D;

    /* JADX INFO: renamed from: E */
    private float[] f207949E;

    /* JADX INFO: renamed from: E0 */
    private final Queue<Runnable> f207950E0;

    /* JADX INFO: renamed from: F */
    private boolean f207951F;

    /* JADX INFO: renamed from: F0 */
    private final Queue<Runnable> f207952F0;

    /* JADX INFO: renamed from: G */
    private int f207953G;

    /* JADX INFO: renamed from: H */
    private int f207954H;

    /* JADX INFO: renamed from: I */
    private int f207955I;

    /* JADX INFO: renamed from: J */
    private int f207956J;

    /* JADX INFO: renamed from: K */
    private boolean f207957K;

    /* JADX INFO: renamed from: L */
    private int f207958L;

    /* JADX INFO: renamed from: M */
    private int f207959M;

    /* JADX INFO: renamed from: N */
    private float f207960N;

    /* JADX INFO: renamed from: O */
    private int f207961O;

    /* JADX INFO: renamed from: P */
    private int f207962P;

    /* JADX INFO: renamed from: Q */
    private float f207963Q;

    /* JADX INFO: renamed from: R */
    private float f207964R;

    /* JADX INFO: renamed from: S */
    private boolean f207965S;

    /* JADX INFO: renamed from: T */
    private int[] f207966T;

    /* JADX INFO: renamed from: U */
    private boolean f207967U;

    /* JADX INFO: renamed from: V */
    private boolean f207968V;

    /* JADX INFO: renamed from: W */
    private int f207969W;

    /* JADX INFO: renamed from: X */
    private int f207970X;

    /* JADX INFO: renamed from: Y */
    protected rkw f207971Y;

    /* JADX INFO: renamed from: Z */
    private int f207972Z;

    /* JADX INFO: renamed from: a */
    private vbj f207973a;

    /* JADX INFO: renamed from: b */
    private int f207974b;

    /* JADX INFO: renamed from: c */
    private int f207975c;

    /* JADX INFO: renamed from: d */
    protected int[] f207976d;

    /* JADX INFO: renamed from: e */
    protected int[] f207977e;

    /* JADX INFO: renamed from: f */
    protected int[] f207978f;

    /* JADX INFO: renamed from: g */
    protected int[] f207979g;

    /* JADX INFO: renamed from: i */
    protected int[] f207980i;

    /* JADX INFO: renamed from: j */
    protected int[] f207981j;

    /* JADX INFO: renamed from: k */
    protected rkw[] f207982k;

    /* JADX INFO: renamed from: k0 */
    private SurfaceTexture f207983k0;

    /* JADX INFO: renamed from: l */
    protected Bitmap[] f207984l;

    /* JADX INFO: renamed from: m */
    protected int[] f207985m;

    /* JADX INFO: renamed from: n */
    protected SurfaceTexture[] f207986n;

    /* JADX INFO: renamed from: o */
    protected boolean[] f207987o;

    /* JADX INFO: renamed from: p */
    protected int[] f207988p;

    /* JADX INFO: renamed from: p0 */
    private int f207989p0;

    /* JADX INFO: renamed from: q */
    protected int[] f207990q;

    /* JADX INFO: renamed from: r */
    protected int[] f207991r;

    /* JADX INFO: renamed from: s */
    protected int[] f207992s;

    /* JADX INFO: renamed from: t */
    protected long[] f207993t;

    /* JADX INFO: renamed from: u */
    protected AidSource.FirstFrameDrawCallback[] f207994u;

    /* JADX INFO: renamed from: v */
    protected int[] f207995v;

    /* JADX INFO: renamed from: x */
    protected int f207996x;

    /* JADX INFO: renamed from: y */
    protected int f207997y;

    /* JADX INFO: renamed from: z */
    private int f207998z;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilter$1 */
    class RunnableC224591 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f207999a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ GLMergeTextureFilter f208000b;

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f207999a;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            GLMergeTextureFilter gLMergeTextureFilter = this.f208000b;
            if (gLMergeTextureFilter.f207971Y == null) {
                gLMergeTextureFilter.f207971Y = new rkw();
                if (this.f208000b.f207971Y != null) {
                    int height = this.f207999a.getHeight();
                    int width = this.f207999a.getWidth();
                    this.f208000b.f207971Y.setOESMode(false);
                    this.f208000b.f207971Y.initWithGLContext();
                    this.f208000b.f207971Y.loadTexture(this.f207999a);
                    GLMergeTextureFilter gLMergeTextureFilter2 = this.f208000b;
                    gLMergeTextureFilter2.f207972Z = gLMergeTextureFilter2.f207971Y.getBitmapTextureID();
                    GLMergeTextureFilter gLMergeTextureFilter3 = this.f208000b;
                    gLMergeTextureFilter3.f207983k0 = gLMergeTextureFilter3.f207971Y.getBitmapSurfaceTexture();
                    if (this.f208000b.f207983k0 != null && this.f208000b.f207972Z >= 0) {
                        this.f208000b.f207969W = height;
                        this.f208000b.f207970X = width;
                    }
                }
            }
            if (this.f208000b.f207971Y != null) {
                int height2 = this.f207999a.getHeight();
                int width2 = this.f207999a.getWidth();
                this.f208000b.f207971Y.loadTexture(this.f207999a);
                GLMergeTextureFilter gLMergeTextureFilter4 = this.f208000b;
                gLMergeTextureFilter4.f207972Z = gLMergeTextureFilter4.f207971Y.getBitmapTextureID();
                GLMergeTextureFilter gLMergeTextureFilter5 = this.f208000b;
                gLMergeTextureFilter5.f207983k0 = gLMergeTextureFilter5.f207971Y.getBitmapSurfaceTexture();
                if (this.f208000b.f207983k0 != null && this.f208000b.f207972Z >= 0) {
                    this.f208000b.f207969W = height2;
                    this.f208000b.f207970X = width2;
                }
                this.f208000b.f207971Y.drawFrame();
                GLES20.glFlush();
                GLMergeTextureFilter gLMergeTextureFilter6 = this.f208000b;
                gLMergeTextureFilter6.f207989p0 = gLMergeTextureFilter6.f207971Y.getTextOutID();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public void m222026B2(int i) {
        n8c.m158485c("mergeFilter", "swap(S): s0Pos[" + this.f207976d[0] + Constants.SEPARATOR_COMMA + this.f207977e[0] + Constants.SEPARATOR_COMMA + this.f207978f[0] + Constants.SEPARATOR_COMMA + this.f207979g[0] + "]--->s" + i + "Pos[" + this.f207976d[i] + Constants.SEPARATOR_COMMA + this.f207977e[i] + Constants.SEPARATOR_COMMA + this.f207978f[i] + Constants.SEPARATOR_COMMA + this.f207979g[i] + "], fsi:" + this.f207998z + ", svn:" + this.f207996x);
        int[] iArr = this.f207976d;
        int i2 = iArr[0];
        int[] iArr2 = this.f207977e;
        int i3 = iArr2[0];
        int[] iArr3 = this.f207978f;
        int i4 = iArr3[0];
        int[] iArr4 = this.f207979g;
        int i5 = iArr4[0];
        int[] iArr5 = this.f207980i;
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
    public static /* synthetic */ int m222036Z1(GLMergeTextureFilter gLMergeTextureFilter, int i) {
        int i2 = gLMergeTextureFilter.f207998z - i;
        gLMergeTextureFilter.f207998z = i2;
        return i2;
    }

    private void drawIndeed() {
        int iM222045j2;
        if (this.texture_in == 0 && this.f207997y == 0) {
            n8c.m158485c("mergeFilter", "draw: " + this.texture_in + ", " + this.f207997y + "), FID:" + this.f207998z);
            return;
        }
        if (this.f207997y >= this.f207996x) {
            n8c.m158485c("mergeFilter", "currence ID[" + this.f207997y + "]>" + this.f207996x);
            return;
        }
        int i = this.f207956J;
        if (i == 2) {
            iM222045j2 = m222044i2();
        } else {
            iM222045j2 = i == 1 ? m222045j2() : 0;
        }
        int[] iArr = this.f207976d;
        int i2 = this.f207997y;
        GLES20.glViewport(iArr[i2], iM222045j2, this.f207978f[i2], this.f207979g[i2]);
        GLES20.glUseProgram(this.programHandle);
        int i3 = this.f207998z;
        int i4 = this.f207997y;
        if (i3 == i4) {
            if (this.f207954H == 2 || this.f207968V) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
                this.f207968V = false;
                n8c.m158485c("mergeFilter", "----drawIndeed: Clean=" + this.f207968V + com.meituan.robust.Constants.PACKNAME_END + this.f207967U);
            } else if (this.f207996x == 1 && (this.f207976d[i4] != 0 || this.f207977e[i4] != 0 || this.f207978f[i4] < this.f207988p[i4] || this.f207979g[i4] < this.f207990q[i4])) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
            }
        }
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        int[] iArr2 = this.f207995v;
        int i5 = this.f207997y;
        if (iArr2[i5] == 0) {
            iArr2[i5] = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public void m222041f2(int i) {
        int i2;
        if (this.f207976d[i] == -1 || this.f207977e[i] == -1 || this.f207978f[i] == -1 || this.f207979g[i] == -1) {
            this.f207981j[i] = -1;
            return;
        }
        rkw[] rkwVarArr = this.f207982k;
        rkw rkwVar = rkwVarArr[i];
        if (rkwVar != null) {
            if (this.f207990q[i] == -1 || this.f207988p[i] == -1) {
                this.f207981j[i] = -1;
                return;
            }
            if (this.f207991r[i] == 7) {
                rkwVar.loadTexture(this.f207984l[i]);
                this.f207985m[i] = this.f207982k[i].getBitmapTextureID();
                this.f207986n[i] = this.f207982k[i].getBitmapSurfaceTexture();
            } else {
                rkwVar.loadTexture(this.f207985m[i], this.f207986n[i]);
            }
            int i3 = this.f207991r[i];
            if (i3 == 2 || i3 == 3 || i3 == 9) {
                this.f207982k[i].setDisplayMode(this.f207988p[i], this.f207990q[i], 2);
                this.f207982k[i].setRenderSize(this.f207978f[i], this.f207979g[i]);
            } else {
                this.f207982k[i].setRenderSize(this.f207988p[i], this.f207990q[i]);
            }
            this.f207982k[i].drawFrame();
            GLES20.glFlush();
            this.f207981j[i] = this.f207982k[i].getTextOutID();
            return;
        }
        rkwVarArr[i] = new rkw();
        if (this.f207991r[i] == 7) {
            this.f207982k[i].setOESMode(false);
        }
        this.f207982k[i].initWithGLContext();
        int i4 = this.f207990q[i];
        if (i4 == -1 || (i2 = this.f207988p[i]) == -1) {
            this.f207981j[i] = -1;
            return;
        }
        int i5 = this.f207991r[i];
        if (i5 == 2 || i5 == 3 || i5 == 9) {
            this.f207982k[i].setDisplayMode(i2, i4, 2);
            this.f207982k[i].setRenderSize(this.f207978f[i], this.f207979g[i]);
        } else {
            this.f207982k[i].setRenderSize(i2, i4);
        }
        int i6 = this.f207991r[i];
        rkw[] rkwVarArr2 = this.f207982k;
        if (i6 == 7) {
            rkwVarArr2[i].loadTexture(this.f207984l[i]);
            this.f207985m[i] = this.f207982k[i].getBitmapTextureID();
            this.f207986n[i] = this.f207982k[i].getBitmapSurfaceTexture();
        } else {
            rkwVarArr2[i].loadTexture(this.f207985m[i], this.f207986n[i]);
        }
        this.f207982k[i].drawFrame();
        GLES20.glFlush();
        this.f207981j[i] = this.f207982k[i].getTextOutID();
    }

    /* JADX INFO: renamed from: g2 */
    private void m222042g2(int i, int i2, float f) {
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
        m222049p2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: h2 */
    private void m222043h2(int i, int i2, int i3, int i4) {
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
        m222049p2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: i2 */
    private int m222044i2() {
        int i;
        int i2;
        int i3;
        this.f207963Q = 0.0f;
        this.f207964R = 0.0f;
        int i4 = this.f207997y;
        int i5 = this.f207998z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f207992s[i5];
                int[] iArr = this.f207988p;
                if (i6 == 1) {
                    m222043h2(iArr[i5], this.f207990q[i5], getHeight(), getWidth());
                } else {
                    m222043h2(iArr[i5], this.f207990q[i5], getWidth(), getHeight());
                }
                return this.f207977e[this.f207997y];
            }
            if (this.f207954H != 2) {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f207977e[this.f207997y];
            }
            m222042g2(this.f207988p[i4], this.f207990q[i4], (this.f207978f[i4] * 1.0f) / this.f207979g[i4]);
            i = this.f207974b;
            int[] iArr2 = this.f207977e;
            int i7 = this.f207997y;
            i2 = iArr2[i7];
            i3 = this.f207979g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f207991r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f207990q[i4];
                int i10 = this.f207988p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f207979g[i4] * 1.0f) / this.f207978f[i4];
                if (f2 != f) {
                    m222042g2(i10, i9, f2);
                } else {
                    m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f207988p;
                int i11 = this.f207997y;
                this.f207963Q = 1.0f / iArr3[i11];
                this.f207964R = 1.0f / this.f207990q[i11];
            }
            i = this.f207974b;
            int[] iArr4 = this.f207977e;
            int i12 = this.f207997y;
            i2 = iArr4[i12];
            i3 = this.f207979g[i12];
        } else {
            int i13 = this.f207990q[i4];
            int i14 = this.f207988p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f207978f[i4] * 1.0f) / this.f207979g[i4];
            if (f4 != f3) {
                m222042g2(i14, i13, f4);
            } else {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f207974b;
            int[] iArr5 = this.f207977e;
            int i15 = this.f207997y;
            i2 = iArr5[i15];
            i3 = this.f207979g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: j2 */
    private int m222045j2() {
        int i;
        int i2;
        int i3;
        this.f207963Q = 0.0f;
        this.f207964R = 0.0f;
        int i4 = this.f207997y;
        int i5 = this.f207998z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f207992s[i5];
                int[] iArr = this.f207988p;
                if (i6 == 1) {
                    m222043h2(iArr[i5], this.f207990q[i5], getWidth(), getHeight());
                } else {
                    m222043h2(iArr[i5], this.f207990q[i5], getHeight(), getWidth());
                }
                return this.f207977e[this.f207997y];
            }
            if (this.f207954H != 2 && !this.f207967U) {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f207977e[this.f207997y];
            }
            m222042g2(this.f207988p[i4], this.f207990q[i4], (this.f207979g[i4] * 1.0f) / this.f207978f[i4]);
            i = this.f207974b;
            int[] iArr2 = this.f207977e;
            int i7 = this.f207997y;
            i2 = iArr2[i7];
            i3 = this.f207979g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f207991r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f207990q[i4];
                int i10 = this.f207988p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f207979g[i4] * 1.0f) / this.f207978f[i4];
                if (f2 != f) {
                    m222042g2(i10, i9, f2);
                } else {
                    m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f207988p;
                int i11 = this.f207997y;
                this.f207963Q = 1.0f / iArr3[i11];
                this.f207964R = 1.0f / this.f207990q[i11];
            }
            i = this.f207974b;
            int[] iArr4 = this.f207977e;
            int i12 = this.f207997y;
            i2 = iArr4[i12];
            i3 = this.f207979g[i12];
        } else {
            int i13 = this.f207990q[i4];
            int i14 = this.f207988p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f207979g[i4] * 1.0f) / this.f207978f[i4];
            if (f4 != f3) {
                m222042g2(i14, i13, f4);
            } else {
                m222049p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f207974b;
            int[] iArr5 = this.f207977e;
            int i15 = this.f207997y;
            i2 = iArr5[i15];
            i3 = this.f207979g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: l2 */
    private int m222046l2() {
        int i = this.curRotation;
        if (this.f207954H == 2 && this.f207997y == 0) {
            return i + 3;
        }
        int i2 = this.f207997y;
        int i3 = this.f207998z;
        if (i2 == i3 && i2 == 0) {
            return i;
        }
        if (i3 == 0 || i2 != 0) {
            return (i2 != i3 || i2 == 0) ? i : i + 1;
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: m2 */
    private int m222047m2() {
        int i = this.curRotation;
        int i2 = this.f207953G;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: n2 */
    private void m222048n2(Queue<Runnable> queue) {
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
    private void m222049p2(float f, float f2, float f3, float f4) {
        if (!this.f207951F) {
            if (this.f207946B == null || this.f207947C == null || this.f207948D == null || this.f207949E == null || this.f207945A == null) {
                this.f207945A = new FloatBuffer[4];
                this.f207946B = new float[8];
                this.f207947C = new float[8];
                this.f207948D = new float[8];
                this.f207949E = new float[8];
            } else {
                this.f207951F = true;
            }
        }
        if (this.f207951F) {
            float[] fArr = this.f207946B;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f207945A;
            floatBufferArr[0] = og3.m164159a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f207947C;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f207945A;
            floatBufferArr2[1] = og3.m164159a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f207948D;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f207945A;
            floatBufferArr3[2] = og3.m164159a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f207949E;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f207945A;
            floatBufferArr4[3] = og3.m164159a(floatBufferArr4[3], fArr4);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m222050A2(final long j, final boolean z) {
        n8c.m158485c("mergeFilter", "close(S): " + j + ",svn:" + this.f207996x + Constants.SEPARATOR_COMMA + z);
        if (j > 9 || j <= 0) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.2
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i;
                int i2 = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    i = gLMergeTextureFilter.f207996x;
                    if (i2 >= i) {
                        i2 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f207993t[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1 || i <= 1) {
                    n8c.m158485c("mergeFilter", "close: " + j + ", ind=" + i2 + ",svn:" + GLMergeTextureFilter.this.f207996x);
                    return;
                }
                if (gLMergeTextureFilter.f207998z == i2 && i2 != -1 && i2 != 0) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    int[] iArr = gLMergeTextureFilter2.f207976d;
                    iArr[0] = iArr[i2];
                    int[] iArr2 = gLMergeTextureFilter2.f207977e;
                    iArr2[0] = iArr2[i2];
                    int[] iArr3 = gLMergeTextureFilter2.f207978f;
                    iArr3[0] = iArr3[i2];
                    int[] iArr4 = gLMergeTextureFilter2.f207979g;
                    iArr4[0] = iArr4[i2];
                    int[] iArr5 = gLMergeTextureFilter2.f207980i;
                    iArr5[0] = iArr5[i2];
                    gLMergeTextureFilter2.f207998z = 0;
                }
                if (!z) {
                    n8c.m158485c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f207998z + ", svn=" + GLMergeTextureFilter.this.f207996x + ", ind=" + i2 + ", viewTexture=" + GLMergeTextureFilter.this.f207985m[i2]);
                    return;
                }
                rkw rkwVar = GLMergeTextureFilter.this.f207982k[i2];
                if (rkwVar != null) {
                    rkwVar.destroy();
                    GLMergeTextureFilter.this.f207982k[i2] = null;
                }
                Bitmap bitmap = GLMergeTextureFilter.this.f207984l[i2];
                if (bitmap != null) {
                    bitmap.recycle();
                    GLMergeTextureFilter.this.f207984l[i2] = null;
                }
                SurfaceTexture surfaceTexture = GLMergeTextureFilter.this.f207986n[i2];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLMergeTextureFilter.this.f207986n[i2] = null;
                }
                int i3 = i2;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    int i4 = gLMergeTextureFilter3.f207996x;
                    if (i3 >= i4 - 1) {
                        gLMergeTextureFilter3.f207987o[i4 - 1] = false;
                        gLMergeTextureFilter3.f207976d[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207977e[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207978f[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207979g[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207980i[i4 - 1] = 0;
                        gLMergeTextureFilter3.f207988p[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207990q[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207991r[i4 - 1] = 0;
                        gLMergeTextureFilter3.f207992s[i4 - 1] = 1;
                        gLMergeTextureFilter3.f207993t[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207986n[i4 - 1] = null;
                        gLMergeTextureFilter3.f207985m[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207984l[i4 - 1] = null;
                        gLMergeTextureFilter3.f207981j[i4 - 1] = -1;
                        gLMergeTextureFilter3.f207982k[i4 - 1] = null;
                        gLMergeTextureFilter3.f207994u[i4 - 1] = null;
                        gLMergeTextureFilter3.f207995v[i4 - 1] = 0;
                        gLMergeTextureFilter3.f207996x = i4 - 1;
                        n8c.m158485c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f207998z + ", svn=" + GLMergeTextureFilter.this.f207996x + ", ind=" + i2 + "s0Pos[" + GLMergeTextureFilter.this.f207976d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207977e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207978f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207979g[0] + Constants.AES_SUFFIX);
                        return;
                    }
                    boolean[] zArr = gLMergeTextureFilter3.f207987o;
                    int i5 = i3 + 1;
                    zArr[i3] = zArr[i5];
                    int[] iArr6 = gLMergeTextureFilter3.f207976d;
                    iArr6[i3] = iArr6[i5];
                    int[] iArr7 = gLMergeTextureFilter3.f207977e;
                    iArr7[i3] = iArr7[i5];
                    int[] iArr8 = gLMergeTextureFilter3.f207978f;
                    iArr8[i3] = iArr8[i5];
                    int[] iArr9 = gLMergeTextureFilter3.f207979g;
                    iArr9[i3] = iArr9[i5];
                    int[] iArr10 = gLMergeTextureFilter3.f207980i;
                    iArr10[i3] = iArr10[i5];
                    int[] iArr11 = gLMergeTextureFilter3.f207988p;
                    iArr11[i3] = iArr11[i5];
                    int[] iArr12 = gLMergeTextureFilter3.f207990q;
                    iArr12[i3] = iArr12[i5];
                    int[] iArr13 = gLMergeTextureFilter3.f207991r;
                    iArr13[i3] = iArr13[i5];
                    int[] iArr14 = gLMergeTextureFilter3.f207992s;
                    iArr14[i3] = iArr14[i5];
                    long[] jArr = gLMergeTextureFilter3.f207993t;
                    jArr[i3] = jArr[i5];
                    SurfaceTexture[] surfaceTextureArr = gLMergeTextureFilter3.f207986n;
                    surfaceTextureArr[i3] = surfaceTextureArr[i5];
                    int[] iArr15 = gLMergeTextureFilter3.f207985m;
                    iArr15[i3] = iArr15[i5];
                    Bitmap[] bitmapArr = gLMergeTextureFilter3.f207984l;
                    bitmapArr[i3] = bitmapArr[i5];
                    int[] iArr16 = gLMergeTextureFilter3.f207981j;
                    iArr16[i3] = iArr16[i5];
                    rkw[] rkwVarArr = gLMergeTextureFilter3.f207982k;
                    rkwVarArr[i3] = rkwVarArr[i5];
                    AidSource.FirstFrameDrawCallback[] firstFrameDrawCallbackArr = gLMergeTextureFilter3.f207994u;
                    firstFrameDrawCallbackArr[i3] = firstFrameDrawCallbackArr[i5];
                    int[] iArr17 = gLMergeTextureFilter3.f207995v;
                    iArr17[i3] = iArr17[i5];
                    if (gLMergeTextureFilter3.f207998z > i2) {
                        GLMergeTextureFilter.m222036Z1(GLMergeTextureFilter.this, 1);
                    }
                    i3 = i5;
                }
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m222051C2(final long j, final SurfaceTexture surfaceTexture, final int i, final Bitmap bitmap) {
        if (i == -1 && bitmap == null) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.4
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i2;
                int i3 = 1;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i3 >= gLMergeTextureFilter2.f207996x) {
                        i3 = -1;
                        break;
                    }
                    if (j == gLMergeTextureFilter2.f207993t[i3]) {
                        int[] iArr = gLMergeTextureFilter2.f207985m;
                        int i4 = iArr[i3];
                        int i5 = i;
                        if (i4 == i5) {
                            SurfaceTexture surfaceTexture2 = gLMergeTextureFilter2.f207986n[i3];
                        }
                        iArr[i3] = i5;
                        gLMergeTextureFilter2.f207986n[i3] = surfaceTexture;
                        gLMergeTextureFilter2.f207984l[i3] = bitmap;
                        gLMergeTextureFilter2.m222041f2(i3);
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 || (i2 = (gLMergeTextureFilter = GLMergeTextureFilter.this).f207996x) >= 9) {
                    return;
                }
                gLMergeTextureFilter.f207984l[i2] = bitmap;
                gLMergeTextureFilter.f207985m[i2] = i;
                gLMergeTextureFilter.f207986n[i2] = surfaceTexture;
                gLMergeTextureFilter.f207993t[i2] = j;
                gLMergeTextureFilter.m222041f2(i2);
                GLMergeTextureFilter.this.f207996x++;
                n8c.m158485c("mergeFilter", "----update: " + j + ", TID=" + i + ",svn=" + GLMergeTextureFilter.this.f207996x + ", fsi=" + GLMergeTextureFilter.this.f207998z + ", ind=" + i3);
            }
        });
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        n8c.m158485c("mergeFilter", "destroy(S)");
        this.f207965S = true;
        super.destroy();
        Queue<Runnable> queue = this.f207950E0;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f207952F0;
        if (queue2 != null) {
            queue2.clear();
        }
        int[] iArr = this.f207966T;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f207966T = null;
        }
        this.f207996x = 1;
        for (int i = 0; i < 9; i++) {
            this.f207994u[i] = null;
            this.f207995v[i] = 0;
            this.f207976d[i] = -1;
            this.f207977e[i] = -1;
            this.f207978f[i] = -1;
            this.f207979g[i] = -1;
            this.f207980i[i] = 0;
            this.f207985m[i] = -1;
            Bitmap bitmap = this.f207984l[i];
            if (bitmap != null) {
                bitmap.recycle();
                this.f207984l[i] = null;
            }
            this.f207981j[i] = -1;
            this.f207988p[i] = -1;
            this.f207990q[i] = -1;
            this.f207991r[i] = 0;
            this.f207987o[i] = false;
            this.f207993t[i] = -1;
            SurfaceTexture surfaceTexture = this.f207986n[i];
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f207986n[i] = null;
            }
            this.f207992s[i] = 1;
            rkw rkwVar = this.f207982k[i];
            if (rkwVar != null) {
                rkwVar.destroy();
                this.f207982k[i] = null;
            }
        }
        n8c.m158485c("mergeFilter", "destroy");
    }

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.m158485c("mergeFilter", "width:" + getWidth() + ", height:" + getHeight());
                return;
            }
            initFBO();
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m178609h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.m158485c("mergeFilter", "width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m178609h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m222052e2(float f, float f2, float f3, float f4, boolean z) {
        n8c.m158485c("mergeFilter", "clear screen," + z);
        this.f207957K = true;
        if (z) {
            this.f207958L = 160;
            return;
        }
        n8c.m158485c("mergeFilter", "clear screen, " + z + ",mSubWndChanged=" + this.f207958L + "/160");
        this.f207958L = 40;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (imageStep.x != 0.0 && imageStep.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, -imageStep.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, -imageStep.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
    }

    @Override // p149l.mcj
    public int getTextOutID() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            return rbjVar.m178610i()[0];
        }
        return 0;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float imageClear; \nuniform float widthStep; \nuniform float heightStep; \nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main() {\nclear_image = imageClear; \nimageStep = vec2(widthStep, heightStep); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVarM213956c = ybj.m213953d().m213956c(getWidth(), getHeight());
        this.glFrameBuffer = rbjVarM213956c;
        rbjVarM213956c.m178603b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f207959M = GLES20.glGetUniformLocation(this.programHandle, "imageClear");
        this.f207961O = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f207962P = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: k2 */
    public AidSource.FirstFrameDrawCallback m222053k2(int i) {
        return this.f207994u[i];
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        int i2;
        m222048n2(this.f207950E0);
        if (z) {
            markAsDirty();
        } else {
            n8c.m158485c("mergeFilter", "newfata=" + z + ", dirty=" + this.dirty);
        }
        if (!this.f207965S) {
            this.f207997y = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f207996x;
                if (i3 >= i4) {
                    break;
                }
                this.f207997y = i3;
                if (this.f207957K || this.f207958L > 0) {
                    this.f207960N = 0.0f;
                    int i5 = this.f207958L;
                    if (i5 > 0) {
                        this.f207958L = i5 - 1;
                    }
                } else {
                    this.f207960N = 1.0f;
                }
                int i6 = this.f207998z;
                if (i6 != 0) {
                    if (i3 == 0) {
                        this.f207997y = i6;
                    } else if (i3 == i6) {
                        this.f207997y = 0;
                    } else {
                        this.f207997y = i3;
                    }
                }
                if (this.f207967U && i4 >= 2) {
                    this.f207968V = false;
                    if (i3 == 0) {
                        for (int i7 = 1; i7 < this.f207996x; i7++) {
                            if (this.f207991r[i7] == 7) {
                                this.f207997y = i7;
                                break;
                            }
                        }
                    } else if (this.f207991r[i3] == 7) {
                        this.f207997y = 0;
                    }
                }
                boolean[] zArr = this.f207987o;
                int i8 = this.f207997y;
                if (zArr[i8]) {
                    int i9 = this.f207985m[i8];
                    if ((i9 == -1 || i9 != i) && i8 == 0) {
                        n8c.m158485c("mergeFilter", "index:" + this.f207997y + ", " + this.f207985m[this.f207997y] + "--->" + i);
                        this.f207985m[this.f207997y] = i;
                    }
                    int[] iArr = this.f207985m;
                    int i10 = this.f207997y;
                    int i11 = iArr[i10];
                    if (((i11 != -1 || this.f207984l[i10] != null) && this.f207988p[i10] > 0 && this.f207990q[i10] > 0) || i10 == 0) {
                        if (i10 != 0) {
                            if (this.f207981j[i10] == -1 || this.f207986n[i10] == null) {
                                m222041f2(i10);
                            }
                            int[] iArr2 = this.f207981j;
                            int i12 = this.f207997y;
                            int i13 = iArr2[i12];
                            if (i13 != -1 && this.f207986n[i12] != null) {
                                this.texture_in = i13;
                            }
                        } else {
                            this.texture_in = i11;
                        }
                        if (i3 == 0) {
                            int height = getHeight();
                            int width = getWidth();
                            if (height != this.f207974b || width != this.f207975c) {
                                this.f207974b = height;
                                this.f207975c = width;
                                setWidth(width);
                                setHeight(this.f207974b);
                            }
                        }
                        int width2 = mcjVar.getWidth();
                        int height2 = mcjVar.getHeight();
                        int[] iArr3 = this.f207988p;
                        int i14 = this.f207997y;
                        int i15 = iArr3[i14];
                        if (i15 == -1 || (i2 = this.f207990q[i14]) == -1) {
                            iArr3[i14] = mcjVar.getWidth();
                            this.f207990q[this.f207997y] = mcjVar.getHeight();
                        } else if ((width2 != i15 || height2 != i2) && i14 == 0) {
                            n8c.m158485c("mergeFilter", "w/h:[" + this.f207988p[this.f207997y] + Constants.SEPARATOR_COMMA + this.f207990q[this.f207997y] + "]===>[" + width2 + Constants.SEPARATOR_COMMA + height2 + "], ID=" + this.f207997y);
                            int[] iArr4 = this.f207988p;
                            int i16 = this.f207997y;
                            iArr4[i16] = width2;
                            this.f207990q[i16] = height2;
                        }
                        this.f207973a.m197714c(this.f207975c, this.f207974b);
                        onDrawFrame();
                    }
                }
                i3++;
            }
            for (int i17 = 1; i17 < this.f207996x; i17++) {
                int[] iArr5 = this.f207995v;
                int i18 = iArr5[i17];
                if (i18 == 1) {
                    iArr5[i17] = i18 + 1;
                    if (m222053k2(i17) != null) {
                        n8c.m158485c("mergeFilter", "---- sub view " + i17 + "call callback");
                        m222053k2(i17).mo222226a();
                    } else {
                        n8c.m158485c("mergeFilter", "---- sub view " + i17 + "call callback null");
                    }
                }
            }
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    rbj rbjVar = this.glFrameBuffer;
                    if (rbjVar != null) {
                        jcjVar.newTextureReady(rbjVar.m178610i()[0], this, z);
                    } else {
                        n8c.m158485c("mergeFilter", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mcjVar.unlockRenderBuffer();
        m222048n2(this.f207952F0);
    }

    /* JADX INFO: renamed from: o2 */
    public void m222054o2(Runnable runnable) {
        synchronized (this.f207950E0) {
            this.f207950E0.add(runnable);
        }
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        int iM222047m2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f207959M, this.f207960N);
        GLES20.glUniform1f(this.f207961O, this.f207963Q);
        GLES20.glUniform1f(this.f207962P, this.f207964R);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f207956J;
        if (i == 2) {
            iM222047m2 = m222046l2();
        } else if (i == 1) {
            iM222047m2 = m222047m2();
        }
        int i2 = iM222047m2 % 4;
        this.f207945A[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f207945A[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: q2 */
    public void m222055q2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback, int i) {
        this.f207994u[i] = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: r2 */
    public void m222056r2(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.f207955I = i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m222057s2(int i) {
        this.f207956J = i;
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        this.f207974b = i2;
        this.f207975c = i;
        this.f207957K = false;
        this.f207953G = -1;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m222058t2(int i) {
        if (this.f207955I == 1) {
            this.f207953G = i;
        } else {
            this.f207953G = -1;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m222059u2(boolean z) {
        if (z == this.f207967U) {
            return;
        }
        n8c.m158485c("mergeFilter", "----setSmallViewScreen(S): smallView=" + z);
        this.f207967U = z;
        this.f207968V = z;
        n8c.m158485c("mergeFilter", "----setSmallViewScreen(E): Clean=" + this.f207968V + com.meituan.robust.Constants.PACKNAME_END + this.f207967U);
    }

    /* JADX INFO: renamed from: v2 */
    public void m222060v2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        if (j > 9 || j <= 0 || firstFrameDrawCallback == null) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.7
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f207996x) {
                        i = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f207993t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    gLMergeTextureFilter.m222055q2(firstFrameDrawCallback, i);
                    GLMergeTextureFilter.this.f207995v[i] = 0;
                }
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public void m222061w2(final long j, final boolean z) {
        n8c.m158485c("mergeFilter", "full screen(S): " + j + ", " + z + "; fsi:" + this.f207998z + ", svn:" + this.f207996x);
        if (j > 9 || j <= 0) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.5
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 0;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f207996x) {
                        i = 0;
                        break;
                    } else if (j == gLMergeTextureFilter.f207993t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == 0) {
                    if (gLMergeTextureFilter.f207998z != 0 && z) {
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter2.m222026B2(gLMergeTextureFilter2.f207998z);
                        GLMergeTextureFilter.this.f207998z = 0;
                    }
                } else if (gLMergeTextureFilter.f207998z == 0) {
                    if (i != 0 && z) {
                        GLMergeTextureFilter.this.m222026B2(i);
                        GLMergeTextureFilter.this.f207998z = i;
                    }
                } else if (GLMergeTextureFilter.this.f207998z != i) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter3.m222026B2(gLMergeTextureFilter3.f207998z);
                    GLMergeTextureFilter.this.f207998z = 0;
                    GLMergeTextureFilter.this.m222026B2(i);
                    GLMergeTextureFilter.this.f207998z = i;
                } else if (!z) {
                    GLMergeTextureFilter.this.m222026B2(i);
                    GLMergeTextureFilter.this.f207998z = 0;
                }
                n8c.m158485c("mergeFilter", "full screen:" + j + ",fsi=" + GLMergeTextureFilter.this.f207998z + ",svn=" + GLMergeTextureFilter.this.f207996x + ", s0Pos[" + GLMergeTextureFilter.this.f207976d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207977e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207978f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207979g[0] + "], ind=" + i);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public void m222062x2(final long j, final boolean z) {
        n8c.m158485c("mergeFilter", "hide(S): " + j + ", " + z + "; fsi:" + this.f207998z + ", svn:" + this.f207996x);
        if (j > 9 || j <= 0) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.6
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f207996x) {
                        break;
                    }
                    if (j == gLMergeTextureFilter.f207993t[i]) {
                        if (z && gLMergeTextureFilter.f207998z == i) {
                            GLMergeTextureFilter.this.m222061w2(j, false);
                        }
                        GLMergeTextureFilter.this.f207987o[i] = !z;
                        break;
                    }
                    i++;
                }
                n8c.m158485c("mergeFilter", "hide: " + j + ", " + z + "; fsi:" + GLMergeTextureFilter.this.f207998z + ",svn" + GLMergeTextureFilter.this.f207996x + ", viewShow[" + i + "]=" + GLMergeTextureFilter.this.f207987o[i] + ", s0Pos[" + GLMergeTextureFilter.this.f207976d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207977e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207978f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207979g[0] + Constants.AES_SUFFIX);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public void m222063y2(final long j, final int i, final int i2, final int i3, final int i4, final int i5) {
        n8c.m158485c("mergeFilter", "----pos(S): " + j + ", [" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "],fsi=" + this.f207998z + ", svn=" + this.f207996x);
        if (j > 9 || j < 0 || i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
            return;
        }
        m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.3
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
                    i6 = gLMergeTextureFilter.f207996x;
                    if (i9 >= i6) {
                        i9 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f207993t[i9]) {
                        break;
                    } else {
                        i9++;
                    }
                }
                long j2 = j;
                if (j2 == 0) {
                    int i10 = gLMergeTextureFilter.f207998z;
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i10 == 0) {
                        gLMergeTextureFilter2.f207987o[0] = true;
                        gLMergeTextureFilter2.f207976d[0] = i;
                        gLMergeTextureFilter2.f207977e[0] = i2;
                        gLMergeTextureFilter2.f207978f[0] = i3;
                        gLMergeTextureFilter2.f207979g[0] = i4;
                        gLMergeTextureFilter2.f207980i[0] = i5;
                        gLMergeTextureFilter2.f207993t[0] = j;
                    } else {
                        gLMergeTextureFilter2.f207976d[gLMergeTextureFilter2.f207998z] = i;
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter3.f207977e[gLMergeTextureFilter3.f207998z] = i2;
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter4.f207978f[gLMergeTextureFilter4.f207998z] = i3;
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter5.f207979g[gLMergeTextureFilter5.f207998z] = i4;
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter6.f207980i[gLMergeTextureFilter6.f207998z] = i5;
                    }
                } else if (i9 == -1) {
                    if (i6 >= 9) {
                        n8c.m158485c("mergeFilter", "----pos: svn[" + GLMergeTextureFilter.this.f207996x + "] over max=9!!!!");
                        return;
                    }
                    gLMergeTextureFilter.f207976d[i6] = i;
                    gLMergeTextureFilter.f207977e[i6] = i2;
                    gLMergeTextureFilter.f207978f[i6] = i3;
                    gLMergeTextureFilter.f207979g[i6] = i4;
                    gLMergeTextureFilter.f207980i[i6] = i5;
                    gLMergeTextureFilter.f207993t[i6] = j2;
                    gLMergeTextureFilter.f207987o[i6] = true;
                    gLMergeTextureFilter.f207996x = i6 + 1;
                } else if (gLMergeTextureFilter.f207998z == 0 || GLMergeTextureFilter.this.f207998z != i9) {
                    GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                    int i11 = gLMergeTextureFilter7.f207991r[i9];
                    if ((i11 == 3 || i11 == 9) && gLMergeTextureFilter7.f207987o[i9] && (((i7 = (iArr = gLMergeTextureFilter7.f207976d)[i9]) != (i8 = i) || gLMergeTextureFilter7.f207977e[i9] != i2 || gLMergeTextureFilter7.f207978f[i9] != i3 || gLMergeTextureFilter7.f207979g[i9] != i4) && i7 != -1)) {
                        int[] iArr2 = gLMergeTextureFilter7.f207990q;
                        if (iArr2[i9] > 0) {
                            int[] iArr3 = gLMergeTextureFilter7.f207988p;
                            if (iArr3[i9] > 0) {
                                iArr[i9] = i8;
                                gLMergeTextureFilter7.f207977e[i9] = i2;
                                gLMergeTextureFilter7.f207978f[i9] = i3;
                                gLMergeTextureFilter7.f207979g[i9] = i4;
                                rkw rkwVar = gLMergeTextureFilter7.f207982k[i9];
                                if (rkwVar != null) {
                                    rkwVar.setDisplayMode(iArr3[i9], iArr2[i9], 2);
                                    GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter8.f207982k[i9].setRenderSize(gLMergeTextureFilter8.f207978f[i9], gLMergeTextureFilter8.f207979g[i9]);
                                    GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter9.f207982k[i9].loadTexture(gLMergeTextureFilter9.f207985m[i9], gLMergeTextureFilter9.f207986n[i9]);
                                    GLMergeTextureFilter.this.f207982k[i9].drawFrame();
                                    GLES20.glFinish();
                                    GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter10.f207981j[i9] = gLMergeTextureFilter10.f207982k[i9].getTextOutID();
                                }
                            }
                        }
                    }
                    GLMergeTextureFilter gLMergeTextureFilter11 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter11.f207976d[i9] = i;
                    gLMergeTextureFilter11.f207977e[i9] = i2;
                    gLMergeTextureFilter11.f207978f[i9] = i3;
                    gLMergeTextureFilter11.f207979g[i9] = i4;
                    gLMergeTextureFilter11.f207980i[i9] = i5;
                    gLMergeTextureFilter11.f207987o[i9] = true;
                } else {
                    GLMergeTextureFilter gLMergeTextureFilter12 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter12.f207976d[0] = i;
                    gLMergeTextureFilter12.f207977e[0] = i2;
                    gLMergeTextureFilter12.f207978f[0] = i3;
                    gLMergeTextureFilter12.f207979g[0] = i4;
                    gLMergeTextureFilter12.f207980i[0] = i5;
                    gLMergeTextureFilter12.f207987o[i9] = true;
                }
                long j3 = j;
                if (i9 != -1) {
                    n8c.m158485c("mergeFilter", "----pos: " + j3 + ", s" + i9 + "Pos[" + GLMergeTextureFilter.this.f207976d[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207977e[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207978f[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207979g[i9] + "],fsi:" + GLMergeTextureFilter.this.f207998z + ", svn:" + GLMergeTextureFilter.this.f207996x);
                    return;
                }
                StringBuilder sb = new StringBuilder("----pos: ");
                sb.append(j3);
                sb.append(", s");
                sb.append(GLMergeTextureFilter.this.f207996x - 1);
                sb.append("Pos[");
                GLMergeTextureFilter gLMergeTextureFilter13 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter13.f207976d[gLMergeTextureFilter13.f207996x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter14 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter14.f207977e[gLMergeTextureFilter14.f207996x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter15 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter15.f207978f[gLMergeTextureFilter15.f207996x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter16 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter16.f207979g[gLMergeTextureFilter16.f207996x - 1]);
                sb.append("],fsi:");
                sb.append(GLMergeTextureFilter.this.f207998z);
                sb.append(", svn:");
                sb.append(GLMergeTextureFilter.this.f207996x);
                sb.append(", ind=");
                sb.append(i9);
                n8c.m158485c("mergeFilter", sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public void m222064z2(final long j, final int i, final int i2, final int i3, final int i4) {
        n8c.m158485c("mergeFilter", "----size(S): " + j + ", [" + i + Constants.SEPARATOR_COMMA + i2 + "],changed=" + i3 + " fsi:" + this.f207998z + ", svn:" + this.f207996x + "type" + i4);
        if (j > 9 || j <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            m222054o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.8
                @Override // java.lang.Runnable
                public void run() {
                    GLMergeTextureFilter gLMergeTextureFilter;
                    int i5;
                    int i6 = 1;
                    while (true) {
                        gLMergeTextureFilter = GLMergeTextureFilter.this;
                        i5 = gLMergeTextureFilter.f207996x;
                        if (i6 >= i5) {
                            i6 = -1;
                            break;
                        } else if (j == gLMergeTextureFilter.f207993t[i6]) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 == -1) {
                        if (i5 >= 9) {
                            n8c.m158485c("mergeFilter", "----size: svn[" + GLMergeTextureFilter.this.f207996x + "] over max=9!!!!");
                            return;
                        }
                        gLMergeTextureFilter.f207988p[i5] = i;
                        gLMergeTextureFilter.f207990q[i5] = i2;
                        gLMergeTextureFilter.f207991r[i5] = i4;
                        gLMergeTextureFilter.f207993t[i5] = j;
                        gLMergeTextureFilter.f207996x = i5 + 1;
                        StringBuilder sb = new StringBuilder("----size: ");
                        sb.append(j);
                        sb.append(", size[");
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter2.f207988p[gLMergeTextureFilter2.f207996x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter3.f207990q[gLMergeTextureFilter3.f207996x - 1]);
                        sb.append("], O:");
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter4.f207992s[gLMergeTextureFilter4.f207996x - 1]);
                        sb.append(", s");
                        sb.append(GLMergeTextureFilter.this.f207996x - 1);
                        sb.append("Pos[");
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter5.f207976d[gLMergeTextureFilter5.f207996x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter6.f207977e[gLMergeTextureFilter6.f207996x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter7.f207978f[gLMergeTextureFilter7.f207996x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter8.f207979g[gLMergeTextureFilter8.f207996x - 1]);
                        sb.append("],fsi:");
                        sb.append(GLMergeTextureFilter.this.f207998z);
                        sb.append(", svn:");
                        sb.append(GLMergeTextureFilter.this.f207996x);
                        sb.append(", ind=");
                        sb.append(i6);
                        sb.append("type");
                        GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter9.f207991r[gLMergeTextureFilter9.f207996x - 1]);
                        n8c.m158485c("mergeFilter", sb.toString());
                        return;
                    }
                    if (gLMergeTextureFilter.f207988p[i6] != i || gLMergeTextureFilter.f207990q[i6] != i2) {
                        n8c.m158485c("mergeFilter", "----size[changed]: ID[" + j + "], size[" + GLMergeTextureFilter.this.f207988p[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207990q[i6] + "]--->[" + i + Constants.SEPARATOR_COMMA + i2 + "], fsi:" + GLMergeTextureFilter.this.f207998z + ", svn:" + GLMergeTextureFilter.this.f207996x + ",ind=" + i6);
                        GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter10.f207988p[i6] = i;
                        gLMergeTextureFilter10.f207990q[i6] = i2;
                        int[] iArr = gLMergeTextureFilter10.f207991r;
                        int i7 = i4;
                        iArr[i6] = i7;
                        if (i7 == 2 || i7 == 3 || i7 == 8 || i7 == 9 || i3 != 1) {
                            gLMergeTextureFilter10.f207958L = 0;
                        } else {
                            gLMergeTextureFilter10.f207958L = 40;
                        }
                    }
                    n8c.m158485c("mergeFilter", "----size: " + j + ", len=" + GLMergeTextureFilter.this.f207958L + ", size[" + GLMergeTextureFilter.this.f207988p[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207990q[i6] + "], O:" + GLMergeTextureFilter.this.f207992s[i6] + ", s" + i6 + "Pos[" + GLMergeTextureFilter.this.f207976d[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207977e[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207978f[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f207979g[i6] + "],fsi:" + GLMergeTextureFilter.this.f207998z + ", svn:" + GLMergeTextureFilter.this.f207996x + ", ind=" + i6 + ", type=" + GLMergeTextureFilter.this.f207991r[i6]);
                }
            });
            return;
        }
        for (int i5 = 1; i5 < this.f207996x; i5++) {
            if (j == this.f207993t[i5] && !this.f207987o[i5]) {
                this.f207988p[i5] = -1;
                this.f207990q[i5] = -1;
                this.f207991r[i5] = 0;
            }
        }
    }
}
