package p153l;

/* JADX INFO: loaded from: classes5.dex */
public final class h64 {

    /* JADX INFO: renamed from: a */
    public String f107997a;

    /* JADX INFO: renamed from: b */
    public String f107998b;

    /* JADX INFO: renamed from: c */
    public String f107999c;

    /* JADX INFO: renamed from: d */
    public String f108000d;

    public h64(String str, String str2, String str3, String str4) {
        this.f107997a = str;
        this.f107998b = str2;
        this.f107999c = str3;
    }

    public String toString() {
        return "CallUser{id='" + this.f107997a + "', name='" + this.f107998b + "', profileUrl='" + this.f107999c + "', medalUrl='" + this.f108000d + "'}";
    }

    public h64(String str, String str2, String str3) {
        this(str, str2, str3, "");
    }
}
