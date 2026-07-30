package p149l;

import com.google.android.gms.internal.ads.zzgaf;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class khv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f123232a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f123233b;

    public khv0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f123232a = ehx0Var;
        this.f123233b = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgaf zzgafVarZzn;
        ugv0 ugv0VarM203080a = wgv0.m203080a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f123233b.zzb();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132100V3)).booleanValue()) {
            zzgafVarZzn = zzgaf.zzo(new mjv0(ugv0VarM203080a, ((Integer) d1s0.m109677c().m144697a(m7s0.f132112W3)).intValue(), scheduledExecutorService));
        } else {
            zzgafVarZzn = zzgaf.zzn();
        }
        wgx0.m203089b(zzgafVarZzn);
        return zzgafVarZzn;
    }
}
