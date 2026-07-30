package p153l;

import com.google.android.gms.internal.ads.zzgaf;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class qqv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f159043a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f159044b;

    public qqv0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f159043a = kqx0Var;
        this.f159044b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgaf zzgafVarZzn;
        aqv0 aqv0VarM111989a = cqv0.m111989a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f159044b.zzb();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168171V3)).booleanValue()) {
            zzgafVarZzn = zzgaf.zzo(new ssv0(aqv0VarM111989a, ((Integer) jas0.m144075c().m176505a(sgs0.f168183W3)).intValue(), scheduledExecutorService));
        } else {
            zzgafVarZzn = zzgaf.zzn();
        }
        cqx0.m111999b(zzgafVarZzn);
        return zzgafVarZzn;
    }
}
