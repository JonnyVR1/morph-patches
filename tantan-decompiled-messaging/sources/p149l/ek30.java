package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class ek30 extends fk30 {

    /* JADX INFO: renamed from: I */
    private int f91931I = -1;

    /* JADX INFO: renamed from: J */
    private int f91932J = -1;

    /* JADX INFO: renamed from: K */
    private int f91933K;

    /* JADX INFO: renamed from: L */
    private int f91934L;

    /* JADX INFO: renamed from: M */
    private int f91935M;

    /* JADX INFO: renamed from: N */
    private int f91936N;

    @Override // p149l.ncj
    /* JADX INFO: renamed from: G */
    public int mo116914G() {
        return this.f85415a % 2 == 1 ? this.f91935M : this.f91936N;
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: H */
    public int mo116915H() {
        return this.f85415a % 2 == 1 ? this.f91936N : this.f91935M;
    }

    @Override // p149l.z220
    /* JADX INFO: renamed from: Q */
    public int mo116916Q() {
        return this.f91936N / 2;
    }

    @Override // p149l.z220
    /* JADX INFO: renamed from: R */
    public int mo116917R() {
        return this.f91935M / 2;
    }

    @Override // p149l.z220
    /* JADX INFO: renamed from: S */
    public float[] mo116918S(int i) {
        int i2;
        float fMin;
        float fMin2;
        float fMin3;
        float fMin4;
        int i3 = this.f91935M;
        int i4 = this.f91936N;
        int i5 = this.f91932J;
        float f = 0.0f;
        float f2 = 1.0f;
        if ((i5 < 0 || i5 >= i3) && ((i2 = this.f91931I) < 0 || i2 >= i4)) {
            fMin = 0.0f;
            fMin2 = 0.0f;
            fMin3 = 0.0f;
            fMin4 = 0.0f;
        } else {
            float f3 = i3;
            fMin3 = Math.min((i5 * 1.0f) / f3, 1.0f);
            fMin2 = Math.min(1.0f - (((this.f91932J + this.f91933K) * 1.0f) / f3), 1.0f);
            float f4 = i4;
            fMin4 = Math.min((this.f91931I * 1.0f) / f4, 1.0f);
            fMin = Math.min(1.0f - (((this.f91931I + this.f91934L) * 1.0f) / f4), 1.0f);
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

    @Override // p149l.z220
    /* JADX INFO: renamed from: T */
    public int mo116919T() {
        return this.f91936N;
    }

    @Override // p149l.z220
    /* JADX INFO: renamed from: U */
    public int mo116920U() {
        return this.f91935M;
    }

    /* JADX INFO: renamed from: W */
    public void m116921W(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f91932J = i;
        this.f91931I = i2;
        this.f91933K = i3;
        this.f91934L = i4;
        this.f91935M = i5;
        this.f91936N = i6;
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: p */
    public int mo110703p() {
        return this.f85415a % 2 == 1 ? this.f91935M : this.f91936N;
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: q */
    public int mo110704q() {
        return this.f85415a % 2 == 1 ? this.f91936N : this.f91935M;
    }
}
