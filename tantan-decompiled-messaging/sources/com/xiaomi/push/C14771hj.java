package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.euq0;
import p149l.guq0;
import p149l.huq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hj */
/* JADX INFO: loaded from: classes2.dex */
public class C14771hj implements InterfaceC14777hq<C14771hj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14755gu f62546a;

    /* JADX INFO: renamed from: a */
    public String f62547a;

    /* JADX INFO: renamed from: a */
    public List<String> f62548a;

    /* JADX INFO: renamed from: b */
    public String f62549b;

    /* JADX INFO: renamed from: c */
    public String f62550c;

    /* JADX INFO: renamed from: d */
    public String f62551d;

    /* JADX INFO: renamed from: e */
    public String f62552e;

    /* JADX INFO: renamed from: f */
    public String f62553f;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62538a = new tuq0("XmPushActionSubscription");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62537a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62539b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62540c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62541d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62542e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62543f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62544g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62545h = new guq0("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14771hj c14771hj) {
        int iM118196g;
        int iM118194e;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118194e5;
        int iM118193d;
        int iM118194e6;
        if (!getClass().equals(c14771hj.getClass())) {
            return getClass().getName().compareTo(c14771hj.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86105a()).compareTo(Boolean.valueOf(c14771hj.m86105a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86105a() && (iM118194e6 = euq0.m118194e(this.f62547a, c14771hj.f62547a)) != 0) {
            return iM118194e6;
        }
        int iCompareTo2 = Boolean.valueOf(m86108b()).compareTo(Boolean.valueOf(c14771hj.m86108b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86108b() && (iM118193d = euq0.m118193d(this.f62546a, c14771hj.f62546a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86110c()).compareTo(Boolean.valueOf(c14771hj.m86110c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86110c() && (iM118194e5 = euq0.m118194e(this.f62549b, c14771hj.f62549b)) != 0) {
            return iM118194e5;
        }
        int iCompareTo4 = Boolean.valueOf(m86112d()).compareTo(Boolean.valueOf(c14771hj.m86112d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86112d() && (iM118194e4 = euq0.m118194e(this.f62550c, c14771hj.f62550c)) != 0) {
            return iM118194e4;
        }
        int iCompareTo5 = Boolean.valueOf(m86114e()).compareTo(Boolean.valueOf(c14771hj.m86114e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86114e() && (iM118194e3 = euq0.m118194e(this.f62551d, c14771hj.f62551d)) != 0) {
            return iM118194e3;
        }
        int iCompareTo6 = Boolean.valueOf(m86115f()).compareTo(Boolean.valueOf(c14771hj.m86115f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86115f() && (iM118194e2 = euq0.m118194e(this.f62552e, c14771hj.f62552e)) != 0) {
            return iM118194e2;
        }
        int iCompareTo7 = Boolean.valueOf(m86116g()).compareTo(Boolean.valueOf(c14771hj.m86116g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86116g() && (iM118194e = euq0.m118194e(this.f62553f, c14771hj.f62553f)) != 0) {
            return iM118194e;
        }
        int iCompareTo8 = Boolean.valueOf(m86117h()).compareTo(Boolean.valueOf(c14771hj.m86117h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m86117h() || (iM118196g = euq0.m118196g(this.f62548a, c14771hj.f62548a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86104a();
        quq0Var.mo86237v(f62538a);
        if (this.f62547a != null && m86105a()) {
            quq0Var.mo86234s(f62537a);
            quq0Var.mo86232q(this.f62547a);
            quq0Var.mo86241z();
        }
        if (this.f62546a != null && m86108b()) {
            quq0Var.mo86234s(f62539b);
            this.f62546a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62549b != null) {
            quq0Var.mo86234s(f62540c);
            quq0Var.mo86232q(this.f62549b);
            quq0Var.mo86241z();
        }
        if (this.f62550c != null) {
            quq0Var.mo86234s(f62541d);
            quq0Var.mo86232q(this.f62550c);
            quq0Var.mo86241z();
        }
        if (this.f62551d != null) {
            quq0Var.mo86234s(f62542e);
            quq0Var.mo86232q(this.f62551d);
            quq0Var.mo86241z();
        }
        if (this.f62552e != null && m86115f()) {
            quq0Var.mo86234s(f62543f);
            quq0Var.mo86232q(this.f62552e);
            quq0Var.mo86241z();
        }
        if (this.f62553f != null && m86116g()) {
            quq0Var.mo86234s(f62544g);
            quq0Var.mo86232q(this.f62553f);
            quq0Var.mo86241z();
        }
        if (this.f62548a != null && m86117h()) {
            quq0Var.mo86234s(f62545h);
            quq0Var.mo86235t(new huq0((byte) 11, this.f62548a.size()));
            Iterator<String> it = this.f62548a.iterator();
            while (it.hasNext()) {
                quq0Var.mo86232q(it.next());
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86110c() {
        return this.f62549b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86112d() {
        return this.f62550c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86114e() {
        return this.f62551d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14771hj)) {
            return m86106a((C14771hj) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86115f() {
        return this.f62552e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86116g() {
        return this.f62553f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86117h() {
        return this.f62548a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m86105a()) {
            sb.append("debug:");
            String str = this.f62547a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86108b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62546a;
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
        String str2 = this.f62549b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62550c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f62551d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m86115f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62552e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86116g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f62553f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86117h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f62548a;
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
    public C14771hj m86109c(String str) {
        this.f62551d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14771hj m86111d(String str) {
        this.f62552e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14771hj m86113e(String str) {
        this.f62553f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14771hj m86107b(String str) {
        this.f62550c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86108b() {
        return this.f62546a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14771hj m86103a(String str) {
        this.f62549b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86106a(C14771hj c14771hj) {
        if (c14771hj == null) {
            return false;
        }
        boolean zM86105a = m86105a();
        boolean zM86105a2 = c14771hj.m86105a();
        if ((zM86105a || zM86105a2) && !(zM86105a && zM86105a2 && this.f62547a.equals(c14771hj.f62547a))) {
            return false;
        }
        boolean zM86108b = m86108b();
        boolean zM86108b2 = c14771hj.m86108b();
        if ((zM86108b || zM86108b2) && !(zM86108b && zM86108b2 && this.f62546a.m85770a(c14771hj.f62546a))) {
            return false;
        }
        boolean zM86110c = m86110c();
        boolean zM86110c2 = c14771hj.m86110c();
        if ((zM86110c || zM86110c2) && !(zM86110c && zM86110c2 && this.f62549b.equals(c14771hj.f62549b))) {
            return false;
        }
        boolean zM86112d = m86112d();
        boolean zM86112d2 = c14771hj.m86112d();
        if ((zM86112d || zM86112d2) && !(zM86112d && zM86112d2 && this.f62550c.equals(c14771hj.f62550c))) {
            return false;
        }
        boolean zM86114e = m86114e();
        boolean zM86114e2 = c14771hj.m86114e();
        if ((zM86114e || zM86114e2) && !(zM86114e && zM86114e2 && this.f62551d.equals(c14771hj.f62551d))) {
            return false;
        }
        boolean zM86115f = m86115f();
        boolean zM86115f2 = c14771hj.m86115f();
        if ((zM86115f || zM86115f2) && !(zM86115f && zM86115f2 && this.f62552e.equals(c14771hj.f62552e))) {
            return false;
        }
        boolean zM86116g = m86116g();
        boolean zM86116g2 = c14771hj.m86116g();
        if ((zM86116g || zM86116g2) && !(zM86116g && zM86116g2 && this.f62553f.equals(c14771hj.f62553f))) {
            return false;
        }
        boolean zM86117h = m86117h();
        boolean zM86117h2 = c14771hj.m86117h();
        if (zM86117h || zM86117h2) {
            return zM86117h && zM86117h2 && this.f62548a.equals(c14771hj.f62548a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86105a() {
        return this.f62547a != null;
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
                m86104a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62547a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62546a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62549b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62550c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62551d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62552e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62553f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f62548a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            this.f62548a.add(quq0Var.mo86220e());
                        }
                        quq0Var.mo86211G();
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
    public void m86104a() throws C14781ib {
        if (this.f62549b != null) {
            if (this.f62550c != null) {
                if (this.f62551d != null) {
                    return;
                }
                throw new C14781ib("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
