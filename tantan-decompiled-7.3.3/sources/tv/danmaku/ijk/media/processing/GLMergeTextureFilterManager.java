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
import p153l.dfj;
import p153l.gfj;
import p153l.lej;
import p153l.muf;
import p153l.pej;
import p153l.t9c;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMergeTextureFilterManager extends gfj implements dfj {

    /* JADX INFO: renamed from: A */
    private boolean f208953A;

    /* JADX INFO: renamed from: B */
    private int f208954B;

    /* JADX INFO: renamed from: C */
    private int f208955C;

    /* JADX INFO: renamed from: D */
    private AidSource.FirstFrameDrawCallback f208956D;

    /* JADX INFO: renamed from: E */
    private long f208957E;

    /* JADX INFO: renamed from: F */
    private boolean f208958F;

    /* JADX INFO: renamed from: G */
    private int f208959G;

    /* JADX INFO: renamed from: H */
    private int f208960H;

    /* JADX INFO: renamed from: I */
    private int f208961I;

    /* JADX INFO: renamed from: a */
    private pej f208973a;

    /* JADX INFO: renamed from: e */
    private int f208977e;

    /* JADX INFO: renamed from: f */
    private int f208978f;

    /* JADX INFO: renamed from: n */
    private int f208985n;

    /* JADX INFO: renamed from: o */
    private int f208986o;

    /* JADX INFO: renamed from: p */
    private boolean f208987p;

    /* JADX INFO: renamed from: q */
    private int f208988q;

    /* JADX INFO: renamed from: r */
    private int f208989r;

    /* JADX INFO: renamed from: s */
    private int f208990s;

    /* JADX INFO: renamed from: t */
    private int f208991t;

    /* JADX INFO: renamed from: u */
    private int f208992u;

    /* JADX INFO: renamed from: v */
    private int f208993v;

    /* JADX INFO: renamed from: x */
    private int f208994x;

    /* JADX INFO: renamed from: y */
    private int f208995y;

    /* JADX INFO: renamed from: z */
    private int f208996z;

    /* JADX INFO: renamed from: b */
    private int f208974b = 640;

    /* JADX INFO: renamed from: c */
    private int f208975c = 352;

    /* JADX INFO: renamed from: d */
    private int f208976d = -1;

    /* JADX INFO: renamed from: g */
    private boolean f208979g = false;

    /* JADX INFO: renamed from: J */
    private float f208962J = 0.0f;

    /* JADX INFO: renamed from: K */
    private float f208963K = 0.0f;

    /* JADX INFO: renamed from: L */
    private float f208964L = 1.0f;

    /* JADX INFO: renamed from: M */
    private FloatBuffer[] f208965M = new FloatBuffer[4];

    /* JADX INFO: renamed from: N */
    private float[] f208966N = new float[8];

    /* JADX INFO: renamed from: O */
    private float[] f208967O = new float[8];

    /* JADX INFO: renamed from: P */
    private float[] f208968P = new float[8];

    /* JADX INFO: renamed from: Q */
    private float[] f208969Q = new float[8];

    /* JADX INFO: renamed from: T */
    private Map f208972T = new HashMap();

    /* JADX INFO: renamed from: R */
    private final Queue<Runnable> f208970R = new LinkedList();

    /* JADX INFO: renamed from: S */
    private final Queue<Runnable> f208971S = new LinkedList();

    /* JADX INFO: renamed from: i */
    private int f208980i = -1;

    /* JADX INFO: renamed from: j */
    private int f208981j = -1;

    /* JADX INFO: renamed from: l */
    private int f208983l = -1;

    /* JADX INFO: renamed from: k */
    private int f208982k = -1;

    /* JADX INFO: renamed from: m */
    private int f208984m = -1;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager$6 */
    class RunnableC225876 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f209018a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f209019b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ GLMergeTextureFilterManager f209020c;

        @Override // java.lang.Runnable
        public void run() {
            GLMulViewTextureFilter gLMulViewTextureFilter;
            if (this.f209020c.f208972T == null || !this.f209020c.f208972T.containsKey(Long.valueOf(this.f209018a)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f209020c.f208972T.get(Long.valueOf(this.f209018a))) == null) {
                return;
            }
            gLMulViewTextureFilter.m223368d2(this.f209019b);
        }
    }

    public GLMergeTextureFilterManager(pej pejVar) {
        this.f208987p = false;
        this.f208957E = 0L;
        this.f208958F = false;
        this.f208973a = pejVar;
        this.f208987p = false;
        this.f208957E = 0L;
        this.f208958F = false;
    }

    private void drawIndeed() {
        if (this.texture_in <= 0) {
            t9c.m189745c("mergeFilterManager", "draw: " + this.texture_in);
            return;
        }
        int iM223331o2 = this.f208991t;
        int i = this.f208986o;
        if (i == 2) {
            iM223331o2 = m223330n2();
        } else if (i == 1) {
            iM223331o2 = m223331o2();
        }
        GLES20.glViewport(this.f208990s, iM223331o2, this.f208992u, this.f208993v);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        this.f208953A = true;
    }

    /* JADX INFO: renamed from: l2 */
    private void m223328l2(int i, int i2, float f) {
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
        m223335y2(f6, f7, f2, f3);
    }

    /* JADX INFO: renamed from: m2 */
    private void m223329m2(int i, int i2, int i3, int i4) {
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
        m223335y2(f3, f4, f, f2);
    }

    /* JADX INFO: renamed from: n2 */
    private int m223330n2() {
        int i;
        int i2;
        int i3;
        this.f208962J = 0.0f;
        this.f208963K = 0.0f;
        int i4 = this.f208994x;
        if (i4 == 1) {
            int i5 = this.f208989r;
            int i6 = this.f208988q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f208992u * 1.0f) / this.f208993v;
            if (f2 != f) {
                m223328l2(i6, i5, f2);
            } else {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m223329m2(this.f208988q, this.f208989r, getHeight(), getWidth());
                return this.f208991t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f208995y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f208989r;
                int i9 = this.f208988q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f208993v * 1.0f) / this.f208992u;
                if (f4 != f3) {
                    m223328l2(i9, i8, f4);
                } else {
                    m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f208962J = 1.0f / this.f208988q;
                this.f208963K = 1.0f / this.f208989r;
            }
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        } else {
            if (!this.f208987p) {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208991t;
            }
            m223328l2(this.f208988q, this.f208989r, (this.f208992u * 1.0f) / this.f208993v);
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: o2 */
    private int m223331o2() {
        int i;
        int i2;
        int i3;
        this.f208962J = 0.0f;
        this.f208963K = 0.0f;
        int i4 = this.f208994x;
        if (i4 == 1) {
            int i5 = this.f208989r;
            int i6 = this.f208988q;
            float f = i5 / (i6 * 1.0f);
            float f2 = (this.f208993v * 1.0f) / this.f208992u;
            if (f2 != f) {
                m223328l2(i6, i5, f2);
            } else {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
            }
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        } else if (i4 != 2) {
            if (i4 == 3) {
                m223329m2(this.f208988q, this.f208989r, getWidth(), getHeight());
                return this.f208991t;
            }
            if (i4 != 4) {
                return 0;
            }
            int i7 = this.f208995y;
            if (i7 == 2 || i7 == 3 || i7 == 9) {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
            } else {
                int i8 = this.f208989r;
                int i9 = this.f208988q;
                float f3 = i8 / (i9 * 1.0f);
                float f4 = (this.f208993v * 1.0f) / this.f208992u;
                if (f4 != f3) {
                    m223328l2(i9, i8, f4);
                } else {
                    m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
                }
                this.f208962J = 1.0f / this.f208988q;
                this.f208963K = 1.0f / this.f208989r;
            }
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        } else {
            if (!this.f208987p) {
                m223335y2(0.0f, 1.0f, 0.0f, 1.0f);
                return this.f208991t;
            }
            m223328l2(this.f208988q, this.f208989r, (this.f208993v * 1.0f) / this.f208992u);
            i = this.f208974b;
            i2 = this.f208991t;
            i3 = this.f208993v;
        }
        return i - (i2 + i3);
    }

    /* JADX INFO: renamed from: p2 */
    private int m223332p2() {
        int i = this.curRotation;
        int i2 = this.f208994x;
        if (i2 == 2) {
            return i;
        }
        if (i2 == 1) {
            return i + 3;
        }
        return i2 == 3 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: q2 */
    private int m223333q2() {
        int i = this.curRotation;
        int i2 = this.f208976d;
        return (i2 == -1 || i2 == 90 || i2 != 270) ? i : i + 2;
    }

    /* JADX INFO: renamed from: s2 */
    private void m223334s2(Queue<Runnable> queue) {
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
    private void m223335y2(float f, float f2, float f3, float f4) {
        float[] fArr = this.f208966N;
        if (fArr != null) {
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            FloatBuffer[] floatBufferArr = this.f208965M;
            if (floatBufferArr != null) {
                floatBufferArr[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208965M[0].put(this.f208966N).position(0);
            }
        }
        float[] fArr2 = this.f208967O;
        if (fArr2 != null) {
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            FloatBuffer[] floatBufferArr2 = this.f208965M;
            if (floatBufferArr2 != null) {
                floatBufferArr2[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208965M[1].put(this.f208967O).position(0);
            }
        }
        float[] fArr3 = this.f208968P;
        if (fArr3 != null) {
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            FloatBuffer[] floatBufferArr3 = this.f208965M;
            if (floatBufferArr3 != null) {
                floatBufferArr3[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208965M[2].put(this.f208968P).position(0);
            }
        }
        float[] fArr4 = this.f208969Q;
        if (fArr4 != null) {
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            FloatBuffer[] floatBufferArr4 = this.f208965M;
            if (floatBufferArr4 != null) {
                floatBufferArr4[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f208965M[3].put(this.f208969Q).position(0);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m223336A2(int i) {
        t9c.m189743a("mergeFilterManager", "@@@ setScreenSourcesInputAngle: " + this.f208976d + "-->" + i);
        this.f208976d = i;
    }

    /* JADX INFO: renamed from: B2 */
    public void m223337B2(final long j, final float f, final float f2, final float f3, final float f4, final int i) {
        t9c.m189745c("mergeFilterManager", "@@@ setSubViewPort: id[" + j + "]; view[" + f + Constants.SEPARATOR_COMMA + f2 + Constants.SEPARATOR_COMMA + f3 + Constants.SEPARATOR_COMMA + f4 + "], z=" + i);
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.2
            /* JADX WARN: Code duplicated, block: B:15:0x004a  */
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                int i2;
                int i3;
                int i4;
                float f5;
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                float f6 = f3;
                if (f6 > 1.0f) {
                    f5 = f4;
                    if (f5 <= 1.0f) {
                        i2 = (int) (GLMergeTextureFilterManager.this.f208975c * f);
                        i3 = (int) (GLMergeTextureFilterManager.this.f208974b * f2);
                        i4 = (int) (GLMergeTextureFilterManager.this.f208975c * f3);
                        f5 = GLMergeTextureFilterManager.this.f208974b * f4;
                    } else {
                        i2 = (int) f;
                        i3 = (int) f2;
                        i4 = (int) f6;
                    }
                } else {
                    i2 = (int) (GLMergeTextureFilterManager.this.f208975c * f);
                    i3 = (int) (GLMergeTextureFilterManager.this.f208974b * f2);
                    i4 = (int) (GLMergeTextureFilterManager.this.f208975c * f3);
                    f5 = GLMergeTextureFilterManager.this.f208974b * f4;
                }
                int i5 = (int) f5;
                int i6 = i3;
                int i7 = i4;
                int iM223367c2 = gLMulViewTextureFilter.m223367c2();
                if (GLMergeTextureFilterManager.this.f208957E != j || !GLMergeTextureFilterManager.this.f208958F) {
                    t9c.m189743a("mergeFilterManager", "@@@ setSubViewPort: E id[" + j + "]; view[" + i2 + Constants.SEPARATOR_COMMA + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i5 + "], z=" + i + "/" + iM223367c2 + ", sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
                    gLMulViewTextureFilter.m223373j2(i2, i6, i7, i5, i);
                    return;
                }
                GLMergeTextureFilterManager.this.f208980i = i2;
                GLMergeTextureFilterManager.this.f208981j = i6;
                GLMergeTextureFilterManager.this.f208983l = i7;
                GLMergeTextureFilterManager.this.f208982k = i5;
                GLMergeTextureFilterManager.this.f208984m = i;
                t9c.m189743a("mergeFilterManager", "@@@ setSubViewPort: E id[anchor], view[" + i2 + Constants.SEPARATOR_COMMA + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i5 + "], z=" + i + "/" + iM223367c2 + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public void m223338C2(final long j, final int i, final int i2) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.7
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                t9c.m189743a("mergeFilterManager", "@@@ sizeSubView: id[" + j + "], width=" + i + ", height=" + i2 + ", sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
                gLMulViewTextureFilter.m223371h2(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: D2 */
    public void m223339D2(int i) {
        Map map = this.f208972T;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.f208972T.entrySet().iterator();
        while (it.hasNext()) {
            GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208972T.get((Long) ((Map.Entry) it.next()).getKey());
            if (gLMulViewTextureFilter != null) {
                long jM223362X1 = gLMulViewTextureFilter.m223362X1();
                this.f208988q = gLMulViewTextureFilter.m223361W1();
                this.f208989r = gLMulViewTextureFilter.m223360V1();
                this.f208990s = gLMulViewTextureFilter.m223365a2();
                this.f208991t = gLMulViewTextureFilter.m223366b2();
                this.f208992u = gLMulViewTextureFilter.m223364Z1();
                this.f208993v = gLMulViewTextureFilter.m223363Y1();
                gLMulViewTextureFilter.drawFrame();
                this.texture_in = gLMulViewTextureFilter.m223358T1();
                int iM223367c2 = gLMulViewTextureFilter.m223367c2();
                this.f208996z = iM223367c2;
                if (iM223367c2 == 1 && i == 1) {
                    this.f208994x = 4;
                    this.f208955C++;
                } else if (iM223367c2 == 0 && i == 0) {
                    this.f208994x = 3;
                    this.f208954B++;
                }
                this.f208995y = gLMulViewTextureFilter.m223359U1();
                this.f208956D = gLMulViewTextureFilter.m223356R1();
                this.f208953A = false;
                if (this.f208996z == i) {
                    onDrawFrame();
                    if (this.f208953A && this.f208956D != null && !gLMulViewTextureFilter.m223357S1()) {
                        t9c.m189745c("mergeFilterManager", "newTextureReady: userid=" + jM223362X1 + "; first frame render finish");
                        this.f208956D.mo223472a();
                        gLMulViewTextureFilter.m223370g2(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m223340E2(final long j, final boolean z) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.5
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                String str;
                String str2;
                t9c.m189743a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], full=" + z);
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                int iM223365a2 = gLMulViewTextureFilter.m223365a2();
                int iM223366b2 = gLMulViewTextureFilter.m223366b2();
                int iM223364Z1 = gLMulViewTextureFilter.m223364Z1();
                int iM223363Y1 = gLMulViewTextureFilter.m223363Y1();
                int iM223367c2 = gLMulViewTextureFilter.m223367c2();
                t9c.m189743a("mergeFilterManager", "@@@ switchFullScreen: id[" + j + "], view[" + iM223365a2 + Constants.SEPARATOR_COMMA + iM223366b2 + Constants.SEPARATOR_COMMA + iM223364Z1 + Constants.SEPARATOR_COMMA + iM223363Y1 + "]; z=" + iM223367c2 + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
                StringBuilder sb = new StringBuilder("@@@ switchFullScreen: anchor view[");
                sb.append(GLMergeTextureFilterManager.this.f208980i);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208981j);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208983l);
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(GLMergeTextureFilterManager.this.f208982k);
                sb.append("]; z=");
                sb.append(GLMergeTextureFilterManager.this.f208984m);
                t9c.m189743a("mergeFilterManager", sb.toString());
                boolean z2 = z;
                GLMergeTextureFilterManager gLMergeTextureFilterManager = GLMergeTextureFilterManager.this;
                if (!z2) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    if (gLMergeTextureFilterManager.f208957E == j && GLMergeTextureFilterManager.this.f208958F) {
                        GLMergeTextureFilterManager.this.f208957E = 0L;
                        GLMergeTextureFilterManager.this.f208958F = false;
                        gLMulViewTextureFilter.m223373j2(GLMergeTextureFilterManager.this.f208980i, GLMergeTextureFilterManager.this.f208981j, GLMergeTextureFilterManager.this.f208983l, GLMergeTextureFilterManager.this.f208982k, GLMergeTextureFilterManager.this.f208984m);
                        GLMergeTextureFilterManager.this.f208980i = iM223365a2;
                        GLMergeTextureFilterManager.this.f208981j = iM223366b2;
                        GLMergeTextureFilterManager.this.f208983l = iM223364Z1;
                        GLMergeTextureFilterManager.this.f208982k = iM223363Y1;
                        GLMergeTextureFilterManager.this.f208984m = iM223367c2;
                    }
                } else if (gLMergeTextureFilterManager.f208957E == j && GLMergeTextureFilterManager.this.f208958F) {
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                } else {
                    GLMergeTextureFilterManager.this.f208957E = j;
                    GLMergeTextureFilterManager.this.f208958F = true;
                    str = "mergeFilterManager";
                    str2 = "], sub size=";
                    gLMulViewTextureFilter.m223373j2(GLMergeTextureFilterManager.this.f208980i, GLMergeTextureFilterManager.this.f208981j, GLMergeTextureFilterManager.this.f208983l, GLMergeTextureFilterManager.this.f208982k, GLMergeTextureFilterManager.this.f208984m);
                    GLMergeTextureFilterManager.this.f208980i = iM223365a2;
                    GLMergeTextureFilterManager.this.f208981j = iM223366b2;
                    GLMergeTextureFilterManager.this.f208983l = iM223364Z1;
                    GLMergeTextureFilterManager.this.f208982k = iM223363Y1;
                    GLMergeTextureFilterManager.this.f208984m = iM223367c2;
                }
                String str3 = str;
                t9c.m189743a(str3, "@@@ switchFullScreen: E id[" + j + "], view[" + iM223365a2 + Constants.SEPARATOR_COMMA + iM223366b2 + Constants.SEPARATOR_COMMA + iM223364Z1 + Constants.SEPARATOR_COMMA + iM223363Y1 + "]; z=" + iM223367c2 + str2 + GLMergeTextureFilterManager.this.f208972T.size());
                StringBuilder sb2 = new StringBuilder("@@@ switchFullScreen: E anchor view[");
                sb2.append(GLMergeTextureFilterManager.this.f208980i);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208981j);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208983l);
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(GLMergeTextureFilterManager.this.f208982k);
                sb2.append("]; z=");
                sb2.append(GLMergeTextureFilterManager.this.f208984m);
                t9c.m189743a(str3, sb2.toString());
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public void m223341F2(final long j, final int i, final SurfaceTexture surfaceTexture) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.4
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m223374k2(i, surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: G2 */
    public void m223342G2(final long j, final Bitmap bitmap) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.3
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                gLMulViewTextureFilter.m223375l2(bitmap);
            }
        });
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        t9c.m189745c("mergeFilterManager", "destroy(S)");
        m223346k2();
        super.destroy();
        Queue<Runnable> queue = this.f208970R;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f208971S;
        if (queue2 != null) {
            queue2.clear();
        }
        t9c.m189745c("mergeFilterManager", "destroy");
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer != null) {
            z = false;
        } else {
            if (getWidth() == 0 || getHeight() == 0) {
                t9c.m189745c("mergeFilterManager", "drawFrame: 1 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            t9c.m189743a("mergeFilterManager", "drawFrame: 1 " + this.glFrameBuffer);
            initFBO();
            z = true;
        }
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null && lejVar.m153901h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                t9c.m189745c("mergeFilterManager", "drawFrame: 2 width=" + getWidth() + ", height=" + getHeight());
                return;
            }
            t9c.m189743a("mergeFilterManager", "drawFrame: 2, " + z + Constants.SEPARATOR_COMMA + this.glFrameBuffer);
            initFBO();
        }
        if (this.dirty) {
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main(){\nvec4 image = texture2D(inputImageTexture0,textureCoordinate);\nvec2 center = textureCoordinate;\nif (sizeInverse.x != 0.0 && sizeInverse.y != 0.0) {\nvec4 lt=texture2D(inputImageTexture0, clamp(center+vec2(- sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(center+vec2(-sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, sizeInverse.y), 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(center+vec2(sizeInverse.x, -sizeInverse.y), 0.0, 1.0)); \nimage = clamp((image+lt+lb+rt+rb)*0.2, 0.0, 1.0);\n}\ngl_FragColor = clear_image*image + (1.0-clear_image)*vec4(0.0,0.0,0.0,1.0); \n}\n";
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
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float clearScreen; \nuniform float widthInverse; \nuniform float heightInverse; \nvarying float clear_image; \nvarying vec2 sizeInverse; \nvoid main() {\nclear_image = clearScreen; \nsizeInverse = vec2(widthInverse, heightInverse); \n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: h2 */
    public void m223343h2(final long j, final int i, final int i2) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f208972T != null) {
                    t9c.m189745c("mergeFilterManager", "@@@ addSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size() + ",source=" + i + "; display=" + i2);
                    if (!GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j))) {
                        GLMulViewTextureFilter gLMulViewTextureFilter = new GLMulViewTextureFilter(GLMergeTextureFilterManager.this.f208975c, GLMergeTextureFilterManager.this.f208974b, i, i2);
                        t9c.m189743a("mergeFilterManager", "@@@ addSubView: add sub, userid=" + j + "; sources:" + i + "; display=" + i2);
                        gLMulViewTextureFilter.m223372i2(j);
                        GLMergeTextureFilterManager.this.f208972T.put(Long.valueOf(j), gLMulViewTextureFilter);
                    } else if (GLMergeTextureFilterManager.this.f208972T != null && GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j))) {
                        t9c.m189745c("mergeFilterManager", "@@@ addSubView: 同一个userID(" + j + ")未释放又创建");
                        GLMulViewTextureFilter gLMulViewTextureFilter2 = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j));
                        if (gLMulViewTextureFilter2 != null) {
                            t9c.m189745c("mergeFilterManager", "@@@ addSubView: source[" + gLMulViewTextureFilter2.m223359U1() + "->" + i + "]; display[" + gLMulViewTextureFilter2.m223355Q1() + "->" + i2 + Constants.AES_SUFFIX);
                        }
                    }
                    t9c.m189745c("mergeFilterManager", "@@@ addSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
                }
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public void m223344i2(int i, int i2) {
        this.f208988q = this.f208977e;
        this.f208989r = this.f208978f;
        this.f208990s = this.f208980i;
        this.f208991t = this.f208981j;
        this.f208992u = this.f208983l;
        this.f208993v = this.f208982k;
        this.texture_in = i;
        if (i2 == 0 && this.f208984m == 0) {
            this.f208994x = 2;
            this.f208954B++;
        } else if (i2 == 1 && this.f208984m == 1) {
            this.f208994x = 1;
            this.f208955C++;
        }
        this.f208995y = -1;
        this.f208956D = null;
        this.f208953A = false;
        int i3 = this.f208984m;
        this.f208996z = i3;
        if (i3 == i2) {
            onDrawFrame();
        }
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        t9c.m189745c("mergeFilterManager", "init fbo: (" + getWidth() + Constants.SEPARATOR_COMMA + getHeight() + ")");
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.glFrameBuffer = lejVar2;
        lejVar2.m153895b(getWidth(), getHeight());
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
        this.f208959G = GLES20.glGetUniformLocation(this.programHandle, "clearScreen");
        this.f208960H = GLES20.glGetUniformLocation(this.programHandle, "widthInverse");
        this.f208961I = GLES20.glGetUniformLocation(this.programHandle, "heightInverse");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    /* JADX INFO: renamed from: j2 */
    public void m223345j2(final long j, final AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.8
            @Override // java.lang.Runnable
            public void run() {
                GLMulViewTextureFilter gLMulViewTextureFilter;
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j)) || (gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j))) == null) {
                    return;
                }
                t9c.m189743a("mergeFilterManager", "@@@ callbackSubView: id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size() + ", cb=" + firstFrameDrawCallback);
                gLMulViewTextureFilter.m223369f2(firstFrameDrawCallback);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m223346k2() {
        if (this.f208972T != null) {
            t9c.m189743a("mergeFilterManager", "@@@ clearSubView: sub size=" + this.f208972T.size());
            Iterator it = this.f208972T.entrySet().iterator();
            while (it.hasNext()) {
                Long l2 = (Long) ((Map.Entry) it.next()).getKey();
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208972T.get(l2);
                if (gLMulViewTextureFilter != null) {
                    t9c.m189743a("mergeFilterManager", "@@@ clearSubView: remove id[" + gLMulViewTextureFilter.m223362X1() + Constants.AES_SUFFIX);
                    gLMulViewTextureFilter.release();
                }
                this.f208972T.remove(l2);
            }
            t9c.m189743a("mergeFilterManager", "@@@ clearSubView: E sub size=" + this.f208972T.size());
            this.f208972T.clear();
        }
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        Map map;
        m223334s2(this.f208970R);
        if (z) {
            markAsDirty();
        } else {
            t9c.m189745c("mergeFilterManager", "newTextureReady: newfata=" + z + ", dirty=" + this.dirty);
        }
        int width = gfjVar.getWidth();
        int height = gfjVar.getHeight();
        if (!this.f208979g || width != this.f208977e || height != this.f208978f) {
            this.f208977e = width;
            this.f208978f = height;
            this.f208979g = true;
        }
        this.f208954B = 0;
        m223344i2(i, 0);
        m223339D2(0);
        int i2 = this.f208954B;
        if (i2 == 0) {
            t9c.m189745c("mergeFilterManager", "newTextureReady: no find zoder zero");
        } else if (i2 > 1) {
            t9c.m189745c("mergeFilterManager", "newTextureReady: find " + this.f208954B + " zoder zero");
        }
        if (this.f208987p && this.f208954B == 0) {
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        this.f208955C = 0;
        m223344i2(i, 1);
        m223339D2(1);
        if (this.f208955C == 0 && (map = this.f208972T) != null && map.size() > 0) {
            t9c.m189745c("mergeFilterManager", "newTextureReady: " + this.f208955C + " < " + this.f208972T.size());
        }
        synchronized (this.listLock) {
            try {
                for (dfj dfjVar : this.targets) {
                    lej lejVar = this.glFrameBuffer;
                    if (lejVar != null) {
                        dfjVar.newTextureReady(lejVar.m153902i()[0], this, z);
                    } else {
                        t9c.m189745c("mergeFilterManager", "glFrameBuffer is null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gfjVar.unlockRenderBuffer();
        m223334s2(this.f208971S);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        int iM223333q2 = this.curRotation;
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f208959G, this.f208964L);
        GLES20.glUniform1f(this.f208960H, this.f208962J);
        GLES20.glUniform1f(this.f208961I, this.f208963K);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        int i = this.f208986o;
        if (i == 2) {
            iM223333q2 = m223332p2();
        } else if (i == 1) {
            iM223333q2 = m223333q2();
        }
        int i2 = iM223333q2 % 4;
        this.f208965M[i2].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f208965M[i2]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public void m223347r2(final long j) {
        t9c.m189743a("mergeFilterManager", "@@@ removeSubView:id[" + j + Constants.AES_SUFFIX);
        m223348t2(new Runnable() { // from class: tv.danmaku.ijk.media.processing.GLMergeTextureFilterManager.9
            @Override // java.lang.Runnable
            public void run() {
                if (GLMergeTextureFilterManager.this.f208972T == null || !GLMergeTextureFilterManager.this.f208972T.containsKey(Long.valueOf(j))) {
                    return;
                }
                GLMulViewTextureFilter gLMulViewTextureFilter = (GLMulViewTextureFilter) GLMergeTextureFilterManager.this.f208972T.get(Long.valueOf(j));
                if (gLMulViewTextureFilter != null) {
                    t9c.m189743a("mergeFilterManager", "@@@ removeSubView: id[" + j + "]; switchID[" + GLMergeTextureFilterManager.this.f208957E + "]; status[" + GLMergeTextureFilterManager.this.f208958F + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
                    if (j == GLMergeTextureFilterManager.this.f208957E && GLMergeTextureFilterManager.this.f208958F) {
                        GLMergeTextureFilterManager.this.f208984m = gLMulViewTextureFilter.m223367c2();
                        GLMergeTextureFilterManager.this.f208980i = gLMulViewTextureFilter.m223365a2();
                        GLMergeTextureFilterManager.this.f208981j = gLMulViewTextureFilter.m223366b2();
                        GLMergeTextureFilterManager.this.f208983l = gLMulViewTextureFilter.m223364Z1();
                        GLMergeTextureFilterManager.this.f208982k = gLMulViewTextureFilter.m223363Y1();
                        GLMergeTextureFilterManager.this.f208958F = false;
                        GLMergeTextureFilterManager.this.f208957E = 0L;
                        t9c.m189745c("mergeFilterManager", "@@@ removeSubView: anchor view[" + GLMergeTextureFilterManager.this.f208980i + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208981j + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208983l + Constants.SEPARATOR_COMMA + GLMergeTextureFilterManager.this.f208982k + "], z=" + GLMergeTextureFilterManager.this.f208984m);
                    }
                    GLMergeTextureFilterManager.this.f208972T.remove(Long.valueOf(j));
                    gLMulViewTextureFilter.release();
                }
                t9c.m189743a("mergeFilterManager", "@@@ removeSubView: E id[" + j + "], sub size=" + GLMergeTextureFilterManager.this.f208972T.size());
            }
        });
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        t9c.m189743a("mergeFilterManager", "setRenderSize:[" + this.f208975c + Constants.SEPARATOR_COMMA + this.f208974b + "]-->" + i + Constants.SEPARATOR_COMMA + i2);
        this.f208974b = i2;
        this.f208975c = i;
        super.setRenderSize(i, i2);
    }

    /* JADX INFO: renamed from: t2 */
    public void m223348t2(Runnable runnable) {
        synchronized (this.f208970R) {
            this.f208970R.add(runnable);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m223349u2(int i) {
        t9c.m189743a("mergeFilterManager", "@@@ setAnchorOutputOrient: " + this.f208986o + "-->" + i);
        this.f208986o = i;
    }

    /* JADX INFO: renamed from: v2 */
    public void m223350v2(boolean z) {
        t9c.m189745c("mergeFilterManager", "@@@ setAnchorSmallView: " + this.f208987p + "-->" + z);
        if (this.f208987p != z) {
            this.f208987p = z;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m223351w2(int i) {
        t9c.m189743a("mergeFilterManager", "@@@ setAnchorSourcesMode: " + this.f208985n + "-->" + i);
        this.f208985n = i;
    }

    /* JADX INFO: renamed from: x2 */
    public void m223352x2(int i, int i2, int i3, int i4, int i5) {
        GLMulViewTextureFilter gLMulViewTextureFilter;
        t9c.m189743a("mergeFilterManager", "@@@ setAnchorView: input view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5 + ",status=" + this.f208958F + ";ViewUserID=" + this.f208957E);
        StringBuilder sb = new StringBuilder("@@@ setAnchorView: history view[");
        sb.append(this.f208980i);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208981j);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208983l);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.f208982k);
        sb.append("], z=");
        sb.append(this.f208984m);
        t9c.m189743a("mergeFilterManager", sb.toString());
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            return;
        }
        long j = this.f208957E;
        if (j == 0 || !this.f208958F) {
            this.f208980i = i;
            this.f208981j = i2;
            this.f208983l = i3;
            this.f208982k = i4;
            this.f208984m = i5;
        } else {
            Map map = this.f208972T;
            if (map != null && map.containsKey(Long.valueOf(j)) && (gLMulViewTextureFilter = (GLMulViewTextureFilter) this.f208972T.get(Long.valueOf(this.f208957E))) != null) {
                gLMulViewTextureFilter.m223373j2(i, i2, i3, i4, i5);
                t9c.m189743a("mergeFilterManager", "@@@ setAnchorView: set id[" + this.f208957E + "], view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5);
            }
        }
        t9c.m189743a("mergeFilterManager", "@@@ setAnchorView: result view[" + this.f208980i + Constants.SEPARATOR_COMMA + this.f208981j + Constants.SEPARATOR_COMMA + this.f208983l + Constants.SEPARATOR_COMMA + this.f208982k + "], z=" + this.f208984m);
    }

    /* JADX INFO: renamed from: z2 */
    public void m223353z2(int i, int i2) {
        t9c.m189743a("mergeFilterManager", "@@@ setOutputSize: [" + this.f208975c + Constants.SEPARATOR_COMMA + this.f208974b + "-->[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.AES_SUFFIX);
        this.f208974b = i2;
        this.f208975c = i;
    }
}
