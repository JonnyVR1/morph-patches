package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class twd implements DFS.Neighbors {
    public static final twd INSTANCE = new twd();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo94083a(Object obj) {
        return DescriptorUtilsKt.m92865g((ValueParameterDescriptor) obj);
    }
}
