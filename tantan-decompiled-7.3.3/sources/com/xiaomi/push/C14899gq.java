package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gq */
/* JADX INFO: loaded from: classes2.dex */
public class C14899gq implements InterfaceC14925hq<C14899gq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62966a;

    /* JADX INFO: renamed from: a */
    public long f62967a;

    /* JADX INFO: renamed from: a */
    public String f62968a;

    /* JADX INFO: renamed from: a */
    private BitSet f62969a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f62970a;

    /* JADX INFO: renamed from: b */
    public int f62971b;

    /* JADX INFO: renamed from: b */
    public boolean f62972b;

    /* JADX INFO: renamed from: c */
    public int f62973c;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62959a = new z3r0("OnlineConfigItem");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62958a = new m3r0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62960b = new m3r0("", (byte) 8, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62961c = new m3r0("", (byte) 2, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f62962d = new m3r0("", (byte) 8, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f62963e = new m3r0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f62964f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f62965g = new m3r0("", (byte) 2, 7);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14899gq c14899gq) {
        int iM148152k;
        int iM148146e;
        int iM148144c;
        int iM148143b;
        int iM148152k2;
        int iM148143b2;
        int iM148143b3;
        if (!getClass().equals(c14899gq.getClass())) {
            return getClass().getName().compareTo(c14899gq.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86847a()).compareTo(Boolean.valueOf(c14899gq.m86847a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86847a() && (iM148143b3 = k3r0.m148143b(this.f62966a, c14899gq.f62966a)) != 0) {
            return iM148143b3;
        }
        int iCompareTo2 = Boolean.valueOf(m86851b()).compareTo(Boolean.valueOf(c14899gq.m86851b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86851b() && (iM148143b2 = k3r0.m148143b(this.f62971b, c14899gq.f62971b)) != 0) {
            return iM148143b2;
        }
        int iCompareTo3 = Boolean.valueOf(m86854c()).compareTo(Boolean.valueOf(c14899gq.m86854c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86854c() && (iM148152k2 = k3r0.m148152k(this.f62970a, c14899gq.f62970a)) != 0) {
            return iM148152k2;
        }
        int iCompareTo4 = Boolean.valueOf(m86856d()).compareTo(Boolean.valueOf(c14899gq.m86856d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86856d() && (iM148143b = k3r0.m148143b(this.f62973c, c14899gq.f62973c)) != 0) {
            return iM148143b;
        }
        int iCompareTo5 = Boolean.valueOf(m86858e()).compareTo(Boolean.valueOf(c14899gq.m86858e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86858e() && (iM148144c = k3r0.m148144c(this.f62967a, c14899gq.f62967a)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m86860f()).compareTo(Boolean.valueOf(c14899gq.m86860f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86860f() && (iM148146e = k3r0.m148146e(this.f62968a, c14899gq.f62968a)) != 0) {
            return iM148146e;
        }
        int iCompareTo7 = Boolean.valueOf(m86862h()).compareTo(Boolean.valueOf(c14899gq.m86862h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m86862h() || (iM148152k = k3r0.m148152k(this.f62972b, c14899gq.f62972b)) == 0) {
            return 0;
        }
        return iM148152k;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) {
        m86845a();
        w3r0Var.mo87408v(f62959a);
        if (m86847a()) {
            w3r0Var.mo87405s(f62958a);
            w3r0Var.mo87401o(this.f62966a);
            w3r0Var.mo87412z();
        }
        if (m86851b()) {
            w3r0Var.mo87405s(f62960b);
            w3r0Var.mo87401o(this.f62971b);
            w3r0Var.mo87412z();
        }
        if (m86854c()) {
            w3r0Var.mo87405s(f62961c);
            w3r0Var.mo87410x(this.f62970a);
            w3r0Var.mo87412z();
        }
        if (m86856d()) {
            w3r0Var.mo87405s(f62962d);
            w3r0Var.mo87401o(this.f62973c);
            w3r0Var.mo87412z();
        }
        if (m86858e()) {
            w3r0Var.mo87405s(f62963e);
            w3r0Var.mo87402p(this.f62967a);
            w3r0Var.mo87412z();
        }
        if (this.f62968a != null && m86860f()) {
            w3r0Var.mo87405s(f62964f);
            w3r0Var.mo87403q(this.f62968a);
            w3r0Var.mo87412z();
        }
        if (m86862h()) {
            w3r0Var.mo87405s(f62965g);
            w3r0Var.mo87410x(this.f62972b);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86854c() {
        return this.f62969a.get(2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m86856d() {
        return this.f62969a.get(3);
    }

    /* JADX INFO: renamed from: e */
    public boolean m86858e() {
        return this.f62969a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14899gq)) {
            return m86848a((C14899gq) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86860f() {
        return this.f62968a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86861g() {
        return this.f62972b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86862h() {
        return this.f62969a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m86847a()) {
            sb.append("key:");
            sb.append(this.f62966a);
            z = false;
        } else {
            z = true;
        }
        if (m86851b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f62971b);
            z = false;
        }
        if (m86854c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f62970a);
            z = false;
        }
        if (m86856d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f62973c);
            z = false;
        }
        if (m86858e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f62967a);
            z = false;
        }
        if (m86860f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f62968a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (m86862h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f62972b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m86853c(boolean z) {
        this.f62969a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m86855d(boolean z) {
        this.f62969a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m86857e(boolean z) {
        this.f62969a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m86859f(boolean z) {
        this.f62969a.set(5, z);
    }

    /* JADX INFO: renamed from: c */
    public int m86852c() {
        return this.f62973c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86851b() {
        return this.f62969a.get(1);
    }

    /* JADX INFO: renamed from: b */
    public void m86850b(boolean z) {
        this.f62969a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public int m86849b() {
        return this.f62971b;
    }

    /* JADX INFO: renamed from: a */
    public int m86841a() {
        return this.f62966a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86847a() {
        return this.f62969a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m86846a(boolean z) {
        this.f62969a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public long m86843a() {
        return this.f62967a;
    }

    /* JADX INFO: renamed from: a */
    public String m86844a() {
        return this.f62968a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86848a(C14899gq c14899gq) {
        if (c14899gq == null) {
            return false;
        }
        boolean zM86847a = m86847a();
        boolean zM86847a2 = c14899gq.m86847a();
        if ((zM86847a || zM86847a2) && !(zM86847a && zM86847a2 && this.f62966a == c14899gq.f62966a)) {
            return false;
        }
        boolean zM86851b = m86851b();
        boolean zM86851b2 = c14899gq.m86851b();
        if ((zM86851b || zM86851b2) && !(zM86851b && zM86851b2 && this.f62971b == c14899gq.f62971b)) {
            return false;
        }
        boolean zM86854c = m86854c();
        boolean zM86854c2 = c14899gq.m86854c();
        if ((zM86854c || zM86854c2) && !(zM86854c && zM86854c2 && this.f62970a == c14899gq.f62970a)) {
            return false;
        }
        boolean zM86856d = m86856d();
        boolean zM86856d2 = c14899gq.m86856d();
        if ((zM86856d || zM86856d2) && !(zM86856d && zM86856d2 && this.f62973c == c14899gq.f62973c)) {
            return false;
        }
        boolean zM86858e = m86858e();
        boolean zM86858e2 = c14899gq.m86858e();
        if ((zM86858e || zM86858e2) && !(zM86858e && zM86858e2 && this.f62967a == c14899gq.f62967a)) {
            return false;
        }
        boolean zM86860f = m86860f();
        boolean zM86860f2 = c14899gq.m86860f();
        if ((zM86860f || zM86860f2) && !(zM86860f && zM86860f2 && this.f62968a.equals(c14899gq.f62968a))) {
            return false;
        }
        boolean zM86862h = m86862h();
        boolean zM86862h2 = c14899gq.m86862h();
        if (zM86862h || zM86862h2) {
            return zM86862h && zM86862h2 && this.f62972b == c14899gq.f62972b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m86845a() {
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                m86845a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 8) {
                        this.f62966a = w3r0Var.mo87389c();
                        m86846a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 8) {
                        this.f62971b = w3r0Var.mo87389c();
                        m86850b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 2) {
                        this.f62970a = w3r0Var.mo87411y();
                        m86853c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 8) {
                        this.f62973c = w3r0Var.mo87389c();
                        m86855d(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f62967a = w3r0Var.mo87390d();
                        m86857e(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62968a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 2) {
                        this.f62972b = w3r0Var.mo87411y();
                        m86859f(true);
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
}
