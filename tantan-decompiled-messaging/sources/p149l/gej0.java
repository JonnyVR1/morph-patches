package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: loaded from: classes2.dex */
public class gej0 implements Function1 {
    public static final gej0 INSTANCE = new gej0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.m92090p((PropertyDescriptor) obj);
    }
}
