package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class vg80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f181352a;

    /* JADX INFO: renamed from: b */
    public final String f181353b;

    public vg80(String str, String str2) {
        this.f181352a = str;
        this.f181353b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m90003N(this.f181352a, this.f181353b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
