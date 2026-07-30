package p153l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hpx0 extends AbstractList {

    /* JADX INFO: renamed from: c */
    public static final ipx0 f111057c = ipx0.m141544b(hpx0.class);

    /* JADX INFO: renamed from: a */
    public final List f111058a;

    /* JADX INFO: renamed from: b */
    public final Iterator f111059b;

    public hpx0(List list, Iterator it) {
        this.f111058a = list;
        this.f111059b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.f111058a.size() > i) {
            return this.f111058a.get(i);
        }
        if (this.f111059b.hasNext()) {
            this.f111058a.add(this.f111059b.next());
            return get(i);
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new gpx0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        ipx0 ipx0Var = f111057c;
        ipx0Var.mo117432a("potentially expensive size() call");
        ipx0Var.mo117432a("blowup running");
        while (true) {
            boolean zHasNext = this.f111059b.hasNext();
            List list = this.f111058a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(this.f111059b.next());
        }
    }
}
