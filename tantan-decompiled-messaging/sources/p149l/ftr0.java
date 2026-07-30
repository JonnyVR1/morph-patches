package p149l;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ftr0 {

    /* JADX INFO: renamed from: d */
    public static volatile Handler f99256d;

    /* JADX INFO: renamed from: a */
    public final bqx0 f99257a;

    /* JADX INFO: renamed from: b */
    public final Runnable f99258b;

    /* JADX INFO: renamed from: c */
    public volatile long f99259c;

    public ftr0(bqx0 bqx0Var) {
        Preconditions.checkNotNull(bqx0Var);
        this.f99257a = bqx0Var;
        this.f99258b = new dxr0(this, bqx0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m123084a() {
        this.f99259c = 0L;
        m123087f().removeCallbacks(this.f99258b);
    }

    /* JADX INFO: renamed from: b */
    public final void m123085b(long j) {
        m123084a();
        if (j >= 0) {
            this.f99259c = this.f99257a.zzb().currentTimeMillis();
            if (m123087f().postDelayed(this.f99258b, j)) {
                return;
            }
            this.f99257a.zzj().m211412A().m123937b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo99212d();

    /* JADX INFO: renamed from: e */
    public final boolean m123086e() {
        return this.f99259c != 0;
    }

    /* JADX INFO: renamed from: f */
    public final Handler m123087f() {
        Handler handler;
        if (f99256d != null) {
            return f99256d;
        }
        synchronized (ftr0.class) {
            try {
                if (f99256d == null) {
                    f99256d = new v4u0(this.f99257a.zza().getMainLooper());
                }
                handler = f99256d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
