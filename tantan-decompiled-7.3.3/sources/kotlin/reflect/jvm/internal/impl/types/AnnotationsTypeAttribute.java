package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Annotations f66876a;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        annotations.getClass();
        this.f66876a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    /* JADX INFO: renamed from: b */
    public KClass<? extends AnnotationsTypeAttribute> mo93452b() {
        return Reflection.m88396b(AnnotationsTypeAttribute.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute mo93451a(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.m89536a(this.f66876a, annotationsTypeAttribute.f66876a));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Annotations m93455e() {
        return this.f66876a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.m88377d(((AnnotationsTypeAttribute) obj).f66876a, this.f66876a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute mo93453c(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.m88377d(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f66876a.hashCode();
    }
}
