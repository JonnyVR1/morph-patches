package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class rnj0 implements Function1 {
    public static final rnj0 INSTANCE = new rnj0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.m89501h((DeclarationDescriptor) obj));
    }
}
