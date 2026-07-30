package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes2.dex */
public class hvd implements DFS.Neighbors {

    /* JADX INFO: renamed from: a */
    public final boolean f109638a;

    public hvd(boolean z) {
        this.f109638a = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    /* JADX INFO: renamed from: a */
    public Iterable mo93192a(Object obj) {
        return DescriptorUtilsKt.m91977j(this.f109638a, (CallableMemberDescriptor) obj);
    }
}
