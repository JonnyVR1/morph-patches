package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import p153l.mor;
import p153l.nvc0;

/* JADX INFO: loaded from: classes2.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public int f67121a;

    /* JADX INFO: renamed from: b */
    public Object f67122b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$b */
    public static class C15468b<T> implements Iterator<T> {
        private static final C15468b INSTANCE = new C15468b();

        /* JADX INFO: renamed from: a */
        public static <T> C15468b<T> m94107a() {
            return INSTANCE;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$c */
    public class C15469c extends AbstractC15470d<E> {

        /* JADX INFO: renamed from: b */
        public final int f67123b;

        public C15469c() {
            super();
            this.f67123b = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC15470d
        /* JADX INFO: renamed from: a */
        public void mo94108a() {
            if (((AbstractList) SmartList.this).modCount == this.f67123b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.f67123b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.AbstractC15470d
        /* JADX INFO: renamed from: b */
        public E mo94109b() {
            return (E) SmartList.this.f67122b;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo94108a();
            SmartList.this.clear();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartList$d */
    public static abstract class AbstractC15470d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public boolean f67125a;

        public AbstractC15470d() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo94108a();

        /* JADX INFO: renamed from: b */
        public abstract T mo94109b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f67125a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f67125a) {
                mor.m159308a();
                return null;
            }
            this.f67125a = true;
            mo94108a();
            return mo94109b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m94102a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f67121a)) {
            nvc0.m164869a("Index: ", i, ", Size: ", this.f67121a);
            return;
        }
        if (i2 == 0) {
            this.f67122b = e;
        } else if (i2 == 1 && i == 0) {
            this.f67122b = new Object[]{e, this.f67122b};
        } else {
            Object[] objArr = new Object[i2 + 1];
            Object obj = this.f67122b;
            if (i2 == 1) {
                objArr[0] = obj;
            } else {
                Object[] objArr2 = (Object[]) obj;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f67121a - i);
            }
            objArr[i] = e;
            this.f67122b = objArr;
        }
        this.f67121a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f67122b = null;
        this.f67121a = 0;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f67121a)) {
            nvc0.m164869a("Index: ", i, ", Size: ", this.f67121a);
            return null;
        }
        E e = (E) this.f67122b;
        return i2 == 1 ? e : (E) ((Object[]) e)[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i = this.f67121a;
        if (i == 0) {
            C15468b c15468bM94107a = C15468b.m94107a();
            if (c15468bM94107a == null) {
                m94102a(2);
            }
            return c15468bM94107a;
        }
        if (i == 1) {
            return new C15469c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            m94102a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f67121a)) {
            nvc0.m164869a("Index: ", i, ", Size: ", this.f67121a);
            return null;
        }
        Object obj = (E) this.f67122b;
        if (i2 == 1) {
            this.f67122b = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f67122b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f67121a - 1] = null;
            }
            obj = (E) obj2;
        }
        this.f67121a--;
        ((AbstractList) this).modCount++;
        return (E) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f67121a)) {
            nvc0.m164869a("Index: ", i, ", Size: ", this.f67121a);
            return null;
        }
        E e2 = (E) this.f67122b;
        if (i2 == 1) {
            this.f67122b = e;
            return e2;
        }
        Object[] objArr = (Object[]) e2;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f67121a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f67121a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f67122b, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            m94102a(4);
        }
        int length = tArr.length;
        int i = this.f67121a;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f67122b;
                return tArr2;
            }
            tArr[0] = this.f67122b;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f67122b, i, tArr.getClass());
                if (tArr3 == null) {
                    m94102a(6);
                }
                return tArr3;
            }
            if (i != 0) {
                System.arraycopy(this.f67122b, 0, tArr, 0, i);
            }
        }
        int i2 = this.f67121a;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.f67121a;
        if (i == 0) {
            this.f67122b = e;
        } else {
            Object obj = this.f67122b;
            if (i == 1) {
                this.f67122b = new Object[]{obj, e};
            } else {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                if (i >= length) {
                    int i2 = ((length * 3) / 2) + 1;
                    int i3 = i + 1;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    Object[] objArr2 = new Object[i2];
                    this.f67122b = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.f67121a] = e;
            }
        }
        this.f67121a++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
