package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class vmc0 implements Function1 {
    public static final vmc0 INSTANCE = new vmc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88011z((Name) obj);
    }
}
