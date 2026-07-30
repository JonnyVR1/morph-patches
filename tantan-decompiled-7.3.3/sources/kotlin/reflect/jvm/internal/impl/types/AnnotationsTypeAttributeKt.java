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
    public static final /* synthetic */ KProperty<Object>[] f66877a = {Reflection.m88403i(new PropertyReference1Impl(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ReadOnlyProperty f66878b;

    static {
        ReadOnlyProperty readOnlyPropertyM94057d = TypeAttributes.Companion.m94057d(Reflection.m88396b(AnnotationsTypeAttribute.class));
        readOnlyPropertyM94057d.getClass();
        f66878b = readOnlyPropertyM94057d;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Annotations m93457a(@NotNull TypeAttributes typeAttributes) {
        Annotations annotationsM93455e;
        typeAttributes.getClass();
        AnnotationsTypeAttribute annotationsTypeAttributeM93458b = m93458b(typeAttributes);
        return (annotationsTypeAttributeM93458b == null || (annotationsM93455e = annotationsTypeAttributeM93458b.m93455e()) == null) ? Annotations.Companion.m89532b() : annotationsM93455e;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final AnnotationsTypeAttribute m93458b(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return (AnnotationsTypeAttribute) f66878b.mo1437a(typeAttributes, f66877a[0]);
    }
}
