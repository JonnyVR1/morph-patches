package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class egy0 implements yfy0 {

    /* JADX INFO: renamed from: a */
    public static final mhx0<Boolean> f91266a;

    /* JADX INFO: renamed from: b */
    public static final mhx0<Long> f91267b;

    /* JADX INFO: renamed from: c */
    public static final mhx0<Double> f91268c;

    /* JADX INFO: renamed from: d */
    public static final mhx0<Long> f91269d;

    /* JADX INFO: renamed from: e */
    public static final mhx0<Long> f91270e;

    /* JADX INFO: renamed from: f */
    public static final mhx0<String> f91271f;

    static {
        uix0 uix0VarM193968e = new uix0(rhx0.m179466a("com.google.android.gms.measurement")).m193969f().m193968e();
        f91266a = uix0VarM193968e.m193967d("measurement.test.boolean_flag", false);
        f91267b = uix0VarM193968e.m193965b("measurement.test.cached_long_flag", -1L);
        f91268c = uix0VarM193968e.m193964a("measurement.test.double_flag", -3.0d);
        f91269d = uix0VarM193968e.m193965b("measurement.test.int_flag", -2L);
        f91270e = uix0VarM193968e.m193965b("measurement.test.long_flag", -1L);
        f91271f = uix0VarM193968e.m193966c("measurement.test.string_flag", "---");
    }

    @Override // p149l.yfy0
    public final double zza() {
        return f91268c.m154651b().doubleValue();
    }

    @Override // p149l.yfy0
    public final long zzb() {
        return f91267b.m154651b().longValue();
    }

    @Override // p149l.yfy0
    public final long zzc() {
        return f91269d.m154651b().longValue();
    }

    @Override // p149l.yfy0
    public final long zzd() {
        return f91270e.m154651b().longValue();
    }

    @Override // p149l.yfy0
    public final String zze() {
        return f91271f.m154651b();
    }

    @Override // p149l.yfy0
    public final boolean zzf() {
        return f91266a.m154651b().booleanValue();
    }
}
