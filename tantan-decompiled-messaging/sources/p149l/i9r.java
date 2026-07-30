package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class i9r implements DFS.Neighbors {
    public static final i9r INSTANCE = new i9r();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo93192a(Object obj) {
        return LazyJavaStaticClassScope.m89834q0((ClassDescriptor) obj);
    }
}
