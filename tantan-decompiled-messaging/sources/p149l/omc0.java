package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;

/* JADX INFO: loaded from: classes2.dex */
public class omc0 implements Function1 {
    public static final omc0 INSTANCE = new omc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.m89015I((Class) obj));
    }
}
