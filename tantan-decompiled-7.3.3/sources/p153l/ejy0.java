package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ejy0 implements gjy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f94329a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f94330b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Boolean> f94331c;

    /* JADX INFO: renamed from: d */
    public static final sqx0<Boolean> f94332d;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f94329a = asx0VarM100005e.m100004d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f94330b = asx0VarM100005e.m100004d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f94331c = asx0VarM100005e.m100004d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f94332d = asx0VarM100005e.m100004d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // p153l.gjy0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.gjy0
    public final boolean zzb() {
        return f94329a.m187571b().booleanValue();
    }

    @Override // p153l.gjy0
    public final boolean zzc() {
        return f94330b.m187571b().booleanValue();
    }

    @Override // p153l.gjy0
    public final boolean zzd() {
        return f94331c.m187571b().booleanValue();
    }

    @Override // p153l.gjy0
    public final boolean zze() {
        return f94332d.m187571b().booleanValue();
    }
}
