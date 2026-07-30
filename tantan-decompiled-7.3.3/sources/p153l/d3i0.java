package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class d3i0 {

    /* JADX INFO: renamed from: a */
    public final int f84909a;

    /* JADX INFO: renamed from: b */
    public final String f84910b;

    /* JADX INFO: renamed from: c */
    public final Throwable f84911c;

    public d3i0(int i, String str, Throwable th) {
        this.f84909a = i;
        this.f84910b = str;
        this.f84911c = th;
    }

    /* JADX INFO: renamed from: a */
    public static d3i0 m113831a(String str) {
        return new d3i0(1, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static d3i0 m113832b(Throwable th) {
        return new d3i0(2, null, th);
    }
}
