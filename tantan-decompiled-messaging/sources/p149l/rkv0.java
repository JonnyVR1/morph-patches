package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class rkv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final String f159886a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f159887b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f159888c;

    /* JADX INFO: renamed from: d */
    public final Context f159889d;

    /* JADX INFO: renamed from: e */
    public final iyv0 f159890e;

    /* JADX INFO: renamed from: f */
    public final xbt0 f159891f;

    public rkv0(rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, iyv0 iyv0Var, xbt0 xbt0Var) {
        this.f159887b = rmw0Var;
        this.f159888c = scheduledExecutorService;
        this.f159886a = str;
        this.f159889d = context;
        this.f159890e = iyv0Var;
        this.f159891f = xbt0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ gnr m179770a(rkv0 rkv0Var) {
        biw0 biw0VarMo135809t = rkv0Var.f159891f.mo135809t();
        kwt0 kwt0Var = new kwt0();
        kwt0Var.m147644e(rkv0Var.f159889d);
        gyv0 gyv0Var = new gyv0();
        gyv0Var.m128758J("adUnitId");
        gyv0Var.m128770e(rkv0Var.f159890e.f115494d);
        gyv0Var.m128757I(new zzq());
        gyv0Var.m128763O(true);
        kwt0Var.m147648i(gyv0Var.m128772g());
        biw0VarMo135809t.mo102125b(kwt0Var.m147649j());
        h4r0 h4r0Var = new h4r0();
        h4r0Var.m129279a(rkv0Var.f159886a);
        biw0VarMo135809t.mo102124a(h4r0Var.m129280b());
        new f4u0();
        return jmw0.m142232e(jmw0.m142240m((amw0) jmw0.m142242o(amw0.m97696C(biw0VarMo135809t.zzc().mo116597c()), ((Long) d1s0.m109677c().m144697a(m7s0.f132242g7)).longValue(), TimeUnit.MILLISECONDS, rkv0Var.f159888c), new yew0() { // from class: l.okv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                lhr0 lhr0Var = (lhr0) obj;
                return lhr0Var != null ? new skv0(lhr0Var.f128133a) : new skv0(null);
            }
        }, rkv0Var.f159887b), Exception.class, new yew0() { // from class: l.pkv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                x2t0.m206867e("", (Exception) obj);
                return new skv0(null);
            }
        }, rkv0Var.f159887b);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 33;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132229f7)).booleanValue() || this.f159890e.f115507q) ? jmw0.m142235h(new skv0(null)) : jmw0.m142238k(new qlw0() { // from class: l.qkv0
            @Override // p149l.qlw0
            public final gnr zza() {
                return rkv0.m179770a(this.f155174a);
            }
        }, this.f159887b);
    }
}
