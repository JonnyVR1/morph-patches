package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class phr0 implements aer0 {

    /* JADX INFO: renamed from: a */
    public final ofr0 f152467a;

    /* JADX INFO: renamed from: b */
    public final int f152468b;

    /* JADX INFO: renamed from: c */
    public final jfr0 f152469c = new jfr0();

    public /* synthetic */ phr0(ofr0 ofr0Var, int i, ohr0 ohr0Var) {
        this.f152467a = ofr0Var;
        this.f152468b = i;
    }

    @Override // p153l.aer0
    /* JADX INFO: renamed from: a */
    public final zdr0 mo97259a(qer0 qer0Var, long j) throws IOException {
        int i = this.f152467a.f147148c;
        long jZzf = qer0Var.zzf();
        long jM172331b = m172331b(qer0Var);
        long jZze = qer0Var.zze();
        ((fer0) qer0Var).m125318j(Math.max(6, i), false);
        long jM172331b2 = m172331b(qer0Var);
        long jZze2 = qer0Var.zze();
        if (jM172331b > j || jM172331b2 <= j) {
            return jM172331b2 <= j ? zdr0.m219383f(jM172331b2, jZze2) : zdr0.m219381d(jM172331b, jZzf);
        }
        return zdr0.m219382e(jZze);
    }

    /* JADX INFO: renamed from: b */
    public final long m172331b(qer0 qer0Var) throws IOException {
        while (qer0Var.zze() < qer0Var.zzd() - 6) {
            ofr0 ofr0Var = this.f152467a;
            int i = this.f152468b;
            jfr0 jfr0Var = this.f152469c;
            long jZze = qer0Var.zze();
            byte[] bArr = new byte[2];
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                qer0Var.zzj();
                fer0Var.m125318j((int) (jZze - qer0Var.zzf()), false);
            } else {
                bgw0 bgw0Var = new bgw0(16);
                System.arraycopy(bArr, 0, bgw0Var.m104271m(), 0, 2);
                bgw0Var.m104268j(ter0.m190891a(qer0Var, bgw0Var.m104271m(), 2, 14));
                qer0Var.zzj();
                fer0Var.m125318j((int) (jZze - qer0Var.zzf()), false);
                if (kfr0.m149624c(bgw0Var, ofr0Var, i, jfr0Var)) {
                    break;
                }
            }
            fer0Var.m125318j(1, false);
        }
        if (qer0Var.zze() < qer0Var.zzd() - 6) {
            return this.f152469c.f120617a;
        }
        ((fer0) qer0Var).m125318j((int) (qer0Var.zzd() - qer0Var.zze()), false);
        return this.f152467a.f147155j;
    }

    @Override // p153l.aer0
    public final /* synthetic */ void zzb() {
    }
}
