package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* JADX INFO: loaded from: classes2.dex */
public class hg80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SignatureBuildingComponents f107582a;

    public hg80(SignatureBuildingComponents signatureBuildingComponents) {
        this.f107582a = signatureBuildingComponents;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90018b(this.f107582a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
