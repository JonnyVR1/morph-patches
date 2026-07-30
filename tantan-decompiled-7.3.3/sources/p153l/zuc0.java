package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class zuc0 implements Function1 {
    public static final zuc0 INSTANCE = new zuc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88901u((KParameter) obj);
    }
}
