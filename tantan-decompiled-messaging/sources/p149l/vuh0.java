package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class vuh0 {

    /* JADX INFO: renamed from: a */
    public final int f183069a;

    /* JADX INFO: renamed from: b */
    public final String f183070b;

    /* JADX INFO: renamed from: c */
    public final Throwable f183071c;

    public vuh0(int i, String str, Throwable th) {
        this.f183069a = i;
        this.f183070b = str;
        this.f183071c = th;
    }

    /* JADX INFO: renamed from: a */
    public static vuh0 m200071a(String str) {
        return new vuh0(1, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static vuh0 m200072b(Throwable th) {
        return new vuh0(2, null, th);
    }
}
