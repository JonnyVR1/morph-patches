package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;

/* JADX INFO: loaded from: classes2.dex */
public class y7r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaAnnotations f196724a;

    public y7r(LazyJavaAnnotations lazyJavaAnnotations) {
        this.f196724a = lazyJavaAnnotations;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaAnnotations.m89611c(this.f196724a, (JavaAnnotation) obj);
    }
}
