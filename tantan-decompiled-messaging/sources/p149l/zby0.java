package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class zby0 implements ccy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f202501a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f202502b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.collection.event_safelist", true);
        f202501a = uix0VarM193968e.m193967d("measurement.service.store_null_safelist", true);
        f202502b = uix0VarM193968e.m193967d("measurement.service.store_safelist", true);
    }

    @Override // p149l.ccy0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.ccy0
    public final boolean zzb() {
        return f202501a.m154651b().booleanValue();
    }

    @Override // p149l.ccy0
    public final boolean zzc() {
        return f202502b.m154651b().booleanValue();
    }
}
