package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: loaded from: classes2.dex */
public class jnj0 implements Function1 {
    public static final jnj0 INSTANCE = new jnj0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.m92980o((SimpleFunctionDescriptor) obj);
    }
}
