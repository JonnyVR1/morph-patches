package p153l;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rvr0 {

    /* JADX INFO: renamed from: a */
    public final Executor f165053a;

    public rvr0(Handler handler) {
        this.f165053a = new pvr0(this, handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m183310a(jwr0 jwr0Var, zzaqj zzaqjVar) {
        jwr0Var.m147204q("post-error");
        ((pvr0) this.f165053a).f154323a.post(new qvr0(jwr0Var, pwr0.m174087a(zzaqjVar), null));
    }

    /* JADX INFO: renamed from: b */
    public final void m183311b(jwr0 jwr0Var, pwr0 pwr0Var, Runnable runnable) {
        jwr0Var.m147208u();
        jwr0Var.m147204q("post-response");
        ((pvr0) this.f165053a).f154323a.post(new qvr0(jwr0Var, pwr0Var, runnable));
    }
}
