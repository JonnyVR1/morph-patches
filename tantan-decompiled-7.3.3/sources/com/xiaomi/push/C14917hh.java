package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hh */
/* JADX INFO: loaded from: classes2.dex */
public class C14917hh implements InterfaceC14925hq<C14917hh, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f63350a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63351a;

    /* JADX INFO: renamed from: a */
    public String f63352a;

    /* JADX INFO: renamed from: a */
    private BitSet f63353a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f63354b;

    /* JADX INFO: renamed from: c */
    public String f63355c;

    /* JADX INFO: renamed from: d */
    public String f63356d;

    /* JADX INFO: renamed from: e */
    public String f63357e;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63343a = new z3r0("XmPushActionSendFeedbackResult");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63342a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63344b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63345c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63346d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63347e = new m3r0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63348f = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63349g = new m3r0("", (byte) 11, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14917hh c14917hh) {
        int iM148146e;
        int iM148146e2;
        int iM148144c;
        int iM148146e3;
        int iM148146e4;
        int iM148145d;
        int iM148146e5;
        if (!getClass().equals(c14917hh.getClass())) {
            return getClass().getName().compareTo(c14917hh.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87242a()).compareTo(Boolean.valueOf(c14917hh.m87242a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87242a() && (iM148146e5 = k3r0.m148146e(this.f63352a, c14917hh.f63352a)) != 0) {
            return iM148146e5;
        }
        int iCompareTo2 = Boolean.valueOf(m87244b()).compareTo(Boolean.valueOf(c14917hh.m87244b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87244b() && (iM148145d = k3r0.m148145d(this.f63351a, c14917hh.f63351a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m87245c()).compareTo(Boolean.valueOf(c14917hh.m87245c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87245c() && (iM148146e4 = k3r0.m148146e(this.f63354b, c14917hh.f63354b)) != 0) {
            return iM148146e4;
        }
        int iCompareTo4 = Boolean.valueOf(m87246d()).compareTo(Boolean.valueOf(c14917hh.m87246d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87246d() && (iM148146e3 = k3r0.m148146e(this.f63355c, c14917hh.f63355c)) != 0) {
            return iM148146e3;
        }
        int iCompareTo5 = Boolean.valueOf(m87247e()).compareTo(Boolean.valueOf(c14917hh.m87247e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87247e() && (iM148144c = k3r0.m148144c(this.f63350a, c14917hh.f63350a)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m87248f()).compareTo(Boolean.valueOf(c14917hh.m87248f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87248f() && (iM148146e2 = k3r0.m148146e(this.f63356d, c14917hh.f63356d)) != 0) {
            return iM148146e2;
        }
        int iCompareTo7 = Boolean.valueOf(m87249g()).compareTo(Boolean.valueOf(c14917hh.m87249g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m87249g() || (iM148146e = k3r0.m148146e(this.f63357e, c14917hh.f63357e)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87240a();
        w3r0Var.mo87408v(f63343a);
        if (this.f63352a != null && m87242a()) {
            w3r0Var.mo87405s(f63342a);
            w3r0Var.mo87403q(this.f63352a);
            w3r0Var.mo87412z();
        }
        if (this.f63351a != null && m87244b()) {
            w3r0Var.mo87405s(f63344b);
            this.f63351a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63354b != null) {
            w3r0Var.mo87405s(f63345c);
            w3r0Var.mo87403q(this.f63354b);
            w3r0Var.mo87412z();
        }
        if (this.f63355c != null) {
            w3r0Var.mo87405s(f63346d);
            w3r0Var.mo87403q(this.f63355c);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63347e);
        w3r0Var.mo87402p(this.f63350a);
        w3r0Var.mo87412z();
        if (this.f63356d != null && m87248f()) {
            w3r0Var.mo87405s(f63348f);
            w3r0Var.mo87403q(this.f63356d);
            w3r0Var.mo87412z();
        }
        if (this.f63357e != null && m87249g()) {
            w3r0Var.mo87405s(f63349g);
            w3r0Var.mo87403q(this.f63357e);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87245c() {
        return this.f63354b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87246d() {
        return this.f63355c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87247e() {
        return this.f63353a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14917hh)) {
            return m87243a((C14917hh) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87248f() {
        return this.f63356d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87249g() {
        return this.f63357e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m87242a()) {
            sb.append("debug:");
            String str = this.f63352a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87244b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63351a;
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
        String str2 = this.f63354b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63355c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f63350a);
        if (m87248f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f63356d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87249g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f63357e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m87244b() {
        return this.f63351a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m87241a(boolean z) {
        this.f63353a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87243a(C14917hh c14917hh) {
        if (c14917hh == null) {
            return false;
        }
        boolean zM87242a = m87242a();
        boolean zM87242a2 = c14917hh.m87242a();
        if ((zM87242a || zM87242a2) && !(zM87242a && zM87242a2 && this.f63352a.equals(c14917hh.f63352a))) {
            return false;
        }
        boolean zM87244b = m87244b();
        boolean zM87244b2 = c14917hh.m87244b();
        if ((zM87244b || zM87244b2) && !(zM87244b && zM87244b2 && this.f63351a.m86941a(c14917hh.f63351a))) {
            return false;
        }
        boolean zM87245c = m87245c();
        boolean zM87245c2 = c14917hh.m87245c();
        if ((zM87245c || zM87245c2) && !(zM87245c && zM87245c2 && this.f63354b.equals(c14917hh.f63354b))) {
            return false;
        }
        boolean zM87246d = m87246d();
        boolean zM87246d2 = c14917hh.m87246d();
        if (((zM87246d || zM87246d2) && !(zM87246d && zM87246d2 && this.f63355c.equals(c14917hh.f63355c))) || this.f63350a != c14917hh.f63350a) {
            return false;
        }
        boolean zM87248f = m87248f();
        boolean zM87248f2 = c14917hh.m87248f();
        if ((zM87248f || zM87248f2) && !(zM87248f && zM87248f2 && this.f63356d.equals(c14917hh.f63356d))) {
            return false;
        }
        boolean zM87249g = m87249g();
        boolean zM87249g2 = c14917hh.m87249g();
        if (zM87249g || zM87249g2) {
            return zM87249g && zM87249g2 && this.f63357e.equals(c14917hh.f63357e);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87242a() {
        return this.f63352a != null;
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
                if (m87247e()) {
                    m87240a();
                    return;
                }
                throw new C14929ib("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63352a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63351a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63354b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63355c = w3r0Var.mo87391e();
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
                        this.f63350a = w3r0Var.mo87390d();
                        m87241a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63356d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63357e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87240a() throws C14929ib {
        if (this.f63354b != null) {
            if (this.f63355c != null) {
                return;
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
