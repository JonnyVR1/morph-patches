package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class kbr implements DFS.Neighbors {
    public static final kbr INSTANCE = new kbr();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo94083a(Object obj) {
        return LazyJavaStaticClassScope.m90725q0((ClassDescriptor) obj);
    }
}
