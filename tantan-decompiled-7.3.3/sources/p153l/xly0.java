package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class xly0 implements amy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f195033a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f195034b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Boolean> f195035c;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f195033a = asx0VarM100005e.m100004d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f195034b = asx0VarM100005e.m100004d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f195035c = asx0VarM100005e.m100004d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // p153l.amy0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.amy0
    public final boolean zzb() {
        return f195033a.m187571b().booleanValue();
    }

    @Override // p153l.amy0
    public final boolean zzc() {
        return f195034b.m187571b().booleanValue();
    }

    @Override // p153l.amy0
    public final boolean zzd() {
        return f195035c.m187571b().booleanValue();
    }
}
