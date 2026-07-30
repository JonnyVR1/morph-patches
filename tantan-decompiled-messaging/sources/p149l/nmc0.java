package p149l;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public class nmc0 implements Function1 {
    public static final nmc0 INSTANCE = new nmc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectClassUtilKt.m88988b((ParameterizedType) obj);
    }
}
