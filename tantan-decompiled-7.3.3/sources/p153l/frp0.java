package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class frp0 {

    /* JADX INFO: renamed from: c */
    public String f100447c;

    /* JADX INFO: renamed from: d */
    public String f100448d;

    /* JADX INFO: renamed from: e */
    public String f100449e;

    /* JADX INFO: renamed from: a */
    public String f100445a = null;

    /* JADX INFO: renamed from: b */
    public String f100446b = "uiwebview";

    /* JADX INFO: renamed from: f */
    public long f100450f = -1;

    public frp0(String str, String str2) {
        this.f100447c = str;
        this.f100448d = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("type:");
        sb.append(this.f100446b);
        sb.append(" bid:");
        String str = this.f100445a;
        if (str == null) {
            str = "none";
        }
        sb.append(str);
        sb.append(" momoId:");
        sb.append(this.f100447c);
        sb.append(" network:");
        sb.append(this.f100448d);
        sb.append(" offlineVersion:");
        sb.append(this.f100449e);
        sb.append(" onPageStarted:");
        sb.append(this.f100450f);
        return sb.toString();
    }
}
