package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class v4r0 {

    /* JADX INFO: renamed from: a */
    public final p4r0 f179971a;

    /* JADX INFO: renamed from: b */
    public final u4r0 f179972b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public r4r0 f179973c;

    /* JADX INFO: renamed from: d */
    public final int f179974d;

    public v4r0(s4r0 s4r0Var, u4r0 u4r0Var, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f179972b = u4r0Var;
        this.f179974d = i;
        this.f179971a = new p4r0(s4r0Var, j, 0L, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: f */
    public static final int m197054f(k5r0 k5r0Var, long j, s6r0 s6r0Var) {
        if (j == k5r0Var.zzf()) {
            return 0;
        }
        s6r0Var.f162847a = j;
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m197055g(k5r0 k5r0Var, long j) throws IOException {
        long jZzf = j - k5r0Var.zzf();
        if (jZzf < 0 || jZzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((z4r0) k5r0Var).m217119k((int) jZzf, false);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m197056a(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        while (true) {
            r4r0 r4r0Var = this.f179973c;
            f5v0.m119531b(r4r0Var);
            long j = r4r0Var.f157722f;
            long j2 = r4r0Var.f157723g - j;
            int i = this.f179974d;
            long j3 = r4r0Var.f157724h;
            if (j2 <= i) {
                m197058c(false, j);
                return m197054f(k5r0Var, j, s6r0Var);
            }
            if (!m197055g(k5r0Var, j3)) {
                return m197054f(k5r0Var, j3, s6r0Var);
            }
            k5r0Var.zzj();
            t4r0 t4r0VarMo140340a = this.f179972b.mo140340a(k5r0Var, r4r0Var.f157718b);
            int i2 = t4r0VarMo140340a.f167747a;
            if (i2 == -3) {
                m197058c(false, j3);
                return m197054f(k5r0Var, j3, s6r0Var);
            }
            if (i2 == -2) {
                r4r0.m177830h(r4r0Var, t4r0VarMo140340a.f167748b, t4r0VarMo140340a.f167749c);
            } else {
                if (i2 != -1) {
                    m197055g(k5r0Var, t4r0VarMo140340a.f167749c);
                    m197058c(true, t4r0VarMo140340a.f167749c);
                    return m197054f(k5r0Var, t4r0VarMo140340a.f167749c, s6r0Var);
                }
                r4r0.m177829g(r4r0Var, t4r0VarMo140340a.f167748b, t4r0VarMo140340a.f167749c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final v6r0 m197057b() {
        return this.f179971a;
    }

    /* JADX INFO: renamed from: c */
    public final void m197058c(boolean z, long j) {
        this.f179973c = null;
        this.f179972b.zzb();
    }

    /* JADX INFO: renamed from: d */
    public final void m197059d(long j) {
        r4r0 r4r0Var = this.f179973c;
        if (r4r0Var == null || r4r0Var.f157717a != j) {
            p4r0 p4r0Var = this.f179971a;
            this.f179973c = new r4r0(j, p4r0Var.m167411g(j), 0L, p4r0Var.f147205c, p4r0Var.f147206d, p4r0Var.f147207e, p4r0Var.f147208f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m197060e() {
        return this.f179973c != null;
    }
}
