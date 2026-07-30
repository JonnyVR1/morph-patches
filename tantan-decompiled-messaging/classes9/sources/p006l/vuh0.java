package p006l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vuh0 {

    /* JADX INFO: renamed from: a */
    public final int f24474a;

    /* JADX INFO: renamed from: b */
    public final String f24475b;

    /* JADX INFO: renamed from: c */
    public final Throwable f24476c;

    public vuh0(int i, String str, Throwable th) {
        this.f24474a = i;
        this.f24475b = str;
        this.f24476c = th;
    }

    /* JADX INFO: renamed from: a */
    public static vuh0 m25900a(String str) {
        return new vuh0(1, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static vuh0 m25901b(Throwable th) {
        return new vuh0(2, null, th);
    }
}
