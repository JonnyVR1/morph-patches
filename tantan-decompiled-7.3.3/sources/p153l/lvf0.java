package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;

/* JADX INFO: loaded from: classes2.dex */
public class lvf0 implements Function1 {
    public static final lvf0 INSTANCE = new lvf0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(SpecialBuiltinMembers.m90364k((CallableMemberDescriptor) obj));
    }
}
