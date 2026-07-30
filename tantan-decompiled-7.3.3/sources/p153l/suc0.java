package p153l;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public class suc0 implements Function1 {
    public static final suc0 INSTANCE = new suc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectClassUtilKt.m89879b((ParameterizedType) obj);
    }
}
