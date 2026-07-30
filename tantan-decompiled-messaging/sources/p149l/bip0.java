package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class bip0 {

    /* JADX INFO: renamed from: c */
    public String f75787c;

    /* JADX INFO: renamed from: d */
    public String f75788d;

    /* JADX INFO: renamed from: e */
    public String f75789e;

    /* JADX INFO: renamed from: a */
    public String f75785a = null;

    /* JADX INFO: renamed from: b */
    public String f75786b = "uiwebview";

    /* JADX INFO: renamed from: f */
    public long f75790f = -1;

    public bip0(String str, String str2) {
        this.f75787c = str;
        this.f75788d = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("type:");
        sb.append(this.f75786b);
        sb.append(" bid:");
        String str = this.f75785a;
        if (str == null) {
            str = "none";
        }
        sb.append(str);
        sb.append(" momoId:");
        sb.append(this.f75787c);
        sb.append(" network:");
        sb.append(this.f75788d);
        sb.append(" offlineVersion:");
        sb.append(this.f75789e);
        sb.append(" onPageStarted:");
        sb.append(this.f75790f);
        return sb.toString();
    }
}
