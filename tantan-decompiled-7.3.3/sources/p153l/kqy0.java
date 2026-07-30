package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class kqy0 implements lqy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f128403a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f128404b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Boolean> f128405c;

    /* JADX INFO: renamed from: d */
    public static final sqx0<Boolean> f128406d;

    /* JADX INFO: renamed from: e */
    public static final sqx0<Boolean> f128407e;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f128403a = asx0VarM100005e.m100004d("measurement.sgtm.google_signal.enable", false);
        f128404b = asx0VarM100005e.m100004d("measurement.sgtm.preview_mode_enabled", true);
        f128405c = asx0VarM100005e.m100004d("measurement.sgtm.rollout_percentage_fix", false);
        f128406d = asx0VarM100005e.m100004d("measurement.sgtm.service", true);
        f128407e = asx0VarM100005e.m100004d("measurement.sgtm.upload_queue", false);
        asx0VarM100005e.m100002b("measurement.id.sgtm", 0L);
    }

    @Override // p153l.lqy0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.lqy0
    public final boolean zzb() {
        return f128403a.m187571b().booleanValue();
    }

    @Override // p153l.lqy0
    public final boolean zzc() {
        return f128404b.m187571b().booleanValue();
    }

    @Override // p153l.lqy0
    public final boolean zzd() {
        return f128405c.m187571b().booleanValue();
    }

    @Override // p153l.lqy0
    public final boolean zze() {
        return f128406d.m187571b().booleanValue();
    }

    @Override // p153l.lqy0
    public final boolean zzf() {
        return f128407e.m187571b().booleanValue();
    }
}
