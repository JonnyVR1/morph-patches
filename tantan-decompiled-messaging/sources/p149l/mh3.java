package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;

/* JADX INFO: loaded from: classes2.dex */
public class mh3 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SimpleFunctionDescriptor f133775a;

    public mh3(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.f133775a = simpleFunctionDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.m89343l(this.f133775a, (CallableMemberDescriptor) obj));
    }
}
