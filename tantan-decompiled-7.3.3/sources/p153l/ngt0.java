package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ngt0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final List f141858a = new ArrayList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final mgt0 m163007a(bft0 bft0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            mgt0 mgt0Var = (mgt0) it.next();
            if (mgt0Var.f136781c == bft0Var) {
                return mgt0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m163008c(mgt0 mgt0Var) {
        this.f141858a.add(mgt0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m163009f(mgt0 mgt0Var) {
        this.f141858a.remove(mgt0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m163010g(bft0 bft0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            mgt0 mgt0Var = (mgt0) it.next();
            if (mgt0Var.f136781c == bft0Var) {
                arrayList.add(mgt0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((mgt0) it2.next()).f136782d.mo140035g();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f141858a.iterator();
    }
}
