package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberScope m89699a(@NotNull ClassDescriptor classDescriptor, @NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeMo89547P;
            classDescriptor.getClass();
            typeSubstitution.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeMo89547P = moduleAwareClassDescriptor.mo89547P(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScopeMo89547P;
            }
            MemberScope memberScopeMo89350s0 = classDescriptor.mo89350s0(typeSubstitution);
            memberScopeMo89350s0.getClass();
            return memberScopeMo89350s0;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberScope m89700b(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeMo89197l0;
            classDescriptor.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeMo89197l0 = moduleAwareClassDescriptor.mo89197l0(kotlinTypeRefiner)) != null) {
                return memberScopeMo89197l0;
            }
            MemberScope memberScopeMo89346D = classDescriptor.mo89346D();
            memberScopeMo89346D.getClass();
            return memberScopeMo89346D;
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public abstract MemberScope mo89547P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo89336a() {
        return mo89336a();
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public abstract MemberScope mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ DeclarationDescriptor mo89336a() {
        return mo89336a();
    }
}
