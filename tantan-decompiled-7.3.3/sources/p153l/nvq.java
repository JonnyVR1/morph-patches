package p153l;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;

/* JADX INFO: loaded from: classes2.dex */
public class nvq implements Function1 {

    /* JADX INFO: renamed from: a */
    public final JvmBuiltInsCustomizer f143832a;

    public nvq(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f143832a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.m89295s(this.f143832a, (Pair) obj);
    }
}
