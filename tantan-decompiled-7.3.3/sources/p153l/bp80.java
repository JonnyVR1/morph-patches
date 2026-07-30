package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class bp80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f77736a;

    /* JADX INFO: renamed from: b */
    public final String f77737b;

    public bp80(String str, String str2) {
        this.f77736a = str;
        this.f77737b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90895O(this.f77736a, this.f77737b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
