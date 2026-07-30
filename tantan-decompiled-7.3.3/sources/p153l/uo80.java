package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class uo80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f180023a;

    /* JADX INFO: renamed from: b */
    public final String f180024b;

    public uo80(String str, String str2) {
        this.f180023a = str;
        this.f180024b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90886I(this.f180023a, this.f180024b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
