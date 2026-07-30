package p149l;

import com.google.android.gms.internal.ads.AbstractC2214o5;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z7x0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2214o5 f202082a;

    public z7x0(AbstractC2214o5 abstractC2214o5) {
        Charset charset = aax0.f68607a;
        this.f202082a = abstractC2214o5;
        abstractC2214o5.f10018a = this;
    }

    /* JADX INFO: renamed from: l */
    public static z7x0 m217506l(AbstractC2214o5 abstractC2214o5) {
        z7x0 z7x0Var = abstractC2214o5.f10018a;
        return z7x0Var != null ? z7x0Var : new z7x0(abstractC2214o5);
    }

    /* JADX INFO: renamed from: A */
    public final void m217507A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12917l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12918m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m217508B(int i, Object obj, obx0 obx0Var) throws IOException {
        AbstractC2214o5 abstractC2214o5 = this.f202082a;
        abstractC2214o5.mo12925t(i, 3);
        obx0Var.mo13288e((zax0) obj, abstractC2214o5.f10018a);
        abstractC2214o5.mo12925t(i, 4);
    }

    /* JADX INFO: renamed from: C */
    public final void m217509C(int i, int i2) throws IOException {
        this.f202082a.mo12921p(i, i2);
    }

    /* JADX INFO: renamed from: D */
    public final void m217510D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12921p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13096b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13096b += AbstractC2214o5.m13096b(((Integer) list.get(i3)).intValue());
        }
        this.f202082a.mo12927v(iM13096b);
        while (i2 < list.size()) {
            this.f202082a.mo12922q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m217511E(int i, long j) throws IOException {
        this.f202082a.mo12928w(i, j);
    }

    /* JADX INFO: renamed from: F */
    public final void m217512F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12928w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13096b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13096b += AbstractC2214o5.m13096b(((Long) list.get(i3)).longValue());
        }
        this.f202082a.mo12927v(iM13096b);
        while (i2 < list.size()) {
            this.f202082a.mo12929x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m217513G(int i, Object obj, obx0 obx0Var) throws IOException {
        this.f202082a.mo12923r(i, (zax0) obj, obx0Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m217514H(int i, int i2) throws IOException {
        this.f202082a.mo12917l(i, i2);
    }

    /* JADX INFO: renamed from: I */
    public final void m217515I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12917l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12918m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m217516J(int i, long j) throws IOException {
        this.f202082a.mo12919n(i, j);
    }

    /* JADX INFO: renamed from: K */
    public final void m217517K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12919n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12920o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m217518a(int i, int i2) throws IOException {
        AbstractC2214o5 abstractC2214o5 = this.f202082a;
        abstractC2214o5.mo12926u(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* JADX INFO: renamed from: b */
    public final void m217519b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC2214o5 abstractC2214o5 = this.f202082a;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                abstractC2214o5.mo12926u(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13095B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM13095B += AbstractC2214o5.m13095B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f202082a.mo12927v(iM13095B);
        while (i2 < list.size()) {
            AbstractC2214o5 abstractC2214o6 = this.f202082a;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC2214o6.mo12927v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m217520c(int i, long j) throws IOException {
        AbstractC2214o5 abstractC2214o5 = this.f202082a;
        abstractC2214o5.mo12928w(i, (j >> 63) ^ (j + j));
    }

    /* JADX INFO: renamed from: d */
    public final void m217521d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC2214o5 abstractC2214o5 = this.f202082a;
                long jLongValue = ((Long) list.get(i2)).longValue();
                abstractC2214o5.mo12928w(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13096b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM13096b += AbstractC2214o5.m13096b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f202082a.mo12927v(iM13096b);
        while (i2 < list.size()) {
            AbstractC2214o5 abstractC2214o6 = this.f202082a;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC2214o6.mo12929x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m217522e(int i) throws IOException {
        this.f202082a.mo12925t(i, 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m217523f(int i, String str) throws IOException {
        this.f202082a.mo12924s(i, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m217524g(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof dax0)) {
            while (i2 < list.size()) {
                this.f202082a.mo12924s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        dax0 dax0Var = (dax0) list;
        while (i2 < list.size()) {
            Object objZzf = dax0Var.zzf(i2);
            boolean z = objZzf instanceof String;
            AbstractC2214o5 abstractC2214o5 = this.f202082a;
            if (z) {
                abstractC2214o5.mo12924s(i, (String) objZzf);
            } else {
                abstractC2214o5.mo12915j(i, (zzgyl) objZzf);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m217525h(int i, int i2) throws IOException {
        this.f202082a.mo12926u(i, i2);
    }

    /* JADX INFO: renamed from: i */
    public final void m217526i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12926u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13095B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13095B += AbstractC2214o5.m13095B(((Integer) list.get(i3)).intValue());
        }
        this.f202082a.mo12927v(iM13095B);
        while (i2 < list.size()) {
            this.f202082a.mo12927v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m217527j(int i, long j) throws IOException {
        this.f202082a.mo12928w(i, j);
    }

    /* JADX INFO: renamed from: k */
    public final void m217528k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12928w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13096b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13096b += AbstractC2214o5.m13096b(((Long) list.get(i3)).longValue());
        }
        this.f202082a.mo12927v(iM13096b);
        while (i2 < list.size()) {
            this.f202082a.mo12929x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m217529m(int i, boolean z) throws IOException {
        this.f202082a.mo12914i(i, z);
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
    /* JADX INFO: renamed from: n */
    public final void m217530n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12914i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12913h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m217531o(int i, zzgyl zzgylVar) throws IOException {
        this.f202082a.mo12915j(i, zzgylVar);
    }

    /* JADX INFO: renamed from: p */
    public final void m217532p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f202082a.mo12915j(i, (zzgyl) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m217533q(int i, double d) throws IOException {
        this.f202082a.mo12919n(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: r */
    public final void m217534r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12919n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12920o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public final void m217535s(int i) throws IOException {
        this.f202082a.mo12925t(i, 4);
    }

    /* JADX INFO: renamed from: t */
    public final void m217536t(int i, int i2) throws IOException {
        this.f202082a.mo12921p(i, i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m217537u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12921p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int iM13096b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13096b += AbstractC2214o5.m13096b(((Integer) list.get(i3)).intValue());
        }
        this.f202082a.mo12927v(iM13096b);
        while (i2 < list.size()) {
            this.f202082a.mo12922q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m217538v(int i, int i2) throws IOException {
        this.f202082a.mo12917l(i, i2);
    }

    /* JADX INFO: renamed from: w */
    public final void m217539w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12917l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12918m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m217540x(int i, long j) throws IOException {
        this.f202082a.mo12919n(i, j);
    }

    /* JADX INFO: renamed from: y */
    public final void m217541y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f202082a.mo12919n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f202082a.mo12925t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f202082a.mo12927v(i3);
        while (i2 < list.size()) {
            this.f202082a.mo12920o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m217542z(int i, float f) throws IOException {
        this.f202082a.mo12917l(i, Float.floatToRawIntBits(f));
    }
}
