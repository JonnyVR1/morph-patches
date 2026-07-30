package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2260u3;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dov0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f87202a;

    /* JADX INFO: renamed from: b */
    public final y1t0 f87203b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f87204c;

    /* JADX INFO: renamed from: d */
    public final Executor f87205d;

    /* JADX INFO: renamed from: e */
    public final String f87206e;

    /* JADX INFO: renamed from: f */
    public final p1t0 f87207f;

    public dov0(p1t0 p1t0Var, int i, Context context, y1t0 y1t0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f87207f = p1t0Var;
        this.f87202a = context;
        this.f87203b = y1t0Var;
        this.f87204c = scheduledExecutorService;
        this.f87205d = executor;
        this.f87206e = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eov0 m112827a(Exception exc) {
        this.f87203b.m212290w(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 44;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142232e((amw0) jmw0.m142242o(jmw0.m142240m(amw0.m97696C(jmw0.m142238k(new qlw0() { // from class: l.aov0
            @Override // p149l.qlw0
            public final gnr zza() {
                return jmw0.m142235h(null);
            }
        }, this.f87205d)), new yew0() { // from class: l.bov0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new eov0(str);
            }
        }, this.f87205d), ((Long) d1s0.m109677c().m144697a(m7s0.f132097V0)).longValue(), TimeUnit.MILLISECONDS, this.f87204c), Exception.class, new yew0() { // from class: l.cov0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                this.f81869a.m112827a((Exception) obj);
                return null;
            }
        }, C2260u3.m13341b());
    }
}
