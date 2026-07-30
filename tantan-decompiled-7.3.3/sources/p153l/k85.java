package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;

/* JADX INFO: loaded from: classes2.dex */
public class k85 implements Function1 {
    public static final k85 INSTANCE = new k85();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.m90255c((CallableMemberDescriptor) obj));
    }
}
