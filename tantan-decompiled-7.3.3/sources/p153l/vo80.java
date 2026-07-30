package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class vo80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f185012a;

    /* JADX INFO: renamed from: b */
    public final String f185013b;

    public vo80(String str, String str2) {
        this.f185012a = str;
        this.f185013b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90888J(this.f185012a, this.f185013b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
