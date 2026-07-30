package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class rcy0 implements ucy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f158842a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f158843b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Boolean> f158844c;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f158842a = uix0VarM193968e.m193967d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f158843b = uix0VarM193968e.m193967d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f158844c = uix0VarM193968e.m193967d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // p149l.ucy0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.ucy0
    public final boolean zzb() {
        return f158842a.m154651b().booleanValue();
    }

    @Override // p149l.ucy0
    public final boolean zzc() {
        return f158843b.m154651b().booleanValue();
    }

    @Override // p149l.ucy0
    public final boolean zzd() {
        return f158844c.m154651b().booleanValue();
    }
}
