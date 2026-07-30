package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.orq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.ej */
/* JADX INFO: loaded from: classes2.dex */
public class C14734ej implements InterfaceC14777hq<C14734ej, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public byte f61738a;

    /* JADX INFO: renamed from: a */
    public int f61739a;

    /* JADX INFO: renamed from: a */
    public String f61740a;

    /* JADX INFO: renamed from: a */
    private BitSet f61741a = new BitSet(6);

    /* JADX INFO: renamed from: b */
    public int f61742b;

    /* JADX INFO: renamed from: b */
    public String f61743b;

    /* JADX INFO: renamed from: c */
    public int f61744c;

    /* JADX INFO: renamed from: c */
    public String f61745c;

    /* JADX INFO: renamed from: d */
    public int f61746d;

    /* JADX INFO: renamed from: d */
    public String f61747d;

    /* JADX INFO: renamed from: e */
    public int f61748e;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f61728a = new tuq0("StatsEvent");

    /* JADX INFO: renamed from: a */
    private static final guq0 f61727a = new guq0("", (byte) 3, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f61729b = new guq0("", (byte) 8, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f61730c = new guq0("", (byte) 8, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f61731d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f61732e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f61733f = new guq0("", (byte) 8, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f61734g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f61735h = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f61736i = new guq0("", (byte) 8, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f61737j = new guq0("", (byte) 8, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14734ej c14734ej) {
        int iM118191b;
        int iM118191b2;
        int iM118194e;
        int iM118194e2;
        int iM118191b3;
        int iM118194e3;
        int iM118194e4;
        int iM118191b4;
        int iM118191b5;
        int iM118190a;
        if (!getClass().equals(c14734ej.getClass())) {
            return getClass().getName().compareTo(c14734ej.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85536a()).compareTo(Boolean.valueOf(c14734ej.m85536a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85536a() && (iM118190a = euq0.m118190a(this.f61738a, c14734ej.f61738a)) != 0) {
            return iM118190a;
        }
        int iCompareTo2 = Boolean.valueOf(m85542b()).compareTo(Boolean.valueOf(c14734ej.m85542b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85542b() && (iM118191b5 = euq0.m118191b(this.f61739a, c14734ej.f61739a)) != 0) {
            return iM118191b5;
        }
        int iCompareTo3 = Boolean.valueOf(m85546c()).compareTo(Boolean.valueOf(c14734ej.m85546c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85546c() && (iM118191b4 = euq0.m118191b(this.f61742b, c14734ej.f61742b)) != 0) {
            return iM118191b4;
        }
        int iCompareTo4 = Boolean.valueOf(m85550d()).compareTo(Boolean.valueOf(c14734ej.m85550d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85550d() && (iM118194e4 = euq0.m118194e(this.f61740a, c14734ej.f61740a)) != 0) {
            return iM118194e4;
        }
        int iCompareTo5 = Boolean.valueOf(m85552e()).compareTo(Boolean.valueOf(c14734ej.m85552e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85552e() && (iM118194e3 = euq0.m118194e(this.f61743b, c14734ej.f61743b)) != 0) {
            return iM118194e3;
        }
        int iCompareTo6 = Boolean.valueOf(m85554f()).compareTo(Boolean.valueOf(c14734ej.m85554f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85554f() && (iM118191b3 = euq0.m118191b(this.f61744c, c14734ej.f61744c)) != 0) {
            return iM118191b3;
        }
        int iCompareTo7 = Boolean.valueOf(m85555g()).compareTo(Boolean.valueOf(c14734ej.m85555g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85555g() && (iM118194e2 = euq0.m118194e(this.f61745c, c14734ej.f61745c)) != 0) {
            return iM118194e2;
        }
        int iCompareTo8 = Boolean.valueOf(m85556h()).compareTo(Boolean.valueOf(c14734ej.m85556h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85556h() && (iM118194e = euq0.m118194e(this.f61747d, c14734ej.f61747d)) != 0) {
            return iM118194e;
        }
        int iCompareTo9 = Boolean.valueOf(m85557i()).compareTo(Boolean.valueOf(c14734ej.m85557i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85557i() && (iM118191b2 = euq0.m118191b(this.f61746d, c14734ej.f61746d)) != 0) {
            return iM118191b2;
        }
        int iCompareTo10 = Boolean.valueOf(m85558j()).compareTo(Boolean.valueOf(c14734ej.m85558j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m85558j() || (iM118191b = euq0.m118191b(this.f61748e, c14734ej.f61748e)) == 0) {
            return 0;
        }
        return iM118191b;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85533a();
        quq0Var.mo86237v(f61728a);
        quq0Var.mo86234s(f61727a);
        quq0Var.mo86229n(this.f61738a);
        quq0Var.mo86241z();
        quq0Var.mo86234s(f61729b);
        quq0Var.mo86230o(this.f61739a);
        quq0Var.mo86241z();
        quq0Var.mo86234s(f61730c);
        quq0Var.mo86230o(this.f61742b);
        quq0Var.mo86241z();
        if (this.f61740a != null) {
            quq0Var.mo86234s(f61731d);
            quq0Var.mo86232q(this.f61740a);
            quq0Var.mo86241z();
        }
        if (this.f61743b != null && m85552e()) {
            quq0Var.mo86234s(f61732e);
            quq0Var.mo86232q(this.f61743b);
            quq0Var.mo86241z();
        }
        if (m85554f()) {
            quq0Var.mo86234s(f61733f);
            quq0Var.mo86230o(this.f61744c);
            quq0Var.mo86241z();
        }
        if (this.f61745c != null && m85555g()) {
            quq0Var.mo86234s(f61734g);
            quq0Var.mo86232q(this.f61745c);
            quq0Var.mo86241z();
        }
        if (this.f61747d != null && m85556h()) {
            quq0Var.mo86234s(f61735h);
            quq0Var.mo86232q(this.f61747d);
            quq0Var.mo86241z();
        }
        if (m85557i()) {
            quq0Var.mo86234s(f61736i);
            quq0Var.mo86230o(this.f61746d);
            quq0Var.mo86241z();
        }
        if (m85558j()) {
            quq0Var.mo86234s(f61737j);
            quq0Var.mo86230o(this.f61748e);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85546c() {
        return this.f61741a.get(2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m85550d() {
        return this.f61740a != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85552e() {
        return this.f61743b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14734ej)) {
            return m85537a((C14734ej) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85554f() {
        return this.f61741a.get(3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85555g() {
        return this.f61745c != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85556h() {
        return this.f61747d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85557i() {
        return this.f61741a.get(4);
    }

    /* JADX INFO: renamed from: j */
    public boolean m85558j() {
        return this.f61741a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(chid:");
        sb.append((int) this.f61738a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f61739a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f61742b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f61740a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m85552e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f61743b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m85554f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f61744c);
        }
        if (m85555g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f61745c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m85556h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f61747d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85557i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f61746d);
        }
        if (m85558j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f61748e);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m85545c(boolean z) {
        this.f61741a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m85549d(boolean z) {
        this.f61741a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m85551e(boolean z) {
        this.f61741a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m85553f(boolean z) {
        this.f61741a.set(5, z);
    }

    /* JADX INFO: renamed from: c */
    public C14734ej m85543c(int i) {
        this.f61744c = i;
        m85549d(true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14734ej m85548d(String str) {
        this.f61747d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14734ej m85547d(int i) {
        this.f61746d = i;
        m85551e(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C14734ej m85544c(String str) {
        this.f61745c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85541b(boolean z) {
        this.f61741a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public C14734ej m85538b(int i) {
        this.f61742b = i;
        m85545c(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14734ej m85539b(String str) {
        this.f61743b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85542b() {
        return this.f61741a.get(1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85536a() {
        return this.f61741a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85535a(boolean z) {
        this.f61741a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14734ej m85531a(int i) {
        this.f61739a = i;
        m85541b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14734ej m85532a(String str) {
        this.f61740a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85537a(C14734ej c14734ej) {
        if (c14734ej == null || this.f61738a != c14734ej.f61738a || this.f61739a != c14734ej.f61739a || this.f61742b != c14734ej.f61742b) {
            return false;
        }
        boolean zM85550d = m85550d();
        boolean zM85550d2 = c14734ej.m85550d();
        if ((zM85550d || zM85550d2) && !(zM85550d && zM85550d2 && this.f61740a.equals(c14734ej.f61740a))) {
            return false;
        }
        boolean zM85552e = m85552e();
        boolean zM85552e2 = c14734ej.m85552e();
        if ((zM85552e || zM85552e2) && !(zM85552e && zM85552e2 && this.f61743b.equals(c14734ej.f61743b))) {
            return false;
        }
        boolean zM85554f = m85554f();
        boolean zM85554f2 = c14734ej.m85554f();
        if ((zM85554f || zM85554f2) && !(zM85554f && zM85554f2 && this.f61744c == c14734ej.f61744c)) {
            return false;
        }
        boolean zM85555g = m85555g();
        boolean zM85555g2 = c14734ej.m85555g();
        if ((zM85555g || zM85555g2) && !(zM85555g && zM85555g2 && this.f61745c.equals(c14734ej.f61745c))) {
            return false;
        }
        boolean zM85556h = m85556h();
        boolean zM85556h2 = c14734ej.m85556h();
        if ((zM85556h || zM85556h2) && !(zM85556h && zM85556h2 && this.f61747d.equals(c14734ej.f61747d))) {
            return false;
        }
        boolean zM85557i = m85557i();
        boolean zM85557i2 = c14734ej.m85557i();
        if ((zM85557i || zM85557i2) && !(zM85557i && zM85557i2 && this.f61746d == c14734ej.f61746d)) {
            return false;
        }
        boolean zM85558j = m85558j();
        boolean zM85558j2 = c14734ej.m85558j();
        if (zM85558j || zM85558j2) {
            return zM85558j && zM85558j2 && this.f61748e == c14734ej.f61748e;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14734ej m85530a(byte b) {
        this.f61738a = b;
        m85535a(true);
        return this;
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
                if (m85536a()) {
                    if (m85542b()) {
                        if (m85546c()) {
                            m85533a();
                            return;
                        } else {
                            orq0.m165677a("Required field 'value' was not found in serialized data! Struct: ", this);
                            return;
                        }
                    }
                    orq0.m165677a("Required field 'type' was not found in serialized data! Struct: ", this);
                    return;
                }
                orq0.m165677a("Required field 'chid' was not found in serialized data! Struct: ", this);
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 3) {
                        this.f61738a = quq0Var.mo86216a();
                        m85535a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 8) {
                        this.f61739a = quq0Var.mo86218c();
                        m85541b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 8) {
                        this.f61742b = quq0Var.mo86218c();
                        m85545c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f61740a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f61743b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 8) {
                        this.f61744c = quq0Var.mo86218c();
                        m85549d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f61745c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f61747d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 8) {
                        this.f61746d = quq0Var.mo86218c();
                        m85551e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 8) {
                        this.f61748e = quq0Var.mo86218c();
                        m85553f(true);
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

    /* JADX INFO: renamed from: a */
    public void m85533a() throws C14781ib {
        if (this.f61740a != null) {
            return;
        }
        orq0.m165677a("Required field 'connpt' was not present! Struct: ", this);
    }
}
