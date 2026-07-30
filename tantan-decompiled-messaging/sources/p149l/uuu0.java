package p149l;

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
public final class uuu0 implements yvu0 {

    /* JADX INFO: renamed from: h */
    public static final Pattern f178422h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a */
    public final ptu0 f178423a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f178424b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f178425c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f178426d;

    /* JADX INFO: renamed from: e */
    public final o0v0 f178427e;

    /* JADX INFO: renamed from: f */
    public final w4w0 f178428f;

    /* JADX INFO: renamed from: g */
    public final Context f178429g;

    public uuu0(Context context, iyv0 iyv0Var, ptu0 ptu0Var, rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, o0v0 o0v0Var, w4w0 w4w0Var) {
        this.f178429g = context;
        this.f178425c = iyv0Var;
        this.f178423a = ptu0Var;
        this.f178424b = rmw0Var;
        this.f178426d = scheduledExecutorService;
        this.f178427e = o0v0Var;
        this.f178428f = w4w0Var;
    }

    @Override // p149l.yvu0
    /* JADX INFO: renamed from: a */
    public final gnr mo196005a(zzbze zzbzeVar) {
        Context context = this.f178429g;
        gnr gnrVarM171384b = this.f178423a.m171384b(zzbzeVar);
        l4w0 l4w0VarM144514a = k4w0.m144514a(context, 11);
        v4w0.m197068d(gnrVarM171384b, l4w0VarM144514a);
        gnr gnrVarM142241n = jmw0.m142241n(gnrVarM171384b, new rlw0() { // from class: l.ruu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f161142a.m196006c((InputStream) obj);
            }
        }, this.f178424b);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132432v5)).booleanValue()) {
            gnrVarM142241n = jmw0.m142233f(jmw0.m142242o(gnrVarM142241n, ((Integer) d1s0.m109677c().m144697a(m7s0.f132456x5)).intValue(), TimeUnit.SECONDS, this.f178426d), TimeoutException.class, new rlw0() { // from class: l.suu0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return jmw0.m142234g(new zzead(5));
                }
            }, i3t0.f111377f);
        }
        v4w0.m197065a(gnrVarM142241n, this.f178428f, l4w0VarM144514a);
        jmw0.m142245r(gnrVarM142241n, new tuu0(this), i3t0.f111377f);
        return gnrVarM142241n;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m196006c(InputStream inputStream) throws Exception {
        return jmw0.m142235h(new vxv0(new sxv0(this.f178425c), uxv0.m196212a(new InputStreamReader(inputStream))));
    }
}
