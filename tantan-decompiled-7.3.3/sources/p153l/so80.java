package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class so80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f169855a;

    /* JADX INFO: renamed from: b */
    public final String f169856b;

    public so80(String str, String str2) {
        this.f169855a = str;
        this.f169856b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90882G(this.f169855a, this.f169856b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
