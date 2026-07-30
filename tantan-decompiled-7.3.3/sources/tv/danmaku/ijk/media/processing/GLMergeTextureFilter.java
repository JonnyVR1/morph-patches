package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Queue;
import p153l.ch3;
import p153l.dfj;
import p153l.gfj;
import p153l.lej;
import p153l.muf;
import p153l.pej;
import p153l.qnw;
import p153l.sej;
import p153l.t9c;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMergeTextureFilter extends gfj implements dfj {

    /* JADX INFO: renamed from: A */
    private FloatBuffer[] f208867A;

    /* JADX INFO: renamed from: B */
    private float[] f208868B;

    /* JADX INFO: renamed from: C */
    private float[] f208869C;

    /* JADX INFO: renamed from: D */
    private float[] f208870D;

    /* JADX INFO: renamed from: E */
    private float[] f208871E;

    /* JADX INFO: renamed from: E0 */
    private final Queue<Runnable> f208872E0;

    /* JADX INFO: renamed from: F */
    private boolean f208873F;

    /* JADX INFO: renamed from: F0 */
    private final Queue<Runnable> f208874F0;

    /* JADX INFO: renamed from: G */
    private int f208875G;

    /* JADX INFO: renamed from: H */
    private int f208876H;

    /* JADX INFO: renamed from: I */
    private int f208877I;

    /* JADX INFO: renamed from: J */
    private int f208878J;

    /* JADX INFO: renamed from: K */
    private boolean f208879K;

    /* JADX INFO: renamed from: L */
    private int f208880L;

    /* JADX INFO: renamed from: M */
    private int f208881M;

    /* JADX INFO: renamed from: N */
    private float f208882N;

    /* JADX INFO: renamed from: O */
    private int f208883O;

    /* JADX INFO: renamed from: P */
    private int f208884P;

    /* JADX INFO: renamed from: Q */
    private float f208885Q;

    /* JADX INFO: renamed from: R */
    private float f208886R;

    /* JADX INFO: renamed from: S */
    private boolean f208887S;

    /* JADX INFO: renamed from: T */
    private int[] f208888T;

    /* JADX INFO: renamed from: U */
    private boolean f208889U;

    /* JADX INFO: renamed from: V */
    private boolean f208890V;

    /* JADX INFO: renamed from: W */
    private int f208891W;

    /* JADX INFO: renamed from: X */
    private int f208892X;

    /* JADX INFO: renamed from: Y */
    protected qnw f208893Y;

    /* JADX INFO: renamed from: Z */
    private int f208894Z;

    /* JADX INFO: renamed from: a */
    private pej f208895a;

    /* JADX INFO: renamed from: b */
    private int f208896b;

    /* JADX INFO: renamed from: c */
    private int f208897c;

    /* JADX INFO: renamed from: d */
    protected int[] f208898d;

    /* JADX INFO: renamed from: e */
    protected int[] f208899e;

    /* JADX INFO: renamed from: f */
    protected int[] f208900f;

    /* JADX INFO: renamed from: g */
    protected int[] f208901g;

    /* JADX INFO: renamed from: i */
    protected int[] f208902i;

    /* JADX INFO: renamed from: j */
    protected int[] f208903j;

    /* JADX INFO: renamed from: k */
    protected qnw[] f208904k;

    /* JADX INFO: renamed from: k0 */
    private SurfaceTexture f208905k0;

    /* JADX INFO: renamed from: l */
    protected Bitmap[] f208906l;

    /* JADX INFO: renamed from: m */
    protected int[] f208907m;

    /* JADX INFO: renamed from: n */
    protected SurfaceTexture[] f208908n;

    /* JADX INFO: renamed from: o */
    protected boolean[] f208909o;

    /* JADX INFO: renamed from: p */
    protected int[] f208910p;

    /* JADX INFO: renamed from: p0 */
    private int f208911p0;

    /* JADX INFO: renamed from: q */
    protected int[] f208912q;

    /* JADX INFO: renamed from: r */
    protected int[] f208913r;

    /* JADX INFO: renamed from: s */
    protected int[] f208914s;

    /* JADX INFO: renamed from: t */
    protected long[] f208915t;

    /* JADX INFO: renamed from: u */
    protected AidSource.FirstFrameDrawCallback[] f208916u;

    /* JADX INFO: renamed from: v */
    protected int[] f208917v;

    /* JADX INFO: renamed from: x */
    protected int f208918x;

    /* JADX INFO: renamed from: y */
    protected int f208919y;

    /* JADX INFO: renamed from: z */
    private int f208920z;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilter$1 */
    class RunnableC225741 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f208921a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ GLMergeTextureFilter f208922b;

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f208921a;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            GLMergeTextureFilter gLMergeTextureFilter = this.f208922b;
            if (gLMergeTextureFilter.f208893Y == null) {
                gLMergeTextureFilter.f208893Y = new qnw();
                if (this.f208922b.f208893Y != null) {
                    int height = this.f208921a.getHeight();
                    int width = this.f208921a.getWidth();
                    this.f208922b.f208893Y.setOESMode(false);
                    this.f208922b.f208893Y.initWithGLContext();
                    this.f208922b.f208893Y.loadTexture(this.f208921a);
                    GLMergeTextureFilter gLMergeTextureFilter2 = this.f208922b;
                    gLMergeTextureFilter2.f208894Z = gLMergeTextureFilter2.f208893Y.getBitmapTextureID();
                    GLMergeTextureFilter gLMergeTextureFilter3 = this.f208922b;
                    gLMergeTextureFilter3.f208905k0 = gLMergeTextureFilter3.f208893Y.getBitmapSurfaceTexture();
                    if (this.f208922b.f208905k0 != null && this.f208922b.f208894Z >= 0) {
                        this.f208922b.f208891W = height;
                        this.f208922b.f208892X = width;
                    }
                }
            }
            if (this.f208922b.f208893Y != null) {
                int height2 = this.f208921a.getHeight();
                int width2 = this.f208921a.getWidth();
                this.f208922b.f208893Y.loadTexture(this.f208921a);
                GLMergeTextureFilter gLMergeTextureFilter4 = this.f208922b;
                gLMergeTextureFilter4.f208894Z = gLMergeTextureFilter4.f208893Y.getBitmapTextureID();
                GLMergeTextureFilter gLMergeTextureFilter5 = this.f208922b;
                gLMergeTextureFilter5.f208905k0 = gLMergeTextureFilter5.f208893Y.getBitmapSurfaceTexture();
                if (this.f208922b.f208905k0 != null && this.f208922b.f208894Z >= 0) {
                    this.f208922b.f208891W = height2;
                    this.f208922b.f208892X = width2;
                }
                this.f208922b.f208893Y.drawFrame();
                GLES20.glFlush();
                GLMergeTextureFilter gLMergeTextureFilter6 = this.f208922b;
                gLMergeTextureFilter6.f208911p0 = gLMergeTextureFilter6.f208893Y.getTextOutID();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public void m223272B2(int i) {
        t9c.m189745c("mergeFilter", "swap(S): s0Pos[" + this.f208898d[0] + Constants.SEPARATOR_COMMA + this.f208899e[0] + Constants.SEPARATOR_COMMA + this.f208900f[0] + Constants.SEPARATOR_COMMA + this.f208901g[0] + "]--->s" + i + "Pos[" + this.f208898d[i] + Constants.SEPARATOR_COMMA + this.f208899e[i] + Constants.SEPARATOR_COMMA + this.f208900f[i] + Constants.SEPARATOR_COMMA + this.f208901g[i] + "], fsi:" + this.f208920z + ", svn:" + this.f208918x);
        int[] iArr = this.f208898d;
        int i2 = iArr[0];
        int[] iArr2 = this.f208899e;
        int i3 = iArr2[0];
        int[] iArr3 = this.f208900f;
        int i4 = iArr3[0];
        int[] iArr4 = this.f208901g;
        int i5 = iArr4[0];
        int[] iArr5 = this.f208902i;
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
    public static /* synthetic */ int m223282Z1(GLMergeTextureFilter gLMergeTextureFilter, int i) {
        int i2 = gLMergeTextureFilter.f208920z - i;
        gLMergeTextureFilter.f208920z = i2;
        return i2;
    }

    private void drawIndeed() {
        int iM223291j2;
        if (this.texture_in == 0 && this.f208919y == 0) {
            t9c.m189745c("mergeFilter", "draw: " + this.texture_in + ", " + this.f208919y + "), FID:" + this.f208920z);
            return;
        }
        if (this.f208919y >= this.f208918x) {
            t9c.m189745c("mergeFilter", "currence ID[" + this.f208919y + "]>" + this.f208918x);
            return;
        }
        int i = this.f208878J;
        if (i == 2) {
            iM223291j2 = m223290i2();
        } else {
            iM223291j2 = i == 1 ? m223291j2() : 0;
        }
        int[] iArr = this.f208898d;
        int i2 = this.f208919y;
        GLES20.glViewport(iArr[i2], iM223291j2, this.f208900f[i2], this.f208901g[i2]);
        GLES20.glUseProgram(this.programHandle);
        int i3 = this.f208920z;
        int i4 = this.f208919y;
        if (i3 == i4) {
            if (this.f208876H == 2 || this.f208890V) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
                this.f208890V = false;
                t9c.m189745c("mergeFilter", "----drawIndeed: Clean=" + this.f208890V + com.meituan.robust.Constants.PACKNAME_END + this.f208889U);
            } else if (this.f208918x == 1 && (this.f208898d[i4] != 0 || this.f208899e[i4] != 0 || this.f208900f[i4] < this.f208910p[i4] || this.f208901g[i4] < this.f208912q[i4])) {
                GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
                GLES20.glClear(16640);
            }
        }
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        int[] iArr2 = this.f208917v;
        int i5 = this.f208919y;
        if (iArr2[i5] == 0) {
            iArr2[i5] = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public void m223287f2(int i) {
        int i2;
        if (this.f208898d[i] == -1 || this.f208899e[i] == -1 || this.f208900f[i] == -1 || this.f208901g[i] == -1) {
            this.f208903j[i] = -1;
            return;
        }
        qnw[] qnwVarArr = this.f208904k;
        qnw qnwVar = qnwVarArr[i];
        if (qnwVar != null) {
            if (this.f208912q[i] == -1 || this.f208910p[i] == -1) {
                this.f208903j[i] = -1;
                return;
            }
            if (this.f208913r[i] == 7) {
                qnwVar.loadTexture(this.f208906l[i]);
                this.f208907m[i] = this.f208904k[i].getBitmapTextureID();
                this.f208908n[i] = this.f208904k[i].getBitmapSurfaceTexture();
            } else {
                qnwVar.loadTexture(this.f208907m[i], this.f208908n[i]);
            }
            int i3 = this.f208913r[i];
            if (i3 == 2 || i3 == 3 || i3 == 9) {
                this.f208904k[i].setDisplayMode(this.f208910p[i], this.f208912q[i], 2);
                this.f208904k[i].setRenderSize(this.f208900f[i], this.f208901g[i]);
            } else {
                this.f208904k[i].setRenderSize(this.f208910p[i], this.f208912q[i]);
            }
            this.f208904k[i].drawFrame();
            GLES20.glFlush();
            this.f208903j[i] = this.f208904k[i].getTextOutID();
            return;
        }
        qnwVarArr[i] = new qnw();
        if (this.f208913r[i] == 7) {
            this.f208904k[i].setOESMode(false);
        }
        this.f208904k[i].initWithGLContext();
        int i4 = this.f208912q[i];
        if (i4 == -1 || (i2 = this.f208910p[i]) == -1) {
            this.f208903j[i] = -1;
            return;
        }
        int i5 = this.f208913r[i];
        if (i5 == 2 || i5 == 3 || i5 == 9) {
            this.f208904k[i].setDisplayMode(i2, i4, 2);
            this.f208904k[i].setRenderSize(this.f208900f[i], this.f208901g[i]);
        } else {
            this.f208904k[i].setRenderSize(i2, i4);
        }
        int i6 = this.f208913r[i];
        qnw[] qnwVarArr2 = this.f208904k;
        if (i6 == 7) {
            qnwVarArr2[i].loadTexture(this.f208906l[i]);
            this.f208907m[i] = this.f208904k[i].getBitmapTextureID();
            this.f208908n[i] = this.f208904k[i].getBitmapSurfaceTexture();
        } else {
            qnwVarArr2[i].loadTexture(this.f208907m[i], this.f208908n[i]);
        }
        this.f208904k[i].drawFrame();
        GLES20.glFlush();
        this.f208903j[i] = this.f208904k[i].getTextOutID();
    }

    /* JADX INFO: renamed from: g2 */
    private void m223288g2(int i, int i2, float f) {
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
        m223295p2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: h2 */
    private void m223289h2(int i, int i2, int i3, int i4) {
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
        m223295p2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: i2 */
    private int m223290i2() {
        int i;
        int i2;
        int i3;
        this.f208885Q = 0.0f;
        this.f208886R = 0.0f;
        int i4 = this.f208919y;
        int i5 = this.f208920z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f208914s[i5];
                int[] iArr = this.f208910p;
                if (i6 == 1) {
                    m223289h2(iArr[i5], this.f208912q[i5], getHeight(), getWidth());
                } else {
                    m223289h2(iArr[i5], this.f208912q[i5], getWidth(), getHeight());
                }
                return this.f208899e[this.f208919y];
            }
            if (this.f208876H != 2) {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208899e[this.f208919y];
            }
            m223288g2(this.f208910p[i4], this.f208912q[i4], (this.f208900f[i4] * 1.0f) / this.f208901g[i4]);
            i = this.f208896b;
            int[] iArr2 = this.f208899e;
            int i7 = this.f208919y;
            i2 = iArr2[i7];
            i3 = this.f208901g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f208913r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f208912q[i4];
                int i10 = this.f208910p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f208901g[i4] * 1.0f) / this.f208900f[i4];
                if (f2 != f) {
                    m223288g2(i10, i9, f2);
                } else {
                    m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f208910p;
                int i11 = this.f208919y;
                this.f208885Q = 1.0f / iArr3[i11];
                this.f208886R = 1.0f / this.f208912q[i11];
            }
            i = this.f208896b;
            int[] iArr4 = this.f208899e;
            int i12 = this.f208919y;
            i2 = iArr4[i12];
            i3 = this.f208901g[i12];
        } else {
            int i13 = this.f208912q[i4];
            int i14 = this.f208910p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f208900f[i4] * 1.0f) / this.f208901g[i4];
            if (f4 != f3) {
                m223288g2(i14, i13, f4);
            } else {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208896b;
            int[] iArr5 = this.f208899e;
            int i15 = this.f208919y;
            i2 = iArr5[i15];
            i3 = this.f208901g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: j2 */
    private int m223291j2() {
        int i;
        int i2;
        int i3;
        this.f208885Q = 0.0f;
        this.f208886R = 0.0f;
        int i4 = this.f208919y;
        int i5 = this.f208920z;
        if (i4 == i5) {
            if (i4 != 0) {
                int i6 = this.f208914s[i5];
                int[] iArr = this.f208910p;
                if (i6 == 1) {
                    m223289h2(iArr[i5], this.f208912q[i5], getWidth(), getHeight());
                } else {
                    m223289h2(iArr[i5], this.f208912q[i5], getHeight(), getWidth());
                }
                return this.f208899e[this.f208919y];
            }
            if (this.f208876H != 2 && !this.f208889U) {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208899e[this.f208919y];
            }
            m223288g2(this.f208910p[i4], this.f208912q[i4], (this.f208901g[i4] * 1.0f) / this.f208900f[i4]);
            i = this.f208896b;
            int[] iArr2 = this.f208899e;
            int i7 = this.f208919y;
            i2 = iArr2[i7];
            i3 = this.f208901g[i7];
        } else if (i4 != 0 || i5 == 0) {
            int i8 = this.f208913r[i4];
            if (i8 == 2 || i8 == 3 || i8 == 9) {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i9 = this.f208912q[i4];
                int i10 = this.f208910p[i4];
                float f = i9 / (i10 * 1.0f);
                float f2 = (this.f208901g[i4] * 1.0f) / this.f208900f[i4];
                if (f2 != f) {
                    m223288g2(i10, i9, f2);
                } else {
                    m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                int[] iArr3 = this.f208910p;
                int i11 = this.f208919y;
                this.f208885Q = 1.0f / iArr3[i11];
                this.f208886R = 1.0f / this.f208912q[i11];
            }
            i = this.f208896b;
            int[] iArr4 = this.f208899e;
            int i12 = this.f208919y;
            i2 = iArr4[i12];
            i3 = this.f208901g[i12];
        } else {
            int i13 = this.f208912q[i4];
            int i14 = this.f208910p[i4];
            float f3 = i13 / (i14 * 1.0f);
            float f4 = (this.f208901g[i4] * 1.0f) / this.f208900f[i4];
            if (f4 != f3) {
                m223288g2(i14, i13, f4);
            } else {
                m223295p2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208896b;
            int[] iArr5 = this.f208899e;
            int i15 = this.f208919y;
            i2 = iArr5[i15];
            i3 = this.f208901g[i15];
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: l2 */
    private int m223292l2() {
        int i = this.curRotation;
        if (this.f208876H == 2 && this.f208919y == 0) {
            return i + 3;
        }
        int i2 = this.f208919y;
        int i3 = this.f208920z;
        if (i2 == i3 && i2 == 0) {
            return i;
        }
        if (i3 == 0 || i2 != 0) {
            return (i2 != i3 || i2 == 0) ? i : i + 1;
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: m2 */
    private int m223293m2() {
        int i = this.curRotation;
        int i2 = this.f208875G;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: n2 */
    private void m223294n2(Queue<Runnable> queue) {
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
    private void m223295p2(float f, float f2, float f3, float f4) {
        if (!this.f208873F) {
            if (this.f208868B == null || this.f208869C == null || this.f208870D == null || this.f208871E == null || this.f208867A == null) {
                this.f208867A = new FloatBuffer[4];
                this.f208868B = new float[8];
                this.f208869C = new float[8];
                this.f208870D = new float[8];
                this.f208871E = new float[8];
            } else {
                this.f208873F = true;
            }
        }
        if (this.f208873F) {
            float[] fArr = this.f208868B;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f208867A;
            floatBufferArr[0] = ch3.m109765a(floatBufferArr[0], fArr);
            float[] fArr2 = this.f208869C;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f208867A;
            floatBufferArr2[1] = ch3.m109765a(floatBufferArr2[1], fArr2);
            float[] fArr3 = this.f208870D;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f208867A;
            floatBufferArr3[2] = ch3.m109765a(floatBufferArr3[2], fArr3);
            float[] fArr4 = this.f208871E;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f208867A;
            floatBufferArr4[3] = ch3.m109765a(floatBufferArr4[3], fArr4);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m223296A2(final long j, final boolean z) {
        t9c.m189745c("mergeFilter", "close(S): " + j + ",svn:" + this.f208918x + Constants.SEPARATOR_COMMA + z);
        if (j > 9 || j <= 0) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.2
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i;
                int i2 = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    i = gLMergeTextureFilter.f208918x;
                    if (i2 >= i) {
                        i2 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f208915t[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1 || i <= 1) {
                    t9c.m189745c("mergeFilter", "close: " + j + ", ind=" + i2 + ",svn:" + GLMergeTextureFilter.this.f208918x);
                    return;
                }
                if (gLMergeTextureFilter.f208920z == i2 && i2 != -1 && i2 != 0) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    int[] iArr = gLMergeTextureFilter2.f208898d;
                    iArr[0] = iArr[i2];
                    int[] iArr2 = gLMergeTextureFilter2.f208899e;
                    iArr2[0] = iArr2[i2];
                    int[] iArr3 = gLMergeTextureFilter2.f208900f;
                    iArr3[0] = iArr3[i2];
                    int[] iArr4 = gLMergeTextureFilter2.f208901g;
                    iArr4[0] = iArr4[i2];
                    int[] iArr5 = gLMergeTextureFilter2.f208902i;
                    iArr5[0] = iArr5[i2];
                    gLMergeTextureFilter2.f208920z = 0;
                }
                if (!z) {
                    t9c.m189745c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f208920z + ", svn=" + GLMergeTextureFilter.this.f208918x + ", ind=" + i2 + ", viewTexture=" + GLMergeTextureFilter.this.f208907m[i2]);
                    return;
                }
                qnw qnwVar = GLMergeTextureFilter.this.f208904k[i2];
                if (qnwVar != null) {
                    qnwVar.destroy();
                    GLMergeTextureFilter.this.f208904k[i2] = null;
                }
                Bitmap bitmap = GLMergeTextureFilter.this.f208906l[i2];
                if (bitmap != null) {
                    bitmap.recycle();
                    GLMergeTextureFilter.this.f208906l[i2] = null;
                }
                SurfaceTexture surfaceTexture = GLMergeTextureFilter.this.f208908n[i2];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLMergeTextureFilter.this.f208908n[i2] = null;
                }
                int i3 = i2;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    int i4 = gLMergeTextureFilter3.f208918x;
                    if (i3 >= i4 - 1) {
                        gLMergeTextureFilter3.f208909o[i4 - 1] = false;
                        gLMergeTextureFilter3.f208898d[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208899e[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208900f[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208901g[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208902i[i4 - 1] = 0;
                        gLMergeTextureFilter3.f208910p[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208912q[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208913r[i4 - 1] = 0;
                        gLMergeTextureFilter3.f208914s[i4 - 1] = 1;
                        gLMergeTextureFilter3.f208915t[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208908n[i4 - 1] = null;
                        gLMergeTextureFilter3.f208907m[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208906l[i4 - 1] = null;
                        gLMergeTextureFilter3.f208903j[i4 - 1] = -1;
                        gLMergeTextureFilter3.f208904k[i4 - 1] = null;
                        gLMergeTextureFilter3.f208916u[i4 - 1] = null;
                        gLMergeTextureFilter3.f208917v[i4 - 1] = 0;
                        gLMergeTextureFilter3.f208918x = i4 - 1;
                        t9c.m189745c("mergeFilter", "close: " + j + ", fsi=" + GLMergeTextureFilter.this.f208920z + ", svn=" + GLMergeTextureFilter.this.f208918x + ", ind=" + i2 + "s0Pos[" + GLMergeTextureFilter.this.f208898d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208899e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208900f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208901g[0] + Constants.AES_SUFFIX);
                        return;
                    }
                    boolean[] zArr = gLMergeTextureFilter3.f208909o;
                    int i5 = i3 + 1;
                    zArr[i3] = zArr[i5];
                    int[] iArr6 = gLMergeTextureFilter3.f208898d;
                    iArr6[i3] = iArr6[i5];
                    int[] iArr7 = gLMergeTextureFilter3.f208899e;
                    iArr7[i3] = iArr7[i5];
                    int[] iArr8 = gLMergeTextureFilter3.f208900f;
                    iArr8[i3] = iArr8[i5];
                    int[] iArr9 = gLMergeTextureFilter3.f208901g;
                    iArr9[i3] = iArr9[i5];
                    int[] iArr10 = gLMergeTextureFilter3.f208902i;
                    iArr10[i3] = iArr10[i5];
                    int[] iArr11 = gLMergeTextureFilter3.f208910p;
                    iArr11[i3] = iArr11[i5];
                    int[] iArr12 = gLMergeTextureFilter3.f208912q;
                    iArr12[i3] = iArr12[i5];
                    int[] iArr13 = gLMergeTextureFilter3.f208913r;
                    iArr13[i3] = iArr13[i5];
                    int[] iArr14 = gLMergeTextureFilter3.f208914s;
                    iArr14[i3] = iArr14[i5];
                    long[] jArr = gLMergeTextureFilter3.f208915t;
                    jArr[i3] = jArr[i5];
                    SurfaceTexture[] surfaceTextureArr = gLMergeTextureFilter3.f208908n;
                    surfaceTextureArr[i3] = surfaceTextureArr[i5];
                    int[] iArr15 = gLMergeTextureFilter3.f208907m;
                    iArr15[i3] = iArr15[i5];
                    Bitmap[] bitmapArr = gLMergeTextureFilter3.f208906l;
                    bitmapArr[i3] = bitmapArr[i5];
                    int[] iArr16 = gLMergeTextureFilter3.f208903j;
                    iArr16[i3] = iArr16[i5];
                    qnw[] qnwVarArr = gLMergeTextureFilter3.f208904k;
                    qnwVarArr[i3] = qnwVarArr[i5];
                    AidSource.FirstFrameDrawCallback[] firstFrameDrawCallbackArr = gLMergeTextureFilter3.f208916u;
                    firstFrameDrawCallbackArr[i3] = firstFrameDrawCallbackArr[i5];
                    int[] iArr17 = gLMergeTextureFilter3.f208917v;
                    iArr17[i3] = iArr17[i5];
                    if (gLMergeTextureFilter3.f208920z > i2) {
                        GLMergeTextureFilter.m223282Z1(GLMergeTextureFilter.this, 1);
                    }
                    i3 = i5;
                }
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m223297C2(final long j, final SurfaceTexture surfaceTexture, final int i, final Bitmap bitmap) {
        if (i == -1 && bitmap == null) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.4
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i2;
                int i3 = 1;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i3 >= gLMergeTextureFilter2.f208918x) {
                        i3 = -1;
                        break;
                    }
                    if (j == gLMergeTextureFilter2.f208915t[i3]) {
                        int[] iArr = gLMergeTextureFilter2.f208907m;
                        int i4 = iArr[i3];
                        int i5 = i;
                        if (i4 == i5) {
                            SurfaceTexture surfaceTexture2 = gLMergeTextureFilter2.f208908n[i3];
                        }
                        iArr[i3] = i5;
                        gLMergeTextureFilter2.f208908n[i3] = surfaceTexture;
                        gLMergeTextureFilter2.f208906l[i3] = bitmap;
                        gLMergeTextureFilter2.m223287f2(i3);
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 || (i2 = (gLMergeTextureFilter = GLMergeTextureFilter.this).f208918x) >= 9) {
                    return;
                }
                gLMergeTextureFilter.f208906l[i2] = bitmap;
                gLMergeTextureFilter.f208907m[i2] = i;
                gLMergeTextureFilter.f208908n[i2] = surfaceTexture;
                gLMergeTextureFilter.f208915t[i2] = j;
                gLMergeTextureFilter.m223287f2(i2);
                GLMergeTextureFilter.this.f208918x++;
                t9c.m189745c("mergeFilter", "----update: " + j + ", TID=" + i + ",svn=" + GLMergeTextureFilter.this.f208918x + ", fsi=" + GLMergeTextureFilter.this.f208920z + ", ind=" + i3);
            }
        });
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        t9c.m189745c("mergeFilter", "destroy(S)");
        this.f208887S = true;
        super.destroy();
        Queue<Runnable> queue = this.f208872E0;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f208874F0;
        if (queue2 != null) {
            queue2.clear();
        }
        int[] iArr = this.f208888T;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f208888T = null;
        }
        this.f208918x = 1;
        for (int i = 0; i < 9; i++) {
            this.f208916u[i] = null;
            this.f208917v[i] = 0;
            this.f208898d[i] = -1;
            this.f208899e[i] = -1;
            this.f208900f[i] = -1;
            this.f208901g[i] = -1;
            this.f208902i[i] = 0;
            this.f208907m[i] = -1;
            Bitmap bitmap = this.f208906l[i];
            if (bitmap != null) {
                bitmap.recycle();
                this.f208906l[i] = null;
            }
            this.f208903j[i] = -1;
            this.f208910p[i] = -1;
            this.f208912q[i] = -1;
            this.f208913r[i] = 0;
            this.f208909o[i] = false;
            this.f208915t[i] = -1;
            SurfaceTexture surfaceTexture = this.f208908n[i];
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f208908n[i] = null;
            }
            this.f208914s[i] = 1;
            qnw qnwVar = this.f208904k[i];
            if (qnwVar != null) {
                qnwVar.destroy();
                this.f208904k[i] = null;
            }
        }
        t9c.m189745c("mergeFilter", "destroy");
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                t9c.m189745c("mergeFilter", "width:" + getWidth() + ", height:" + getHeight());
                return;
            }
            initFBO();
        }
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null && lejVar.m153901h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                t9c.m189745c("mergeFilter", "width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m223298e2(float f, float f2, float f3, float f4, boolean z) {
        t9c.m189745c("mergeFilter", "clear screen," + z);
        this.f208879K = true;
        if (z) {
            this.f208880L = 160;
            return;
        }
        t9c.m189745c("mergeFilter", "clear screen, " + z + ",mSubWndChanged=" + this.f208880L + "/160");
        this.f208880L = 40;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (imageStep.x != 0.0 && imageStep.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-imageStep.x, -imageStep.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, imageStep.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(imageStep.x, -imageStep.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
    }

    @Override // p153l.gfj
    public int getTextOutID() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            return lejVar.m153902i()[0];
        }
        return 0;
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float imageClear; \nuniform float widthStep; \nuniform float heightStep; \nvarying float clear_image; \nvarying vec2 imageStep; \nvoid main() {\nclear_image = imageClear; \nimageStep = vec2(widthStep, heightStep); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVarM185548c = sej.m185545d().m185548c(getWidth(), getHeight());
        this.glFrameBuffer = lejVarM185548c;
        lejVarM185548c.m153895b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f208881M = GLES20.glGetUniformLocation(this.programHandle, "imageClear");
        this.f208883O = GLES20.glGetUniformLocation(this.programHandle, "widthStep");
        this.f208884P = GLES20.glGetUniformLocation(this.programHandle, "heightStep");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: k2 */
    public AidSource.FirstFrameDrawCallback m223299k2(int i) {
        return this.f208916u[i];
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        int i2;
        m223294n2(this.f208872E0);
        if (z) {
            markAsDirty();
        } else {
            t9c.m189745c("mergeFilter", "newfata=" + z + ", dirty=" + this.dirty);
        }
        if (!this.f208887S) {
            this.f208919y = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f208918x;
                if (i3 >= i4) {
                    break;
                }
                this.f208919y = i3;
                if (this.f208879K || this.f208880L > 0) {
                    this.f208882N = 0.0f;
                    int i5 = this.f208880L;
                    if (i5 > 0) {
                        this.f208880L = i5 - 1;
                    }
                } else {
                    this.f208882N = 1.0f;
                }
                int i6 = this.f208920z;
                if (i6 != 0) {
                    if (i3 == 0) {
                        this.f208919y = i6;
                    } else if (i3 == i6) {
                        this.f208919y = 0;
                    } else {
                        this.f208919y = i3;
                    }
                }
                if (this.f208889U && i4 >= 2) {
                    this.f208890V = false;
                    if (i3 == 0) {
                        for (int i7 = 1; i7 < this.f208918x; i7++) {
                            if (this.f208913r[i7] == 7) {
                                this.f208919y = i7;
                                break;
                            }
                        }
                    } else if (this.f208913r[i3] == 7) {
                        this.f208919y = 0;
                    }
                }
                boolean[] zArr = this.f208909o;
                int i8 = this.f208919y;
                if (zArr[i8]) {
                    int i9 = this.f208907m[i8];
                    if ((i9 == -1 || i9 != i) && i8 == 0) {
                        t9c.m189745c("mergeFilter", "index:" + this.f208919y + ", " + this.f208907m[this.f208919y] + "--->" + i);
                        this.f208907m[this.f208919y] = i;
                    }
                    int[] iArr = this.f208907m;
                    int i10 = this.f208919y;
                    int i11 = iArr[i10];
                    if (((i11 != -1 || this.f208906l[i10] != null) && this.f208910p[i10] > 0 && this.f208912q[i10] > 0) || i10 == 0) {
                        if (i10 != 0) {
                            if (this.f208903j[i10] == -1 || this.f208908n[i10] == null) {
                                m223287f2(i10);
                            }
                            int[] iArr2 = this.f208903j;
                            int i12 = this.f208919y;
                            int i13 = iArr2[i12];
                            if (i13 != -1 && this.f208908n[i12] != null) {
                                this.texture_in = i13;
                            }
                        } else {
                            this.texture_in = i11;
                        }
                        if (i3 == 0) {
                            int height = getHeight();
                            int width = getWidth();
                            if (height != this.f208896b || width != this.f208897c) {
                                this.f208896b = height;
                                this.f208897c = width;
                                setWidth(width);
                                setHeight(this.f208896b);
                            }
                        }
                        int width2 = gfjVar.getWidth();
                        int height2 = gfjVar.getHeight();
                        int[] iArr3 = this.f208910p;
                        int i14 = this.f208919y;
                        int i15 = iArr3[i14];
                        if (i15 == -1 || (i2 = this.f208912q[i14]) == -1) {
                            iArr3[i14] = gfjVar.getWidth();
                            this.f208912q[this.f208919y] = gfjVar.getHeight();
                        } else if ((width2 != i15 || height2 != i2) && i14 == 0) {
                            t9c.m189745c("mergeFilter", "w/h:[" + this.f208910p[this.f208919y] + Constants.SEPARATOR_COMMA + this.f208912q[this.f208919y] + "]===>[" + width2 + Constants.SEPARATOR_COMMA + height2 + "], ID=" + this.f208919y);
                            int[] iArr4 = this.f208910p;
                            int i16 = this.f208919y;
                            iArr4[i16] = width2;
                            this.f208912q[i16] = height2;
                        }
                        this.f208895a.m172020c(this.f208897c, this.f208896b);
                        onDrawFrame();
                    }
                }
                i3++;
            }
            for (int i17 = 1; i17 < this.f208918x; i17++) {
                int[] iArr5 = this.f208917v;
                int i18 = iArr5[i17];
                if (i18 == 1) {
                    iArr5[i17] = i18 + 1;
                    if (m223299k2(i17) != null) {
                        t9c.m189745c("mergeFilter", "---- sub view " + i17 + "call callback");
                        m223299k2(i17).mo223472a();
                    } else {
                        t9c.m189745c("mergeFilter", "---- sub view " + i17 + "call callback null");
                    }
                }
            }
        }
        synchronized (this.listLock) {
            try {
                for (dfj dfjVar : this.targets) {
                    lej lejVar = this.glFrameBuffer;
                    if (lejVar != null) {
                        dfjVar.newTextureReady(lejVar.m153902i()[0], this, z);
                    } else {
                        t9c.m189745c("mergeFilter", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gfjVar.unlockRenderBuffer();
        m223294n2(this.f208874F0);
    }

    /* JADX INFO: renamed from: o2 */
    public void m223300o2(Runnable runnable) {
        synchronized (this.f208872E0) {
            this.f208872E0.add(runnable);
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        int iM223293m2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f208881M, this.f208882N);
        GLES20.glUniform1f(this.f208883O, this.f208885Q);
        GLES20.glUniform1f(this.f208884P, this.f208886R);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f208878J;
        if (i == 2) {
            iM223293m2 = m223292l2();
        } else if (i == 1) {
            iM223293m2 = m223293m2();
        }
        int i2 = iM223293m2 % 4;
        this.f208867A[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f208867A[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: q2 */
    public void m223301q2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback, int i) {
        this.f208916u[i] = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: r2 */
    public void m223302r2(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.f208877I = i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m223303s2(int i) {
        this.f208878J = i;
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        this.f208896b = i2;
        this.f208897c = i;
        this.f208879K = false;
        this.f208875G = -1;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m223304t2(int i) {
        if (this.f208877I == 1) {
            this.f208875G = i;
        } else {
            this.f208875G = -1;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m223305u2(boolean z) {
        if (z == this.f208889U) {
            return;
        }
        t9c.m189745c("mergeFilter", "----setSmallViewScreen(S): smallView=" + z);
        this.f208889U = z;
        this.f208890V = z;
        t9c.m189745c("mergeFilter", "----setSmallViewScreen(E): Clean=" + this.f208890V + com.meituan.robust.Constants.PACKNAME_END + this.f208889U);
    }

    /* JADX INFO: renamed from: v2 */
    public void m223306v2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        if (j > 9 || j <= 0 || firstFrameDrawCallback == null) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.7
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 1;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f208918x) {
                        i = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f208915t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    gLMergeTextureFilter.m223301q2(firstFrameDrawCallback, i);
                    GLMergeTextureFilter.this.f208917v[i] = 0;
                }
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public void m223307w2(final long j, final boolean z) {
        t9c.m189745c("mergeFilter", "full screen(S): " + j + ", " + z + "; fsi:" + this.f208920z + ", svn:" + this.f208918x);
        if (j > 9 || j <= 0) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.5
            @Override // java.lang.Runnable
            public void run() {
                GLMergeTextureFilter gLMergeTextureFilter;
                int i = 0;
                while (true) {
                    gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f208918x) {
                        i = 0;
                        break;
                    } else if (j == gLMergeTextureFilter.f208915t[i]) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == 0) {
                    if (gLMergeTextureFilter.f208920z != 0 && z) {
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter2.m223272B2(gLMergeTextureFilter2.f208920z);
                        GLMergeTextureFilter.this.f208920z = 0;
                    }
                } else if (gLMergeTextureFilter.f208920z == 0) {
                    if (i != 0 && z) {
                        GLMergeTextureFilter.this.m223272B2(i);
                        GLMergeTextureFilter.this.f208920z = i;
                    }
                } else if (GLMergeTextureFilter.this.f208920z != i) {
                    GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter3.m223272B2(gLMergeTextureFilter3.f208920z);
                    GLMergeTextureFilter.this.f208920z = 0;
                    GLMergeTextureFilter.this.m223272B2(i);
                    GLMergeTextureFilter.this.f208920z = i;
                } else if (!z) {
                    GLMergeTextureFilter.this.m223272B2(i);
                    GLMergeTextureFilter.this.f208920z = 0;
                }
                t9c.m189745c("mergeFilter", "full screen:" + j + ",fsi=" + GLMergeTextureFilter.this.f208920z + ",svn=" + GLMergeTextureFilter.this.f208918x + ", s0Pos[" + GLMergeTextureFilter.this.f208898d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208899e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208900f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208901g[0] + "], ind=" + i);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public void m223308x2(final long j, final boolean z) {
        t9c.m189745c("mergeFilter", "hide(S): " + j + ", " + z + "; fsi:" + this.f208920z + ", svn:" + this.f208918x);
        if (j > 9 || j <= 0) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.6
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    GLMergeTextureFilter gLMergeTextureFilter = GLMergeTextureFilter.this;
                    if (i >= gLMergeTextureFilter.f208918x) {
                        break;
                    }
                    if (j == gLMergeTextureFilter.f208915t[i]) {
                        if (z && gLMergeTextureFilter.f208920z == i) {
                            GLMergeTextureFilter.this.m223307w2(j, false);
                        }
                        GLMergeTextureFilter.this.f208909o[i] = !z;
                        break;
                    }
                    i++;
                }
                t9c.m189745c("mergeFilter", "hide: " + j + ", " + z + "; fsi:" + GLMergeTextureFilter.this.f208920z + ",svn" + GLMergeTextureFilter.this.f208918x + ", viewShow[" + i + "]=" + GLMergeTextureFilter.this.f208909o[i] + ", s0Pos[" + GLMergeTextureFilter.this.f208898d[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208899e[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208900f[0] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208901g[0] + Constants.AES_SUFFIX);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public void m223309y2(final long j, final int i, final int i2, final int i3, final int i4, final int i5) {
        t9c.m189745c("mergeFilter", "----pos(S): " + j + ", [" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "],fsi=" + this.f208920z + ", svn=" + this.f208918x);
        if (j > 9 || j < 0 || i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
            return;
        }
        m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.3
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
                    i6 = gLMergeTextureFilter.f208918x;
                    if (i9 >= i6) {
                        i9 = -1;
                        break;
                    } else if (j == gLMergeTextureFilter.f208915t[i9]) {
                        break;
                    } else {
                        i9++;
                    }
                }
                long j2 = j;
                if (j2 == 0) {
                    int i10 = gLMergeTextureFilter.f208920z;
                    GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                    if (i10 == 0) {
                        gLMergeTextureFilter2.f208909o[0] = true;
                        gLMergeTextureFilter2.f208898d[0] = i;
                        gLMergeTextureFilter2.f208899e[0] = i2;
                        gLMergeTextureFilter2.f208900f[0] = i3;
                        gLMergeTextureFilter2.f208901g[0] = i4;
                        gLMergeTextureFilter2.f208902i[0] = i5;
                        gLMergeTextureFilter2.f208915t[0] = j;
                    } else {
                        gLMergeTextureFilter2.f208898d[gLMergeTextureFilter2.f208920z] = i;
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter3.f208899e[gLMergeTextureFilter3.f208920z] = i2;
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter4.f208900f[gLMergeTextureFilter4.f208920z] = i3;
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter5.f208901g[gLMergeTextureFilter5.f208920z] = i4;
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter6.f208902i[gLMergeTextureFilter6.f208920z] = i5;
                    }
                } else if (i9 == -1) {
                    if (i6 >= 9) {
                        t9c.m189745c("mergeFilter", "----pos: svn[" + GLMergeTextureFilter.this.f208918x + "] over max=9!!!!");
                        return;
                    }
                    gLMergeTextureFilter.f208898d[i6] = i;
                    gLMergeTextureFilter.f208899e[i6] = i2;
                    gLMergeTextureFilter.f208900f[i6] = i3;
                    gLMergeTextureFilter.f208901g[i6] = i4;
                    gLMergeTextureFilter.f208902i[i6] = i5;
                    gLMergeTextureFilter.f208915t[i6] = j2;
                    gLMergeTextureFilter.f208909o[i6] = true;
                    gLMergeTextureFilter.f208918x = i6 + 1;
                } else if (gLMergeTextureFilter.f208920z == 0 || GLMergeTextureFilter.this.f208920z != i9) {
                    GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                    int i11 = gLMergeTextureFilter7.f208913r[i9];
                    if ((i11 == 3 || i11 == 9) && gLMergeTextureFilter7.f208909o[i9] && (((i7 = (iArr = gLMergeTextureFilter7.f208898d)[i9]) != (i8 = i) || gLMergeTextureFilter7.f208899e[i9] != i2 || gLMergeTextureFilter7.f208900f[i9] != i3 || gLMergeTextureFilter7.f208901g[i9] != i4) && i7 != -1)) {
                        int[] iArr2 = gLMergeTextureFilter7.f208912q;
                        if (iArr2[i9] > 0) {
                            int[] iArr3 = gLMergeTextureFilter7.f208910p;
                            if (iArr3[i9] > 0) {
                                iArr[i9] = i8;
                                gLMergeTextureFilter7.f208899e[i9] = i2;
                                gLMergeTextureFilter7.f208900f[i9] = i3;
                                gLMergeTextureFilter7.f208901g[i9] = i4;
                                qnw qnwVar = gLMergeTextureFilter7.f208904k[i9];
                                if (qnwVar != null) {
                                    qnwVar.setDisplayMode(iArr3[i9], iArr2[i9], 2);
                                    GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter8.f208904k[i9].setRenderSize(gLMergeTextureFilter8.f208900f[i9], gLMergeTextureFilter8.f208901g[i9]);
                                    GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter9.f208904k[i9].loadTexture(gLMergeTextureFilter9.f208907m[i9], gLMergeTextureFilter9.f208908n[i9]);
                                    GLMergeTextureFilter.this.f208904k[i9].drawFrame();
                                    GLES20.glFinish();
                                    GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                                    gLMergeTextureFilter10.f208903j[i9] = gLMergeTextureFilter10.f208904k[i9].getTextOutID();
                                }
                            }
                        }
                    }
                    GLMergeTextureFilter gLMergeTextureFilter11 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter11.f208898d[i9] = i;
                    gLMergeTextureFilter11.f208899e[i9] = i2;
                    gLMergeTextureFilter11.f208900f[i9] = i3;
                    gLMergeTextureFilter11.f208901g[i9] = i4;
                    gLMergeTextureFilter11.f208902i[i9] = i5;
                    gLMergeTextureFilter11.f208909o[i9] = true;
                } else {
                    GLMergeTextureFilter gLMergeTextureFilter12 = GLMergeTextureFilter.this;
                    gLMergeTextureFilter12.f208898d[0] = i;
                    gLMergeTextureFilter12.f208899e[0] = i2;
                    gLMergeTextureFilter12.f208900f[0] = i3;
                    gLMergeTextureFilter12.f208901g[0] = i4;
                    gLMergeTextureFilter12.f208902i[0] = i5;
                    gLMergeTextureFilter12.f208909o[i9] = true;
                }
                long j3 = j;
                if (i9 != -1) {
                    t9c.m189745c("mergeFilter", "----pos: " + j3 + ", s" + i9 + "Pos[" + GLMergeTextureFilter.this.f208898d[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208899e[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208900f[i9] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208901g[i9] + "],fsi:" + GLMergeTextureFilter.this.f208920z + ", svn:" + GLMergeTextureFilter.this.f208918x);
                    return;
                }
                StringBuilder sb = new StringBuilder("----pos: ");
                sb.append(j3);
                sb.append(", s");
                sb.append(GLMergeTextureFilter.this.f208918x - 1);
                sb.append("Pos[");
                GLMergeTextureFilter gLMergeTextureFilter13 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter13.f208898d[gLMergeTextureFilter13.f208918x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter14 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter14.f208899e[gLMergeTextureFilter14.f208918x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter15 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter15.f208900f[gLMergeTextureFilter15.f208918x - 1]);
                sb.append(Constants.SEPARATOR_COMMA);
                GLMergeTextureFilter gLMergeTextureFilter16 = GLMergeTextureFilter.this;
                sb.append(gLMergeTextureFilter16.f208901g[gLMergeTextureFilter16.f208918x - 1]);
                sb.append("],fsi:");
                sb.append(GLMergeTextureFilter.this.f208920z);
                sb.append(", svn:");
                sb.append(GLMergeTextureFilter.this.f208918x);
                sb.append(", ind=");
                sb.append(i9);
                t9c.m189745c("mergeFilter", sb.toString());
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public void m223310z2(final long j, final int i, final int i2, final int i3, final int i4) {
        t9c.m189745c("mergeFilter", "----size(S): " + j + ", [" + i + Constants.SEPARATOR_COMMA + i2 + "],changed=" + i3 + " fsi:" + this.f208920z + ", svn:" + this.f208918x + "type" + i4);
        if (j > 9 || j <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            m223300o2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilter.8
                @Override // java.lang.Runnable
                public void run() {
                    GLMergeTextureFilter gLMergeTextureFilter;
                    int i5;
                    int i6 = 1;
                    while (true) {
                        gLMergeTextureFilter = GLMergeTextureFilter.this;
                        i5 = gLMergeTextureFilter.f208918x;
                        if (i6 >= i5) {
                            i6 = -1;
                            break;
                        } else if (j == gLMergeTextureFilter.f208915t[i6]) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 == -1) {
                        if (i5 >= 9) {
                            t9c.m189745c("mergeFilter", "----size: svn[" + GLMergeTextureFilter.this.f208918x + "] over max=9!!!!");
                            return;
                        }
                        gLMergeTextureFilter.f208910p[i5] = i;
                        gLMergeTextureFilter.f208912q[i5] = i2;
                        gLMergeTextureFilter.f208913r[i5] = i4;
                        gLMergeTextureFilter.f208915t[i5] = j;
                        gLMergeTextureFilter.f208918x = i5 + 1;
                        StringBuilder sb = new StringBuilder("----size: ");
                        sb.append(j);
                        sb.append(", size[");
                        GLMergeTextureFilter gLMergeTextureFilter2 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter2.f208910p[gLMergeTextureFilter2.f208918x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter3 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter3.f208912q[gLMergeTextureFilter3.f208918x - 1]);
                        sb.append("], O:");
                        GLMergeTextureFilter gLMergeTextureFilter4 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter4.f208914s[gLMergeTextureFilter4.f208918x - 1]);
                        sb.append(", s");
                        sb.append(GLMergeTextureFilter.this.f208918x - 1);
                        sb.append("Pos[");
                        GLMergeTextureFilter gLMergeTextureFilter5 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter5.f208898d[gLMergeTextureFilter5.f208918x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter6 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter6.f208899e[gLMergeTextureFilter6.f208918x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter7 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter7.f208900f[gLMergeTextureFilter7.f208918x - 1]);
                        sb.append(Constants.SEPARATOR_COMMA);
                        GLMergeTextureFilter gLMergeTextureFilter8 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter8.f208901g[gLMergeTextureFilter8.f208918x - 1]);
                        sb.append("],fsi:");
                        sb.append(GLMergeTextureFilter.this.f208920z);
                        sb.append(", svn:");
                        sb.append(GLMergeTextureFilter.this.f208918x);
                        sb.append(", ind=");
                        sb.append(i6);
                        sb.append("type");
                        GLMergeTextureFilter gLMergeTextureFilter9 = GLMergeTextureFilter.this;
                        sb.append(gLMergeTextureFilter9.f208913r[gLMergeTextureFilter9.f208918x - 1]);
                        t9c.m189745c("mergeFilter", sb.toString());
                        return;
                    }
                    if (gLMergeTextureFilter.f208910p[i6] != i || gLMergeTextureFilter.f208912q[i6] != i2) {
                        t9c.m189745c("mergeFilter", "----size[changed]: ID[" + j + "], size[" + GLMergeTextureFilter.this.f208910p[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208912q[i6] + "]--->[" + i + Constants.SEPARATOR_COMMA + i2 + "], fsi:" + GLMergeTextureFilter.this.f208920z + ", svn:" + GLMergeTextureFilter.this.f208918x + ",ind=" + i6);
                        GLMergeTextureFilter gLMergeTextureFilter10 = GLMergeTextureFilter.this;
                        gLMergeTextureFilter10.f208910p[i6] = i;
                        gLMergeTextureFilter10.f208912q[i6] = i2;
                        int[] iArr = gLMergeTextureFilter10.f208913r;
                        int i7 = i4;
                        iArr[i6] = i7;
                        if (i7 == 2 || i7 == 3 || i7 == 8 || i7 == 9 || i3 != 1) {
                            gLMergeTextureFilter10.f208880L = 0;
                        } else {
                            gLMergeTextureFilter10.f208880L = 40;
                        }
                    }
                    t9c.m189745c("mergeFilter", "----size: " + j + ", len=" + GLMergeTextureFilter.this.f208880L + ", size[" + GLMergeTextureFilter.this.f208910p[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208912q[i6] + "], O:" + GLMergeTextureFilter.this.f208914s[i6] + ", s" + i6 + "Pos[" + GLMergeTextureFilter.this.f208898d[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208899e[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208900f[i6] + Constants.SEPARATOR_COMMA + GLMergeTextureFilter.this.f208901g[i6] + "],fsi:" + GLMergeTextureFilter.this.f208920z + ", svn:" + GLMergeTextureFilter.this.f208918x + ", ind=" + i6 + ", type=" + GLMergeTextureFilter.this.f208913r[i6]);
                }
            });
            return;
        }
        for (int i5 = 1; i5 < this.f208918x; i5++) {
            if (j == this.f208915t[i5] && !this.f208909o[i5]) {
                this.f208910p[i5] = -1;
                this.f208912q[i5] = -1;
                this.f208913r[i5] = 0;
            }
        }
    }
}
