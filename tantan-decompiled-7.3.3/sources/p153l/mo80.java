package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* JADX INFO: loaded from: classes2.dex */
public class mo80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SignatureBuildingComponents f137798a;

    public mo80(SignatureBuildingComponents signatureBuildingComponents) {
        this.f137798a = signatureBuildingComponents;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90909b(this.f137798a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
