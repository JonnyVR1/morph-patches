package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.C14934k;

/* JADX INFO: loaded from: classes2.dex */
public class f2r0 extends g2r0 {

    /* JADX INFO: renamed from: A */
    private String f96900A;

    /* JADX INFO: renamed from: B */
    private boolean f96901B;

    /* JADX INFO: renamed from: p */
    private String f96902p;

    /* JADX INFO: renamed from: q */
    private String f96903q;

    /* JADX INFO: renamed from: r */
    private String f96904r;

    /* JADX INFO: renamed from: s */
    private String f96905s;

    /* JADX INFO: renamed from: t */
    private String f96906t;

    /* JADX INFO: renamed from: u */
    private String f96907u;

    /* JADX INFO: renamed from: v */
    private boolean f96908v;

    /* JADX INFO: renamed from: w */
    private String f96909w;

    /* JADX INFO: renamed from: x */
    private String f96910x;

    /* JADX INFO: renamed from: y */
    private String f96911y;

    /* JADX INFO: renamed from: z */
    private String f96912z;

    public f2r0(Bundle bundle) {
        super(bundle);
        this.f96902p = null;
        this.f96903q = null;
        this.f96908v = false;
        this.f96910x = "";
        this.f96911y = "";
        this.f96912z = "";
        this.f96900A = "";
        this.f96901B = false;
        this.f96902p = bundle.getString("ext_msg_type");
        this.f96904r = bundle.getString("ext_msg_lang");
        this.f96903q = bundle.getString("ext_msg_thread");
        this.f96905s = bundle.getString("ext_msg_sub");
        this.f96906t = bundle.getString("ext_msg_body");
        this.f96907u = bundle.getString("ext_body_encode");
        this.f96909w = bundle.getString("ext_msg_appid");
        this.f96908v = bundle.getBoolean("ext_msg_trans", false);
        this.f96901B = bundle.getBoolean("ext_msg_encrypt", false);
        this.f96910x = bundle.getString("ext_msg_seq");
        this.f96911y = bundle.getString("ext_msg_mseq");
        this.f96912z = bundle.getString("ext_msg_fseq");
        this.f96900A = bundle.getString("ext_msg_status");
    }

    /* JADX INFO: renamed from: A */
    public void m123649A(boolean z) {
        this.f96908v = z;
    }

    /* JADX INFO: renamed from: B */
    public String m123650B() {
        return this.f96902p;
    }

    /* JADX INFO: renamed from: C */
    public void m123651C(String str) {
        this.f96910x = str;
    }

    /* JADX INFO: renamed from: D */
    public void m123652D(boolean z) {
        this.f96901B = z;
    }

    /* JADX INFO: renamed from: E */
    public String m123653E() {
        return this.f96909w;
    }

    /* JADX INFO: renamed from: F */
    public void m123654F(String str) {
        this.f96911y = str;
    }

    /* JADX INFO: renamed from: G */
    public String m123655G() {
        return this.f96910x;
    }

    /* JADX INFO: renamed from: H */
    public void m123656H(String str) {
        this.f96912z = str;
    }

    /* JADX INFO: renamed from: I */
    public String m123657I() {
        return this.f96911y;
    }

    /* JADX INFO: renamed from: J */
    public void m123658J(String str) {
        this.f96900A = str;
    }

    /* JADX INFO: renamed from: K */
    public String m123659K() {
        return this.f96912z;
    }

    /* JADX INFO: renamed from: L */
    public void m123660L(String str) {
        this.f96902p = str;
    }

    /* JADX INFO: renamed from: M */
    public String m123661M() {
        return this.f96900A;
    }

    /* JADX INFO: renamed from: N */
    public void m123662N(String str) {
        this.f96905s = str;
    }

    /* JADX INFO: renamed from: O */
    public String m123663O() {
        return this.f96904r;
    }

    /* JADX INFO: renamed from: P */
    public void m123664P(String str) {
        this.f96906t = str;
    }

    /* JADX INFO: renamed from: Q */
    public void m123665Q(String str) {
        this.f96903q = str;
    }

