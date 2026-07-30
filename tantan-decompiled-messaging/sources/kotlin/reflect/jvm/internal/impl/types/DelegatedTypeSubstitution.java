package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeSubstitution f66211b;

    public DelegatedTypeSubstitution(@NotNull TypeSubstitution typeSubstitution) {
        typeSubstitution.getClass();
        this.f66211b = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public boolean mo92578a() {
        return this.f66211b.mo92578a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo91907b() {
        return this.f66211b.mo91907b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo92579d(@NotNull Annotations annotations) {
        annotations.getClass();
        return this.f66211b.mo92579d(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo89881e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return this.f66211b.mo89881e(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo89882f() {
        return this.f66211b.mo89882f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo92580g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.f66211b.mo92580g(kotlinType, variance);
    }
}
