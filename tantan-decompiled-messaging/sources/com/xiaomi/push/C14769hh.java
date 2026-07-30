package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hh */
/* JADX INFO: loaded from: classes2.dex */
public class C14769hh implements InterfaceC14777hq<C14769hh, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62503a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62504a;

    /* JADX INFO: renamed from: a */
    public String f62505a;

    /* JADX INFO: renamed from: a */
    private BitSet f62506a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f62507b;

    /* JADX INFO: renamed from: c */
    public String f62508c;

    /* JADX INFO: renamed from: d */
    public String f62509d;

    /* JADX INFO: renamed from: e */
    public String f62510e;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62496a = new tuq0("XmPushActionSendFeedbackResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62495a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62497b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62498c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62499d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62500e = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62501f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62502g = new guq0("", (byte) 11, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14769hh c14769hh) {
        int iM118194e;
        int iM118194e2;
        int iM118192c;
        int iM118194e3;
        int iM118194e4;
        int iM118193d;
        int iM118194e5;
        if (!getClass().equals(c14769hh.getClass())) {
            return getClass().getName().compareTo(c14769hh.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86071a()).compareTo(Boolean.valueOf(c14769hh.m86071a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86071a() && (iM118194e5 = euq0.m118194e(this.f62505a, c14769hh.f62505a)) != 0) {
            return iM118194e5;
        }
        int iCompareTo2 = Boolean.valueOf(m86073b()).compareTo(Boolean.valueOf(c14769hh.m86073b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86073b() && (iM118193d = euq0.m118193d(this.f62504a, c14769hh.f62504a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86074c()).compareTo(Boolean.valueOf(c14769hh.m86074c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86074c() && (iM118194e4 = euq0.m118194e(this.f62507b, c14769hh.f62507b)) != 0) {
            return iM118194e4;
        }
        int iCompareTo4 = Boolean.valueOf(m86075d()).compareTo(Boolean.valueOf(c14769hh.m86075d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86075d() && (iM118194e3 = euq0.m118194e(this.f62508c, c14769hh.f62508c)) != 0) {
            return iM118194e3;
        }
        int iCompareTo5 = Boolean.valueOf(m86076e()).compareTo(Boolean.valueOf(c14769hh.m86076e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86076e() && (iM118192c = euq0.m118192c(this.f62503a, c14769hh.f62503a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m86077f()).compareTo(Boolean.valueOf(c14769hh.m86077f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86077f() && (iM118194e2 = euq0.m118194e(this.f62509d, c14769hh.f62509d)) != 0) {
            return iM118194e2;
        }
        int iCompareTo7 = Boolean.valueOf(m86078g()).compareTo(Boolean.valueOf(c14769hh.m86078g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (!m86078g() || (iM118194e = euq0.m118194e(this.f62510e, c14769hh.f62510e)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86069a();
        quq0Var.mo86237v(f62496a);
        if (this.f62505a != null && m86071a()) {
            quq0Var.mo86234s(f62495a);
            quq0Var.mo86232q(this.f62505a);
            quq0Var.mo86241z();
        }
        if (this.f62504a != null && m86073b()) {
            quq0Var.mo86234s(f62497b);
            this.f62504a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62507b != null) {
            quq0Var.mo86234s(f62498c);
            quq0Var.mo86232q(this.f62507b);
            quq0Var.mo86241z();
        }
        if (this.f62508c != null) {
            quq0Var.mo86234s(f62499d);
            quq0Var.mo86232q(this.f62508c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62500e);
        quq0Var.mo86231p(this.f62503a);
        quq0Var.mo86241z();
        if (this.f62509d != null && m86077f()) {
            quq0Var.mo86234s(f62501f);
            quq0Var.mo86232q(this.f62509d);
            quq0Var.mo86241z();
        }
        if (this.f62510e != null && m86078g()) {
            quq0Var.mo86234s(f62502g);
            quq0Var.mo86232q(this.f62510e);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86074c() {
        return this.f62507b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86075d() {
        return this.f62508c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86076e() {
        return this.f62506a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14769hh)) {
            return m86072a((C14769hh) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86077f() {
        return this.f62509d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86078g() {
        return this.f62510e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m86071a()) {
            sb.append("debug:");
            String str = this.f62505a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86073b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62504a;
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
        String str2 = this.f62507b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62508c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f62503a);
        if (m86077f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62509d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86078g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f62510e;
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
    public boolean m86073b() {
        return this.f62504a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m86070a(boolean z) {
        this.f62506a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86072a(C14769hh c14769hh) {
        if (c14769hh == null) {
            return false;
        }
        boolean zM86071a = m86071a();
        boolean zM86071a2 = c14769hh.m86071a();
        if ((zM86071a || zM86071a2) && !(zM86071a && zM86071a2 && this.f62505a.equals(c14769hh.f62505a))) {
            return false;
        }
        boolean zM86073b = m86073b();
        boolean zM86073b2 = c14769hh.m86073b();
        if ((zM86073b || zM86073b2) && !(zM86073b && zM86073b2 && this.f62504a.m85770a(c14769hh.f62504a))) {
            return false;
        }
        boolean zM86074c = m86074c();
        boolean zM86074c2 = c14769hh.m86074c();
        if ((zM86074c || zM86074c2) && !(zM86074c && zM86074c2 && this.f62507b.equals(c14769hh.f62507b))) {
            return false;
        }
        boolean zM86075d = m86075d();
        boolean zM86075d2 = c14769hh.m86075d();
        if (((zM86075d || zM86075d2) && !(zM86075d && zM86075d2 && this.f62508c.equals(c14769hh.f62508c))) || this.f62503a != c14769hh.f62503a) {
            return false;
        }
        boolean zM86077f = m86077f();
        boolean zM86077f2 = c14769hh.m86077f();
        if ((zM86077f || zM86077f2) && !(zM86077f && zM86077f2 && this.f62509d.equals(c14769hh.f62509d))) {
            return false;
        }
        boolean zM86078g = m86078g();
        boolean zM86078g2 = c14769hh.m86078g();
        if (zM86078g || zM86078g2) {
            return zM86078g && zM86078g2 && this.f62510e.equals(c14769hh.f62510e);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86071a() {
        return this.f62505a != null;
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
                if (m86076e()) {
                    m86069a();
                    return;
                }
                throw new C14781ib("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62505a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62504a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62507b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62508c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 6:
                    if (b == 10) {
                        this.f62503a = quq0Var.mo86219d();
                        m86070a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62509d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62510e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86069a() throws C14781ib {
        if (this.f62507b != null) {
            if (this.f62508c != null) {
                return;
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
