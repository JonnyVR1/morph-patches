package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public Object[] f67025a;

    /* JADX INFO: renamed from: b */
    public int f67026b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArrayMapImpl(Object[] objArr, int i) {
        super(null);
        this.f67025a = objArr;
        this.f67026b = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: a */
    public int mo94019a() {
        return this.f67026b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public void mo94020c(int i, @NotNull T t) {
        t.getClass();
        m94022g(i);
        if (this.f67025a[i] == null) {
            this.f67026b = mo94019a() + 1;
        }
        this.f67025a[i] = t;
    }

    /* JADX INFO: renamed from: g */
    public final void m94022g(int i) {
        Object[] objArr = this.f67025a;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        this.f67025a = Arrays.copyOf(this.f67025a, length);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        return (T) ArraysKt.getOrNull(this.f67025a, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: a */
            public int f67027a = -1;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ArrayMapImpl<T> f67028b;

            {
                this.f67028b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                do {
                    int i = this.f67027a + 1;
                    this.f67027a = i;
                    if (i >= this.f67028b.f67025a.length) {
                        break;
                    }
                } while (this.f67028b.f67025a[this.f67027a] == null);
                if (this.f67027a >= this.f67028b.f67025a.length) {
                    done();
                    return;
                }
                Object obj = this.f67028b.f67025a[this.f67027a];
                obj.getClass();
                setNext(obj);
            }
        };
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
