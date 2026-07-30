package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class tny0 implements vny0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f175339a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f175340b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f175339a = asx0VarM100005e.m100004d("measurement.gmscore_feature_tracking", true);
        f175340b = asx0VarM100005e.m100004d("measurement.gmscore_client_telemetry", false);
    }

    @Override // p153l.vny0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.vny0
    public final boolean zzb() {
        return f175339a.m187571b().booleanValue();
    }

    @Override // p153l.vny0
    public final boolean zzc() {
        return f175340b.m187571b().booleanValue();
    }
}
