package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wtr0 implements aer0 {

    /* JADX INFO: renamed from: a */
    public final nnw0 f190804a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f190805b = new bgw0();

    /* JADX INFO: renamed from: c */
    public final int f190806c;

    public wtr0(int i, nnw0 nnw0Var, int i2) {
        this.f190806c = i;
        this.f190804a = nnw0Var;
    }

    @Override // p153l.aer0
    /* JADX INFO: renamed from: a */
    public final zdr0 mo97259a(qer0 qer0Var, long j) throws IOException {
        int iM142234a;
        int iM142234a2;
        long jZzf = qer0Var.zzf();
        int iMin = (int) Math.min(112800L, qer0Var.zzd() - jZzf);
        this.f190805b.m104266h(iMin);
        ((fer0) qer0Var).mo125313c(this.f190805b.m104271m(), 0, iMin, false);
        bgw0 bgw0Var = this.f190805b;
        int iM104278t = bgw0Var.m104278t();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (bgw0Var.m104275q() >= 188 && (iM142234a2 = (iM142234a = iur0.m142234a(bgw0Var.m104271m(), bgw0Var.m104277s(), iM104278t)) + 188) <= iM104278t) {
            long jM142235b = iur0.m142235b(bgw0Var, iM142234a, this.f190806c);
            if (jM142235b != -9223372036854775807L) {
                long jM163999b = this.f190804a.m163999b(jM142235b);
                if (jM163999b > j) {
                    return j3 == -9223372036854775807L ? zdr0.m219381d(jM163999b, jZzf) : zdr0.m219382e(jZzf + j4);
                }
                j4 = iM142234a;
                if (100000 + jM163999b > j) {
                    return zdr0.m219382e(jZzf + j4);
                }
                j3 = jM163999b;
            }
            bgw0Var.m104269k(iM142234a2);
            j2 = iM142234a2;
        }
        return j3 != -9223372036854775807L ? zdr0.m219383f(j3, jZzf + j2) : zdr0.f203937d;
    }

    @Override // p153l.aer0
    public final void zzb() {
        byte[] bArr = mpw0.f137962f;
        int length = bArr.length;
        this.f190805b.m104267i(bArr, 0);
    }
}
