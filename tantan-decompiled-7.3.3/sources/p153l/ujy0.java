package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ujy0 implements xjy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f179345a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f179346b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f179345a = asx0VarM100005e.m100004d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f179346b = asx0VarM100005e.m100004d("measurement.set_default_event_parameters_propagate_clear.service", false);
        asx0VarM100005e.m100002b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // p153l.xjy0
    public final boolean zza() {
        return f179345a.m187571b().booleanValue();
    }

    @Override // p153l.xjy0
    public final boolean zzb() {
        return f179346b.m187571b().booleanValue();
    }
}
