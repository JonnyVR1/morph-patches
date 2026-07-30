package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import p153l.j3r0;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.hb */
/* JADX INFO: loaded from: classes2.dex */
public class C14911hb implements InterfaceC14925hq<C14911hb, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public EnumC14888gf f63193a;

    /* JADX INFO: renamed from: a */
    public C14901gs f63194a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63195a;

    /* JADX INFO: renamed from: a */
    public String f63196a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f63197a;

    /* JADX INFO: renamed from: b */
    public String f63200b;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63185a = new z3r0("XmPushActionContainer");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63184a = new m3r0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63186b = new m3r0("", (byte) 2, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63187c = new m3r0("", (byte) 2, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63188d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63189e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63190f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63191g = new m3r0("", (byte) 12, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63192h = new m3r0("", (byte) 12, 8);

    /* JADX INFO: renamed from: a */
    private BitSet f63198a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f63199a = true;

    /* JADX INFO: renamed from: b */
    public boolean f63201b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14911hb c14911hb) {
        int iM148145d;
        int iM148145d2;
        int iM148146e;
        int iM148146e2;
        int iM148145d3;
        int iM148152k;
        int iM148152k2;
        int iM148145d4;
        if (!getClass().equals(c14911hb.getClass())) {
            return getClass().getName().compareTo(c14911hb.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87087a()).compareTo(Boolean.valueOf(c14911hb.m87087a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87087a() && (iM148145d4 = k3r0.m148145d(this.f63193a, c14911hb.f63193a)) != 0) {
            return iM148145d4;
        }
        int iCompareTo2 = Boolean.valueOf(m87095c()).compareTo(Boolean.valueOf(c14911hb.m87095c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87095c() && (iM148152k2 = k3r0.m148152k(this.f63199a, c14911hb.f63199a)) != 0) {
            return iM148152k2;
        }
        int iCompareTo3 = Boolean.valueOf(m87096d()).compareTo(Boolean.valueOf(c14911hb.m87096d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87096d() && (iM148152k = k3r0.m148152k(this.f63201b, c14911hb.f63201b)) != 0) {
            return iM148152k;
        }
        int iCompareTo4 = Boolean.valueOf(m87097e()).compareTo(Boolean.valueOf(c14911hb.m87097e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87097e() && (iM148145d3 = k3r0.m148145d(this.f63197a, c14911hb.f63197a)) != 0) {
            return iM148145d3;
        }
        int iCompareTo5 = Boolean.valueOf(m87098f()).compareTo(Boolean.valueOf(c14911hb.m87098f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87098f() && (iM148146e2 = k3r0.m148146e(this.f63196a, c14911hb.f63196a)) != 0) {
            return iM148146e2;
        }
        int iCompareTo6 = Boolean.valueOf(m87099g()).compareTo(Boolean.valueOf(c14911hb.m87099g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87099g() && (iM148146e = k3r0.m148146e(this.f63200b, c14911hb.f63200b)) != 0) {
            return iM148146e;
        }
        int iCompareTo7 = Boolean.valueOf(m87100h()).compareTo(Boolean.valueOf(c14911hb.m87100h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87100h() && (iM148145d2 = k3r0.m148145d(this.f63195a, c14911hb.f63195a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo8 = Boolean.valueOf(m87101i()).compareTo(Boolean.valueOf(c14911hb.m87101i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m87101i() || (iM148145d = k3r0.m148145d(this.f63194a, c14911hb.f63194a)) == 0) {
            return 0;
        }
        return iM148145d;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87085a();
        w3r0Var.mo87408v(f63185a);
        if (this.f63193a != null) {
            w3r0Var.mo87405s(f63184a);
            w3r0Var.mo87401o(this.f63193a.m86771a());
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87405s(f63186b);
        w3r0Var.mo87410x(this.f63199a);
        w3r0Var.mo87412z();
        w3r0Var.mo87405s(f63187c);
        w3r0Var.mo87410x(this.f63201b);
        w3r0Var.mo87412z();
        if (this.f63197a != null) {
            w3r0Var.mo87405s(f63188d);
            w3r0Var.mo87404r(this.f63197a);
            w3r0Var.mo87412z();
        }
        if (this.f63196a != null && m87098f()) {
            w3r0Var.mo87405s(f63189e);
            w3r0Var.mo87403q(this.f63196a);
            w3r0Var.mo87412z();
        }
        if (this.f63200b != null && m87099g()) {
            w3r0Var.mo87405s(f63190f);
            w3r0Var.mo87403q(this.f63200b);
            w3r0Var.mo87412z();
        }
        if (this.f63195a != null) {
            w3r0Var.mo87405s(f63191g);
            this.f63195a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63194a != null && m87101i()) {
            w3r0Var.mo87405s(f63192h);
            this.f63194a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87095c() {
        return this.f63198a.get(0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m87096d() {
        return this.f63198a.get(1);
    }

    /* JADX INFO: renamed from: e */
    public boolean m87097e() {
        return this.f63197a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14911hb)) {
            return m87088a((C14911hb) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87098f() {
        return this.f63196a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87099g() {
        return this.f63200b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87100h() {
        return this.f63195a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87101i() {
        return this.f63194a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(action:");
        EnumC14888gf enumC14888gf = this.f63193a;
        if (enumC14888gf == null) {
            sb.append("null");
        } else {
            sb.append(enumC14888gf);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f63199a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f63201b);
        if (m87098f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f63196a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (m87099g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f63200b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        C14903gu c14903gu = this.f63195a;
        if (c14903gu == null) {
            sb.append("null");
        } else {
            sb.append(c14903gu);
        }
        if (m87101i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C14901gs c14901gs = this.f63194a;
            if (c14901gs == null) {
                sb.append("null");
            } else {
                sb.append(c14901gs);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public C14911hb m87091b(boolean z) {
        this.f63201b = z;
        m87093b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m87093b(boolean z) {
        this.f63198a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public String m87092b() {
        return this.f63200b;
    }

    /* JADX INFO: renamed from: b */
    public C14911hb m87090b(String str) {
        this.f63200b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m87094b() {
        return this.f63199a;
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87078a(EnumC14888gf enumC14888gf) {
        this.f63193a = enumC14888gf;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87087a() {
        return this.f63193a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87083a(boolean z) {
        this.f63199a = z;
        m87086a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m87086a(boolean z) {
        this.f63198a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m87089a() {
        m87082a(k3r0.m148155n(this.f63197a));
        return this.f63197a.array();
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87082a(ByteBuffer byteBuffer) {
        this.f63197a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m87084a() {
        return this.f63196a;
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87081a(String str) {
        this.f63196a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87080a(C14903gu c14903gu) {
        this.f63195a = c14903gu;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14901gs m87077a() {
        return this.f63194a;
    }

    /* JADX INFO: renamed from: a */
    public C14911hb m87079a(C14901gs c14901gs) {
        this.f63194a = c14901gs;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87088a(C14911hb c14911hb) {
        if (c14911hb == null) {
            return false;
        }
        boolean zM87087a = m87087a();
        boolean zM87087a2 = c14911hb.m87087a();
        if (((zM87087a || zM87087a2) && (!zM87087a || !zM87087a2 || !this.f63193a.equals(c14911hb.f63193a))) || this.f63199a != c14911hb.f63199a || this.f63201b != c14911hb.f63201b) {
            return false;
        }
        boolean zM87097e = m87097e();
        boolean zM87097e2 = c14911hb.m87097e();
        if ((zM87097e || zM87097e2) && !(zM87097e && zM87097e2 && this.f63197a.equals(c14911hb.f63197a))) {
            return false;
        }
        boolean zM87098f = m87098f();
        boolean zM87098f2 = c14911hb.m87098f();
        if ((zM87098f || zM87098f2) && !(zM87098f && zM87098f2 && this.f63196a.equals(c14911hb.f63196a))) {
            return false;
        }
        boolean zM87099g = m87099g();
        boolean zM87099g2 = c14911hb.m87099g();
        if ((zM87099g || zM87099g2) && !(zM87099g && zM87099g2 && this.f63200b.equals(c14911hb.f63200b))) {
            return false;
        }
        boolean zM87100h = m87100h();
        boolean zM87100h2 = c14911hb.m87100h();
        if ((zM87100h || zM87100h2) && !(zM87100h && zM87100h2 && this.f63195a.m86941a(c14911hb.f63195a))) {
            return false;
        }
        boolean zM87101i = m87101i();
        boolean zM87101i2 = c14911hb.m87101i();
        if (zM87101i || zM87101i2) {
            return zM87101i && zM87101i2 && this.f63194a.m86905a(c14911hb.f63194a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public EnumC14888gf m87076a() {
        return this.f63193a;
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
                if (m87095c()) {
                    if (m87096d()) {
                        m87085a();
                        return;
                    } else {
                        j3r0.m143363a("Required field 'isRequest' was not found in serialized data! Struct: ", this);
                        return;
                    }
                }
                j3r0.m143363a("Required field 'encryptAction' was not found in serialized data! Struct: ", this);
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 8) {
                        this.f63193a = EnumC14888gf.m86770a(w3r0Var.mo87389c());
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 2) {
                        this.f63199a = w3r0Var.mo87411y();
                        m87086a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 2) {
                        this.f63201b = w3r0Var.mo87411y();
                        m87093b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63197a = w3r0Var.mo87392f();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63196a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63200b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63195a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14901gs c14901gs = new C14901gs();
                        this.f63194a = c14901gs;
                        c14901gs.mo86705a(w3r0Var);
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
    public void m87085a() throws C14929ib {
        if (this.f63193a != null) {
            if (this.f63197a != null) {
                if (this.f63195a != null) {
                    return;
                }
                j3r0.m143363a("Required field 'target' was not present! Struct: ", this);
                return;
            }
            j3r0.m143363a("Required field 'pushAction' was not present! Struct: ", this);
            return;
        }
        j3r0.m143363a("Required field 'action' was not present! Struct: ", this);
    }
}
