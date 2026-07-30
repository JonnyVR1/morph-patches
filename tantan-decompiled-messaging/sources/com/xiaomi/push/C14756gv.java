package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p149l.euq0;
import p149l.guq0;
import p149l.iuq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gv */
/* JADX INFO: loaded from: classes2.dex */
public class C14756gv implements InterfaceC14777hq<C14756gv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62233a;

    /* JADX INFO: renamed from: a */
    public long f62234a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62235a;

    /* JADX INFO: renamed from: a */
    public C14770hi f62236a;

    /* JADX INFO: renamed from: a */
    public String f62237a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62239a;

    /* JADX INFO: renamed from: a */
    public short f62240a;

    /* JADX INFO: renamed from: b */
    public String f62242b;

    /* JADX INFO: renamed from: b */
    public short f62243b;

    /* JADX INFO: renamed from: c */
    public String f62244c;

    /* JADX INFO: renamed from: d */
    public String f62245d;

    /* JADX INFO: renamed from: e */
    public String f62246e;

    /* JADX INFO: renamed from: f */
    public String f62247f;

    /* JADX INFO: renamed from: g */
    public String f62248g;

    /* JADX INFO: renamed from: h */
    public String f62249h;

    /* JADX INFO: renamed from: i */
    public String f62250i;

    /* JADX INFO: renamed from: j */
    public String f62251j;

    /* JADX INFO: renamed from: k */
    public String f62252k;

    /* JADX INFO: renamed from: l */
    public String f62253l;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62213a = new tuq0("XmPushActionAckMessage");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62212a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62214b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62215c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62216d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62217e = new guq0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62218f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62219g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62220h = new guq0("", (byte) 12, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62221i = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62222j = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62223k = new guq0("", (byte) 2, 11);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62224l = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62225m = new guq0("", (byte) 11, 13);

    /* JADX INFO: renamed from: n */
    private static final guq0 f62226n = new guq0("", (byte) 11, 14);

    /* JADX INFO: renamed from: o */
    private static final guq0 f62227o = new guq0("", (byte) 6, 15);

    /* JADX INFO: renamed from: p */
    private static final guq0 f62228p = new guq0("", (byte) 6, 16);

    /* JADX INFO: renamed from: q */
    private static final guq0 f62229q = new guq0("", (byte) 11, 20);

    /* JADX INFO: renamed from: r */
    private static final guq0 f62230r = new guq0("", (byte) 11, 21);

    /* JADX INFO: renamed from: s */
    private static final guq0 f62231s = new guq0("", (byte) 8, 22);

    /* JADX INFO: renamed from: t */
    private static final guq0 f62232t = new guq0("", HttpTokens.CARRIAGE_RETURN, 23);

    /* JADX INFO: renamed from: a */
    private BitSet f62238a = new BitSet(5);

    /* JADX INFO: renamed from: a */
    public boolean f62241a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14756gv c14756gv) {
        int iM118197h;
        int iM118191b;
        int iM118194e;
        int iM118194e2;
        int iM118199j;
        int iM118199j2;
        int iM118194e3;
        int iM118194e4;
        int iM118194e5;
        int iM118200k;
        int iM118194e6;
        int iM118194e7;
        int iM118193d;
        int iM118194e8;
        int iM118194e9;
        int iM118192c;
        int iM118194e10;
        int iM118194e11;
        int iM118193d2;
        int iM118194e12;
        if (!getClass().equals(c14756gv.getClass())) {
            return getClass().getName().compareTo(c14756gv.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85783a()).compareTo(Boolean.valueOf(c14756gv.m85783a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85783a() && (iM118194e12 = euq0.m118194e(this.f62237a, c14756gv.f62237a)) != 0) {
            return iM118194e12;
        }
        int iCompareTo2 = Boolean.valueOf(m85787b()).compareTo(Boolean.valueOf(c14756gv.m85787b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85787b() && (iM118193d2 = euq0.m118193d(this.f62235a, c14756gv.f62235a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo3 = Boolean.valueOf(m85790c()).compareTo(Boolean.valueOf(c14756gv.m85790c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85790c() && (iM118194e11 = euq0.m118194e(this.f62242b, c14756gv.f62242b)) != 0) {
            return iM118194e11;
        }
        int iCompareTo4 = Boolean.valueOf(m85793d()).compareTo(Boolean.valueOf(c14756gv.m85793d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85793d() && (iM118194e10 = euq0.m118194e(this.f62244c, c14756gv.f62244c)) != 0) {
            return iM118194e10;
        }
        int iCompareTo5 = Boolean.valueOf(m85795e()).compareTo(Boolean.valueOf(c14756gv.m85795e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85795e() && (iM118192c = euq0.m118192c(this.f62234a, c14756gv.f62234a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m85796f()).compareTo(Boolean.valueOf(c14756gv.m85796f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85796f() && (iM118194e9 = euq0.m118194e(this.f62245d, c14756gv.f62245d)) != 0) {
            return iM118194e9;
        }
        int iCompareTo7 = Boolean.valueOf(m85797g()).compareTo(Boolean.valueOf(c14756gv.m85797g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85797g() && (iM118194e8 = euq0.m118194e(this.f62246e, c14756gv.f62246e)) != 0) {
            return iM118194e8;
        }
        int iCompareTo8 = Boolean.valueOf(m85798h()).compareTo(Boolean.valueOf(c14756gv.m85798h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85798h() && (iM118193d = euq0.m118193d(this.f62236a, c14756gv.f62236a)) != 0) {
            return iM118193d;
        }
        int iCompareTo9 = Boolean.valueOf(m85799i()).compareTo(Boolean.valueOf(c14756gv.m85799i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85799i() && (iM118194e7 = euq0.m118194e(this.f62247f, c14756gv.f62247f)) != 0) {
            return iM118194e7;
        }
        int iCompareTo10 = Boolean.valueOf(m85800j()).compareTo(Boolean.valueOf(c14756gv.m85800j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m85800j() && (iM118194e6 = euq0.m118194e(this.f62248g, c14756gv.f62248g)) != 0) {
            return iM118194e6;
        }
        int iCompareTo11 = Boolean.valueOf(m85801k()).compareTo(Boolean.valueOf(c14756gv.m85801k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m85801k() && (iM118200k = euq0.m118200k(this.f62241a, c14756gv.f62241a)) != 0) {
            return iM118200k;
        }
        int iCompareTo12 = Boolean.valueOf(m85802l()).compareTo(Boolean.valueOf(c14756gv.m85802l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m85802l() && (iM118194e5 = euq0.m118194e(this.f62249h, c14756gv.f62249h)) != 0) {
            return iM118194e5;
        }
        int iCompareTo13 = Boolean.valueOf(m85803m()).compareTo(Boolean.valueOf(c14756gv.m85803m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m85803m() && (iM118194e4 = euq0.m118194e(this.f62250i, c14756gv.f62250i)) != 0) {
            return iM118194e4;
        }
        int iCompareTo14 = Boolean.valueOf(m85804n()).compareTo(Boolean.valueOf(c14756gv.m85804n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m85804n() && (iM118194e3 = euq0.m118194e(this.f62251j, c14756gv.f62251j)) != 0) {
            return iM118194e3;
        }
        int iCompareTo15 = Boolean.valueOf(m85805o()).compareTo(Boolean.valueOf(c14756gv.m85805o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m85805o() && (iM118199j2 = euq0.m118199j(this.f62240a, c14756gv.f62240a)) != 0) {
            return iM118199j2;
        }
        int iCompareTo16 = Boolean.valueOf(m85806p()).compareTo(Boolean.valueOf(c14756gv.m85806p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m85806p() && (iM118199j = euq0.m118199j(this.f62243b, c14756gv.f62243b)) != 0) {
            return iM118199j;
        }
        int iCompareTo17 = Boolean.valueOf(m85807q()).compareTo(Boolean.valueOf(c14756gv.m85807q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m85807q() && (iM118194e2 = euq0.m118194e(this.f62252k, c14756gv.f62252k)) != 0) {
            return iM118194e2;
        }
        int iCompareTo18 = Boolean.valueOf(m85808r()).compareTo(Boolean.valueOf(c14756gv.m85808r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m85808r() && (iM118194e = euq0.m118194e(this.f62253l, c14756gv.f62253l)) != 0) {
            return iM118194e;
        }
        int iCompareTo19 = Boolean.valueOf(m85809s()).compareTo(Boolean.valueOf(c14756gv.m85809s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m85809s() && (iM118191b = euq0.m118191b(this.f62233a, c14756gv.f62233a)) != 0) {
            return iM118191b;
        }
        int iCompareTo20 = Boolean.valueOf(m85810t()).compareTo(Boolean.valueOf(c14756gv.m85810t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m85810t() || (iM118197h = euq0.m118197h(this.f62239a, c14756gv.f62239a)) == 0) {
            return 0;
        }
        return iM118197h;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85781a();
        quq0Var.mo86237v(f62213a);
        if (this.f62237a != null && m85783a()) {
            quq0Var.mo86234s(f62212a);
            quq0Var.mo86232q(this.f62237a);
            quq0Var.mo86241z();
        }
        if (this.f62235a != null && m85787b()) {
            quq0Var.mo86234s(f62214b);
            this.f62235a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62242b != null) {
            quq0Var.mo86234s(f62215c);
            quq0Var.mo86232q(this.f62242b);
            quq0Var.mo86241z();
        }
        if (this.f62244c != null) {
            quq0Var.mo86234s(f62216d);
            quq0Var.mo86232q(this.f62244c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62217e);
        quq0Var.mo86231p(this.f62234a);
        quq0Var.mo86241z();
        if (this.f62245d != null && m85796f()) {
            quq0Var.mo86234s(f62218f);
            quq0Var.mo86232q(this.f62245d);
            quq0Var.mo86241z();
        }
        if (this.f62246e != null && m85797g()) {
            quq0Var.mo86234s(f62219g);
            quq0Var.mo86232q(this.f62246e);
            quq0Var.mo86241z();
        }
        if (this.f62236a != null && m85798h()) {
            quq0Var.mo86234s(f62220h);
            this.f62236a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62247f != null && m85799i()) {
            quq0Var.mo86234s(f62221i);
            quq0Var.mo86232q(this.f62247f);
            quq0Var.mo86241z();
        }
        if (this.f62248g != null && m85800j()) {
            quq0Var.mo86234s(f62222j);
            quq0Var.mo86232q(this.f62248g);
            quq0Var.mo86241z();
        }
        if (m85801k()) {
            quq0Var.mo86234s(f62223k);
            quq0Var.mo86239x(this.f62241a);
            quq0Var.mo86241z();
        }
        if (this.f62249h != null && m85802l()) {
            quq0Var.mo86234s(f62224l);
            quq0Var.mo86232q(this.f62249h);
            quq0Var.mo86241z();
        }
        if (this.f62250i != null && m85803m()) {
            quq0Var.mo86234s(f62225m);
            quq0Var.mo86232q(this.f62250i);
            quq0Var.mo86241z();
        }
        if (this.f62251j != null && m85804n()) {
            quq0Var.mo86234s(f62226n);
            quq0Var.mo86232q(this.f62251j);
            quq0Var.mo86241z();
        }
        if (m85805o()) {
            quq0Var.mo86234s(f62227o);
            quq0Var.mo86238w(this.f62240a);
            quq0Var.mo86241z();
        }
        if (m85806p()) {
            quq0Var.mo86234s(f62228p);
            quq0Var.mo86238w(this.f62243b);
            quq0Var.mo86241z();
        }
        if (this.f62252k != null && m85807q()) {
            quq0Var.mo86234s(f62229q);
            quq0Var.mo86232q(this.f62252k);
            quq0Var.mo86241z();
        }
        if (this.f62253l != null && m85808r()) {
            quq0Var.mo86234s(f62230r);
            quq0Var.mo86232q(this.f62253l);
            quq0Var.mo86241z();
        }
        if (m85809s()) {
            quq0Var.mo86234s(f62231s);
            quq0Var.mo86230o(this.f62233a);
            quq0Var.mo86241z();
        }
        if (this.f62239a != null && m85810t()) {
            quq0Var.mo86234s(f62232t);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62239a.size()));
            for (Map.Entry<String, String> entry : this.f62239a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85790c() {
        return this.f62242b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85793d() {
        return this.f62244c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85795e() {
        return this.f62238a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14756gv)) {
            return m85784a((C14756gv) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85796f() {
        return this.f62245d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85797g() {
        return this.f62246e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85798h() {
        return this.f62236a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85799i() {
        return this.f62247f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85800j() {
        return this.f62248g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m85801k() {
        return this.f62238a.get(1);
    }

    /* JADX INFO: renamed from: l */
    public boolean m85802l() {
        return this.f62249h != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m85803m() {
        return this.f62250i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m85804n() {
        return this.f62251j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m85805o() {
        return this.f62238a.get(2);
    }

    /* JADX INFO: renamed from: p */
    public boolean m85806p() {
        return this.f62238a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m85807q() {
        return this.f62252k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m85808r() {
        return this.f62253l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m85809s() {
        return this.f62238a.get(4);
    }

    /* JADX INFO: renamed from: t */
    public boolean m85810t() {
        return this.f62239a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (m85783a()) {
            sb.append("debug:");
            String str = this.f62237a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m85787b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62235a;
            if (c14755gu == null) {
                sb.append("null");
            } else {
                sb.append(c14755gu);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f62242b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62244c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f62234a);
        if (m85796f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f62245d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85797g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f62246e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85798h()) {
            sb.append(", ");
            sb.append("request:");
            C14770hi c14770hi = this.f62236a;
            if (c14770hi == null) {
                sb.append("null");
            } else {
                sb.append(c14770hi);
            }
        }
        if (m85799i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62247f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m85800j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62248g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m85801k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f62241a);
        }
        if (m85802l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f62249h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m85803m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f62250i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m85804n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f62251j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m85805o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f62240a);
        }
        if (m85806p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f62243b);
        }
        if (m85807q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f62252k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m85808r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f62253l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m85809s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f62233a);
        }
        if (m85810t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f62239a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public C14756gv m85788c(String str) {
        this.f62245d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14756gv m85791d(String str) {
        this.f62246e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m85794e(boolean z) {
        this.f62238a.set(4, z);
    }

    /* JADX INFO: renamed from: c */
    public void m85789c(boolean z) {
        this.f62238a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m85792d(boolean z) {
        this.f62238a.set(3, z);
    }

    /* JADX INFO: renamed from: b */
    public C14756gv m85785b(String str) {
        this.f62244c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85786b(boolean z) {
        this.f62238a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85787b() {
        return this.f62235a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14756gv m85779a(String str) {
        this.f62242b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14756gv m85778a(long j) {
        this.f62234a = j;
        m85782a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85782a(boolean z) {
        this.f62238a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14756gv m85780a(short s) {
        this.f62240a = s;
        m85789c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85784a(C14756gv c14756gv) {
        if (c14756gv == null) {
            return false;
        }
        boolean zM85783a = m85783a();
        boolean zM85783a2 = c14756gv.m85783a();
        if ((zM85783a || zM85783a2) && !(zM85783a && zM85783a2 && this.f62237a.equals(c14756gv.f62237a))) {
            return false;
        }
        boolean zM85787b = m85787b();
        boolean zM85787b2 = c14756gv.m85787b();
        if ((zM85787b || zM85787b2) && !(zM85787b && zM85787b2 && this.f62235a.m85770a(c14756gv.f62235a))) {
            return false;
        }
        boolean zM85790c = m85790c();
        boolean zM85790c2 = c14756gv.m85790c();
        if ((zM85790c || zM85790c2) && !(zM85790c && zM85790c2 && this.f62242b.equals(c14756gv.f62242b))) {
            return false;
        }
        boolean zM85793d = m85793d();
        boolean zM85793d2 = c14756gv.m85793d();
        if (((zM85793d || zM85793d2) && !(zM85793d && zM85793d2 && this.f62244c.equals(c14756gv.f62244c))) || this.f62234a != c14756gv.f62234a) {
            return false;
        }
        boolean zM85796f = m85796f();
        boolean zM85796f2 = c14756gv.m85796f();
        if ((zM85796f || zM85796f2) && !(zM85796f && zM85796f2 && this.f62245d.equals(c14756gv.f62245d))) {
            return false;
        }
        boolean zM85797g = m85797g();
        boolean zM85797g2 = c14756gv.m85797g();
        if ((zM85797g || zM85797g2) && !(zM85797g && zM85797g2 && this.f62246e.equals(c14756gv.f62246e))) {
            return false;
        }
        boolean zM85798h = m85798h();
        boolean zM85798h2 = c14756gv.m85798h();
        if ((zM85798h || zM85798h2) && !(zM85798h && zM85798h2 && this.f62236a.m86085a(c14756gv.f62236a))) {
            return false;
        }
        boolean zM85799i = m85799i();
        boolean zM85799i2 = c14756gv.m85799i();
        if ((zM85799i || zM85799i2) && !(zM85799i && zM85799i2 && this.f62247f.equals(c14756gv.f62247f))) {
            return false;
        }
        boolean zM85800j = m85800j();
        boolean zM85800j2 = c14756gv.m85800j();
        if ((zM85800j || zM85800j2) && !(zM85800j && zM85800j2 && this.f62248g.equals(c14756gv.f62248g))) {
            return false;
        }
        boolean zM85801k = m85801k();
        boolean zM85801k2 = c14756gv.m85801k();
        if ((zM85801k || zM85801k2) && !(zM85801k && zM85801k2 && this.f62241a == c14756gv.f62241a)) {
            return false;
        }
        boolean zM85802l = m85802l();
        boolean zM85802l2 = c14756gv.m85802l();
        if ((zM85802l || zM85802l2) && !(zM85802l && zM85802l2 && this.f62249h.equals(c14756gv.f62249h))) {
            return false;
        }
        boolean zM85803m = m85803m();
        boolean zM85803m2 = c14756gv.m85803m();
        if ((zM85803m || zM85803m2) && !(zM85803m && zM85803m2 && this.f62250i.equals(c14756gv.f62250i))) {
            return false;
        }
        boolean zM85804n = m85804n();
        boolean zM85804n2 = c14756gv.m85804n();
        if ((zM85804n || zM85804n2) && !(zM85804n && zM85804n2 && this.f62251j.equals(c14756gv.f62251j))) {
            return false;
        }
        boolean zM85805o = m85805o();
        boolean zM85805o2 = c14756gv.m85805o();
        if ((zM85805o || zM85805o2) && !(zM85805o && zM85805o2 && this.f62240a == c14756gv.f62240a)) {
            return false;
        }
        boolean zM85806p = m85806p();
        boolean zM85806p2 = c14756gv.m85806p();
        if ((zM85806p || zM85806p2) && !(zM85806p && zM85806p2 && this.f62243b == c14756gv.f62243b)) {
            return false;
        }
        boolean zM85807q = m85807q();
        boolean zM85807q2 = c14756gv.m85807q();
        if ((zM85807q || zM85807q2) && !(zM85807q && zM85807q2 && this.f62252k.equals(c14756gv.f62252k))) {
            return false;
        }
        boolean zM85808r = m85808r();
        boolean zM85808r2 = c14756gv.m85808r();
        if ((zM85808r || zM85808r2) && !(zM85808r && zM85808r2 && this.f62253l.equals(c14756gv.f62253l))) {
            return false;
        }
        boolean zM85809s = m85809s();
        boolean zM85809s2 = c14756gv.m85809s();
        if ((zM85809s || zM85809s2) && !(zM85809s && zM85809s2 && this.f62233a == c14756gv.f62233a)) {
            return false;
        }
        boolean zM85810t = m85810t();
        boolean zM85810t2 = c14756gv.m85810t();
        if (zM85810t || zM85810t2) {
            return zM85810t && zM85810t2 && this.f62239a.equals(c14756gv.f62239a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85783a() {
        return this.f62237a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) throws C14781ib {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                quq0Var.mo86208D();
                if (m85795e()) {
                    m85781a();
                    return;
                }
                throw new C14781ib("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62237a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62235a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62242b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62244c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f62234a = quq0Var.mo86219d();
                        m85782a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62245d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62246e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14770hi c14770hi = new C14770hi();
                        this.f62236a = c14770hi;
                        c14770hi.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62247f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62248g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f62241a = quq0Var.mo86240y();
                        m85786b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f62249h = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f62250i = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f62251j = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 15:
                    if (b == 6) {
                        this.f62240a = quq0Var.mo86227l();
                        m85789c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 16:
                    if (b == 6) {
                        this.f62243b = quq0Var.mo86227l();
                        m85792d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 17:
                case 18:
                case 19:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 20:
                    if (b == 11) {
                        this.f62252k = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 21:
                    if (b == 11) {
                        this.f62253l = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 22:
                    if (b == 8) {
                        this.f62233a = quq0Var.mo86218c();
                        m85794e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 23:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f62239a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                            this.f62239a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85781a() throws C14781ib {
        if (this.f62242b != null) {
            if (this.f62244c != null) {
                return;
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
