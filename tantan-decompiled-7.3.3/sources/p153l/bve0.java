package p153l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bve0 {
    /* JADX INFO: renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m106563a() {
        return new CopyOnWriteArraySet<>();
    }

    /* JADX INFO: renamed from: b */
    public static <E> Set<E> m106564b() {
        return m106565c(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: c */
    public static <E> Set<E> m106565c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
