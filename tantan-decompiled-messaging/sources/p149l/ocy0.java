package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ocy0 implements fcy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f143133a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f143134b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.client.ad_id_consent_fix", true);
        uix0VarM193968e.m193967d("measurement.service.consent.aiid_reset_fix", false);
        uix0VarM193968e.m193967d("measurement.service.consent.aiid_reset_fix2", true);
        uix0VarM193968e.m193967d("measurement.service.consent.app_start_fix", true);
        f143133a = uix0VarM193968e.m193967d("measurement.service.consent.params_on_fx", true);
        f143134b = uix0VarM193968e.m193967d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // p149l.fcy0
    public final boolean zza() {
        return f143133a.m154651b().booleanValue();
    }

    @Override // p149l.fcy0
    public final boolean zzb() {
        return f143134b.m154651b().booleanValue();
    }
}
