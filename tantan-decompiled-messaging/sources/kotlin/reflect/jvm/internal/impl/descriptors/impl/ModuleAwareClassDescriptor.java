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
        public final MemberScope m88808a(@NotNull ClassDescriptor classDescriptor, @NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeMo88656P;
            classDescriptor.getClass();
            typeSubstitution.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeMo88656P = moduleAwareClassDescriptor.mo88656P(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScopeMo88656P;
            }
            MemberScope memberScopeMo88459s0 = classDescriptor.mo88459s0(typeSubstitution);
            memberScopeMo88459s0.getClass();
            return memberScopeMo88459s0;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberScope m88809b(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScopeMo88306l0;
            classDescriptor.getClass();
            kotlinTypeRefiner.getClass();
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScopeMo88306l0 = moduleAwareClassDescriptor.mo88306l0(kotlinTypeRefiner)) != null) {
                return memberScopeMo88306l0;
            }
            MemberScope memberScopeMo88455D = classDescriptor.mo88455D();
            memberScopeMo88455D.getClass();
            return memberScopeMo88455D;
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public abstract MemberScope mo88656P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo88445a() {
        return mo88445a();
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public abstract MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ DeclarationDescriptor mo88445a() {
        return mo88445a();
    }
}
