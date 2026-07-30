package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;

/* JADX INFO: loaded from: classes2.dex */
public class tuc0 implements Function1 {
    public static final tuc0 INSTANCE = new tuc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.m89906I((Class) obj));
    }
}
