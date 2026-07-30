package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeSubstitution f66885b;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution typeSubstitution) {
        typeSubstitution.getClass();
        this.f66885b = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public boolean mo93469a() {
        return this.f66885b.mo93469a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo92798b() {
        return this.f66885b.mo92798b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo93470d(@NotNull Annotations annotations) {
        annotations.getClass();
        return this.f66885b.mo93470d(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo90772e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return this.f66885b.mo90772e(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo90773f() {
        return this.f66885b.mo90773f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo93471g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.f66885b.mo93471g(kotlinType, variance);
    }
}
