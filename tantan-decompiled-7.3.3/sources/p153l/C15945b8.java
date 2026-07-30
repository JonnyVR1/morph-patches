package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;

/* JADX INFO: renamed from: l.b8 */
/* JADX INFO: loaded from: classes2.dex */
public class C15945b8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeEnhancementInfo f75383a;

    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiers[] f75384b;

    public C15945b8(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.f75383a = typeEnhancementInfo;
        this.f75384b = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.m90803h(this.f75383a, this.f75384b, ((Number) obj).intValue());
    }
}
