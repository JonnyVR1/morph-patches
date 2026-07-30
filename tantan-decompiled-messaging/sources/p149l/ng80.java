package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class ng80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f138846a;

    /* JADX INFO: renamed from: b */
    public final String f138847b;

    public ng80(String str, String str2) {
        this.f138846a = str;
        this.f138847b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m89991G(this.f138846a, this.f138847b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
