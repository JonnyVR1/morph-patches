package p153l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class bvu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f78638a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f78639b;

    public bvu0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f78638a = kqx0Var;
        this.f78639b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Set setSingleton = ((Boolean) jas0.m144075c().m176505a(sgs0.f168088O4)).booleanValue() ? Collections.singleton(new yfu0(((awu0) this.f78639b).zzb(), xvw0Var)) : Collections.EMPTY_SET;
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
