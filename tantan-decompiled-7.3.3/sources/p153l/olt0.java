package p153l;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class olt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f147874a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f147875b;

    public olt0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f147874a = kqx0Var;
        this.f147875b = kqx0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        x8v0 x8v0Var = (x8v0) this.f147874a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168217Z1)).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
                setSingleton = Collections.singleton(new yfu0(x8v0Var, xvw0Var));
            } else {
                setSingleton = Collections.EMPTY_SET;
            }
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
