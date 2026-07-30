package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class vwd implements DFS.Neighbors {

    /* JADX INFO: renamed from: a */
    public final boolean f186122a;

    public vwd(boolean z) {
        this.f186122a = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo94083a(Object obj) {
        return DescriptorUtilsKt.m92868j(this.f186122a, (CallableMemberDescriptor) obj);
    }
}
