package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class cyy implements qxy {

    /* JADX INFO: renamed from: a */
    public x20 f84410a;

    /* JADX INFO: renamed from: b */
    public boolean f84411b = true;

    public cyy(x20 x20Var) {
        this.f84410a = x20Var;
    }

    @Override // p153l.qxy
    /* JADX INFO: renamed from: a */
    public boolean mo113255a() {
        if (NullChecker.m82486a(this.f84410a)) {
            this.f84410a.call();
        }
        return this.f84411b;
    }
}
