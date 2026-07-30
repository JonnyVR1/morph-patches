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
import p153l.mor;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SmartSet<T> extends AbstractMutableSet<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public Object f67126a;

    /* JADX INFO: renamed from: b */
    public int f67127b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T> SmartSet<T> m94112a() {
            return new SmartSet<>(null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> SmartSet<T> m94113b(@NotNull Collection<? extends T> collection) {
            collection.getClass();
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$a */
    public static final class C15471a<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Iterator<T> f67128a;

        public C15471a(@NotNull T[] tArr) {
            tArr.getClass();
            this.f67128a = ArrayIteratorKt.m88345a(tArr);
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67128a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f67128a.next();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.SmartSet$b */
    public static final class C15472b<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        public final T f67129a;

        /* JADX INFO: renamed from: b */
        public boolean f67130b = true;

        public C15472b(T t) {
            this.f67129a = t;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67130b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f67130b) {
                this.f67130b = false;
                return this.f67129a;
            }
            mor.m159308a();
            return null;
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> SmartSet<T> m94110a() {
        return Companion.m94112a();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.f67126a = t;
        } else if (size() != 1) {
            int size = size();
            Object obj2 = this.f67126a;
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
                this.f67126a = obj;
            } else {
                obj2.getClass();
                if (!TypeIntrinsics.m88428f(obj2).add(t)) {
                    return false;
                }
            }
        } else {
            if (Intrinsics.m88377d(this.f67126a, t)) {
                return false;
            }
            this.f67126a = new Object[]{this.f67126a, t};
        }
        m94111c(size() + 1);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m94111c(int i) {
        this.f67127b = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f67126a = null;
        m94111c(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.m88377d(this.f67126a, obj);
        }
        int size = size();
        Object obj2 = this.f67126a;
        if (size < 5) {
            obj2.getClass();
            return ArraysKt.contains((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f67127b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new C15472b(this.f67126a);
        }
        int size = size();
        Object obj = this.f67126a;
        if (size < 5) {
            obj.getClass();
            return new C15471a((Object[]) obj);
        }
        obj.getClass();
        return TypeIntrinsics.m88428f(obj).iterator();
    }

    private SmartSet() {
    }
}
