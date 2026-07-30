package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.C14786k;

/* JADX INFO: loaded from: classes2.dex */
public class zsq0 extends atq0 {

    /* JADX INFO: renamed from: A */
    private String f204623A;

    /* JADX INFO: renamed from: B */
    private boolean f204624B;

    /* JADX INFO: renamed from: p */
    private String f204625p;

    /* JADX INFO: renamed from: q */
    private String f204626q;

    /* JADX INFO: renamed from: r */
    private String f204627r;

    /* JADX INFO: renamed from: s */
    private String f204628s;

    /* JADX INFO: renamed from: t */
    private String f204629t;

    /* JADX INFO: renamed from: u */
    private String f204630u;

    /* JADX INFO: renamed from: v */
    private boolean f204631v;

    /* JADX INFO: renamed from: w */
    private String f204632w;

    /* JADX INFO: renamed from: x */
    private String f204633x;

    /* JADX INFO: renamed from: y */
    private String f204634y;

    /* JADX INFO: renamed from: z */
    private String f204635z;

    public zsq0(Bundle bundle) {
        super(bundle);
        this.f204625p = null;
        this.f204626q = null;
        this.f204631v = false;
        this.f204633x = "";
        this.f204634y = "";
        this.f204635z = "";
        this.f204623A = "";
        this.f204624B = false;
        this.f204625p = bundle.getString("ext_msg_type");
        this.f204627r = bundle.getString("ext_msg_lang");
        this.f204626q = bundle.getString("ext_msg_thread");
        this.f204628s = bundle.getString("ext_msg_sub");
        this.f204629t = bundle.getString("ext_msg_body");
        this.f204630u = bundle.getString("ext_body_encode");
        this.f204632w = bundle.getString("ext_msg_appid");
        this.f204631v = bundle.getBoolean("ext_msg_trans", false);
        this.f204624B = bundle.getBoolean("ext_msg_encrypt", false);
        this.f204633x = bundle.getString("ext_msg_seq");
        this.f204634y = bundle.getString("ext_msg_mseq");
        this.f204635z = bundle.getString("ext_msg_fseq");
        this.f204623A = bundle.getString("ext_msg_status");
    }

    /* JADX INFO: renamed from: A */
    public void m220056A(boolean z) {
        this.f204631v = z;
    }

    /* JADX INFO: renamed from: B */
    public String m220057B() {
        return this.f204625p;
    }

    /* JADX INFO: renamed from: C */
    public void m220058C(String str) {
        this.f204633x = str;
    }

    /* JADX INFO: renamed from: D */
    public void m220059D(boolean z) {
        this.f204624B = z;
    }

    /* JADX INFO: renamed from: E */
    public String m220060E() {
        return this.f204632w;
    }

    /* JADX INFO: renamed from: F */
    public void m220061F(String str) {
        this.f204634y = str;
    }

    /* JADX INFO: renamed from: G */
    public String m220062G() {
        return this.f204633x;
    }

    /* JADX INFO: renamed from: H */
    public void m220063H(String str) {
        this.f204635z = str;
    }

    /* JADX INFO: renamed from: I */
    public String m220064I() {
        return this.f204634y;
    }

    /* JADX INFO: renamed from: J */
    public void m220065J(String str) {
        this.f204623A = str;
    }

    /* JADX INFO: renamed from: K */
    public String m220066K() {
        return this.f204635z;
    }

    /* JADX INFO: renamed from: L */
    public void m220067L(String str) {
        this.f204625p = str;
    }

    /* JADX INFO: renamed from: M */
    public String m220068M() {
        return this.f204623A;
    }

    /* JADX INFO: renamed from: N */
    public void m220069N(String str) {
        this.f204628s = str;
    }

    /* JADX INFO: renamed from: O */
    public String m220070O() {
        return this.f204627r;
    }

    /* JADX INFO: renamed from: P */
    public void m220071P(String str) {
        this.f204629t = str;
    }

    /* JADX INFO: renamed from: Q */
    public void m220072Q(String str) {
        this.f204626q = str;
    }

