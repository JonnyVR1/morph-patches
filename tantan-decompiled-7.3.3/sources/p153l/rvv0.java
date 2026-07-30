package p153l;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.ads.C2124a6;
import com.google.android.gms.internal.ads.C2325z5;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class rvv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final grw0 f165062a;

    /* JADX INFO: renamed from: b */
    public final Context f165063b;

    /* JADX INFO: renamed from: c */
    public final xvw0 f165064c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f165065d;

    /* JADX INFO: renamed from: e */
    public final ncv0 f165066e;

    /* JADX INFO: renamed from: f */
    public final o7w0 f165067f;

    public rvv0(grw0 grw0Var, Context context, xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, ncv0 ncv0Var, o7w0 o7w0Var) {
        this.f165062a = grw0Var;
        this.f165063b = context;
        this.f165064c = xvw0Var;
        this.f165065d = scheduledExecutorService;
        this.f165066e = ncv0Var;
        this.f165067f = o7w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m183320a(Throwable th) throws Exception {
        tvv0 tvv0Var;
        w2t0.m204592c(this.f165063b).mo204598b(th, "TopicsSignal.fetchTopicsSignal");
        if (th instanceof SecurityException) {
            tvv0Var = new tvv0("", 2, null);
        } else if (th instanceof IllegalStateException) {
            tvv0Var = new tvv0("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            tvv0Var = new tvv0("", 4, null);
        } else {
            tvv0Var = th instanceof TimeoutException ? new tvv0("", 5, null) : new tvv0("", 0, null);
        }
        return pvw0.m173981h(tvv0Var);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.f165067f.f145318d.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // p153l.wuv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168165U9)).booleanValue() && this.f165062a.mo131904n()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168201X9)).booleanValue()) {
            }
            return pvw0.m173979f(pvw0.m173987n(gvw0.m132580C(pvw0.m173988o(this.f165066e.m162604a(false), ((Integer) jas0.m144075c().m176505a(sgs0.f168177V9)).intValue(), TimeUnit.MILLISECONDS, this.f165065d)), new xuw0() { // from class: l.pvv0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    lmx0 lmx0VarM12577L = C2124a6.m12577L();
                    for (b7j0 b7j0Var : ((xmj) obj).m211731a()) {
                        kmx0 kmx0VarM13582L = C2325z5.m13582L();
                        kmx0VarM13582L.m150497s(b7j0Var.getTopicId());
                        kmx0VarM13582L.m150495q(b7j0Var.getModelVersion());
                        kmx0VarM13582L.m150496r(b7j0Var.getTaxonomyVersion());
                        lmx0VarM12577L.m154895q((C2325z5) kmx0VarM13582L.m185950m());
                    }
                    return pvw0.m173981h(new tvv0(Base64.encodeToString(((C2124a6) lmx0VarM12577L.m185950m()).m12798h(), 1), 1, null));
                }
            }, this.f165064c), Throwable.class, new xuw0() { // from class: l.qvv0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f159813a.m183320a((Throwable) obj);
                }
            }, this.f165064c);
        }
        return pvw0.m173981h(new tvv0("", -1, null));
    }
}
