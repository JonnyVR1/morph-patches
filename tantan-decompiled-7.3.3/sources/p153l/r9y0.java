package p153l;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class r9y0 implements iay0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final List f161878a;

    public r9y0(Context context, n9y0 n9y0Var) {
        ArrayList arrayList = new ArrayList();
        this.f161878a = arrayList;
        if (n9y0Var.mo139042c()) {
            arrayList.add(new wby0(context, n9y0Var));
        }
    }

    @Override // p153l.iay0
    /* JADX INFO: renamed from: a */
    public final void mo139226a(e9y0 e9y0Var) {
        Iterator it = this.f161878a.iterator();
        while (it.hasNext()) {
            ((iay0) it.next()).mo139226a(e9y0Var);
        }
    }
}
