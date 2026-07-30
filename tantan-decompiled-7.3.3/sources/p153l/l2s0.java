package p153l;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l2s0 {

    /* JADX INFO: renamed from: d */
    public static volatile Handler f129796d;

    /* JADX INFO: renamed from: a */
    public final hzx0 f129797a;

    /* JADX INFO: renamed from: b */
    public final Runnable f129798b;

    /* JADX INFO: renamed from: c */
    public volatile long f129799c;

    public l2s0(hzx0 hzx0Var) {
        Preconditions.checkNotNull(hzx0Var);
        this.f129797a = hzx0Var;
        this.f129798b = new j6s0(this, hzx0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m152632a() {
        this.f129799c = 0L;
        m152635f().removeCallbacks(this.f129798b);
    }

    /* JADX INFO: renamed from: b */
    public final void m152633b(long j) {
        m152632a();
        if (j >= 0) {
            this.f129799c = this.f129797a.zzb().currentTimeMillis();
            if (m152635f().postDelayed(this.f129798b, j)) {
                return;
            }
            this.f129797a.zzj().m114558A().m153301b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo114571d();

    /* JADX INFO: renamed from: e */
    public final boolean m152634e() {
        return this.f129799c != 0;
    }

    /* JADX INFO: renamed from: f */
    public final Handler m152635f() {
        Handler handler;
        if (f129796d != null) {
            return f129796d;
        }
        synchronized (l2s0.class) {
            try {
                if (f129796d == null) {
                    f129796d = new beu0(this.f129797a.zza().getMainLooper());
                }
                handler = f129796d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
