package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class oay0 implements ray0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f142871a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f142872b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f142871a = uix0VarM193968e.m193967d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f142872b = uix0VarM193968e.m193967d("measurement.set_default_event_parameters_propagate_clear.service", false);
        uix0VarM193968e.m193965b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // p149l.ray0
    public final boolean zza() {
        return f142871a.m154651b().booleanValue();
    }

    @Override // p149l.ray0
    public final boolean zzb() {
        return f142872b.m154651b().booleanValue();
    }
}
