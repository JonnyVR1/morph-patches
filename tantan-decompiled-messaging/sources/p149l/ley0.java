package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ley0 implements fey0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f127819a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f127820b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f127819a = uix0VarM193968e.m193967d("measurement.gbraid_campaign.gbraid.client", true);
        f127820b = uix0VarM193968e.m193967d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // p149l.fey0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.fey0
    public final boolean zzb() {
        return f127819a.m154651b().booleanValue();
    }

    @Override // p149l.fey0
    public final boolean zzc() {
        return f127820b.m154651b().booleanValue();
    }
}
