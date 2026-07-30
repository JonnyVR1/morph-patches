package p153l;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class tvq implements DFS.Neighbors {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f176288a;

    public tvq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f176288a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo94083a(Object obj) {
        return JvmBuiltInsCustomizer.m89280B(this.f176288a, (ClassDescriptor) obj);
    }
}
