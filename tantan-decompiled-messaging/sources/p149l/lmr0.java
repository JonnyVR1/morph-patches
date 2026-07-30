package p149l;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class lmr0 {

    /* JADX INFO: renamed from: a */
    public final Executor f128818a;

    public lmr0(Handler handler) {
        this.f128818a = new jmr0(this, handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m150602a(dnr0 dnr0Var, zzaqj zzaqjVar) {
        dnr0Var.m112666q("post-error");
        ((jmr0) this.f128818a).f118702a.post(new kmr0(dnr0Var, jnr0.m142386a(zzaqjVar), null));
    }

    /* JADX INFO: renamed from: b */
    public final void m150603b(dnr0 dnr0Var, jnr0 jnr0Var, Runnable runnable) {
        dnr0Var.m112670u();
        dnr0Var.m112666q("post-response");
        ((jmr0) this.f128818a).f118702a.post(new kmr0(dnr0Var, jnr0Var, runnable));
    }
}
