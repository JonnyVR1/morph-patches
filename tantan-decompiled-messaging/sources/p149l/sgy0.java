package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sgy0 implements ugy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f164502a;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.collection.enable_session_stitching_token.client.dev", true);
        uix0VarM193968e.m193967d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f164502a = uix0VarM193968e.m193967d("measurement.session_stitching_token_enabled", false);
        uix0VarM193968e.m193967d("measurement.link_sst_to_sid", true);
    }

    @Override // p149l.ugy0
    public final boolean zza() {
        return true;
    }

    @Override // p149l.ugy0
    public final boolean zzb() {
        return f164502a.m154651b().booleanValue();
    }
}
