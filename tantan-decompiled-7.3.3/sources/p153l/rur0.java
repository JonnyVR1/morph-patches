package p153l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class rur0 {
    /* JADX INFO: renamed from: a */
    public static Pair m183217a(qer0 qer0Var) throws IOException {
        qer0Var.zzj();
        qur0 qur0VarM183220d = m183220d(1684108385, qer0Var, new bgw0(8));
        ((fer0) qer0Var).m125319k(8, false);
        return Pair.create(Long.valueOf(qer0Var.zzf()), Long.valueOf(qur0VarM183220d.f159617b));
    }

    /* JADX INFO: renamed from: b */
    public static pur0 m183218b(qer0 qer0Var) throws IOException {
        byte[] bArr;
        bgw0 bgw0Var = new bgw0(16);
        qur0 qur0VarM183220d = m183220d(1718449184, qer0Var, bgw0Var);
        lev0.m153958f(qur0VarM183220d.f159617b >= 16);
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(bgw0Var.m104271m(), 0, 16, false);
        bgw0Var.m104269k(0);
        int iM104284z = bgw0Var.m104284z();
        int iM104284z2 = bgw0Var.m104284z();
        int iM104283y = bgw0Var.m104283y();
        int iM104283y2 = bgw0Var.m104283y();
        int iM104284z3 = bgw0Var.m104284z();
        int iM104284z4 = bgw0Var.m104284z();
        int i = ((int) qur0VarM183220d.f159617b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            fer0Var.mo125313c(bArr, 0, i, false);
        } else {
            bArr = mpw0.f137962f;
        }
        byte[] bArr2 = bArr;
        ((fer0) qer0Var).m125319k((int) (qer0Var.zze() - qer0Var.zzf()), false);
        return new pur0(iM104284z, iM104284z2, iM104283y, iM104283y2, iM104284z3, iM104284z4, bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m183219c(qer0 qer0Var) throws IOException {
        bgw0 bgw0Var = new bgw0(8);
        int i = qur0.m178224a(qer0Var, bgw0Var).f159616a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((fer0) qer0Var).mo125313c(bgw0Var.m104271m(), 0, 4, false);
        bgw0Var.m104269k(0);
        int iM104280v = bgw0Var.m104280v();
        if (iM104280v == 1463899717) {
            return true;
        }
        y4w0.m214275c("WavHeaderReader", "Unsupported form type: " + iM104280v);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static qur0 m183220d(int i, qer0 qer0Var, bgw0 bgw0Var) throws IOException {
        qur0 qur0VarM178224a = qur0.m178224a(qer0Var, bgw0Var);
        while (true) {
            int i2 = qur0VarM178224a.f159616a;
            if (i2 == i) {
                return qur0VarM178224a;
            }
            y4w0.m214278f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = qur0VarM178224a.f159617b + 8;
            if (j > 2147483647L) {
                throw zzcc.zzc("Chunk is too large (~2GB+) to skip; id: " + qur0VarM178224a.f159616a);
            }
            ((fer0) qer0Var).m125319k((int) j, false);
            qur0VarM178224a = qur0.m178224a(qer0Var, bgw0Var);
        }
    }
}
