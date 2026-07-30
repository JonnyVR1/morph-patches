package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import p149l.rkw;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMulViewTextureFilter extends MMTextureResourceInput {

    /* JADX INFO: renamed from: A */
    private int f208108A;

    /* JADX INFO: renamed from: H */
    private AidSource.FirstFrameDrawCallback f208115H;

    /* JADX INFO: renamed from: N */
    private int f208121N;

    /* JADX INFO: renamed from: S */
    private rkw f208126S;

    /* JADX INFO: renamed from: x */
    private int f208127x;

    /* JADX INFO: renamed from: y */
    private int f208128y;

    /* JADX INFO: renamed from: z */
    private int f208129z;

    /* JADX INFO: renamed from: L */
    private int f208119L = -1;

    /* JADX INFO: renamed from: O */
    private boolean f208122O = false;

    /* JADX INFO: renamed from: C */
    private int f208110C = -1;

    /* JADX INFO: renamed from: D */
    private int f208111D = -1;

    /* JADX INFO: renamed from: G */
    private int f208114G = -1;

    /* JADX INFO: renamed from: F */
    private int f208113F = -1;

    /* JADX INFO: renamed from: E */
    private int f208112E = -1;

    /* JADX INFO: renamed from: M */
    private Bitmap f208120M = null;

    /* JADX INFO: renamed from: I */
    private boolean f208116I = false;

    /* JADX INFO: renamed from: J */
    private int f208117J = -1;

    /* JADX INFO: renamed from: K */
    private SurfaceTexture f208118K = null;

    /* JADX INFO: renamed from: B */
    private long f208109B = -1;

    /* JADX INFO: renamed from: P */
    private int f208123P = -1;

    /* JADX INFO: renamed from: Q */
    private int f208124Q = -1;

    /* JADX INFO: renamed from: R */
    private boolean f208125R = false;

    public GLMulViewTextureFilter(int i, int i2, int i3, int i4) {
        this.f208126S = null;
        this.f208129z = i2;
        this.f208108A = i;
        this.f208127x = i3;
        this.f208128y = i4;
        rkw rkwVar = new rkw();
        this.f208126S = rkwVar;
        if (this.f208127x == 7) {
            rkwVar.setOESMode(false);
        }
        this.f208126S.initWithGLContext();
    }

    /* JADX INFO: renamed from: e2 */
    private void m222108e2() {
        int i = this.f208128y;
        if (i == 0) {
            this.f208126S.setRenderSize(this.f208124Q, this.f208123P);
        } else {
            if (i != 1) {
                return;
            }
            this.f208126S.setDisplayMode(this.f208124Q, this.f208123P, 2);
            this.f208126S.setRenderSize(this.f208114G, this.f208113F);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public int m222109Q1() {
        return this.f208128y;
    }

    /* JADX INFO: renamed from: R1 */
    public AidSource.FirstFrameDrawCallback m222110R1() {
        return this.f208115H;
    }

    /* JADX INFO: renamed from: S1 */
    public boolean m222111S1() {
        return this.f208116I;
    }

    /* JADX INFO: renamed from: T1 */
    public int m222112T1() {
        if (this.f208122O || this.f208110C < 0 || this.f208111D < 0 || this.f208114G <= 0 || this.f208113F <= 0 || this.f208112E < 0 || this.f208124Q <= 0 || this.f208123P <= 0) {
            return -1;
        }
        return this.f208119L;
    }

    /* JADX INFO: renamed from: U1 */
    public int m222113U1() {
        return this.f208127x;
    }

    /* JADX INFO: renamed from: V1 */
    public int m222114V1() {
        return this.f208123P;
    }

    /* JADX INFO: renamed from: W1 */
    public int m222115W1() {
        return this.f208124Q;
    }

    /* JADX INFO: renamed from: X1 */
    public long m222116X1() {
        return this.f208109B;
    }

    /* JADX INFO: renamed from: Y1 */
    public int m222117Y1() {
        return this.f208113F;
    }

    /* JADX INFO: renamed from: Z1 */
    public int m222118Z1() {
        return this.f208114G;
    }

    /* JADX INFO: renamed from: a2 */
    public int m222119a2() {
        return this.f208110C;
    }

    /* JADX INFO: renamed from: b2 */
    public int m222120b2() {
        return this.f208111D;
    }

    /* JADX INFO: renamed from: c2 */
    public int m222121c2() {
        return this.f208112E;
    }

    /* JADX INFO: renamed from: d2 */
    public void m222122d2(boolean z) {
        this.f208122O = z;
    }

    @Override // tv.danmaku.ijk.media.processing.MMTextureResourceInput, p149l.mcj, p149l.ccj
    public void drawFrame() {
        this.f208126S.drawFrame();
        this.f208119L = this.f208126S.getTextOutID();
    }

    /* JADX INFO: renamed from: f2 */
    public void m222123f2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        this.f208115H = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: g2 */
    public void m222124g2(boolean z) {
        this.f208116I = z;
    }

    /* JADX INFO: renamed from: h2 */
    public void m222125h2(int i, int i2) {
        this.f208123P = i2;
        this.f208124Q = i;
    }

    /* JADX INFO: renamed from: i2 */
    public void m222126i2(long j) {
        this.f208109B = j;
    }

    /* JADX INFO: renamed from: j2 */
    public void m222127j2(int i, int i2, int i3, int i4, int i5) {
        this.f208110C = i;
        this.f208111D = i2;
        this.f208114G = i3;
        this.f208113F = i4;
        this.f208112E = i5;
    }

    /* JADX INFO: renamed from: k2 */
    public void m222128k2(int i, SurfaceTexture surfaceTexture) {
        this.f208117J = i;
        this.f208118K = surfaceTexture;
        if (this.f208123P <= 0 || this.f208124Q <= 0 || i < 0) {
            this.f208119L = -1;
        } else {
            m222108e2();
            this.f208126S.loadTexture(i, surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m222129l2(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f208119L = -1;
            return;
        }
        Bitmap bitmap2 = this.f208120M;
        if (bitmap2 != bitmap) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f208120M.recycle();
                this.f208120M = null;
            }
            this.f208120M = bitmap;
            this.f208121N = 1;
            int width = bitmap.getWidth();
            int height = this.f208120M.getHeight();
            boolean z = this.f208125R;
            if (!z || width != this.f208124Q || height != this.f208123P) {
                if (!z) {
                    this.f208125R = true;
                }
                this.f208124Q = width;
                this.f208123P = height;
            }
        }
        this.f208126S.loadTexture(this.f208120M);
        this.f208117J = this.f208126S.getBitmapTextureID();
        this.f208118K = this.f208126S.getBitmapSurfaceTexture();
        m222108e2();
        this.f208126S.drawFrame();
        this.f208119L = this.f208126S.getTextOutID();
    }

    public void release() {
        rkw rkwVar = this.f208126S;
        if (rkwVar != null) {
            rkwVar.destroy();
            this.f208126S = null;
        }
    }
}
