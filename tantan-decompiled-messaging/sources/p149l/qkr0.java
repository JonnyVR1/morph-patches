package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qkr0 implements u4r0 {

    /* JADX INFO: renamed from: a */
    public final hew0 f155157a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f155158b = new v6w0();

    /* JADX INFO: renamed from: c */
    public final int f155159c;

    public qkr0(int i, hew0 hew0Var, int i2) {
        this.f155159c = i;
        this.f155157a = hew0Var;
    }

    @Override // p149l.u4r0
    /* JADX INFO: renamed from: a */
    public final t4r0 mo140340a(k5r0 k5r0Var, long j) throws IOException {
        int iM107578a;
        int iM107578a2;
        long jZzf = k5r0Var.zzf();
        int iMin = (int) Math.min(112800L, k5r0Var.zzd() - jZzf);
        this.f155158b.m197259h(iMin);
        ((z4r0) k5r0Var).mo140051c(this.f155158b.m197264m(), 0, iMin, false);
        v6w0 v6w0Var = this.f155158b;
        int iM197271t = v6w0Var.m197271t();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (v6w0Var.m197268q() >= 188 && (iM107578a2 = (iM107578a = clr0.m107578a(v6w0Var.m197264m(), v6w0Var.m197270s(), iM197271t)) + 188) <= iM197271t) {
            long jM107579b = clr0.m107579b(v6w0Var, iM107578a, this.f155159c);
            if (jM107579b != -9223372036854775807L) {
                long jM130704b = this.f155157a.m130704b(jM107579b);
                if (jM130704b > j) {
                    return j3 == -9223372036854775807L ? t4r0.m187225d(jM130704b, jZzf) : t4r0.m187226e(jZzf + j4);
                }
                j4 = iM107578a;
                if (100000 + jM130704b > j) {
                    return t4r0.m187226e(jZzf + j4);
                }
                j3 = jM130704b;
            }
            v6w0Var.m197262k(iM107578a2);
            j2 = iM107578a2;
        }
        return j3 != -9223372036854775807L ? t4r0.m187227f(j3, jZzf + j2) : t4r0.f167746d;
    }

    @Override // p149l.u4r0
    public final void zzb() {
        byte[] bArr = ggw0.f102573f;
        int length = bArr.length;
        this.f155158b.m197260i(bArr, 0);
    }
}
