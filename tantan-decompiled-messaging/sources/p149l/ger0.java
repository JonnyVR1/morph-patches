package p149l;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class ger0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ her0 f102299a;

    public /* synthetic */ ger0(her0 her0Var, fer0 fer0Var) {
        this.f102299a = her0Var;
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        her0 her0Var = this.f102299a;
        long jM121185f = her0Var.f107398d.m121185f(j);
        long j2 = her0Var.f107396b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jM121185f);
        her0 her0Var2 = this.f102299a;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(her0Var2.f107397c - her0Var2.f107396b)).divide(BigInteger.valueOf(this.f102299a.f107400f)).longValue();
        her0 her0Var3 = this.f102299a;
        w6r0 w6r0Var = new w6r0(j, Math.max(her0Var3.f107396b, Math.min(jLongValue - 30000, her0Var3.f107397c - 1)));
        return new t6r0(w6r0Var, w6r0Var);
    }

    @Override // p149l.v6r0
    public final long zza() {
        her0 her0Var = this.f102299a;
        return her0Var.f107398d.m121184e(her0Var.f107400f);
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
