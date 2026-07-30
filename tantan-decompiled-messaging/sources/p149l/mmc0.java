package p149l;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public class mmc0 implements Function1 {
    public static final mmc0 INSTANCE = new mmc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectClassUtilKt.m88987a((ParameterizedType) obj);
    }
}
