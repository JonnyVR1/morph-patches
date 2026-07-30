package p149l;

import com.google.android.gms.internal.ads.C2260u3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mqt0 implements z7v0 {

    /* JADX INFO: renamed from: a */
    public final List f135293a;

    public mqt0(eqt0 eqt0Var) {
        this.f135293a = Collections.singletonList(jmw0.m142235h(eqt0Var));
    }

    @Override // p149l.z7v0
    /* JADX INFO: renamed from: a */
    public final void mo117797a() {
        Iterator it = this.f135293a.iterator();
        while (it.hasNext()) {
            jmw0.m142245r((gnr) it.next(), new lqt0(this), C2260u3.m13341b());
        }
    }

    public mqt0(List list) {
        this.f135293a = list;
    }
}
