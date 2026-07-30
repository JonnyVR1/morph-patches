package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class fvd implements DFS.Neighbors {
    public static final fvd INSTANCE = new fvd();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo93192a(Object obj) {
        return DescriptorUtilsKt.m91974g((ValueParameterDescriptor) obj);
    }
}
