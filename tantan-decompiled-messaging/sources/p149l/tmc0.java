package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class tmc0 implements Function1 {
    public static final tmc0 INSTANCE = new tmc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88009r((KParameter) obj);
    }
}
