package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p153l.i3r0;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.ha */
/* JADX INFO: loaded from: classes2.dex */
public class C14910ha implements InterfaceC14925hq<C14910ha, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f63173a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63174a;

    /* JADX INFO: renamed from: a */
    public String f63175a;

    /* JADX INFO: renamed from: a */
    public List<String> f63177a;

    /* JADX INFO: renamed from: b */
    public String f63179b;

    /* JADX INFO: renamed from: c */
    public String f63180c;

    /* JADX INFO: renamed from: d */
    public String f63181d;

    /* JADX INFO: renamed from: e */
    public String f63182e;

    /* JADX INFO: renamed from: f */
    public String f63183f;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63163a = new z3r0("XmPushActionCommandResult");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63162a = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63164b = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63165c = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63166d = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63167e = new m3r0("", (byte) 10, 7);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63168f = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63169g = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63170h = new m3r0("", (byte) 15, 10);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63171i = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63172j = new m3r0("", (byte) 2, 13);

    /* JADX INFO: renamed from: a */
    private BitSet f63176a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f63178a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14910ha c14910ha) {
        int iM148152k;
        int iM148146e;
        int iM148148g;
        int iM148146e2;
        int iM148146e3;
        int iM148144c;
        int iM148146e4;
        int iM148146e5;
        int iM148146e6;
        int iM148145d;
        if (!getClass().equals(c14910ha.getClass())) {
            return getClass().getName().compareTo(c14910ha.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87061a()).compareTo(Boolean.valueOf(c14910ha.m87061a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87061a() && (iM148145d = k3r0.m148145d(this.f63174a, c14910ha.f63174a)) != 0) {
            return iM148145d;
        }
        int iCompareTo2 = Boolean.valueOf(m87065b()).compareTo(Boolean.valueOf(c14910ha.m87065b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87065b() && (iM148146e6 = k3r0.m148146e(this.f63175a, c14910ha.f63175a)) != 0) {
            return iM148146e6;
        }
        int iCompareTo3 = Boolean.valueOf(m87067c()).compareTo(Boolean.valueOf(c14910ha.m87067c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87067c() && (iM148146e5 = k3r0.m148146e(this.f63179b, c14910ha.f63179b)) != 0) {
            return iM148146e5;
        }
        int iCompareTo4 = Boolean.valueOf(m87068d()).compareTo(Boolean.valueOf(c14910ha.m87068d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87068d() && (iM148146e4 = k3r0.m148146e(this.f63180c, c14910ha.f63180c)) != 0) {
            return iM148146e4;
        }
        int iCompareTo5 = Boolean.valueOf(m87069e()).compareTo(Boolean.valueOf(c14910ha.m87069e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87069e() && (iM148144c = k3r0.m148144c(this.f63173a, c14910ha.f63173a)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m87070f()).compareTo(Boolean.valueOf(c14910ha.m87070f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87070f() && (iM148146e3 = k3r0.m148146e(this.f63181d, c14910ha.f63181d)) != 0) {
            return iM148146e3;
        }
        int iCompareTo7 = Boolean.valueOf(m87071g()).compareTo(Boolean.valueOf(c14910ha.m87071g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87071g() && (iM148146e2 = k3r0.m148146e(this.f63182e, c14910ha.f63182e)) != 0) {
            return iM148146e2;
        }
        int iCompareTo8 = Boolean.valueOf(m87072h()).compareTo(Boolean.valueOf(c14910ha.m87072h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87072h() && (iM148148g = k3r0.m148148g(this.f63177a, c14910ha.f63177a)) != 0) {
            return iM148148g;
        }
        int iCompareTo9 = Boolean.valueOf(m87073i()).compareTo(Boolean.valueOf(c14910ha.m87073i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87073i() && (iM148146e = k3r0.m148146e(this.f63183f, c14910ha.f63183f)) != 0) {
            return iM148146e;
        }
        int iCompareTo10 = Boolean.valueOf(m87074j()).compareTo(Boolean.valueOf(c14910ha.m87074j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m87074j() || (iM148152k = k3r0.m148152k(this.f63178a, c14910ha.f63178a)) == 0) {
            return 0;
        }
        return iM148152k;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87059a();
        w3r0Var.mo87408v(f63163a);
        if (this.f63174a != null && m87061a()) {
            w3r0Var.mo87405s(f63162a);
            this.f63174a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63175a != null) {
            w3r0Var.mo87405s(f63164b);
            w3r0Var.mo87403q(this.f63175a);
            w3r0Var.mo87412z();
        }
        if (this.f63179b != null) {
            w3r0Var.mo87405s(f63165c);
            w3r0Var.mo87403q(this.f63179b);
            w3r0Var.mo87412z();
        }
        if (this.f63180c != null) {
            w3r0Var.mo87405s(f63166d);
            w3r0Var.mo87403q(this.f63180c);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63167e);
        w3r0Var.mo87402p(this.f63173a);
        w3r0Var.mo87412z();
        if (this.f63181d != null && m87070f()) {
            w3r0Var.mo87405s(f63168f);
            w3r0Var.mo87403q(this.f63181d);
            w3r0Var.mo87412z();
        }
        if (this.f63182e != null && m87071g()) {
            w3r0Var.mo87405s(f63169g);
            w3r0Var.mo87403q(this.f63182e);
            w3r0Var.mo87412z();
        }
        if (this.f63177a != null && m87072h()) {
            w3r0Var.mo87405s(f63170h);
            w3r0Var.mo87406t(new n3r0((byte) 11, this.f63177a.size()));
            Iterator<String> it = this.f63177a.iterator();
            while (it.hasNext()) {
                w3r0Var.mo87403q(it.next());
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        if (this.f63183f != null && m87073i()) {
            w3r0Var.mo87405s(f63171i);
            w3r0Var.mo87403q(this.f63183f);
            w3r0Var.mo87412z();
        }
        if (m87074j()) {
            w3r0Var.mo87405s(f63172j);
            w3r0Var.mo87410x(this.f63178a);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87067c() {
        return this.f63179b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87068d() {
        return this.f63180c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87069e() {
        return this.f63176a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14910ha)) {
            return m87062a((C14910ha) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87070f() {
        return this.f63181d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87071g() {
        return this.f63182e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87072h() {
        return this.f63177a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87073i() {
        return this.f63183f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m87074j() {
        return this.f63176a.get(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m87061a()) {
            sb.append("target:");
            C14903gu c14903gu = this.f63174a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f63175a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f63179b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f63180c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f63173a);
        if (m87070f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f63181d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87071g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f63182e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87072h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f63177a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m87073i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f63183f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87074j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f63178a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m87066c() {
        return this.f63183f;
    }

    /* JADX INFO: renamed from: b */
    public String m87063b() {
        return this.f63180c;
    }

    /* JADX INFO: renamed from: b */
    public void m87064b(boolean z) {
        this.f63176a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m87065b() {
        return this.f63175a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m87057a() {
        return this.f63175a;
    }

    /* JADX INFO: renamed from: a */
    public void m87060a(boolean z) {
        this.f63176a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m87058a() {
        return this.f63177a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87062a(C14910ha c14910ha) {
        if (c14910ha == null) {
            return false;
        }
        boolean zM87061a = m87061a();
        boolean zM87061a2 = c14910ha.m87061a();
        if ((zM87061a || zM87061a2) && !(zM87061a && zM87061a2 && this.f63174a.m86941a(c14910ha.f63174a))) {
            return false;
        }
        boolean zM87065b = m87065b();
        boolean zM87065b2 = c14910ha.m87065b();
        if ((zM87065b || zM87065b2) && !(zM87065b && zM87065b2 && this.f63175a.equals(c14910ha.f63175a))) {
            return false;
        }
        boolean zM87067c = m87067c();
        boolean zM87067c2 = c14910ha.m87067c();
        if ((zM87067c || zM87067c2) && !(zM87067c && zM87067c2 && this.f63179b.equals(c14910ha.f63179b))) {
            return false;
        }
        boolean zM87068d = m87068d();
        boolean zM87068d2 = c14910ha.m87068d();
        if (((zM87068d || zM87068d2) && !(zM87068d && zM87068d2 && this.f63180c.equals(c14910ha.f63180c))) || this.f63173a != c14910ha.f63173a) {
            return false;
        }
        boolean zM87070f = m87070f();
        boolean zM87070f2 = c14910ha.m87070f();
        if ((zM87070f || zM87070f2) && !(zM87070f && zM87070f2 && this.f63181d.equals(c14910ha.f63181d))) {
            return false;
        }
        boolean zM87071g = m87071g();
        boolean zM87071g2 = c14910ha.m87071g();
        if ((zM87071g || zM87071g2) && !(zM87071g && zM87071g2 && this.f63182e.equals(c14910ha.f63182e))) {
            return false;
        }
        boolean zM87072h = m87072h();
        boolean zM87072h2 = c14910ha.m87072h();
        if ((zM87072h || zM87072h2) && !(zM87072h && zM87072h2 && this.f63177a.equals(c14910ha.f63177a))) {
            return false;
        }
        boolean zM87073i = m87073i();
        boolean zM87073i2 = c14910ha.m87073i();
        if ((zM87073i || zM87073i2) && !(zM87073i && zM87073i2 && this.f63183f.equals(c14910ha.f63183f))) {
            return false;
        }
        boolean zM87074j = m87074j();
        boolean zM87074j2 = c14910ha.m87074j();
        if (zM87074j || zM87074j2) {
            return zM87074j && zM87074j2 && this.f63178a == c14910ha.f63178a;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87061a() {
        return this.f63174a != null;
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
                if (m87069e()) {
                    m87059a();
                    return;
                } else {
                    i3r0.m138338a("Required field 'errorCode' was not found in serialized data! Struct: ", this);
                    return;
                }
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63174a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63175a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63179b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63180c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                case 11:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 7:
                    if (b == 10) {
                        this.f63173a = w3r0Var.mo87390d();
                        m87060a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63181d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63182e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f63177a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            this.f63177a.add(w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87382G();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f63183f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 2) {
                        this.f63178a = w3r0Var.mo87411y();
                        m87064b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87059a() throws C14929ib {
        if (this.f63175a != null) {
            if (this.f63179b != null) {
                if (this.f63180c != null) {
                    return;
                }
                i3r0.m138338a("Required field 'cmdName' was not present! Struct: ", this);
                return;
            }
            i3r0.m138338a("Required field 'appId' was not present! Struct: ", this);
            return;
        }
        i3r0.m138338a("Required field 'id' was not present! Struct: ", this);
    }
}
