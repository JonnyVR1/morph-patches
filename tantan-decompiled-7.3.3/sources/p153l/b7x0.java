package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b7x0 {

    /* JADX INFO: renamed from: a */
    public final Map f75345a;

    /* JADX INFO: renamed from: b */
    public final Map f75346b;

    public /* synthetic */ b7x0(x6x0 x6x0Var, a7x0 a7x0Var) {
        this.f75345a = new HashMap(x6x0Var.f192647a);
        this.f75346b = new HashMap(x6x0Var.f192648b);
    }

    /* JADX INFO: renamed from: a */
    public final Class m102879a(Class cls) throws GeneralSecurityException {
        if (this.f75346b.containsKey(cls)) {
            return ((txw0) this.f75346b.get(cls)).zza();
        }
        l1x0.m152514a(cls, "No input primitive class for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m102880b(xww0 xww0Var, Class cls) throws GeneralSecurityException {
        z6x0 z6x0Var = new z6x0(xww0Var.getClass(), cls, null);
        if (this.f75345a.containsKey(z6x0Var)) {
            return ((v6x0) this.f75345a.get(z6x0Var)).mo184928a(xww0Var);
        }
        l1x0.m152514a(z6x0Var, "No PrimitiveConstructor for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m102881c(sxw0 sxw0Var, Class cls) throws GeneralSecurityException {
        if (!this.f75346b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        txw0 txw0Var = (txw0) this.f75346b.get(cls);
        if (sxw0Var.m188523c().equals(txw0Var.zza()) && txw0Var.zza().equals(sxw0Var.m188523c())) {
            return txw0Var.mo147630a(sxw0Var);
        }
        phw0.m172339a("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        return null;
    }
}
