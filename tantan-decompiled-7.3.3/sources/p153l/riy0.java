package p153l;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class riy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ thy0 f163403a;

    public riy0(thy0 thy0Var) {
        this.f163403a = thy0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m181622a() {
        this.f163403a.mo15146h();
        if (this.f163403a.mo15142d().m98525t(this.f163403a.zzb().currentTimeMillis())) {
            this.f163403a.mo15142d().f71907n.m115832a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f163403a.zzj().m114562E().m153300a("Detected application was in foreground");
                m181624c(this.f163403a.zzb().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m181623b(long j, boolean z) {
        this.f163403a.mo15146h();
        this.f163403a.m191305A();
        if (this.f163403a.mo15142d().m98525t(j)) {
            this.f163403a.mo15142d().f71907n.m115832a(true);
            this.f163403a.mo15148j().m15137C();
        }
        this.f163403a.mo15142d().f71911r.m219991b(j);
        if (this.f163403a.mo15142d().f71907n.m115833b()) {
            m181624c(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m181624c(long j, boolean z) {
        this.f163403a.mo15146h();
        if (this.f163403a.f202159a.m100298k()) {
            this.f163403a.mo15142d().f71911r.m219991b(j);
            this.f163403a.zzj().m114562E().m153301b("Session started, time", Long.valueOf(this.f163403a.zzb().elapsedRealtime()));
            long j2 = j / 1000;
            this.f163403a.mo15150l().m15259b0("auto", "_sid", Long.valueOf(j2), j);
            this.f163403a.mo15142d().f71912s.m219991b(j2);
            this.f163403a.mo15142d().f71907n.m115832a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            this.f163403a.mo15150l().m15250V("auto", "_s", j, bundle);
            String strM105276a = this.f163403a.mo15142d().f71917x.m105276a();
            if (TextUtils.isEmpty(strM105276a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM105276a);
            this.f163403a.mo15150l().m15250V("auto", "_ssr", j, bundle2);
        }
    }
}
