package p149l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jct0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f117346a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f117347b;

    public jct0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f117346a = ehx0Var;
        this.f117347b = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        hqu0 hqu0Var = (hqu0) this.f117346a.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        Set setSingleton = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131882D1)).booleanValue() ? Collections.singleton(new s6u0(hqu0Var, rmw0Var)) : Collections.EMPTY_SET;
        wgx0.m203089b(setSingleton);
        return setSingleton;
    }
}
