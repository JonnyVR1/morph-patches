package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;

/* JADX INFO: loaded from: classes2.dex */
public class ci3 implements Function1 {
    public static final ci3 INSTANCE = new ci3();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.m90243p((CallableMemberDescriptor) obj));
    }
}
