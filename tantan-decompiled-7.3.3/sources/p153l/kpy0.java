package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class kpy0 implements epy0 {

    /* JADX INFO: renamed from: a */
    public static final sqx0<Boolean> f128139a;

    /* JADX INFO: renamed from: b */
    public static final sqx0<Long> f128140b;

    /* JADX INFO: renamed from: c */
    public static final sqx0<Double> f128141c;

    /* JADX INFO: renamed from: d */
    public static final sqx0<Long> f128142d;

    /* JADX INFO: renamed from: e */
    public static final sqx0<Long> f128143e;

    /* JADX INFO: renamed from: f */
    public static final sqx0<String> f128144f;

    static {
        asx0 asx0VarM100005e = new asx0(xqx0.m212767a("com.google.android.gms.measurement")).m100006f().m100005e();
        f128139a = asx0VarM100005e.m100004d("measurement.test.boolean_flag", false);
        f128140b = asx0VarM100005e.m100002b("measurement.test.cached_long_flag", -1L);
        f128141c = asx0VarM100005e.m100001a("measurement.test.double_flag", -3.0d);
        f128142d = asx0VarM100005e.m100002b("measurement.test.int_flag", -2L);
        f128143e = asx0VarM100005e.m100002b("measurement.test.long_flag", -1L);
        f128144f = asx0VarM100005e.m100003c("measurement.test.string_flag", "---");
    }

    @Override // p153l.epy0
    public final double zza() {
        return f128141c.m187571b().doubleValue();
    }

    @Override // p153l.epy0
    public final long zzb() {
        return f128140b.m187571b().longValue();
    }

    @Override // p153l.epy0
    public final long zzc() {
        return f128142d.m187571b().longValue();
    }

    @Override // p153l.epy0
    public final long zzd() {
        return f128143e.m187571b().longValue();
    }

    @Override // p153l.epy0
    public final String zze() {
        return f128144f.m187571b();
    }

    @Override // p153l.epy0
    public final boolean zzf() {
        return f128139a.m187571b().booleanValue();
    }
}
