package p153l;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class wvu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f190989a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f190990b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f190991c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f190992d;

    public wvu0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f190989a = kqx0Var;
        this.f190990b = kqx0Var2;
        this.f190991c = kqx0Var3;
        this.f190992d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String str = (String) this.f190989a.zzb();
        Context contextM146114a = ((jlt0) this.f190990b).m146114a();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        Map mapZzb = ((ypx0) this.f190992d).zzb();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168088O4)).booleanValue()) {
            fcs0 fcs0Var = new fcs0(new lcs0(contextM146114a));
            fcs0Var.m125046b(new ecs0() { // from class: l.xvu0
                @Override // p153l.ecs0
                /* JADX INFO: renamed from: a */
                public final void mo12872a(yds0 yds0Var) {
                    yds0Var.m215287x(str);
                }
            });
            setSingleton = Collections.singleton(new yfu0(new zvu0(fcs0Var, mapZzb), xvw0Var));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        cqx0.m111999b(setSingleton);
        return setSingleton;
    }
}
