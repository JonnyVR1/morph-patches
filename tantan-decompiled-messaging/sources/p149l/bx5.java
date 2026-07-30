package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;

/* JADX INFO: loaded from: classes2.dex */
public class bx5 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f77739a;

    public bx5(PrimitiveType primitiveType) {
        this.f77739a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ConstantValueFactory.m91920d(this.f77739a, (ModuleDescriptor) obj);
    }
}
