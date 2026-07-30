package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lmr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SmartSet<T> extends AbstractMutableSet<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public Object f66452a;

    /* JADX INFO: renamed from: b */
    public int f66453b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> SmartSet<T> m93221a() {
            return new SmartSet<>(null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> SmartSet<T> m93222b(@NotNull Collection<? extends T> collection) {
            collection.getClass();
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$a */
    public static final class C15364a<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Iterator<T> f66454a;

        public C15364a(@NotNull T[] tArr) {
            tArr.getClass();
            this.f66454a = ArrayIteratorKt.m87456a(tArr);
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66454a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f66454a.next();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$b */
    public static final class C15365b<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        public final T f66455a;

        /* JADX INFO: renamed from: b */
        public boolean f66456b = true;

        public C15365b(T t) {
            this.f66455a = t;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66456b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f66456b) {
                this.f66456b = false;
                return this.f66455a;
            }
            lmr.m150601a();
            return null;
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> SmartSet<T> m93219a() {
        return Companion.m93221a();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.f66452a = t;
        } else if (size() != 1) {
            int size = size();
            Object obj2 = this.f66452a;
            if (size < 5) {
                obj2.getClass();
                Object[] objArr = (Object[]) obj2;
                if (ArraysKt.contains(objArr, t)) {
                    return false;
                }
                if (size() == 4) {
                    LinkedHashSet linkedHashSetLinkedSetOf = SetsKt.linkedSetOf(Arrays.copyOf(objArr, objArr.length));
                    linkedHashSetLinkedSetOf.add(t);
                    obj = linkedHashSetLinkedSetOf;
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                    objArrCopyOf[objArrCopyOf.length - 1] = t;
                    obj = objArrCopyOf;
                }
                this.f66452a = obj;
            } else {
                obj2.getClass();
                if (!TypeIntrinsics.m87539f(obj2).add(t)) {
                    return false;
                }
            }
        } else {
            if (Intrinsics.m87488d(this.f66452a, t)) {
                return false;
            }
            this.f66452a = new Object[]{this.f66452a, t};
        }
        m93220c(size() + 1);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m93220c(int i) {
        this.f66453b = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f66452a = null;
        m93220c(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.m87488d(this.f66452a, obj);
        }
        int size = size();
        Object obj2 = this.f66452a;
        if (size < 5) {
            obj2.getClass();
            return ArraysKt.contains((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f66453b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new C15365b(this.f66452a);
        }
        int size = size();
        Object obj = this.f66452a;
        if (size < 5) {
            obj.getClass();
            return new C15364a((Object[]) obj);
        }
        obj.getClass();
        return TypeIntrinsics.m87539f(obj).iterator();
    }

    private SmartSet() {
    }
}
