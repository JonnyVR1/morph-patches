package p149l;

/* JADX INFO: loaded from: classes6.dex */
public class e9s0 {

    /* JADX INFO: renamed from: a */
    public final String f90126a;

    /* JADX INFO: renamed from: b */
    public final Object f90127b;

    /* JADX INFO: renamed from: c */
    public final int f90128c;

    public e9s0(String str, Object obj, int i) {
        this.f90126a = str;
        this.f90127b = obj;
        this.f90128c = i;
    }

    /* JADX INFO: renamed from: a */
    public static e9s0 m115375a(String str, double d) {
        return new e9s0(str, Double.valueOf(d), 3);
    }

    /* JADX INFO: renamed from: b */
    public static e9s0 m115376b(String str, long j) {
        return new e9s0(str, Long.valueOf(j), 2);
    }

    /* JADX INFO: renamed from: c */
    public static e9s0 m115377c(String str, String str2) {
        return new e9s0(str, str2, 4);
    }

    /* JADX INFO: renamed from: d */
    public static e9s0 m115378d(String str, boolean z) {
        return new e9s0(str, Boolean.valueOf(z), 1);
    }

    /* JADX INFO: renamed from: e */
    public final Object m115379e() {
        ras0 ras0VarM187779a = tas0.m187779a();
        if (ras0VarM187779a == null) {
            if (tas0.m187780b() != null) {
                tas0.m187780b().zza();
            }
            return this.f90127b;
        }
        int i = this.f90128c - 1;
        if (i == 0) {
            return ras0VarM187779a.mo105634d(this.f90126a, ((Boolean) this.f90127b).booleanValue());
        }
        if (i == 1) {
            return ras0VarM187779a.mo105633c(this.f90126a, ((Long) this.f90127b).longValue());
        }
        String str = this.f90126a;
        return i != 2 ? ras0VarM187779a.mo105631a(str, (String) this.f90127b) : ras0VarM187779a.mo105632b(str, ((Double) this.f90127b).doubleValue());
    }
}
