package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import p149l.jcj;
import p149l.mcj;
import p149l.n8c;
import p149l.rbj;
import p149l.vbj;
import p149l.ysf;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMergeTextureFilterManager extends mcj implements jcj {

    /* JADX INFO: renamed from: A */
    private boolean f208031A;

    /* JADX INFO: renamed from: B */
    private int f208032B;

    /* JADX INFO: renamed from: C */
    private int f208033C;

    /* JADX INFO: renamed from: D */
    private AidSource.FirstFrameDrawCallback f208034D;

    /* JADX INFO: renamed from: E */
    private long f208035E;

    /* JADX INFO: renamed from: F */
    private boolean f208036F;

    /* JADX INFO: renamed from: G */
    private int f208037G;

    /* JADX INFO: renamed from: H */
    private int f208038H;

    /* JADX INFO: renamed from: I */
    private int f208039I;

    /* JADX INFO: renamed from: a */
    private vbj f208051a;

    /* JADX INFO: renamed from: e */
    private int f208055e;

    /* JADX INFO: renamed from: f */
    private int f208056f;

    /* JADX INFO: renamed from: n */
    private int f208063n;

    /* JADX INFO: renamed from: o */
    private int f208064o;

    /* JADX INFO: renamed from: p */
    private boolean f208065p;

    /* JADX INFO: renamed from: q */
    private int f208066q;

    /* JADX INFO: renamed from: r */
    private int f208067r;

    /* JADX INFO: renamed from: s */
    private int f208068s;

    /* JADX INFO: renamed from: t */
    private int f208069t;

    /* JADX INFO: renamed from: u */
    private int f208070u;

    /* JADX INFO: renamed from: v */
    private int f208071v;

    /* JADX INFO: renamed from: x */
    private int f208072x;

    /* JADX INFO: renamed from: y */
    private int f208073y;

    /* JADX INFO: renamed from: z */
    private int f208074z;

    /* JADX INFO: renamed from: b */
    private int f208052b = 640;

    /* JADX INFO: renamed from: c */
    private int f208053c = 352;

    /* JADX INFO: renamed from: d */
    private int f208054d = -1;

    /* JADX INFO: renamed from: g */
    private boolean f208057g = false;

    /* JADX INFO: renamed from: J */
    private float f208040J = 0.0f;

    /* JADX INFO: renamed from: K */
    private float f208041K = 0.0f;

    /* JADX INFO: renamed from: L */
    private float f208042L = 1.0f;

    /* JADX INFO: renamed from: M */
    private FloatBuffer[] f208043M = new FloatBuffer[4];

    /* JADX INFO: renamed from: N */
    private float[] f208044N = new float[8];

    /* JADX INFO: renamed from: O */
    private float[] f208045O = new float[8];

    /* JADX INFO: renamed from: P */
    private float[] f208046P = new float[8];

    /* JADX INFO: renamed from: Q */
    private float[] f208047Q = new float[8];

    /* JADX INFO: renamed from: T */
    private Map f208050T = new HashMap();

    /* JADX INFO: renamed from: R */
    private final Queue<Runnable> f208048R = new LinkedList();

    /* JADX INFO: renamed from: S */
    private final Queue<Runnable> f208049S = new LinkedList();

    /* JADX INFO: renamed from: i */
    private int f208058i = -1;

    /* JADX INFO: renamed from: j */
    private int f208059j = -1;

    /* JADX INFO: renamed from: l */
    private int f208061l = -1;

    /* JADX INFO: renamed from: k */
    private int f208060k = -1;

    /* JADX INFO: renamed from: m */
    private int f208062m = -1;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager$6 */
    class RunnableC224726 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f208096a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f208097b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ GLMergeTextureFilterManager f208098c;

        @Override // java.lang.Runnable
        public void run() {
            GLMulViewTextureFilter gLMulViewTextureFilter;
            if (this.f208098c.f208050T == null || !this.f208098c.f208050T.containsKey(Long.valueOf(this.f208096a)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208098c.f208050T.get(Long.valueOf(this.f208096a))) == null) {
                return;
            }
            gLMulViewTextureFilter.m222122d2(this.f208097b);
        }
    }

    public GLMergeTextureFilterManager(vbj vbjVar) {
        this.f208065p = false;
        this.f208035E = 0L;
        this.f208036F = false;
        this.f208051a = vbjVar;
        this.f208065p = false;
        this.f208035E = 0L;
        this.f208036F = false;
    }

    private void drawIndeed() {
        if (this.texture_in <= 0) {
            n8c.m158485c("mergeFilterManager", "draw: " + this.texture_in);
            return;
        }
        int iM222085o2 = this.f208069t;
        int i = this.f208064o;
        if (i == 2) {
            iM222085o2 = m222084n2();
        } else if (i == 1) {
            iM222085o2 = m222085o2();
        }
        GLES20.glViewport(this.f208068s, iM222085o2, this.f208070u, this.f208071v);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        this.f208031A = true;
    }

    /* JADX INFO: renamed from: l2 */
    private void m222082l2(int i, int i2, float f) {
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
        m222089y2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: m2 */
    private void m222083m2(int i, int i2, int i3, int i4) {
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
        m222089y2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: n2 */
    private int m222084n2() {
        int i;
        int i2;
        int i3;
        this.f208040J = 0.0f;
        this.f208041K = 0.0f;
        int i4 = this.f208072x;
        if (i4 == 1) {
            int i5 = this.f208067r;
            int i6 = this.f208066q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f208070u * 1.0f) / this.f208071v;
            if (f2 != f) {
                m222082l2(i6, i5, f2);
            } else {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m222083m2(this.f208066q, this.f208067r, getHeight(), getWidth());
                return this.f208069t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f208073y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f208067r;
                int i9 = this.f208066q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f208071v * 1.0f) / this.f208070u;
                if (f4 != f3) {
                    m222082l2(i9, i8, f4);
                } else {
                    m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f208040J = 1.0f / this.f208066q;
                this.f208041K = 1.0f / this.f208067r;
            }
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        } else {
            if (!this.f208065p) {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208069t;
            }
            m222082l2(this.f208066q, this.f208067r, (this.f208070u * 1.0f) / this.f208071v);
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: o2 */
    private int m222085o2() {
        int i;
        int i2;
        int i3;
        this.f208040J = 0.0f;
        this.f208041K = 0.0f;
        int i4 = this.f208072x;
        if (i4 == 1) {
            int i5 = this.f208067r;
            int i6 = this.f208066q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f208071v * 1.0f) / this.f208070u;
            if (f2 != f) {
                m222082l2(i6, i5, f2);
            } else {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m222083m2(this.f208066q, this.f208067r, getWidth(), getHeight());
                return this.f208069t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f208073y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f208067r;
                int i9 = this.f208066q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f208071v * 1.0f) / this.f208070u;
                if (f4 != f3) {
                    m222082l2(i9, i8, f4);
                } else {
                    m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f208040J = 1.0f / this.f208066q;
                this.f208041K = 1.0f / this.f208067r;
            }
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        } else {
            if (!this.f208065p) {
                m222089y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208069t;
            }
            m222082l2(this.f208066q, this.f208067r, (this.f208071v * 1.0f) / this.f208070u);
            i = this.f208052b;
            i2 = this.f208069t;
            i3 = this.f208071v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: p2 */
    private int m222086p2() {
        int i = this.curRotation;
        int i2 = this.f208072x;
        if (i2 == 2) {
            return i;
        }
        if (i2 == 1) {
            return i + 3;
        }
        return i2 == 3 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: q2 */
    private int m222087q2() {
        int i = this.curRotation;
        int i2 = this.f208054d;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: s2 */
    private void m222088s2(Queue<Runnable> queue) {
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

    /* JADX INFO: renamed from: y2 */
    private void m222089y2(float f, float f2, float f3, float f4) {
        float[] fArr = this.f208044N;
        if (fArr != null) {
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f208043M;
            if (floatBufferArr != null) {
                floatBufferArr[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208043M[0].put(this.f208044N).position(0);
            }
        }
        float[] fArr2 = this.f208045O;
        if (fArr2 != null) {
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f208043M;
            if (floatBufferArr2 != null) {
                floatBufferArr2[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208043M[1].put(this.f208045O).position(0);
            }
        }
        float[] fArr3 = this.f208046P;
        if (fArr3 != null) {
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f208043M;
            if (floatBufferArr3 != null) {
                floatBufferArr3[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208043M[2].put(this.f208046P).position(0);
            }
        }
        float[] fArr4 = this.f208047Q;
        if (fArr4 != null) {
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f208043M;
            if (floatBufferArr4 != null) {
                floatBufferArr4[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208043M[3].put(this.f208047Q).position(0);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m222090A2(int i) {
        n8c.m158483a("mergeFilterManager", "@@@ setScreenSourcesInputAngle: " + this.f208054d + "-->" + i);
        this.f208054d = i;
    }

    /* JADX INFO: renamed from: B2 */
    public void m222091B2(final long j, final float f, final float f2, final float f3, final float f4, final int i) {
        n8c.m158485c("mergeFilterManager", "@@@ setSubViewPort: id[" + j + "]; view[" + f + Constants.SEPARATOR_COMMA + f2 + Constants.SEPARATOR_COMMA + f3 + Constants.SEPARATOR_COMMA + f4 + "], z=" + i);
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.2
            /* JADX WARN: Code duplicated, block: B:15:0x004a  */
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                int i2;
                int i3;
                int i4;
                float f5;
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                float f6 = f3;
                if (f6 > 1.0f) {
                    f5 = f4;
                    if (f5 <= 1.0f) {
                        i2 = (int) (GLMergeTextureFilterManager.this.f208053c * f);
                        i3 = (int) (GLMergeTextureFilterManager.this.f208052b * f2);
                        i4 = (int) (GLMergeTextureFilterManager.this.f208053c * f3);
                        f5 = GLMergeTextureFilterManager.this.f208052b * f4;
                    } else {
                        i2 = (int) f;
                        i3 = (int) f2;
                        i4 = (int) f6;
                    }
                } else {
                    i2 = (int) (GLMergeTextureFilterManager.this.f208053c * f);
                    i3 = (int) (GLMergeTextureFilterManager.this.f208052b * f2);
                    i4 = (int) (GLMergeTextureFilterManager.this.f208053c * f3);
                    f5 = GLMergeTextureFilterManager.this.f208052b * f4;
                }
                int i5 = (int) f5;
                int i6 = i3;
                int i7 = i4;
                int iM222121c2 = gLMulViewTextureFilter.m222121c2();
                if (GLMergeTextureFilterManager.this.f208035E != j || !GLMergeTextureFilterManager.this.f208036F) {
                    n8c.m158483a("mergeFilterManager", "@@@ setSubViewPort: E id[" + j + "]; view[" + i2 + Constants.SEPARATOR_COMMA + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i5 + "], z=" + i + "/" + iM222121c2 + ", sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
                    gLMulViewTextureFilter.m222127j2(i2, i6, i7, i5, i);
                    return;
                }
                GLMergeTextureFilterManager.this.f208058i = i2;
                GLMergeTextureFilterManager.this.f208059j = i6;
                GLMergeTextureFilterManager.this.f208061l = i7;
                GLMergeTextureFilterManager.this.f208060k = i5;
                GLMergeTextureFilterManager.this.f208062m = i;
                n8c.m158483a("mergeFilterManager", "@@@ setSubViewPort: E id[anchor], view[" + i2 + Constants.SEPARATOR_COMMA + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i5 + "], z=" + i + "/" + iM222121c2 + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m222092C2(final long j, final int i, final int i2) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.7
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                n8c.m158483a("mergeFilterManager", "@@@ sizeSubView: id[" + j + "], width=" + i + ", height=" + i2 + ", sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
                gLMulViewTextureFilter.m222125h2(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    public void m222093D2(int i) {
        Map map = this.f208050T;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.f208050T.entrySet().iterator();
        while (it.hasNext()) {
            GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208050T.get((Long) ((Map.Entry) it.next()).getKey());
            if (gLMulViewTextureFilter != null) {
                long jM222116X1 = gLMulViewTextureFilter.m222116X1();
                this.f208066q = gLMulViewTextureFilter.m222115W1();
                this.f208067r = gLMulViewTextureFilter.m222114V1();
                this.f208068s = gLMulViewTextureFilter.m222119a2();
                this.f208069t = gLMulViewTextureFilter.m222120b2();
                this.f208070u = gLMulViewTextureFilter.m222118Z1();
                this.f208071v = gLMulViewTextureFilter.m222117Y1();
                gLMulViewTextureFilter.drawFrame();
                this.texture_in = gLMulViewTextureFilter.m222112T1();
                int iM222121c2 = gLMulViewTextureFilter.m222121c2();
                this.f208074z = iM222121c2;
                if (iM222121c2 == 1 && i == 1) {
                    this.f208072x = 4;
                    this.f208033C++;
                } else if (iM222121c2 == 0 && i == 0) {
                    this.f208072x = 3;
                    this.f208032B++;
                }
                this.f208073y = gLMulViewTextureFilter.m222113U1();
                this.f208034D = gLMulViewTextureFilter.m222110R1();
                this.f208031A = false;
                if (this.f208074z == i) {
                    onDrawFrame();
                    if (this.f208031A && this.f208034D != null && !gLMulViewTextureFilter.m222111S1()) {
                        n8c.m158485c("mergeFilterManager", "newTextureReady: userid=" + jM222116X1 + "; first frame render finish");
                        this.f208034D.mo222226a();
                        gLMulViewTextureFilter.m222124g2(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m222094E2(final long j, final boolean z) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.5
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                String str;
                String str2;
                n8c.m158483a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], full=" + z);
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                int iM222119a2 = gLMulViewTextureFilter.m222119a2();
                int iM222120b2 = gLMulViewTextureFilter.m222120b2();
                int iM222118Z1 = gLMulViewTextureFilter.m222118Z1();
                int iM222117Y1 = gLMulViewTextureFilter.m222117Y1();
                int iM222121c2 = gLMulViewTextureFilter.m222121c2();
                n8c.m158483a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], view[" + iM222119a2 + Constants.SEPARATOR_COMMA + iM222120b2 + Constants.SEPARATOR_COMMA + iM222118Z1 + Constants.SEPARATOR_COMMA + iM222117Y1 + "]; z=" + iM222121c2 + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
                StringBuilder sb = new StringBuilder("@@@ switchFullScreen: anchor view[");
                sb.append(GLMergeTextureFilterManager.this.f208058i);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208059j);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208061l);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208060k);
                sb.append("]; z=");
                sb.append(GLMergeTextureFilterManager.this.f208062m);
                n8c.m158483a("mergeFilterManager", sb.toString());
                boolean z2 = z;
                GLMergeTextureFilterManager gLMergeTextureFilterManager = GLMergeTextureFilterManager.this;
                if (!z2) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    if (gLMergeTextureFilterManager.f208035E == j && GLMergeTextureFilterManager.this.f208036F) {
                        GLMergeTextureFilterManager.this.f208035E = 0L;
                        GLMergeTextureFilterManager.this.f208036F = false;
                        gLMulViewTextureFilter.m222127j2(GLMergeTextureFilterManager.this.f208058i, GLMergeTextureFilterManager.this.f208059j, GLMergeTextureFilterManager.this.f208061l, GLMergeTextureFilterManager.this.f208060k, GLMergeTextureFilterManager.this.f208062m);
                        GLMergeTextureFilterManager.this.f208058i = iM222119a2;
                        GLMergeTextureFilterManager.this.f208059j = iM222120b2;
                        GLMergeTextureFilterManager.this.f208061l = iM222118Z1;
                        GLMergeTextureFilterManager.this.f208060k = iM222117Y1;
                        GLMergeTextureFilterManager.this.f208062m = iM222121c2;
                    }
                } else if (gLMergeTextureFilterManager.f208035E == j && GLMergeTextureFilterManager.this.f208036F) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                } else {
                    GLMergeTextureFilterManager.this.f208035E = j;
                    GLMergeTextureFilterManager.this.f208036F = true;
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    gLMulViewTextureFilter.m222127j2(GLMergeTextureFilterManager.this.f208058i, GLMergeTextureFilterManager.this.f208059j, GLMergeTextureFilterManager.this.f208061l, GLMergeTextureFilterManager.this.f208060k, GLMergeTextureFilterManager.this.f208062m);
                    GLMergeTextureFilterManager.this.f208058i = iM222119a2;
                    GLMergeTextureFilterManager.this.f208059j = iM222120b2;
                    GLMergeTextureFilterManager.this.f208061l = iM222118Z1;
                    GLMergeTextureFilterManager.this.f208060k = iM222117Y1;
                    GLMergeTextureFilterManager.this.f208062m = iM222121c2;
                }
                String str3 = str;
                n8c.m158483a(str3, "@@@ switchFullScreen: E id[" + j + "], view[" + iM222119a2 + Constants.SEPARATOR_COMMA + iM222120b2 + Constants.SEPARATOR_COMMA + iM222118Z1 + Constants.SEPARATOR_COMMA + iM222117Y1 + "]; z=" + iM222121c2 + str2 + GLMergeTextureFilterManager.this.f208050T.size());
                StringBuilder sb2 = new StringBuilder("@@@ switchFullScreen: E anchor view[");
                sb2.append(GLMergeTextureFilterManager.this.f208058i);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208059j);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208061l);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208060k);
                sb2.append("]; z=");
                sb2.append(GLMergeTextureFilterManager.this.f208062m);
                n8c.m158483a(str3, sb2.toString());
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public void m222095F2(final long j, final int i, final SurfaceTexture surfaceTexture) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.4
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m222128k2(i, surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: G2 */
    public void m222096G2(final long j, final Bitmap bitmap) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.3
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m222129l2(bitmap);
            }
        });
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        n8c.m158485c("mergeFilterManager", "destroy(S)");
        m222100k2();
        super.destroy();
        Queue<Runnable> queue = this.f208048R;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f208049S;
        if (queue2 != null) {
            queue2.clear();
        }
        n8c.m158485c("mergeFilterManager", "destroy");
    }

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer != null) {
            z = false;
        } else {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.m158485c("mergeFilterManager", "drawFrame: 1 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            n8c.m158483a("mergeFilterManager", "drawFrame: 1 " + this.glFrameBuffer);
            initFBO();
            z = true;
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m178609h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.m158485c("mergeFilterManager", "drawFrame: 2 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            n8c.m158483a("mergeFilterManager", "drawFrame: 2, " + z + Constants.SEPARATOR_COMMA + this.glFrameBuffer);
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m178609h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (sizeInverse.x != 0.0 && sizeInverse.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(- sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
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
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float clearScreen; \nuniform float widthInverse; \nuniform float heightInverse; \nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main() {\nclear_image = clearScreen; \nsizeInverse = vec2(widthInverse, heightInverse); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: h2 */
    public void m222097h2(final long j, final int i, final int i2) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f208050T != null) {
                    n8c.m158485c("mergeFilterManager", "@@@ addSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size() + ",source=" + i + "; display=" + i2);
                    if (!GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j))) {
                        GLMulViewTextureFilter gLMulViewTextureFilter = new GLMulViewTextureFilter(GLMergeTextureFilterManager.this.f208053c, GLMergeTextureFilterManager.this.f208052b, i, i2);
                        n8c.m158483a("mergeFilterManager", "@@@ addSubView: add sub, userid=" + j + "; sources:" + i + "; display=" + i2);
                        gLMulViewTextureFilter.m222126i2(j);
                        GLMergeTextureFilterManager.this.f208050T.put(Long.valueOf(j), gLMulViewTextureFilter);
                    } else if (GLMergeTextureFilterManager.this.f208050T != null && GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j))) {
                        n8c.m158485c("mergeFilterManager", "@@@ addSubView: 同一个userID(" + j + ")未释放又创建");
                        GLMulViewTextureFilter gLMulViewTextureFilter2 = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j));
                        if (gLMulViewTextureFilter2 != null) {
                            n8c.m158485c("mergeFilterManager", "@@@ addSubView: source[" + gLMulViewTextureFilter2.m222113U1() + "->" + i + "]; display[" + gLMulViewTextureFilter2.m222109Q1() + "->" + i2 + Constants.AES_SUFFIX);
                        }
                    }
                    n8c.m158485c("mergeFilterManager", "@@@ addSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
                }
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public void m222098i2(int i, int i2) {
        this.f208066q = this.f208055e;
        this.f208067r = this.f208056f;
        this.f208068s = this.f208058i;
        this.f208069t = this.f208059j;
        this.f208070u = this.f208061l;
        this.f208071v = this.f208060k;
        this.texture_in = i;
        if (i2 == 0 && this.f208062m == 0) {
            this.f208072x = 2;
            this.f208032B++;
        } else if (i2 == 1 && this.f208062m == 1) {
            this.f208072x = 1;
            this.f208033C++;
        }
        this.f208073y = -1;
        this.f208034D = null;
        this.f208031A = false;
        int i3 = this.f208062m;
        this.f208074z = i3;
        if (i3 == i2) {
            onDrawFrame();
        }
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        n8c.m158485c("mergeFilterManager", "init fbo: (" + getWidth() + Constants.SEPARATOR_COMMA + getHeight() + ")");
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m178603b(getWidth(), getHeight());
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
        this.f208037G = GLES20.glGetUniformLocation(this.programHandle, "clearScreen");
        this.f208038H = GLES20.glGetUniformLocation(this.programHandle, "widthInverse");
        this.f208039I = GLES20.glGetUniformLocation(this.programHandle, "heightInverse");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: j2 */
    public void m222099j2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.8
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j))) == null) {
                    return;
                }
                n8c.m158483a("mergeFilterManager", "@@@ callbackSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size() + ", cb=" + firstFrameDrawCallback);
                gLMulViewTextureFilter.m222123f2(firstFrameDrawCallback);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m222100k2() {
        if (this.f208050T != null) {
            n8c.m158483a("mergeFilterManager", "@@@ clearSubView: sub size=" + this.f208050T.size());
            Iterator it = this.f208050T.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208050T.get(l2);
                if (gLMulViewTextureFilter != null) {
                    n8c.m158483a("mergeFilterManager", "@@@ clearSubView: remove id[" + gLMulViewTextureFilter.m222116X1() + Constants.AES_SUFFIX);
                    gLMulViewTextureFilter.release();
                }
                this.f208050T.remove(l2);
            }
            n8c.m158483a("mergeFilterManager", "@@@ clearSubView: E sub size=" + this.f208050T.size());
            this.f208050T.clear();
        }
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Map map;
        m222088s2(this.f208048R);
        if (z) {
            markAsDirty();
        } else {
            n8c.m158485c("mergeFilterManager", "newTextureReady: newfata=" + z + ", dirty=" + this.dirty);
        }
        int width = mcjVar.getWidth();
        int height = mcjVar.getHeight();
        if (!this.f208057g || width != this.f208055e || height != this.f208056f) {
            this.f208055e = width;
            this.f208056f = height;
            this.f208057g = true;
        }
        this.f208032B = 0;
        m222098i2(i, 0);
        m222093D2(0);
        int i2 = this.f208032B;
        if (i2 == 0) {
            n8c.m158485c("mergeFilterManager", "newTextureReady: no find zoder zero");
        } else if (i2 > 1) {
            n8c.m158485c("mergeFilterManager", "newTextureReady: find " + this.f208032B + " zoder zero");
        }
        if (this.f208065p && this.f208032B == 0) {
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        this.f208033C = 0;
        m222098i2(i, 1);
        m222093D2(1);
        if (this.f208033C == 0 && (map = this.f208050T) != null && map.size() > 0) {
            n8c.m158485c("mergeFilterManager", "newTextureReady: " + this.f208033C + " < " + this.f208050T.size());
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    rbj rbjVar = this.glFrameBuffer;
                    if (rbjVar != null) {
                        jcjVar.newTextureReady(rbjVar.m178610i()[0], this, z);
                    } else {
                        n8c.m158485c("mergeFilterManager", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mcjVar.unlockRenderBuffer();
        m222088s2(this.f208049S);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        int iM222087q2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f208037G, this.f208042L);
        GLES20.glUniform1f(this.f208038H, this.f208040J);
        GLES20.glUniform1f(this.f208039I, this.f208041K);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f208064o;
        if (i == 2) {
            iM222087q2 = m222086p2();
        } else if (i == 1) {
            iM222087q2 = m222087q2();
        }
        int i2 = iM222087q2 % 4;
        this.f208043M[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f208043M[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public void m222101r2(final long j) {
        n8c.m158483a("mergeFilterManager", "@@@ removeSubView:id[" + j + Constants.AES_SUFFIX);
        m222102t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.9
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f208050T == null || !GLMergeTextureFilterManager.this.f208050T.containsKey(Long.valueOf(j))) {
                    return;
                }
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208050T.get(Long.valueOf(j));
                if (gLMulViewTextureFilter != null) {
                    n8c.m158483a("mergeFilterManager", "@@@ removeSubView: id[" + j + "]; switchID[" + GLMergeTextureFilterManager.this.f208035E + "]; status[" + GLMergeTextureFilterManager.this.f208036F + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
                    if (j == GLMergeTextureFilterManager.this.f208035E && GLMergeTextureFilterManager.this.f208036F) {
                        GLMergeTextureFilterManager.this.f208062m = gLMulViewTextureFilter.m222121c2();
                        GLMergeTextureFilterManager.this.f208058i = gLMulViewTextureFilter.m222119a2();
                        GLMergeTextureFilterManager.this.f208059j = gLMulViewTextureFilter.m222120b2();
                        GLMergeTextureFilterManager.this.f208061l = gLMulViewTextureFilter.m222118Z1();
                        GLMergeTextureFilterManager.this.f208060k = gLMulViewTextureFilter.m222117Y1();
                        GLMergeTextureFilterManager.this.f208036F = false;
                        GLMergeTextureFilterManager.this.f208035E = 0L;
                        n8c.m158485c("mergeFilterManager", "@@@ removeSubView: anchor view[" + GLMergeTextureFilterManager.this.f208058i + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208059j + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208061l + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208060k + "], z=" + GLMergeTextureFilterManager.this.f208062m);
                    }
                    GLMergeTextureFilterManager.this.f208050T.remove(Long.valueOf(j));
                    gLMulViewTextureFilter.release();
                }
                n8c.m158483a("mergeFilterManager", "@@@ removeSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208050T.size());
            }
        });
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        n8c.m158483a("mergeFilterManager", "setRenderSize:[" + this.f208053c + Constants.SEPARATOR_COMMA + this.f208052b + "]-->" + i + Constants.SEPARATOR_COMMA + i2);
        this.f208052b = i2;
        this.f208053c = i;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m222102t2(Runnable runnable) {
        synchronized (this.f208048R) {
            this.f208048R.add(runnable);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m222103u2(int i) {
        n8c.m158483a("mergeFilterManager", "@@@ setAnchorOutputOrient: " + this.f208064o + "-->" + i);
        this.f208064o = i;
    }

    /* JADX INFO: renamed from: v2 */
    public void m222104v2(boolean z) {
        n8c.m158485c("mergeFilterManager", "@@@ setAnchorSmallView: " + this.f208065p + "-->" + z);
        if (this.f208065p != z) {
            this.f208065p = z;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m222105w2(int i) {
        n8c.m158483a("mergeFilterManager", "@@@ setAnchorSourcesMode: " + this.f208063n + "-->" + i);
        this.f208063n = i;
    }

    /* JADX INFO: renamed from: x2 */
    public void m222106x2(int i, int i2, int i3, int i4, int i5) {
        GLMulViewTextureFilter gLMulViewTextureFilter;
        n8c.m158483a("mergeFilterManager", "@@@ setAnchorView: input view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5 + ",status=" + this.f208036F + ";ViewUserID=" + this.f208035E);
        StringBuilder sb = new StringBuilder("@@@ setAnchorView: history view[");
        sb.append(this.f208058i);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208059j);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208061l);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208060k);
        sb.append("], z=");
        sb.append(this.f208062m);
        n8c.m158483a("mergeFilterManager", sb.toString());
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            return;
        }
        long j = this.f208035E;
        if (j == 0 || !this.f208036F) {
            this.f208058i = i;
            this.f208059j = i2;
            this.f208061l = i3;
            this.f208060k = i4;
            this.f208062m = i5;
        } else {
            Map map = this.f208050T;
            if (map != null && map.containsKey(Long.valueOf(j)) && (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208050T.get(Long.valueOf(this.f208035E))) != null) {
                gLMulViewTextureFilter.m222127j2(i, i2, i3, i4, i5);
                n8c.m158483a("mergeFilterManager", "@@@ setAnchorView: set id[" + this.f208035E + "], view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5);
            }
        }
        n8c.m158483a("mergeFilterManager", "@@@ setAnchorView: result view[" + this.f208058i + Constants.SEPARATOR_COMMA + this.f208059j + Constants.SEPARATOR_COMMA + this.f208061l + Constants.SEPARATOR_COMMA + this.f208060k + "], z=" + this.f208062m);
    }

    /* JADX INFO: renamed from: z2 */
    public void m222107z2(int i, int i2) {
        n8c.m158483a("mergeFilterManager", "@@@ setOutputSize: [" + this.f208053c + Constants.SEPARATOR_COMMA + this.f208052b + "-->[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.AES_SUFFIX);
        this.f208052b = i2;
        this.f208053c = i;
    }
}
