package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class avc0 implements Function1 {
    public static final avc0 INSTANCE = new avc0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.m88902z((Name) obj);
    }
}
