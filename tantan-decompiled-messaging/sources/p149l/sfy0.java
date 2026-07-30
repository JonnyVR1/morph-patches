package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sfy0 implements mfy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f164351a;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f164351a = uix0VarM193968e.m193967d("measurement.gmscore_network_migration", false);
        uix0VarM193968e.m193965b("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // p149l.mfy0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.mfy0
    public final boolean zzb() {
        return f164351a.m154651b().booleanValue();
    }
}
