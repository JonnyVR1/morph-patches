package p149l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ume0 {
    /* JADX INFO: renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m194341a() {
        return new CopyOnWriteArraySet<>();
    }

    /* JADX INFO: renamed from: b */
    public static <E> Set<E> m194342b() {
        return m194343c(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: c */
    public static <E> Set<E> m194343c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
