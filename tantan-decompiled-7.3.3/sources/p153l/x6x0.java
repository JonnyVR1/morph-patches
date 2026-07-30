package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class x6x0 {

    /* JADX INFO: renamed from: a */
    public final Map f192647a;

    /* JADX INFO: renamed from: b */
    public final Map f192648b;

    public /* synthetic */ x6x0(b7x0 b7x0Var, w6x0 w6x0Var) {
        this.f192647a = new HashMap(b7x0Var.f75345a);
        this.f192648b = new HashMap(b7x0Var.f75346b);
    }

    /* JADX INFO: renamed from: a */
    public final x6x0 m209561a(v6x0 v6x0Var) throws GeneralSecurityException {
        if (v6x0Var == null) {
            mnd0.m159157a("primitive constructor must be non-null");
            return null;
        }
        z6x0 z6x0Var = new z6x0(v6x0Var.m200156c(), v6x0Var.m200157d(), null);
        boolean zContainsKey = this.f192647a.containsKey(z6x0Var);
        Map map = this.f192647a;
        if (!zContainsKey) {
            map.put(z6x0Var, v6x0Var);
            return this;
        }
        v6x0 v6x0Var2 = (v6x0) map.get(z6x0Var);
        if (v6x0Var2.equals(v6x0Var) && v6x0Var.equals(v6x0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(z6x0Var.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final x6x0 m209562b(txw0 txw0Var) throws GeneralSecurityException {
        Map map = this.f192648b;
        Class clsZzb = txw0Var.zzb();
        boolean zContainsKey = map.containsKey(clsZzb);
        Map map2 = this.f192648b;
        if (!zContainsKey) {
            map2.put(clsZzb, txw0Var);
            return this;
        }
        txw0 txw0Var2 = (txw0) map2.get(clsZzb);
        if (txw0Var2.equals(txw0Var) && txw0Var.equals(txw0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public /* synthetic */ x6x0(w6x0 w6x0Var) {
        this.f192647a = new HashMap();
        this.f192648b = new HashMap();
    }
}
