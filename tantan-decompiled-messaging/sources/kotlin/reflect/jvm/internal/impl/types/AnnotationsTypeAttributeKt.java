package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AnnotationsTypeAttributeKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty<Object>[] f66203a = {Reflection.m87514i(new PropertyReference1Impl(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ReadOnlyProperty f66204b;

    static {
        ReadOnlyProperty readOnlyPropertyM93166d = TypeAttributes.Companion.m93166d(Reflection.m87507b(AnnotationsTypeAttribute.class));
        readOnlyPropertyM93166d.getClass();
        f66204b = readOnlyPropertyM93166d;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Annotations m92566a(@NotNull TypeAttributes typeAttributes) {
        Annotations annotationsM92564e;
        typeAttributes.getClass();
        AnnotationsTypeAttribute annotationsTypeAttributeM92567b = m92567b(typeAttributes);
        return (annotationsTypeAttributeM92567b == null || (annotationsM92564e = annotationsTypeAttributeM92567b.m92564e()) == null) ? Annotations.Companion.m88641b() : annotationsM92564e;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final AnnotationsTypeAttribute m92567b(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return (AnnotationsTypeAttribute) f66204b.mo1436a(typeAttributes, f66203a[0]);
    }
}
