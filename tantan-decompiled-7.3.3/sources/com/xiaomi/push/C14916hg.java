package com.xiaomi.push;

import com.xiaomi.push.service.C14987aj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hg */
/* JADX INFO: loaded from: classes2.dex */
public class C14916hg implements InterfaceC14925hq<C14916hg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f63321a;

    /* JADX INFO: renamed from: a */
    public long f63322a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63323a;

    /* JADX INFO: renamed from: a */
    public String f63324a;

    /* JADX INFO: renamed from: a */
    public List<String> f63326a;

    /* JADX INFO: renamed from: b */
    public int f63328b;

    /* JADX INFO: renamed from: b */
    public long f63329b;

    /* JADX INFO: renamed from: b */
    public String f63330b;

    /* JADX INFO: renamed from: c */
    public long f63331c;

    /* JADX INFO: renamed from: c */
    public String f63332c;

    /* JADX INFO: renamed from: d */
    public String f63333d;

    /* JADX INFO: renamed from: e */
    public String f63334e;

    /* JADX INFO: renamed from: f */
    public String f63335f;

    /* JADX INFO: renamed from: g */
    public String f63336g;

    /* JADX INFO: renamed from: h */
    public String f63337h;

    /* JADX INFO: renamed from: i */
    public String f63338i;

    /* JADX INFO: renamed from: j */
    public String f63339j;

    /* JADX INFO: renamed from: k */
    public String f63340k;

    /* JADX INFO: renamed from: l */
    public String f63341l;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63301a = new z3r0("XmPushActionRegistrationResult");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63300a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63302b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63303c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63304d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63305e = new m3r0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63306f = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63307g = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63308h = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63309i = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63310j = new m3r0("", (byte) 10, 11);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63311k = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63312l = new m3r0("", (byte) 11, 13);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f63313m = new m3r0("", (byte) 10, 14);

    /* JADX INFO: renamed from: n */
    private static final m3r0 f63314n = new m3r0("", (byte) 11, 15);

    /* JADX INFO: renamed from: o */
    private static final m3r0 f63315o = new m3r0("", (byte) 8, 16);

    /* JADX INFO: renamed from: p */
    private static final m3r0 f63316p = new m3r0("", (byte) 11, 17);

    /* JADX INFO: renamed from: q */
    private static final m3r0 f63317q = new m3r0("", (byte) 8, 18);

    /* JADX INFO: renamed from: r */
    private static final m3r0 f63318r = new m3r0("", (byte) 11, 19);

    /* JADX INFO: renamed from: s */
    private static final m3r0 f63319s = new m3r0("", (byte) 2, 20);

    /* JADX INFO: renamed from: t */
    private static final m3r0 f63320t = new m3r0("", (byte) 15, 21);

    /* JADX INFO: renamed from: a */
    private BitSet f63325a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f63327a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14916hg c14916hg) {
        int iM148148g;
        int iM148152k;
        int iM148146e;
        int iM148143b;
        int iM148146e2;
        int iM148143b2;
        int iM148146e3;
        int iM148144c;
        int iM148146e4;
        int iM148146e5;
        int iM148144c2;
        int iM148146e6;
        int iM148146e7;
        int iM148146e8;
        int iM148146e9;
        int iM148144c3;
        int iM148146e10;
        int iM148146e11;
        int iM148145d;
        int iM148146e12;
        if (!getClass().equals(c14916hg.getClass())) {
            return getClass().getName().compareTo(c14916hg.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87211a()).compareTo(Boolean.valueOf(c14916hg.m87211a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87211a() && (iM148146e12 = k3r0.m148146e(this.f63324a, c14916hg.f63324a)) != 0) {
            return iM148146e12;
        }
        int iCompareTo2 = Boolean.valueOf(m87215b()).compareTo(Boolean.valueOf(c14916hg.m87215b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87215b() && (iM148145d = k3r0.m148145d(this.f63323a, c14916hg.f63323a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m87218c()).compareTo(Boolean.valueOf(c14916hg.m87218c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87218c() && (iM148146e11 = k3r0.m148146e(this.f63330b, c14916hg.f63330b)) != 0) {
            return iM148146e11;
        }
        int iCompareTo4 = Boolean.valueOf(m87220d()).compareTo(Boolean.valueOf(c14916hg.m87220d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87220d() && (iM148146e10 = k3r0.m148146e(this.f63332c, c14916hg.f63332c)) != 0) {
            return iM148146e10;
        }
        int iCompareTo5 = Boolean.valueOf(m87222e()).compareTo(Boolean.valueOf(c14916hg.m87222e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87222e() && (iM148144c3 = k3r0.m148144c(this.f63322a, c14916hg.f63322a)) != 0) {
            return iM148144c3;
        }
        int iCompareTo6 = Boolean.valueOf(m87224f()).compareTo(Boolean.valueOf(c14916hg.m87224f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87224f() && (iM148146e9 = k3r0.m148146e(this.f63333d, c14916hg.f63333d)) != 0) {
            return iM148146e9;
        }
        int iCompareTo7 = Boolean.valueOf(m87225g()).compareTo(Boolean.valueOf(c14916hg.m87225g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87225g() && (iM148146e8 = k3r0.m148146e(this.f63334e, c14916hg.f63334e)) != 0) {
            return iM148146e8;
        }
        int iCompareTo8 = Boolean.valueOf(m87226h()).compareTo(Boolean.valueOf(c14916hg.m87226h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87226h() && (iM148146e7 = k3r0.m148146e(this.f63335f, c14916hg.f63335f)) != 0) {
            return iM148146e7;
        }
        int iCompareTo9 = Boolean.valueOf(m87227i()).compareTo(Boolean.valueOf(c14916hg.m87227i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87227i() && (iM148146e6 = k3r0.m148146e(this.f63336g, c14916hg.f63336g)) != 0) {
            return iM148146e6;
        }
        int iCompareTo10 = Boolean.valueOf(m87228j()).compareTo(Boolean.valueOf(c14916hg.m87228j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m87228j() && (iM148144c2 = k3r0.m148144c(this.f63329b, c14916hg.f63329b)) != 0) {
            return iM148144c2;
        }
        int iCompareTo11 = Boolean.valueOf(m87229k()).compareTo(Boolean.valueOf(c14916hg.m87229k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m87229k() && (iM148146e5 = k3r0.m148146e(this.f63337h, c14916hg.f63337h)) != 0) {
            return iM148146e5;
        }
        int iCompareTo12 = Boolean.valueOf(m87230l()).compareTo(Boolean.valueOf(c14916hg.m87230l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m87230l() && (iM148146e4 = k3r0.m148146e(this.f63338i, c14916hg.f63338i)) != 0) {
            return iM148146e4;
        }
        int iCompareTo13 = Boolean.valueOf(m87231m()).compareTo(Boolean.valueOf(c14916hg.m87231m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m87231m() && (iM148144c = k3r0.m148144c(this.f63331c, c14916hg.f63331c)) != 0) {
            return iM148144c;
        }
        int iCompareTo14 = Boolean.valueOf(m87232n()).compareTo(Boolean.valueOf(c14916hg.m87232n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m87232n() && (iM148146e3 = k3r0.m148146e(this.f63339j, c14916hg.f63339j)) != 0) {
            return iM148146e3;
        }
        int iCompareTo15 = Boolean.valueOf(m87233o()).compareTo(Boolean.valueOf(c14916hg.m87233o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m87233o() && (iM148143b2 = k3r0.m148143b(this.f63321a, c14916hg.f63321a)) != 0) {
            return iM148143b2;
        }
        int iCompareTo16 = Boolean.valueOf(m87234p()).compareTo(Boolean.valueOf(c14916hg.m87234p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m87234p() && (iM148146e2 = k3r0.m148146e(this.f63340k, c14916hg.f63340k)) != 0) {
            return iM148146e2;
        }
        int iCompareTo17 = Boolean.valueOf(m87235q()).compareTo(Boolean.valueOf(c14916hg.m87235q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m87235q() && (iM148143b = k3r0.m148143b(this.f63328b, c14916hg.f63328b)) != 0) {
            return iM148143b;
        }
        int iCompareTo18 = Boolean.valueOf(m87236r()).compareTo(Boolean.valueOf(c14916hg.m87236r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m87236r() && (iM148146e = k3r0.m148146e(this.f63341l, c14916hg.f63341l)) != 0) {
            return iM148146e;
        }
        int iCompareTo19 = Boolean.valueOf(m87237s()).compareTo(Boolean.valueOf(c14916hg.m87237s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m87237s() && (iM148152k = k3r0.m148152k(this.f63327a, c14916hg.f63327a)) != 0) {
            return iM148152k;
        }
        int iCompareTo20 = Boolean.valueOf(m87238t()).compareTo(Boolean.valueOf(c14916hg.m87238t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m87238t() || (iM148148g = k3r0.m148148g(this.f63326a, c14916hg.f63326a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87209a();
        w3r0Var.mo87408v(f63301a);
        if (this.f63324a != null && m87211a()) {
            w3r0Var.mo87405s(f63300a);
            w3r0Var.mo87403q(this.f63324a);
            w3r0Var.mo87412z();
        }
        if (this.f63323a != null && m87215b()) {
            w3r0Var.mo87405s(f63302b);
            this.f63323a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63330b != null) {
            w3r0Var.mo87405s(f63303c);
            w3r0Var.mo87403q(this.f63330b);
            w3r0Var.mo87412z();
        }
        if (this.f63332c != null) {
            w3r0Var.mo87405s(f63304d);
            w3r0Var.mo87403q(this.f63332c);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63305e);
        w3r0Var.mo87402p(this.f63322a);
        w3r0Var.mo87412z();
        if (this.f63333d != null && m87224f()) {
            w3r0Var.mo87405s(f63306f);
            w3r0Var.mo87403q(this.f63333d);
            w3r0Var.mo87412z();
        }
        if (this.f63334e != null && m87225g()) {
            w3r0Var.mo87405s(f63307g);
            w3r0Var.mo87403q(this.f63334e);
            w3r0Var.mo87412z();
        }
        if (this.f63335f != null && m87226h()) {
            w3r0Var.mo87405s(f63308h);
            w3r0Var.mo87403q(this.f63335f);
            w3r0Var.mo87412z();
        }
        if (this.f63336g != null && m87227i()) {
            w3r0Var.mo87405s(f63309i);
            w3r0Var.mo87403q(this.f63336g);
            w3r0Var.mo87412z();
        }
        if (m87228j()) {
            w3r0Var.mo87405s(f63310j);
            w3r0Var.mo87402p(this.f63329b);
            w3r0Var.mo87412z();
        }
        if (this.f63337h != null && m87229k()) {
            w3r0Var.mo87405s(f63311k);
            w3r0Var.mo87403q(this.f63337h);
            w3r0Var.mo87412z();
        }
        if (this.f63338i != null && m87230l()) {
            w3r0Var.mo87405s(f63312l);
            w3r0Var.mo87403q(this.f63338i);
            w3r0Var.mo87412z();
        }
        if (m87231m()) {
            w3r0Var.mo87405s(f63313m);
            w3r0Var.mo87402p(this.f63331c);
            w3r0Var.mo87412z();
        }
        if (this.f63339j != null && m87232n()) {
            w3r0Var.mo87405s(f63314n);
            w3r0Var.mo87403q(this.f63339j);
            w3r0Var.mo87412z();
        }
        if (m87233o()) {
            w3r0Var.mo87405s(f63315o);
            w3r0Var.mo87401o(this.f63321a);
            w3r0Var.mo87412z();
        }
        if (this.f63340k != null && m87234p()) {
            w3r0Var.mo87405s(f63316p);
            w3r0Var.mo87403q(this.f63340k);
            w3r0Var.mo87412z();
        }
        if (m87235q()) {
            w3r0Var.mo87405s(f63317q);
            w3r0Var.mo87401o(this.f63328b);
            w3r0Var.mo87412z();
        }
        if (this.f63341l != null && m87236r()) {
            w3r0Var.mo87405s(f63318r);
            w3r0Var.mo87403q(this.f63341l);
            w3r0Var.mo87412z();
        }
        if (m87237s()) {
            w3r0Var.mo87405s(f63319s);
            w3r0Var.mo87410x(this.f63327a);
            w3r0Var.mo87412z();
        }
        if (this.f63326a != null && m87238t()) {
            w3r0Var.mo87405s(f63320t);
            w3r0Var.mo87406t(new n3r0((byte) 11, this.f63326a.size()));
            Iterator<String> it = this.f63326a.iterator();
            while (it.hasNext()) {
                w3r0Var.mo87403q(it.next());
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87218c() {
        return this.f63330b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87220d() {
        return this.f63332c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87222e() {
        return this.f63325a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14916hg)) {
            return m87212a((C14916hg) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87224f() {
        return this.f63333d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87225g() {
        return this.f63334e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87226h() {
        return this.f63335f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87227i() {
        return this.f63336g != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m87228j() {
        return this.f63325a.get(1);
    }

    /* JADX INFO: renamed from: k */
    public boolean m87229k() {
        return this.f63337h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m87230l() {
        return this.f63338i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m87231m() {
        return this.f63325a.get(2);
    }

    /* JADX INFO: renamed from: n */
    public boolean m87232n() {
        return this.f63339j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m87233o() {
        return this.f63325a.get(3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m87234p() {
        return this.f63340k != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m87235q() {
        return this.f63325a.get(4);
    }

    /* JADX INFO: renamed from: r */
    public boolean m87236r() {
        return this.f63341l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m87237s() {
        return this.f63325a.get(5);
    }

    /* JADX INFO: renamed from: t */
    public boolean m87238t() {
        return this.f63326a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (m87211a()) {
            sb.append("debug:");
            String str = this.f63324a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87215b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63323a;
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
        String str2 = this.f63330b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(C14987aj.m87667a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63332c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f63322a);
        if (m87224f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f63333d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87225g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f63334e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87227i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f63336g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87228j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f63329b);
        }
        if (m87229k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f63337h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m87230l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f63338i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m87231m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f63331c);
        }
        if (m87232n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f63339j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m87233o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f63321a);
        }
        if (m87234p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f63340k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m87235q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f63328b);
        }
        if (m87236r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f63341l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m87237s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f63327a);
        }
        if (m87238t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f63326a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m87216c() {
        return this.f63336g;
    }

    /* JADX INFO: renamed from: d */
    public void m87219d(boolean z) {
        this.f63325a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m87221e(boolean z) {
        this.f63325a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m87223f(boolean z) {
        this.f63325a.set(5, z);
    }

    /* JADX INFO: renamed from: c */
    public void m87217c(boolean z) {
        this.f63325a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m87213b() {
        return this.f63335f;
    }

    /* JADX INFO: renamed from: b */
    public void m87214b(boolean z) {
        this.f63325a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m87215b() {
        return this.f63323a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m87207a() {
        return this.f63330b;
    }

    /* JADX INFO: renamed from: a */
    public long m87206a() {
        return this.f63322a;
    }

    /* JADX INFO: renamed from: a */
    public void m87210a(boolean z) {
        this.f63325a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m87208a() {
        return this.f63326a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87212a(C14916hg c14916hg) {
        if (c14916hg == null) {
            return false;
        }
        boolean zM87211a = m87211a();
        boolean zM87211a2 = c14916hg.m87211a();
        if ((zM87211a || zM87211a2) && !(zM87211a && zM87211a2 && this.f63324a.equals(c14916hg.f63324a))) {
            return false;
        }
        boolean zM87215b = m87215b();
        boolean zM87215b2 = c14916hg.m87215b();
        if ((zM87215b || zM87215b2) && !(zM87215b && zM87215b2 && this.f63323a.m86941a(c14916hg.f63323a))) {
            return false;
        }
        boolean zM87218c = m87218c();
        boolean zM87218c2 = c14916hg.m87218c();
        if ((zM87218c || zM87218c2) && !(zM87218c && zM87218c2 && this.f63330b.equals(c14916hg.f63330b))) {
            return false;
        }
        boolean zM87220d = m87220d();
        boolean zM87220d2 = c14916hg.m87220d();
        if (((zM87220d || zM87220d2) && !(zM87220d && zM87220d2 && this.f63332c.equals(c14916hg.f63332c))) || this.f63322a != c14916hg.f63322a) {
            return false;
        }
        boolean zM87224f = m87224f();
        boolean zM87224f2 = c14916hg.m87224f();
        if ((zM87224f || zM87224f2) && !(zM87224f && zM87224f2 && this.f63333d.equals(c14916hg.f63333d))) {
            return false;
        }
        boolean zM87225g = m87225g();
        boolean zM87225g2 = c14916hg.m87225g();
        if ((zM87225g || zM87225g2) && !(zM87225g && zM87225g2 && this.f63334e.equals(c14916hg.f63334e))) {
            return false;
        }
        boolean zM87226h = m87226h();
        boolean zM87226h2 = c14916hg.m87226h();
        if ((zM87226h || zM87226h2) && !(zM87226h && zM87226h2 && this.f63335f.equals(c14916hg.f63335f))) {
            return false;
        }
        boolean zM87227i = m87227i();
        boolean zM87227i2 = c14916hg.m87227i();
        if ((zM87227i || zM87227i2) && !(zM87227i && zM87227i2 && this.f63336g.equals(c14916hg.f63336g))) {
            return false;
        }
        boolean zM87228j = m87228j();
        boolean zM87228j2 = c14916hg.m87228j();
        if ((zM87228j || zM87228j2) && !(zM87228j && zM87228j2 && this.f63329b == c14916hg.f63329b)) {
            return false;
        }
        boolean zM87229k = m87229k();
        boolean zM87229k2 = c14916hg.m87229k();
        if ((zM87229k || zM87229k2) && !(zM87229k && zM87229k2 && this.f63337h.equals(c14916hg.f63337h))) {
            return false;
        }
        boolean zM87230l = m87230l();
        boolean zM87230l2 = c14916hg.m87230l();
        if ((zM87230l || zM87230l2) && !(zM87230l && zM87230l2 && this.f63338i.equals(c14916hg.f63338i))) {
            return false;
        }
        boolean zM87231m = m87231m();
        boolean zM87231m2 = c14916hg.m87231m();
        if ((zM87231m || zM87231m2) && !(zM87231m && zM87231m2 && this.f63331c == c14916hg.f63331c)) {
            return false;
        }
        boolean zM87232n = m87232n();
        boolean zM87232n2 = c14916hg.m87232n();
        if ((zM87232n || zM87232n2) && !(zM87232n && zM87232n2 && this.f63339j.equals(c14916hg.f63339j))) {
            return false;
        }
        boolean zM87233o = m87233o();
        boolean zM87233o2 = c14916hg.m87233o();
        if ((zM87233o || zM87233o2) && !(zM87233o && zM87233o2 && this.f63321a == c14916hg.f63321a)) {
            return false;
        }
        boolean zM87234p = m87234p();
        boolean zM87234p2 = c14916hg.m87234p();
        if ((zM87234p || zM87234p2) && !(zM87234p && zM87234p2 && this.f63340k.equals(c14916hg.f63340k))) {
            return false;
        }
        boolean zM87235q = m87235q();
        boolean zM87235q2 = c14916hg.m87235q();
        if ((zM87235q || zM87235q2) && !(zM87235q && zM87235q2 && this.f63328b == c14916hg.f63328b)) {
            return false;
        }
        boolean zM87236r = m87236r();
        boolean zM87236r2 = c14916hg.m87236r();
        if ((zM87236r || zM87236r2) && !(zM87236r && zM87236r2 && this.f63341l.equals(c14916hg.f63341l))) {
            return false;
        }
        boolean zM87237s = m87237s();
        boolean zM87237s2 = c14916hg.m87237s();
        if ((zM87237s || zM87237s2) && !(zM87237s && zM87237s2 && this.f63327a == c14916hg.f63327a)) {
            return false;
        }
        boolean zM87238t = m87238t();
        boolean zM87238t2 = c14916hg.m87238t();
        if (zM87238t || zM87238t2) {
            return zM87238t && zM87238t2 && this.f63326a.equals(c14916hg.f63326a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87211a() {
        return this.f63324a != null;
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
                if (m87222e()) {
                    m87209a();
                    return;
                }
                throw new C14929ib("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63324a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63323a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63330b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63332c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 6:
                    if (b == 10) {
                        this.f63322a = w3r0Var.mo87390d();
                        m87210a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63333d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63334e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63335f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63336g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 10) {
                        this.f63329b = w3r0Var.mo87390d();
                        m87214b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f63337h = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f63338i = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 14:
                    if (b == 10) {
                        this.f63331c = w3r0Var.mo87390d();
                        m87217c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 15:
                    if (b == 11) {
                        this.f63339j = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 16:
                    if (b == 8) {
                        this.f63321a = w3r0Var.mo87389c();
                        m87219d(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 17:
                    if (b == 11) {
                        this.f63340k = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 18:
                    if (b == 8) {
                        this.f63328b = w3r0Var.mo87389c();
                        m87221e(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 19:
                    if (b == 11) {
                        this.f63341l = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 20:
                    if (b == 2) {
                        this.f63327a = w3r0Var.mo87411y();
                        m87223f(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 21:
                    if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f63326a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            this.f63326a.add(w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87382G();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87209a() throws C14929ib {
        if (this.f63330b != null) {
            if (this.f63332c != null) {
                return;
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
