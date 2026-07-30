package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class ber0 {

    /* JADX INFO: renamed from: a */
    public final vdr0 f76411a;

    /* JADX INFO: renamed from: b */
    public final aer0 f76412b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public xdr0 f76413c;

    /* JADX INFO: renamed from: d */
    public final int f76414d;

    public ber0(ydr0 ydr0Var, aer0 aer0Var, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f76412b = aer0Var;
        this.f76414d = i;
        this.f76411a = new vdr0(ydr0Var, j, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: f */
    public static final int m103775f(qer0 qer0Var, long j, yfr0 yfr0Var) {
        if (j == qer0Var.zzf()) {
            return 0;
        }
        yfr0Var.f199649a = j;
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m103776g(qer0 qer0Var, long j) throws IOException {
        long jZzf = j - qer0Var.zzf();
        if (jZzf < 0 || jZzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((fer0) qer0Var).m125319k((int) jZzf, false);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m103777a(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        while (true) {
            xdr0 xdr0Var = this.f76413c;
            lev0.m153954b(xdr0Var);
            long j = xdr0Var.f193632f;
            long j2 = xdr0Var.f193633g - j;
            int i = this.f76414d;
            long j3 = xdr0Var.f193634h;
            if (j2 <= i) {
                m103779c(false, j);
                return m103775f(qer0Var, j, yfr0Var);
            }
            if (!m103776g(qer0Var, j3)) {
                return m103775f(qer0Var, j3, yfr0Var);
            }
            qer0Var.zzj();
            zdr0 zdr0VarMo97259a = this.f76412b.mo97259a(qer0Var, xdr0Var.f193628b);
            int i2 = zdr0VarMo97259a.f203938a;
            if (i2 == -3) {
                m103779c(false, j3);
                return m103775f(qer0Var, j3, yfr0Var);
            }
            if (i2 == -2) {
                xdr0.m210486h(xdr0Var, zdr0VarMo97259a.f203939b, zdr0VarMo97259a.f203940c);
            } else {
                if (i2 != -1) {
                    m103776g(qer0Var, zdr0VarMo97259a.f203940c);
                    m103779c(true, zdr0VarMo97259a.f203940c);
                    return m103775f(qer0Var, zdr0VarMo97259a.f203940c, yfr0Var);
                }
                xdr0.m210485g(xdr0Var, zdr0VarMo97259a.f203939b, zdr0VarMo97259a.f203940c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final bgr0 m103778b() {
        return this.f76411a;
    }

    /* JADX INFO: renamed from: c */
    public final void m103779c(boolean z, long j) {
        this.f76413c = null;
        this.f76412b.zzb();
    }

    /* JADX INFO: renamed from: d */
    public final void m103780d(long j) {
        xdr0 xdr0Var = this.f76413c;
        if (xdr0Var == null || xdr0Var.f193627a != j) {
            vdr0 vdr0Var = this.f76411a;
            this.f76413c = new xdr0(j, vdr0Var.m200996g(j), 0L, vdr0Var.f183651c, vdr0Var.f183652d, vdr0Var.f183653e, vdr0Var.f183654f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m103781e() {
        return this.f76413c != null;
    }
}
