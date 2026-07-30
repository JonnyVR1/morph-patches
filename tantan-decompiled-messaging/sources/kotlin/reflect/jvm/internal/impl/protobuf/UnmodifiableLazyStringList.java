package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: a */
    public final LazyStringList f65680a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$a */
    public class C15292a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f65681a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f65682b;

        public C15292a(int i) {
            this.f65682b = i;
            this.f65681a = UnmodifiableLazyStringList.this.f65680a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f65681a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f65681a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f65681a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f65681a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f65681a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f65681a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$b */
    public class C15293b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f65684a;

        public C15293b() {
            this.f65684a = UnmodifiableLazyStringList.this.f65680a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f65684a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65684a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f65680a = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: Q */
    public ByteString mo91357Q(int i) {
        return this.f65680a.mo91357Q(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: S */
    public void mo91358S(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.f65680a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C15293b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: k */
    public List<?> mo91362k() {
        return this.f65680a.mo91362k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C15292a(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: m */
    public LazyStringList mo91363m() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f65680a.size();
    }
}
