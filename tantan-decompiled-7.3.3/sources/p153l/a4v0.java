package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzead;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class a4v0 implements e5v0 {

    /* JADX INFO: renamed from: h */
    public static final Pattern f68446h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a */
    public final v2v0 f68447a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f68448b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f68449c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f68450d;

    /* JADX INFO: renamed from: e */
    public final u9v0 f68451e;

    /* JADX INFO: renamed from: f */
    public final cew0 f68452f;

    /* JADX INFO: renamed from: g */
    public final Context f68453g;

    public a4v0(Context context, o7w0 o7w0Var, v2v0 v2v0Var, xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, u9v0 u9v0Var, cew0 cew0Var) {
        this.f68453g = context;
        this.f68449c = o7w0Var;
        this.f68447a = v2v0Var;
        this.f68448b = xvw0Var;
        this.f68450d = scheduledExecutorService;
        this.f68451e = u9v0Var;
        this.f68452f = cew0Var;
    }

    @Override // p153l.e5v0
    /* JADX INFO: renamed from: a */
    public final hpr mo95996a(zzbze zzbzeVar) {
        Context context = this.f68453g;
        hpr hprVarM199153b = this.f68447a.m199153b(zzbzeVar);
        rdw0 rdw0VarM176209a = qdw0.m176209a(context, 11);
        bew0.m103788d(hprVarM199153b, rdw0VarM176209a);
        hpr hprVarM173987n = pvw0.m173987n(hprVarM199153b, new xuw0() { // from class: l.x3v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f192308a.m95997c((InputStream) obj);
            }
        }, this.f68448b);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168503v5)).booleanValue()) {
            hprVarM173987n = pvw0.m173979f(pvw0.m173988o(hprVarM173987n, ((Integer) jas0.m144075c().m176505a(sgs0.f168527x5)).intValue(), TimeUnit.SECONDS, this.f68450d), TimeoutException.class, new xuw0() { // from class: l.y3v0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return pvw0.m173980g(new zzead(5));
                }
            }, oct0.f146738f);
        }
        bew0.m103785a(hprVarM173987n, this.f68452f, rdw0VarM176209a);
        pvw0.m173991r(hprVarM173987n, new z3v0(this), oct0.f146738f);
        return hprVarM173987n;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m95997c(InputStream inputStream) throws Exception {
        return pvw0.m173981h(new b7w0(new y6w0(this.f68449c), a7w0.m96387a(new InputStreamReader(inputStream))));
    }
}
