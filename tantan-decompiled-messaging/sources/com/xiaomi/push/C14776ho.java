package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.ho */
/* JADX INFO: loaded from: classes2.dex */
public class C14776ho implements InterfaceC14777hq<C14776ho, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62647a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62648a;

    /* JADX INFO: renamed from: a */
    public String f62649a;

    /* JADX INFO: renamed from: a */
    private BitSet f62650a = new BitSet(1);

    /* JADX INFO: renamed from: b */
    public String f62651b;

    /* JADX INFO: renamed from: c */
    public String f62652c;

    /* JADX INFO: renamed from: d */
    public String f62653d;

    /* JADX INFO: renamed from: e */
    public String f62654e;

    /* JADX INFO: renamed from: f */
    public String f62655f;

    /* JADX INFO: renamed from: g */
    public String f62656g;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62638a = new tuq0("XmPushActionUnSubscriptionResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62637a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62639b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62640c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62641d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62642e = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62643f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62644g = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62645h = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62646i = new guq0("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14776ho c14776ho) {
        int iM118194e;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118192c;
        int iM118194e5;
        int iM118194e6;
        int iM118193d;
        int iM118194e7;
        if (!getClass().equals(c14776ho.getClass())) {
            return getClass().getName().compareTo(c14776ho.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86192a()).compareTo(Boolean.valueOf(c14776ho.m86192a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86192a() && (iM118194e7 = euq0.m118194e(this.f62649a, c14776ho.f62649a)) != 0) {
            return iM118194e7;
        }
        int iCompareTo2 = Boolean.valueOf(m86195b()).compareTo(Boolean.valueOf(c14776ho.m86195b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86195b() && (iM118193d = euq0.m118193d(this.f62648a, c14776ho.f62648a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86197c()).compareTo(Boolean.valueOf(c14776ho.m86197c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86197c() && (iM118194e6 = euq0.m118194e(this.f62651b, c14776ho.f62651b)) != 0) {
            return iM118194e6;
        }
        int iCompareTo4 = Boolean.valueOf(m86198d()).compareTo(Boolean.valueOf(c14776ho.m86198d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86198d() && (iM118194e5 = euq0.m118194e(this.f62652c, c14776ho.f62652c)) != 0) {
            return iM118194e5;
        }
        int iCompareTo5 = Boolean.valueOf(m86199e()).compareTo(Boolean.valueOf(c14776ho.m86199e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86199e() && (iM118192c = euq0.m118192c(this.f62647a, c14776ho.f62647a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m86200f()).compareTo(Boolean.valueOf(c14776ho.m86200f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86200f() && (iM118194e4 = euq0.m118194e(this.f62653d, c14776ho.f62653d)) != 0) {
            return iM118194e4;
        }
        int iCompareTo7 = Boolean.valueOf(m86201g()).compareTo(Boolean.valueOf(c14776ho.m86201g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86201g() && (iM118194e3 = euq0.m118194e(this.f62654e, c14776ho.f62654e)) != 0) {
            return iM118194e3;
        }
        int iCompareTo8 = Boolean.valueOf(m86202h()).compareTo(Boolean.valueOf(c14776ho.m86202h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86202h() && (iM118194e2 = euq0.m118194e(this.f62655f, c14776ho.f62655f)) != 0) {
            return iM118194e2;
        }
        int iCompareTo9 = Boolean.valueOf(m86203i()).compareTo(Boolean.valueOf(c14776ho.m86203i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (!m86203i() || (iM118194e = euq0.m118194e(this.f62656g, c14776ho.f62656g)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86190a();
        quq0Var.mo86237v(f62638a);
        if (this.f62649a != null && m86192a()) {
            quq0Var.mo86234s(f62637a);
            quq0Var.mo86232q(this.f62649a);
            quq0Var.mo86241z();
        }
        if (this.f62648a != null && m86195b()) {
            quq0Var.mo86234s(f62639b);
            this.f62648a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62651b != null) {
            quq0Var.mo86234s(f62640c);
            quq0Var.mo86232q(this.f62651b);
            quq0Var.mo86241z();
        }
        if (this.f62652c != null && m86198d()) {
            quq0Var.mo86234s(f62641d);
            quq0Var.mo86232q(this.f62652c);
            quq0Var.mo86241z();
        }
        if (m86199e()) {
            quq0Var.mo86234s(f62642e);
            quq0Var.mo86231p(this.f62647a);
            quq0Var.mo86241z();
        }
        if (this.f62653d != null && m86200f()) {
            quq0Var.mo86234s(f62643f);
            quq0Var.mo86232q(this.f62653d);
            quq0Var.mo86241z();
        }
        if (this.f62654e != null && m86201g()) {
            quq0Var.mo86234s(f62644g);
            quq0Var.mo86232q(this.f62654e);
            quq0Var.mo86241z();
        }
        if (this.f62655f != null && m86202h()) {
            quq0Var.mo86234s(f62645h);
            quq0Var.mo86232q(this.f62655f);
            quq0Var.mo86241z();
        }
        if (this.f62656g != null && m86203i()) {
            quq0Var.mo86234s(f62646i);
            quq0Var.mo86232q(this.f62656g);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86197c() {
        return this.f62651b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86198d() {
        return this.f62652c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86199e() {
        return this.f62650a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14776ho)) {
            return m86193a((C14776ho) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86200f() {
        return this.f62653d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86201g() {
        return this.f62654e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86202h() {
        return this.f62655f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86203i() {
        return this.f62656g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m86192a()) {
            sb.append("debug:");
            String str = this.f62649a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86195b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62648a;
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
        String str2 = this.f62651b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m86198d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f62652c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m86199e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f62647a);
        }
        if (m86200f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62653d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86201g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f62654e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86202h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62655f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86203i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62656g;
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
    public String m86196c() {
        return this.f62656g;
    }

    /* JADX INFO: renamed from: b */
    public String m86194b() {
        return this.f62654e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86195b() {
        return this.f62648a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m86189a() {
        return this.f62651b;
    }

    /* JADX INFO: renamed from: a */
    public void m86191a(boolean z) {
        this.f62650a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86193a(C14776ho c14776ho) {
        if (c14776ho == null) {
            return false;
        }
        boolean zM86192a = m86192a();
        boolean zM86192a2 = c14776ho.m86192a();
        if ((zM86192a || zM86192a2) && !(zM86192a && zM86192a2 && this.f62649a.equals(c14776ho.f62649a))) {
            return false;
        }
        boolean zM86195b = m86195b();
        boolean zM86195b2 = c14776ho.m86195b();
        if ((zM86195b || zM86195b2) && !(zM86195b && zM86195b2 && this.f62648a.m85770a(c14776ho.f62648a))) {
            return false;
        }
        boolean zM86197c = m86197c();
        boolean zM86197c2 = c14776ho.m86197c();
        if ((zM86197c || zM86197c2) && !(zM86197c && zM86197c2 && this.f62651b.equals(c14776ho.f62651b))) {
            return false;
        }
        boolean zM86198d = m86198d();
        boolean zM86198d2 = c14776ho.m86198d();
        if ((zM86198d || zM86198d2) && !(zM86198d && zM86198d2 && this.f62652c.equals(c14776ho.f62652c))) {
            return false;
        }
        boolean zM86199e = m86199e();
        boolean zM86199e2 = c14776ho.m86199e();
        if ((zM86199e || zM86199e2) && !(zM86199e && zM86199e2 && this.f62647a == c14776ho.f62647a)) {
            return false;
        }
        boolean zM86200f = m86200f();
        boolean zM86200f2 = c14776ho.m86200f();
        if ((zM86200f || zM86200f2) && !(zM86200f && zM86200f2 && this.f62653d.equals(c14776ho.f62653d))) {
            return false;
        }
        boolean zM86201g = m86201g();
        boolean zM86201g2 = c14776ho.m86201g();
        if ((zM86201g || zM86201g2) && !(zM86201g && zM86201g2 && this.f62654e.equals(c14776ho.f62654e))) {
            return false;
        }
        boolean zM86202h = m86202h();
        boolean zM86202h2 = c14776ho.m86202h();
        if ((zM86202h || zM86202h2) && !(zM86202h && zM86202h2 && this.f62655f.equals(c14776ho.f62655f))) {
            return false;
        }
        boolean zM86203i = m86203i();
        boolean zM86203i2 = c14776ho.m86203i();
        if (zM86203i || zM86203i2) {
            return zM86203i && zM86203i2 && this.f62656g.equals(c14776ho.f62656g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86192a() {
        return this.f62649a != null;
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
                m86190a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62649a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62648a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62651b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62652c = quq0Var.mo86220e();
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
                        this.f62647a = quq0Var.mo86219d();
                        m86191a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62653d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62654e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62655f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62656g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86190a() throws C14781ib {
        if (this.f62651b != null) {
            return;
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
