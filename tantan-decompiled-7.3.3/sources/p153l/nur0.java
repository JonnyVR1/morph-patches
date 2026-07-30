package p153l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class nur0 implements mur0 {

    /* JADX INFO: renamed from: a */
    public final ser0 f143729a;

    /* JADX INFO: renamed from: b */
    public final sgr0 f143730b;

    /* JADX INFO: renamed from: c */
    public final pur0 f143731c;

    /* JADX INFO: renamed from: d */
    public final sqr0 f143732d;

    /* JADX INFO: renamed from: e */
    public final int f143733e;

    /* JADX INFO: renamed from: f */
    public long f143734f;

    /* JADX INFO: renamed from: g */
    public int f143735g;

    /* JADX INFO: renamed from: h */
    public long f143736h;

    public nur0(ser0 ser0Var, sgr0 sgr0Var, pur0 pur0Var, String str, int i) throws zzcc {
        this.f143729a = ser0Var;
        this.f143730b = sgr0Var;
        this.f143731c = pur0Var;
        int i2 = pur0Var.f154217b * pur0Var.f154220e;
        int i3 = pur0Var.f154219d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcc.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = pur0Var.f154218c * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.f143733e = iMax;
        znr0 znr0Var = new znr0();
        znr0Var.m220672w(str);
        znr0Var.m220657j0(i6);
        znr0Var.m220667r(i6);
        znr0Var.m220664o(iMax);
        znr0Var.m220659k0(pur0Var.f154217b);
        znr0Var.m220673x(pur0Var.f154218c);
        znr0Var.m220666q(i);
        this.f143732d = znr0Var.m220645D();
    }

    @Override // p153l.mur0
    /* JADX INFO: renamed from: a */
    public final void mo155962a(long j) {
        this.f143734f = j;
        this.f143735g = 0;
        this.f143736h = 0L;
    }

    @Override // p153l.mur0
    /* JADX INFO: renamed from: b */
    public final void mo155963b(int i, long j) {
        this.f143729a.mo101551j(new sur0(this.f143731c, 1, i, j));
        this.f143730b.mo99373d(this.f143732d);
    }

    @Override // p153l.mur0
    /* JADX INFO: renamed from: c */
    public final boolean mo155964c(qer0 qer0Var, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f143735g) < (i2 = this.f143733e)) {
            int iM125514a = fgr0.m125514a(this.f143730b, qer0Var, (int) Math.min(i2 - i, j2), true);
            if (iM125514a == -1) {
                j2 = 0;
            } else {
                this.f143735g += iM125514a;
                j2 -= (long) iM125514a;
            }
        }
        pur0 pur0Var = this.f143731c;
        int i3 = this.f143735g;
        int i4 = pur0Var.f154219d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jM159395H = this.f143734f + mpw0.m159395H(this.f143736h, 1000000L, pur0Var.f154218c, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.f143735g - i6;
            this.f143730b.mo99372c(jM159395H, 1, i6, i7, null);
            this.f143736h += (long) i5;
            this.f143735g = i7;
        }
        return j2 <= 0;
    }
}
