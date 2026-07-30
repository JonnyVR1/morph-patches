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
    public final Annotations f66202a;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        annotations.getClass();
        this.f66202a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    /* JADX INFO: renamed from: b */
    public KClass<? extends AnnotationsTypeAttribute> mo92561b() {
        return Reflection.m87507b(AnnotationsTypeAttribute.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute mo92560a(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.m88645a(this.f66202a, annotationsTypeAttribute.f66202a));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Annotations m92564e() {
        return this.f66202a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.m87488d(((AnnotationsTypeAttribute) obj).f66202a, this.f66202a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute mo92562c(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.m87488d(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f66202a.hashCode();
    }
}
