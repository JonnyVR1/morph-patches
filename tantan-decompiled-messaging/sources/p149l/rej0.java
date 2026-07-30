package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* JADX INFO: loaded from: classes2.dex */
public class rej0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeRegistry f159058a;

    public rej0(TypeRegistry typeRegistry) {
        this.f159058a = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeRegistry.m93164g(this.f159058a, (String) obj));
    }
}
