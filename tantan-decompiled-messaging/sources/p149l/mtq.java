package p149l;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;

/* JADX INFO: loaded from: classes2.dex */
public class mtq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f135670a;

    public mtq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f135670a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.m88404s(this.f135670a, (Pair) obj);
    }
}
