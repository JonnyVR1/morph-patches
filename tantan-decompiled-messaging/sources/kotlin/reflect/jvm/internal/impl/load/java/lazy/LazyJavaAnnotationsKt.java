package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotationsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Annotations m89612a(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner javaAnnotationOwner) {
        lazyJavaResolverContext.getClass();
        javaAnnotationOwner.getClass();
        return new LazyJavaAnnotations(lazyJavaResolverContext, javaAnnotationOwner, false, 4, null);
    }
}
