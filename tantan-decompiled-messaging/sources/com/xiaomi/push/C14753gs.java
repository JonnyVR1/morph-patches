package com.xiaomi.push;

import com.xiaomi.push.service.C14839aj;
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

/* JADX INFO: renamed from: com.xiaomi.push.gs */
/* JADX INFO: loaded from: classes2.dex */
public class C14753gs implements InterfaceC14777hq<C14753gs, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62179a;

    /* JADX INFO: renamed from: a */
    public long f62180a;

    /* JADX INFO: renamed from: a */
    public String f62181a;

    /* JADX INFO: renamed from: a */
    private BitSet f62182a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62183a;

    /* JADX INFO: renamed from: a */
    public boolean f62184a;

    /* JADX INFO: renamed from: b */
    public int f62185b;

    /* JADX INFO: renamed from: b */
    public String f62186b;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f62187b;

    /* JADX INFO: renamed from: c */
    public int f62188c;

    /* JADX INFO: renamed from: c */
    public String f62189c;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f62190c;

    /* JADX INFO: renamed from: d */
    public String f62191d;

    /* JADX INFO: renamed from: e */
    public String f62192e;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62166a = new tuq0("PushMetaInfo");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62165a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62167b = new guq0("", (byte) 10, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62168c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62169d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62170e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62171f = new guq0("", (byte) 8, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62172g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62173h = new guq0("", (byte) 8, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62174i = new guq0("", (byte) 8, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62175j = new guq0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62176k = new guq0("", HttpTokens.CARRIAGE_RETURN, 11);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62177l = new guq0("", (byte) 2, 12);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62178m = new guq0("", HttpTokens.CARRIAGE_RETURN, 13);

    public C14753gs(C14753gs c14753gs) {
        BitSet bitSet = new BitSet(5);
        this.f62182a = bitSet;
        bitSet.clear();
        this.f62182a.or(c14753gs.f62182a);
        if (c14753gs.m85733a()) {
            this.f62181a = c14753gs.f62181a;
        }
        this.f62180a = c14753gs.f62180a;
        if (c14753gs.m85748c()) {
            this.f62186b = c14753gs.f62186b;
        }
        if (c14753gs.m85752d()) {
            this.f62189c = c14753gs.f62189c;
        }
        if (c14753gs.m85754e()) {
            this.f62191d = c14753gs.f62191d;
        }
        this.f62179a = c14753gs.f62179a;
        if (c14753gs.m85756g()) {
            this.f62192e = c14753gs.f62192e;
        }
        this.f62185b = c14753gs.f62185b;
        this.f62188c = c14753gs.f62188c;
        if (c14753gs.m85759j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : c14753gs.f62183a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f62183a = map;
        }
        if (c14753gs.m85760k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : c14753gs.f62187b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f62187b = map2;
        }
        this.f62184a = c14753gs.f62184a;
        if (c14753gs.m85763n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : c14753gs.f62190c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f62190c = map3;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14753gs c14753gs) {
        int iM118197h;
        int iM118200k;
        int iM118197h2;
        int iM118197h3;
        int iM118191b;
        int iM118191b2;
        int iM118194e;
        int iM118191b3;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118192c;
        int iM118194e5;
        if (!getClass().equals(c14753gs.getClass())) {
            return getClass().getName().compareTo(c14753gs.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85733a()).compareTo(Boolean.valueOf(c14753gs.m85733a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85733a() && (iM118194e5 = euq0.m118194e(this.f62181a, c14753gs.f62181a)) != 0) {
            return iM118194e5;
        }
        int iCompareTo2 = Boolean.valueOf(m85742b()).compareTo(Boolean.valueOf(c14753gs.m85742b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85742b() && (iM118192c = euq0.m118192c(this.f62180a, c14753gs.f62180a)) != 0) {
            return iM118192c;
        }
        int iCompareTo3 = Boolean.valueOf(m85748c()).compareTo(Boolean.valueOf(c14753gs.m85748c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85748c() && (iM118194e4 = euq0.m118194e(this.f62186b, c14753gs.f62186b)) != 0) {
            return iM118194e4;
        }
        int iCompareTo4 = Boolean.valueOf(m85752d()).compareTo(Boolean.valueOf(c14753gs.m85752d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85752d() && (iM118194e3 = euq0.m118194e(this.f62189c, c14753gs.f62189c)) != 0) {
            return iM118194e3;
        }
        int iCompareTo5 = Boolean.valueOf(m85754e()).compareTo(Boolean.valueOf(c14753gs.m85754e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85754e() && (iM118194e2 = euq0.m118194e(this.f62191d, c14753gs.f62191d)) != 0) {
            return iM118194e2;
        }
        int iCompareTo6 = Boolean.valueOf(m85755f()).compareTo(Boolean.valueOf(c14753gs.m85755f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85755f() && (iM118191b3 = euq0.m118191b(this.f62179a, c14753gs.f62179a)) != 0) {
            return iM118191b3;
        }
        int iCompareTo7 = Boolean.valueOf(m85756g()).compareTo(Boolean.valueOf(c14753gs.m85756g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85756g() && (iM118194e = euq0.m118194e(this.f62192e, c14753gs.f62192e)) != 0) {
            return iM118194e;
        }
        int iCompareTo8 = Boolean.valueOf(m85757h()).compareTo(Boolean.valueOf(c14753gs.m85757h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85757h() && (iM118191b2 = euq0.m118191b(this.f62185b, c14753gs.f62185b)) != 0) {
            return iM118191b2;
        }
        int iCompareTo9 = Boolean.valueOf(m85758i()).compareTo(Boolean.valueOf(c14753gs.m85758i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85758i() && (iM118191b = euq0.m118191b(this.f62188c, c14753gs.f62188c)) != 0) {
            return iM118191b;
        }
        int iCompareTo10 = Boolean.valueOf(m85759j()).compareTo(Boolean.valueOf(c14753gs.m85759j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m85759j() && (iM118197h3 = euq0.m118197h(this.f62183a, c14753gs.f62183a)) != 0) {
            return iM118197h3;
        }
        int iCompareTo11 = Boolean.valueOf(m85760k()).compareTo(Boolean.valueOf(c14753gs.m85760k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m85760k() && (iM118197h2 = euq0.m118197h(this.f62187b, c14753gs.f62187b)) != 0) {
            return iM118197h2;
        }
        int iCompareTo12 = Boolean.valueOf(m85762m()).compareTo(Boolean.valueOf(c14753gs.m85762m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m85762m() && (iM118200k = euq0.m118200k(this.f62184a, c14753gs.f62184a)) != 0) {
            return iM118200k;
        }
        int iCompareTo13 = Boolean.valueOf(m85763n()).compareTo(Boolean.valueOf(c14753gs.m85763n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!m85763n() || (iM118197h = euq0.m118197h(this.f62190c, c14753gs.f62190c)) == 0) {
            return 0;
        }
        return iM118197h;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85730a();
        quq0Var.mo86237v(f62166a);
        if (this.f62181a != null) {
            quq0Var.mo86234s(f62165a);
            quq0Var.mo86232q(this.f62181a);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62167b);
        quq0Var.mo86231p(this.f62180a);
        quq0Var.mo86241z();
        if (this.f62186b != null && m85748c()) {
            quq0Var.mo86234s(f62168c);
            quq0Var.mo86232q(this.f62186b);
            quq0Var.mo86241z();
        }
        if (this.f62189c != null && m85752d()) {
            quq0Var.mo86234s(f62169d);
            quq0Var.mo86232q(this.f62189c);
            quq0Var.mo86241z();
        }
        if (this.f62191d != null && m85754e()) {
            quq0Var.mo86234s(f62170e);
            quq0Var.mo86232q(this.f62191d);
            quq0Var.mo86241z();
        }
        if (m85755f()) {
            quq0Var.mo86234s(f62171f);
            quq0Var.mo86230o(this.f62179a);
            quq0Var.mo86241z();
        }
        if (this.f62192e != null && m85756g()) {
            quq0Var.mo86234s(f62172g);
            quq0Var.mo86232q(this.f62192e);
            quq0Var.mo86241z();
        }
        if (m85757h()) {
            quq0Var.mo86234s(f62173h);
            quq0Var.mo86230o(this.f62185b);
            quq0Var.mo86241z();
        }
        if (m85758i()) {
            quq0Var.mo86234s(f62174i);
            quq0Var.mo86230o(this.f62188c);
            quq0Var.mo86241z();
        }
        if (this.f62183a != null && m85759j()) {
            quq0Var.mo86234s(f62175j);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62183a.size()));
            for (Map.Entry<String, String> entry : this.f62183a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (this.f62187b != null && m85760k()) {
            quq0Var.mo86234s(f62176k);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62187b.size()));
            for (Map.Entry<String, String> entry2 : this.f62187b.entrySet()) {
                quq0Var.mo86232q(entry2.getKey());
                quq0Var.mo86232q(entry2.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (m85762m()) {
            quq0Var.mo86234s(f62177l);
            quq0Var.mo86239x(this.f62184a);
            quq0Var.mo86241z();
        }
        if (this.f62190c != null && m85763n()) {
            quq0Var.mo86234s(f62178m);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62190c.size()));
            for (Map.Entry<String, String> entry3 : this.f62190c.entrySet()) {
                quq0Var.mo86232q(entry3.getKey());
                quq0Var.mo86232q(entry3.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85748c() {
        return this.f62186b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85752d() {
        return this.f62189c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85754e() {
        return this.f62191d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14753gs)) {
            return m85734a((C14753gs) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85755f() {
        return this.f62182a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85756g() {
        return this.f62192e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85757h() {
        return this.f62182a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85758i() {
        return this.f62182a.get(3);
    }

    /* JADX INFO: renamed from: j */
    public boolean m85759j() {
        return this.f62183a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m85760k() {
        return this.f62187b != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m85761l() {
        return this.f62184a;
    }

    /* JADX INFO: renamed from: m */
    public boolean m85762m() {
        return this.f62182a.get(4);
    }

    /* JADX INFO: renamed from: n */
    public boolean m85763n() {
        return this.f62190c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(id:");
        String str = this.f62181a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(C14839aj.m86496a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f62180a);
        if (m85748c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f62186b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m85752d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f62189c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m85754e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f62191d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85755f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f62179a);
        }
        if (m85756g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f62192e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85757h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f62185b);
        }
        if (m85758i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f62188c);
        }
        if (m85759j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f62183a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m85760k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f62187b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m85762m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f62184a);
        }
        if (m85763n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f62190c;
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
    public String m85746c() {
        return this.f62189c;
    }

    /* JADX INFO: renamed from: d */
    public String m85750d() {
        return this.f62191d;
    }

    /* JADX INFO: renamed from: e */
    public void m85753e(boolean z) {
        this.f62182a.set(4, z);
    }

    /* JADX INFO: renamed from: c */
    public C14753gs m85745c(String str) {
        this.f62189c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14753gs m85749d(String str) {
        this.f62191d = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m85747c(boolean z) {
        this.f62182a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public void m85751d(boolean z) {
        this.f62182a.set(3, z);
    }

    /* JADX INFO: renamed from: c */
    public int m85743c() {
        return this.f62188c;
    }

    /* JADX INFO: renamed from: c */
    public C14753gs m85744c(int i) {
        this.f62188c = i;
        m85751d(true);
        return this;
    }

    public C14753gs() {
        this.f62182a = new BitSet(5);
        this.f62184a = false;
    }

    /* JADX INFO: renamed from: b */
    public String m85738b() {
        return this.f62186b;
    }

    /* JADX INFO: renamed from: b */
    public C14753gs m85737b(String str) {
        this.f62186b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85741b(boolean z) {
        this.f62182a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public int m85735b() {
        return this.f62185b;
    }

    /* JADX INFO: renamed from: b */
    public C14753gs m85736b(int i) {
        this.f62185b = i;
        m85747c(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85740b(String str, String str2) {
        if (this.f62187b == null) {
            this.f62187b = new HashMap();
        }
        this.f62187b.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m85739b() {
        return this.f62187b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85742b() {
        return this.f62182a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public String m85728a() {
        return this.f62181a;
    }

    /* JADX INFO: renamed from: a */
    public C14753gs m85726a(String str) {
        this.f62181a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85733a() {
        return this.f62181a != null;
    }

    /* JADX INFO: renamed from: a */
    public long m85723a() {
        return this.f62180a;
    }

    /* JADX INFO: renamed from: a */
    public void m85732a(boolean z) {
        this.f62182a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public int m85721a() {
        return this.f62179a;
    }

    /* JADX INFO: renamed from: a */
    public C14753gs m85725a(int i) {
        this.f62179a = i;
        m85741b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85731a(String str, String str2) {
        if (this.f62183a == null) {
            this.f62183a = new HashMap();
        }
        this.f62183a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m85729a() {
        return this.f62183a;
    }

    /* JADX INFO: renamed from: a */
    public C14753gs m85727a(Map<String, String> map) {
        this.f62183a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85734a(C14753gs c14753gs) {
        if (c14753gs == null) {
            return false;
        }
        boolean zM85733a = m85733a();
        boolean zM85733a2 = c14753gs.m85733a();
        if (((zM85733a || zM85733a2) && !(zM85733a && zM85733a2 && this.f62181a.equals(c14753gs.f62181a))) || this.f62180a != c14753gs.f62180a) {
            return false;
        }
        boolean zM85748c = m85748c();
        boolean zM85748c2 = c14753gs.m85748c();
        if ((zM85748c || zM85748c2) && !(zM85748c && zM85748c2 && this.f62186b.equals(c14753gs.f62186b))) {
            return false;
        }
        boolean zM85752d = m85752d();
        boolean zM85752d2 = c14753gs.m85752d();
        if ((zM85752d || zM85752d2) && !(zM85752d && zM85752d2 && this.f62189c.equals(c14753gs.f62189c))) {
            return false;
        }
        boolean zM85754e = m85754e();
        boolean zM85754e2 = c14753gs.m85754e();
        if ((zM85754e || zM85754e2) && !(zM85754e && zM85754e2 && this.f62191d.equals(c14753gs.f62191d))) {
            return false;
        }
        boolean zM85755f = m85755f();
        boolean zM85755f2 = c14753gs.m85755f();
        if ((zM85755f || zM85755f2) && !(zM85755f && zM85755f2 && this.f62179a == c14753gs.f62179a)) {
            return false;
        }
        boolean zM85756g = m85756g();
        boolean zM85756g2 = c14753gs.m85756g();
        if ((zM85756g || zM85756g2) && !(zM85756g && zM85756g2 && this.f62192e.equals(c14753gs.f62192e))) {
            return false;
        }
        boolean zM85757h = m85757h();
        boolean zM85757h2 = c14753gs.m85757h();
        if ((zM85757h || zM85757h2) && !(zM85757h && zM85757h2 && this.f62185b == c14753gs.f62185b)) {
            return false;
        }
        boolean zM85758i = m85758i();
        boolean zM85758i2 = c14753gs.m85758i();
        if ((zM85758i || zM85758i2) && !(zM85758i && zM85758i2 && this.f62188c == c14753gs.f62188c)) {
            return false;
        }
        boolean zM85759j = m85759j();
        boolean zM85759j2 = c14753gs.m85759j();
        if ((zM85759j || zM85759j2) && !(zM85759j && zM85759j2 && this.f62183a.equals(c14753gs.f62183a))) {
            return false;
        }
        boolean zM85760k = m85760k();
        boolean zM85760k2 = c14753gs.m85760k();
        if ((zM85760k || zM85760k2) && !(zM85760k && zM85760k2 && this.f62187b.equals(c14753gs.f62187b))) {
            return false;
        }
        boolean zM85762m = m85762m();
        boolean zM85762m2 = c14753gs.m85762m();
        if ((zM85762m || zM85762m2) && !(zM85762m && zM85762m2 && this.f62184a == c14753gs.f62184a)) {
            return false;
        }
        boolean zM85763n = m85763n();
        boolean zM85763n2 = c14753gs.m85763n();
        if (zM85763n || zM85763n2) {
            return zM85763n && zM85763n2 && this.f62190c.equals(c14753gs.f62190c);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14753gs m85724a() {
        return new C14753gs(this);
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
                if (m85742b()) {
                    m85730a();
                    return;
                }
                throw new C14781ib("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i = 0;
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62181a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 10) {
                        this.f62180a = quq0Var.mo86219d();
                        m85732a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62186b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62189c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62191d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 8) {
                        this.f62179a = quq0Var.mo86218c();
                        m85741b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62192e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 8) {
                        this.f62185b = quq0Var.mo86218c();
                        m85747c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 8) {
                        this.f62188c = quq0Var.mo86218c();
                        m85751d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f62183a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        while (i < iuq0VarMo86224i.f115048c) {
                            this.f62183a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                            i++;
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i2 = quq0Var.mo86224i();
                        this.f62187b = new HashMap(iuq0VarMo86224i2.f115048c * 2);
                        while (i < iuq0VarMo86224i2.f115048c) {
                            this.f62187b.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                            i++;
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 2) {
                        this.f62184a = quq0Var.mo86240y();
                        m85753e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i3 = quq0Var.mo86224i();
                        this.f62190c = new HashMap(iuq0VarMo86224i3.f115048c * 2);
                        while (i < iuq0VarMo86224i3.f115048c) {
                            this.f62190c.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                            i++;
                        }
                        quq0Var.mo86210F();
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
    public void m85730a() throws C14781ib {
        if (this.f62181a != null) {
            return;
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
