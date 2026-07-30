package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class may0 implements day0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f132970a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f132971b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Boolean> f132972c;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f132970a = uix0VarM193968e.m193967d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f132971b = uix0VarM193968e.m193967d("measurement.defensively_copy_bundles_validate_default_params", true);
        f132972c = uix0VarM193968e.m193967d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // p149l.day0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.day0
    public final boolean zzb() {
        return f132970a.m154651b().booleanValue();
    }

    @Override // p149l.day0
    public final boolean zzc() {
        return f132971b.m154651b().booleanValue();
    }

    @Override // p149l.day0
    public final boolean zzd() {
        return f132972c.m154651b().booleanValue();
    }
}
