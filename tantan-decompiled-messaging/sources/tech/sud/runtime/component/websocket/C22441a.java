package tech.sud.runtime.component.websocket;

/* JADX INFO: renamed from: tech.sud.runtime.component.websocket.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22441a {

    /* JADX INFO: renamed from: a */
    private String f207839a;

    /* JADX INFO: renamed from: b */
    private String f207840b;

    /* JADX INFO: renamed from: c */
    private String f207841c;

    /* JADX INFO: renamed from: d */
    private String f207842d;

    /* JADX INFO: renamed from: e */
    private String f207843e;

    /* JADX INFO: renamed from: f */
    private String f207844f;

    /* JADX INFO: renamed from: g */
    private int f207845g;

    public C22441a(String str) {
        String strSubstring = null;
        this.f207840b = null;
        this.f207841c = null;
        this.f207842d = null;
        this.f207843e = null;
        this.f207844f = null;
        this.f207845g = -1;
        try {
            this.f207839a = str;
            int iIndexOf = str.indexOf(58);
            this.f207840b = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            this.f207842d = strSubstring2;
            if (strSubstring2.startsWith("//")) {
                this.f207842d = this.f207842d.substring(2);
            }
            int iIndexOf2 = this.f207842d.indexOf(35);
            if (iIndexOf2 != -1) {
                this.f207842d = this.f207842d.substring(0, iIndexOf2);
            }
            int iIndexOf3 = this.f207842d.indexOf(63);
            if (iIndexOf3 != -1) {
                this.f207844f = this.f207842d.substring(iIndexOf3 + 1);
                this.f207842d = this.f207842d.substring(0, iIndexOf3);
            }
            int iIndexOf4 = this.f207842d.indexOf(47);
            if (iIndexOf4 != -1) {
                this.f207843e = this.f207842d.substring(iIndexOf4);
                this.f207842d = this.f207842d.substring(0, iIndexOf4);
            }
            int iIndexOf5 = this.f207842d.indexOf(64);
            if (iIndexOf5 != -1) {
                this.f207841c = this.f207842d.substring(0, iIndexOf5);
                this.f207842d = this.f207842d.substring(iIndexOf5 + 1);
            }
            int iIndexOf6 = this.f207842d.indexOf(91);
            String str2 = this.f207842d;
            if (iIndexOf6 == 0) {
                int iIndexOf7 = str2.indexOf(93);
                if (iIndexOf7 != -1) {
                    int i = iIndexOf7 + 1;
                    if (this.f207842d.indexOf(58, i) == i) {
                        strSubstring = this.f207842d.substring(iIndexOf7 + 2);
                        this.f207842d = this.f207842d.substring(0, i);
                    }
                }
            } else {
                int iIndexOf8 = str2.indexOf(58);
                if (iIndexOf8 != -1 && iIndexOf8 == this.f207842d.lastIndexOf(58)) {
                    strSubstring = this.f207842d.substring(iIndexOf8 + 1);
                    this.f207842d = this.f207842d.substring(0, iIndexOf8);
                }
            }
            if (strSubstring != null) {
                this.f207845g = Integer.parseInt(strSubstring);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m221912a() {
        return this.f207840b;
    }

    /* JADX INFO: renamed from: b */
    public String m221913b() {
        return this.f207842d;
    }

    /* JADX INFO: renamed from: c */
    public String m221914c() {
        return this.f207843e;
    }

    /* JADX INFO: renamed from: d */
    public String m221915d() {
        return this.f207844f;
    }

    /* JADX INFO: renamed from: e */
    public int m221916e() {
        return this.f207845g;
    }
}
