package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gyw0 {

    /* JADX INFO: renamed from: a */
    public final Map f105067a;

    /* JADX INFO: renamed from: b */
    public final Map f105068b;

    /* JADX INFO: renamed from: c */
    public final Map f105069c;

    /* JADX INFO: renamed from: d */
    public final Map f105070d;

    public gyw0(myw0 myw0Var) {
        this.f105067a = new HashMap(myw0Var.f136337a);
        this.f105068b = new HashMap(myw0Var.f136338b);
        this.f105069c = new HashMap(myw0Var.f136339c);
        this.f105070d = new HashMap(myw0Var.f136340d);
    }

    /* JADX INFO: renamed from: a */
    public final gyw0 m128782a(dww0 dww0Var) throws GeneralSecurityException {
        iyw0 iyw0Var = new iyw0(dww0Var.m113963d(), dww0Var.m113962c(), null);
        boolean zContainsKey = this.f105068b.containsKey(iyw0Var);
        Map map = this.f105068b;
        if (!zContainsKey) {
            map.put(iyw0Var, dww0Var);
            return this;
        }
        dww0 dww0Var2 = (dww0) map.get(iyw0Var);
        if (dww0Var2.equals(dww0Var) && dww0Var.equals(dww0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(iyw0Var.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final gyw0 m128783b(hww0 hww0Var) throws GeneralSecurityException {
        kyw0 kyw0Var = new kyw0(hww0Var.m133277c(), hww0Var.m133278d(), null);
        boolean zContainsKey = this.f105067a.containsKey(kyw0Var);
        Map map = this.f105067a;
        if (!zContainsKey) {
            map.put(kyw0Var, hww0Var);
            return this;
        }
        hww0 hww0Var2 = (hww0) map.get(kyw0Var);
        if (hww0Var2.equals(hww0Var) && hww0Var.equals(hww0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(kyw0Var.toString()));
    }

    /* JADX INFO: renamed from: c */
    public final gyw0 m128784c(hxw0 hxw0Var) throws GeneralSecurityException {
        iyw0 iyw0Var = new iyw0(hxw0Var.m133432d(), hxw0Var.m133431c(), null);
        boolean zContainsKey = this.f105070d.containsKey(iyw0Var);
        Map map = this.f105070d;
        if (!zContainsKey) {
            map.put(iyw0Var, hxw0Var);
            return this;
        }
        hxw0 hxw0Var2 = (hxw0) map.get(iyw0Var);
        if (hxw0Var2.equals(hxw0Var) && hxw0Var.equals(hxw0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(iyw0Var.toString()));
    }

    /* JADX INFO: renamed from: d */
    public final gyw0 m128785d(lxw0 lxw0Var) throws GeneralSecurityException {
        kyw0 kyw0Var = new kyw0(lxw0Var.m152105c(), lxw0Var.m152106d(), null);
        boolean zContainsKey = this.f105069c.containsKey(kyw0Var);
        Map map = this.f105069c;
        if (!zContainsKey) {
            map.put(kyw0Var, lxw0Var);
            return this;
        }
        lxw0 lxw0Var2 = (lxw0) map.get(kyw0Var);
        if (lxw0Var2.equals(lxw0Var) && lxw0Var.equals(lxw0Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(kyw0Var.toString()));
    }

    public gyw0() {
        this.f105067a = new HashMap();
        this.f105068b = new HashMap();
        this.f105069c = new HashMap();
        this.f105070d = new HashMap();
    }
}
