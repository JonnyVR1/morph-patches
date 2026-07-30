package tv.danmaku.ijk.media.processing;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import p153l.qnw;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class GLMulViewTextureFilter extends MMTextureResourceInput {

    /* JADX INFO: renamed from: A */
    private int f209030A;

    /* JADX INFO: renamed from: H */
    private AidSource.FirstFrameDrawCallback f209037H;

    /* JADX INFO: renamed from: N */
    private int f209043N;

    /* JADX INFO: renamed from: S */
    private qnw f209048S;

    /* JADX INFO: renamed from: x */
    private int f209049x;

    /* JADX INFO: renamed from: y */
    private int f209050y;

    /* JADX INFO: renamed from: z */
    private int f209051z;

    /* JADX INFO: renamed from: L */
    private int f209041L = -1;

    /* JADX INFO: renamed from: O */
    private boolean f209044O = false;

    /* JADX INFO: renamed from: C */
    private int f209032C = -1;

    /* JADX INFO: renamed from: D */
    private int f209033D = -1;

    /* JADX INFO: renamed from: G */
    private int f209036G = -1;

    /* JADX INFO: renamed from: F */
    private int f209035F = -1;

    /* JADX INFO: renamed from: E */
    private int f209034E = -1;

    /* JADX INFO: renamed from: M */
    private Bitmap f209042M = null;

    /* JADX INFO: renamed from: I */
    private boolean f209038I = false;

    /* JADX INFO: renamed from: J */
    private int f209039J = -1;

    /* JADX INFO: renamed from: K */
    private SurfaceTexture f209040K = null;

    /* JADX INFO: renamed from: B */
    private long f209031B = -1;

    /* JADX INFO: renamed from: P */
    private int f209045P = -1;

    /* JADX INFO: renamed from: Q */
    private int f209046Q = -1;

    /* JADX INFO: renamed from: R */
    private boolean f209047R = false;

    public GLMulViewTextureFilter(int i, int i2, int i3, int i4) {
        this.f209048S = null;
        this.f209051z = i2;
        this.f209030A = i;
        this.f209049x = i3;
        this.f209050y = i4;
        qnw qnwVar = new qnw();
        this.f209048S = qnwVar;
        if (this.f209049x == 7) {
            qnwVar.setOESMode(false);
        }
        this.f209048S.initWithGLContext();
    }

    /* JADX INFO: renamed from: e2 */
    private void m223354e2() {
        int i = this.f209050y;
        if (i == 0) {
            this.f209048S.setRenderSize(this.f209046Q, this.f209045P);
        } else {
            if (i != 1) {
                return;
            }
            this.f209048S.setDisplayMode(this.f209046Q, this.f209045P, 2);
            this.f209048S.setRenderSize(this.f209036G, this.f209035F);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public int m223355Q1() {
        return this.f209050y;
    }

    /* JADX INFO: renamed from: R1 */
    public AidSource.FirstFrameDrawCallback m223356R1() {
        return this.f209037H;
    }

    /* JADX INFO: renamed from: S1 */
    public boolean m223357S1() {
        return this.f209038I;
    }

    /* JADX INFO: renamed from: T1 */
    public int m223358T1() {
        if (this.f209044O || this.f209032C < 0 || this.f209033D < 0 || this.f209036G <= 0 || this.f209035F <= 0 || this.f209034E < 0 || this.f209046Q <= 0 || this.f209045P <= 0) {
            return -1;
        }
        return this.f209041L;
    }

    /* JADX INFO: renamed from: U1 */
    public int m223359U1() {
        return this.f209049x;
    }

    /* JADX INFO: renamed from: V1 */
    public int m223360V1() {
        return this.f209045P;
    }

    /* JADX INFO: renamed from: W1 */
    public int m223361W1() {
        return this.f209046Q;
    }

    /* JADX INFO: renamed from: X1 */
    public long m223362X1() {
        return this.f209031B;
    }

    /* JADX INFO: renamed from: Y1 */
    public int m223363Y1() {
        return this.f209035F;
    }

    /* JADX INFO: renamed from: Z1 */
    public int m223364Z1() {
        return this.f209036G;
    }

    /* JADX INFO: renamed from: a2 */
    public int m223365a2() {
        return this.f209032C;
    }

    /* JADX INFO: renamed from: b2 */
    public int m223366b2() {
        return this.f209033D;
    }

    /* JADX INFO: renamed from: c2 */
    public int m223367c2() {
        return this.f209034E;
    }

    /* JADX INFO: renamed from: d2 */
    public void m223368d2(boolean z) {
        this.f209044O = z;
    }

    @Override // tv.danmaku.ijk.media.processing.MMTextureResourceInput, p153l.gfj, p153l.wej
    public void drawFrame() {
        this.f209048S.drawFrame();
        this.f209041L = this.f209048S.getTextOutID();
    }

    /* JADX INFO: renamed from: f2 */
    public void m223369f2(AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        this.f209037H = firstFrameDrawCallback;
    }

    /* JADX INFO: renamed from: g2 */
    public void m223370g2(boolean z) {
        this.f209038I = z;
    }

    /* JADX INFO: renamed from: h2 */
    public void m223371h2(int i, int i2) {
        this.f209045P = i2;
        this.f209046Q = i;
    }

    /* JADX INFO: renamed from: i2 */
    public void m223372i2(long j) {
        this.f209031B = j;
    }

    /* JADX INFO: renamed from: j2 */
    public void m223373j2(int i, int i2, int i3, int i4, int i5) {
        this.f209032C = i;
        this.f209033D = i2;
        this.f209036G = i3;
        this.f209035F = i4;
        this.f209034E = i5;
    }

    /* JADX INFO: renamed from: k2 */
    public void m223374k2(int i, SurfaceTexture surfaceTexture) {
        this.f209039J = i;
        this.f209040K = surfaceTexture;
        if (this.f209045P <= 0 || this.f209046Q <= 0 || i < 0) {
            this.f209041L = -1;
        } else {
            m223354e2();
            this.f209048S.loadTexture(i, surfaceTexture);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m223375l2(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f209041L = -1;
            return;
        }
        Bitmap bitmap2 = this.f209042M;
        if (bitmap2 != bitmap) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f209042M.recycle();
                this.f209042M = null;
            }
            this.f209042M = bitmap;
            this.f209043N = 1;
            int width = bitmap.getWidth();
            int height = this.f209042M.getHeight();
            boolean z = this.f209047R;
            if (!z || width != this.f209046Q || height != this.f209045P) {
                if (!z) {
                    this.f209047R = true;
                }
                this.f209046Q = width;
                this.f209045P = height;
            }
        }
        this.f209048S.loadTexture(this.f209042M);
        this.f209039J = this.f209048S.getBitmapTextureID();
        this.f209040K = this.f209048S.getBitmapSurfaceTexture();
        m223354e2();
        this.f209048S.drawFrame();
        this.f209041L = this.f209048S.getTextOutID();
    }

    public void release() {
        qnw qnwVar = this.f209048S;
        if (qnwVar != null) {
            qnwVar.destroy();
            this.f209048S = null;
        }
    }
}
