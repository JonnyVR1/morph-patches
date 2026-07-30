package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import l.n8c;
import l.ysf;
import p003l.jcj;
import p003l.mcj;
import p003l.rbj;
import p003l.vbj;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GLMergeTextureFilterManager extends mcj implements jcj {

    /* JADX INFO: renamed from: A */
    private boolean f11656A;

    /* JADX INFO: renamed from: B */
    private int f11657B;

    /* JADX INFO: renamed from: C */
    private int f11658C;

    /* JADX INFO: renamed from: D */
    private AidSource.FirstFrameDrawCallback f11659D;

    /* JADX INFO: renamed from: E */
    private long f11660E;

    /* JADX INFO: renamed from: F */
    private boolean f11661F;

    /* JADX INFO: renamed from: G */
    private int f11662G;

    /* JADX INFO: renamed from: H */
    private int f11663H;

    /* JADX INFO: renamed from: I */
    private int f11664I;

    /* JADX INFO: renamed from: a */
    private vbj f11676a;

    /* JADX INFO: renamed from: e */
    private int f11680e;

    /* JADX INFO: renamed from: f */
    private int f11681f;

    /* JADX INFO: renamed from: n */
    private int f11688n;

    /* JADX INFO: renamed from: o */
    private int f11689o;

    /* JADX INFO: renamed from: p */
    private boolean f11690p;

    /* JADX INFO: renamed from: q */
    private int f11691q;

    /* JADX INFO: renamed from: r */
    private int f11692r;

    /* JADX INFO: renamed from: s */
    private int f11693s;

    /* JADX INFO: renamed from: t */
    private int f11694t;

    /* JADX INFO: renamed from: u */
    private int f11695u;

    /* JADX INFO: renamed from: v */
    private int f11696v;

    /* JADX INFO: renamed from: x */
    private int f11697x;

    /* JADX INFO: renamed from: y */
    private int f11698y;

    /* JADX INFO: renamed from: z */
    private int f11699z;

    /* JADX INFO: renamed from: b */
    private int f11677b = 640;

    /* JADX INFO: renamed from: c */
    private int f11678c = 352;

    /* JADX INFO: renamed from: d */
    private int f11679d = -1;

    /* JADX INFO: renamed from: g */
    private boolean f11682g = false;

    /* JADX INFO: renamed from: J */
    private float f11665J = 0.0f;

    /* JADX INFO: renamed from: K */
    private float f11666K = 0.0f;

    /* JADX INFO: renamed from: L */
    private float f11667L = 1.0f;

    /* JADX INFO: renamed from: M */
    private FloatBuffer[] f11668M = new FloatBuffer[4];

    /* JADX INFO: renamed from: N */
    private float[] f11669N = new float[8];

    /* JADX INFO: renamed from: O */
    private float[] f11670O = new float[8];

    /* JADX INFO: renamed from: P */
    private float[] f11671P = new float[8];

    /* JADX INFO: renamed from: Q */
    private float[] f11672Q = new float[8];

    /* JADX INFO: renamed from: T */
    private Map f11675T = new HashMap();

    /* JADX INFO: renamed from: R */
    private final Queue<Runnable> f11673R = new LinkedList();

    /* JADX INFO: renamed from: S */
    private final Queue<Runnable> f11674S = new LinkedList();

    /* JADX INFO: renamed from: i */
    private int f11683i = -1;

    /* JADX INFO: renamed from: j */
    private int f11684j = -1;

    /* JADX INFO: renamed from: l */
    private int f11686l = -1;

    /* JADX INFO: renamed from: k */
    private int f11685k = -1;

    /* JADX INFO: renamed from: m */
    private int f11687m = -1;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager$6 */
    class RunnableC12656 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f11721a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f11722b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ GLMergeTextureFilterManager f11723c;

        @Override // java.lang.Runnable
        public void run() {
            GLMulViewTextureFilter gLMulViewTextureFilter;
            if (this.f11723c.f11675T == null || !this.f11723c.f11675T.containsKey(Long.valueOf(this.f11721a)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f11723c.f11675T.get(Long.valueOf(this.f11721a))) == null) {
                return;
            }
            gLMulViewTextureFilter.m10593d2(this.f11722b);
        }
    }

    public GLMergeTextureFilterManager(vbj vbjVar) {
        this.f11690p = false;
        this.f11660E = 0L;
        this.f11661F = false;
        this.f11676a = vbjVar;
        this.f11690p = false;
        this.f11660E = 0L;
        this.f11661F = false;
    }

    private void drawIndeed() {
        if (this.texture_in <= 0) {
            n8c.c("mergeFilterManager", "draw: " + this.texture_in);
            return;
        }
        int iM10556o2 = this.f11694t;
        int i = this.f11689o;
        if (i == 2) {
            iM10556o2 = m10555n2();
        } else if (i == 1) {
            iM10556o2 = m10556o2();
        }
        GLES20.glViewport(this.f11693s, iM10556o2, this.f11695u, this.f11696v);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        this.f11656A = true;
    }

    /* JADX INFO: renamed from: l2 */
    private void m10553l2(int i, int i2, float f) {
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
        m10560y2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: m2 */
    private void m10554m2(int i, int i2, int i3, int i4) {
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
        m10560y2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: n2 */
    private int m10555n2() {
        int i;
        int i2;
        int i3;
        this.f11665J = 0.0f;
        this.f11666K = 0.0f;
        int i4 = this.f11697x;
        if (i4 == 1) {
            int i5 = this.f11692r;
            int i6 = this.f11691q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f11695u * 1.0f) / this.f11696v;
            if (f2 != f) {
                m10553l2(i6, i5, f2);
            } else {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m10554m2(this.f11691q, this.f11692r, getHeight(), getWidth());
                return this.f11694t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f11698y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f11692r;
                int i9 = this.f11691q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f11696v * 1.0f) / this.f11695u;
                if (f4 != f3) {
                    m10553l2(i9, i8, f4);
                } else {
                    m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f11665J = 1.0f / this.f11691q;
                this.f11666K = 1.0f / this.f11692r;
            }
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        } else {
            if (!this.f11690p) {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f11694t;
            }
            m10553l2(this.f11691q, this.f11692r, (this.f11695u * 1.0f) / this.f11696v);
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: o2 */
    private int m10556o2() {
        int i;
        int i2;
        int i3;
        this.f11665J = 0.0f;
        this.f11666K = 0.0f;
        int i4 = this.f11697x;
        if (i4 == 1) {
            int i5 = this.f11692r;
            int i6 = this.f11691q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f11696v * 1.0f) / this.f11695u;
            if (f2 != f) {
                m10553l2(i6, i5, f2);
            } else {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m10554m2(this.f11691q, this.f11692r, getWidth(), getHeight());
                return this.f11694t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f11698y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f11692r;
                int i9 = this.f11691q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f11696v * 1.0f) / this.f11695u;
                if (f4 != f3) {
                    m10553l2(i9, i8, f4);
                } else {
                    m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f11665J = 1.0f / this.f11691q;
                this.f11666K = 1.0f / this.f11692r;
            }
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        } else {
            if (!this.f11690p) {
                m10560y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f11694t;
            }
            m10553l2(this.f11691q, this.f11692r, (this.f11696v * 1.0f) / this.f11695u);
            i = this.f11677b;
            i2 = this.f11694t;
            i3 = this.f11696v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: p2 */
    private int m10557p2() {
        int i = this.curRotation;
        int i2 = this.f11697x;
        if (i2 == 2) {
            return i;
        }
        if (i2 == 1) {
            return i + 3;
        }
        return i2 == 3 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: q2 */
    private int m10558q2() {
        int i = this.curRotation;
        int i2 = this.f11679d;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: s2 */
    private void m10559s2(Queue<Runnable> queue) {
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
    private void m10560y2(float f, float f2, float f3, float f4) {
        float[] fArr = this.f11669N;
        if (fArr != null) {
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f11668M;
            if (floatBufferArr != null) {
                floatBufferArr[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f11668M[0].put(this.f11669N).position(0);
            }
        }
        float[] fArr2 = this.f11670O;
        if (fArr2 != null) {
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f11668M;
            if (floatBufferArr2 != null) {
                floatBufferArr2[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f11668M[1].put(this.f11670O).position(0);
            }
        }
        float[] fArr3 = this.f11671P;
        if (fArr3 != null) {
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f11668M;
            if (floatBufferArr3 != null) {
                floatBufferArr3[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f11668M[2].put(this.f11671P).position(0);
            }
        }
        float[] fArr4 = this.f11672Q;
        if (fArr4 != null) {
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f11668M;
            if (floatBufferArr4 != null) {
                floatBufferArr4[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f11668M[3].put(this.f11672Q).position(0);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m10561A2(int i) {
        n8c.a("mergeFilterManager", "@@@ setScreenSourcesInputAngle: " + this.f11679d + "-->" + i);
        this.f11679d = i;
    }

    /* JADX INFO: renamed from: B2 */
    public void m10562B2(final long j, final float f, final float f2, final float f3, final float f4, final int i) {
        n8c.c("mergeFilterManager", "@@@ setSubViewPort: id[" + j + "]; view[" + f + "," + f2 + "," + f3 + "," + f4 + "], z=" + i);
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.2
            /* JADX WARN: Code duplicated, block: B:15:0x004a  */
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                int i2;
                int i3;
                int i4;
                float f5;
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                float f6 = f3;
                if (f6 > 1.0f) {
                    f5 = f4;
                    if (f5 <= 1.0f) {
                        i2 = (int) (GLMergeTextureFilterManager.this.f11678c * f);
                        i3 = (int) (GLMergeTextureFilterManager.this.f11677b * f2);
                        i4 = (int) (GLMergeTextureFilterManager.this.f11678c * f3);
                        f5 = GLMergeTextureFilterManager.this.f11677b * f4;
                    } else {
                        i2 = (int) f;
                        i3 = (int) f2;
                        i4 = (int) f6;
                    }
                } else {
                    i2 = (int) (GLMergeTextureFilterManager.this.f11678c * f);
                    i3 = (int) (GLMergeTextureFilterManager.this.f11677b * f2);
                    i4 = (int) (GLMergeTextureFilterManager.this.f11678c * f3);
                    f5 = GLMergeTextureFilterManager.this.f11677b * f4;
                }
                int i5 = (int) f5;
                int i6 = i3;
                int i7 = i4;
                int iM10592c2 = gLMulViewTextureFilter.m10592c2();
                if (GLMergeTextureFilterManager.this.f11660E != j || !GLMergeTextureFilterManager.this.f11661F) {
                    n8c.a("mergeFilterManager", "@@@ setSubViewPort: E id[" + j + "]; view[" + i2 + "," + i6 + "," + i7 + "," + i5 + "], z=" + i + "/" + iM10592c2 + ", sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
                    gLMulViewTextureFilter.m10598j2(i2, i6, i7, i5, i);
                    return;
                }
                GLMergeTextureFilterManager.this.f11683i = i2;
                GLMergeTextureFilterManager.this.f11684j = i6;
                GLMergeTextureFilterManager.this.f11686l = i7;
                GLMergeTextureFilterManager.this.f11685k = i5;
                GLMergeTextureFilterManager.this.f11687m = i;
                n8c.a("mergeFilterManager", "@@@ setSubViewPort: E id[anchor], view[" + i2 + "," + i6 + "," + i7 + "," + i5 + "], z=" + i + "/" + iM10592c2 + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m10563C2(final long j, final int i, final int i2) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.7
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                n8c.a("mergeFilterManager", "@@@ sizeSubView: id[" + j + "], width=" + i + ", height=" + i2 + ", sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
                gLMulViewTextureFilter.m10596h2(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    public void m10564D2(int i) {
        Map map = this.f11675T;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.f11675T.entrySet().iterator();
        while (it.hasNext()) {
            GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f11675T.get((Long) ((Map.Entry) it.next()).getKey());
            if (gLMulViewTextureFilter != null) {
                long jM10587X1 = gLMulViewTextureFilter.m10587X1();
                this.f11691q = gLMulViewTextureFilter.m10586W1();
                this.f11692r = gLMulViewTextureFilter.m10585V1();
                this.f11693s = gLMulViewTextureFilter.m10590a2();
                this.f11694t = gLMulViewTextureFilter.m10591b2();
                this.f11695u = gLMulViewTextureFilter.m10589Z1();
                this.f11696v = gLMulViewTextureFilter.m10588Y1();
                gLMulViewTextureFilter.drawFrame();
                this.texture_in = gLMulViewTextureFilter.m10583T1();
                int iM10592c2 = gLMulViewTextureFilter.m10592c2();
                this.f11699z = iM10592c2;
                if (iM10592c2 == 1 && i == 1) {
                    this.f11697x = 4;
                    this.f11658C++;
                } else if (iM10592c2 == 0 && i == 0) {
                    this.f11697x = 3;
                    this.f11657B++;
                }
                this.f11698y = gLMulViewTextureFilter.m10584U1();
                this.f11659D = gLMulViewTextureFilter.m10581R1();
                this.f11656A = false;
                if (this.f11699z == i) {
                    onDrawFrame();
                    if (this.f11656A && this.f11659D != null && !gLMulViewTextureFilter.m10582S1()) {
                        n8c.c("mergeFilterManager", "newTextureReady: userid=" + jM10587X1 + "; first frame render finish");
                        this.f11659D.mo10697a();
                        gLMulViewTextureFilter.m10595g2(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m10565E2(final long j, final boolean z) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.5
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                String str;
                String str2;
                n8c.a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], full=" + z);
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                int iM10590a2 = gLMulViewTextureFilter.m10590a2();
                int iM10591b2 = gLMulViewTextureFilter.m10591b2();
                int iM10589Z1 = gLMulViewTextureFilter.m10589Z1();
                int iM10588Y1 = gLMulViewTextureFilter.m10588Y1();
                int iM10592c2 = gLMulViewTextureFilter.m10592c2();
                n8c.a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], view[" + iM10590a2 + "," + iM10591b2 + "," + iM10589Z1 + "," + iM10588Y1 + "]; z=" + iM10592c2 + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
                StringBuilder sb = new StringBuilder("@@@ switchFullScreen: anchor view[");
                sb.append(GLMergeTextureFilterManager.this.f11683i);
                sb.append(",");
                sb.append(GLMergeTextureFilterManager.this.f11684j);
                sb.append(",");
                sb.append(GLMergeTextureFilterManager.this.f11686l);
                sb.append(",");
                sb.append(GLMergeTextureFilterManager.this.f11685k);
                sb.append("]; z=");
                sb.append(GLMergeTextureFilterManager.this.f11687m);
                n8c.a("mergeFilterManager", sb.toString());
                boolean z2 = z;
                GLMergeTextureFilterManager gLMergeTextureFilterManager = GLMergeTextureFilterManager.this;
                if (!z2) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    if (gLMergeTextureFilterManager.f11660E == j && GLMergeTextureFilterManager.this.f11661F) {
                        GLMergeTextureFilterManager.this.f11660E = 0L;
                        GLMergeTextureFilterManager.this.f11661F = false;
                        gLMulViewTextureFilter.m10598j2(GLMergeTextureFilterManager.this.f11683i, GLMergeTextureFilterManager.this.f11684j, GLMergeTextureFilterManager.this.f11686l, GLMergeTextureFilterManager.this.f11685k, GLMergeTextureFilterManager.this.f11687m);
                        GLMergeTextureFilterManager.this.f11683i = iM10590a2;
                        GLMergeTextureFilterManager.this.f11684j = iM10591b2;
                        GLMergeTextureFilterManager.this.f11686l = iM10589Z1;
                        GLMergeTextureFilterManager.this.f11685k = iM10588Y1;
                        GLMergeTextureFilterManager.this.f11687m = iM10592c2;
                    }
                } else if (gLMergeTextureFilterManager.f11660E == j && GLMergeTextureFilterManager.this.f11661F) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                } else {
                    GLMergeTextureFilterManager.this.f11660E = j;
                    GLMergeTextureFilterManager.this.f11661F = true;
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    gLMulViewTextureFilter.m10598j2(GLMergeTextureFilterManager.this.f11683i, GLMergeTextureFilterManager.this.f11684j, GLMergeTextureFilterManager.this.f11686l, GLMergeTextureFilterManager.this.f11685k, GLMergeTextureFilterManager.this.f11687m);
                    GLMergeTextureFilterManager.this.f11683i = iM10590a2;
                    GLMergeTextureFilterManager.this.f11684j = iM10591b2;
                    GLMergeTextureFilterManager.this.f11686l = iM10589Z1;
                    GLMergeTextureFilterManager.this.f11685k = iM10588Y1;
                    GLMergeTextureFilterManager.this.f11687m = iM10592c2;
                }
                String str3 = str;
                n8c.a(str3, "@@@ switchFullScreen: E id[" + j + "], view[" + iM10590a2 + "," + iM10591b2 + "," + iM10589Z1 + "," + iM10588Y1 + "]; z=" + iM10592c2 + str2 + GLMergeTextureFilterManager.this.f11675T.size());
                StringBuilder sb2 = new StringBuilder("@@@ switchFullScreen: E anchor view[");
                sb2.append(GLMergeTextureFilterManager.this.f11683i);
                sb2.append(",");
                sb2.append(GLMergeTextureFilterManager.this.f11684j);
                sb2.append(",");
                sb2.append(GLMergeTextureFilterManager.this.f11686l);
                sb2.append(",");
                sb2.append(GLMergeTextureFilterManager.this.f11685k);
                sb2.append("]; z=");
                sb2.append(GLMergeTextureFilterManager.this.f11687m);
                n8c.a(str3, sb2.toString());
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public void m10566F2(final long j, final int i, final SurfaceTexture surfaceTexture) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.4
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m10599k2(i, surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: G2 */
    public void m10567G2(final long j, final Bitmap bitmap) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.3
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m10600l2(bitmap);
            }
        });
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        n8c.c("mergeFilterManager", "destroy(S)");
        m10571k2();
        super.destroy();
        Queue<Runnable> queue = this.f11673R;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f11674S;
        if (queue2 != null) {
            queue2.clear();
        }
        n8c.c("mergeFilterManager", "destroy");
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer != null) {
            z = false;
        } else {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.c("mergeFilterManager", "drawFrame: 1 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            n8c.a("mergeFilterManager", "drawFrame: 1 " + this.glFrameBuffer);
            initFBO();
            z = true;
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m7172h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                n8c.c("mergeFilterManager", "drawFrame: 2 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            n8c.a("mergeFilterManager", "drawFrame: 2, " + z + "," + this.glFrameBuffer);
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m7172h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (sizeInverse.x != 0.0 && sizeInverse.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(- sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
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
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float clearScreen; \nuniform float widthInverse; \nuniform float heightInverse; \nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main() {\nclear_image = clearScreen; \nsizeInverse = vec2(widthInverse, heightInverse); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: h2 */
    public void m10568h2(final long j, final int i, final int i2) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f11675T != null) {
                    n8c.c("mergeFilterManager", "@@@ addSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size() + ",source=" + i + "; display=" + i2);
                    if (!GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j))) {
                        GLMulViewTextureFilter gLMulViewTextureFilter = new GLMulViewTextureFilter(GLMergeTextureFilterManager.this.f11678c, GLMergeTextureFilterManager.this.f11677b, i, i2);
                        n8c.a("mergeFilterManager", "@@@ addSubView: add sub, userid=" + j + "; sources:" + i + "; display=" + i2);
                        gLMulViewTextureFilter.m10597i2(j);
                        GLMergeTextureFilterManager.this.f11675T.put(Long.valueOf(j), gLMulViewTextureFilter);
                    } else if (GLMergeTextureFilterManager.this.f11675T != null && GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j))) {
                        n8c.c("mergeFilterManager", "@@@ addSubView: 同一个userID(" + j + ")未释放又创建");
                        GLMulViewTextureFilter gLMulViewTextureFilter2 = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j));
                        if (gLMulViewTextureFilter2 != null) {
                            n8c.c("mergeFilterManager", "@@@ addSubView: source[" + gLMulViewTextureFilter2.m10584U1() + "->" + i + "]; display[" + gLMulViewTextureFilter2.m10580Q1() + "->" + i2 + "]");
                        }
                    }
                    n8c.c("mergeFilterManager", "@@@ addSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
                }
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public void m10569i2(int i, int i2) {
        this.f11691q = this.f11680e;
        this.f11692r = this.f11681f;
        this.f11693s = this.f11683i;
        this.f11694t = this.f11684j;
        this.f11695u = this.f11686l;
        this.f11696v = this.f11685k;
        this.texture_in = i;
        if (i2 == 0 && this.f11687m == 0) {
            this.f11697x = 2;
            this.f11657B++;
        } else if (i2 == 1 && this.f11687m == 1) {
            this.f11697x = 1;
            this.f11658C++;
        }
        this.f11698y = -1;
        this.f11659D = null;
        this.f11656A = false;
        int i3 = this.f11687m;
        this.f11699z = i3;
        if (i3 == i2) {
            onDrawFrame();
        }
    }

    @Override // p003l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m7169e();
        }
        n8c.c("mergeFilterManager", "init fbo: (" + getWidth() + "," + getHeight() + ")");
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m7166b(getWidth(), getHeight());
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
        this.f11662G = GLES20.glGetUniformLocation(this.programHandle, "clearScreen");
        this.f11663H = GLES20.glGetUniformLocation(this.programHandle, "widthInverse");
        this.f11664I = GLES20.glGetUniformLocation(this.programHandle, "heightInverse");
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: j2 */
    public void m10570j2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.8
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j))) == null) {
                    return;
                }
                n8c.a("mergeFilterManager", "@@@ callbackSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size() + ", cb=" + firstFrameDrawCallback);
                gLMulViewTextureFilter.m10594f2(firstFrameDrawCallback);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m10571k2() {
        if (this.f11675T != null) {
            n8c.a("mergeFilterManager", "@@@ clearSubView: sub size=" + this.f11675T.size());
            Iterator it = this.f11675T.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f11675T.get(l2);
                if (gLMulViewTextureFilter != null) {
                    n8c.a("mergeFilterManager", "@@@ clearSubView: remove id[" + gLMulViewTextureFilter.m10587X1() + "]");
                    gLMulViewTextureFilter.release();
                }
                this.f11675T.remove(l2);
            }
            n8c.a("mergeFilterManager", "@@@ clearSubView: E sub size=" + this.f11675T.size());
            this.f11675T.clear();
        }
    }

    @Override // p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Map map;
        m10559s2(this.f11673R);
        if (z) {
            markAsDirty();
        } else {
            n8c.c("mergeFilterManager", "newTextureReady: newfata=" + z + ", dirty=" + this.dirty);
        }
        int width = mcjVar.getWidth();
        int height = mcjVar.getHeight();
        if (!this.f11682g || width != this.f11680e || height != this.f11681f) {
            this.f11680e = width;
            this.f11681f = height;
            this.f11682g = true;
        }
        this.f11657B = 0;
        m10569i2(i, 0);
        m10564D2(0);
        int i2 = this.f11657B;
        if (i2 == 0) {
            n8c.c("mergeFilterManager", "newTextureReady: no find zoder zero");
        } else if (i2 > 1) {
            n8c.c("mergeFilterManager", "newTextureReady: find " + this.f11657B + " zoder zero");
        }
        if (this.f11690p && this.f11657B == 0) {
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        this.f11658C = 0;
        m10569i2(i, 1);
        m10564D2(1);
        if (this.f11658C == 0 && (map = this.f11675T) != null && map.size() > 0) {
            n8c.c("mergeFilterManager", "newTextureReady: " + this.f11658C + " < " + this.f11675T.size());
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    rbj rbjVar = this.glFrameBuffer;
                    if (rbjVar != null) {
                        jcjVar.newTextureReady(rbjVar.m7173i()[0], this, z);
                    } else {
                        n8c.c("mergeFilterManager", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mcjVar.unlockRenderBuffer();
        m10559s2(this.f11674S);
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        int iM10558q2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f11662G, this.f11667L);
        GLES20.glUniform1f(this.f11663H, this.f11665J);
        GLES20.glUniform1f(this.f11664I, this.f11666K);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f11689o;
        if (i == 2) {
            iM10558q2 = m10557p2();
        } else if (i == 1) {
            iM10558q2 = m10558q2();
        }
        int i2 = iM10558q2 % 4;
        this.f11668M[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f11668M[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public void m10572r2(final long j) {
        n8c.a("mergeFilterManager", "@@@ removeSubView:id[" + j + "]");
        m10573t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.9
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f11675T == null || !GLMergeTextureFilterManager.this.f11675T.containsKey(Long.valueOf(j))) {
                    return;
                }
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f11675T.get(Long.valueOf(j));
                if (gLMulViewTextureFilter != null) {
                    n8c.a("mergeFilterManager", "@@@ removeSubView: id[" + j + "]; switchID[" + GLMergeTextureFilterManager.this.f11660E + "]; status[" + GLMergeTextureFilterManager.this.f11661F + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
                    if (j == GLMergeTextureFilterManager.this.f11660E && GLMergeTextureFilterManager.this.f11661F) {
                        GLMergeTextureFilterManager.this.f11687m = gLMulViewTextureFilter.m10592c2();
                        GLMergeTextureFilterManager.this.f11683i = gLMulViewTextureFilter.m10590a2();
                        GLMergeTextureFilterManager.this.f11684j = gLMulViewTextureFilter.m10591b2();
                        GLMergeTextureFilterManager.this.f11686l = gLMulViewTextureFilter.m10589Z1();
                        GLMergeTextureFilterManager.this.f11685k = gLMulViewTextureFilter.m10588Y1();
                        GLMergeTextureFilterManager.this.f11661F = false;
                        GLMergeTextureFilterManager.this.f11660E = 0L;
                        n8c.c("mergeFilterManager", "@@@ removeSubView: anchor view[" + GLMergeTextureFilterManager.this.f11683i + "," + GLMergeTextureFilterManager.this.f11684j + "," + GLMergeTextureFilterManager.this.f11686l + "," + GLMergeTextureFilterManager.this.f11685k + "], z=" + GLMergeTextureFilterManager.this.f11687m);
                    }
                    GLMergeTextureFilterManager.this.f11675T.remove(Long.valueOf(j));
                    gLMulViewTextureFilter.release();
                }
                n8c.a("mergeFilterManager", "@@@ removeSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f11675T.size());
            }
        });
    }

    @Override // p003l.ccj
    public void setRenderSize(int i, int i2) {
        n8c.a("mergeFilterManager", "setRenderSize:[" + this.f11678c + "," + this.f11677b + "]-->" + i + "," + i2);
        this.f11677b = i2;
        this.f11678c = i;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m10573t2(Runnable runnable) {
        synchronized (this.f11673R) {
            this.f11673R.add(runnable);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m10574u2(int i) {
        n8c.a("mergeFilterManager", "@@@ setAnchorOutputOrient: " + this.f11689o + "-->" + i);
        this.f11689o = i;
    }

    /* JADX INFO: renamed from: v2 */
    public void m10575v2(boolean z) {
        n8c.c("mergeFilterManager", "@@@ setAnchorSmallView: " + this.f11690p + "-->" + z);
        if (this.f11690p != z) {
            this.f11690p = z;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m10576w2(int i) {
        n8c.a("mergeFilterManager", "@@@ setAnchorSourcesMode: " + this.f11688n + "-->" + i);
        this.f11688n = i;
    }

    /* JADX INFO: renamed from: x2 */
    public void m10577x2(int i, int i2, int i3, int i4, int i5) {
        GLMulViewTextureFilter gLMulViewTextureFilter;
        n8c.a("mergeFilterManager", "@@@ setAnchorView: input view[" + i + "," + i2 + "," + i3 + "," + i4 + "], z=" + i5 + ",status=" + this.f11661F + ";ViewUserID=" + this.f11660E);
        StringBuilder sb = new StringBuilder("@@@ setAnchorView: history view[");
        sb.append(this.f11683i);
        sb.append(",");
        sb.append(this.f11684j);
        sb.append(",");
        sb.append(this.f11686l);
        sb.append(",");
        sb.append(this.f11685k);
        sb.append("], z=");
        sb.append(this.f11687m);
        n8c.a("mergeFilterManager", sb.toString());
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            return;
        }
        long j = this.f11660E;
        if (j == 0 || !this.f11661F) {
            this.f11683i = i;
            this.f11684j = i2;
            this.f11686l = i3;
            this.f11685k = i4;
            this.f11687m = i5;
        } else {
            Map map = this.f11675T;
            if (map != null && map.containsKey(Long.valueOf(j)) && (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f11675T.get(Long.valueOf(this.f11660E))) != null) {
                gLMulViewTextureFilter.m10598j2(i, i2, i3, i4, i5);
                n8c.a("mergeFilterManager", "@@@ setAnchorView: set id[" + this.f11660E + "], view[" + i + "," + i2 + "," + i3 + "," + i4 + "], z=" + i5);
            }
        }
        n8c.a("mergeFilterManager", "@@@ setAnchorView: result view[" + this.f11683i + "," + this.f11684j + "," + this.f11686l + "," + this.f11685k + "], z=" + this.f11687m);
    }

    /* JADX INFO: renamed from: z2 */
    public void m10578z2(int i, int i2) {
        n8c.a("mergeFilterManager", "@@@ setOutputSize: [" + this.f11678c + "," + this.f11677b + "-->[" + i + "," + i2 + "]");
        this.f11677b = i2;
        this.f11678c = i;
    }
}
