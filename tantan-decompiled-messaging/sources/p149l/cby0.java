package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class cby0 implements tay0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f80190a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f80191b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Boolean> f80192c;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.dma_consent.client", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.client_bow_check2", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.separate_service_calls_fix", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.service", true);
        f80190a = uix0VarM193968e.m193967d("measurement.dma_consent.service_database_update_fix", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.service_dcu_event", true);
        f80191b = uix0VarM193968e.m193967d("measurement.dma_consent.service_dcu_event2", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.service_npa_remote_default", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.service_split_batch_on_consent", true);
        uix0VarM193968e.m193967d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f80192c = uix0VarM193968e.m193967d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // p149l.tay0
    public final boolean zza() {
        return f80190a.m154651b().booleanValue();
    }

    @Override // p149l.tay0
    public final boolean zzb() {
        return f80191b.m154651b().booleanValue();
    }

    @Override // p149l.tay0
    public final boolean zzc() {
        return f80192c.m154651b().booleanValue();
    }
}
