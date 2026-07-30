package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeSubstitution f66887b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeSubstitution f66888c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeSubstitution m93476a(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
            typeSubstitution.getClass();
            typeSubstitution2.getClass();
            if (typeSubstitution.mo90773f()) {
                return typeSubstitution2;
            }
            return typeSubstitution2.mo90773f() ? typeSubstitution : new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }

        private Companion() {
        }
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f66887b = typeSubstitution;
        this.f66888c = typeSubstitution2;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final TypeSubstitution m93475i(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        return Companion.m93476a(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public boolean mo93469a() {
        return this.f66887b.mo93469a() || this.f66888c.mo93469a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo92798b() {
        return this.f66887b.mo92798b() || this.f66888c.mo92798b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo93470d(@NotNull Annotations annotations) {
        annotations.getClass();
        return this.f66888c.mo93470d(this.f66887b.mo93470d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo90772e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeProjection typeProjectionMo90772e = this.f66887b.mo90772e(kotlinType);
        return typeProjectionMo90772e == null ? this.f66888c.mo90772e(kotlinType) : typeProjectionMo90772e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo90773f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo93471g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.f66888c.mo93471g(this.f66887b.mo93471g(kotlinType, variance), variance);
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }
}
