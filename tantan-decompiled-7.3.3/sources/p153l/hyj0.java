package p153l;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class hyj0 extends AbstractList<String> implements wbr, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final wbr f112121a;

    /* JADX INFO: renamed from: l.hyj0$a */
    public class C17597a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f112122a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f112123b;

        public C17597a(int i) {
            this.f112123b = i;
            this.f112122a = hyj0.this.f112121a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f112122a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f112122a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f112122a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f112122a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f112122a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f112122a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l.hyj0$b */
    public class C17598b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f112125a;

        public C17598b() {
            this.f112125a = hyj0.this.f112121a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f112125a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112125a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public hyj0(wbr wbrVar) {
        this.f112121a = wbrVar;
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: e0 */
    public Object mo2360e0(int i) {
        return this.f112121a.mo2360e0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.f112121a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C17598b();
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: k */
    public List<?> mo2364k() {
        return this.f112121a.mo2364k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C17597a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f112121a.size();
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: t */
    public void mo2366t(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: m */
    public wbr mo2365m() {
        return this;
    }
}
