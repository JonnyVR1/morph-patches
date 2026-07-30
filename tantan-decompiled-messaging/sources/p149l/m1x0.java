package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2372a0;
import com.google.android.gms.internal.play_billing.zzgk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m1x0 implements itx0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2372a0 f130861a;

    public m1x0(AbstractC2372a0 abstractC2372a0) {
        Charset charset = mix0.f134047a;
        this.f130861a = abstractC2372a0;
        abstractC2372a0.f10306a = this;
    }

    /* JADX INFO: renamed from: b */
    public static m1x0 m152625b(AbstractC2372a0 abstractC2372a0) {
        m1x0 m1x0Var = abstractC2372a0.f10306a;
        return m1x0Var != null ? m1x0Var : new m1x0(abstractC2372a0);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: A */
    public final void mo138278A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof xkx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    AbstractC2372a0 abstractC2372a0 = this.f130861a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC2372a0.mo14742w(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14718a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM14718a += AbstractC2372a0.m14718a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f130861a.mo14741v(iM14718a);
            while (i2 < list.size()) {
                AbstractC2372a0 abstractC2372a1 = this.f130861a;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abstractC2372a1.mo14743x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        xkx0 xkx0Var = (xkx0) list;
        if (!z) {
            while (i2 < xkx0Var.size()) {
                AbstractC2372a0 abstractC2372a2 = this.f130861a;
                long jM209836c = xkx0Var.m209836c(i2);
                abstractC2372a2.mo14742w(i, (jM209836c >> 63) ^ (jM209836c + jM209836c));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14718a2 = 0;
        for (int i4 = 0; i4 < xkx0Var.size(); i4++) {
            long jM209836c2 = xkx0Var.m209836c(i4);
            iM14718a2 += AbstractC2372a0.m14718a((jM209836c2 >> 63) ^ (jM209836c2 + jM209836c2));
        }
        this.f130861a.mo14741v(iM14718a2);
        while (i2 < xkx0Var.size()) {
            AbstractC2372a0 abstractC2372a3 = this.f130861a;
            long jM209836c3 = xkx0Var.m209836c(i2);
            abstractC2372a3.mo14743x((jM209836c3 >> 63) ^ (jM209836c3 + jM209836c3));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: B */
    public final void mo138279B(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof tjx0)) {
            while (i2 < list.size()) {
                this.f130861a.mo14738s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        tjx0 tjx0Var = (tjx0) list;
        while (i2 < list.size()) {
            Object objZzc = tjx0Var.zzc();
            boolean z = objZzc instanceof String;
            AbstractC2372a0 abstractC2372a0 = this.f130861a;
            if (z) {
                abstractC2372a0.mo14738s(i, (String) objZzc);
            } else {
                abstractC2372a0.mo14727h(i, (zzgk) objZzc);
            }
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: C */
    public final void mo138280C(int i, long j) throws IOException {
        this.f130861a.mo14742w(i, j);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: D */
    public final void mo138281D(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f130861a.mo14727h(i, (zzgk) list.get(i2));
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: E */
    public final void mo138282E(int i, long j) throws IOException {
        this.f130861a.mo14742w(i, j);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: F */
    public final void mo138283F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14732m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14718a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14718a += AbstractC2372a0.m14718a(((Integer) list.get(i3)).intValue());
            }
            this.f130861a.mo14741v(iM14718a);
            while (i2 < list.size()) {
                this.f130861a.mo14733n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                this.f130861a.mo14732m(i, whx0Var.m203255c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14718a2 = 0;
        for (int i4 = 0; i4 < whx0Var.size(); i4++) {
            iM14718a2 += AbstractC2372a0.m14718a(whx0Var.m203255c(i4));
        }
        this.f130861a.mo14741v(iM14718a2);
        while (i2 < whx0Var.size()) {
            this.f130861a.mo14733n(whx0Var.m203255c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: G */
    public final void mo138284G(int i, int i2) throws IOException {
        this.f130861a.mo14732m(i, i2);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: H */
    public final void mo138285H(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof xkx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14742w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14718a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14718a += AbstractC2372a0.m14718a(((Long) list.get(i3)).longValue());
            }
            this.f130861a.mo14741v(iM14718a);
            while (i2 < list.size()) {
                this.f130861a.mo14743x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xkx0 xkx0Var = (xkx0) list;
        if (!z) {
            while (i2 < xkx0Var.size()) {
                this.f130861a.mo14742w(i, xkx0Var.m209836c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14718a2 = 0;
        for (int i4 = 0; i4 < xkx0Var.size(); i4++) {
            iM14718a2 += AbstractC2372a0.m14718a(xkx0Var.m209836c(i4));
        }
        this.f130861a.mo14741v(iM14718a2);
        while (i2 < xkx0Var.size()) {
            this.f130861a.mo14743x(xkx0Var.m209836c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: I */
    public final void mo138286I(int i, int i2) throws IOException {
        this.f130861a.mo14728i(i, i2);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: J */
    public final void mo138287J(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof ucx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14728i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14729j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ucx0 ucx0Var = (ucx0) list;
        if (!z) {
            while (i2 < ucx0Var.size()) {
                this.f130861a.mo14728i(i, Float.floatToRawIntBits(ucx0Var.m193109c(i2)));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ucx0Var.size(); i6++) {
            ucx0Var.m193109c(i6);
            i5 += 4;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < ucx0Var.size()) {
            this.f130861a.mo14729j(Float.floatToRawIntBits(ucx0Var.m193109c(i2)));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: K */
    public final void mo138288K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14728i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14729j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                this.f130861a.mo14728i(i, whx0Var.m203255c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < whx0Var.size(); i6++) {
            whx0Var.m203255c(i6);
            i5 += 4;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < whx0Var.size()) {
            this.f130861a.mo14729j(whx0Var.m203255c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: L */
    public final void mo138289L(int i, long j) throws IOException {
        this.f130861a.mo14730k(i, j);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: M */
    public final void mo138290M(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof xkx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14742w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14718a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14718a += AbstractC2372a0.m14718a(((Long) list.get(i3)).longValue());
            }
            this.f130861a.mo14741v(iM14718a);
            while (i2 < list.size()) {
                this.f130861a.mo14743x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xkx0 xkx0Var = (xkx0) list;
        if (!z) {
            while (i2 < xkx0Var.size()) {
                this.f130861a.mo14742w(i, xkx0Var.m209836c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14718a2 = 0;
        for (int i4 = 0; i4 < xkx0Var.size(); i4++) {
            iM14718a2 += AbstractC2372a0.m14718a(xkx0Var.m209836c(i4));
        }
        this.f130861a.mo14741v(iM14718a2);
        while (i2 < xkx0Var.size()) {
            this.f130861a.mo14743x(xkx0Var.m209836c(i2));
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
    @Override // p149l.itx0
    /* JADX INFO: renamed from: a */
    public final void mo138291a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof bjw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14726g(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14725f(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        bjw0 bjw0Var = (bjw0) list;
        if (!z) {
            while (i2 < bjw0Var.size()) {
                this.f130861a.mo14726g(i, bjw0Var.m102239f(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bjw0Var.size(); i6++) {
            bjw0Var.m102239f(i6);
            i5++;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < bjw0Var.size()) {
            this.f130861a.mo14725f(bjw0Var.m102239f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: c */
    public final void mo138292c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14728i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14729j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                this.f130861a.mo14728i(i, whx0Var.m203255c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < whx0Var.size(); i6++) {
            whx0Var.m203255c(i6);
            i5 += 4;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < whx0Var.size()) {
            this.f130861a.mo14729j(whx0Var.m203255c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: f */
    public final void mo138293f(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14732m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14718a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14718a += AbstractC2372a0.m14718a(((Integer) list.get(i3)).intValue());
            }
            this.f130861a.mo14741v(iM14718a);
            while (i2 < list.size()) {
                this.f130861a.mo14733n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                this.f130861a.mo14732m(i, whx0Var.m203255c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14718a2 = 0;
        for (int i4 = 0; i4 < whx0Var.size(); i4++) {
            iM14718a2 += AbstractC2372a0.m14718a(whx0Var.m203255c(i4));
        }
        this.f130861a.mo14741v(iM14718a2);
        while (i2 < whx0Var.size()) {
            this.f130861a.mo14733n(whx0Var.m203255c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: g */
    public final void mo138294g(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof j2x0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14730k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14731l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        j2x0 j2x0Var = (j2x0) list;
        if (!z) {
            while (i2 < j2x0Var.size()) {
                this.f130861a.mo14730k(i, Double.doubleToRawLongBits(j2x0Var.m139508c(i2)));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j2x0Var.size(); i6++) {
            j2x0Var.m139508c(i6);
            i5 += 8;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < j2x0Var.size()) {
            this.f130861a.mo14731l(Double.doubleToRawLongBits(j2x0Var.m139508c(i2)));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: h */
    public final void mo138295h(int i, long j) throws IOException {
        this.f130861a.mo14730k(i, j);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: i */
    public final void mo138296i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof xkx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14730k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14731l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xkx0 xkx0Var = (xkx0) list;
        if (!z) {
            while (i2 < xkx0Var.size()) {
                this.f130861a.mo14730k(i, xkx0Var.m209836c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < xkx0Var.size(); i6++) {
            xkx0Var.m209836c(i6);
            i5 += 8;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < xkx0Var.size()) {
            this.f130861a.mo14731l(xkx0Var.m209836c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: j */
    public final void mo138297j(int i, String str) throws IOException {
        this.f130861a.mo14738s(i, str);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: k */
    public final void mo138298k(int i, boolean z) throws IOException {
        this.f130861a.mo14726g(i, z);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: l */
    public final void mo138299l(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof xkx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14730k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.f130861a.mo14741v(i3);
            while (i2 < list.size()) {
                this.f130861a.mo14731l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xkx0 xkx0Var = (xkx0) list;
        if (!z) {
            while (i2 < xkx0Var.size()) {
                this.f130861a.mo14730k(i, xkx0Var.m209836c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < xkx0Var.size(); i6++) {
            xkx0Var.m209836c(i6);
            i5 += 8;
        }
        this.f130861a.mo14741v(i5);
        while (i2 < xkx0Var.size()) {
            this.f130861a.mo14731l(xkx0Var.m209836c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: m */
    public final void mo138300m(int i, double d) throws IOException {
        this.f130861a.mo14730k(i, Double.doubleToRawLongBits(d));
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: n */
    public final void mo138301n(int i, long j) throws IOException {
        AbstractC2372a0 abstractC2372a0 = this.f130861a;
        abstractC2372a0.mo14742w(i, (j >> 63) ^ (j + j));
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: o */
    public final void mo138302o(int i, int i2) throws IOException {
        AbstractC2372a0 abstractC2372a0 = this.f130861a;
        abstractC2372a0.mo14740u(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p149l.itx0
    @Deprecated
    /* JADX INFO: renamed from: p */
    public final void mo138303p(int i) throws IOException {
        this.f130861a.mo14739t(i, 3);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: q */
    public final void mo138304q(int i, int i2) throws IOException {
        this.f130861a.mo14740u(i, i2);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: r */
    public final void mo138305r(int i, int i2) throws IOException {
        this.f130861a.mo14728i(i, i2);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: s */
    public final void mo138306s(int i, Object obj, oox0 oox0Var) throws IOException {
        AbstractC2372a0 abstractC2372a0 = this.f130861a;
        abstractC2372a0.mo14739t(i, 3);
        oox0Var.mo14818e((smx0) obj, abstractC2372a0.f10306a);
        abstractC2372a0.mo14739t(i, 4);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: t */
    public final void mo138307t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f130861a.mo14740u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14717B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14717B += AbstractC2372a0.m14717B(((Integer) list.get(i3)).intValue());
            }
            this.f130861a.mo14741v(iM14717B);
            while (i2 < list.size()) {
                this.f130861a.mo14741v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                this.f130861a.mo14740u(i, whx0Var.m203255c(i2));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14717B2 = 0;
        for (int i4 = 0; i4 < whx0Var.size(); i4++) {
            iM14717B2 += AbstractC2372a0.m14717B(whx0Var.m203255c(i4));
        }
        this.f130861a.mo14741v(iM14717B2);
        while (i2 < whx0Var.size()) {
            this.f130861a.mo14741v(whx0Var.m203255c(i2));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: u */
    public final void mo138308u(int i, int i2) throws IOException {
        this.f130861a.mo14732m(i, i2);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: v */
    public final void mo138309v(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof whx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    AbstractC2372a0 abstractC2372a0 = this.f130861a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC2372a0.mo14740u(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.f130861a.mo14739t(i, 2);
            int iM14717B = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM14717B += AbstractC2372a0.m14717B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f130861a.mo14741v(iM14717B);
            while (i2 < list.size()) {
                AbstractC2372a0 abstractC2372a1 = this.f130861a;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abstractC2372a1.mo14741v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        whx0 whx0Var = (whx0) list;
        if (!z) {
            while (i2 < whx0Var.size()) {
                AbstractC2372a0 abstractC2372a2 = this.f130861a;
                int iM203255c = whx0Var.m203255c(i2);
                abstractC2372a2.mo14740u(i, (iM203255c >> 31) ^ (iM203255c + iM203255c));
                i2++;
            }
            return;
        }
        this.f130861a.mo14739t(i, 2);
        int iM14717B2 = 0;
        for (int i4 = 0; i4 < whx0Var.size(); i4++) {
            int iM203255c2 = whx0Var.m203255c(i4);
            iM14717B2 += AbstractC2372a0.m14717B((iM203255c2 >> 31) ^ (iM203255c2 + iM203255c2));
        }
        this.f130861a.mo14741v(iM14717B2);
        while (i2 < whx0Var.size()) {
            AbstractC2372a0 abstractC2372a3 = this.f130861a;
            int iM203255c3 = whx0Var.m203255c(i2);
            abstractC2372a3.mo14741v((iM203255c3 >> 31) ^ (iM203255c3 + iM203255c3));
            i2++;
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: w */
    public final void mo138310w(int i, float f) throws IOException {
        this.f130861a.mo14728i(i, Float.floatToRawIntBits(f));
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: x */
    public final void mo138311x(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzgk;
        AbstractC2372a0 abstractC2372a0 = this.f130861a;
        if (z) {
            abstractC2372a0.mo14737r(i, (zzgk) obj);
        } else {
            abstractC2372a0.mo14736q(i, (smx0) obj);
        }
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: y */
    public final void mo138312y(int i, zzgk zzgkVar) throws IOException {
        this.f130861a.mo14727h(i, zzgkVar);
    }

    @Override // p149l.itx0
    /* JADX INFO: renamed from: z */
    public final void mo138313z(int i, Object obj, oox0 oox0Var) throws IOException {
        this.f130861a.mo14735p(i, (smx0) obj, oox0Var);
    }

    @Override // p149l.itx0
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f130861a.mo14739t(i, 4);
    }
}
