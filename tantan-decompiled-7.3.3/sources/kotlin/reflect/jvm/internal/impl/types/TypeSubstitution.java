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
    public static final TypeSubstitution f66955a = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ TypeProjection mo90772e(KotlinType kotlinType) {
            return (TypeProjection) m93650i(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: f */
        public boolean mo90773f() {
            return true;
        }

        /* JADX INFO: renamed from: i */
        public Void m93650i(KotlinType kotlinType) {
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
    public boolean mo93469a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo92798b() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TypeSubstitutor m93648c() {
        TypeSubstitutor typeSubstitutorM93664h = TypeSubstitutor.m93664h(this);
        typeSubstitutorM93664h.getClass();
        return typeSubstitutorM93664h;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Annotations mo93470d(@NotNull Annotations annotations) {
        annotations.getClass();
        return annotations;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract TypeProjection mo90772e(@NotNull KotlinType kotlinType);

    /* JADX INFO: renamed from: f */
    public boolean mo90773f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public KotlinType mo93471g(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return kotlinType;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final TypeSubstitution m93649h() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: a */
            public boolean mo93469a() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: b */
            public boolean mo92798b() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: d */
            public Annotations mo93470d(Annotations annotations) {
                annotations.getClass();
                return this.f66956b.mo93470d(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: e */
            public TypeProjection mo90772e(KotlinType kotlinType) {
                kotlinType.getClass();
                return this.f66956b.mo90772e(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: f */
            public boolean mo90773f() {
                return this.f66956b.mo90773f();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: g */
            public KotlinType mo93471g(KotlinType kotlinType, Variance variance) {
                kotlinType.getClass();
                variance.getClass();
                return this.f66956b.mo93471g(kotlinType, variance);
            }
        };
    }
}
