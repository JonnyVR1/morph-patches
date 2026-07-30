package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAttributesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypeAttributes m93601a(@NotNull TypeAttributes typeAttributes, @NotNull Annotations annotations) {
        TypeAttributes typeAttributesM93596r;
        typeAttributes.getClass();
        annotations.getClass();
        if (AnnotationsTypeAttributeKt.m93457a(typeAttributes) == annotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsTypeAttributeM93458b = AnnotationsTypeAttributeKt.m93458b(typeAttributes);
        if (annotationsTypeAttributeM93458b != null && (typeAttributesM93596r = typeAttributes.m93596r(annotationsTypeAttributeM93458b)) != null) {
            typeAttributes = typeAttributesM93596r;
        }
        return (annotations.iterator().hasNext() || !annotations.isEmpty()) ? typeAttributes.m93595p(new AnnotationsTypeAttribute(annotations)) : typeAttributes;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TypeAttributes m93602b(@NotNull Annotations annotations) {
        annotations.getClass();
        return TypeAttributeTranslator.DefaultImpls.m93589a(DefaultTypeAttributeTranslator.INSTANCE, annotations, null, null, 6, null);
    }
}
