package com.xiaomi.push;

import com.xiaomi.push.service.C14987aj;
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

/* JADX INFO: renamed from: com.xiaomi.push.gs */
/* JADX INFO: loaded from: classes2.dex */
public class C14901gs implements InterfaceC14925hq<C14901gs, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f63026a;

    /* JADX INFO: renamed from: a */
    public long f63027a;

    /* JADX INFO: renamed from: a */
    public String f63028a;

    /* JADX INFO: renamed from: a */
    private BitSet f63029a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63030a;

    /* JADX INFO: renamed from: a */
    public boolean f63031a;

    /* JADX INFO: renamed from: b */
    public int f63032b;

    /* JADX INFO: renamed from: b */
    public String f63033b;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f63034b;

    /* JADX INFO: renamed from: c */
    public int f63035c;

    /* JADX INFO: renamed from: c */
    public String f63036c;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f63037c;

    /* JADX INFO: renamed from: d */
    public String f63038d;

    /* JADX INFO: renamed from: e */
    public String f63039e;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63013a = new z3r0("PushMetaInfo");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63012a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63014b = new m3r0("", (byte) 10, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63015c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63016d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63017e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63018f = new m3r0("", (byte) 8, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63019g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63020h = new m3r0("", (byte) 8, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63021i = new m3r0("", (byte) 8, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63022j = new m3r0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63023k = new m3r0("", HttpTokens.CARRIAGE_RETURN, 11);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63024l = new m3r0("", (byte) 2, 12);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f63025m = new m3r0("", HttpTokens.CARRIAGE_RETURN, 13);

    public C14901gs(C14901gs c14901gs) {
        BitSet bitSet = new BitSet(5);
        this.f63029a = bitSet;
        bitSet.clear();
        this.f63029a.or(c14901gs.f63029a);
        if (c14901gs.m86904a()) {
            this.f63028a = c14901gs.f63028a;
        }
        this.f63027a = c14901gs.f63027a;
        if (c14901gs.m86919c()) {
            this.f63033b = c14901gs.f63033b;
        }
        if (c14901gs.m86923d()) {
            this.f63036c = c14901gs.f63036c;
        }
        if (c14901gs.m86925e()) {
            this.f63038d = c14901gs.f63038d;
        }
        this.f63026a = c14901gs.f63026a;
        if (c14901gs.m86927g()) {
            this.f63039e = c14901gs.f63039e;
        }
        this.f63032b = c14901gs.f63032b;
        this.f63035c = c14901gs.f63035c;
        if (c14901gs.m86930j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : c14901gs.f63030a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f63030a = map;
        }
        if (c14901gs.m86931k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : c14901gs.f63034b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f63034b = map2;
        }
        this.f63031a = c14901gs.f63031a;
        if (c14901gs.m86934n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : c14901gs.f63037c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f63037c = map3;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14901gs c14901gs) {
        int iM148149h;
        int iM148152k;
        int iM148149h2;
        int iM148149h3;
        int iM148143b;
        int iM148143b2;
        int iM148146e;
        int iM148143b3;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148144c;
        int iM148146e5;
        if (!getClass().equals(c14901gs.getClass())) {
            return getClass().getName().compareTo(c14901gs.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86904a()).compareTo(Boolean.valueOf(c14901gs.m86904a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86904a() && (iM148146e5 = k3r0.m148146e(this.f63028a, c14901gs.f63028a)) != 0) {
            return iM148146e5;
        }
        int iCompareTo2 = Boolean.valueOf(m86913b()).compareTo(Boolean.valueOf(c14901gs.m86913b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86913b() && (iM148144c = k3r0.m148144c(this.f63027a, c14901gs.f63027a)) != 0) {
            return iM148144c;
        }
        int iCompareTo3 = Boolean.valueOf(m86919c()).compareTo(Boolean.valueOf(c14901gs.m86919c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86919c() && (iM148146e4 = k3r0.m148146e(this.f63033b, c14901gs.f63033b)) != 0) {
            return iM148146e4;
        }
        int iCompareTo4 = Boolean.valueOf(m86923d()).compareTo(Boolean.valueOf(c14901gs.m86923d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86923d() && (iM148146e3 = k3r0.m148146e(this.f63036c, c14901gs.f63036c)) != 0) {
            return iM148146e3;
        }
        int iCompareTo5 = Boolean.valueOf(m86925e()).compareTo(Boolean.valueOf(c14901gs.m86925e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86925e() && (iM148146e2 = k3r0.m148146e(this.f63038d, c14901gs.f63038d)) != 0) {
            return iM148146e2;
        }
        int iCompareTo6 = Boolean.valueOf(m86926f()).compareTo(Boolean.valueOf(c14901gs.m86926f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86926f() && (iM148143b3 = k3r0.m148143b(this.f63026a, c14901gs.f63026a)) != 0) {
            return iM148143b3;
        }
        int iCompareTo7 = Boolean.valueOf(m86927g()).compareTo(Boolean.valueOf(c14901gs.m86927g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86927g() && (iM148146e = k3r0.m148146e(this.f63039e, c14901gs.f63039e)) != 0) {
            return iM148146e;
        }
        int iCompareTo8 = Boolean.valueOf(m86928h()).compareTo(Boolean.valueOf(c14901gs.m86928h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86928h() && (iM148143b2 = k3r0.m148143b(this.f63032b, c14901gs.f63032b)) != 0) {
            return iM148143b2;
        }
        int iCompareTo9 = Boolean.valueOf(m86929i()).compareTo(Boolean.valueOf(c14901gs.m86929i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86929i() && (iM148143b = k3r0.m148143b(this.f63035c, c14901gs.f63035c)) != 0) {
            return iM148143b;
        }
        int iCompareTo10 = Boolean.valueOf(m86930j()).compareTo(Boolean.valueOf(c14901gs.m86930j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86930j() && (iM148149h3 = k3r0.m148149h(this.f63030a, c14901gs.f63030a)) != 0) {
            return iM148149h3;
        }
        int iCompareTo11 = Boolean.valueOf(m86931k()).compareTo(Boolean.valueOf(c14901gs.m86931k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86931k() && (iM148149h2 = k3r0.m148149h(this.f63034b, c14901gs.f63034b)) != 0) {
            return iM148149h2;
        }
        int iCompareTo12 = Boolean.valueOf(m86933m()).compareTo(Boolean.valueOf(c14901gs.m86933m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m86933m() && (iM148152k = k3r0.m148152k(this.f63031a, c14901gs.f63031a)) != 0) {
            return iM148152k;
        }
        int iCompareTo13 = Boolean.valueOf(m86934n()).compareTo(Boolean.valueOf(c14901gs.m86934n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!m86934n() || (iM148149h = k3r0.m148149h(this.f63037c, c14901gs.f63037c)) == 0) {
            return 0;
        }
        return iM148149h;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86901a();
        w3r0Var.mo87408v(f63013a);
        if (this.f63028a != null) {
            w3r0Var.mo87405s(f63012a);
            w3r0Var.mo87403q(this.f63028a);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63014b);
        w3r0Var.mo87402p(this.f63027a);
        w3r0Var.mo87412z();
        if (this.f63033b != null && m86919c()) {
            w3r0Var.mo87405s(f63015c);
            w3r0Var.mo87403q(this.f63033b);
            w3r0Var.mo87412z();
        }
        if (this.f63036c != null && m86923d()) {
            w3r0Var.mo87405s(f63016d);
            w3r0Var.mo87403q(this.f63036c);
            w3r0Var.mo87412z();
        }
        if (this.f63038d != null && m86925e()) {
            w3r0Var.mo87405s(f63017e);
            w3r0Var.mo87403q(this.f63038d);
            w3r0Var.mo87412z();
        }
        if (m86926f()) {
            w3r0Var.mo87405s(f63018f);
            w3r0Var.mo87401o(this.f63026a);
            w3r0Var.mo87412z();
        }
        if (this.f63039e != null && m86927g()) {
            w3r0Var.mo87405s(f63019g);
            w3r0Var.mo87403q(this.f63039e);
            w3r0Var.mo87412z();
        }
        if (m86928h()) {
            w3r0Var.mo87405s(f63020h);
            w3r0Var.mo87401o(this.f63032b);
            w3r0Var.mo87412z();
        }
        if (m86929i()) {
            w3r0Var.mo87405s(f63021i);
            w3r0Var.mo87401o(this.f63035c);
            w3r0Var.mo87412z();
        }
        if (this.f63030a != null && m86930j()) {
            w3r0Var.mo87405s(f63022j);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63030a.size()));
            for (Map.Entry<String, String> entry : this.f63030a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (this.f63034b != null && m86931k()) {
            w3r0Var.mo87405s(f63023k);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63034b.size()));
            for (Map.Entry<String, String> entry2 : this.f63034b.entrySet()) {
                w3r0Var.mo87403q(entry2.getKey());
                w3r0Var.mo87403q(entry2.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (m86933m()) {
            w3r0Var.mo87405s(f63024l);
            w3r0Var.mo87410x(this.f63031a);
            w3r0Var.mo87412z();
        }
        if (this.f63037c != null && m86934n()) {
            w3r0Var.mo87405s(f63025m);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63037c.size()));
            for (Map.Entry<String, String> entry3 : this.f63037c.entrySet()) {
                w3r0Var.mo87403q(entry3.getKey());
                w3r0Var.mo87403q(entry3.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86919c() {
        return this.f63033b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86923d() {
        return this.f63036c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86925e() {
        return this.f63038d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14901gs)) {
            return m86905a((C14901gs) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86926f() {
        return this.f63029a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m86927g() {
        return this.f63039e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86928h() {
        return this.f63029a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86929i() {
        return this.f63029a.get(3);
    }

    /* JADX INFO: renamed from: j */
    public boolean m86930j() {
        return this.f63030a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86931k() {
        return this.f63034b != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86932l() {
        return this.f63031a;
    }

    /* JADX INFO: renamed from: m */
    public boolean m86933m() {
        return this.f63029a.get(4);
    }

    /* JADX INFO: renamed from: n */
    public boolean m86934n() {
        return this.f63037c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(id:");
        String str = this.f63028a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(C14987aj.m87667a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f63027a);
        if (m86919c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f63033b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m86923d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f63036c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m86925e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f63038d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86926f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f63026a);
        }
        if (m86927g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f63039e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86928h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f63032b);
        }
        if (m86929i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f63035c);
        }
        if (m86930j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f63030a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m86931k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f63034b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m86933m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f63031a);
        }
        if (m86934n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f63037c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m86917c() {
        return this.f63036c;
    }

    /* JADX INFO: renamed from: d */
    public String m86921d() {
        return this.f63038d;
    }

    /* JADX INFO: renamed from: e */
    public void m86924e(boolean z) {
        this.f63029a.set(4, z);
    }

    /* JADX INFO: renamed from: c */
    public C14901gs m86916c(String str) {
        this.f63036c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14901gs m86920d(String str) {
        this.f63038d = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m86918c(boolean z) {
        this.f63029a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m86922d(boolean z) {
        this.f63029a.set(3, z);
    }

    /* JADX INFO: renamed from: c */
    public int m86914c() {
        return this.f63035c;
    }

    /* JADX INFO: renamed from: c */
    public C14901gs m86915c(int i) {
        this.f63035c = i;
        m86922d(true);
        return this;
    }

    public C14901gs() {
        this.f63029a = new BitSet(5);
        this.f63031a = false;
    }

    /* JADX INFO: renamed from: b */
    public String m86909b() {
        return this.f63033b;
    }

    /* JADX INFO: renamed from: b */
    public C14901gs m86908b(String str) {
        this.f63033b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m86912b(boolean z) {
        this.f63029a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public int m86906b() {
        return this.f63032b;
    }

    /* JADX INFO: renamed from: b */
    public C14901gs m86907b(int i) {
        this.f63032b = i;
        m86918c(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m86911b(String str, String str2) {
        if (this.f63034b == null) {
            this.f63034b = new HashMap();
        }
        this.f63034b.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m86910b() {
        return this.f63034b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86913b() {
        return this.f63029a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public String m86899a() {
        return this.f63028a;
    }

    /* JADX INFO: renamed from: a */
    public C14901gs m86897a(String str) {
        this.f63028a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86904a() {
        return this.f63028a != null;
    }

    /* JADX INFO: renamed from: a */
    public long m86894a() {
        return this.f63027a;
    }

    /* JADX INFO: renamed from: a */
    public void m86903a(boolean z) {
        this.f63029a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public int m86892a() {
        return this.f63026a;
    }

    /* JADX INFO: renamed from: a */
    public C14901gs m86896a(int i) {
        this.f63026a = i;
        m86912b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m86902a(String str, String str2) {
        if (this.f63030a == null) {
            this.f63030a = new HashMap();
        }
        this.f63030a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m86900a() {
        return this.f63030a;
    }

    /* JADX INFO: renamed from: a */
    public C14901gs m86898a(Map<String, String> map) {
        this.f63030a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86905a(C14901gs c14901gs) {
        if (c14901gs == null) {
            return false;
        }
        boolean zM86904a = m86904a();
        boolean zM86904a2 = c14901gs.m86904a();
        if (((zM86904a || zM86904a2) && !(zM86904a && zM86904a2 && this.f63028a.equals(c14901gs.f63028a))) || this.f63027a != c14901gs.f63027a) {
            return false;
        }
        boolean zM86919c = m86919c();
        boolean zM86919c2 = c14901gs.m86919c();
        if ((zM86919c || zM86919c2) && !(zM86919c && zM86919c2 && this.f63033b.equals(c14901gs.f63033b))) {
            return false;
        }
        boolean zM86923d = m86923d();
        boolean zM86923d2 = c14901gs.m86923d();
        if ((zM86923d || zM86923d2) && !(zM86923d && zM86923d2 && this.f63036c.equals(c14901gs.f63036c))) {
            return false;
        }
        boolean zM86925e = m86925e();
        boolean zM86925e2 = c14901gs.m86925e();
        if ((zM86925e || zM86925e2) && !(zM86925e && zM86925e2 && this.f63038d.equals(c14901gs.f63038d))) {
            return false;
        }
        boolean zM86926f = m86926f();
        boolean zM86926f2 = c14901gs.m86926f();
        if ((zM86926f || zM86926f2) && !(zM86926f && zM86926f2 && this.f63026a == c14901gs.f63026a)) {
            return false;
        }
        boolean zM86927g = m86927g();
        boolean zM86927g2 = c14901gs.m86927g();
        if ((zM86927g || zM86927g2) && !(zM86927g && zM86927g2 && this.f63039e.equals(c14901gs.f63039e))) {
            return false;
        }
        boolean zM86928h = m86928h();
        boolean zM86928h2 = c14901gs.m86928h();
        if ((zM86928h || zM86928h2) && !(zM86928h && zM86928h2 && this.f63032b == c14901gs.f63032b)) {
            return false;
        }
        boolean zM86929i = m86929i();
        boolean zM86929i2 = c14901gs.m86929i();
        if ((zM86929i || zM86929i2) && !(zM86929i && zM86929i2 && this.f63035c == c14901gs.f63035c)) {
            return false;
        }
        boolean zM86930j = m86930j();
        boolean zM86930j2 = c14901gs.m86930j();
        if ((zM86930j || zM86930j2) && !(zM86930j && zM86930j2 && this.f63030a.equals(c14901gs.f63030a))) {
            return false;
        }
        boolean zM86931k = m86931k();
        boolean zM86931k2 = c14901gs.m86931k();
        if ((zM86931k || zM86931k2) && !(zM86931k && zM86931k2 && this.f63034b.equals(c14901gs.f63034b))) {
            return false;
        }
        boolean zM86933m = m86933m();
        boolean zM86933m2 = c14901gs.m86933m();
        if ((zM86933m || zM86933m2) && !(zM86933m && zM86933m2 && this.f63031a == c14901gs.f63031a)) {
            return false;
        }
        boolean zM86934n = m86934n();
        boolean zM86934n2 = c14901gs.m86934n();
        if (zM86934n || zM86934n2) {
            return zM86934n && zM86934n2 && this.f63037c.equals(c14901gs.f63037c);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14901gs m86895a() {
        return new C14901gs(this);
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
                if (m86913b()) {
                    m86901a();
                    return;
                }
                throw new C14929ib("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i = 0;
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63028a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 10) {
                        this.f63027a = w3r0Var.mo87390d();
                        m86903a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63033b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63036c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63038d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 8) {
                        this.f63026a = w3r0Var.mo87389c();
                        m86912b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63039e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 8) {
                        this.f63032b = w3r0Var.mo87389c();
                        m86918c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 8) {
                        this.f63035c = w3r0Var.mo87389c();
                        m86922d(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f63030a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        while (i < o3r0VarMo87395i.f144851c) {
                            this.f63030a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                            i++;
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i2 = w3r0Var.mo87395i();
                        this.f63034b = new HashMap(o3r0VarMo87395i2.f144851c * 2);
                        while (i < o3r0VarMo87395i2.f144851c) {
                            this.f63034b.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                            i++;
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 2) {
                        this.f63031a = w3r0Var.mo87411y();
                        m86924e(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i3 = w3r0Var.mo87395i();
                        this.f63037c = new HashMap(o3r0VarMo87395i3.f144851c * 2);
                        while (i < o3r0VarMo87395i3.f144851c) {
                            this.f63037c.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                            i++;
                        }
                        w3r0Var.mo87381F();
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
    public void m86901a() throws C14929ib {
        if (this.f63028a != null) {
            return;
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
