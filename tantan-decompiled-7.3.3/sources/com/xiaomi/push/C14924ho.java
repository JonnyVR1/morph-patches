package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.ho */
/* JADX INFO: loaded from: classes2.dex */
public class C14924ho implements InterfaceC14925hq<C14924ho, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f63494a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63495a;

    /* JADX INFO: renamed from: a */
    public String f63496a;

    /* JADX INFO: renamed from: a */
    private BitSet f63497a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f63498b;

    /* JADX INFO: renamed from: c */
    public String f63499c;

    /* JADX INFO: renamed from: d */
    public String f63500d;

    /* JADX INFO: renamed from: e */
    public String f63501e;

    /* JADX INFO: renamed from: f */
    public String f63502f;

    /* JADX INFO: renamed from: g */
    public String f63503g;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63485a = new z3r0("XmPushActionUnSubscriptionResult");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63484a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63486b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63487c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63488d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63489e = new m3r0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63490f = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63491g = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63492h = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63493i = new m3r0("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14924ho c14924ho) {
        int iM148146e;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148144c;
        int iM148146e5;
        int iM148146e6;
        int iM148145d;
        int iM148146e7;
        if (!getClass().equals(c14924ho.getClass())) {
            return getClass().getName().compareTo(c14924ho.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87363a()).compareTo(Boolean.valueOf(c14924ho.m87363a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87363a() && (iM148146e7 = k3r0.m148146e(this.f63496a, c14924ho.f63496a)) != 0) {
            return iM148146e7;
        }
        int iCompareTo2 = Boolean.valueOf(m87366b()).compareTo(Boolean.valueOf(c14924ho.m87366b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87366b() && (iM148145d = k3r0.m148145d(this.f63495a, c14924ho.f63495a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m87368c()).compareTo(Boolean.valueOf(c14924ho.m87368c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87368c() && (iM148146e6 = k3r0.m148146e(this.f63498b, c14924ho.f63498b)) != 0) {
            return iM148146e6;
        }
        int iCompareTo4 = Boolean.valueOf(m87369d()).compareTo(Boolean.valueOf(c14924ho.m87369d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87369d() && (iM148146e5 = k3r0.m148146e(this.f63499c, c14924ho.f63499c)) != 0) {
            return iM148146e5;
        }
        int iCompareTo5 = Boolean.valueOf(m87370e()).compareTo(Boolean.valueOf(c14924ho.m87370e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87370e() && (iM148144c = k3r0.m148144c(this.f63494a, c14924ho.f63494a)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m87371f()).compareTo(Boolean.valueOf(c14924ho.m87371f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87371f() && (iM148146e4 = k3r0.m148146e(this.f63500d, c14924ho.f63500d)) != 0) {
            return iM148146e4;
        }
        int iCompareTo7 = Boolean.valueOf(m87372g()).compareTo(Boolean.valueOf(c14924ho.m87372g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87372g() && (iM148146e3 = k3r0.m148146e(this.f63501e, c14924ho.f63501e)) != 0) {
            return iM148146e3;
        }
        int iCompareTo8 = Boolean.valueOf(m87373h()).compareTo(Boolean.valueOf(c14924ho.m87373h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87373h() && (iM148146e2 = k3r0.m148146e(this.f63502f, c14924ho.f63502f)) != 0) {
            return iM148146e2;
        }
        int iCompareTo9 = Boolean.valueOf(m87374i()).compareTo(Boolean.valueOf(c14924ho.m87374i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m87374i() || (iM148146e = k3r0.m148146e(this.f63503g, c14924ho.f63503g)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87361a();
        w3r0Var.mo87408v(f63485a);
        if (this.f63496a != null && m87363a()) {
            w3r0Var.mo87405s(f63484a);
            w3r0Var.mo87403q(this.f63496a);
            w3r0Var.mo87412z();
        }
        if (this.f63495a != null && m87366b()) {
            w3r0Var.mo87405s(f63486b);
            this.f63495a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63498b != null) {
            w3r0Var.mo87405s(f63487c);
            w3r0Var.mo87403q(this.f63498b);
            w3r0Var.mo87412z();
        }
        if (this.f63499c != null && m87369d()) {
            w3r0Var.mo87405s(f63488d);
            w3r0Var.mo87403q(this.f63499c);
            w3r0Var.mo87412z();
        }
        if (m87370e()) {
            w3r0Var.mo87405s(f63489e);
            w3r0Var.mo87402p(this.f63494a);
            w3r0Var.mo87412z();
        }
        if (this.f63500d != null && m87371f()) {
            w3r0Var.mo87405s(f63490f);
            w3r0Var.mo87403q(this.f63500d);
            w3r0Var.mo87412z();
        }
        if (this.f63501e != null && m87372g()) {
            w3r0Var.mo87405s(f63491g);
            w3r0Var.mo87403q(this.f63501e);
            w3r0Var.mo87412z();
        }
        if (this.f63502f != null && m87373h()) {
            w3r0Var.mo87405s(f63492h);
            w3r0Var.mo87403q(this.f63502f);
            w3r0Var.mo87412z();
        }
        if (this.f63503g != null && m87374i()) {
            w3r0Var.mo87405s(f63493i);
            w3r0Var.mo87403q(this.f63503g);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87368c() {
        return this.f63498b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87369d() {
        return this.f63499c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87370e() {
        return this.f63497a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14924ho)) {
            return m87364a((C14924ho) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87371f() {
        return this.f63500d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87372g() {
        return this.f63501e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87373h() {
        return this.f63502f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87374i() {
        return this.f63503g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m87363a()) {
            sb.append("debug:");
            String str = this.f63496a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87366b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63495a;
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
        String str2 = this.f63498b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m87369d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f63499c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m87370e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f63494a);
        }
        if (m87371f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f63500d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87372g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f63501e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87373h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f63502f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87374i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63503g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m87367c() {
        return this.f63503g;
    }

    /* JADX INFO: renamed from: b */
    public String m87365b() {
        return this.f63501e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87366b() {
        return this.f63495a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m87360a() {
        return this.f63498b;
    }

    /* JADX INFO: renamed from: a */
    public void m87362a(boolean z) {
        this.f63497a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87364a(C14924ho c14924ho) {
        if (c14924ho == null) {
            return false;
        }
        boolean zM87363a = m87363a();
        boolean zM87363a2 = c14924ho.m87363a();
        if ((zM87363a || zM87363a2) && !(zM87363a && zM87363a2 && this.f63496a.equals(c14924ho.f63496a))) {
            return false;
        }
        boolean zM87366b = m87366b();
        boolean zM87366b2 = c14924ho.m87366b();
        if ((zM87366b || zM87366b2) && !(zM87366b && zM87366b2 && this.f63495a.m86941a(c14924ho.f63495a))) {
            return false;
        }
        boolean zM87368c = m87368c();
        boolean zM87368c2 = c14924ho.m87368c();
        if ((zM87368c || zM87368c2) && !(zM87368c && zM87368c2 && this.f63498b.equals(c14924ho.f63498b))) {
            return false;
        }
        boolean zM87369d = m87369d();
        boolean zM87369d2 = c14924ho.m87369d();
        if ((zM87369d || zM87369d2) && !(zM87369d && zM87369d2 && this.f63499c.equals(c14924ho.f63499c))) {
            return false;
        }
        boolean zM87370e = m87370e();
        boolean zM87370e2 = c14924ho.m87370e();
        if ((zM87370e || zM87370e2) && !(zM87370e && zM87370e2 && this.f63494a == c14924ho.f63494a)) {
            return false;
        }
        boolean zM87371f = m87371f();
        boolean zM87371f2 = c14924ho.m87371f();
        if ((zM87371f || zM87371f2) && !(zM87371f && zM87371f2 && this.f63500d.equals(c14924ho.f63500d))) {
            return false;
        }
        boolean zM87372g = m87372g();
        boolean zM87372g2 = c14924ho.m87372g();
        if ((zM87372g || zM87372g2) && !(zM87372g && zM87372g2 && this.f63501e.equals(c14924ho.f63501e))) {
            return false;
        }
        boolean zM87373h = m87373h();
        boolean zM87373h2 = c14924ho.m87373h();
        if ((zM87373h || zM87373h2) && !(zM87373h && zM87373h2 && this.f63502f.equals(c14924ho.f63502f))) {
            return false;
        }
        boolean zM87374i = m87374i();
        boolean zM87374i2 = c14924ho.m87374i();
        if (zM87374i || zM87374i2) {
            return zM87374i && zM87374i2 && this.f63503g.equals(c14924ho.f63503g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87363a() {
        return this.f63496a != null;
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
                m87361a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63496a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63495a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63498b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63499c = w3r0Var.mo87391e();
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
                        this.f63494a = w3r0Var.mo87390d();
                        m87362a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63500d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63501e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63502f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63503g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87361a() throws C14929ib {
        if (this.f63498b != null) {
            return;
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
