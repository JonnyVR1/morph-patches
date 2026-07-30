package p153l;

import com.google.android.gms.internal.ads.AbstractC2237o5;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fhx0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2237o5 f99123a;

    public fhx0(AbstractC2237o5 abstractC2237o5) {
        Charset charset = gjx0.f104688a;
        this.f99123a = abstractC2237o5;
        abstractC2237o5.f10055a = this;
    }

    /* JADX INFO: renamed from: l */
    public static fhx0 m125610l(AbstractC2237o5 abstractC2237o5) {
        fhx0 fhx0Var = abstractC2237o5.f10055a;
        return fhx0Var != null ? fhx0Var : new fhx0(abstractC2237o5);
    }

    /* JADX INFO: renamed from: A */
    public final void m125611A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12971l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12972m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m125612B(int i, Object obj, ukx0 ukx0Var) throws IOException {
        AbstractC2237o5 abstractC2237o5 = this.f99123a;
        abstractC2237o5.mo12979t(i, 3);
        ukx0Var.mo13342e((fkx0) obj, abstractC2237o5.f10055a);
        abstractC2237o5.mo12979t(i, 4);
    }

    /* JADX INFO: renamed from: C */
    public final void m125613C(int i, int i2) throws IOException {
        this.f99123a.mo12975p(i, i2);
    }

    /* JADX INFO: renamed from: D */
    public final void m125614D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12975p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13150b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13150b += AbstractC2237o5.m13150b(((Integer) list.get(i3)).intValue());
        }
        this.f99123a.mo12981v(iM13150b);
        while (i2 < list.size()) {
            this.f99123a.mo12976q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m125615E(int i, long j) throws IOException {
        this.f99123a.mo12982w(i, j);
    }

    /* JADX INFO: renamed from: F */
    public final void m125616F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12982w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13150b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13150b += AbstractC2237o5.m13150b(((Long) list.get(i3)).longValue());
        }
        this.f99123a.mo12981v(iM13150b);
        while (i2 < list.size()) {
            this.f99123a.mo12983x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m125617G(int i, Object obj, ukx0 ukx0Var) throws IOException {
        this.f99123a.mo12977r(i, (fkx0) obj, ukx0Var);
    }

    /* JADX INFO: renamed from: H */
    public final void m125618H(int i, int i2) throws IOException {
        this.f99123a.mo12971l(i, i2);
    }

    /* JADX INFO: renamed from: I */
    public final void m125619I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12971l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12972m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m125620J(int i, long j) throws IOException {
        this.f99123a.mo12973n(i, j);
    }

    /* JADX INFO: renamed from: K */
    public final void m125621K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12973n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12974o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m125622a(int i, int i2) throws IOException {
        AbstractC2237o5 abstractC2237o5 = this.f99123a;
        abstractC2237o5.mo12980u(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* JADX INFO: renamed from: b */
    public final void m125623b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC2237o5 abstractC2237o5 = this.f99123a;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                abstractC2237o5.mo12980u(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13149B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM13149B += AbstractC2237o5.m13149B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f99123a.mo12981v(iM13149B);
        while (i2 < list.size()) {
            AbstractC2237o5 abstractC2237o6 = this.f99123a;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC2237o6.mo12981v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m125624c(int i, long j) throws IOException {
        AbstractC2237o5 abstractC2237o5 = this.f99123a;
        abstractC2237o5.mo12982w(i, (j >> 63) ^ (j + j));
    }

    /* JADX INFO: renamed from: d */
    public final void m125625d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                AbstractC2237o5 abstractC2237o5 = this.f99123a;
                long jLongValue = ((Long) list.get(i2)).longValue();
                abstractC2237o5.mo12982w(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13150b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM13150b += AbstractC2237o5.m13150b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f99123a.mo12981v(iM13150b);
        while (i2 < list.size()) {
            AbstractC2237o5 abstractC2237o6 = this.f99123a;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC2237o6.mo12983x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m125626e(int i) throws IOException {
        this.f99123a.mo12979t(i, 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m125627f(int i, String str) throws IOException {
        this.f99123a.mo12978s(i, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m125628g(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof jjx0)) {
            while (i2 < list.size()) {
                this.f99123a.mo12978s(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        jjx0 jjx0Var = (jjx0) list;
        while (i2 < list.size()) {
            Object objZzf = jjx0Var.zzf(i2);
            boolean z = objZzf instanceof String;
            AbstractC2237o5 abstractC2237o5 = this.f99123a;
            if (z) {
                abstractC2237o5.mo12978s(i, (String) objZzf);
            } else {
                abstractC2237o5.mo12969j(i, (zzgyl) objZzf);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m125629h(int i, int i2) throws IOException {
        this.f99123a.mo12980u(i, i2);
    }

    /* JADX INFO: renamed from: i */
    public final void m125630i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12980u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13149B = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13149B += AbstractC2237o5.m13149B(((Integer) list.get(i3)).intValue());
        }
        this.f99123a.mo12981v(iM13149B);
        while (i2 < list.size()) {
            this.f99123a.mo12981v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m125631j(int i, long j) throws IOException {
        this.f99123a.mo12982w(i, j);
    }

    /* JADX INFO: renamed from: k */
    public final void m125632k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12982w(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13150b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13150b += AbstractC2237o5.m13150b(((Long) list.get(i3)).longValue());
        }
        this.f99123a.mo12981v(iM13150b);
        while (i2 < list.size()) {
            this.f99123a.mo12983x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m125633m(int i, boolean z) throws IOException {
        this.f99123a.mo12968i(i, z);
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
    public final void m125634n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12968i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12967h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m125635o(int i, zzgyl zzgylVar) throws IOException {
        this.f99123a.mo12969j(i, zzgylVar);
    }

    /* JADX INFO: renamed from: p */
    public final void m125636p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f99123a.mo12969j(i, (zzgyl) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m125637q(int i, double d) throws IOException {
        this.f99123a.mo12973n(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: r */
    public final void m125638r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12973n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12974o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public final void m125639s(int i) throws IOException {
        this.f99123a.mo12979t(i, 4);
    }

    /* JADX INFO: renamed from: t */
    public final void m125640t(int i, int i2) throws IOException {
        this.f99123a.mo12975p(i, i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m125641u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12975p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int iM13150b = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM13150b += AbstractC2237o5.m13150b(((Integer) list.get(i3)).intValue());
        }
        this.f99123a.mo12981v(iM13150b);
        while (i2 < list.size()) {
            this.f99123a.mo12976q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m125642v(int i, int i2) throws IOException {
        this.f99123a.mo12971l(i, i2);
    }

    /* JADX INFO: renamed from: w */
    public final void m125643w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12971l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12972m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m125644x(int i, long j) throws IOException {
        this.f99123a.mo12973n(i, j);
    }

    /* JADX INFO: renamed from: y */
    public final void m125645y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f99123a.mo12973n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f99123a.mo12979t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        this.f99123a.mo12981v(i3);
        while (i2 < list.size()) {
            this.f99123a.mo12974o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m125646z(int i, float f) throws IOException {
        this.f99123a.mo12971l(i, Float.floatToRawIntBits(f));
    }
}
