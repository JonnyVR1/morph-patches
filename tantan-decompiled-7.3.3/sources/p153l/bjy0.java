package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class bjy0 implements tiy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Long> f77031a;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.client.consent_state_v1", true);
        asx0VarM100005e.m100004d("measurement.client.3p_consent_state_v1", true);
        asx0VarM100005e.m100004d("measurement.service.consent_state_v1_W36", true);
        f77031a = asx0VarM100005e.m100002b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // p153l.tiy0
    public final long zza() {
        return f77031a.m187571b().longValue();
    }
}
