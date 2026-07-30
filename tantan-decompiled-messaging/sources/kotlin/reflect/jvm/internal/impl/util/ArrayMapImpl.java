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
    public Object[] f66351a;

    /* JADX INFO: renamed from: b */
    public int f66352b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArrayMapImpl(Object[] objArr, int i) {
        super(null);
        this.f66351a = objArr;
        this.f66352b = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: a */
    public int mo93128a() {
        return this.f66352b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public void mo93129c(int i, @NotNull T t) {
        t.getClass();
        m93131g(i);
        if (this.f66351a[i] == null) {
            this.f66352b = mo93128a() + 1;
        }
        this.f66351a[i] = t;
    }

    /* JADX INFO: renamed from: g */
    public final void m93131g(int i) {
        Object[] objArr = this.f66351a;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        this.f66351a = Arrays.copyOf(this.f66351a, length);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i) {
        return (T) ArraysKt.getOrNull(this.f66351a, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* JADX INFO: renamed from: a */
            public int f66353a = -1;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ArrayMapImpl<T> f66354b;

            {
                this.f66354b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                do {
                    int i = this.f66353a + 1;
                    this.f66353a = i;
                    if (i >= this.f66354b.f66351a.length) {
                        break;
                    }
                } while (this.f66354b.f66351a[this.f66353a] == null);
                if (this.f66353a >= this.f66354b.f66351a.length) {
                    done();
                    return;
                }
                Object obj = this.f66354b.f66351a[this.f66353a];
                obj.getClass();
                setNext(obj);
            }
        };
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
