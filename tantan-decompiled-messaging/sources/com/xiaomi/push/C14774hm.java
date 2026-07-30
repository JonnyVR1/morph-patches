package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hm */
/* JADX INFO: loaded from: classes2.dex */
public class C14774hm implements InterfaceC14777hq<C14774hm, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62610a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62611a;

    /* JADX INFO: renamed from: a */
    public String f62612a;

    /* JADX INFO: renamed from: a */
    private BitSet f62613a = new BitSet(3);

    /* JADX INFO: renamed from: b */
    public long f62614b;

    /* JADX INFO: renamed from: b */
    public String f62615b;

    /* JADX INFO: renamed from: c */
    public long f62616c;

    /* JADX INFO: renamed from: c */
    public String f62617c;

    /* JADX INFO: renamed from: d */
    public String f62618d;

    /* JADX INFO: renamed from: e */
    public String f62619e;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62601a = new tuq0("XmPushActionUnRegistrationResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62600a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62602b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62603c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62604d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62605e = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62606f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62607g = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62608h = new guq0("", (byte) 10, 9);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62609i = new guq0("", (byte) 10, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14774hm c14774hm) {
        int iM118192c;
        int iM118192c2;
        int iM118194e;
        int iM118194e2;
        int iM118192c3;
        int iM118194e3;
        int iM118194e4;
        int iM118193d;
        int iM118194e5;
        if (!getClass().equals(c14774hm.getClass())) {
            return getClass().getName().compareTo(c14774hm.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86160a()).compareTo(Boolean.valueOf(c14774hm.m86160a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86160a() && (iM118194e5 = euq0.m118194e(this.f62612a, c14774hm.f62612a)) != 0) {
            return iM118194e5;
        }
        int iCompareTo2 = Boolean.valueOf(m86163b()).compareTo(Boolean.valueOf(c14774hm.m86163b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86163b() && (iM118193d = euq0.m118193d(this.f62611a, c14774hm.f62611a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86165c()).compareTo(Boolean.valueOf(c14774hm.m86165c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86165c() && (iM118194e4 = euq0.m118194e(this.f62615b, c14774hm.f62615b)) != 0) {
            return iM118194e4;
        }
        int iCompareTo4 = Boolean.valueOf(m86166d()).compareTo(Boolean.valueOf(c14774hm.m86166d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86166d() && (iM118194e3 = euq0.m118194e(this.f62617c, c14774hm.f62617c)) != 0) {
            return iM118194e3;
        }
        int iCompareTo5 = Boolean.valueOf(m86167e()).compareTo(Boolean.valueOf(c14774hm.m86167e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86167e() && (iM118192c3 = euq0.m118192c(this.f62610a, c14774hm.f62610a)) != 0) {
            return iM118192c3;
        }
        int iCompareTo6 = Boolean.valueOf(m86168f()).compareTo(Boolean.valueOf(c14774hm.m86168f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86168f() && (iM118194e2 = euq0.m118194e(this.f62618d, c14774hm.f62618d)) != 0) {
            return iM118194e2;
        }
        int iCompareTo7 = Boolean.valueOf(m86169g()).compareTo(Boolean.valueOf(c14774hm.m86169g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86169g() && (iM118194e = euq0.m118194e(this.f62619e, c14774hm.f62619e)) != 0) {
            return iM118194e;
        }
        int iCompareTo8 = Boolean.valueOf(m86170h()).compareTo(Boolean.valueOf(c14774hm.m86170h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86170h() && (iM118192c2 = euq0.m118192c(this.f62614b, c14774hm.f62614b)) != 0) {
            return iM118192c2;
        }
        int iCompareTo9 = Boolean.valueOf(m86171i()).compareTo(Boolean.valueOf(c14774hm.m86171i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m86171i() || (iM118192c = euq0.m118192c(this.f62616c, c14774hm.f62616c)) == 0) {
            return 0;
        }
        return iM118192c;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86158a();
        quq0Var.mo86237v(f62601a);
        if (this.f62612a != null && m86160a()) {
            quq0Var.mo86234s(f62600a);
            quq0Var.mo86232q(this.f62612a);
            quq0Var.mo86241z();
        }
        if (this.f62611a != null && m86163b()) {
            quq0Var.mo86234s(f62602b);
            this.f62611a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62615b != null) {
            quq0Var.mo86234s(f62603c);
            quq0Var.mo86232q(this.f62615b);
            quq0Var.mo86241z();
        }
        if (this.f62617c != null) {
            quq0Var.mo86234s(f62604d);
            quq0Var.mo86232q(this.f62617c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62605e);
        quq0Var.mo86231p(this.f62610a);
        quq0Var.mo86241z();
        if (this.f62618d != null && m86168f()) {
            quq0Var.mo86234s(f62606f);
            quq0Var.mo86232q(this.f62618d);
            quq0Var.mo86241z();
        }
        if (this.f62619e != null && m86169g()) {
            quq0Var.mo86234s(f62607g);
            quq0Var.mo86232q(this.f62619e);
            quq0Var.mo86241z();
        }
        if (m86170h()) {
            quq0Var.mo86234s(f62608h);
            quq0Var.mo86231p(this.f62614b);
            quq0Var.mo86241z();
        }
        if (m86171i()) {
            quq0Var.mo86234s(f62609i);
            quq0Var.mo86231p(this.f62616c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86165c() {
        return this.f62615b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86166d() {
        return this.f62617c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86167e() {
        return this.f62613a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14774hm)) {
            return m86161a((C14774hm) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86168f() {
        return this.f62618d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86169g() {
        return this.f62619e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86170h() {
        return this.f62613a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86171i() {
        return this.f62613a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m86160a()) {
            sb.append("debug:");
            String str = this.f62612a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86163b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62611a;
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
        String str2 = this.f62615b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62617c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f62610a);
        if (m86168f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62618d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86169g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62619e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86170h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f62614b);
        }
        if (m86171i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f62616c);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m86164c(boolean z) {
        this.f62613a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public void m86162b(boolean z) {
        this.f62613a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86163b() {
        return this.f62611a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m86159a(boolean z) {
        this.f62613a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public String m86157a() {
        return this.f62619e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86161a(C14774hm c14774hm) {
        if (c14774hm == null) {
            return false;
        }
        boolean zM86160a = m86160a();
        boolean zM86160a2 = c14774hm.m86160a();
        if ((zM86160a || zM86160a2) && !(zM86160a && zM86160a2 && this.f62612a.equals(c14774hm.f62612a))) {
            return false;
        }
        boolean zM86163b = m86163b();
        boolean zM86163b2 = c14774hm.m86163b();
        if ((zM86163b || zM86163b2) && !(zM86163b && zM86163b2 && this.f62611a.m85770a(c14774hm.f62611a))) {
            return false;
        }
        boolean zM86165c = m86165c();
        boolean zM86165c2 = c14774hm.m86165c();
        if ((zM86165c || zM86165c2) && !(zM86165c && zM86165c2 && this.f62615b.equals(c14774hm.f62615b))) {
            return false;
        }
        boolean zM86166d = m86166d();
        boolean zM86166d2 = c14774hm.m86166d();
        if (((zM86166d || zM86166d2) && !(zM86166d && zM86166d2 && this.f62617c.equals(c14774hm.f62617c))) || this.f62610a != c14774hm.f62610a) {
            return false;
        }
        boolean zM86168f = m86168f();
        boolean zM86168f2 = c14774hm.m86168f();
        if ((zM86168f || zM86168f2) && !(zM86168f && zM86168f2 && this.f62618d.equals(c14774hm.f62618d))) {
            return false;
        }
        boolean zM86169g = m86169g();
        boolean zM86169g2 = c14774hm.m86169g();
        if ((zM86169g || zM86169g2) && !(zM86169g && zM86169g2 && this.f62619e.equals(c14774hm.f62619e))) {
            return false;
        }
        boolean zM86170h = m86170h();
        boolean zM86170h2 = c14774hm.m86170h();
        if ((zM86170h || zM86170h2) && !(zM86170h && zM86170h2 && this.f62614b == c14774hm.f62614b)) {
            return false;
        }
        boolean zM86171i = m86171i();
        boolean zM86171i2 = c14774hm.m86171i();
        if (zM86171i || zM86171i2) {
            return zM86171i && zM86171i2 && this.f62616c == c14774hm.f62616c;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86160a() {
        return this.f62612a != null;
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
                if (m86167e()) {
                    m86158a();
                    return;
                }
                throw new C14781ib("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62612a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62611a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62615b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62617c = quq0Var.mo86220e();
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
                        this.f62610a = quq0Var.mo86219d();
                        m86159a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62618d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62619e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 10) {
                        this.f62614b = quq0Var.mo86219d();
                        m86162b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 10) {
                        this.f62616c = quq0Var.mo86219d();
                        m86164c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86158a() throws C14781ib {
        if (this.f62615b != null) {
            if (this.f62617c != null) {
                return;
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
