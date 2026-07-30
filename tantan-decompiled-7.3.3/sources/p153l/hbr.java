package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* JADX INFO: loaded from: classes2.dex */
public class hbr implements Function1 {
    public static final hbr INSTANCE = new hbr();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(LazyJavaStaticClassScope.m90722m0((JavaMember) obj));
    }
}
