package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class ivd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final boolean f115123a;

    public ivd(boolean z) {
        this.f115123a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorUtilsKt.m91966A(this.f115123a, (CallableMemberDescriptor) obj);
    }
}
