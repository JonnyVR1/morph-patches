package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;

/* JADX INFO: loaded from: classes2.dex */
public class aar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaAnnotations f69163a;

    public aar(LazyJavaAnnotations lazyJavaAnnotations) {
        this.f69163a = lazyJavaAnnotations;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaAnnotations.m90502c(this.f69163a, (JavaAnnotation) obj);
    }
}
