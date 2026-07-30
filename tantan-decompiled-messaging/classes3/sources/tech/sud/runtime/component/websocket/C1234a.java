package tech.sud.runtime.component.websocket;

/* JADX INFO: renamed from: tech.sud.runtime.component.websocket.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1234a {

    /* JADX INFO: renamed from: a */
    private String f11464a;

    /* JADX INFO: renamed from: b */
    private String f11465b;

    /* JADX INFO: renamed from: c */
    private String f11466c;

    /* JADX INFO: renamed from: d */
    private String f11467d;

    /* JADX INFO: renamed from: e */
    private String f11468e;

    /* JADX INFO: renamed from: f */
    private String f11469f;

    /* JADX INFO: renamed from: g */
    private int f11470g;

    public C1234a(String str) {
        String strSubstring = null;
        this.f11465b = null;
        this.f11466c = null;
        this.f11467d = null;
        this.f11468e = null;
        this.f11469f = null;
        this.f11470g = -1;
        try {
            this.f11464a = str;
            int iIndexOf = str.indexOf(58);
            this.f11465b = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            this.f11467d = strSubstring2;
            if (strSubstring2.startsWith("//")) {
                this.f11467d = this.f11467d.substring(2);
            }
            int iIndexOf2 = this.f11467d.indexOf(35);
            if (iIndexOf2 != -1) {
                this.f11467d = this.f11467d.substring(0, iIndexOf2);
            }
            int iIndexOf3 = this.f11467d.indexOf(63);
            if (iIndexOf3 != -1) {
                this.f11469f = this.f11467d.substring(iIndexOf3 + 1);
                this.f11467d = this.f11467d.substring(0, iIndexOf3);
            }
            int iIndexOf4 = this.f11467d.indexOf(47);
            if (iIndexOf4 != -1) {
                this.f11468e = this.f11467d.substring(iIndexOf4);
                this.f11467d = this.f11467d.substring(0, iIndexOf4);
            }
            int iIndexOf5 = this.f11467d.indexOf(64);
            if (iIndexOf5 != -1) {
                this.f11466c = this.f11467d.substring(0, iIndexOf5);
                this.f11467d = this.f11467d.substring(iIndexOf5 + 1);
            }
            int iIndexOf6 = this.f11467d.indexOf(91);
            String str2 = this.f11467d;
            if (iIndexOf6 == 0) {
                int iIndexOf7 = str2.indexOf(93);
                if (iIndexOf7 != -1) {
                    int i = iIndexOf7 + 1;
                    if (this.f11467d.indexOf(58, i) == i) {
                        strSubstring = this.f11467d.substring(iIndexOf7 + 2);
                        this.f11467d = this.f11467d.substring(0, i);
                    }
                }
            } else {
                int iIndexOf8 = str2.indexOf(58);
                if (iIndexOf8 != -1 && iIndexOf8 == this.f11467d.lastIndexOf(58)) {
                    strSubstring = this.f11467d.substring(iIndexOf8 + 1);
                    this.f11467d = this.f11467d.substring(0, iIndexOf8);
                }
            }
            if (strSubstring != null) {
                this.f11470g = Integer.parseInt(strSubstring);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m10383a() {
        return this.f11465b;
    }

    /* JADX INFO: renamed from: b */
    public String m10384b() {
        return this.f11467d;
    }

    /* JADX INFO: renamed from: c */
    public String m10385c() {
        return this.f11468e;
    }

    /* JADX INFO: renamed from: d */
    public String m10386d() {
        return this.f11469f;
    }

    /* JADX INFO: renamed from: e */
    public int m10387e() {
        return this.f11470g;
    }
}
