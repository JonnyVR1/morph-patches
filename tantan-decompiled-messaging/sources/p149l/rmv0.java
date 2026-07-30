package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class rmv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f160121a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f160122b;

    /* JADX INFO: renamed from: c */
    public final Executor f160123c;

    /* JADX INFO: renamed from: d */
    public final int f160124d;

    /* JADX INFO: renamed from: e */
    public final boolean f160125e;

    /* JADX INFO: renamed from: f */
    public final boolean f160126f;

    /* JADX INFO: renamed from: g */
    public final p1t0 f160127g;

    public rmv0(p1t0 p1t0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.f160127g = p1t0Var;
        this.f160121a = context;
        this.f160122b = scheduledExecutorService;
        this.f160123c = executor;
        this.f160124d = i;
        this.f160125e = z;
        this.f160126f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ smv0 m180049a(AdvertisingIdClient.C2070a c2070a) {
        acw0 acw0Var = new acw0();
        if (!this.f160125e) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132051R2)).booleanValue()) {
                ecw0 ecw0VarM115755k = ecw0.m115755k(this.f160121a);
                Objects.requireNonNull(c2070a);
                String strM12233a = c2070a.m12233a();
                Objects.requireNonNull(strM12233a);
                acw0Var = ecw0VarM115755k.m115757j(strM12233a, this.f160121a.getPackageName(), ((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), this.f160126f);
            } else if (this.f160125e) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132063S2)).booleanValue()) {
                    try {
                        ecw0 ecw0VarM115755k2 = ecw0.m115755k(this.f160121a);
                        Objects.requireNonNull(c2070a);
                        String strM12233a2 = c2070a.m12233a();
                        Objects.requireNonNull(strM12233a2);
                        acw0Var = ecw0VarM115755k2.m115757j(strM12233a2, this.f160121a.getPackageName(), ((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), this.f160126f);
                    } catch (IOException | IllegalArgumentException e) {
                        vny0.m199079q().m212290w(e, "AdIdInfoSignalSource.getPaidV1");
                        acw0Var = new acw0();
                    }
                }
            }
        } else if (this.f160125e) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132063S2)).booleanValue()) {
                ecw0 ecw0VarM115755k3 = ecw0.m115755k(this.f160121a);
                Objects.requireNonNull(c2070a);
                String strM12233a3 = c2070a.m12233a();
                Objects.requireNonNull(strM12233a3);
                acw0Var = ecw0VarM115755k3.m115757j(strM12233a3, this.f160121a.getPackageName(), ((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), this.f160126f);
            }
        }
        return new smv0(c2070a, null, acw0Var);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ smv0 m180050b(Throwable th) {
        exr0.m118703b();
        ContentResolver contentResolver = this.f160121a.getContentResolver();
        return new smv0(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new acw0());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 40;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132085U0)).booleanValue()) {
            return jmw0.m142234g(new Exception("Did not ad Ad ID into query param."));
        }
        return jmw0.m142232e((amw0) jmw0.m142242o(jmw0.m142240m(amw0.m97696C(this.f160127g.m167116a(this.f160121a, this.f160124d)), new yew0() { // from class: l.pmv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f150292a.m180049a((AdvertisingIdClient.C2070a) obj);
            }
        }, this.f160123c), ((Long) d1s0.m109677c().m144697a(m7s0.f132097V0)).longValue(), TimeUnit.MILLISECONDS, this.f160122b), Throwable.class, new yew0() { // from class: l.qmv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f155346a.m180050b((Throwable) obj);
            }
        }, this.f160123c);
    }
}
