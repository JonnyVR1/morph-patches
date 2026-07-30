package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;

/* JADX INFO: loaded from: classes2.dex */
public class oej0 implements Function1 {
    public static final oej0 INSTANCE = new oej0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.m88611i((DeclarationDescriptor) obj));
    }
}
