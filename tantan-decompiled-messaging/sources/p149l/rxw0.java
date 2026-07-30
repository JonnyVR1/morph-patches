package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rxw0 {

    /* JADX INFO: renamed from: a */
    public final Map f161519a;

    /* JADX INFO: renamed from: b */
    public final Map f161520b;

    public /* synthetic */ rxw0(vxw0 vxw0Var, qxw0 qxw0Var) {
        this.f161519a = new HashMap(vxw0Var.f183480a);
        this.f161520b = new HashMap(vxw0Var.f183481b);
    }

    /* JADX INFO: renamed from: a */
    public final rxw0 m181652a(pxw0 pxw0Var) throws GeneralSecurityException {
        if (pxw0Var == null) {
            jfd0.m141176a("primitive constructor must be non-null");
            return null;
        }
        txw0 txw0Var = new txw0(pxw0Var.m171959c(), pxw0Var.m171960d(), null);
        boolean zContainsKey = this.f161519a.containsKey(txw0Var);
        Map map = this.f161519a;
        if (!zContainsKey) {
            map.put(txw0Var, pxw0Var);
            return this;
        }
        pxw0 pxw0Var2 = (pxw0) map.get(txw0Var);
        if (pxw0Var2.equals(pxw0Var) && pxw0Var.equals(pxw0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(txw0Var.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final rxw0 m181653b(now0 now0Var) throws GeneralSecurityException {
        Map map = this.f161520b;
        Class clsZzb = now0Var.zzb();
        boolean zContainsKey = map.containsKey(clsZzb);
        Map map2 = this.f161520b;
        if (!zContainsKey) {
            map2.put(clsZzb, now0Var);
            return this;
        }
        now0 now0Var2 = (now0) map2.get(clsZzb);
        if (now0Var2.equals(now0Var) && now0Var.equals(now0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public /* synthetic */ rxw0(qxw0 qxw0Var) {
        this.f161519a = new HashMap();
        this.f161520b = new HashMap();
    }
}
