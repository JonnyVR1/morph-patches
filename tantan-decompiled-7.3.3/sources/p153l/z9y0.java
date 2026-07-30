package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class z9y0 {

    /* JADX INFO: renamed from: a */
    public long f203525a;

    /* JADX INFO: renamed from: b */
    public float f203526b;

    /* JADX INFO: renamed from: c */
    public long f203527c;

    public z9y0() {
        this.f203525a = -9223372036854775807L;
        this.f203526b = -3.4028235E38f;
        this.f203527c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final z9y0 m219092d(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        lev0.m153956d(z);
        this.f203527c = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final z9y0 m219093e(long j) {
        this.f203525a = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final z9y0 m219094f(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        lev0.m153956d(z);
        this.f203526b = f;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final gay0 m219095g() {
        return new gay0(this, null);
    }

    public /* synthetic */ z9y0(gay0 gay0Var, u9y0 u9y0Var) {
        this.f203525a = gay0Var.f103033a;
        this.f203526b = gay0Var.f103034b;
        this.f203527c = gay0Var.f103035c;
    }
}
