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
    public final TypeSubstitution f66213b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeSubstitution f66214c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TypeSubstitution m92585a(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
            typeSubstitution.getClass();
            typeSubstitution2.getClass();
            if (typeSubstitution.mo89882f()) {
                return typeSubstitution2;
            }
            return typeSubstitution2.mo89882f() ? typeSubstitution : new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }

        private Companion() {
        }
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f66213b = typeSubstitution;
        this.f66214c = typeSubstitution2;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final TypeSubstitution m92584i(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        return Companion.m92585a(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public boolean mo92578a() {
        return this.f66213b.mo92578a() || this.f66214c.mo92578a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo91907b() {
        return this.f66213b.mo91907b() || this.f66214c.mo91907b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo92579d(@NotNull Annotations annotations) {
        annotations.getClass();
        return this.f66214c.mo92579d(this.f66213b.mo92579d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo89881e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeProjection typeProjectionMo89881e = this.f66213b.mo89881e(kotlinType);
        return typeProjectionMo89881e == null ? this.f66214c.mo89881e(kotlinType) : typeProjectionMo89881e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo89882f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo92580g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.f66214c.mo92580g(this.f66213b.mo92580g(kotlinType, variance), variance);
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }
}
