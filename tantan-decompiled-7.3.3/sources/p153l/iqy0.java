package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class iqy0 implements cqy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f116478a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f116479b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.client.sessions.background_sessions_enabled", true);
        f116478a = asx0VarM100005e.m100004d("measurement.client.sessions.enable_fix_background_engagement", false);
        asx0VarM100005e.m100004d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f116479b = asx0VarM100005e.m100004d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        asx0VarM100005e.m100004d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        asx0VarM100005e.m100004d("measurement.client.sessions.session_id_enabled", true);
        asx0VarM100005e.m100002b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // p153l.cqy0
    public final boolean zza() {
        return f116478a.m187571b().booleanValue();
    }

    @Override // p153l.cqy0
    public final boolean zzb() {
        return f116479b.m187571b().booleanValue();
    }
}
