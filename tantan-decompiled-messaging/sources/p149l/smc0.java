package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class smc0 implements Function1 {
    public static final smc0 INSTANCE = new smc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88006h((KParameter) obj);
    }
}
