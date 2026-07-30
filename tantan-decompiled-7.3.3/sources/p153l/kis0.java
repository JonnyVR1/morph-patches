package p153l;

/* JADX INFO: loaded from: classes6.dex */
public class kis0 {

    /* JADX INFO: renamed from: a */
    public final String f127023a;

    /* JADX INFO: renamed from: b */
    public final Object f127024b;

    /* JADX INFO: renamed from: c */
    public final int f127025c;

    public kis0(String str, Object obj, int i) {
        this.f127023a = str;
        this.f127024b = obj;
        this.f127025c = i;
    }

    /* JADX INFO: renamed from: a */
    public static kis0 m149970a(String str, double d) {
        return new kis0(str, Double.valueOf(d), 3);
    }

    /* JADX INFO: renamed from: b */
    public static kis0 m149971b(String str, long j) {
        return new kis0(str, Long.valueOf(j), 2);
    }

    /* JADX INFO: renamed from: c */
    public static kis0 m149972c(String str, String str2) {
        return new kis0(str, str2, 4);
    }

    /* JADX INFO: renamed from: d */
    public static kis0 m149973d(String str, boolean z) {
        return new kis0(str, Boolean.valueOf(z), 1);
    }

    /* JADX INFO: renamed from: e */
    public final Object m149974e() {
        xjs0 xjs0VarM219983a = zjs0.m219983a();
        if (xjs0VarM219983a == null) {
            if (zjs0.m219984b() != null) {
                zjs0.m219984b().zza();
            }
            return this.f127024b;
        }
        int i = this.f127025c - 1;
        if (i == 0) {
            return xjs0VarM219983a.mo139955d(this.f127023a, ((Boolean) this.f127024b).booleanValue());
        }
        if (i == 1) {
            return xjs0VarM219983a.mo139954c(this.f127023a, ((Long) this.f127024b).longValue());
        }
        String str = this.f127023a;
        return i != 2 ? xjs0VarM219983a.mo139952a(str, (String) this.f127024b) : xjs0VarM219983a.mo139953b(str, ((Double) this.f127024b).doubleValue());
    }
}
