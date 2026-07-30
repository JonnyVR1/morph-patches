package p153l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* JADX INFO: loaded from: classes2.dex */
public class lxq implements Function2 {
    public static final lxq INSTANCE = new lxq();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(KDeclarationContainerImpl.m88705A((DescriptorVisibility) obj, (DescriptorVisibility) obj2));
    }
}
