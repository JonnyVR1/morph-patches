package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;

/* JADX INFO: loaded from: classes2.dex */
public class pmc0 implements Function1 {
    public static final pmc0 INSTANCE = new pmc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectJavaClass.m89016J((Class) obj);
    }
}
