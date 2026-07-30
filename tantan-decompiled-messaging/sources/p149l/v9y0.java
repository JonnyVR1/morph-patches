package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class v9y0 implements n9y0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Long> f180683a;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.client.consent_state_v1", true);
        uix0VarM193968e.m193967d("measurement.client.3p_consent_state_v1", true);
        uix0VarM193968e.m193967d("measurement.service.consent_state_v1_W36", true);
        f180683a = uix0VarM193968e.m193965b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // p149l.n9y0
    public final long zza() {
        return f180683a.m154651b().longValue();
    }
}
