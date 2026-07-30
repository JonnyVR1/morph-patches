package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    @NotNull
    public static final DefaultTypeAttributeTranslator INSTANCE = new DefaultTypeAttributeTranslator();

    private DefaultTypeAttributeTranslator() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeAttributes mo92571a(@NotNull Annotations annotations, @Nullable TypeConstructor typeConstructor, @Nullable DeclarationDescriptor declarationDescriptor) {
        annotations.getClass();
        return annotations.isEmpty() ? TypeAttributes.Companion.m92709k() : TypeAttributes.Companion.m92708j(CollectionsKt.listOf(new AnnotationsTypeAttribute(annotations)));
    }
}
