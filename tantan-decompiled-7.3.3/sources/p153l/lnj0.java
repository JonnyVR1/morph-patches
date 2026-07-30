package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: loaded from: classes2.dex */
public class lnj0 implements Function1 {
    public static final lnj0 INSTANCE = new lnj0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.m92979n((CallableDescriptor) obj);
    }
}
