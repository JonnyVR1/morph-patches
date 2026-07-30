package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hn */
/* JADX INFO: loaded from: classes2.dex */
public class C14923hn implements InterfaceC14925hq<C14923hn, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14903gu f63476a;

    /* JADX INFO: renamed from: a */
    public String f63477a;

    /* JADX INFO: renamed from: a */
    public List<String> f63478a;

    /* JADX INFO: renamed from: b */
    public String f63479b;

    /* JADX INFO: renamed from: c */
    public String f63480c;

    /* JADX INFO: renamed from: d */
    public String f63481d;

    /* JADX INFO: renamed from: e */
    public String f63482e;

    /* JADX INFO: renamed from: f */
    public String f63483f;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63468a = new z3r0("XmPushActionUnSubscription");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63467a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63469b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63470c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63471d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63472e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63473f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63474g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63475h = new m3r0("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14923hn c14923hn) {
        int iM148148g;
        int iM148146e;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148146e5;
        int iM148145d;
        int iM148146e6;
        if (!getClass().equals(c14923hn.getClass())) {
            return getClass().getName().compareTo(c14923hn.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87346a()).compareTo(Boolean.valueOf(c14923hn.m87346a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87346a() && (iM148146e6 = k3r0.m148146e(this.f63477a, c14923hn.f63477a)) != 0) {
            return iM148146e6;
        }
        int iCompareTo2 = Boolean.valueOf(m87349b()).compareTo(Boolean.valueOf(c14923hn.m87349b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87349b() && (iM148145d = k3r0.m148145d(this.f63476a, c14923hn.f63476a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m87351c()).compareTo(Boolean.valueOf(c14923hn.m87351c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87351c() && (iM148146e5 = k3r0.m148146e(this.f63479b, c14923hn.f63479b)) != 0) {
            return iM148146e5;
        }
        int iCompareTo4 = Boolean.valueOf(m87353d()).compareTo(Boolean.valueOf(c14923hn.m87353d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87353d() && (iM148146e4 = k3r0.m148146e(this.f63480c, c14923hn.f63480c)) != 0) {
            return iM148146e4;
        }
        int iCompareTo5 = Boolean.valueOf(m87355e()).compareTo(Boolean.valueOf(c14923hn.m87355e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87355e() && (iM148146e3 = k3r0.m148146e(this.f63481d, c14923hn.f63481d)) != 0) {
            return iM148146e3;
        }
        int iCompareTo6 = Boolean.valueOf(m87356f()).compareTo(Boolean.valueOf(c14923hn.m87356f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87356f() && (iM148146e2 = k3r0.m148146e(this.f63482e, c14923hn.f63482e)) != 0) {
            return iM148146e2;
        }
        int iCompareTo7 = Boolean.valueOf(m87357g()).compareTo(Boolean.valueOf(c14923hn.m87357g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87357g() && (iM148146e = k3r0.m148146e(this.f63483f, c14923hn.f63483f)) != 0) {
            return iM148146e;
        }
        int iCompareTo8 = Boolean.valueOf(m87358h()).compareTo(Boolean.valueOf(c14923hn.m87358h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m87358h() || (iM148148g = k3r0.m148148g(this.f63478a, c14923hn.f63478a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87345a();
        w3r0Var.mo87408v(f63468a);
        if (this.f63477a != null && m87346a()) {
            w3r0Var.mo87405s(f63467a);
            w3r0Var.mo87403q(this.f63477a);
            w3r0Var.mo87412z();
        }
        if (this.f63476a != null && m87349b()) {
            w3r0Var.mo87405s(f63469b);
            this.f63476a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63479b != null) {
            w3r0Var.mo87405s(f63470c);
            w3r0Var.mo87403q(this.f63479b);
            w3r0Var.mo87412z();
        }
        if (this.f63480c != null) {
            w3r0Var.mo87405s(f63471d);
            w3r0Var.mo87403q(this.f63480c);
            w3r0Var.mo87412z();
        }
        if (this.f63481d != null) {
            w3r0Var.mo87405s(f63472e);
            w3r0Var.mo87403q(this.f63481d);
            w3r0Var.mo87412z();
        }
        if (this.f63482e != null && m87356f()) {
            w3r0Var.mo87405s(f63473f);
            w3r0Var.mo87403q(this.f63482e);
            w3r0Var.mo87412z();
        }
        if (this.f63483f != null && m87357g()) {
            w3r0Var.mo87405s(f63474g);
            w3r0Var.mo87403q(this.f63483f);
            w3r0Var.mo87412z();
        }
        if (this.f63478a != null && m87358h()) {
            w3r0Var.mo87405s(f63475h);
            w3r0Var.mo87406t(new n3r0((byte) 11, this.f63478a.size()));
            Iterator<String> it = this.f63478a.iterator();
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
    public boolean m87351c() {
        return this.f63479b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87353d() {
        return this.f63480c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87355e() {
        return this.f63481d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14923hn)) {
            return m87347a((C14923hn) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87356f() {
        return this.f63482e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87357g() {
        return this.f63483f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87358h() {
        return this.f63478a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m87346a()) {
            sb.append("debug:");
            String str = this.f63477a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87349b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63476a;
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
        String str2 = this.f63479b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63480c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f63481d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m87356f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f63482e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87357g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f63483f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87358h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f63478a;
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
    public C14923hn m87350c(String str) {
        this.f63481d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14923hn m87352d(String str) {
        this.f63482e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14923hn m87354e(String str) {
        this.f63483f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14923hn m87348b(String str) {
        this.f63480c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87349b() {
        return this.f63476a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14923hn m87344a(String str) {
        this.f63479b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87347a(C14923hn c14923hn) {
        if (c14923hn == null) {
            return false;
        }
        boolean zM87346a = m87346a();
        boolean zM87346a2 = c14923hn.m87346a();
        if ((zM87346a || zM87346a2) && !(zM87346a && zM87346a2 && this.f63477a.equals(c14923hn.f63477a))) {
            return false;
        }
        boolean zM87349b = m87349b();
        boolean zM87349b2 = c14923hn.m87349b();
        if ((zM87349b || zM87349b2) && !(zM87349b && zM87349b2 && this.f63476a.m86941a(c14923hn.f63476a))) {
            return false;
        }
        boolean zM87351c = m87351c();
        boolean zM87351c2 = c14923hn.m87351c();
        if ((zM87351c || zM87351c2) && !(zM87351c && zM87351c2 && this.f63479b.equals(c14923hn.f63479b))) {
            return false;
        }
        boolean zM87353d = m87353d();
        boolean zM87353d2 = c14923hn.m87353d();
        if ((zM87353d || zM87353d2) && !(zM87353d && zM87353d2 && this.f63480c.equals(c14923hn.f63480c))) {
            return false;
        }
        boolean zM87355e = m87355e();
        boolean zM87355e2 = c14923hn.m87355e();
        if ((zM87355e || zM87355e2) && !(zM87355e && zM87355e2 && this.f63481d.equals(c14923hn.f63481d))) {
            return false;
        }
        boolean zM87356f = m87356f();
        boolean zM87356f2 = c14923hn.m87356f();
        if ((zM87356f || zM87356f2) && !(zM87356f && zM87356f2 && this.f63482e.equals(c14923hn.f63482e))) {
            return false;
        }
        boolean zM87357g = m87357g();
        boolean zM87357g2 = c14923hn.m87357g();
        if ((zM87357g || zM87357g2) && !(zM87357g && zM87357g2 && this.f63483f.equals(c14923hn.f63483f))) {
            return false;
        }
        boolean zM87358h = m87358h();
        boolean zM87358h2 = c14923hn.m87358h();
        if (zM87358h || zM87358h2) {
            return zM87358h && zM87358h2 && this.f63478a.equals(c14923hn.f63478a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87346a() {
        return this.f63477a != null;
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
                m87345a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63477a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63476a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63479b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63480c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63481d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63482e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63483f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f63478a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            this.f63478a.add(w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87382G();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87345a() throws C14929ib {
        if (this.f63479b != null) {
            if (this.f63480c != null) {
                if (this.f63481d != null) {
                    return;
                }
                throw new C14929ib("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
