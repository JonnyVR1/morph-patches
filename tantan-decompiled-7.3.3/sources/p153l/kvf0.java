package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;

/* JADX INFO: loaded from: classes2.dex */
public class kvf0 implements Function1 {
    public static final kvf0 INSTANCE = new kvf0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(SpecialBuiltinMembers.m90362i((CallableMemberDescriptor) obj));
    }
}
