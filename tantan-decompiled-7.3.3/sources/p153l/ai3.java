package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;

/* JADX INFO: loaded from: classes2.dex */
public class ai3 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SimpleFunctionDescriptor f71445a;

    public ai3(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.f71445a = simpleFunctionDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.m90234l(this.f71445a, (CallableMemberDescriptor) obj));
    }
}
