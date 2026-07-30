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

/* JADX INFO: renamed from: com.xiaomi.push.gw */
/* JADX INFO: loaded from: classes2.dex */
public class C14905gw implements InterfaceC14925hq<C14905gw, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public C14903gu f63113a;

    /* JADX INFO: renamed from: a */
    public String f63114a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63116a;

    /* JADX INFO: renamed from: b */
    public String f63117b;

    /* JADX INFO: renamed from: c */
    public String f63118c;

    /* JADX INFO: renamed from: d */
    public String f63119d;

    /* JADX INFO: renamed from: e */
    public String f63120e;

    /* JADX INFO: renamed from: f */
    public String f63121f;

    /* JADX INFO: renamed from: g */
    public String f63122g;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63102a = new z3r0("XmPushActionAckNotification");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63101a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63103b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63104c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63105d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63106e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63107f = new m3r0("", (byte) 10, 7);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63108g = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63109h = new m3r0("", HttpTokens.CARRIAGE_RETURN, 9);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63110i = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63111j = new m3r0("", (byte) 11, 11);

    /* JADX INFO: renamed from: a */
    private BitSet f63115a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public long f63112a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14905gw c14905gw) {
        int iM148146e;
        int iM148146e2;
        int iM148149h;
        int iM148146e3;
        int iM148144c;
        int iM148146e4;
        int iM148146e5;
        int iM148146e6;
        int iM148145d;
        int iM148146e7;
        if (!getClass().equals(c14905gw.getClass())) {
            return getClass().getName().compareTo(c14905gw.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86990a()).compareTo(Boolean.valueOf(c14905gw.m86990a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86990a() && (iM148146e7 = k3r0.m148146e(this.f63114a, c14905gw.f63114a)) != 0) {
            return iM148146e7;
        }
        int iCompareTo2 = Boolean.valueOf(m86994b()).compareTo(Boolean.valueOf(c14905gw.m86994b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86994b() && (iM148145d = k3r0.m148145d(this.f63113a, c14905gw.f63113a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m86996c()).compareTo(Boolean.valueOf(c14905gw.m86996c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86996c() && (iM148146e6 = k3r0.m148146e(this.f63117b, c14905gw.f63117b)) != 0) {
            return iM148146e6;
        }
        int iCompareTo4 = Boolean.valueOf(m86998d()).compareTo(Boolean.valueOf(c14905gw.m86998d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86998d() && (iM148146e5 = k3r0.m148146e(this.f63118c, c14905gw.f63118c)) != 0) {
            return iM148146e5;
        }
        int iCompareTo5 = Boolean.valueOf(m87000e()).compareTo(Boolean.valueOf(c14905gw.m87000e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87000e() && (iM148146e4 = k3r0.m148146e(this.f63119d, c14905gw.f63119d)) != 0) {
            return iM148146e4;
        }
        int iCompareTo6 = Boolean.valueOf(m87001f()).compareTo(Boolean.valueOf(c14905gw.m87001f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87001f() && (iM148144c = k3r0.m148144c(this.f63112a, c14905gw.f63112a)) != 0) {
            return iM148144c;
        }
        int iCompareTo7 = Boolean.valueOf(m87002g()).compareTo(Boolean.valueOf(c14905gw.m87002g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87002g() && (iM148146e3 = k3r0.m148146e(this.f63120e, c14905gw.f63120e)) != 0) {
            return iM148146e3;
        }
        int iCompareTo8 = Boolean.valueOf(m87003h()).compareTo(Boolean.valueOf(c14905gw.m87003h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87003h() && (iM148149h = k3r0.m148149h(this.f63116a, c14905gw.f63116a)) != 0) {
            return iM148149h;
        }
        int iCompareTo9 = Boolean.valueOf(m87004i()).compareTo(Boolean.valueOf(c14905gw.m87004i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87004i() && (iM148146e2 = k3r0.m148146e(this.f63121f, c14905gw.f63121f)) != 0) {
            return iM148146e2;
        }
        int iCompareTo10 = Boolean.valueOf(m87005j()).compareTo(Boolean.valueOf(c14905gw.m87005j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m87005j() || (iM148146e = k3r0.m148146e(this.f63122g, c14905gw.f63122g)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86988a();
        w3r0Var.mo87408v(f63102a);
        if (this.f63114a != null && m86990a()) {
            w3r0Var.mo87405s(f63101a);
            w3r0Var.mo87403q(this.f63114a);
            w3r0Var.mo87412z();
        }
        if (this.f63113a != null && m86994b()) {
            w3r0Var.mo87405s(f63103b);
            this.f63113a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63117b != null) {
            w3r0Var.mo87405s(f63104c);
            w3r0Var.mo87403q(this.f63117b);
            w3r0Var.mo87412z();
        }
        if (this.f63118c != null && m86998d()) {
            w3r0Var.mo87405s(f63105d);
            w3r0Var.mo87403q(this.f63118c);
            w3r0Var.mo87412z();
        }
        if (this.f63119d != null && m87000e()) {
            w3r0Var.mo87405s(f63106e);
            w3r0Var.mo87403q(this.f63119d);
            w3r0Var.mo87412z();
        }
        if (m87001f()) {
            w3r0Var.mo87405s(f63107f);
            w3r0Var.mo87402p(this.f63112a);
            w3r0Var.mo87412z();
        }
        if (this.f63120e != null && m87002g()) {
            w3r0Var.mo87405s(f63108g);
            w3r0Var.mo87403q(this.f63120e);
            w3r0Var.mo87412z();
        }
        if (this.f63116a != null && m87003h()) {
            w3r0Var.mo87405s(f63109h);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63116a.size()));
            for (Map.Entry<String, String> entry : this.f63116a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (this.f63121f != null && m87004i()) {
            w3r0Var.mo87405s(f63110i);
            w3r0Var.mo87403q(this.f63121f);
            w3r0Var.mo87412z();
        }
        if (this.f63122g != null && m87005j()) {
            w3r0Var.mo87405s(f63111j);
            w3r0Var.mo87403q(this.f63122g);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86996c() {
        return this.f63117b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86998d() {
        return this.f63118c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87000e() {
        return this.f63119d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14905gw)) {
            return m86991a((C14905gw) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87001f() {
        return this.f63115a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m87002g() {
        return this.f63120e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87003h() {
        return this.f63116a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87004i() {
        return this.f63121f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m87005j() {
        return this.f63122g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m86990a()) {
            sb.append("debug:");
            String str = this.f63114a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86994b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63113a;
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
        String str2 = this.f63117b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m86998d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f63118c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m87000e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f63119d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87001f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f63112a);
        }
        if (m87002g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f63120e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87003h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f63116a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m87004i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f63121f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87005j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63122g;
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
    public C14905gw m86995c(String str) {
        this.f63119d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14905gw m86997d(String str) {
        this.f63120e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14905gw m86999e(String str) {
        this.f63121f = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14905gw m86992b(String str) {
        this.f63118c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m86993b() {
        return this.f63119d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86994b() {
        return this.f63113a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14905gw m86984a(C14903gu c14903gu) {
        this.f63113a = c14903gu;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m86986a() {
        return this.f63117b;
    }

    /* JADX INFO: renamed from: a */
    public C14905gw m86985a(String str) {
        this.f63117b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14905gw m86983a(long j) {
        this.f63112a = j;
        m86989a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m86989a(boolean z) {
        this.f63115a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m86987a() {
        return this.f63116a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86991a(C14905gw c14905gw) {
        if (c14905gw == null) {
            return false;
        }
        boolean zM86990a = m86990a();
        boolean zM86990a2 = c14905gw.m86990a();
        if ((zM86990a || zM86990a2) && !(zM86990a && zM86990a2 && this.f63114a.equals(c14905gw.f63114a))) {
            return false;
        }
        boolean zM86994b = m86994b();
        boolean zM86994b2 = c14905gw.m86994b();
        if ((zM86994b || zM86994b2) && !(zM86994b && zM86994b2 && this.f63113a.m86941a(c14905gw.f63113a))) {
            return false;
        }
        boolean zM86996c = m86996c();
        boolean zM86996c2 = c14905gw.m86996c();
        if ((zM86996c || zM86996c2) && !(zM86996c && zM86996c2 && this.f63117b.equals(c14905gw.f63117b))) {
            return false;
        }
        boolean zM86998d = m86998d();
        boolean zM86998d2 = c14905gw.m86998d();
        if ((zM86998d || zM86998d2) && !(zM86998d && zM86998d2 && this.f63118c.equals(c14905gw.f63118c))) {
            return false;
        }
        boolean zM87000e = m87000e();
        boolean zM87000e2 = c14905gw.m87000e();
        if ((zM87000e || zM87000e2) && !(zM87000e && zM87000e2 && this.f63119d.equals(c14905gw.f63119d))) {
            return false;
        }
        boolean zM87001f = m87001f();
        boolean zM87001f2 = c14905gw.m87001f();
        if ((zM87001f || zM87001f2) && !(zM87001f && zM87001f2 && this.f63112a == c14905gw.f63112a)) {
            return false;
        }
        boolean zM87002g = m87002g();
        boolean zM87002g2 = c14905gw.m87002g();
        if ((zM87002g || zM87002g2) && !(zM87002g && zM87002g2 && this.f63120e.equals(c14905gw.f63120e))) {
            return false;
        }
        boolean zM87003h = m87003h();
        boolean zM87003h2 = c14905gw.m87003h();
        if ((zM87003h || zM87003h2) && !(zM87003h && zM87003h2 && this.f63116a.equals(c14905gw.f63116a))) {
            return false;
        }
        boolean zM87004i = m87004i();
        boolean zM87004i2 = c14905gw.m87004i();
        if ((zM87004i || zM87004i2) && !(zM87004i && zM87004i2 && this.f63121f.equals(c14905gw.f63121f))) {
            return false;
        }
        boolean zM87005j = m87005j();
        boolean zM87005j2 = c14905gw.m87005j();
        if (zM87005j || zM87005j2) {
            return zM87005j && zM87005j2 && this.f63122g.equals(c14905gw.f63122g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86990a() {
        return this.f63114a != null;
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
                m86988a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63114a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63113a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63117b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63118c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63119d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 7:
                    if (b == 10) {
                        this.f63112a = w3r0Var.mo87390d();
                        m86989a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63120e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f63116a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                            this.f63116a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63121f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f63122g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86988a() throws C14929ib {
        if (this.f63117b != null) {
            return;
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
