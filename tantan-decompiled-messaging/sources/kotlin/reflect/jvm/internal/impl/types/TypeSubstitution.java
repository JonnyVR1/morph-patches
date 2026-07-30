package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final TypeSubstitution f66281a = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ TypeProjection mo89881e(KotlinType kotlinType) {
            return (TypeProjection) m92759i(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: f */
        public boolean mo89882f() {
            return true;
        }

        /* JADX INFO: renamed from: i */
        public Void m92759i(KotlinType kotlinType) {
            kotlinType.getClass();
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo92578a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo91907b() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TypeSubstitutor m92757c() {
        TypeSubstitutor typeSubstitutorM92773h = TypeSubstitutor.m92773h(this);
        typeSubstitutorM92773h.getClass();
        return typeSubstitutorM92773h;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo92579d(@NotNull Annotations annotations) {
        annotations.getClass();
        return annotations;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract TypeProjection mo89881e(@NotNull KotlinType kotlinType);

    /* JADX INFO: renamed from: f */
    public boolean mo89882f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo92580g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return kotlinType;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final TypeSubstitution m92758h() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: a */
            public boolean mo92578a() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: b */
            public boolean mo91907b() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: d */
            public Annotations mo92579d(Annotations annotations) {
                annotations.getClass();
                return this.f66282b.mo92579d(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: e */
            public TypeProjection mo89881e(KotlinType kotlinType) {
                kotlinType.getClass();
                return this.f66282b.mo89881e(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: f */
            public boolean mo89882f() {
                return this.f66282b.mo89882f();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: g */
            public KotlinType mo92580g(KotlinType kotlinType, Variance variance) {
                kotlinType.getClass();
                variance.getClass();
                return this.f66282b.mo92580g(kotlinType, variance);
            }
        };
    }
}
