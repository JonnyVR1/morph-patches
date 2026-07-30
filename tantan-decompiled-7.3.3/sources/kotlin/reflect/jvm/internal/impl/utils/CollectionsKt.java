package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CollectionsKt {
    /* JADX INFO: renamed from: a */
    public static final <T> void m94069a(@NotNull Collection<T> collection, @Nullable T t) {
        collection.getClass();
        if (t != null) {
            collection.add(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m94070b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> List<T> m94071c(@NotNull ArrayList<T> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <K> Map<K, Integer> m94072d(@NotNull Iterable<? extends K> iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <K, V> HashMap<K, V> m94073e(int i) {
        return new HashMap<>(m94070b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <E> HashSet<E> m94074f(int i) {
        return new HashSet<>(m94070b(i));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <E> LinkedHashSet<E> m94075g(int i) {
        return new LinkedHashSet<>(m94070b(i));
    }
}
