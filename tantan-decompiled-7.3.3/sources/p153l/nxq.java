package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class nxq implements Function1 {
    public static final nxq INSTANCE = new nxq();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KDeclarationContainerImpl.m88707C((PropertyDescriptor) obj);
    }
}
