package p153l;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class mnr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nnr0 f137725a;

    public /* synthetic */ mnr0(nnr0 nnr0Var, lnr0 lnr0Var) {
        this.f137725a = nnr0Var;
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        nnr0 nnr0Var = this.f137725a;
        long jM155098f = nnr0Var.f142867d.m155098f(j);
        long j2 = nnr0Var.f142865b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jM155098f);
        nnr0 nnr0Var2 = this.f137725a;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(nnr0Var2.f142866c - nnr0Var2.f142865b)).divide(BigInteger.valueOf(this.f137725a.f142869f)).longValue();
        nnr0 nnr0Var3 = this.f137725a;
        cgr0 cgr0Var = new cgr0(j, Math.max(nnr0Var3.f142865b, Math.min(jLongValue - 30000, nnr0Var3.f142866c - 1)));
        return new zfr0(cgr0Var, cgr0Var);
    }

    @Override // p153l.bgr0
    public final long zza() {
        nnr0 nnr0Var = this.f137725a;
        return nnr0Var.f142867d.m155097e(nnr0Var.f142869f);
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
