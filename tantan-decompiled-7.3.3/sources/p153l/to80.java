package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class to80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f175368a;

    /* JADX INFO: renamed from: b */
    public final String f175369b;

    public to80(String str, String str2) {
        this.f175368a = str;
        this.f175369b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90884H(this.f175368a, this.f175369b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
