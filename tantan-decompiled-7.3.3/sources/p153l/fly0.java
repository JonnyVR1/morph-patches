package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class fly0 implements ily0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f99702a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Boolean> f99703b;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        asx0VarM100005e.m100004d("measurement.collection.event_safelist", true);
        f99702a = asx0VarM100005e.m100004d("measurement.service.store_null_safelist", true);
        f99703b = asx0VarM100005e.m100004d("measurement.service.store_safelist", true);
    }

    @Override // p153l.ily0
    public final boolean zza() {
        return true;
    }

    @Override // p153l.ily0
    public final boolean zzb() {
        return f99702a.m187571b().booleanValue();
    }

    @Override // p153l.ily0
    public final boolean zzc() {
        return f99703b.m187571b().booleanValue();
    }
}
