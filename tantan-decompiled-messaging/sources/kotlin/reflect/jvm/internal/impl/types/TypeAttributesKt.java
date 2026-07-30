package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAttributesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypeAttributes m92710a(@NotNull TypeAttributes typeAttributes, @NotNull Annotations annotations) {
        TypeAttributes typeAttributesM92705r;
        typeAttributes.getClass();
        annotations.getClass();
        if (AnnotationsTypeAttributeKt.m92566a(typeAttributes) == annotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsTypeAttributeM92567b = AnnotationsTypeAttributeKt.m92567b(typeAttributes);
        if (annotationsTypeAttributeM92567b != null && (typeAttributesM92705r = typeAttributes.m92705r(annotationsTypeAttributeM92567b)) != null) {
            typeAttributes = typeAttributesM92705r;
        }
        return (annotations.iterator().hasNext() || !annotations.isEmpty()) ? typeAttributes.m92704p(new AnnotationsTypeAttribute(annotations)) : typeAttributes;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TypeAttributes m92711b(@NotNull Annotations annotations) {
        annotations.getClass();
        return TypeAttributeTranslator.DefaultImpls.m92698a(DefaultTypeAttributeTranslator.INSTANCE, annotations, null, null, 6, null);
    }
}
