package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p153l.k3r0;
import p153l.m3r0;
import p153l.o3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gv */
/* JADX INFO: loaded from: classes2.dex */
public class C14904gv implements InterfaceC14925hq<C14904gv, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f63080a;

    /* JADX INFO: renamed from: a */
    public long f63081a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63082a;

    /* JADX INFO: renamed from: a */
    public C14918hi f63083a;

    /* JADX INFO: renamed from: a */
    public String f63084a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63086a;

    /* JADX INFO: renamed from: a */
    public short f63087a;

    /* JADX INFO: renamed from: b */
    public String f63089b;

    /* JADX INFO: renamed from: b */
    public short f63090b;

    /* JADX INFO: renamed from: c */
    public String f63091c;

    /* JADX INFO: renamed from: d */
    public String f63092d;

    /* JADX INFO: renamed from: e */
    public String f63093e;

    /* JADX INFO: renamed from: f */
    public String f63094f;

    /* JADX INFO: renamed from: g */
    public String f63095g;

    /* JADX INFO: renamed from: h */
    public String f63096h;

    /* JADX INFO: renamed from: i */
    public String f63097i;

    /* JADX INFO: renamed from: j */
    public String f63098j;

    /* JADX INFO: renamed from: k */
    public String f63099k;

    /* JADX INFO: renamed from: l */
    public String f63100l;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63060a = new z3r0("XmPushActionAckMessage");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63059a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63061b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63062c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63063d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63064e = new m3r0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63065f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63066g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63067h = new m3r0("", (byte) 12, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63068i = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63069j = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63070k = new m3r0("", (byte) 2, 11);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63071l = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f63072m = new m3r0("", (byte) 11, 13);

    /* JADX INFO: renamed from: n */
    private static final m3r0 f63073n = new m3r0("", (byte) 11, 14);

    /* JADX INFO: renamed from: o */
    private static final m3r0 f63074o = new m3r0("", (byte) 6, 15);

    /* JADX INFO: renamed from: p */
    private static final m3r0 f63075p = new m3r0("", (byte) 6, 16);

    /* JADX INFO: renamed from: q */
    private static final m3r0 f63076q = new m3r0("", (byte) 11, 20);

    /* JADX INFO: renamed from: r */
    private static final m3r0 f63077r = new m3r0("", (byte) 11, 21);

    /* JADX INFO: renamed from: s */
    private static final m3r0 f63078s = new m3r0("", (byte) 8, 22);

    /* JADX INFO: renamed from: t */
    private static final m3r0 f63079t = new m3r0("", HttpTokens.CARRIAGE_RETURN, 23);

    /* JADX INFO: renamed from: a */
    private BitSet f63085a = new BitSet(5);

    /* JADX INFO: renamed from: a */
    public boolean f63088a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14904gv c14904gv) {
        int iM148149h;
        int iM148143b;
        int iM148146e;
        int iM148146e2;
        int iM148151j;
        int iM148151j2;
        int iM148146e3;
        int iM148146e4;
        int iM148146e5;
        int iM148152k;
        int iM148146e6;
        int iM148146e7;
        int iM148145d;
        int iM148146e8;
        int iM148146e9;
        int iM148144c;
        int iM148146e10;
        int iM148146e11;
        int iM148145d2;
        int iM148146e12;
        if (!getClass().equals(c14904gv.getClass())) {
            return getClass().getName().compareTo(c14904gv.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86954a()).compareTo(Boolean.valueOf(c14904gv.m86954a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86954a() && (iM148146e12 = k3r0.m148146e(this.f63084a, c14904gv.f63084a)) != 0) {
            return iM148146e12;
        }
        int iCompareTo2 = Boolean.valueOf(m86958b()).compareTo(Boolean.valueOf(c14904gv.m86958b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86958b() && (iM148145d2 = k3r0.m148145d(this.f63082a, c14904gv.f63082a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo3 = Boolean.valueOf(m86961c()).compareTo(Boolean.valueOf(c14904gv.m86961c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86961c() && (iM148146e11 = k3r0.m148146e(this.f63089b, c14904gv.f63089b)) != 0) {
            return iM148146e11;
        }
        int iCompareTo4 = Boolean.valueOf(m86964d()).compareTo(Boolean.valueOf(c14904gv.m86964d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86964d() && (iM148146e10 = k3r0.m148146e(this.f63091c, c14904gv.f63091c)) != 0) {
            return iM148146e10;
        }
        int iCompareTo5 = Boolean.valueOf(m86966e()).compareTo(Boolean.valueOf(c14904gv.m86966e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86966e() && (iM148144c = k3r0.m148144c(this.f63081a, c14904gv.f63081a)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m86967f()).compareTo(Boolean.valueOf(c14904gv.m86967f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86967f() && (iM148146e9 = k3r0.m148146e(this.f63092d, c14904gv.f63092d)) != 0) {
            return iM148146e9;
        }
        int iCompareTo7 = Boolean.valueOf(m86968g()).compareTo(Boolean.valueOf(c14904gv.m86968g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86968g() && (iM148146e8 = k3r0.m148146e(this.f63093e, c14904gv.f63093e)) != 0) {
            return iM148146e8;
        }
        int iCompareTo8 = Boolean.valueOf(m86969h()).compareTo(Boolean.valueOf(c14904gv.m86969h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86969h() && (iM148145d = k3r0.m148145d(this.f63083a, c14904gv.f63083a)) != 0) {
            return iM148145d;
        }
        int iCompareTo9 = Boolean.valueOf(m86970i()).compareTo(Boolean.valueOf(c14904gv.m86970i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86970i() && (iM148146e7 = k3r0.m148146e(this.f63094f, c14904gv.f63094f)) != 0) {
            return iM148146e7;
        }
        int iCompareTo10 = Boolean.valueOf(m86971j()).compareTo(Boolean.valueOf(c14904gv.m86971j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86971j() && (iM148146e6 = k3r0.m148146e(this.f63095g, c14904gv.f63095g)) != 0) {
            return iM148146e6;
        }
        int iCompareTo11 = Boolean.valueOf(m86972k()).compareTo(Boolean.valueOf(c14904gv.m86972k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86972k() && (iM148152k = k3r0.m148152k(this.f63088a, c14904gv.f63088a)) != 0) {
            return iM148152k;
        }
        int iCompareTo12 = Boolean.valueOf(m86973l()).compareTo(Boolean.valueOf(c14904gv.m86973l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m86973l() && (iM148146e5 = k3r0.m148146e(this.f63096h, c14904gv.f63096h)) != 0) {
            return iM148146e5;
        }
        int iCompareTo13 = Boolean.valueOf(m86974m()).compareTo(Boolean.valueOf(c14904gv.m86974m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m86974m() && (iM148146e4 = k3r0.m148146e(this.f63097i, c14904gv.f63097i)) != 0) {
            return iM148146e4;
        }
        int iCompareTo14 = Boolean.valueOf(m86975n()).compareTo(Boolean.valueOf(c14904gv.m86975n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m86975n() && (iM148146e3 = k3r0.m148146e(this.f63098j, c14904gv.f63098j)) != 0) {
            return iM148146e3;
        }
        int iCompareTo15 = Boolean.valueOf(m86976o()).compareTo(Boolean.valueOf(c14904gv.m86976o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m86976o() && (iM148151j2 = k3r0.m148151j(this.f63087a, c14904gv.f63087a)) != 0) {
            return iM148151j2;
        }
        int iCompareTo16 = Boolean.valueOf(m86977p()).compareTo(Boolean.valueOf(c14904gv.m86977p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m86977p() && (iM148151j = k3r0.m148151j(this.f63090b, c14904gv.f63090b)) != 0) {
            return iM148151j;
        }
        int iCompareTo17 = Boolean.valueOf(m86978q()).compareTo(Boolean.valueOf(c14904gv.m86978q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m86978q() && (iM148146e2 = k3r0.m148146e(this.f63099k, c14904gv.f63099k)) != 0) {
            return iM148146e2;
        }
        int iCompareTo18 = Boolean.valueOf(m86979r()).compareTo(Boolean.valueOf(c14904gv.m86979r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m86979r() && (iM148146e = k3r0.m148146e(this.f63100l, c14904gv.f63100l)) != 0) {
            return iM148146e;
        }
        int iCompareTo19 = Boolean.valueOf(m86980s()).compareTo(Boolean.valueOf(c14904gv.m86980s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m86980s() && (iM148143b = k3r0.m148143b(this.f63080a, c14904gv.f63080a)) != 0) {
            return iM148143b;
        }
        int iCompareTo20 = Boolean.valueOf(m86981t()).compareTo(Boolean.valueOf(c14904gv.m86981t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m86981t() || (iM148149h = k3r0.m148149h(this.f63086a, c14904gv.f63086a)) == 0) {
            return 0;
        }
        return iM148149h;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86952a();
        w3r0Var.mo87408v(f63060a);
        if (this.f63084a != null && m86954a()) {
            w3r0Var.mo87405s(f63059a);
            w3r0Var.mo87403q(this.f63084a);
            w3r0Var.mo87412z();
        }
        if (this.f63082a != null && m86958b()) {
            w3r0Var.mo87405s(f63061b);
            this.f63082a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63089b != null) {
            w3r0Var.mo87405s(f63062c);
            w3r0Var.mo87403q(this.f63089b);
            w3r0Var.mo87412z();
        }
        if (this.f63091c != null) {
            w3r0Var.mo87405s(f63063d);
            w3r0Var.mo87403q(this.f63091c);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63064e);
        w3r0Var.mo87402p(this.f63081a);
        w3r0Var.mo87412z();
        if (this.f63092d != null && m86967f()) {
            w3r0Var.mo87405s(f63065f);
            w3r0Var.mo87403q(this.f63092d);
            w3r0Var.mo87412z();
        }
        if (this.f63093e != null && m86968g()) {
            w3r0Var.mo87405s(f63066g);
            w3r0Var.mo87403q(this.f63093e);
            w3r0Var.mo87412z();
        }
        if (this.f63083a != null && m86969h()) {
            w3r0Var.mo87405s(f63067h);
            this.f63083a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63094f != null && m86970i()) {
            w3r0Var.mo87405s(f63068i);
            w3r0Var.mo87403q(this.f63094f);
            w3r0Var.mo87412z();
        }
        if (this.f63095g != null && m86971j()) {
            w3r0Var.mo87405s(f63069j);
            w3r0Var.mo87403q(this.f63095g);
            w3r0Var.mo87412z();
        }
        if (m86972k()) {
            w3r0Var.mo87405s(f63070k);
            w3r0Var.mo87410x(this.f63088a);
            w3r0Var.mo87412z();
        }
        if (this.f63096h != null && m86973l()) {
            w3r0Var.mo87405s(f63071l);
            w3r0Var.mo87403q(this.f63096h);
            w3r0Var.mo87412z();
        }
        if (this.f63097i != null && m86974m()) {
            w3r0Var.mo87405s(f63072m);
            w3r0Var.mo87403q(this.f63097i);
            w3r0Var.mo87412z();
        }
        if (this.f63098j != null && m86975n()) {
            w3r0Var.mo87405s(f63073n);
            w3r0Var.mo87403q(this.f63098j);
            w3r0Var.mo87412z();
        }
        if (m86976o()) {
            w3r0Var.mo87405s(f63074o);
            w3r0Var.mo87409w(this.f63087a);
            w3r0Var.mo87412z();
        }
        if (m86977p()) {
            w3r0Var.mo87405s(f63075p);
            w3r0Var.mo87409w(this.f63090b);
            w3r0Var.mo87412z();
        }
        if (this.f63099k != null && m86978q()) {
            w3r0Var.mo87405s(f63076q);
            w3r0Var.mo87403q(this.f63099k);
            w3r0Var.mo87412z();
        }
        if (this.f63100l != null && m86979r()) {
            w3r0Var.mo87405s(f63077r);
            w3r0Var.mo87403q(this.f63100l);
            w3r0Var.mo87412z();
        }
        if (m86980s()) {
            w3r0Var.mo87405s(f63078s);
            w3r0Var.mo87401o(this.f63080a);
            w3r0Var.mo87412z();
        }
        if (this.f63086a != null && m86981t()) {
            w3r0Var.mo87405s(f63079t);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63086a.size()));
            for (Map.Entry<String, String> entry : this.f63086a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86961c() {
        return this.f63089b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86964d() {
        return this.f63091c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86966e() {
        return this.f63085a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14904gv)) {
            return m86955a((C14904gv) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86967f() {
        return this.f63092d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86968g() {
        return this.f63093e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86969h() {
        return this.f63083a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86970i() {
        return this.f63094f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m86971j() {
        return this.f63095g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86972k() {
        return this.f63085a.get(1);
    }

    /* JADX INFO: renamed from: l */
    public boolean m86973l() {
        return this.f63096h != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m86974m() {
        return this.f63097i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m86975n() {
        return this.f63098j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m86976o() {
        return this.f63085a.get(2);
    }

    /* JADX INFO: renamed from: p */
    public boolean m86977p() {
        return this.f63085a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m86978q() {
        return this.f63099k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m86979r() {
        return this.f63100l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m86980s() {
        return this.f63085a.get(4);
    }

    /* JADX INFO: renamed from: t */
    public boolean m86981t() {
        return this.f63086a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (m86954a()) {
            sb.append("debug:");
            String str = this.f63084a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86958b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63082a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f63089b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63091c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f63081a);
        if (m86967f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f63092d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86968g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f63093e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86969h()) {
            sb.append(", ");
            sb.append("request:");
            C14918hi c14918hi = this.f63083a;
            if (c14918hi == null) {
                sb.append("null");
            } else {
                sb.append(c14918hi);
            }
        }
        if (m86970i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f63094f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86971j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63095g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m86972k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f63088a);
        }
        if (m86973l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f63096h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m86974m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f63097i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m86975n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f63098j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m86976o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f63087a);
        }
        if (m86977p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f63090b);
        }
        if (m86978q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f63099k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m86979r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f63100l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m86980s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f63080a);
        }
        if (m86981t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f63086a;
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
    public C14904gv m86959c(String str) {
        this.f63092d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14904gv m86962d(String str) {
        this.f63093e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m86965e(boolean z) {
        this.f63085a.set(4, z);
    }

    /* JADX INFO: renamed from: c */
    public void m86960c(boolean z) {
        this.f63085a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m86963d(boolean z) {
        this.f63085a.set(3, z);
    }

    /* JADX INFO: renamed from: b */
    public C14904gv m86956b(String str) {
        this.f63091c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m86957b(boolean z) {
        this.f63085a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86958b() {
        return this.f63082a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14904gv m86950a(String str) {
        this.f63089b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14904gv m86949a(long j) {
        this.f63081a = j;
        m86953a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m86953a(boolean z) {
        this.f63085a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14904gv m86951a(short s) {
        this.f63087a = s;
        m86960c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86955a(C14904gv c14904gv) {
        if (c14904gv == null) {
            return false;
        }
        boolean zM86954a = m86954a();
        boolean zM86954a2 = c14904gv.m86954a();
        if ((zM86954a || zM86954a2) && !(zM86954a && zM86954a2 && this.f63084a.equals(c14904gv.f63084a))) {
            return false;
        }
        boolean zM86958b = m86958b();
        boolean zM86958b2 = c14904gv.m86958b();
        if ((zM86958b || zM86958b2) && !(zM86958b && zM86958b2 && this.f63082a.m86941a(c14904gv.f63082a))) {
            return false;
        }
        boolean zM86961c = m86961c();
        boolean zM86961c2 = c14904gv.m86961c();
        if ((zM86961c || zM86961c2) && !(zM86961c && zM86961c2 && this.f63089b.equals(c14904gv.f63089b))) {
            return false;
        }
        boolean zM86964d = m86964d();
        boolean zM86964d2 = c14904gv.m86964d();
        if (((zM86964d || zM86964d2) && !(zM86964d && zM86964d2 && this.f63091c.equals(c14904gv.f63091c))) || this.f63081a != c14904gv.f63081a) {
            return false;
        }
        boolean zM86967f = m86967f();
        boolean zM86967f2 = c14904gv.m86967f();
        if ((zM86967f || zM86967f2) && !(zM86967f && zM86967f2 && this.f63092d.equals(c14904gv.f63092d))) {
            return false;
        }
        boolean zM86968g = m86968g();
        boolean zM86968g2 = c14904gv.m86968g();
        if ((zM86968g || zM86968g2) && !(zM86968g && zM86968g2 && this.f63093e.equals(c14904gv.f63093e))) {
            return false;
        }
        boolean zM86969h = m86969h();
        boolean zM86969h2 = c14904gv.m86969h();
        if ((zM86969h || zM86969h2) && !(zM86969h && zM86969h2 && this.f63083a.m87256a(c14904gv.f63083a))) {
            return false;
        }
        boolean zM86970i = m86970i();
        boolean zM86970i2 = c14904gv.m86970i();
        if ((zM86970i || zM86970i2) && !(zM86970i && zM86970i2 && this.f63094f.equals(c14904gv.f63094f))) {
            return false;
        }
        boolean zM86971j = m86971j();
        boolean zM86971j2 = c14904gv.m86971j();
        if ((zM86971j || zM86971j2) && !(zM86971j && zM86971j2 && this.f63095g.equals(c14904gv.f63095g))) {
            return false;
        }
        boolean zM86972k = m86972k();
        boolean zM86972k2 = c14904gv.m86972k();
        if ((zM86972k || zM86972k2) && !(zM86972k && zM86972k2 && this.f63088a == c14904gv.f63088a)) {
            return false;
        }
        boolean zM86973l = m86973l();
        boolean zM86973l2 = c14904gv.m86973l();
        if ((zM86973l || zM86973l2) && !(zM86973l && zM86973l2 && this.f63096h.equals(c14904gv.f63096h))) {
            return false;
        }
        boolean zM86974m = m86974m();
        boolean zM86974m2 = c14904gv.m86974m();
        if ((zM86974m || zM86974m2) && !(zM86974m && zM86974m2 && this.f63097i.equals(c14904gv.f63097i))) {
            return false;
        }
        boolean zM86975n = m86975n();
        boolean zM86975n2 = c14904gv.m86975n();
        if ((zM86975n || zM86975n2) && !(zM86975n && zM86975n2 && this.f63098j.equals(c14904gv.f63098j))) {
            return false;
        }
        boolean zM86976o = m86976o();
        boolean zM86976o2 = c14904gv.m86976o();
        if ((zM86976o || zM86976o2) && !(zM86976o && zM86976o2 && this.f63087a == c14904gv.f63087a)) {
            return false;
        }
        boolean zM86977p = m86977p();
        boolean zM86977p2 = c14904gv.m86977p();
        if ((zM86977p || zM86977p2) && !(zM86977p && zM86977p2 && this.f63090b == c14904gv.f63090b)) {
            return false;
        }
        boolean zM86978q = m86978q();
        boolean zM86978q2 = c14904gv.m86978q();
        if ((zM86978q || zM86978q2) && !(zM86978q && zM86978q2 && this.f63099k.equals(c14904gv.f63099k))) {
            return false;
        }
        boolean zM86979r = m86979r();
        boolean zM86979r2 = c14904gv.m86979r();
        if ((zM86979r || zM86979r2) && !(zM86979r && zM86979r2 && this.f63100l.equals(c14904gv.f63100l))) {
            return false;
        }
        boolean zM86980s = m86980s();
        boolean zM86980s2 = c14904gv.m86980s();
        if ((zM86980s || zM86980s2) && !(zM86980s && zM86980s2 && this.f63080a == c14904gv.f63080a)) {
            return false;
        }
        boolean zM86981t = m86981t();
        boolean zM86981t2 = c14904gv.m86981t();
        if (zM86981t || zM86981t2) {
            return zM86981t && zM86981t2 && this.f63086a.equals(c14904gv.f63086a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86954a() {
        return this.f63084a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) throws C14929ib {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                if (m86966e()) {
                    m86952a();
                    return;
                }
                throw new C14929ib("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63084a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63082a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63089b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63091c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f63081a = w3r0Var.mo87390d();
                        m86953a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63092d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63093e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14918hi c14918hi = new C14918hi();
                        this.f63083a = c14918hi;
                        c14918hi.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63094f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63095g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f63088a = w3r0Var.mo87411y();
                        m86957b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f63096h = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f63097i = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f63098j = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 15:
                    if (b == 6) {
                        this.f63087a = w3r0Var.mo87398l();
                        m86960c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 16:
                    if (b == 6) {
                        this.f63090b = w3r0Var.mo87398l();
                        m86963d(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 17:
                case 18:
                case 19:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 20:
                    if (b == 11) {
                        this.f63099k = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 21:
                    if (b == 11) {
                        this.f63100l = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 22:
                    if (b == 8) {
                        this.f63080a = w3r0Var.mo87389c();
                        m86965e(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 23:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f63086a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                            this.f63086a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86952a() throws C14929ib {
        if (this.f63089b != null) {
            if (this.f63091c != null) {
                return;
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
