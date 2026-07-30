package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gq */
/* JADX INFO: loaded from: classes2.dex */
public class C14751gq implements InterfaceC14777hq<C14751gq, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62119a;

    /* JADX INFO: renamed from: a */
    public long f62120a;

    /* JADX INFO: renamed from: a */
    public String f62121a;

    /* JADX INFO: renamed from: a */
    private BitSet f62122a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f62123a;

    /* JADX INFO: renamed from: b */
    public int f62124b;

    /* JADX INFO: renamed from: b */
    public boolean f62125b;

    /* JADX INFO: renamed from: c */
    public int f62126c;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62112a = new tuq0("OnlineConfigItem");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62111a = new guq0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62113b = new guq0("", (byte) 8, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62114c = new guq0("", (byte) 2, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62115d = new guq0("", (byte) 8, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62116e = new guq0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62117f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62118g = new guq0("", (byte) 2, 7);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14751gq c14751gq) {
        int iM118200k;
        int iM118194e;
        int iM118192c;
        int iM118191b;
        int iM118200k2;
        int iM118191b2;
        int iM118191b3;
        if (!getClass().equals(c14751gq.getClass())) {
            return getClass().getName().compareTo(c14751gq.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85676a()).compareTo(Boolean.valueOf(c14751gq.m85676a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85676a() && (iM118191b3 = euq0.m118191b(this.f62119a, c14751gq.f62119a)) != 0) {
            return iM118191b3;
        }
        int iCompareTo2 = Boolean.valueOf(m85680b()).compareTo(Boolean.valueOf(c14751gq.m85680b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85680b() && (iM118191b2 = euq0.m118191b(this.f62124b, c14751gq.f62124b)) != 0) {
            return iM118191b2;
        }
        int iCompareTo3 = Boolean.valueOf(m85683c()).compareTo(Boolean.valueOf(c14751gq.m85683c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85683c() && (iM118200k2 = euq0.m118200k(this.f62123a, c14751gq.f62123a)) != 0) {
            return iM118200k2;
        }
        int iCompareTo4 = Boolean.valueOf(m85685d()).compareTo(Boolean.valueOf(c14751gq.m85685d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85685d() && (iM118191b = euq0.m118191b(this.f62126c, c14751gq.f62126c)) != 0) {
            return iM118191b;
        }
        int iCompareTo5 = Boolean.valueOf(m85687e()).compareTo(Boolean.valueOf(c14751gq.m85687e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85687e() && (iM118192c = euq0.m118192c(this.f62120a, c14751gq.f62120a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m85689f()).compareTo(Boolean.valueOf(c14751gq.m85689f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85689f() && (iM118194e = euq0.m118194e(this.f62121a, c14751gq.f62121a)) != 0) {
            return iM118194e;
        }
        int iCompareTo7 = Boolean.valueOf(m85691h()).compareTo(Boolean.valueOf(c14751gq.m85691h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m85691h() || (iM118200k = euq0.m118200k(this.f62125b, c14751gq.f62125b)) == 0) {
            return 0;
        }
        return iM118200k;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) {
        m85674a();
        quq0Var.mo86237v(f62112a);
        if (m85676a()) {
            quq0Var.mo86234s(f62111a);
            quq0Var.mo86230o(this.f62119a);
            quq0Var.mo86241z();
        }
        if (m85680b()) {
            quq0Var.mo86234s(f62113b);
            quq0Var.mo86230o(this.f62124b);
            quq0Var.mo86241z();
        }
        if (m85683c()) {
            quq0Var.mo86234s(f62114c);
            quq0Var.mo86239x(this.f62123a);
            quq0Var.mo86241z();
        }
        if (m85685d()) {
            quq0Var.mo86234s(f62115d);
            quq0Var.mo86230o(this.f62126c);
            quq0Var.mo86241z();
        }
        if (m85687e()) {
            quq0Var.mo86234s(f62116e);
            quq0Var.mo86231p(this.f62120a);
            quq0Var.mo86241z();
        }
        if (this.f62121a != null && m85689f()) {
            quq0Var.mo86234s(f62117f);
            quq0Var.mo86232q(this.f62121a);
            quq0Var.mo86241z();
        }
        if (m85691h()) {
            quq0Var.mo86234s(f62118g);
            quq0Var.mo86239x(this.f62125b);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85683c() {
        return this.f62122a.get(2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m85685d() {
        return this.f62122a.get(3);
    }

    /* JADX INFO: renamed from: e */
    public boolean m85687e() {
        return this.f62122a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14751gq)) {
            return m85677a((C14751gq) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85689f() {
        return this.f62121a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85690g() {
        return this.f62125b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85691h() {
        return this.f62122a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m85676a()) {
            sb.append("key:");
            sb.append(this.f62119a);
            z = false;
        } else {
            z = true;
        }
        if (m85680b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f62124b);
            z = false;
        }
        if (m85683c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f62123a);
            z = false;
        }
        if (m85685d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f62126c);
            z = false;
        }
        if (m85687e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f62120a);
            z = false;
        }
        if (m85689f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f62121a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (m85691h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f62125b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m85682c(boolean z) {
        this.f62122a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m85684d(boolean z) {
        this.f62122a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m85686e(boolean z) {
        this.f62122a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m85688f(boolean z) {
        this.f62122a.set(5, z);
    }

    /* JADX INFO: renamed from: c */
    public int m85681c() {
        return this.f62126c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85680b() {
        return this.f62122a.get(1);
    }

    /* JADX INFO: renamed from: b */
    public void m85679b(boolean z) {
        this.f62122a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public int m85678b() {
        return this.f62124b;
    }

    /* JADX INFO: renamed from: a */
    public int m85670a() {
        return this.f62119a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85676a() {
        return this.f62122a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85675a(boolean z) {
        this.f62122a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public long m85672a() {
        return this.f62120a;
    }

    /* JADX INFO: renamed from: a */
    public String m85673a() {
        return this.f62121a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85677a(C14751gq c14751gq) {
        if (c14751gq == null) {
            return false;
        }
        boolean zM85676a = m85676a();
        boolean zM85676a2 = c14751gq.m85676a();
        if ((zM85676a || zM85676a2) && !(zM85676a && zM85676a2 && this.f62119a == c14751gq.f62119a)) {
            return false;
        }
        boolean zM85680b = m85680b();
        boolean zM85680b2 = c14751gq.m85680b();
        if ((zM85680b || zM85680b2) && !(zM85680b && zM85680b2 && this.f62124b == c14751gq.f62124b)) {
            return false;
        }
        boolean zM85683c = m85683c();
        boolean zM85683c2 = c14751gq.m85683c();
        if ((zM85683c || zM85683c2) && !(zM85683c && zM85683c2 && this.f62123a == c14751gq.f62123a)) {
            return false;
        }
        boolean zM85685d = m85685d();
        boolean zM85685d2 = c14751gq.m85685d();
        if ((zM85685d || zM85685d2) && !(zM85685d && zM85685d2 && this.f62126c == c14751gq.f62126c)) {
            return false;
        }
        boolean zM85687e = m85687e();
        boolean zM85687e2 = c14751gq.m85687e();
        if ((zM85687e || zM85687e2) && !(zM85687e && zM85687e2 && this.f62120a == c14751gq.f62120a)) {
            return false;
        }
        boolean zM85689f = m85689f();
        boolean zM85689f2 = c14751gq.m85689f();
        if ((zM85689f || zM85689f2) && !(zM85689f && zM85689f2 && this.f62121a.equals(c14751gq.f62121a))) {
            return false;
        }
        boolean zM85691h = m85691h();
        boolean zM85691h2 = c14751gq.m85691h();
        if (zM85691h || zM85691h2) {
            return zM85691h && zM85691h2 && this.f62125b == c14751gq.f62125b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m85674a() {
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                quq0Var.mo86208D();
                m85674a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 8) {
                        this.f62119a = quq0Var.mo86218c();
                        m85675a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 8) {
                        this.f62124b = quq0Var.mo86218c();
                        m85679b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 2) {
                        this.f62123a = quq0Var.mo86240y();
                        m85682c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 8) {
                        this.f62126c = quq0Var.mo86218c();
                        m85684d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f62120a = quq0Var.mo86219d();
                        m85686e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62121a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 2) {
                        this.f62125b = quq0Var.mo86240y();
                        m85688f(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
            }
            quq0Var.mo86209E();
        }
    }
}