    /* JADX INFO: renamed from: R */
    public void m220073R(String str) {
        this.f204627r = str;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: a */
    public Bundle mo85577a() {
        Bundle bundleMo85577a = super.mo85577a();
        if (!TextUtils.isEmpty(this.f204625p)) {
            bundleMo85577a.putString("ext_msg_type", this.f204625p);
        }
        String str = this.f204627r;
        if (str != null) {
            bundleMo85577a.putString("ext_msg_lang", str);
        }
        String str2 = this.f204628s;
        if (str2 != null) {
            bundleMo85577a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f204629t;
        if (str3 != null) {
            bundleMo85577a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f204630u)) {
            bundleMo85577a.putString("ext_body_encode", this.f204630u);
        }
        String str4 = this.f204626q;
        if (str4 != null) {
            bundleMo85577a.putString("ext_msg_thread", str4);
        }
        String str5 = this.f204632w;
        if (str5 != null) {
            bundleMo85577a.putString("ext_msg_appid", str5);
        }
        if (this.f204631v) {
            bundleMo85577a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f204633x)) {
            bundleMo85577a.putString("ext_msg_seq", this.f204633x);
        }
        if (!TextUtils.isEmpty(this.f204634y)) {
            bundleMo85577a.putString("ext_msg_mseq", this.f204634y);
        }
        if (!TextUtils.isEmpty(this.f204635z)) {
            bundleMo85577a.putString("ext_msg_fseq", this.f204635z);
        }
        if (this.f204624B) {
            bundleMo85577a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f204623A)) {
            bundleMo85577a.putString("ext_msg_status", this.f204623A);
        }
        return bundleMo85577a;
    }

    @Override // p149l.atq0
    /* JADX INFO: renamed from: d */
    public String mo85578d() {
        C14786k c14786kM98858b;
        StringBuilder sb = new StringBuilder("<message");
        if (m98877w() != null) {
            sb.append(" xmlns=\"");
            sb.append(m98877w());
            sb.append("\"");
        }
        if (this.f204627r != null) {
            sb.append(" xml:lang=\"");
            sb.append(m220070O());
            sb.append("\"");
        }
        if (m98866l() != null) {
            sb.append(" id=\"");
            sb.append(m98866l());
            sb.append("\"");
        }
        if (m98869o() != null) {
            sb.append(" to=\"");
            sb.append(htq0.m132933b(m98869o()));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m220062G())) {
            sb.append(" seq=\"");
            sb.append(m220062G());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m220064I())) {
            sb.append(" mseq=\"");
            sb.append(m220064I());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m220066K())) {
            sb.append(" fseq=\"");
            sb.append(m220066K());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m220068M())) {
            sb.append(" status=\"");
            sb.append(m220068M());
            sb.append("\"");
        }
        if (m98871q() != null) {
            sb.append(" from=\"");
            sb.append(htq0.m132933b(m98871q()));
            sb.append("\"");
        }
        if (m98867m() != null) {
            sb.append(" chid=\"");
            sb.append(htq0.m132933b(m98867m()));
            sb.append("\"");
        }
        if (this.f204631v) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f204632w)) {
            sb.append(" appid=\"");
            sb.append(m220060E());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f204625p)) {
            sb.append(" type=\"");
            sb.append(this.f204625p);
            sb.append("\"");
        }
        if (this.f204624B) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f204628s != null) {
            sb.append("<subject>");
            sb.append(htq0.m132933b(this.f204628s));
            sb.append("</subject>");
        }
        if (this.f204629t != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f204630u)) {
                sb.append(" encode=\"");
                sb.append(this.f204630u);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(htq0.m132933b(this.f204629t));
            sb.append("</body>");
        }
        if (this.f204626q != null) {
            sb.append("<thread>");
            sb.append(this.f204626q);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f204625p) && (c14786kM98858b = m98858b()) != null) {
            sb.append(c14786kM98858b.m86261b());
        }
        sb.append(m98875u());
        sb.append("</message>");
        return sb.toString();
    }

    @Override // p149l.atq0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zsq0 zsq0Var = (zsq0) obj;
            if (!super.equals(zsq0Var)) {
                return false;
            }
            String str = this.f204629t;
            String str2 = zsq0Var.f204629t;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f204627r;
            String str4 = zsq0Var.f204627r;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.f204628s;
            String str6 = zsq0Var.f204628s;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.f204626q;
            String str8 = zsq0Var.f204626q;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            if (this.f204625p == zsq0Var.f204625p) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.atq0
    public int hashCode() {
        String str = this.f204625p;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f204629t;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f204626q;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f204627r;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f204628s;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: y */
    public void m220074y(String str) {
        this.f204632w = str;
    }

    /* JADX INFO: renamed from: z */
    public void m220075z(String str, String str2) {
        this.f204629t = str;
        this.f204630u = str2;
    }

    public zsq0() {
        this.f204625p = null;
        this.f204626q = null;
        this.f204631v = false;
        this.f204633x = "";
        this.f204634y = "";
        this.f204635z = "";
        this.f204623A = "";
        this.f204624B = false;
    }
}