    /* JADX INFO: renamed from: R */
    public void m123666R(String str) {
        this.f96904r = str;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: a */
    public Bundle mo86748a() {
        Bundle bundleMo86748a = super.mo86748a();
        if (!TextUtils.isEmpty(this.f96902p)) {
            bundleMo86748a.putString("ext_msg_type", this.f96902p);
        }
        String str = this.f96904r;
        if (str != null) {
            bundleMo86748a.putString("ext_msg_lang", str);
        }
        String str2 = this.f96905s;
        if (str2 != null) {
            bundleMo86748a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f96906t;
        if (str3 != null) {
            bundleMo86748a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f96907u)) {
            bundleMo86748a.putString("ext_body_encode", this.f96907u);
        }
        String str4 = this.f96903q;
        if (str4 != null) {
            bundleMo86748a.putString("ext_msg_thread", str4);
        }
        String str5 = this.f96909w;
        if (str5 != null) {
            bundleMo86748a.putString("ext_msg_appid", str5);
        }
        if (this.f96908v) {
            bundleMo86748a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f96910x)) {
            bundleMo86748a.putString("ext_msg_seq", this.f96910x);
        }
        if (!TextUtils.isEmpty(this.f96911y)) {
            bundleMo86748a.putString("ext_msg_mseq", this.f96911y);
        }
        if (!TextUtils.isEmpty(this.f96912z)) {
            bundleMo86748a.putString("ext_msg_fseq", this.f96912z);
        }
        if (this.f96901B) {
            bundleMo86748a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f96900A)) {
            bundleMo86748a.putString("ext_msg_status", this.f96900A);
        }
        return bundleMo86748a;
    }

    @Override // p153l.g2r0
    /* JADX INFO: renamed from: d */
    public String mo86749d() {
        C14934k c14934kM128640b;
        StringBuilder sb = new StringBuilder("<message");
        if (m128659w() != null) {
            sb.append(" xmlns=\"");
            sb.append(m128659w());
            sb.append("\"");
        }
        if (this.f96904r != null) {
            sb.append(" xml:lang=\"");
            sb.append(m123663O());
            sb.append("\"");
        }
        if (m128648l() != null) {
            sb.append(" id=\"");
            sb.append(m128648l());
            sb.append("\"");
        }
        if (m128651o() != null) {
            sb.append(" to=\"");
            sb.append(n2r0.m161249b(m128651o()));
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m123655G())) {
            sb.append(" seq=\"");
            sb.append(m123655G());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m123657I())) {
            sb.append(" mseq=\"");
            sb.append(m123657I());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m123659K())) {
            sb.append(" fseq=\"");
            sb.append(m123659K());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(m123661M())) {
            sb.append(" status=\"");
            sb.append(m123661M());
            sb.append("\"");
        }
        if (m128653q() != null) {
            sb.append(" from=\"");
            sb.append(n2r0.m161249b(m128653q()));
            sb.append("\"");
        }
        if (m128649m() != null) {
            sb.append(" chid=\"");
            sb.append(n2r0.m161249b(m128649m()));
            sb.append("\"");
        }
        if (this.f96908v) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f96909w)) {
            sb.append(" appid=\"");
            sb.append(m123653E());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f96902p)) {
            sb.append(" type=\"");
            sb.append(this.f96902p);
            sb.append("\"");
        }
        if (this.f96901B) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f96905s != null) {
            sb.append("<subject>");
            sb.append(n2r0.m161249b(this.f96905s));
            sb.append("</subject>");
        }
        if (this.f96906t != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f96907u)) {
                sb.append(" encode=\"");
                sb.append(this.f96907u);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(n2r0.m161249b(this.f96906t));
            sb.append("</body>");
        }
        if (this.f96903q != null) {
            sb.append("<thread>");
            sb.append(this.f96903q);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f96902p) && (c14934kM128640b = m128640b()) != null) {
            sb.append(c14934kM128640b.m87432b());
        }
        sb.append(m128657u());
        sb.append("</message>");
        return sb.toString();
    }

    @Override // p153l.g2r0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f2r0 f2r0Var = (f2r0) obj;
            if (!super.equals(f2r0Var)) {
                return false;
            }
            String str = this.f96906t;
            String str2 = f2r0Var.f96906t;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f96904r;
            String str4 = f2r0Var.f96904r;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.f96905s;
            String str6 = f2r0Var.f96905s;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.f96903q;
            String str8 = f2r0Var.f96903q;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            if (this.f96902p == f2r0Var.f96902p) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.g2r0
    public int hashCode() {
        String str = this.f96902p;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96906t;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96903q;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f96904r;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f96905s;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: y */
    public void m123667y(String str) {
        this.f96909w = str;
    }

    /* JADX INFO: renamed from: z */
    public void m123668z(String str, String str2) {
        this.f96906t = str;
        this.f96907u = str2;
    }

    public f2r0() {
        this.f96902p = null;
        this.f96903q = null;
        this.f96908v = false;
        this.f96910x = "";
        this.f96911y = "";
        this.f96912z = "";
        this.f96900A = "";
        this.f96901B = false;
    }
}
