package p153l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class plt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f153092a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f153093b;

    public plt0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f153092a = kqx0Var;
        this.f153093b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        nzu0 nzu0Var = (nzu0) this.f153092a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Set setSingleton = ((Boolean) jas0.m144075c().m176505a(sgs0.f167953D1)).booleanValue() ? Collections.singleton(new yfu0(nzu0Var, xvw0Var)) : Collections.EMPTY_SET;
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
