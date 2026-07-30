package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2395a0;
import com.google.android.gms.internal.play_billing.zzgk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sax0 implements o2y0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2395a0 f167083a;

    public sax0(AbstractC2395a0 abstractC2395a0) {
        Charset charset = srx0.f170385a;
        this.f167083a = abstractC2395a0;
        abstractC2395a0.f10343a = this;
    }

    /* JADX INFO: renamed from: b */
    public static sax0 m185274b(AbstractC2395a0 abstractC2395a0) {
        sax0 sax0Var = abstractC2395a0.f10343a;
        return sax0Var != null ? sax0Var : new sax0(abstractC2395a0);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: A */
    public final void mo165795A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof dux0)) {
            if (!z) {
                while (i2 < list.size()) {
                    AbstractC2395a0 abstractC2395a0 = this.f167083a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC2395a0.mo14796w(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14772a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM14772a += AbstractC2395a0.m14772a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f167083a.mo14795v(iM14772a);
            while (i2 < list.size()) {
                AbstractC2395a0 abstractC2395a1 = this.f167083a;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abstractC2395a1.mo14797x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        dux0 dux0Var = (dux0) list;
        if (!z) {
            while (i2 < dux0Var.size()) {
                AbstractC2395a0 abstractC2395a2 = this.f167083a;
                long jM118227c = dux0Var.m118227c(i2);
                abstractC2395a2.mo14796w(i, (jM118227c >> 63) ^ (jM118227c + jM118227c));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14772a2 = 0;
        for (int i4 = 0; i4 < dux0Var.size(); i4++) {
            long jM118227c2 = dux0Var.m118227c(i4);
            iM14772a2 += AbstractC2395a0.m14772a((jM118227c2 >> 63) ^ (jM118227c2 + jM118227c2));
        }
        this.f167083a.mo14795v(iM14772a2);
        while (i2 < dux0Var.size()) {
            AbstractC2395a0 abstractC2395a3 = this.f167083a;
            long jM118227c3 = dux0Var.m118227c(i2);
            abstractC2395a3.mo14797x((jM118227c3 >> 63) ^ (jM118227c3 + jM118227c3));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: B */
    public final void mo165796B(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zsx0)) {
            while (i2 < list.size()) {
                this.f167083a.mo14792s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zsx0 zsx0Var = (zsx0) list;
        while (i2 < list.size()) {
            Object objZzc = zsx0Var.zzc();
            boolean z = objZzc instanceof String;
            AbstractC2395a0 abstractC2395a0 = this.f167083a;
            if (z) {
                abstractC2395a0.mo14792s(i, (String) objZzc);
            } else {
                abstractC2395a0.mo14781h(i, (zzgk) objZzc);
            }
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: C */
    public final void mo165797C(int i, long j) throws IOException {
        this.f167083a.mo14796w(i, j);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: D */
    public final void mo165798D(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f167083a.mo14781h(i, (zzgk) list.get(i2));
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: E */
    public final void mo165799E(int i, long j) throws IOException {
        this.f167083a.mo14796w(i, j);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: F */
    public final void mo165800F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14786m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14772a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14772a += AbstractC2395a0.m14772a(((Integer) list.get(i3)).intValue());
            }
            this.f167083a.mo14795v(iM14772a);
            while (i2 < list.size()) {
                this.f167083a.mo14787n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                this.f167083a.mo14786m(i, crx0Var.m112093c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14772a2 = 0;
        for (int i4 = 0; i4 < crx0Var.size(); i4++) {
            iM14772a2 += AbstractC2395a0.m14772a(crx0Var.m112093c(i4));
        }
        this.f167083a.mo14795v(iM14772a2);
        while (i2 < crx0Var.size()) {
            this.f167083a.mo14787n(crx0Var.m112093c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: G */
    public final void mo165801G(int i, int i2) throws IOException {
        this.f167083a.mo14786m(i, i2);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: H */
    public final void mo165802H(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof dux0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14796w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14772a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14772a += AbstractC2395a0.m14772a(((Long) list.get(i3)).longValue());
            }
            this.f167083a.mo14795v(iM14772a);
            while (i2 < list.size()) {
                this.f167083a.mo14797x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dux0 dux0Var = (dux0) list;
        if (!z) {
            while (i2 < dux0Var.size()) {
                this.f167083a.mo14796w(i, dux0Var.m118227c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14772a2 = 0;
        for (int i4 = 0; i4 < dux0Var.size(); i4++) {
            iM14772a2 += AbstractC2395a0.m14772a(dux0Var.m118227c(i4));
        }
        this.f167083a.mo14795v(iM14772a2);
        while (i2 < dux0Var.size()) {
            this.f167083a.mo14797x(dux0Var.m118227c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: I */
    public final void mo165803I(int i, int i2) throws IOException {
        this.f167083a.mo14782i(i, i2);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: J */
    public final void mo165804J(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof amx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14782i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14783j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        amx0 amx0Var = (amx0) list;
        if (!z) {
            while (i2 < amx0Var.size()) {
                this.f167083a.mo14782i(i, Float.floatToRawIntBits(amx0Var.m98879c(i2)));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < amx0Var.size(); i6++) {
            amx0Var.m98879c(i6);
            i5 += 4;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < amx0Var.size()) {
            this.f167083a.mo14783j(Float.floatToRawIntBits(amx0Var.m98879c(i2)));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: K */
    public final void mo165805K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14782i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14783j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                this.f167083a.mo14782i(i, crx0Var.m112093c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < crx0Var.size(); i6++) {
            crx0Var.m112093c(i6);
            i5 += 4;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < crx0Var.size()) {
            this.f167083a.mo14783j(crx0Var.m112093c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: L */
    public final void mo165806L(int i, long j) throws IOException {
        this.f167083a.mo14784k(i, j);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: M */
    public final void mo165807M(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof dux0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14796w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14772a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14772a += AbstractC2395a0.m14772a(((Long) list.get(i3)).longValue());
            }
            this.f167083a.mo14795v(iM14772a);
            while (i2 < list.size()) {
                this.f167083a.mo14797x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dux0 dux0Var = (dux0) list;
        if (!z) {
            while (i2 < dux0Var.size()) {
                this.f167083a.mo14796w(i, dux0Var.m118227c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14772a2 = 0;
        for (int i4 = 0; i4 < dux0Var.size(); i4++) {
            iM14772a2 += AbstractC2395a0.m14772a(dux0Var.m118227c(i4));
        }
        this.f167083a.mo14795v(iM14772a2);
        while (i2 < dux0Var.size()) {
            this.f167083a.mo14797x(dux0Var.m118227c(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p153l.o2y0
    /* JADX INFO: renamed from: a */
    public final void mo165808a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof hsw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14780g(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14779f(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        hsw0 hsw0Var = (hsw0) list;
        if (!z) {
            while (i2 < hsw0Var.size()) {
                this.f167083a.mo14780g(i, hsw0Var.m137044f(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hsw0Var.size(); i6++) {
            hsw0Var.m137044f(i6);
            i5++;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < hsw0Var.size()) {
            this.f167083a.mo14779f(hsw0Var.m137044f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: c */
    public final void mo165809c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14782i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14783j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                this.f167083a.mo14782i(i, crx0Var.m112093c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < crx0Var.size(); i6++) {
            crx0Var.m112093c(i6);
            i5 += 4;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < crx0Var.size()) {
            this.f167083a.mo14783j(crx0Var.m112093c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: f */
    public final void mo165810f(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14786m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14772a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14772a += AbstractC2395a0.m14772a(((Integer) list.get(i3)).intValue());
            }
            this.f167083a.mo14795v(iM14772a);
            while (i2 < list.size()) {
                this.f167083a.mo14787n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                this.f167083a.mo14786m(i, crx0Var.m112093c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14772a2 = 0;
        for (int i4 = 0; i4 < crx0Var.size(); i4++) {
            iM14772a2 += AbstractC2395a0.m14772a(crx0Var.m112093c(i4));
        }
        this.f167083a.mo14795v(iM14772a2);
        while (i2 < crx0Var.size()) {
            this.f167083a.mo14787n(crx0Var.m112093c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: g */
    public final void mo165811g(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof pbx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14784k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14785l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        pbx0 pbx0Var = (pbx0) list;
        if (!z) {
            while (i2 < pbx0Var.size()) {
                this.f167083a.mo14784k(i, Double.doubleToRawLongBits(pbx0Var.m171535c(i2)));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pbx0Var.size(); i6++) {
            pbx0Var.m171535c(i6);
            i5 += 8;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < pbx0Var.size()) {
            this.f167083a.mo14785l(Double.doubleToRawLongBits(pbx0Var.m171535c(i2)));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: h */
    public final void mo165812h(int i, long j) throws IOException {
        this.f167083a.mo14784k(i, j);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: i */
    public final void mo165813i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof dux0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14784k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14785l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dux0 dux0Var = (dux0) list;
        if (!z) {
            while (i2 < dux0Var.size()) {
                this.f167083a.mo14784k(i, dux0Var.m118227c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dux0Var.size(); i6++) {
            dux0Var.m118227c(i6);
            i5 += 8;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < dux0Var.size()) {
            this.f167083a.mo14785l(dux0Var.m118227c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: j */
    public final void mo165814j(int i, String str) throws IOException {
        this.f167083a.mo14792s(i, str);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: k */
    public final void mo165815k(int i, boolean z) throws IOException {
        this.f167083a.mo14780g(i, z);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: l */
    public final void mo165816l(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof dux0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14784k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f167083a.mo14795v(i3);
            while (i2 < list.size()) {
                this.f167083a.mo14785l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dux0 dux0Var = (dux0) list;
        if (!z) {
            while (i2 < dux0Var.size()) {
                this.f167083a.mo14784k(i, dux0Var.m118227c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dux0Var.size(); i6++) {
            dux0Var.m118227c(i6);
            i5 += 8;
        }
        this.f167083a.mo14795v(i5);
        while (i2 < dux0Var.size()) {
            this.f167083a.mo14785l(dux0Var.m118227c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: m */
    public final void mo165817m(int i, double d) throws IOException {
        this.f167083a.mo14784k(i, Double.doubleToRawLongBits(d));
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: n */
    public final void mo165818n(int i, long j) throws IOException {
        AbstractC2395a0 abstractC2395a0 = this.f167083a;
        abstractC2395a0.mo14796w(i, (j >> 63) ^ (j + j));
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: o */
    public final void mo165819o(int i, int i2) throws IOException {
        AbstractC2395a0 abstractC2395a0 = this.f167083a;
        abstractC2395a0.mo14794u(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p153l.o2y0
    @Deprecated
    /* JADX INFO: renamed from: p */
    public final void mo165820p(int i) throws IOException {
        this.f167083a.mo14793t(i, 3);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: q */
    public final void mo165821q(int i, int i2) throws IOException {
        this.f167083a.mo14794u(i, i2);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: r */
    public final void mo165822r(int i, int i2) throws IOException {
        this.f167083a.mo14782i(i, i2);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: s */
    public final void mo165823s(int i, Object obj, uxx0 uxx0Var) throws IOException {
        AbstractC2395a0 abstractC2395a0 = this.f167083a;
        abstractC2395a0.mo14793t(i, 3);
        uxx0Var.mo14872e((yvx0) obj, abstractC2395a0.f10343a);
        abstractC2395a0.mo14793t(i, 4);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: t */
    public final void mo165824t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f167083a.mo14794u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14771B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14771B += AbstractC2395a0.m14771B(((Integer) list.get(i3)).intValue());
            }
            this.f167083a.mo14795v(iM14771B);
            while (i2 < list.size()) {
                this.f167083a.mo14795v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                this.f167083a.mo14794u(i, crx0Var.m112093c(i2));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14771B2 = 0;
        for (int i4 = 0; i4 < crx0Var.size(); i4++) {
            iM14771B2 += AbstractC2395a0.m14771B(crx0Var.m112093c(i4));
        }
        this.f167083a.mo14795v(iM14771B2);
        while (i2 < crx0Var.size()) {
            this.f167083a.mo14795v(crx0Var.m112093c(i2));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: u */
    public final void mo165825u(int i, int i2) throws IOException {
        this.f167083a.mo14786m(i, i2);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: v */
    public final void mo165826v(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof crx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    AbstractC2395a0 abstractC2395a0 = this.f167083a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC2395a0.mo14794u(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.f167083a.mo14793t(i, 2);
            int iM14771B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM14771B += AbstractC2395a0.m14771B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f167083a.mo14795v(iM14771B);
            while (i2 < list.size()) {
                AbstractC2395a0 abstractC2395a1 = this.f167083a;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abstractC2395a1.mo14795v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        crx0 crx0Var = (crx0) list;
        if (!z) {
            while (i2 < crx0Var.size()) {
                AbstractC2395a0 abstractC2395a2 = this.f167083a;
                int iM112093c = crx0Var.m112093c(i2);
                abstractC2395a2.mo14794u(i, (iM112093c >> 31) ^ (iM112093c + iM112093c));
                i2++;
            }
            return;
        }
        this.f167083a.mo14793t(i, 2);
        int iM14771B2 = 0;
        for (int i4 = 0; i4 < crx0Var.size(); i4++) {
            int iM112093c2 = crx0Var.m112093c(i4);
            iM14771B2 += AbstractC2395a0.m14771B((iM112093c2 >> 31) ^ (iM112093c2 + iM112093c2));
        }
        this.f167083a.mo14795v(iM14771B2);
        while (i2 < crx0Var.size()) {
            AbstractC2395a0 abstractC2395a3 = this.f167083a;
            int iM112093c3 = crx0Var.m112093c(i2);
            abstractC2395a3.mo14795v((iM112093c3 >> 31) ^ (iM112093c3 + iM112093c3));
            i2++;
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: w */
    public final void mo165827w(int i, float f) throws IOException {
        this.f167083a.mo14782i(i, Float.floatToRawIntBits(f));
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: x */
    public final void mo165828x(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzgk;
        AbstractC2395a0 abstractC2395a0 = this.f167083a;
        if (z) {
            abstractC2395a0.mo14791r(i, (zzgk) obj);
        } else {
            abstractC2395a0.mo14790q(i, (yvx0) obj);
        }
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: y */
    public final void mo165829y(int i, zzgk zzgkVar) throws IOException {
        this.f167083a.mo14781h(i, zzgkVar);
    }

    @Override // p153l.o2y0
    /* JADX INFO: renamed from: z */
    public final void mo165830z(int i, Object obj, uxx0 uxx0Var) throws IOException {
        this.f167083a.mo14789p(i, (yvx0) obj, uxx0Var);
    }

    @Override // p153l.o2y0
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f167083a.mo14793t(i, 4);
    }
}
