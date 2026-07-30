package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;

/* JADX INFO: loaded from: classes2.dex */
public class evd implements Function1 {
    public static final evd INSTANCE = new evd();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererOptionsImpl.m91646v((ValueParameterDescriptor) obj);
    }
}
