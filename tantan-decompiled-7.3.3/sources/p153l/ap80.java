package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class ap80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f72693a;

    /* JADX INFO: renamed from: b */
    public final String f72694b;

    public ap80(String str, String str2) {
        this.f72693a = str;
        this.f72694b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90894N(this.f72693a, this.f72694b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
