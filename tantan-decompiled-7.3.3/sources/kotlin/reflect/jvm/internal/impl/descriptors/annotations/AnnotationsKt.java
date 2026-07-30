package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Annotations m89536a(@NotNull Annotations annotations, @NotNull Annotations annotations2) {
        annotations.getClass();
        annotations2.getClass();
        if (annotations.isEmpty()) {
            return annotations2;
        }
        return annotations2.isEmpty() ? annotations : new CompositeAnnotations(annotations, annotations2);
    }
}
