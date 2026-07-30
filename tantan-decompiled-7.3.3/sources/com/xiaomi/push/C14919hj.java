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

/* JADX INFO: renamed from: com.xiaomi.push.hj */
/* JADX INFO: loaded from: classes2.dex */
public class C14919hj implements InterfaceC14925hq<C14919hj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14903gu f63393a;

    /* JADX INFO: renamed from: a */
    public String f63394a;

    /* JADX INFO: renamed from: a */
    public List<String> f63395a;

    /* JADX INFO: renamed from: b */
    public String f63396b;

    /* JADX INFO: renamed from: c */
    public String f63397c;

    /* JADX INFO: renamed from: d */
    public String f63398d;

    /* JADX INFO: renamed from: e */
    public String f63399e;

    /* JADX INFO: renamed from: f */
    public String f63400f;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63385a = new z3r0("XmPushActionSubscription");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63384a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63386b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63387c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63388d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63389e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63390f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63391g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63392h = new m3r0("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14919hj c14919hj) {
        int iM148148g;
        int iM148146e;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148146e5;
        int iM148145d;
        int iM148146e6;
        if (!getClass().equals(c14919hj.getClass())) {
            return getClass().getName().compareTo(c14919hj.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87276a()).compareTo(Boolean.valueOf(c14919hj.m87276a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87276a() && (iM148146e6 = k3r0.m148146e(this.f63394a, c14919hj.f63394a)) != 0) {
            return iM148146e6;
        }
        int iCompareTo2 = Boolean.valueOf(m87279b()).compareTo(Boolean.valueOf(c14919hj.m87279b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87279b() && (iM148145d = k3r0.m148145d(this.f63393a, c14919hj.f63393a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m87281c()).compareTo(Boolean.valueOf(c14919hj.m87281c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87281c() && (iM148146e5 = k3r0.m148146e(this.f63396b, c14919hj.f63396b)) != 0) {
            return iM148146e5;
        }
        int iCompareTo4 = Boolean.valueOf(m87283d()).compareTo(Boolean.valueOf(c14919hj.m87283d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87283d() && (iM148146e4 = k3r0.m148146e(this.f63397c, c14919hj.f63397c)) != 0) {
            return iM148146e4;
        }
        int iCompareTo5 = Boolean.valueOf(m87285e()).compareTo(Boolean.valueOf(c14919hj.m87285e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87285e() && (iM148146e3 = k3r0.m148146e(this.f63398d, c14919hj.f63398d)) != 0) {
            return iM148146e3;
        }
        int iCompareTo6 = Boolean.valueOf(m87286f()).compareTo(Boolean.valueOf(c14919hj.m87286f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87286f() && (iM148146e2 = k3r0.m148146e(this.f63399e, c14919hj.f63399e)) != 0) {
            return iM148146e2;
        }
        int iCompareTo7 = Boolean.valueOf(m87287g()).compareTo(Boolean.valueOf(c14919hj.m87287g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87287g() && (iM148146e = k3r0.m148146e(this.f63400f, c14919hj.f63400f)) != 0) {
            return iM148146e;
        }
        int iCompareTo8 = Boolean.valueOf(m87288h()).compareTo(Boolean.valueOf(c14919hj.m87288h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m87288h() || (iM148148g = k3r0.m148148g(this.f63395a, c14919hj.f63395a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87275a();
        w3r0Var.mo87408v(f63385a);
        if (this.f63394a != null && m87276a()) {
            w3r0Var.mo87405s(f63384a);
            w3r0Var.mo87403q(this.f63394a);
            w3r0Var.mo87412z();
        }
        if (this.f63393a != null && m87279b()) {
            w3r0Var.mo87405s(f63386b);
            this.f63393a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63396b != null) {
            w3r0Var.mo87405s(f63387c);
            w3r0Var.mo87403q(this.f63396b);
            w3r0Var.mo87412z();
        }
        if (this.f63397c != null) {
            w3r0Var.mo87405s(f63388d);
            w3r0Var.mo87403q(this.f63397c);
            w3r0Var.mo87412z();
        }
        if (this.f63398d != null) {
            w3r0Var.mo87405s(f63389e);
            w3r0Var.mo87403q(this.f63398d);
            w3r0Var.mo87412z();
        }
        if (this.f63399e != null && m87286f()) {
            w3r0Var.mo87405s(f63390f);
            w3r0Var.mo87403q(this.f63399e);
            w3r0Var.mo87412z();
        }
        if (this.f63400f != null && m87287g()) {
            w3r0Var.mo87405s(f63391g);
            w3r0Var.mo87403q(this.f63400f);
            w3r0Var.mo87412z();
        }
        if (this.f63395a != null && m87288h()) {
            w3r0Var.mo87405s(f63392h);
            w3r0Var.mo87406t(new n3r0((byte) 11, this.f63395a.size()));
            Iterator<String> it = this.f63395a.iterator();
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
    public boolean m87281c() {
        return this.f63396b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87283d() {
        return this.f63397c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87285e() {
        return this.f63398d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14919hj)) {
            return m87277a((C14919hj) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87286f() {
        return this.f63399e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87287g() {
        return this.f63400f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87288h() {
        return this.f63395a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m87276a()) {
            sb.append("debug:");
            String str = this.f63394a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87279b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63393a;
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
        String str2 = this.f63396b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63397c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f63398d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m87286f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f63399e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87287g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f63400f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87288h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f63395a;
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
    public C14919hj m87280c(String str) {
        this.f63398d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14919hj m87282d(String str) {
        this.f63399e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14919hj m87284e(String str) {
        this.f63400f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14919hj m87278b(String str) {
        this.f63397c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87279b() {
        return this.f63393a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14919hj m87274a(String str) {
        this.f63396b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87277a(C14919hj c14919hj) {
        if (c14919hj == null) {
            return false;
        }
        boolean zM87276a = m87276a();
        boolean zM87276a2 = c14919hj.m87276a();
        if ((zM87276a || zM87276a2) && !(zM87276a && zM87276a2 && this.f63394a.equals(c14919hj.f63394a))) {
            return false;
        }
        boolean zM87279b = m87279b();
        boolean zM87279b2 = c14919hj.m87279b();
        if ((zM87279b || zM87279b2) && !(zM87279b && zM87279b2 && this.f63393a.m86941a(c14919hj.f63393a))) {
            return false;
        }
        boolean zM87281c = m87281c();
        boolean zM87281c2 = c14919hj.m87281c();
        if ((zM87281c || zM87281c2) && !(zM87281c && zM87281c2 && this.f63396b.equals(c14919hj.f63396b))) {
            return false;
        }
        boolean zM87283d = m87283d();
        boolean zM87283d2 = c14919hj.m87283d();
        if ((zM87283d || zM87283d2) && !(zM87283d && zM87283d2 && this.f63397c.equals(c14919hj.f63397c))) {
            return false;
        }
        boolean zM87285e = m87285e();
        boolean zM87285e2 = c14919hj.m87285e();
        if ((zM87285e || zM87285e2) && !(zM87285e && zM87285e2 && this.f63398d.equals(c14919hj.f63398d))) {
            return false;
        }
        boolean zM87286f = m87286f();
        boolean zM87286f2 = c14919hj.m87286f();
        if ((zM87286f || zM87286f2) && !(zM87286f && zM87286f2 && this.f63399e.equals(c14919hj.f63399e))) {
            return false;
        }
        boolean zM87287g = m87287g();
        boolean zM87287g2 = c14919hj.m87287g();
        if ((zM87287g || zM87287g2) && !(zM87287g && zM87287g2 && this.f63400f.equals(c14919hj.f63400f))) {
            return false;
        }
        boolean zM87288h = m87288h();
        boolean zM87288h2 = c14919hj.m87288h();
        if (zM87288h || zM87288h2) {
            return zM87288h && zM87288h2 && this.f63395a.equals(c14919hj.f63395a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87276a() {
        return this.f63394a != null;
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
                m87275a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63394a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63393a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63396b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63397c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63398d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63399e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63400f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f63395a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            this.f63395a.add(w3r0Var.mo87391e());
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
    public void m87275a() throws C14929ib {
        if (this.f63396b != null) {
            if (this.f63397c != null) {
                if (this.f63398d != null) {
                    return;
                }
                throw new C14929ib("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
