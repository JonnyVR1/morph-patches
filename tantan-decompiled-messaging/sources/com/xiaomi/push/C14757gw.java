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

/* JADX INFO: renamed from: com.xiaomi.push.gw */
/* JADX INFO: loaded from: classes2.dex */
public class C14757gw implements InterfaceC14777hq<C14757gw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14755gu f62266a;

    /* JADX INFO: renamed from: a */
    public String f62267a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62269a;

    /* JADX INFO: renamed from: b */
    public String f62270b;

    /* JADX INFO: renamed from: c */
    public String f62271c;

    /* JADX INFO: renamed from: d */
    public String f62272d;

    /* JADX INFO: renamed from: e */
    public String f62273e;

    /* JADX INFO: renamed from: f */
    public String f62274f;

    /* JADX INFO: renamed from: g */
    public String f62275g;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62255a = new tuq0("XmPushActionAckNotification");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62254a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62256b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62257c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62258d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62259e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62260f = new guq0("", (byte) 10, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62261g = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62262h = new guq0("", HttpTokens.CARRIAGE_RETURN, 9);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62263i = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62264j = new guq0("", (byte) 11, 11);

    /* JADX INFO: renamed from: a */
    private BitSet f62268a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public long f62265a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14757gw c14757gw) {
        int iM118194e;
        int iM118194e2;
        int iM118197h;
        int iM118194e3;
        int iM118192c;
        int iM118194e4;
        int iM118194e5;
        int iM118194e6;
        int iM118193d;
        int iM118194e7;
        if (!getClass().equals(c14757gw.getClass())) {
            return getClass().getName().compareTo(c14757gw.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85819a()).compareTo(Boolean.valueOf(c14757gw.m85819a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85819a() && (iM118194e7 = euq0.m118194e(this.f62267a, c14757gw.f62267a)) != 0) {
            return iM118194e7;
        }
        int iCompareTo2 = Boolean.valueOf(m85823b()).compareTo(Boolean.valueOf(c14757gw.m85823b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85823b() && (iM118193d = euq0.m118193d(this.f62266a, c14757gw.f62266a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m85825c()).compareTo(Boolean.valueOf(c14757gw.m85825c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85825c() && (iM118194e6 = euq0.m118194e(this.f62270b, c14757gw.f62270b)) != 0) {
            return iM118194e6;
        }
        int iCompareTo4 = Boolean.valueOf(m85827d()).compareTo(Boolean.valueOf(c14757gw.m85827d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85827d() && (iM118194e5 = euq0.m118194e(this.f62271c, c14757gw.f62271c)) != 0) {
            return iM118194e5;
        }
        int iCompareTo5 = Boolean.valueOf(m85829e()).compareTo(Boolean.valueOf(c14757gw.m85829e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85829e() && (iM118194e4 = euq0.m118194e(this.f62272d, c14757gw.f62272d)) != 0) {
            return iM118194e4;
        }
        int iCompareTo6 = Boolean.valueOf(m85830f()).compareTo(Boolean.valueOf(c14757gw.m85830f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85830f() && (iM118192c = euq0.m118192c(this.f62265a, c14757gw.f62265a)) != 0) {
            return iM118192c;
        }
        int iCompareTo7 = Boolean.valueOf(m85831g()).compareTo(Boolean.valueOf(c14757gw.m85831g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85831g() && (iM118194e3 = euq0.m118194e(this.f62273e, c14757gw.f62273e)) != 0) {
            return iM118194e3;
        }
        int iCompareTo8 = Boolean.valueOf(m85832h()).compareTo(Boolean.valueOf(c14757gw.m85832h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85832h() && (iM118197h = euq0.m118197h(this.f62269a, c14757gw.f62269a)) != 0) {
            return iM118197h;
        }
        int iCompareTo9 = Boolean.valueOf(m85833i()).compareTo(Boolean.valueOf(c14757gw.m85833i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85833i() && (iM118194e2 = euq0.m118194e(this.f62274f, c14757gw.f62274f)) != 0) {
            return iM118194e2;
        }
        int iCompareTo10 = Boolean.valueOf(m85834j()).compareTo(Boolean.valueOf(c14757gw.m85834j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m85834j() || (iM118194e = euq0.m118194e(this.f62275g, c14757gw.f62275g)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85817a();
        quq0Var.mo86237v(f62255a);
        if (this.f62267a != null && m85819a()) {
            quq0Var.mo86234s(f62254a);
            quq0Var.mo86232q(this.f62267a);
            quq0Var.mo86241z();
        }
        if (this.f62266a != null && m85823b()) {
            quq0Var.mo86234s(f62256b);
            this.f62266a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62270b != null) {
            quq0Var.mo86234s(f62257c);
            quq0Var.mo86232q(this.f62270b);
            quq0Var.mo86241z();
        }
        if (this.f62271c != null && m85827d()) {
            quq0Var.mo86234s(f62258d);
            quq0Var.mo86232q(this.f62271c);
            quq0Var.mo86241z();
        }
        if (this.f62272d != null && m85829e()) {
            quq0Var.mo86234s(f62259e);
            quq0Var.mo86232q(this.f62272d);
            quq0Var.mo86241z();
        }
        if (m85830f()) {
            quq0Var.mo86234s(f62260f);
            quq0Var.mo86231p(this.f62265a);
            quq0Var.mo86241z();
        }
        if (this.f62273e != null && m85831g()) {
            quq0Var.mo86234s(f62261g);
            quq0Var.mo86232q(this.f62273e);
            quq0Var.mo86241z();
        }
        if (this.f62269a != null && m85832h()) {
            quq0Var.mo86234s(f62262h);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62269a.size()));
            for (Map.Entry<String, String> entry : this.f62269a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (this.f62274f != null && m85833i()) {
            quq0Var.mo86234s(f62263i);
            quq0Var.mo86232q(this.f62274f);
            quq0Var.mo86241z();
        }
        if (this.f62275g != null && m85834j()) {
            quq0Var.mo86234s(f62264j);
            quq0Var.mo86232q(this.f62275g);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85825c() {
        return this.f62270b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85827d() {
        return this.f62271c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85829e() {
        return this.f62272d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14757gw)) {
            return m85820a((C14757gw) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85830f() {
        return this.f62268a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85831g() {
        return this.f62273e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85832h() {
        return this.f62269a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85833i() {
        return this.f62274f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85834j() {
        return this.f62275g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m85819a()) {
            sb.append("debug:");
            String str = this.f62267a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m85823b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62266a;
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
        String str2 = this.f62270b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m85827d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f62271c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m85829e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f62272d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85830f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f62265a);
        }
        if (m85831g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f62273e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85832h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f62269a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m85833i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62274f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m85834j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62275g;
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
    public C14757gw m85824c(String str) {
        this.f62272d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14757gw m85826d(String str) {
        this.f62273e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14757gw m85828e(String str) {
        this.f62274f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14757gw m85821b(String str) {
        this.f62271c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m85822b() {
        return this.f62272d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85823b() {
        return this.f62266a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14757gw m85813a(C14755gu c14755gu) {
        this.f62266a = c14755gu;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m85815a() {
        return this.f62270b;
    }

    /* JADX INFO: renamed from: a */
    public C14757gw m85814a(String str) {
        this.f62270b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14757gw m85812a(long j) {
        this.f62265a = j;
        m85818a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85818a(boolean z) {
        this.f62268a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m85816a() {
        return this.f62269a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85820a(C14757gw c14757gw) {
        if (c14757gw == null) {
            return false;
        }
        boolean zM85819a = m85819a();
        boolean zM85819a2 = c14757gw.m85819a();
        if ((zM85819a || zM85819a2) && !(zM85819a && zM85819a2 && this.f62267a.equals(c14757gw.f62267a))) {
            return false;
        }
        boolean zM85823b = m85823b();
        boolean zM85823b2 = c14757gw.m85823b();
        if ((zM85823b || zM85823b2) && !(zM85823b && zM85823b2 && this.f62266a.m85770a(c14757gw.f62266a))) {
            return false;
        }
        boolean zM85825c = m85825c();
        boolean zM85825c2 = c14757gw.m85825c();
        if ((zM85825c || zM85825c2) && !(zM85825c && zM85825c2 && this.f62270b.equals(c14757gw.f62270b))) {
            return false;
        }
        boolean zM85827d = m85827d();
        boolean zM85827d2 = c14757gw.m85827d();
        if ((zM85827d || zM85827d2) && !(zM85827d && zM85827d2 && this.f62271c.equals(c14757gw.f62271c))) {
            return false;
        }
        boolean zM85829e = m85829e();
        boolean zM85829e2 = c14757gw.m85829e();
        if ((zM85829e || zM85829e2) && !(zM85829e && zM85829e2 && this.f62272d.equals(c14757gw.f62272d))) {
            return false;
        }
        boolean zM85830f = m85830f();
        boolean zM85830f2 = c14757gw.m85830f();
        if ((zM85830f || zM85830f2) && !(zM85830f && zM85830f2 && this.f62265a == c14757gw.f62265a)) {
            return false;
        }
        boolean zM85831g = m85831g();
        boolean zM85831g2 = c14757gw.m85831g();
        if ((zM85831g || zM85831g2) && !(zM85831g && zM85831g2 && this.f62273e.equals(c14757gw.f62273e))) {
            return false;
        }
        boolean zM85832h = m85832h();
        boolean zM85832h2 = c14757gw.m85832h();
        if ((zM85832h || zM85832h2) && !(zM85832h && zM85832h2 && this.f62269a.equals(c14757gw.f62269a))) {
            return false;
        }
        boolean zM85833i = m85833i();
        boolean zM85833i2 = c14757gw.m85833i();
        if ((zM85833i || zM85833i2) && !(zM85833i && zM85833i2 && this.f62274f.equals(c14757gw.f62274f))) {
            return false;
        }
        boolean zM85834j = m85834j();
        boolean zM85834j2 = c14757gw.m85834j();
        if (zM85834j || zM85834j2) {
            return zM85834j && zM85834j2 && this.f62275g.equals(c14757gw.f62275g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85819a() {
        return this.f62267a != null;
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
                m85817a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62267a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62266a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62270b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62271c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62272d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 7:
                    if (b == 10) {
                        this.f62265a = quq0Var.mo86219d();
                        m85818a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62273e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f62269a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                            this.f62269a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62274f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f62275g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85817a() throws C14781ib {
        if (this.f62270b != null) {
            return;
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
