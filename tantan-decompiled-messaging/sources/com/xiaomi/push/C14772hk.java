package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hk */
/* JADX INFO: loaded from: classes2.dex */
public class C14772hk implements InterfaceC14777hq<C14772hk, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62564a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62565a;

    /* JADX INFO: renamed from: a */
    public String f62566a;

    /* JADX INFO: renamed from: a */
    private BitSet f62567a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f62568b;

    /* JADX INFO: renamed from: c */
    public String f62569c;

    /* JADX INFO: renamed from: d */
    public String f62570d;

    /* JADX INFO: renamed from: e */
    public String f62571e;

    /* JADX INFO: renamed from: f */
    public String f62572f;

    /* JADX INFO: renamed from: g */
    public String f62573g;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62555a = new tuq0("XmPushActionSubscriptionResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62554a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62556b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62557c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62558d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62559e = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62560f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62561g = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62562h = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62563i = new guq0("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14772hk c14772hk) {
        int iM118194e;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118192c;
        int iM118194e5;
        int iM118194e6;
        int iM118193d;
        int iM118194e7;
        if (!getClass().equals(c14772hk.getClass())) {
            return getClass().getName().compareTo(c14772hk.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86122a()).compareTo(Boolean.valueOf(c14772hk.m86122a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86122a() && (iM118194e7 = euq0.m118194e(this.f62566a, c14772hk.f62566a)) != 0) {
            return iM118194e7;
        }
        int iCompareTo2 = Boolean.valueOf(m86125b()).compareTo(Boolean.valueOf(c14772hk.m86125b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86125b() && (iM118193d = euq0.m118193d(this.f62565a, c14772hk.f62565a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86127c()).compareTo(Boolean.valueOf(c14772hk.m86127c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86127c() && (iM118194e6 = euq0.m118194e(this.f62568b, c14772hk.f62568b)) != 0) {
            return iM118194e6;
        }
        int iCompareTo4 = Boolean.valueOf(m86128d()).compareTo(Boolean.valueOf(c14772hk.m86128d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86128d() && (iM118194e5 = euq0.m118194e(this.f62569c, c14772hk.f62569c)) != 0) {
            return iM118194e5;
        }
        int iCompareTo5 = Boolean.valueOf(m86129e()).compareTo(Boolean.valueOf(c14772hk.m86129e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86129e() && (iM118192c = euq0.m118192c(this.f62564a, c14772hk.f62564a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m86130f()).compareTo(Boolean.valueOf(c14772hk.m86130f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86130f() && (iM118194e4 = euq0.m118194e(this.f62570d, c14772hk.f62570d)) != 0) {
            return iM118194e4;
        }
        int iCompareTo7 = Boolean.valueOf(m86131g()).compareTo(Boolean.valueOf(c14772hk.m86131g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86131g() && (iM118194e3 = euq0.m118194e(this.f62571e, c14772hk.f62571e)) != 0) {
            return iM118194e3;
        }
        int iCompareTo8 = Boolean.valueOf(m86132h()).compareTo(Boolean.valueOf(c14772hk.m86132h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86132h() && (iM118194e2 = euq0.m118194e(this.f62572f, c14772hk.f62572f)) != 0) {
            return iM118194e2;
        }
        int iCompareTo9 = Boolean.valueOf(m86133i()).compareTo(Boolean.valueOf(c14772hk.m86133i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m86133i() || (iM118194e = euq0.m118194e(this.f62573g, c14772hk.f62573g)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86120a();
        quq0Var.mo86237v(f62555a);
        if (this.f62566a != null && m86122a()) {
            quq0Var.mo86234s(f62554a);
            quq0Var.mo86232q(this.f62566a);
            quq0Var.mo86241z();
        }
        if (this.f62565a != null && m86125b()) {
            quq0Var.mo86234s(f62556b);
            this.f62565a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62568b != null) {
            quq0Var.mo86234s(f62557c);
            quq0Var.mo86232q(this.f62568b);
            quq0Var.mo86241z();
        }
        if (this.f62569c != null && m86128d()) {
            quq0Var.mo86234s(f62558d);
            quq0Var.mo86232q(this.f62569c);
            quq0Var.mo86241z();
        }
        if (m86129e()) {
            quq0Var.mo86234s(f62559e);
            quq0Var.mo86231p(this.f62564a);
            quq0Var.mo86241z();
        }
        if (this.f62570d != null && m86130f()) {
            quq0Var.mo86234s(f62560f);
            quq0Var.mo86232q(this.f62570d);
            quq0Var.mo86241z();
        }
        if (this.f62571e != null && m86131g()) {
            quq0Var.mo86234s(f62561g);
            quq0Var.mo86232q(this.f62571e);
            quq0Var.mo86241z();
        }
        if (this.f62572f != null && m86132h()) {
            quq0Var.mo86234s(f62562h);
            quq0Var.mo86232q(this.f62572f);
            quq0Var.mo86241z();
        }
        if (this.f62573g != null && m86133i()) {
            quq0Var.mo86234s(f62563i);
            quq0Var.mo86232q(this.f62573g);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86127c() {
        return this.f62568b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86128d() {
        return this.f62569c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86129e() {
        return this.f62567a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14772hk)) {
            return m86123a((C14772hk) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86130f() {
        return this.f62570d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86131g() {
        return this.f62571e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86132h() {
        return this.f62572f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86133i() {
        return this.f62573g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m86122a()) {
            sb.append("debug:");
            String str = this.f62566a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86125b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62565a;
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
        String str2 = this.f62568b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m86128d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f62569c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m86129e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f62564a);
        }
        if (m86130f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62570d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86131g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f62571e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86132h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62572f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86133i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62573g;
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
    public String m86126c() {
        return this.f62573g;
    }

    /* JADX INFO: renamed from: b */
    public String m86124b() {
        return this.f62571e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86125b() {
        return this.f62565a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m86119a() {
        return this.f62568b;
    }

    /* JADX INFO: renamed from: a */
    public void m86121a(boolean z) {
        this.f62567a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86123a(C14772hk c14772hk) {
        if (c14772hk == null) {
            return false;
        }
        boolean zM86122a = m86122a();
        boolean zM86122a2 = c14772hk.m86122a();
        if ((zM86122a || zM86122a2) && !(zM86122a && zM86122a2 && this.f62566a.equals(c14772hk.f62566a))) {
            return false;
        }
        boolean zM86125b = m86125b();
        boolean zM86125b2 = c14772hk.m86125b();
        if ((zM86125b || zM86125b2) && !(zM86125b && zM86125b2 && this.f62565a.m85770a(c14772hk.f62565a))) {
            return false;
        }
        boolean zM86127c = m86127c();
        boolean zM86127c2 = c14772hk.m86127c();
        if ((zM86127c || zM86127c2) && !(zM86127c && zM86127c2 && this.f62568b.equals(c14772hk.f62568b))) {
            return false;
        }
        boolean zM86128d = m86128d();
        boolean zM86128d2 = c14772hk.m86128d();
        if ((zM86128d || zM86128d2) && !(zM86128d && zM86128d2 && this.f62569c.equals(c14772hk.f62569c))) {
            return false;
        }
        boolean zM86129e = m86129e();
        boolean zM86129e2 = c14772hk.m86129e();
        if ((zM86129e || zM86129e2) && !(zM86129e && zM86129e2 && this.f62564a == c14772hk.f62564a)) {
            return false;
        }
        boolean zM86130f = m86130f();
        boolean zM86130f2 = c14772hk.m86130f();
        if ((zM86130f || zM86130f2) && !(zM86130f && zM86130f2 && this.f62570d.equals(c14772hk.f62570d))) {
            return false;
        }
        boolean zM86131g = m86131g();
        boolean zM86131g2 = c14772hk.m86131g();
        if ((zM86131g || zM86131g2) && !(zM86131g && zM86131g2 && this.f62571e.equals(c14772hk.f62571e))) {
            return false;
        }
        boolean zM86132h = m86132h();
        boolean zM86132h2 = c14772hk.m86132h();
        if ((zM86132h || zM86132h2) && !(zM86132h && zM86132h2 && this.f62572f.equals(c14772hk.f62572f))) {
            return false;
        }
        boolean zM86133i = m86133i();
        boolean zM86133i2 = c14772hk.m86133i();
        if (zM86133i || zM86133i2) {
            return zM86133i && zM86133i2 && this.f62573g.equals(c14772hk.f62573g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86122a() {
        return this.f62566a != null;
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
                m86120a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62566a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62565a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62568b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62569c = quq0Var.mo86220e();
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
                        this.f62564a = quq0Var.mo86219d();
                        m86121a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62570d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62571e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62572f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62573g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86120a() throws C14781ib {
        if (this.f62568b != null) {
            return;
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
