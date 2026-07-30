package p153l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class wyy0 {

    /* JADX INFO: renamed from: a */
    public final ifr0 f191716a;

    /* JADX INFO: renamed from: b */
    public final Map f191717b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Set f191718c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final Map f191719d = new HashMap();

    /* JADX INFO: renamed from: e */
    public kdx0 f191720e;

    public wyy0(ifr0 ifr0Var) {
        this.f191716a = ifr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m208631a(kdx0 kdx0Var) {
        if (kdx0Var != this.f191720e) {
            this.f191720e = kdx0Var;
            this.f191717b.clear();
            this.f191719d.clear();
        }
    }
}
