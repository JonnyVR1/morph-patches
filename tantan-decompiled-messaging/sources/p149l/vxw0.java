package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class vxw0 {

    /* JADX INFO: renamed from: a */
    public final Map f183480a;

    /* JADX INFO: renamed from: b */
    public final Map f183481b;

    public /* synthetic */ vxw0(rxw0 rxw0Var, uxw0 uxw0Var) {
        this.f183480a = new HashMap(rxw0Var.f161519a);
        this.f183481b = new HashMap(rxw0Var.f161520b);
    }

    /* JADX INFO: renamed from: a */
    public final Class m200601a(Class cls) throws GeneralSecurityException {
        if (this.f183481b.containsKey(cls)) {
            return ((now0) this.f183481b.get(cls)).zza();
        }
        fsw0.m122984a(cls, "No input primitive class for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m200602b(rnw0 rnw0Var, Class cls) throws GeneralSecurityException {
        txw0 txw0Var = new txw0(rnw0Var.getClass(), cls, null);
        if (this.f183480a.containsKey(txw0Var)) {
            return ((pxw0) this.f183480a.get(txw0Var)).mo156943a(rnw0Var);
        }
        fsw0.m122984a(txw0Var, "No PrimitiveConstructor for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m200603c(mow0 mow0Var, Class cls) throws GeneralSecurityException {
        if (!this.f183481b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        now0 now0Var = (now0) this.f183481b.get(cls);
        if (mow0Var.m155724c().equals(now0Var.zza()) && now0Var.zza().equals(mow0Var.m155724c())) {
            return now0Var.mo112933a(mow0Var);
        }
        j8w0.m140474a("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        return null;
    }
}
