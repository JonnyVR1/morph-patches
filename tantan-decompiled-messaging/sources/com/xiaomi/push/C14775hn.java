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

/* JADX INFO: renamed from: com.xiaomi.push.hn */
/* JADX INFO: loaded from: classes2.dex */
public class C14775hn implements InterfaceC14777hq<C14775hn, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14755gu f62629a;

    /* JADX INFO: renamed from: a */
    public String f62630a;

    /* JADX INFO: renamed from: a */
    public List<String> f62631a;

    /* JADX INFO: renamed from: b */
    public String f62632b;

    /* JADX INFO: renamed from: c */
    public String f62633c;

    /* JADX INFO: renamed from: d */
    public String f62634d;

    /* JADX INFO: renamed from: e */
    public String f62635e;

    /* JADX INFO: renamed from: f */
    public String f62636f;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62621a = new tuq0("XmPushActionUnSubscription");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62620a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62622b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62623c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62624d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62625e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62626f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62627g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62628h = new guq0("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14775hn c14775hn) {
        int iM118196g;
        int iM118194e;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118194e5;
        int iM118193d;
        int iM118194e6;
        if (!getClass().equals(c14775hn.getClass())) {
            return getClass().getName().compareTo(c14775hn.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86175a()).compareTo(Boolean.valueOf(c14775hn.m86175a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86175a() && (iM118194e6 = euq0.m118194e(this.f62630a, c14775hn.f62630a)) != 0) {
            return iM118194e6;
        }
        int iCompareTo2 = Boolean.valueOf(m86178b()).compareTo(Boolean.valueOf(c14775hn.m86178b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86178b() && (iM118193d = euq0.m118193d(this.f62629a, c14775hn.f62629a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86180c()).compareTo(Boolean.valueOf(c14775hn.m86180c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86180c() && (iM118194e5 = euq0.m118194e(this.f62632b, c14775hn.f62632b)) != 0) {
            return iM118194e5;
        }
        int iCompareTo4 = Boolean.valueOf(m86182d()).compareTo(Boolean.valueOf(c14775hn.m86182d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86182d() && (iM118194e4 = euq0.m118194e(this.f62633c, c14775hn.f62633c)) != 0) {
            return iM118194e4;
        }
        int iCompareTo5 = Boolean.valueOf(m86184e()).compareTo(Boolean.valueOf(c14775hn.m86184e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86184e() && (iM118194e3 = euq0.m118194e(this.f62634d, c14775hn.f62634d)) != 0) {
            return iM118194e3;
        }
        int iCompareTo6 = Boolean.valueOf(m86185f()).compareTo(Boolean.valueOf(c14775hn.m86185f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86185f() && (iM118194e2 = euq0.m118194e(this.f62635e, c14775hn.f62635e)) != 0) {
            return iM118194e2;
        }
        int iCompareTo7 = Boolean.valueOf(m86186g()).compareTo(Boolean.valueOf(c14775hn.m86186g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86186g() && (iM118194e = euq0.m118194e(this.f62636f, c14775hn.f62636f)) != 0) {
            return iM118194e;
        }
        int iCompareTo8 = Boolean.valueOf(m86187h()).compareTo(Boolean.valueOf(c14775hn.m86187h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m86187h() || (iM118196g = euq0.m118196g(this.f62631a, c14775hn.f62631a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86174a();
        quq0Var.mo86237v(f62621a);
        if (this.f62630a != null && m86175a()) {
            quq0Var.mo86234s(f62620a);
            quq0Var.mo86232q(this.f62630a);
            quq0Var.mo86241z();
        }
        if (this.f62629a != null && m86178b()) {
            quq0Var.mo86234s(f62622b);
            this.f62629a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62632b != null) {
            quq0Var.mo86234s(f62623c);
            quq0Var.mo86232q(this.f62632b);
            quq0Var.mo86241z();
        }
        if (this.f62633c != null) {
            quq0Var.mo86234s(f62624d);
            quq0Var.mo86232q(this.f62633c);
            quq0Var.mo86241z();
        }
        if (this.f62634d != null) {
            quq0Var.mo86234s(f62625e);
            quq0Var.mo86232q(this.f62634d);
            quq0Var.mo86241z();
        }
        if (this.f62635e != null && m86185f()) {
            quq0Var.mo86234s(f62626f);
            quq0Var.mo86232q(this.f62635e);
            quq0Var.mo86241z();
        }
        if (this.f62636f != null && m86186g()) {
            quq0Var.mo86234s(f62627g);
            quq0Var.mo86232q(this.f62636f);
            quq0Var.mo86241z();
        }
        if (this.f62631a != null && m86187h()) {
            quq0Var.mo86234s(f62628h);
            quq0Var.mo86235t(new huq0((byte) 11, this.f62631a.size()));
            Iterator<String> it = this.f62631a.iterator();
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
    public boolean m86180c() {
        return this.f62632b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86182d() {
        return this.f62633c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86184e() {
        return this.f62634d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14775hn)) {
            return m86176a((C14775hn) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86185f() {
        return this.f62635e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86186g() {
        return this.f62636f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86187h() {
        return this.f62631a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m86175a()) {
            sb.append("debug:");
            String str = this.f62630a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86178b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62629a;
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
        String str2 = this.f62632b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62633c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f62634d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (m86185f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62635e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86186g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f62636f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86187h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f62631a;
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
    public C14775hn m86179c(String str) {
        this.f62634d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14775hn m86181d(String str) {
        this.f62635e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14775hn m86183e(String str) {
        this.f62636f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14775hn m86177b(String str) {
        this.f62633c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86178b() {
        return this.f62629a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14775hn m86173a(String str) {
        this.f62632b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86176a(C14775hn c14775hn) {
        if (c14775hn == null) {
            return false;
        }
        boolean zM86175a = m86175a();
        boolean zM86175a2 = c14775hn.m86175a();
        if ((zM86175a || zM86175a2) && !(zM86175a && zM86175a2 && this.f62630a.equals(c14775hn.f62630a))) {
            return false;
        }
        boolean zM86178b = m86178b();
        boolean zM86178b2 = c14775hn.m86178b();
        if ((zM86178b || zM86178b2) && !(zM86178b && zM86178b2 && this.f62629a.m85770a(c14775hn.f62629a))) {
            return false;
        }
        boolean zM86180c = m86180c();
        boolean zM86180c2 = c14775hn.m86180c();
        if ((zM86180c || zM86180c2) && !(zM86180c && zM86180c2 && this.f62632b.equals(c14775hn.f62632b))) {
            return false;
        }
        boolean zM86182d = m86182d();
        boolean zM86182d2 = c14775hn.m86182d();
        if ((zM86182d || zM86182d2) && !(zM86182d && zM86182d2 && this.f62633c.equals(c14775hn.f62633c))) {
            return false;
        }
        boolean zM86184e = m86184e();
        boolean zM86184e2 = c14775hn.m86184e();
        if ((zM86184e || zM86184e2) && !(zM86184e && zM86184e2 && this.f62634d.equals(c14775hn.f62634d))) {
            return false;
        }
        boolean zM86185f = m86185f();
        boolean zM86185f2 = c14775hn.m86185f();
        if ((zM86185f || zM86185f2) && !(zM86185f && zM86185f2 && this.f62635e.equals(c14775hn.f62635e))) {
            return false;
        }
        boolean zM86186g = m86186g();
        boolean zM86186g2 = c14775hn.m86186g();
        if ((zM86186g || zM86186g2) && !(zM86186g && zM86186g2 && this.f62636f.equals(c14775hn.f62636f))) {
            return false;
        }
        boolean zM86187h = m86187h();
        boolean zM86187h2 = c14775hn.m86187h();
        if (zM86187h || zM86187h2) {
            return zM86187h && zM86187h2 && this.f62631a.equals(c14775hn.f62631a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86175a() {
        return this.f62630a != null;
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
                m86174a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62630a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62629a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62632b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62633c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62634d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62635e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62636f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f62631a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            this.f62631a.add(quq0Var.mo86220e());
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
    public void m86174a() throws C14781ib {
        if (this.f62632b != null) {
            if (this.f62633c != null) {
                if (this.f62634d != null) {
                    return;
                }
                throw new C14781ib("Required field 'topic' was not present! Struct: " + toString());
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
