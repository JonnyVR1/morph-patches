package p153l;

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
public final class xvv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f196434a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f196435b;

    /* JADX INFO: renamed from: c */
    public final Executor f196436c;

    /* JADX INFO: renamed from: d */
    public final int f196437d;

    /* JADX INFO: renamed from: e */
    public final boolean f196438e;

    /* JADX INFO: renamed from: f */
    public final boolean f196439f;

    /* JADX INFO: renamed from: g */
    public final vat0 f196440g;

    public xvv0(vat0 vat0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.f196440g = vat0Var;
        this.f196434a = context;
        this.f196435b = scheduledExecutorService;
        this.f196436c = executor;
        this.f196437d = i;
        this.f196438e = z;
        this.f196439f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yvv0 m213260a(AdvertisingIdClient.C2093a c2093a) {
        glw0 glw0Var = new glw0();
        if (!this.f196438e) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168122R2)).booleanValue()) {
                klw0 klw0VarM150399k = klw0.m150399k(this.f196434a);
                Objects.requireNonNull(c2093a);
                String strM12287a = c2093a.m12287a();
                Objects.requireNonNull(strM12287a);
                glw0Var = klw0VarM150399k.m150401j(strM12287a, this.f196434a.getPackageName(), ((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), this.f196439f);
            } else if (this.f196438e) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168134S2)).booleanValue()) {
                    try {
                        klw0 klw0VarM150399k2 = klw0.m150399k(this.f196434a);
                        Objects.requireNonNull(c2093a);
                        String strM12287a2 = c2093a.m12287a();
                        Objects.requireNonNull(strM12287a2);
                        glw0Var = klw0VarM150399k2.m150401j(strM12287a2, this.f196434a.getPackageName(), ((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), this.f196439f);
                    } catch (IOException | IllegalArgumentException e) {
                        bxy0.m106933q().m120275w(e, "AdIdInfoSignalSource.getPaidV1");
                        glw0Var = new glw0();
                    }
                }
            }
        } else if (this.f196438e) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168134S2)).booleanValue()) {
                klw0 klw0VarM150399k3 = klw0.m150399k(this.f196434a);
                Objects.requireNonNull(c2093a);
                String strM12287a3 = c2093a.m12287a();
                Objects.requireNonNull(strM12287a3);
                glw0Var = klw0VarM150399k3.m150401j(strM12287a3, this.f196434a.getPackageName(), ((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), this.f196439f);
            }
        }
        return new yvv0(c2093a, null, glw0Var);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yvv0 m213261b(Throwable th) {
        k6s0.m148569b();
        ContentResolver contentResolver = this.f196434a.getContentResolver();
        return new yvv0(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new glw0());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 40;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168156U0)).booleanValue()) {
            return pvw0.m173980g(new Exception("Did not ad Ad ID into query param."));
        }
        return pvw0.m173978e((gvw0) pvw0.m173988o(pvw0.m173986m(gvw0.m132580C(this.f196440g.m200631a(this.f196434a, this.f196437d)), new eow0() { // from class: l.vvv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f185990a.m213260a((AdvertisingIdClient.C2093a) obj);
            }
        }, this.f196436c), ((Long) jas0.m144075c().m176505a(sgs0.f168168V0)).longValue(), TimeUnit.MILLISECONDS, this.f196435b), Throwable.class, new eow0() { // from class: l.wvv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f190994a.m213261b((Throwable) obj);
            }
        }, this.f196436c);
    }
}
