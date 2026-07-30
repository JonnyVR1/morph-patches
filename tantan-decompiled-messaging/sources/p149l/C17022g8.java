package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;

/* JADX INFO: renamed from: l.g8 */
/* JADX INFO: loaded from: classes2.dex */
public class C17022g8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeEnhancementInfo f101463a;

    /* JADX INFO: renamed from: b */
    public final JavaTypeQualifiers[] f101464b;

    public C17022g8(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.f101463a = typeEnhancementInfo;
        this.f101464b = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.m89912h(this.f101463a, this.f101464b, ((Number) obj).intValue());
    }
}
