package tech.sud.runtime.component.websocket;

/* JADX INFO: renamed from: tech.sud.runtime.component.websocket.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22556a {

    /* JADX INFO: renamed from: a */
    private String f208761a;

    /* JADX INFO: renamed from: b */
    private String f208762b;

    /* JADX INFO: renamed from: c */
    private String f208763c;

    /* JADX INFO: renamed from: d */
    private String f208764d;

    /* JADX INFO: renamed from: e */
    private String f208765e;

    /* JADX INFO: renamed from: f */
    private String f208766f;

    /* JADX INFO: renamed from: g */
    private int f208767g;

    public C22556a(String str) {
        String strSubstring = null;
        this.f208762b = null;
        this.f208763c = null;
        this.f208764d = null;
        this.f208765e = null;
        this.f208766f = null;
        this.f208767g = -1;
        try {
            this.f208761a = str;
            int iIndexOf = str.indexOf(58);
            this.f208762b = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            this.f208764d = strSubstring2;
            if (strSubstring2.startsWith("//")) {
                this.f208764d = this.f208764d.substring(2);
            }
            int iIndexOf2 = this.f208764d.indexOf(35);
            if (iIndexOf2 != -1) {
                this.f208764d = this.f208764d.substring(0, iIndexOf2);
            }
            int iIndexOf3 = this.f208764d.indexOf(63);
            if (iIndexOf3 != -1) {
                this.f208766f = this.f208764d.substring(iIndexOf3 + 1);
                this.f208764d = this.f208764d.substring(0, iIndexOf3);
            }
            int iIndexOf4 = this.f208764d.indexOf(47);
            if (iIndexOf4 != -1) {
                this.f208765e = this.f208764d.substring(iIndexOf4);
                this.f208764d = this.f208764d.substring(0, iIndexOf4);
            }
            int iIndexOf5 = this.f208764d.indexOf(64);
            if (iIndexOf5 != -1) {
                this.f208763c = this.f208764d.substring(0, iIndexOf5);
                this.f208764d = this.f208764d.substring(iIndexOf5 + 1);
            }
            int iIndexOf6 = this.f208764d.indexOf(91);
            String str2 = this.f208764d;
            if (iIndexOf6 == 0) {
                int iIndexOf7 = str2.indexOf(93);
                if (iIndexOf7 != -1) {
                    int i = iIndexOf7 + 1;
                    if (this.f208764d.indexOf(58, i) == i) {
                        strSubstring = this.f208764d.substring(iIndexOf7 + 2);
                        this.f208764d = this.f208764d.substring(0, i);
                    }
                }
            } else {
                int iIndexOf8 = str2.indexOf(58);
                if (iIndexOf8 != -1 && iIndexOf8 == this.f208764d.lastIndexOf(58)) {
                    strSubstring = this.f208764d.substring(iIndexOf8 + 1);
                    this.f208764d = this.f208764d.substring(0, iIndexOf8);
                }
            }
            if (strSubstring != null) {
                this.f208767g = Integer.parseInt(strSubstring);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m223158a() {
        return this.f208762b;
    }

    /* JADX INFO: renamed from: b */
    public String m223159b() {
        return this.f208764d;
    }

    /* JADX INFO: renamed from: c */
    public String m223160c() {
        return this.f208765e;
    }

    /* JADX INFO: renamed from: d */
    public String m223161d() {
        return this.f208766f;
    }

    /* JADX INFO: renamed from: e */
    public int m223162e() {
        return this.f208767g;
    }
}
