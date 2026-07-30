package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class y9y0 implements aay0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f197091a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f197092b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Boolean> f197093c;

    /* JADX INFO: renamed from: d */
    public static final mhx0<Boolean> f197094d;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f197091a = uix0VarM193968e.m193967d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f197092b = uix0VarM193968e.m193967d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f197093c = uix0VarM193968e.m193967d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f197094d = uix0VarM193968e.m193967d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // p149l.aay0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.aay0
    public final boolean zzb() {
        return f197091a.m154651b().booleanValue();
    }

    @Override // p149l.aay0
    public final boolean zzc() {
        return f197092b.m154651b().booleanValue();
    }

    @Override // p149l.aay0
    public final boolean zzd() {
        return f197093c.m154651b().booleanValue();
    }

    @Override // p149l.aay0
    public final boolean zze() {
        return f197094d.m154651b().booleanValue();
    }
}
