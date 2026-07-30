package p149l;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class l9y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n8y0 f127153a;

    public l9y0(n8y0 n8y0Var) {
        this.f127153a = n8y0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m149111a() {
        this.f127153a.mo15092h();
        if (this.f127153a.mo15088d().m192708t(this.f127153a.zzb().currentTimeMillis())) {
            this.f127153a.mo15088d().f175526n.m207309a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f127153a.zzj().m211416E().m123936a("Detected application was in foreground");
                m149113c(this.f127153a.zzb().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m149112b(long j, boolean z) {
        this.f127153a.mo15092h();
        this.f127153a.m158512A();
        if (this.f127153a.mo15088d().m192708t(j)) {
            this.f127153a.mo15088d().f175526n.m207309a(true);
            this.f127153a.mo15094j().m15083C();
        }
        this.f127153a.mo15088d().f175530r.m187783b(j);
        if (this.f127153a.mo15088d().f175526n.m207310b()) {
            m149113c(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m149113c(long j, boolean z) {
        this.f127153a.mo15092h();
        if (this.f127153a.f165891a.m194118k()) {
            this.f127153a.mo15088d().f175530r.m187783b(j);
            this.f127153a.zzj().m211416E().m123937b("Session started, time", Long.valueOf(this.f127153a.zzb().elapsedRealtime()));
            long j2 = j / 1000;
            this.f127153a.mo15096l().m15205b0("auto", "_sid", Long.valueOf(j2), j);
            this.f127153a.mo15088d().f175531s.m187783b(j2);
            this.f127153a.mo15088d().f175526n.m207309a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            this.f127153a.mo15096l().m15196V("auto", "_s", j, bundle);
            String strM197913a = this.f127153a.mo15088d().f175536x.m197913a();
            if (TextUtils.isEmpty(strM197913a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM197913a);
            this.f127153a.mo15096l().m15196V("auto", "_ssr", j, bundle2);
        }
    }
}
