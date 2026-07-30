package p149l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bgx0 extends AbstractList {

    /* JADX INFO: renamed from: c */
    public static final cgx0 f75536c = cgx0.m106844b(bgx0.class);

    /* JADX INFO: renamed from: a */
    public final List f75537a;

    /* JADX INFO: renamed from: b */
    public final Iterator f75538b;

    public bgx0(List list, Iterator it) {
        this.f75537a = list;
        this.f75538b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.f75537a.size() > i) {
            return this.f75537a.get(i);
        }
        if (this.f75538b.hasNext()) {
            this.f75537a.add(this.f75538b.next());
            return get(i);
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new agx0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        cgx0 cgx0Var = f75536c;
        cgx0Var.mo106845a("potentially expensive size() call");
        cgx0Var.mo106845a("blowup running");
        while (true) {
            boolean zHasNext = this.f75538b.hasNext();
            List list = this.f75537a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(this.f75538b.next());
        }
    }
}
