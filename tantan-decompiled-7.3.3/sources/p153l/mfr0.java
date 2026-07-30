package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class mfr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final ofr0 f136668a;

    /* JADX INFO: renamed from: b */
    public final long f136669b;

    public mfr0(ofr0 ofr0Var, long j) {
        this.f136668a = ofr0Var;
        this.f136669b = j;
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        lev0.m153954b(this.f136668a.f147156k);
        ofr0 ofr0Var = this.f136668a;
        nfr0 nfr0Var = ofr0Var.f147156k;
        long[] jArr = nfr0Var.f141755a;
        long[] jArr2 = nfr0Var.f141756b;
        int iM159420r = mpw0.m159420r(jArr, ofr0Var.m167509b(j), true, false);
        cgr0 cgr0VarM158174c = m158174c(iM159420r == -1 ? 0L : jArr[iM159420r], iM159420r != -1 ? jArr2[iM159420r] : 0L);
        if (cgr0VarM158174c.f81726a == j || iM159420r == jArr.length - 1) {
            return new zfr0(cgr0VarM158174c, cgr0VarM158174c);
        }
        int i = iM159420r + 1;
        return new zfr0(cgr0VarM158174c, m158174c(jArr[i], jArr2[i]));
    }

    /* JADX INFO: renamed from: c */
    public final cgr0 m158174c(long j, long j2) {
        return new cgr0((j * 1000000) / ((long) this.f136668a.f147150e), this.f136669b + j2);
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f136668a.m167508a();
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
