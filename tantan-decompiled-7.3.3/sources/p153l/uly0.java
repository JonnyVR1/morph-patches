package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class uly0 implements lly0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f179586a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f179587b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.client.ad_id_consent_fix", true);
        asx0VarM100005e.m100004d("measurement.service.consent.aiid_reset_fix", false);
        asx0VarM100005e.m100004d("measurement.service.consent.aiid_reset_fix2", true);
        asx0VarM100005e.m100004d("measurement.service.consent.app_start_fix", true);
        f179586a = asx0VarM100005e.m100004d("measurement.service.consent.params_on_fx", true);
        f179587b = asx0VarM100005e.m100004d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // p153l.lly0
    public final boolean zza() {
        return f179586a.m187571b().booleanValue();
    }

    @Override // p153l.lly0
    public final boolean zzb() {
        return f179587b.m187571b().booleanValue();
    }
}
