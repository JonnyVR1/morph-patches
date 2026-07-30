package p149l;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class stq implements DFS.Neighbors {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f166381a;

    public stq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f166381a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo93192a(Object obj) {
        return JvmBuiltInsCustomizer.m88389B(this.f166381a, (ClassDescriptor) obj);
    }
}
