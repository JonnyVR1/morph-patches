package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;

/* JADX INFO: loaded from: classes2.dex */
public class gy5 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f107029a;

    public gy5(PrimitiveType primitiveType) {
        this.f107029a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ConstantValueFactory.m92811d(this.f107029a, (ModuleDescriptor) obj);
    }
}
