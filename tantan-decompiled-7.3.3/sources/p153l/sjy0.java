package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class sjy0 implements jjy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f169200a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f169201b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Boolean> f169202c;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f169200a = asx0VarM100005e.m100004d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f169201b = asx0VarM100005e.m100004d("measurement.defensively_copy_bundles_validate_default_params", true);
        f169202c = asx0VarM100005e.m100004d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // p153l.jjy0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.jjy0
    public final boolean zzb() {
        return f169200a.m187571b().booleanValue();
    }

    @Override // p153l.jjy0
    public final boolean zzc() {
        return f169201b.m187571b().booleanValue();
    }

    @Override // p153l.jjy0
    public final boolean zzd() {
        return f169202c.m187571b().booleanValue();
    }
}
