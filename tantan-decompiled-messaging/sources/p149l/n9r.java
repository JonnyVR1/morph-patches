package p149l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class n9r<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: c */
    private static final vxv f137822c = vxv.m200598a(n9r.class);

    /* JADX INFO: renamed from: a */
    List<E> f137823a;

    /* JADX INFO: renamed from: b */
    Iterator<E> f137824b;

    /* JADX INFO: renamed from: l.n9r$a */
    public class C18640a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        int f137825a = 0;

        public C18640a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f137825a < n9r.this.f137823a.size() || n9r.this.f137824b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.f137825a;
            int size = n9r.this.f137823a.size();
            n9r n9rVar = n9r.this;
            if (i >= size) {
                n9rVar.f137823a.add(n9rVar.f137824b.next());
                return (E) next();
            }
            List<E> list = n9rVar.f137823a;
            int i2 = this.f137825a;
            this.f137825a = i2 + 1;
            return list.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n9r(List<E> list, Iterator<E> it) {
        this.f137823a = list;
        this.f137824b = it;
    }

    /* JADX INFO: renamed from: a */
    private void m158564a() {
        f137822c.mo108288b("blowup running");
        while (this.f137824b.hasNext()) {
            this.f137823a.add(this.f137824b.next());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.f137823a.size() > i) {
            return this.f137823a.get(i);
        }
        if (this.f137824b.hasNext()) {
            this.f137823a.add(this.f137824b.next());
            return get(i);
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C18640a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f137822c.mo108288b("potentially expensive size() call");
        m158564a();
        return this.f137823a.size();
    }
}
