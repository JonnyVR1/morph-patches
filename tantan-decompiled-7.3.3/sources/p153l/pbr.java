package p153l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class pbr<E> extends AbstractList<E> {

    /* JADX INFO: renamed from: c */
    private static final szv f151411c = szv.m188683a(pbr.class);

    /* JADX INFO: renamed from: a */
    List<E> f151412a;

    /* JADX INFO: renamed from: b */
    Iterator<E> f151413b;

    /* JADX INFO: renamed from: l.pbr$a */
    public class C19337a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        int f151414a = 0;

        public C19337a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f151414a < pbr.this.f151412a.size() || pbr.this.f151413b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.f151414a;
            int size = pbr.this.f151412a.size();
            pbr pbrVar = pbr.this;
            if (i >= size) {
                pbrVar.f151412a.add(pbrVar.f151413b.next());
                return (E) next();
            }
            List<E> list = pbrVar.f151412a;
            int i2 = this.f151414a;
            this.f151414a = i2 + 1;
            return list.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public pbr(List<E> list, Iterator<E> it) {
        this.f151412a = list;
        this.f151413b = it;
    }

    /* JADX INFO: renamed from: a */
    private void m171527a() {
        f151411c.mo99049b("blowup running");
        while (this.f151413b.hasNext()) {
            this.f151412a.add(this.f151413b.next());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.f151412a.size() > i) {
            return this.f151412a.get(i);
        }
        if (this.f151413b.hasNext()) {
            this.f151412a.add(this.f151413b.next());
            return get(i);
        }
        mor.m159308a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C19337a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        f151411c.mo99049b("potentially expensive size() call");
        m171527a();
        return this.f151412a.size();
    }
}
