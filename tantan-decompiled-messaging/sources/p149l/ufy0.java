package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ufy0 implements wfy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f176338a;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.sdk.collection.enable_extend_user_property_size", true);
        uix0VarM193968e.m193967d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f176338a = uix0VarM193968e.m193967d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        uix0VarM193968e.m193965b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // p149l.wfy0
    public final boolean zza() {
        return f176338a.m154651b().booleanValue();
    }
}
