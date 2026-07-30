package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Annotation f64993b;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        annotation.getClass();
        this.f64993b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* JADX INFO: renamed from: b */
    public SourceFile mo89484b() {
        SourceFile sourceFile = SourceFile.f64738a;
        sourceFile.getClass();
        return sourceFile;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Annotation m89831d() {
        return this.f64993b;
    }
}
