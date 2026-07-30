package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class pg80 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final String f148625a;

    /* JADX INFO: renamed from: b */
    public final String f148626b;

    public pg80(String str, String str2) {
        this.f148625a = str;
        this.f148626b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m89995I(this.f148625a, this.f148626b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
