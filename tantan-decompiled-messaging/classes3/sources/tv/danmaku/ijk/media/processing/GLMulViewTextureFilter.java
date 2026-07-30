package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import p003l.rkw;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GLMulViewTextureFilter extends MMTextureResourceInput {

    /* JADX INFO: renamed from: A */
    private int f11733A;

    /* JADX INFO: renamed from: H */
    private AidSource.FirstFrameDrawCallback f11740H;

    /* JADX INFO: renamed from: N */
    private int f11746N;

    /* JADX INFO: renamed from: S */
    private rkw f11751S;

    /* JADX INFO: renamed from: x */
    private int f11752x;

    /* JADX INFO: renamed from: y */
    private int f11753y;

    /* JADX INFO: renamed from: z */
    private int f11754z;

    /* JADX INFO: renamed from: L */
    private int f11744L = -1;

    /* JADX INFO: renamed from: O */
    private boolean f11747O = false;

    /* JADX INFO: renamed from: C */
    private int f11735C = -1;

    /* JADX INFO: renamed from: D */
    private int f11736D = -1;

    /* JADX INFO: renamed from: G */
    private int f11739G = -1;

    /* JADX INFO: renamed from: F */
    private int f11738F = -1;

    /* JADX INFO: renamed from: E */
    private int f11737E = -1;

    /* JADX INFO: renamed from: M */
    private Bitmap f11745M = null;

    /* JADX INFO: renamed from: I */
    private boolean f11741I = false;

    /* JADX INFO: renamed from: J */
    private int f11742J = -1;

    /* JADX INFO: renamed from: K */
    private SurfaceTexture f11743K = null;

    /* JADX INFO: renamed from: B */
    private long f11734B = -1;

    /* JADX INFO: renamed from: P */
    private int f11748P = -1;

    /* JADX INFO: renamed from: Q */
    private int f11749Q = -1;

    /* JADX INFO: renamed from: R */
    private boolean f11750R = false;

    public GLMulViewTextureFilter(int i, int i2, int i3, int i4) {
        this.f11751S = null;
        this.f11754z = i2;
        this.f11733A = i;
        this.f11752x = i3;
        this.f11753y = i4;
        rkw rkwVar = new rkw();
        this.f11751S = rkwVar;
        if (this.f11752x == 7) {
            rkwVar.setOESMode(false);
        }
        this.f11751S.initWithGLContext();
    }

    /* JADX INFO: renamed from: e2 */
    private void m10579e2() {
        int i = this.f11753y;
        if (i == 0) {
            this.f11751S.setRenderSize(this.f11749Q, this.f11748P);
        } else {
            if (i != 1) {
                return;
            }
            this.f11751S.setDisplayMode(this.f11749Q, this.f11748P, 2);
            this.f11751S.setRenderSize(this.f11739G, this.f11738F);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public int m10580Q1() {
        return this.f11753y;
    }

    /* JADX INFO: renamed from: R1 */
    public AidSource.FirstFrameDrawCallback m10581R1() {
        return this.f11740H;
    }

    /* JADX INFO: renamed from: S1 */
    public boolean m10582S1() {
        return this.f11741I;
    }

    /* JADX INFO: renamed from: T1 */
    public int m10583T1() {
        if (this.f11747O || this.f11735C < 0 || this.f11736D < 0 || this.f11739G <= 0 || this.f11738F <= 0 || this.f11737E < 0 || this.f11749Q <= 0 || this.f11748P <= 0) {
            return -1;
        }
        return this.f11744L;
    }

    /* JADX INFO: renamed from: U1 */
    public int m10584U1() {
        return this.f11752x;
    }

    /* JADX INFO: renamed from: V1 */
    public int m10585V1() {
        return this.f11748P;
    }

    /* JADX INFO: renamed from: W1 */
    public int m10586W1() {
        return this.f11749Q;
    }

    /* JADX INFO: renamed from: X1 */
    public long m10587X1() {
        return this.f11734B;
    }

    /* JADX INFO: renamed from: Y1 */
    public int m10588Y1() {
        return this.f11738F;
    }

    /* JADX INFO: renamed from: Z1 */
    public int m10589Z1() {
        return this.f11739G;
    }

    /* JADX INFO: renamed from: a2 */
    public int m10590a2() {
        return this.f11735C;
    }

    /* JADX INFO: renamed from: b2 */
    public int m10591b2() {
        return this.f11736D;
    }

    /* JADX INFO: renamed from: c2 */
    public int m10592c2() {
        return this.f11737E;
    }

    /* JADX INFO: renamed from: d2 */
    public void m10593d2(boolean z) {
        this.f11747O = z;
    }

    @Override // tv.danmaku.ijk.media.processing.MMTextureResourceInput, p003l.mcj, p003l.ccj
    public void drawFrame() {
        this.f11751S.drawFrame();
        this.f11744L = this.f11751S.getTextOutID();
    }

    /* JADX INFO: renamed from: f2 */
    public void m10594f2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        this.f11740H = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: g2 */
    public void m10595g2(boolean z) {
        this.f11741I = z;
    }

    /* JADX INFO: renamed from: h2 */
    public void m10596h2(int i, int i2) {
        this.f11748P = i2;
        this.f11749Q = i;
    }

    /* JADX INFO: renamed from: i2 */
    public void m10597i2(long j) {
        this.f11734B = j;
    }

    /* JADX INFO: renamed from: j2 */
    public void m10598j2(int i, int i2, int i3, int i4, int i5) {
        this.f11735C = i;
        this.f11736D = i2;
        this.f11739G = i3;
        this.f11738F = i4;
        this.f11737E = i5;
    }

    /* JADX INFO: renamed from: k2 */
    public void m10599k2(int i, SurfaceTexture surfaceTexture) {
        this.f11742J = i;
        this.f11743K = surfaceTexture;
        if (this.f11748P <= 0 || this.f11749Q <= 0 || i < 0) {
            this.f11744L = -1;
        } else {
            m10579e2();
            this.f11751S.loadTexture(i, surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m10600l2(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f11744L = -1;
            return;
        }
        Bitmap bitmap2 = this.f11745M;
        if (bitmap2 != bitmap) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f11745M.recycle();
                this.f11745M = null;
            }
            this.f11745M = bitmap;
            this.f11746N = 1;
            int width = bitmap.getWidth();
            int height = this.f11745M.getHeight();
            boolean z = this.f11750R;
            if (!z || width != this.f11749Q || height != this.f11748P) {
                if (!z) {
                    this.f11750R = true;
                }
                this.f11749Q = width;
                this.f11748P = height;
            }
        }
        this.f11751S.loadTexture(this.f11745M);
        this.f11742J = this.f11751S.getBitmapTextureID();
        this.f11743K = this.f11751S.getBitmapSurfaceTexture();
        m10579e2();
        this.f11751S.drawFrame();
        this.f11744L = this.f11751S.getTextOutID();
    }

    public void release() {
        rkw rkwVar = this.f11751S;
        if (rkwVar != null) {
            rkwVar.destroy();
            this.f11751S = null;
        }
    }
}
