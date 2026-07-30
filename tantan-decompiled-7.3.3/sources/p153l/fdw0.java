package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fdw0 implements vcw0 {

    /* JADX INFO: renamed from: a */
    public final jdw0 f98523a;

    /* JADX INFO: renamed from: b */
    public final hdw0 f98524b;

    /* JADX INFO: renamed from: c */
    public final scw0 f98525c;

    public fdw0(scw0 scw0Var, jdw0 jdw0Var, hdw0 hdw0Var) {
        this.f98525c = scw0Var;
        this.f98523a = jdw0Var;
        this.f98524b = hdw0Var;
    }

    @Override // p153l.vcw0
    /* JADX INFO: renamed from: a */
    public final void mo125151a(ucw0 ucw0Var) {
        this.f98525c.m185394b(mo125152b(ucw0Var));
    }

    @Override // p153l.vcw0
    /* JADX INFO: renamed from: b */
    public final String mo125152b(ucw0 ucw0Var) {
        hdw0 hdw0Var = this.f98524b;
        Map mapM195452j = ucw0Var.m195452j();
        hdw0Var.m134617a(mapM195452j);
        return this.f98523a.m144502a(mapM195452j);
    }
}
