package p149l;

import androidx.datastore.preferences.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class epj0 extends AbstractList<String> implements u9r, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final u9r f92681a;

    /* JADX INFO: renamed from: l.epj0$a */
    public class C16663a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f92682a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f92683b;

        public C16663a(int i) {
            this.f92683b = i;
            this.f92682a = epj0.this.f92681a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f92682a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f92682a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f92682a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f92682a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f92682a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f92682a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l.epj0$b */
    public class C16664b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f92685a;

        public C16664b() {
            this.f92685a = epj0.this.f92681a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f92685a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f92685a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public epj0(u9r u9rVar) {
        this.f92681a = u9rVar;
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: d0 */
    public Object mo2359d0(int i) {
        return this.f92681a.mo2359d0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return (String) this.f92681a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C16664b();
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: k */
    public List<?> mo2363k() {
        return this.f92681a.mo2363k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C16663a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f92681a.size();
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: t */
    public void mo2365t(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: m */
    public u9r mo2364m() {
        return this;
    }
}
