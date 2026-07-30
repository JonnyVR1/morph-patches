package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2283u3;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class jxv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f123085a;

    /* JADX INFO: renamed from: b */
    public final ebt0 f123086b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f123087c;

    /* JADX INFO: renamed from: d */
    public final Executor f123088d;

    /* JADX INFO: renamed from: e */
    public final String f123089e;

    /* JADX INFO: renamed from: f */
    public final vat0 f123090f;

    public jxv0(vat0 vat0Var, int i, Context context, ebt0 ebt0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f123090f = vat0Var;
        this.f123085a = context;
        this.f123086b = ebt0Var;
        this.f123087c = scheduledExecutorService;
        this.f123088d = executor;
        this.f123089e = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kxv0 m147429a(Exception exc) {
        this.f123086b.m120275w(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 44;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173978e((gvw0) pvw0.m173988o(pvw0.m173986m(gvw0.m132580C(pvw0.m173984k(new wuw0() { // from class: l.gxv0
            @Override // p153l.wuw0
            public final hpr zza() {
                return pvw0.m173981h(null);
            }
        }, this.f123088d)), new eow0() { // from class: l.hxv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new kxv0(str);
            }
        }, this.f123088d), ((Long) jas0.m144075c().m176505a(sgs0.f168168V0)).longValue(), TimeUnit.MILLISECONDS, this.f123087c), Exception.class, new eow0() { // from class: l.ixv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                this.f117466a.m147429a((Exception) obj);
                return null;
            }
        }, C2283u3.m13395b());
    }
}
