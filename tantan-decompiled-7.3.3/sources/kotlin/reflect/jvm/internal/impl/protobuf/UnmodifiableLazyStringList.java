package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: a */
    public final LazyStringList f66354a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$a */
    public class C15399a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f66355a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f66356b;

        public C15399a(int i) {
            this.f66356b = i;
            this.f66355a = UnmodifiableLazyStringList.this.f66354a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f66355a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f66355a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f66355a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f66355a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f66355a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f66355a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$b */
    public class C15400b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f66358a;

        public C15400b() {
            this.f66358a = UnmodifiableLazyStringList.this.f66354a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f66358a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66358a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f66354a = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: Q */
    public ByteString mo92248Q(int i) {
        return this.f66354a.mo92248Q(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: S */
    public void mo92249S(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.f66354a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C15400b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: k */
    public List<?> mo92253k() {
        return this.f66354a.mo92253k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C15399a(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: m */
    public LazyStringList mo92254m() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f66354a.size();
    }
}
