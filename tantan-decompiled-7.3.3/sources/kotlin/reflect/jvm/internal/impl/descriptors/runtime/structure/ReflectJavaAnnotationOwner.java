package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    ReflectJavaAnnotation mo89898b(@NotNull FqName fqName);

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    List<ReflectJavaAnnotation> getAnnotations();

    @Nullable
    AnnotatedElement getElement();
}
