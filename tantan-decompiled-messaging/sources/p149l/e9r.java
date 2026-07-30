package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class e9r implements Function1 {
    public static final e9r INSTANCE = new e9r();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m89787f0((SimpleFunctionDescriptor) obj);
    }
}
