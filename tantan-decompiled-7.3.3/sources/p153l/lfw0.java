package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class lfw0 {

    /* JADX INFO: renamed from: a */
    public final String f131905a;

    /* JADX INFO: renamed from: b */
    public final String f131906b;

    public lfw0(String str, String str2) {
        this.f131905a = str;
        this.f131906b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static lfw0 m154039a(String str, String str2) {
        tgw0.m191132a(str, "Name is null or empty");
        tgw0.m191132a(str2, "Version is null or empty");
        return new lfw0(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final String m154040b() {
        return this.f131905a;
    }

    /* JADX INFO: renamed from: c */
    public final String m154041c() {
        return this.f131906b;
    }
}
