package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p153l.k3r0;
import p153l.m3r0;
import p153l.o3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hi */
/* JADX INFO: loaded from: classes2.dex */
public class C14918hi implements InterfaceC14925hq<C14918hi, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14900gr f63371a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63372a;

    /* JADX INFO: renamed from: a */
    public String f63373a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63375a;

    /* JADX INFO: renamed from: b */
    public String f63377b;

    /* JADX INFO: renamed from: c */
    public String f63378c;

    /* JADX INFO: renamed from: d */
    public String f63379d;

    /* JADX INFO: renamed from: e */
    public String f63380e;

    /* JADX INFO: renamed from: f */
    public String f63381f;

    /* JADX INFO: renamed from: g */
    public String f63382g;

    /* JADX INFO: renamed from: h */
    public String f63383h;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63359a = new z3r0("XmPushActionSendMessage");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63358a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63360b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63361c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63362d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63363e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63364f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63365g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63366h = new m3r0("", (byte) 12, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63367i = new m3r0("", (byte) 2, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63368j = new m3r0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63369k = new m3r0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63370l = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f63374a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public boolean f63376a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14918hi c14918hi) {
        int iM148146e;
        int iM148146e2;
        int iM148149h;
        int iM148152k;
        int iM148145d;
        int iM148146e3;
        int iM148146e4;
        int iM148146e5;
        int iM148146e6;
        int iM148146e7;
        int iM148145d2;
        int iM148146e8;
        if (!getClass().equals(c14918hi.getClass())) {
            return getClass().getName().compareTo(c14918hi.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87255a()).compareTo(Boolean.valueOf(c14918hi.m87255a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87255a() && (iM148146e8 = k3r0.m148146e(this.f63373a, c14918hi.f63373a)) != 0) {
            return iM148146e8;
        }
        int iCompareTo2 = Boolean.valueOf(m87258b()).compareTo(Boolean.valueOf(c14918hi.m87258b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87258b() && (iM148145d2 = k3r0.m148145d(this.f63372a, c14918hi.f63372a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo3 = Boolean.valueOf(m87260c()).compareTo(Boolean.valueOf(c14918hi.m87260c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87260c() && (iM148146e7 = k3r0.m148146e(this.f63377b, c14918hi.f63377b)) != 0) {
            return iM148146e7;
        }
        int iCompareTo4 = Boolean.valueOf(m87262d()).compareTo(Boolean.valueOf(c14918hi.m87262d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87262d() && (iM148146e6 = k3r0.m148146e(this.f63378c, c14918hi.f63378c)) != 0) {
            return iM148146e6;
        }
        int iCompareTo5 = Boolean.valueOf(m87264e()).compareTo(Boolean.valueOf(c14918hi.m87264e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87264e() && (iM148146e5 = k3r0.m148146e(this.f63379d, c14918hi.f63379d)) != 0) {
            return iM148146e5;
        }
        int iCompareTo6 = Boolean.valueOf(m87266f()).compareTo(Boolean.valueOf(c14918hi.m87266f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87266f() && (iM148146e4 = k3r0.m148146e(this.f63380e, c14918hi.f63380e)) != 0) {
            return iM148146e4;
        }
        int iCompareTo7 = Boolean.valueOf(m87267g()).compareTo(Boolean.valueOf(c14918hi.m87267g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87267g() && (iM148146e3 = k3r0.m148146e(this.f63381f, c14918hi.f63381f)) != 0) {
            return iM148146e3;
        }
        int iCompareTo8 = Boolean.valueOf(m87268h()).compareTo(Boolean.valueOf(c14918hi.m87268h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87268h() && (iM148145d = k3r0.m148145d(this.f63371a, c14918hi.f63371a)) != 0) {
            return iM148145d;
        }
        int iCompareTo9 = Boolean.valueOf(m87269i()).compareTo(Boolean.valueOf(c14918hi.m87269i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87269i() && (iM148152k = k3r0.m148152k(this.f63376a, c14918hi.f63376a)) != 0) {
            return iM148152k;
        }
        int iCompareTo10 = Boolean.valueOf(m87270j()).compareTo(Boolean.valueOf(c14918hi.m87270j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m87270j() && (iM148149h = k3r0.m148149h(this.f63375a, c14918hi.f63375a)) != 0) {
            return iM148149h;
        }
        int iCompareTo11 = Boolean.valueOf(m87271k()).compareTo(Boolean.valueOf(c14918hi.m87271k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m87271k() && (iM148146e2 = k3r0.m148146e(this.f63382g, c14918hi.f63382g)) != 0) {
            return iM148146e2;
        }
        int iCompareTo12 = Boolean.valueOf(m87272l()).compareTo(Boolean.valueOf(c14918hi.m87272l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (!m87272l() || (iM148146e = k3r0.m148146e(this.f63383h, c14918hi.f63383h)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87253a();
        w3r0Var.mo87408v(f63359a);
        if (this.f63373a != null && m87255a()) {
            w3r0Var.mo87405s(f63358a);
            w3r0Var.mo87403q(this.f63373a);
            w3r0Var.mo87412z();
        }
        if (this.f63372a != null && m87258b()) {
            w3r0Var.mo87405s(f63360b);
            this.f63372a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63377b != null) {
            w3r0Var.mo87405s(f63361c);
            w3r0Var.mo87403q(this.f63377b);
            w3r0Var.mo87412z();
        }
        if (this.f63378c != null) {
            w3r0Var.mo87405s(f63362d);
            w3r0Var.mo87403q(this.f63378c);
            w3r0Var.mo87412z();
        }
        if (this.f63379d != null && m87264e()) {
            w3r0Var.mo87405s(f63363e);
            w3r0Var.mo87403q(this.f63379d);
            w3r0Var.mo87412z();
        }
        if (this.f63380e != null && m87266f()) {
            w3r0Var.mo87405s(f63364f);
            w3r0Var.mo87403q(this.f63380e);
            w3r0Var.mo87412z();
        }
        if (this.f63381f != null && m87267g()) {
            w3r0Var.mo87405s(f63365g);
            w3r0Var.mo87403q(this.f63381f);
            w3r0Var.mo87412z();
        }
        if (this.f63371a != null && m87268h()) {
            w3r0Var.mo87405s(f63366h);
            this.f63371a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (m87269i()) {
            w3r0Var.mo87405s(f63367i);
            w3r0Var.mo87410x(this.f63376a);
            w3r0Var.mo87412z();
        }
        if (this.f63375a != null && m87270j()) {
            w3r0Var.mo87405s(f63368j);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63375a.size()));
            for (Map.Entry<String, String> entry : this.f63375a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (this.f63382g != null && m87271k()) {
            w3r0Var.mo87405s(f63369k);
            w3r0Var.mo87403q(this.f63382g);
            w3r0Var.mo87412z();
        }
        if (this.f63383h != null && m87272l()) {
            w3r0Var.mo87405s(f63370l);
            w3r0Var.mo87403q(this.f63383h);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87260c() {
        return this.f63377b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87262d() {
        return this.f63378c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87264e() {
        return this.f63379d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14918hi)) {
            return m87256a((C14918hi) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87266f() {
        return this.f63380e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87267g() {
        return this.f63381f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87268h() {
        return this.f63371a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87269i() {
        return this.f63374a.get(0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m87270j() {
        return this.f63375a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m87271k() {
        return this.f63382g != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m87272l() {
        return this.f63383h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m87255a()) {
            sb.append("debug:");
            String str = this.f63373a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87258b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63372a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f63377b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63378c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m87264e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f63379d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87266f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f63380e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87267g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f63381f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87268h()) {
            sb.append(", ");
            sb.append("message:");
            C14900gr c14900gr = this.f63371a;
            if (c14900gr == null) {
                sb.append("null");
            } else {
                sb.append(c14900gr);
            }
        }
        if (m87269i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f63376a);
        }
        if (m87270j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f63375a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m87271k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63382g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m87272l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f63383h;
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
    public String m87259c() {
        return this.f63380e;
    }

    /* JADX INFO: renamed from: d */
    public String m87261d() {
        return this.f63381f;
    }

    /* JADX INFO: renamed from: e */
    public String m87263e() {
        return this.f63382g;
    }

    /* JADX INFO: renamed from: f */
    public String m87265f() {
        return this.f63383h;
    }

    /* JADX INFO: renamed from: b */
    public String m87257b() {
        return this.f63378c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87258b() {
        return this.f63372a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m87252a() {
        return this.f63377b;
    }

    /* JADX INFO: renamed from: a */
    public C14900gr m87251a() {
        return this.f63371a;
    }

    /* JADX INFO: renamed from: a */
    public void m87254a(boolean z) {
        this.f63374a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87256a(C14918hi c14918hi) {
        if (c14918hi == null) {
            return false;
        }
        boolean zM87255a = m87255a();
        boolean zM87255a2 = c14918hi.m87255a();
        if ((zM87255a || zM87255a2) && !(zM87255a && zM87255a2 && this.f63373a.equals(c14918hi.f63373a))) {
            return false;
        }
        boolean zM87258b = m87258b();
        boolean zM87258b2 = c14918hi.m87258b();
        if ((zM87258b || zM87258b2) && !(zM87258b && zM87258b2 && this.f63372a.m86941a(c14918hi.f63372a))) {
            return false;
        }
        boolean zM87260c = m87260c();
        boolean zM87260c2 = c14918hi.m87260c();
        if ((zM87260c || zM87260c2) && !(zM87260c && zM87260c2 && this.f63377b.equals(c14918hi.f63377b))) {
            return false;
        }
        boolean zM87262d = m87262d();
        boolean zM87262d2 = c14918hi.m87262d();
        if ((zM87262d || zM87262d2) && !(zM87262d && zM87262d2 && this.f63378c.equals(c14918hi.f63378c))) {
            return false;
        }
        boolean zM87264e = m87264e();
        boolean zM87264e2 = c14918hi.m87264e();
        if ((zM87264e || zM87264e2) && !(zM87264e && zM87264e2 && this.f63379d.equals(c14918hi.f63379d))) {
            return false;
        }
        boolean zM87266f = m87266f();
        boolean zM87266f2 = c14918hi.m87266f();
        if ((zM87266f || zM87266f2) && !(zM87266f && zM87266f2 && this.f63380e.equals(c14918hi.f63380e))) {
            return false;
        }
        boolean zM87267g = m87267g();
        boolean zM87267g2 = c14918hi.m87267g();
        if ((zM87267g || zM87267g2) && !(zM87267g && zM87267g2 && this.f63381f.equals(c14918hi.f63381f))) {
            return false;
        }
        boolean zM87268h = m87268h();
        boolean zM87268h2 = c14918hi.m87268h();
        if ((zM87268h || zM87268h2) && !(zM87268h && zM87268h2 && this.f63371a.m86869a(c14918hi.f63371a))) {
            return false;
        }
        boolean zM87269i = m87269i();
        boolean zM87269i2 = c14918hi.m87269i();
        if ((zM87269i || zM87269i2) && !(zM87269i && zM87269i2 && this.f63376a == c14918hi.f63376a)) {
            return false;
        }
        boolean zM87270j = m87270j();
        boolean zM87270j2 = c14918hi.m87270j();
        if ((zM87270j || zM87270j2) && !(zM87270j && zM87270j2 && this.f63375a.equals(c14918hi.f63375a))) {
            return false;
        }
        boolean zM87271k = m87271k();
        boolean zM87271k2 = c14918hi.m87271k();
        if ((zM87271k || zM87271k2) && !(zM87271k && zM87271k2 && this.f63382g.equals(c14918hi.f63382g))) {
            return false;
        }
        boolean zM87272l = m87272l();
        boolean zM87272l2 = c14918hi.m87272l();
        if (zM87272l || zM87272l2) {
            return zM87272l && zM87272l2 && this.f63383h.equals(c14918hi.f63383h);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87255a() {
        return this.f63373a != null;
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
                m87253a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63373a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63372a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63377b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63378c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63379d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63380e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63381f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14900gr c14900gr = new C14900gr();
                        this.f63371a = c14900gr;
                        c14900gr.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 2) {
                        this.f63376a = w3r0Var.mo87411y();
                        m87254a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f63375a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                            this.f63375a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f63382g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f63383h = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87253a() throws C14929ib {
        if (this.f63377b != null) {
            if (this.f63378c != null) {
                return;
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
