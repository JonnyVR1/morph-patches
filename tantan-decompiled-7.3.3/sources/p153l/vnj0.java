package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* JADX INFO: loaded from: classes2.dex */
public class vnj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeRegistry f184885a;

    public vnj0(TypeRegistry typeRegistry) {
        this.f184885a = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeRegistry.m94055g(this.f184885a, (String) obj));
    }
}
