package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class j8r0 implements u4r0 {

    /* JADX INFO: renamed from: a */
    public final i6r0 f116780a;

    /* JADX INFO: renamed from: b */
    public final int f116781b;

    /* JADX INFO: renamed from: c */
    public final d6r0 f116782c = new d6r0();

    public /* synthetic */ j8r0(i6r0 i6r0Var, int i, i8r0 i8r0Var) {
        this.f116780a = i6r0Var;
        this.f116781b = i;
    }

    @Override // p149l.u4r0
    /* JADX INFO: renamed from: a */
    public final t4r0 mo140340a(k5r0 k5r0Var, long j) throws IOException {
        int i = this.f116780a.f111761c;
        long jZzf = k5r0Var.zzf();
        long jM140341b = m140341b(k5r0Var);
        long jZze = k5r0Var.zze();
        ((z4r0) k5r0Var).m217118j(Math.max(6, i), false);
        long jM140341b2 = m140341b(k5r0Var);
        long jZze2 = k5r0Var.zze();
        if (jM140341b > j || jM140341b2 <= j) {
            return jM140341b2 <= j ? t4r0.m187227f(jM140341b2, jZze2) : t4r0.m187225d(jM140341b, jZzf);
        }
        return t4r0.m187226e(jZze);
    }

    /* JADX INFO: renamed from: b */
    public final long m140341b(k5r0 k5r0Var) throws IOException {
        while (k5r0Var.zze() < k5r0Var.zzd() - 6) {
            i6r0 i6r0Var = this.f116780a;
            int i = this.f116781b;
            d6r0 d6r0Var = this.f116782c;
            long jZze = k5r0Var.zze();
            byte[] bArr = new byte[2];
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                k5r0Var.zzj();
                z4r0Var.m217118j((int) (jZze - k5r0Var.zzf()), false);
            } else {
                v6w0 v6w0Var = new v6w0(16);
                System.arraycopy(bArr, 0, v6w0Var.m197264m(), 0, 2);
                v6w0Var.m197261j(n5r0.m157995a(k5r0Var, v6w0Var.m197264m(), 2, 14));
                k5r0Var.zzj();
                z4r0Var.m217118j((int) (jZze - k5r0Var.zzf()), false);
                if (e6r0.m115110c(v6w0Var, i6r0Var, i, d6r0Var)) {
                    break;
                }
            }
            z4r0Var.m217118j(1, false);
        }
        if (k5r0Var.zze() < k5r0Var.zzd() - 6) {
            return this.f116782c.f84648a;
        }
        ((z4r0) k5r0Var).m217118j((int) (k5r0Var.zzd() - k5r0Var.zze()), false);
        return this.f116780a.f111768j;
    }

    @Override // p149l.u4r0
    public final /* synthetic */ void zzb() {
    }
}
