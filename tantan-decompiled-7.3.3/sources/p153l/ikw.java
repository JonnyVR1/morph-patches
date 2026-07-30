package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class ikw {

    /* JADX INFO: renamed from: b */
    private static ikw f115453b;

    /* JADX INFO: renamed from: a */
    private oxl f115454a;

    private ikw() {
    }

    /* JADX INFO: renamed from: b */
    public static ikw m140420b() {
        if (f115453b == null) {
            f115453b = new ikw();
        }
        return f115453b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m140421a(String str) {
        oxl oxlVar = this.f115454a;
        if (oxlVar == null) {
            return false;
        }
        return oxlVar.mo18378a(str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m140422c(String str, boolean z) {
        oxl oxlVar = this.f115454a;
        return oxlVar == null ? z : oxlVar.mo18381d(str, z);
    }

    /* JADX INFO: renamed from: d */
    public String m140423d(String str, String str2) {
        oxl oxlVar = this.f115454a;
        return oxlVar == null ? str2 : oxlVar.mo18379b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m140424e(oxl oxlVar) {
        this.f115454a = oxlVar;
    }

    /* JADX INFO: renamed from: f */
    public void m140425f(String str) {
        oxl oxlVar = this.f115454a;
        if (oxlVar == null) {
            return;
        }
        oxlVar.mo18383f(str);
    }

    /* JADX INFO: renamed from: g */
    public boolean m140426g(String str, String str2) {
        oxl oxlVar = this.f115454a;
        if (oxlVar == null) {
            return false;
        }
        return oxlVar.mo18382e(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public boolean m140427h(String str, boolean z) {
        oxl oxlVar = this.f115454a;
        if (oxlVar == null) {
            return false;
        }
        return oxlVar.mo18380c(str, z);
    }
}
