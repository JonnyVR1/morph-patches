package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class snj0 implements Function1 {
    public static final snj0 INSTANCE = new snj0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.m89502i((DeclarationDescriptor) obj));
    }
}
