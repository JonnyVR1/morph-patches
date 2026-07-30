package p153l;

import com.google.android.gms.internal.ads.C2283u3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class szt0 implements fhv0 {

    /* JADX INFO: renamed from: a */
    public final List f171418a;

    public szt0(kzt0 kzt0Var) {
        this.f171418a = Collections.singletonList(pvw0.m173981h(kzt0Var));
    }

    @Override // p153l.fhv0
    /* JADX INFO: renamed from: a */
    public final void mo125604a() {
        Iterator it = this.f171418a.iterator();
        while (it.hasNext()) {
            pvw0.m173991r((hpr) it.next(), new rzt0(this), C2283u3.m13395b());
        }
    }

    public szt0(List list) {
        this.f171418a = list;
    }
}
