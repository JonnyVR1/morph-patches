package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;

/* JADX INFO: renamed from: l.w6 */
/* JADX INFO: loaded from: classes2.dex */
public class C20811w6 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractBinaryClassAnnotationAndConstantLoader f184801a;

    public C20811w6(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.f184801a = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractBinaryClassAnnotationAndConstantLoader.m90125O(this.f184801a, (KotlinJvmBinaryClass) obj);
    }
}
