package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class wwd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final boolean f191262a;

    public wwd(boolean z) {
        this.f191262a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorUtilsKt.m92857A(this.f191262a, (CallableMemberDescriptor) obj);
    }
}
