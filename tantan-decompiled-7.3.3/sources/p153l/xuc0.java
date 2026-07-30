package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class xuc0 implements Function1 {
    public static final xuc0 INSTANCE = new xuc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88897h((KParameter) obj);
    }
}
