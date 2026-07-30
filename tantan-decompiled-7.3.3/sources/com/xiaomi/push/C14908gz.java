package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gz */
/* JADX INFO: loaded from: classes2.dex */
public class C14908gz implements InterfaceC14925hq<C14908gz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f63143a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63144a;

    /* JADX INFO: renamed from: a */
    public String f63145a;

    /* JADX INFO: renamed from: a */
    public List<String> f63147a;

    /* JADX INFO: renamed from: b */
    public String f63149b;

    /* JADX INFO: renamed from: c */
    public String f63151c;

    /* JADX INFO: renamed from: d */
    public String f63152d;

    /* JADX INFO: renamed from: e */
    public String f63153e;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63133a = new z3r0("XmPushActionCommand");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63132a = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63134b = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63135c = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63136d = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63137e = new m3r0("", (byte) 15, 6);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63138f = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63139g = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63140h = new m3r0("", (byte) 2, 10);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63141i = new m3r0("", (byte) 2, 11);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63142j = new m3r0("", (byte) 10, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f63146a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public boolean f63148a = false;

    /* JADX INFO: renamed from: b */
    public boolean f63150b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14908gz c14908gz) {
        int iM148144c;
        int iM148152k;
        int iM148152k2;
        int iM148146e;
        int iM148146e2;
        int iM148148g;
        int iM148146e3;
        int iM148146e4;
        int iM148146e5;
        int iM148145d;
        if (!getClass().equals(c14908gz.getClass())) {
            return getClass().getName().compareTo(c14908gz.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87026a()).compareTo(Boolean.valueOf(c14908gz.m87026a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87026a() && (iM148145d = k3r0.m148145d(this.f63144a, c14908gz.f63144a)) != 0) {
            return iM148145d;
        }
        int iCompareTo2 = Boolean.valueOf(m87030b()).compareTo(Boolean.valueOf(c14908gz.m87030b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87030b() && (iM148146e5 = k3r0.m148146e(this.f63145a, c14908gz.f63145a)) != 0) {
            return iM148146e5;
        }
        int iCompareTo3 = Boolean.valueOf(m87033c()).compareTo(Boolean.valueOf(c14908gz.m87033c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87033c() && (iM148146e4 = k3r0.m148146e(this.f63149b, c14908gz.f63149b)) != 0) {
            return iM148146e4;
        }
        int iCompareTo4 = Boolean.valueOf(m87035d()).compareTo(Boolean.valueOf(c14908gz.m87035d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87035d() && (iM148146e3 = k3r0.m148146e(this.f63151c, c14908gz.f63151c)) != 0) {
            return iM148146e3;
        }
        int iCompareTo5 = Boolean.valueOf(m87037e()).compareTo(Boolean.valueOf(c14908gz.m87037e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87037e() && (iM148148g = k3r0.m148148g(this.f63147a, c14908gz.f63147a)) != 0) {
            return iM148148g;
        }
        int iCompareTo6 = Boolean.valueOf(m87038f()).compareTo(Boolean.valueOf(c14908gz.m87038f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87038f() && (iM148146e2 = k3r0.m148146e(this.f63152d, c14908gz.f63152d)) != 0) {
            return iM148146e2;
        }
        int iCompareTo7 = Boolean.valueOf(m87039g()).compareTo(Boolean.valueOf(c14908gz.m87039g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87039g() && (iM148146e = k3r0.m148146e(this.f63153e, c14908gz.f63153e)) != 0) {
            return iM148146e;
        }
        int iCompareTo8 = Boolean.valueOf(m87040h()).compareTo(Boolean.valueOf(c14908gz.m87040h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87040h() && (iM148152k2 = k3r0.m148152k(this.f63148a, c14908gz.f63148a)) != 0) {
            return iM148152k2;
        }
        int iCompareTo9 = Boolean.valueOf(m87041i()).compareTo(Boolean.valueOf(c14908gz.m87041i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87041i() && (iM148152k = k3r0.m148152k(this.f63150b, c14908gz.f63150b)) != 0) {
            return iM148152k;
        }
        int iCompareTo10 = Boolean.valueOf(m87042j()).compareTo(Boolean.valueOf(c14908gz.m87042j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m87042j() || (iM148144c = k3r0.m148144c(this.f63143a, c14908gz.f63143a)) == 0) {
            return 0;
        }
        return iM148144c;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87023a();
        w3r0Var.mo87408v(f63133a);
        if (this.f63144a != null && m87026a()) {
            w3r0Var.mo87405s(f63132a);
            this.f63144a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63145a != null) {
            w3r0Var.mo87405s(f63134b);
            w3r0Var.mo87403q(this.f63145a);
            w3r0Var.mo87412z();
        }
        if (this.f63149b != null) {
            w3r0Var.mo87405s(f63135c);
            w3r0Var.mo87403q(this.f63149b);
            w3r0Var.mo87412z();
        }
        if (this.f63151c != null) {
            w3r0Var.mo87405s(f63136d);
            w3r0Var.mo87403q(this.f63151c);
            w3r0Var.mo87412z();
        }
        if (this.f63147a != null && m87037e()) {
            w3r0Var.mo87405s(f63137e);
            w3r0Var.mo87406t(new n3r0((byte) 11, this.f63147a.size()));
            Iterator<String> it = this.f63147a.iterator();
            while (it.hasNext()) {
                w3r0Var.mo87403q(it.next());
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        if (this.f63152d != null && m87038f()) {
            w3r0Var.mo87405s(f63138f);
            w3r0Var.mo87403q(this.f63152d);
            w3r0Var.mo87412z();
        }
        if (this.f63153e != null && m87039g()) {
            w3r0Var.mo87405s(f63139g);
            w3r0Var.mo87403q(this.f63153e);
            w3r0Var.mo87412z();
        }
        if (m87040h()) {
            w3r0Var.mo87405s(f63140h);
            w3r0Var.mo87410x(this.f63148a);
            w3r0Var.mo87412z();
        }
        if (m87041i()) {
            w3r0Var.mo87405s(f63141i);
            w3r0Var.mo87410x(this.f63150b);
            w3r0Var.mo87412z();
        }
        if (m87042j()) {
            w3r0Var.mo87405s(f63142j);
            w3r0Var.mo87402p(this.f63143a);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87033c() {
        return this.f63149b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87035d() {
        return this.f63151c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87037e() {
        return this.f63147a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14908gz)) {
            return m87027a((C14908gz) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87038f() {
        return this.f63152d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87039g() {
        return this.f63153e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87040h() {
        return this.f63146a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87041i() {
        return this.f63146a.get(1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m87042j() {
        return this.f63146a.get(2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m87026a()) {
            sb.append("target:");
            C14903gu c14903gu = this.f63144a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f63145a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f63149b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f63151c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m87037e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f63147a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m87038f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f63152d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87039g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f63153e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87040h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f63148a);
        }
        if (m87041i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f63150b);
        }
        if (m87042j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f63143a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public C14908gz m87031c(String str) {
        this.f63151c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14908gz m87034d(String str) {
        this.f63152d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14908gz m87036e(String str) {
        this.f63153e = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m87032c(boolean z) {
        this.f63146a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public C14908gz m87028b(String str) {
        this.f63149b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m87029b(boolean z) {
        this.f63146a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m87030b() {
        return this.f63145a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14908gz m87021a(String str) {
        this.f63145a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m87022a() {
        return this.f63151c;
    }

    /* JADX INFO: renamed from: a */
    public void m87024a(String str) {
        if (this.f63147a == null) {
            this.f63147a = new ArrayList();
        }
        this.f63147a.add(str);
    }

    /* JADX INFO: renamed from: a */
    public void m87025a(boolean z) {
        this.f63146a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87027a(C14908gz c14908gz) {
        if (c14908gz == null) {
            return false;
        }
        boolean zM87026a = m87026a();
        boolean zM87026a2 = c14908gz.m87026a();
        if ((zM87026a || zM87026a2) && !(zM87026a && zM87026a2 && this.f63144a.m86941a(c14908gz.f63144a))) {
            return false;
        }
        boolean zM87030b = m87030b();
        boolean zM87030b2 = c14908gz.m87030b();
        if ((zM87030b || zM87030b2) && !(zM87030b && zM87030b2 && this.f63145a.equals(c14908gz.f63145a))) {
            return false;
        }
        boolean zM87033c = m87033c();
        boolean zM87033c2 = c14908gz.m87033c();
        if ((zM87033c || zM87033c2) && !(zM87033c && zM87033c2 && this.f63149b.equals(c14908gz.f63149b))) {
            return false;
        }
        boolean zM87035d = m87035d();
        boolean zM87035d2 = c14908gz.m87035d();
        if ((zM87035d || zM87035d2) && !(zM87035d && zM87035d2 && this.f63151c.equals(c14908gz.f63151c))) {
            return false;
        }
        boolean zM87037e = m87037e();
        boolean zM87037e2 = c14908gz.m87037e();
        if ((zM87037e || zM87037e2) && !(zM87037e && zM87037e2 && this.f63147a.equals(c14908gz.f63147a))) {
            return false;
        }
        boolean zM87038f = m87038f();
        boolean zM87038f2 = c14908gz.m87038f();
        if ((zM87038f || zM87038f2) && !(zM87038f && zM87038f2 && this.f63152d.equals(c14908gz.f63152d))) {
            return false;
        }
        boolean zM87039g = m87039g();
        boolean zM87039g2 = c14908gz.m87039g();
        if ((zM87039g || zM87039g2) && !(zM87039g && zM87039g2 && this.f63153e.equals(c14908gz.f63153e))) {
            return false;
        }
        boolean zM87040h = m87040h();
        boolean zM87040h2 = c14908gz.m87040h();
        if ((zM87040h || zM87040h2) && !(zM87040h && zM87040h2 && this.f63148a == c14908gz.f63148a)) {
            return false;
        }
        boolean zM87041i = m87041i();
        boolean zM87041i2 = c14908gz.m87041i();
        if ((zM87041i || zM87041i2) && !(zM87041i && zM87041i2 && this.f63150b == c14908gz.f63150b)) {
            return false;
        }
        boolean zM87042j = m87042j();
        boolean zM87042j2 = c14908gz.m87042j();
        if (zM87042j || zM87042j2) {
            return zM87042j && zM87042j2 && this.f63143a == c14908gz.f63143a;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87026a() {
        return this.f63144a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) throws C14929ib {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                m87023a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63144a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63145a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63149b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63151c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f63147a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            this.f63147a.add(w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87382G();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63152d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 9:
                    if (b == 11) {
                        this.f63153e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 2) {
                        this.f63148a = w3r0Var.mo87411y();
                        m87025a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f63150b = w3r0Var.mo87411y();
                        m87029b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 10) {
                        this.f63143a = w3r0Var.mo87390d();
                        m87032c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87023a() throws C14929ib {
        if (this.f63145a != null) {
            if (this.f63149b != null) {
                if (this.f63151c != null) {
                    return;
                }
                throw new C14929ib("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
