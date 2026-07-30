package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;

/* JADX INFO: loaded from: classes2.dex */
public class j75 implements Function1 {
    public static final j75 INSTANCE = new j75();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.m89364c((CallableMemberDescriptor) obj));
    }
}
