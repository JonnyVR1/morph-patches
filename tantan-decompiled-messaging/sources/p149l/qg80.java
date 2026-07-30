package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class qg80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f154317a;

    /* JADX INFO: renamed from: b */
    public final String f154318b;

    public qg80(String str, String str2) {
        this.f154317a = str;
        this.f154318b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m89997J(this.f154317a, this.f154318b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
