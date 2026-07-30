package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p149l.euq0;
import p149l.guq0;
import p149l.iuq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hi */
/* JADX INFO: loaded from: classes2.dex */
public class C14770hi implements InterfaceC14777hq<C14770hi, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14752gr f62524a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62525a;

    /* JADX INFO: renamed from: a */
    public String f62526a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62528a;

    /* JADX INFO: renamed from: b */
    public String f62530b;

    /* JADX INFO: renamed from: c */
    public String f62531c;

    /* JADX INFO: renamed from: d */
    public String f62532d;

    /* JADX INFO: renamed from: e */
    public String f62533e;

    /* JADX INFO: renamed from: f */
    public String f62534f;

    /* JADX INFO: renamed from: g */
    public String f62535g;

    /* JADX INFO: renamed from: h */
    public String f62536h;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62512a = new tuq0("XmPushActionSendMessage");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62511a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62513b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62514c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62515d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62516e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62517f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62518g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62519h = new guq0("", (byte) 12, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62520i = new guq0("", (byte) 2, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62521j = new guq0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62522k = new guq0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62523l = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f62527a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public boolean f62529a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14770hi c14770hi) {
        int iM118194e;
        int iM118194e2;
        int iM118197h;
        int iM118200k;
        int iM118193d;
        int iM118194e3;
        int iM118194e4;
        int iM118194e5;
        int iM118194e6;
        int iM118194e7;
        int iM118193d2;
        int iM118194e8;
        if (!getClass().equals(c14770hi.getClass())) {
            return getClass().getName().compareTo(c14770hi.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86084a()).compareTo(Boolean.valueOf(c14770hi.m86084a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86084a() && (iM118194e8 = euq0.m118194e(this.f62526a, c14770hi.f62526a)) != 0) {
            return iM118194e8;
        }
        int iCompareTo2 = Boolean.valueOf(m86087b()).compareTo(Boolean.valueOf(c14770hi.m86087b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86087b() && (iM118193d2 = euq0.m118193d(this.f62525a, c14770hi.f62525a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo3 = Boolean.valueOf(m86089c()).compareTo(Boolean.valueOf(c14770hi.m86089c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86089c() && (iM118194e7 = euq0.m118194e(this.f62530b, c14770hi.f62530b)) != 0) {
            return iM118194e7;
        }
        int iCompareTo4 = Boolean.valueOf(m86091d()).compareTo(Boolean.valueOf(c14770hi.m86091d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86091d() && (iM118194e6 = euq0.m118194e(this.f62531c, c14770hi.f62531c)) != 0) {
            return iM118194e6;
        }
        int iCompareTo5 = Boolean.valueOf(m86093e()).compareTo(Boolean.valueOf(c14770hi.m86093e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86093e() && (iM118194e5 = euq0.m118194e(this.f62532d, c14770hi.f62532d)) != 0) {
            return iM118194e5;
        }
        int iCompareTo6 = Boolean.valueOf(m86095f()).compareTo(Boolean.valueOf(c14770hi.m86095f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86095f() && (iM118194e4 = euq0.m118194e(this.f62533e, c14770hi.f62533e)) != 0) {
            return iM118194e4;
        }
        int iCompareTo7 = Boolean.valueOf(m86096g()).compareTo(Boolean.valueOf(c14770hi.m86096g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86096g() && (iM118194e3 = euq0.m118194e(this.f62534f, c14770hi.f62534f)) != 0) {
            return iM118194e3;
        }
        int iCompareTo8 = Boolean.valueOf(m86097h()).compareTo(Boolean.valueOf(c14770hi.m86097h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86097h() && (iM118193d = euq0.m118193d(this.f62524a, c14770hi.f62524a)) != 0) {
            return iM118193d;
        }
        int iCompareTo9 = Boolean.valueOf(m86098i()).compareTo(Boolean.valueOf(c14770hi.m86098i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86098i() && (iM118200k = euq0.m118200k(this.f62529a, c14770hi.f62529a)) != 0) {
            return iM118200k;
        }
        int iCompareTo10 = Boolean.valueOf(m86099j()).compareTo(Boolean.valueOf(c14770hi.m86099j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86099j() && (iM118197h = euq0.m118197h(this.f62528a, c14770hi.f62528a)) != 0) {
            return iM118197h;
        }
        int iCompareTo11 = Boolean.valueOf(m86100k()).compareTo(Boolean.valueOf(c14770hi.m86100k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86100k() && (iM118194e2 = euq0.m118194e(this.f62535g, c14770hi.f62535g)) != 0) {
            return iM118194e2;
        }
        int iCompareTo12 = Boolean.valueOf(m86101l()).compareTo(Boolean.valueOf(c14770hi.m86101l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!m86101l() || (iM118194e = euq0.m118194e(this.f62536h, c14770hi.f62536h)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86082a();
        quq0Var.mo86237v(f62512a);
        if (this.f62526a != null && m86084a()) {
            quq0Var.mo86234s(f62511a);
            quq0Var.mo86232q(this.f62526a);
            quq0Var.mo86241z();
        }
        if (this.f62525a != null && m86087b()) {
            quq0Var.mo86234s(f62513b);
            this.f62525a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62530b != null) {
            quq0Var.mo86234s(f62514c);
            quq0Var.mo86232q(this.f62530b);
            quq0Var.mo86241z();
        }
        if (this.f62531c != null) {
            quq0Var.mo86234s(f62515d);
            quq0Var.mo86232q(this.f62531c);
            quq0Var.mo86241z();
        }
        if (this.f62532d != null && m86093e()) {
            quq0Var.mo86234s(f62516e);
            quq0Var.mo86232q(this.f62532d);
            quq0Var.mo86241z();
        }
        if (this.f62533e != null && m86095f()) {
            quq0Var.mo86234s(f62517f);
            quq0Var.mo86232q(this.f62533e);
            quq0Var.mo86241z();
        }
        if (this.f62534f != null && m86096g()) {
            quq0Var.mo86234s(f62518g);
            quq0Var.mo86232q(this.f62534f);
            quq0Var.mo86241z();
        }
        if (this.f62524a != null && m86097h()) {
            quq0Var.mo86234s(f62519h);
            this.f62524a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (m86098i()) {
            quq0Var.mo86234s(f62520i);
            quq0Var.mo86239x(this.f62529a);
            quq0Var.mo86241z();
        }
        if (this.f62528a != null && m86099j()) {
            quq0Var.mo86234s(f62521j);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62528a.size()));
            for (Map.Entry<String, String> entry : this.f62528a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (this.f62535g != null && m86100k()) {
            quq0Var.mo86234s(f62522k);
            quq0Var.mo86232q(this.f62535g);
            quq0Var.mo86241z();
        }
        if (this.f62536h != null && m86101l()) {
            quq0Var.mo86234s(f62523l);
            quq0Var.mo86232q(this.f62536h);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86089c() {
        return this.f62530b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86091d() {
        return this.f62531c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86093e() {
        return this.f62532d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14770hi)) {
            return m86085a((C14770hi) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86095f() {
        return this.f62533e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86096g() {
        return this.f62534f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86097h() {
        return this.f62524a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86098i() {
        return this.f62527a.get(0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m86099j() {
        return this.f62528a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86100k() {
        return this.f62535g != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86101l() {
        return this.f62536h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m86084a()) {
            sb.append("debug:");
            String str = this.f62526a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86087b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62525a;
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
        String str2 = this.f62530b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62531c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m86093e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f62532d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86095f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f62533e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86096g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f62534f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86097h()) {
            sb.append(", ");
            sb.append("message:");
            C14752gr c14752gr = this.f62524a;
            if (c14752gr == null) {
                sb.append("null");
            } else {
                sb.append(c14752gr);
            }
        }
        if (m86098i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f62529a);
        }
        if (m86099j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f62528a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m86100k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62535g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m86101l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f62536h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m86088c() {
        return this.f62533e;
    }

    /* JADX INFO: renamed from: d */
    public String m86090d() {
        return this.f62534f;
    }

    /* JADX INFO: renamed from: e */
    public String m86092e() {
        return this.f62535g;
    }

    /* JADX INFO: renamed from: f */
    public String m86094f() {
        return this.f62536h;
    }

    /* JADX INFO: renamed from: b */
    public String m86086b() {
        return this.f62531c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86087b() {
        return this.f62525a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m86081a() {
        return this.f62530b;
    }

    /* JADX INFO: renamed from: a */
    public C14752gr m86080a() {
        return this.f62524a;
    }

    /* JADX INFO: renamed from: a */
    public void m86083a(boolean z) {
        this.f62527a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86085a(C14770hi c14770hi) {
        if (c14770hi == null) {
            return false;
        }
        boolean zM86084a = m86084a();
        boolean zM86084a2 = c14770hi.m86084a();
        if ((zM86084a || zM86084a2) && !(zM86084a && zM86084a2 && this.f62526a.equals(c14770hi.f62526a))) {
            return false;
        }
        boolean zM86087b = m86087b();
        boolean zM86087b2 = c14770hi.m86087b();
        if ((zM86087b || zM86087b2) && !(zM86087b && zM86087b2 && this.f62525a.m85770a(c14770hi.f62525a))) {
            return false;
        }
        boolean zM86089c = m86089c();
        boolean zM86089c2 = c14770hi.m86089c();
        if ((zM86089c || zM86089c2) && !(zM86089c && zM86089c2 && this.f62530b.equals(c14770hi.f62530b))) {
            return false;
        }
        boolean zM86091d = m86091d();
        boolean zM86091d2 = c14770hi.m86091d();
        if ((zM86091d || zM86091d2) && !(zM86091d && zM86091d2 && this.f62531c.equals(c14770hi.f62531c))) {
            return false;
        }
        boolean zM86093e = m86093e();
        boolean zM86093e2 = c14770hi.m86093e();
        if ((zM86093e || zM86093e2) && !(zM86093e && zM86093e2 && this.f62532d.equals(c14770hi.f62532d))) {
            return false;
        }
        boolean zM86095f = m86095f();
        boolean zM86095f2 = c14770hi.m86095f();
        if ((zM86095f || zM86095f2) && !(zM86095f && zM86095f2 && this.f62533e.equals(c14770hi.f62533e))) {
            return false;
        }
        boolean zM86096g = m86096g();
        boolean zM86096g2 = c14770hi.m86096g();
        if ((zM86096g || zM86096g2) && !(zM86096g && zM86096g2 && this.f62534f.equals(c14770hi.f62534f))) {
            return false;
        }
        boolean zM86097h = m86097h();
        boolean zM86097h2 = c14770hi.m86097h();
        if ((zM86097h || zM86097h2) && !(zM86097h && zM86097h2 && this.f62524a.m85698a(c14770hi.f62524a))) {
            return false;
        }
        boolean zM86098i = m86098i();
        boolean zM86098i2 = c14770hi.m86098i();
        if ((zM86098i || zM86098i2) && !(zM86098i && zM86098i2 && this.f62529a == c14770hi.f62529a)) {
            return false;
        }
        boolean zM86099j = m86099j();
        boolean zM86099j2 = c14770hi.m86099j();
        if ((zM86099j || zM86099j2) && !(zM86099j && zM86099j2 && this.f62528a.equals(c14770hi.f62528a))) {
            return false;
        }
        boolean zM86100k = m86100k();
        boolean zM86100k2 = c14770hi.m86100k();
        if ((zM86100k || zM86100k2) && !(zM86100k && zM86100k2 && this.f62535g.equals(c14770hi.f62535g))) {
            return false;
        }
        boolean zM86101l = m86101l();
        boolean zM86101l2 = c14770hi.m86101l();
        if (zM86101l || zM86101l2) {
            return zM86101l && zM86101l2 && this.f62536h.equals(c14770hi.f62536h);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86084a() {
        return this.f62526a != null;
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
                m86082a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62526a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62525a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62530b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62531c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62532d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62533e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62534f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14752gr c14752gr = new C14752gr();
                        this.f62524a = c14752gr;
                        c14752gr.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 2) {
                        this.f62529a = quq0Var.mo86240y();
                        m86083a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f62528a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                            this.f62528a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f62535g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f62536h = quq0Var.mo86220e();
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
    public void m86082a() throws C14781ib {
        if (this.f62530b != null) {
            if (this.f62531c != null) {
                return;
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
