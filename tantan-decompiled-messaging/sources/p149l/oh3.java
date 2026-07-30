package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;

/* JADX INFO: loaded from: classes2.dex */
public class oh3 implements Function1 {
    public static final oh3 INSTANCE = new oh3();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.m89352p((CallableMemberDescriptor) obj));
    }
}
