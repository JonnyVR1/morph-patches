package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class ss30 extends ts30 {

    /* JADX INFO: renamed from: I */
    private int f170429I = -1;

    /* JADX INFO: renamed from: J */
    private int f170430J = -1;

    /* JADX INFO: renamed from: K */
    private int f170431K;

    /* JADX INFO: renamed from: L */
    private int f170432L;

    /* JADX INFO: renamed from: M */
    private int f170433M;

    /* JADX INFO: renamed from: N */
    private int f170434N;

    @Override // p153l.hfj
    /* JADX INFO: renamed from: G */
    public int mo134798G() {
        return this.f193940a % 2 == 1 ? this.f170433M : this.f170434N;
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: H */
    public int mo134799H() {
        return this.f193940a % 2 == 1 ? this.f170434N : this.f170433M;
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: Q */
    public int mo134338Q() {
        return this.f170434N / 2;
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: R */
    public int mo134339R() {
        return this.f170433M / 2;
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: S */
    public float[] mo134340S(int i) {
        int i2;
        float fMin;
        float fMin2;
        float fMin3;
        float fMin4;
        int i3 = this.f170433M;
        int i4 = this.f170434N;
        int i5 = this.f170430J;
        float f = 0.0f;
        float f2 = 1.0f;
        if ((i5 < 0 || i5 >= i3) && ((i2 = this.f170429I) < 0 || i2 >= i4)) {
            fMin = 0.0f;
            fMin2 = 0.0f;
            fMin3 = 0.0f;
            fMin4 = 0.0f;
        } else {
            float f3 = i3;
            fMin3 = Math.min((i5 * 1.0f) / f3, 1.0f);
            fMin2 = Math.min(1.0f - (((this.f170430J + this.f170431K) * 1.0f) / f3), 1.0f);
            float f4 = i4;
            fMin4 = Math.min((this.f170429I * 1.0f) / f4, 1.0f);
            fMin = Math.min(1.0f - (((this.f170429I + this.f170432L) * 1.0f) / f4), 1.0f);
        }
        float f5 = fMin3 + 0.0f;
        float f6 = 1.0f - fMin2;
        float f7 = fMin4 + 0.0f;
        float f8 = 1.0f - fMin;
        if (i != 0) {
            if (i == 1) {
                f5 = f6;
                f6 = f5;
            } else if (i != 2) {
                f6 = 0.0f;
                f5 = 1.0f;
            }
            f = f8;
            f2 = f7;
        } else {
            f2 = f8;
            f = f7;
        }
        return new float[]{f, f2, f6, f5};
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: T */
    public int mo134341T() {
        return this.f170434N;
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: U */
    public int mo134342U() {
        return this.f170433M;
    }

    /* JADX INFO: renamed from: W */
    public void m187685W(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f170430J = i;
        this.f170429I = i2;
        this.f170431K = i3;
        this.f170432L = i4;
        this.f170433M = i5;
        this.f170434N = i6;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: p */
    public int mo187686p() {
        return this.f193940a % 2 == 1 ? this.f170433M : this.f170434N;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: q */
    public int mo187687q() {
        return this.f193940a % 2 == 1 ? this.f170434N : this.f170433M;
    }
}
