package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class og80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f143828a;

    /* JADX INFO: renamed from: b */
    public final String f143829b;

    public og80(String str, String str2) {
        this.f143828a = str;
        this.f143829b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m89993H(this.f143828a, this.f143829b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
