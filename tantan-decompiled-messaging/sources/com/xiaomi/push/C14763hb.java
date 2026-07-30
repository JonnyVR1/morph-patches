package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import p149l.duq0;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.hb */
/* JADX INFO: loaded from: classes2.dex */
public class C14763hb implements InterfaceC14777hq<C14763hb, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public EnumC14740gf f62346a;

    /* JADX INFO: renamed from: a */
    public C14753gs f62347a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62348a;

    /* JADX INFO: renamed from: a */
    public String f62349a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f62350a;

    /* JADX INFO: renamed from: b */
    public String f62353b;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62338a = new tuq0("XmPushActionContainer");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62337a = new guq0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62339b = new guq0("", (byte) 2, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62340c = new guq0("", (byte) 2, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62341d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62342e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62343f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62344g = new guq0("", (byte) 12, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62345h = new guq0("", (byte) 12, 8);

    /* JADX INFO: renamed from: a */
    private BitSet f62351a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f62352a = true;

    /* JADX INFO: renamed from: b */
    public boolean f62354b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14763hb c14763hb) {
        int iM118193d;
        int iM118193d2;
        int iM118194e;
        int iM118194e2;
        int iM118193d3;
        int iM118200k;
        int iM118200k2;
        int iM118193d4;
        if (!getClass().equals(c14763hb.getClass())) {
            return getClass().getName().compareTo(c14763hb.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85916a()).compareTo(Boolean.valueOf(c14763hb.m85916a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85916a() && (iM118193d4 = euq0.m118193d(this.f62346a, c14763hb.f62346a)) != 0) {
            return iM118193d4;
        }
        int iCompareTo2 = Boolean.valueOf(m85924c()).compareTo(Boolean.valueOf(c14763hb.m85924c()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85924c() && (iM118200k2 = euq0.m118200k(this.f62352a, c14763hb.f62352a)) != 0) {
            return iM118200k2;
        }
        int iCompareTo3 = Boolean.valueOf(m85925d()).compareTo(Boolean.valueOf(c14763hb.m85925d()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85925d() && (iM118200k = euq0.m118200k(this.f62354b, c14763hb.f62354b)) != 0) {
            return iM118200k;
        }
        int iCompareTo4 = Boolean.valueOf(m85926e()).compareTo(Boolean.valueOf(c14763hb.m85926e()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85926e() && (iM118193d3 = euq0.m118193d(this.f62350a, c14763hb.f62350a)) != 0) {
            return iM118193d3;
        }
        int iCompareTo5 = Boolean.valueOf(m85927f()).compareTo(Boolean.valueOf(c14763hb.m85927f()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85927f() && (iM118194e2 = euq0.m118194e(this.f62349a, c14763hb.f62349a)) != 0) {
            return iM118194e2;
        }
        int iCompareTo6 = Boolean.valueOf(m85928g()).compareTo(Boolean.valueOf(c14763hb.m85928g()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85928g() && (iM118194e = euq0.m118194e(this.f62353b, c14763hb.f62353b)) != 0) {
            return iM118194e;
        }
        int iCompareTo7 = Boolean.valueOf(m85929h()).compareTo(Boolean.valueOf(c14763hb.m85929h()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85929h() && (iM118193d2 = euq0.m118193d(this.f62348a, c14763hb.f62348a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo8 = Boolean.valueOf(m85930i()).compareTo(Boolean.valueOf(c14763hb.m85930i()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (!m85930i() || (iM118193d = euq0.m118193d(this.f62347a, c14763hb.f62347a)) == 0) {
            return 0;
        }
        return iM118193d;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85914a();
        quq0Var.mo86237v(f62338a);
        if (this.f62346a != null) {
            quq0Var.mo86234s(f62337a);
            quq0Var.mo86230o(this.f62346a.m85600a());
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62339b);
        quq0Var.mo86239x(this.f62352a);
        quq0Var.mo86241z();
        quq0Var.mo86234s(f62340c);
        quq0Var.mo86239x(this.f62354b);
        quq0Var.mo86241z();
        if (this.f62350a != null) {
            quq0Var.mo86234s(f62341d);
            quq0Var.mo86233r(this.f62350a);
            quq0Var.mo86241z();
        }
        if (this.f62349a != null && m85927f()) {
            quq0Var.mo86234s(f62342e);
            quq0Var.mo86232q(this.f62349a);
            quq0Var.mo86241z();
        }
        if (this.f62353b != null && m85928g()) {
            quq0Var.mo86234s(f62343f);
            quq0Var.mo86232q(this.f62353b);
            quq0Var.mo86241z();
        }
        if (this.f62348a != null) {
            quq0Var.mo86234s(f62344g);
            this.f62348a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62347a != null && m85930i()) {
            quq0Var.mo86234s(f62345h);
            this.f62347a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85924c() {
        return this.f62351a.get(0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m85925d() {
        return this.f62351a.get(1);
    }

    /* JADX INFO: renamed from: e */
    public boolean m85926e() {
        return this.f62350a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14763hb)) {
            return m85917a((C14763hb) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85927f() {
        return this.f62349a != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85928g() {
        return this.f62353b != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85929h() {
        return this.f62348a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85930i() {
        return this.f62347a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(action:");
        EnumC14740gf enumC14740gf = this.f62346a;
        if (enumC14740gf == null) {
            sb.append("null");
        } else {
            sb.append(enumC14740gf);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f62352a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f62354b);
        if (m85927f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f62349a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (m85928g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f62353b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        C14755gu c14755gu = this.f62348a;
        if (c14755gu == null) {
            sb.append("null");
        } else {
            sb.append(c14755gu);
        }
        if (m85930i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C14753gs c14753gs = this.f62347a;
            if (c14753gs == null) {
                sb.append("null");
            } else {
                sb.append(c14753gs);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public C14763hb m85920b(boolean z) {
        this.f62354b = z;
        m85922b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85922b(boolean z) {
        this.f62351a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public String m85921b() {
        return this.f62353b;
    }

    /* JADX INFO: renamed from: b */
    public C14763hb m85919b(String str) {
        this.f62353b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85923b() {
        return this.f62352a;
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85907a(EnumC14740gf enumC14740gf) {
        this.f62346a = enumC14740gf;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85916a() {
        return this.f62346a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85912a(boolean z) {
        this.f62352a = z;
        m85915a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85915a(boolean z) {
        this.f62351a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85918a() {
        m85911a(euq0.m118203n(this.f62350a));
        return this.f62350a.array();
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85911a(ByteBuffer byteBuffer) {
        this.f62350a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m85913a() {
        return this.f62349a;
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85910a(String str) {
        this.f62349a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85909a(C14755gu c14755gu) {
        this.f62348a = c14755gu;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14753gs m85906a() {
        return this.f62347a;
    }

    /* JADX INFO: renamed from: a */
    public C14763hb m85908a(C14753gs c14753gs) {
        this.f62347a = c14753gs;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85917a(C14763hb c14763hb) {
        if (c14763hb == null) {
            return false;
        }
        boolean zM85916a = m85916a();
        boolean zM85916a2 = c14763hb.m85916a();
        if (((zM85916a || zM85916a2) && (!zM85916a || !zM85916a2 || !this.f62346a.equals(c14763hb.f62346a))) || this.f62352a != c14763hb.f62352a || this.f62354b != c14763hb.f62354b) {
            return false;
        }
        boolean zM85926e = m85926e();
        boolean zM85926e2 = c14763hb.m85926e();
        if ((zM85926e || zM85926e2) && !(zM85926e && zM85926e2 && this.f62350a.equals(c14763hb.f62350a))) {
            return false;
        }
        boolean zM85927f = m85927f();
        boolean zM85927f2 = c14763hb.m85927f();
        if ((zM85927f || zM85927f2) && !(zM85927f && zM85927f2 && this.f62349a.equals(c14763hb.f62349a))) {
            return false;
        }
        boolean zM85928g = m85928g();
        boolean zM85928g2 = c14763hb.m85928g();
        if ((zM85928g || zM85928g2) && !(zM85928g && zM85928g2 && this.f62353b.equals(c14763hb.f62353b))) {
            return false;
        }
        boolean zM85929h = m85929h();
        boolean zM85929h2 = c14763hb.m85929h();
        if ((zM85929h || zM85929h2) && !(zM85929h && zM85929h2 && this.f62348a.m85770a(c14763hb.f62348a))) {
            return false;
        }
        boolean zM85930i = m85930i();
        boolean zM85930i2 = c14763hb.m85930i();
        if (zM85930i || zM85930i2) {
            return zM85930i && zM85930i2 && this.f62347a.m85734a(c14763hb.f62347a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public EnumC14740gf m85905a() {
        return this.f62346a;
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
                if (m85924c()) {
                    if (m85925d()) {
                        m85914a();
                        return;
                    } else {
                        duq0.m113745a("Required field 'isRequest' was not found in serialized data! Struct: ", this);
                        return;
                    }
                }
                duq0.m113745a("Required field 'encryptAction' was not found in serialized data! Struct: ", this);
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 8) {
                        this.f62346a = EnumC14740gf.m85599a(quq0Var.mo86218c());
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 2) {
                        this.f62352a = quq0Var.mo86240y();
                        m85915a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 2) {
                        this.f62354b = quq0Var.mo86240y();
                        m85922b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62350a = quq0Var.mo86221f();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62349a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62353b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62348a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 12) {
                        C14753gs c14753gs = new C14753gs();
                        this.f62347a = c14753gs;
                        c14753gs.mo85534a(quq0Var);
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
    public void m85914a() throws C14781ib {
        if (this.f62346a != null) {
            if (this.f62350a != null) {
                if (this.f62348a != null) {
                    return;
                }
                duq0.m113745a("Required field 'target' was not present! Struct: ", this);
                return;
            }
            duq0.m113745a("Required field 'pushAction' was not present! Struct: ", this);
            return;
        }
        duq0.m113745a("Required field 'action' was not present! Struct: ", this);
    }
}
