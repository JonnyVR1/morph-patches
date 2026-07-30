package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ney0 implements pey0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f138670a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f138671b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f138670a = uix0VarM193968e.m193967d("measurement.gmscore_feature_tracking", true);
        f138671b = uix0VarM193968e.m193967d("measurement.gmscore_client_telemetry", false);
    }

    @Override // p149l.pey0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.pey0
    public final boolean zzb() {
        return f138670a.m154651b().booleanValue();
    }

    @Override // p149l.pey0
    public final boolean zzc() {
        return f138671b.m154651b().booleanValue();
    }
}
