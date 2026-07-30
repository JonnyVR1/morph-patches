package p149l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* JADX INFO: loaded from: classes2.dex */
public class kvq implements Function2 {
    public static final kvq INSTANCE = new kvq();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(KDeclarationContainerImpl.m87814A((DescriptorVisibility) obj, (DescriptorVisibility) obj2));
    }
}
