package p149l;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class qtq implements DFS.Neighbors {
    public static final qtq INSTANCE = new qtq();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo93192a(Object obj) {
        return JvmBuiltInsCustomizer.m88390F((CallableMemberDescriptor) obj);
    }
}
