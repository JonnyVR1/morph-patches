package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class chy0 implements wgy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f81023a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Boolean> f81024b;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        uix0VarM193968e.m193967d("measurement.client.sessions.background_sessions_enabled", true);
        f81023a = uix0VarM193968e.m193967d("measurement.client.sessions.enable_fix_background_engagement", false);
        uix0VarM193968e.m193967d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f81024b = uix0VarM193968e.m193967d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        uix0VarM193968e.m193967d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        uix0VarM193968e.m193967d("measurement.client.sessions.session_id_enabled", true);
        uix0VarM193968e.m193965b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // p149l.wgy0
    public final boolean zza() {
        return f81023a.m154651b().booleanValue();
    }

    @Override // p149l.wgy0
    public final boolean zzb() {
        return f81024b.m154651b().booleanValue();
    }
}
