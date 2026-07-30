package p149l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l0y0 implements c1y0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final List f125603a;

    public l0y0(Context context, h0y0 h0y0Var) {
        ArrayList arrayList = new ArrayList();
        this.f125603a = arrayList;
        if (h0y0Var.mo109448c()) {
            arrayList.add(new q2y0(context, h0y0Var));
        }
    }

    @Override // p149l.c1y0
    /* JADX INFO: renamed from: a */
    public final void mo104887a(yzx0 yzx0Var) {
        Iterator it = this.f125603a.iterator();
        while (it.hasNext()) {
            ((c1y0) it.next()).mo104887a(yzx0Var);
        }
    }
}
