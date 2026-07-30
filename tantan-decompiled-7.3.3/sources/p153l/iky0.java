package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class iky0 implements zjy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f115470a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f115471b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Boolean> f115472c;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.dma_consent.client", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.client_bow_check2", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.separate_service_calls_fix", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.service", true);
        f115470a = asx0VarM100005e.m100004d("measurement.dma_consent.service_database_update_fix", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.service_dcu_event", true);
        f115471b = asx0VarM100005e.m100004d("measurement.dma_consent.service_dcu_event2", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.service_npa_remote_default", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.service_split_batch_on_consent", true);
        asx0VarM100005e.m100004d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f115472c = asx0VarM100005e.m100004d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // p153l.zjy0
    public final boolean zza() {
        return f115470a.m187571b().booleanValue();
    }

    @Override // p153l.zjy0
    public final boolean zzb() {
        return f115471b.m187571b().booleanValue();
    }

    @Override // p153l.zjy0
    public final boolean zzc() {
        return f115472c.m187571b().booleanValue();
    }
}
