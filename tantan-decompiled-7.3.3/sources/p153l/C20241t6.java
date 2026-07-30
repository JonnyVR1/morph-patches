package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;

/* JADX INFO: renamed from: l.t6 */
/* JADX INFO: loaded from: classes2.dex */
public class C20241t6 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractBinaryClassAnnotationAndConstantLoader f172277a;

    public C20241t6(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.f172277a = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractBinaryClassAnnotationAndConstantLoader.m91016O(this.f172277a, (KotlinJvmBinaryClass) obj);
    }
}
