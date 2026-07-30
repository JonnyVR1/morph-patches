package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class nej0 implements Function1 {
    public static final nej0 INSTANCE = new nej0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.m88610h((DeclarationDescriptor) obj));
    }
}
