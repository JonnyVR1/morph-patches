package p153l;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class rvq implements DFS.Neighbors {
    public static final rvq INSTANCE = new rvq();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo94083a(Object obj) {
        return JvmBuiltInsCustomizer.m89281F((CallableMemberDescriptor) obj);
    }
}
