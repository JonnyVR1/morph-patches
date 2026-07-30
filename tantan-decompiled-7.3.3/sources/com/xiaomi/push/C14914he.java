package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
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

/* JADX INFO: renamed from: com.xiaomi.push.he */
/* JADX INFO: loaded from: classes2.dex */
public class C14914he implements InterfaceC14925hq<C14914he, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f63224a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63225a;

    /* JADX INFO: renamed from: a */
    public String f63226a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f63227a;

    /* JADX INFO: renamed from: a */
    private BitSet f63228a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63229a;

    /* JADX INFO: renamed from: a */
    public boolean f63230a;

    /* JADX INFO: renamed from: b */
    public String f63231b;

    /* JADX INFO: renamed from: b */
    public boolean f63232b;

    /* JADX INFO: renamed from: c */
    public String f63233c;

    /* JADX INFO: renamed from: d */
    public String f63234d;

    /* JADX INFO: renamed from: e */
    public String f63235e;

    /* JADX INFO: renamed from: f */
    public String f63236f;

    /* JADX INFO: renamed from: g */
    public String f63237g;

    /* JADX INFO: renamed from: h */
    public String f63238h;

    /* JADX INFO: renamed from: i */
    public String f63239i;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63209a = new z3r0("XmPushActionNotification");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63208a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63210b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63211c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63212d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63213e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63214f = new m3r0("", (byte) 2, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63215g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63216h = new m3r0("", HttpTokens.CARRIAGE_RETURN, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63217i = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63218j = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63219k = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63220l = new m3r0("", (byte) 11, 13);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f63221m = new m3r0("", (byte) 11, 14);

    /* JADX INFO: renamed from: n */
    private static final m3r0 f63222n = new m3r0("", (byte) 10, 15);

    /* JADX INFO: renamed from: o */
    private static final m3r0 f63223o = new m3r0("", (byte) 2, 20);

    public C14914he() {
        this.f63228a = new BitSet(3);
        this.f63230a = true;
        this.f63232b = false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14914he c14914he) {
        int iM148152k;
        int iM148144c;
        int iM148145d;
        int iM148146e;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148149h;
        int iM148146e5;
        int iM148152k2;
        int iM148146e6;
        int iM148146e7;
        int iM148146e8;
        int iM148145d2;
        int iM148146e9;
        if (!getClass().equals(c14914he.getClass())) {
            return getClass().getName().compareTo(c14914he.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87124a()).compareTo(Boolean.valueOf(c14914he.m87124a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87124a() && (iM148146e9 = k3r0.m148146e(this.f63226a, c14914he.f63226a)) != 0) {
            return iM148146e9;
        }
        int iCompareTo2 = Boolean.valueOf(m87130b()).compareTo(Boolean.valueOf(c14914he.m87130b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87130b() && (iM148145d2 = k3r0.m148145d(this.f63225a, c14914he.f63225a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo3 = Boolean.valueOf(m87134c()).compareTo(Boolean.valueOf(c14914he.m87134c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87134c() && (iM148146e8 = k3r0.m148146e(this.f63231b, c14914he.f63231b)) != 0) {
            return iM148146e8;
        }
        int iCompareTo4 = Boolean.valueOf(m87137d()).compareTo(Boolean.valueOf(c14914he.m87137d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87137d() && (iM148146e7 = k3r0.m148146e(this.f63233c, c14914he.f63233c)) != 0) {
            return iM148146e7;
        }
        int iCompareTo5 = Boolean.valueOf(m87138e()).compareTo(Boolean.valueOf(c14914he.m87138e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87138e() && (iM148146e6 = k3r0.m148146e(this.f63234d, c14914he.f63234d)) != 0) {
            return iM148146e6;
        }
        int iCompareTo6 = Boolean.valueOf(m87139f()).compareTo(Boolean.valueOf(c14914he.m87139f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87139f() && (iM148152k2 = k3r0.m148152k(this.f63230a, c14914he.f63230a)) != 0) {
            return iM148152k2;
        }
        int iCompareTo7 = Boolean.valueOf(m87140g()).compareTo(Boolean.valueOf(c14914he.m87140g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87140g() && (iM148146e5 = k3r0.m148146e(this.f63235e, c14914he.f63235e)) != 0) {
            return iM148146e5;
        }
        int iCompareTo8 = Boolean.valueOf(m87141h()).compareTo(Boolean.valueOf(c14914he.m87141h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87141h() && (iM148149h = k3r0.m148149h(this.f63229a, c14914he.f63229a)) != 0) {
            return iM148149h;
        }
        int iCompareTo9 = Boolean.valueOf(m87142i()).compareTo(Boolean.valueOf(c14914he.m87142i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87142i() && (iM148146e4 = k3r0.m148146e(this.f63236f, c14914he.f63236f)) != 0) {
            return iM148146e4;
        }
        int iCompareTo10 = Boolean.valueOf(m87143j()).compareTo(Boolean.valueOf(c14914he.m87143j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m87143j() && (iM148146e3 = k3r0.m148146e(this.f63237g, c14914he.f63237g)) != 0) {
            return iM148146e3;
        }
        int iCompareTo11 = Boolean.valueOf(m87144k()).compareTo(Boolean.valueOf(c14914he.m87144k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m87144k() && (iM148146e2 = k3r0.m148146e(this.f63238h, c14914he.f63238h)) != 0) {
            return iM148146e2;
        }
        int iCompareTo12 = Boolean.valueOf(m87145l()).compareTo(Boolean.valueOf(c14914he.m87145l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m87145l() && (iM148146e = k3r0.m148146e(this.f63239i, c14914he.f63239i)) != 0) {
            return iM148146e;
        }
        int iCompareTo13 = Boolean.valueOf(m87146m()).compareTo(Boolean.valueOf(c14914he.m87146m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m87146m() && (iM148145d = k3r0.m148145d(this.f63227a, c14914he.f63227a)) != 0) {
            return iM148145d;
        }
        int iCompareTo14 = Boolean.valueOf(m87147n()).compareTo(Boolean.valueOf(c14914he.m87147n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m87147n() && (iM148144c = k3r0.m148144c(this.f63224a, c14914he.f63224a)) != 0) {
            return iM148144c;
        }
        int iCompareTo15 = Boolean.valueOf(m87148o()).compareTo(Boolean.valueOf(c14914he.m87148o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!m87148o() || (iM148152k = k3r0.m148152k(this.f63232b, c14914he.f63232b)) == 0) {
            return 0;
        }
        return iM148152k;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87121a();
        w3r0Var.mo87408v(f63209a);
        if (this.f63226a != null && m87124a()) {
            w3r0Var.mo87405s(f63208a);
            w3r0Var.mo87403q(this.f63226a);
            w3r0Var.mo87412z();
        }
        if (this.f63225a != null && m87130b()) {
            w3r0Var.mo87405s(f63210b);
            this.f63225a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63231b != null) {
            w3r0Var.mo87405s(f63211c);
            w3r0Var.mo87403q(this.f63231b);
            w3r0Var.mo87412z();
        }
        if (this.f63233c != null && m87137d()) {
            w3r0Var.mo87405s(f63212d);
            w3r0Var.mo87403q(this.f63233c);
            w3r0Var.mo87412z();
        }
        if (this.f63234d != null && m87138e()) {
            w3r0Var.mo87405s(f63213e);
            w3r0Var.mo87403q(this.f63234d);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63214f);
        w3r0Var.mo87410x(this.f63230a);
        w3r0Var.mo87412z();
        if (this.f63235e != null && m87140g()) {
            w3r0Var.mo87405s(f63215g);
            w3r0Var.mo87403q(this.f63235e);
            w3r0Var.mo87412z();
        }
        if (this.f63229a != null && m87141h()) {
            w3r0Var.mo87405s(f63216h);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63229a.size()));
            for (Map.Entry<String, String> entry : this.f63229a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (this.f63236f != null && m87142i()) {
            w3r0Var.mo87405s(f63217i);
            w3r0Var.mo87403q(this.f63236f);
            w3r0Var.mo87412z();
        }
        if (this.f63237g != null && m87143j()) {
            w3r0Var.mo87405s(f63218j);
            w3r0Var.mo87403q(this.f63237g);
            w3r0Var.mo87412z();
        }
        if (this.f63238h != null && m87144k()) {
            w3r0Var.mo87405s(f63219k);
            w3r0Var.mo87403q(this.f63238h);
            w3r0Var.mo87412z();
        }
        if (this.f63239i != null && m87145l()) {
            w3r0Var.mo87405s(f63220l);
            w3r0Var.mo87403q(this.f63239i);
            w3r0Var.mo87412z();
        }
        if (this.f63227a != null && m87146m()) {
            w3r0Var.mo87405s(f63221m);
            w3r0Var.mo87404r(this.f63227a);
            w3r0Var.mo87412z();
        }
        if (m87147n()) {
            w3r0Var.mo87405s(f63222n);
            w3r0Var.mo87402p(this.f63224a);
            w3r0Var.mo87412z();
        }
        if (m87148o()) {
            w3r0Var.mo87405s(f63223o);
            w3r0Var.mo87410x(this.f63232b);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87134c() {
        return this.f63231b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87137d() {
        return this.f63233c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87138e() {
        return this.f63234d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14914he)) {
            return m87125a((C14914he) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87139f() {
        return this.f63228a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m87140g() {
        return this.f63235e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87141h() {
        return this.f63229a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87142i() {
        return this.f63236f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m87143j() {
        return this.f63237g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m87144k() {
        return this.f63238h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m87145l() {
        return this.f63239i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m87146m() {
        return this.f63227a != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m87147n() {
        return this.f63228a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m87148o() {
        return this.f63228a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m87124a()) {
            sb.append("debug:");
            String str = this.f63226a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87130b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63225a;
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
        String str2 = this.f63231b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m87137d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f63233c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m87138e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f63234d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f63230a);
        if (m87140g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f63235e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m87141h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f63229a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m87142i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f63236f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m87143j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63237g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m87144k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f63238h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m87145l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f63239i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m87146m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f63227a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                k3r0.m148156o(byteBuffer, sb);
            }
        }
        if (m87147n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f63224a);
        }
        if (m87148o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f63232b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m87132c() {
        return this.f63234d;
    }

    /* JADX INFO: renamed from: d */
    public String m87136d() {
        return this.f63236f;
    }

    /* JADX INFO: renamed from: c */
    public C14914he m87131c(String str) {
        this.f63234d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14914he m87135d(String str) {
        this.f63236f = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m87133c(boolean z) {
        this.f63228a.set(2, z);
    }

    public C14914he(String str, boolean z) {
        this();
        this.f63231b = str;
        this.f63230a = z;
        m87123a(true);
    }

    /* JADX INFO: renamed from: b */
    public String m87128b() {
        return this.f63233c;
    }

    /* JADX INFO: renamed from: b */
    public C14914he m87127b(String str) {
        this.f63233c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m87129b(boolean z) {
        this.f63228a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m87130b() {
        return this.f63225a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14903gu m87113a() {
        return this.f63225a;
    }

    /* JADX INFO: renamed from: a */
    public String m87119a() {
        return this.f63231b;
    }

    /* JADX INFO: renamed from: a */
    public C14914he m87114a(String str) {
        this.f63231b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14914he m87117a(boolean z) {
        this.f63230a = z;
        m87123a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m87123a(boolean z) {
        this.f63228a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public void m87122a(String str, String str2) {
        if (this.f63229a == null) {
            this.f63229a = new HashMap();
        }
        this.f63229a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m87120a() {
        return this.f63229a;
    }

    /* JADX INFO: renamed from: a */
    public C14914he m87116a(Map<String, String> map) {
        this.f63229a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m87126a() {
        m87115a(k3r0.m148155n(this.f63227a));
        return this.f63227a.array();
    }

    /* JADX INFO: renamed from: a */
    public C14914he m87118a(byte[] bArr) {
        m87115a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14914he m87115a(ByteBuffer byteBuffer) {
        this.f63227a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87125a(C14914he c14914he) {
        if (c14914he == null) {
            return false;
        }
        boolean zM87124a = m87124a();
        boolean zM87124a2 = c14914he.m87124a();
        if ((zM87124a || zM87124a2) && !(zM87124a && zM87124a2 && this.f63226a.equals(c14914he.f63226a))) {
            return false;
        }
        boolean zM87130b = m87130b();
        boolean zM87130b2 = c14914he.m87130b();
        if ((zM87130b || zM87130b2) && !(zM87130b && zM87130b2 && this.f63225a.m86941a(c14914he.f63225a))) {
            return false;
        }
        boolean zM87134c = m87134c();
        boolean zM87134c2 = c14914he.m87134c();
        if ((zM87134c || zM87134c2) && !(zM87134c && zM87134c2 && this.f63231b.equals(c14914he.f63231b))) {
            return false;
        }
        boolean zM87137d = m87137d();
        boolean zM87137d2 = c14914he.m87137d();
        if ((zM87137d || zM87137d2) && !(zM87137d && zM87137d2 && this.f63233c.equals(c14914he.f63233c))) {
            return false;
        }
        boolean zM87138e = m87138e();
        boolean zM87138e2 = c14914he.m87138e();
        if (((zM87138e || zM87138e2) && !(zM87138e && zM87138e2 && this.f63234d.equals(c14914he.f63234d))) || this.f63230a != c14914he.f63230a) {
            return false;
        }
        boolean zM87140g = m87140g();
        boolean zM87140g2 = c14914he.m87140g();
        if ((zM87140g || zM87140g2) && !(zM87140g && zM87140g2 && this.f63235e.equals(c14914he.f63235e))) {
            return false;
        }
        boolean zM87141h = m87141h();
        boolean zM87141h2 = c14914he.m87141h();
        if ((zM87141h || zM87141h2) && !(zM87141h && zM87141h2 && this.f63229a.equals(c14914he.f63229a))) {
            return false;
        }
        boolean zM87142i = m87142i();
        boolean zM87142i2 = c14914he.m87142i();
        if ((zM87142i || zM87142i2) && !(zM87142i && zM87142i2 && this.f63236f.equals(c14914he.f63236f))) {
            return false;
        }
        boolean zM87143j = m87143j();
        boolean zM87143j2 = c14914he.m87143j();
        if ((zM87143j || zM87143j2) && !(zM87143j && zM87143j2 && this.f63237g.equals(c14914he.f63237g))) {
            return false;
        }
        boolean zM87144k = m87144k();
        boolean zM87144k2 = c14914he.m87144k();
        if ((zM87144k || zM87144k2) && !(zM87144k && zM87144k2 && this.f63238h.equals(c14914he.f63238h))) {
            return false;
        }
        boolean zM87145l = m87145l();
        boolean zM87145l2 = c14914he.m87145l();
        if ((zM87145l || zM87145l2) && !(zM87145l && zM87145l2 && this.f63239i.equals(c14914he.f63239i))) {
            return false;
        }
        boolean zM87146m = m87146m();
        boolean zM87146m2 = c14914he.m87146m();
        if ((zM87146m || zM87146m2) && !(zM87146m && zM87146m2 && this.f63227a.equals(c14914he.f63227a))) {
            return false;
        }
        boolean zM87147n = m87147n();
        boolean zM87147n2 = c14914he.m87147n();
        if ((zM87147n || zM87147n2) && !(zM87147n && zM87147n2 && this.f63224a == c14914he.f63224a)) {
            return false;
        }
        boolean zM87148o = m87148o();
        boolean zM87148o2 = c14914he.m87148o();
        if (zM87148o || zM87148o2) {
            return zM87148o && zM87148o2 && this.f63232b == c14914he.f63232b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87124a() {
        return this.f63226a != null;
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
                if (m87139f()) {
                    m87121a();
                    return;
                }
                throw new C14929ib("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f63226a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63225a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63231b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63233c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63234d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f63230a = w3r0Var.mo87411y();
                        m87123a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63235e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f63229a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                            this.f63229a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63236f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63237g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
                case 12:
                    if (b == 11) {
                        this.f63238h = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f63239i = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f63227a = w3r0Var.mo87392f();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 15:
                    if (b == 10) {
                        this.f63224a = w3r0Var.mo87390d();
                        m87129b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 20:
                    if (b == 2) {
                        this.f63232b = w3r0Var.mo87411y();
                        m87133c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87121a() throws C14929ib {
        if (this.f63231b != null) {
            return;
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
