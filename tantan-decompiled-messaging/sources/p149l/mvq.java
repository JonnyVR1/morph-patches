package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class mvq implements Function1 {
    public static final mvq INSTANCE = new mvq();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KDeclarationContainerImpl.m87816C((PropertyDescriptor) obj);
    }
}
