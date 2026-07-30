package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uvd;
import p153l.vvd;
import p153l.wvd;
import p153l.xvd;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m92606f(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.m92613e(callableDescriptor, callableDescriptor2, z, z4, z3, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m92607g(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m92608h(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        typeConstructor.getClass();
        typeConstructor2.getClass();
        if (Intrinsics.m88377d(typeConstructor, typeConstructor2)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        ClassifierDescriptor classifierDescriptorMo89207e2 = typeConstructor2.mo89207e();
        if ((classifierDescriptorMo89207e instanceof TypeParameterDescriptor) && (classifierDescriptorMo89207e2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.m92617n((TypeParameterDescriptor) classifierDescriptorMo89207e, (TypeParameterDescriptor) classifierDescriptorMo89207e2, z, new xvd(callableDescriptor, callableDescriptor2));
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m92609i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return Intrinsics.m88377d(declarationDescriptor, callableDescriptor) && Intrinsics.m88377d(declarationDescriptor2, callableDescriptor2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m92610l(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.m92615k(declarationDescriptor, declarationDescriptor2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m92611o(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = uvd.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.m92617n(typeParameterDescriptor, typeParameterDescriptor2, z, function2);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m92612p(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92613e(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        kotlinTypeRefiner.getClass();
        if (Intrinsics.m88377d(callableDescriptor, callableDescriptor2)) {
            return true;
        }
        if (!Intrinsics.m88377d(callableDescriptor.getName(), callableDescriptor2.getName())) {
            return false;
        }
        if (z2 && (callableDescriptor instanceof MemberDescriptor) && (callableDescriptor2 instanceof MemberDescriptor) && ((MemberDescriptor) callableDescriptor).mo89198n0() != ((MemberDescriptor) callableDescriptor2).mo89198n0()) {
            return false;
        }
        if ((Intrinsics.m88377d(callableDescriptor.mo89190b(), callableDescriptor2.mo89190b()) && (!z || !Intrinsics.m88377d(m92619r(callableDescriptor), m92619r(callableDescriptor2)))) || DescriptorUtils.m92642E(callableDescriptor) || DescriptorUtils.m92642E(callableDescriptor2) || !m92618q(callableDescriptor, callableDescriptor2, vvd.INSTANCE, z)) {
            return false;
        }
        OverridingUtil overridingUtilM92712i = OverridingUtil.m92712i(kotlinTypeRefiner, new wvd(z, callableDescriptor, callableDescriptor2));
        overridingUtilM92712i.getClass();
        OverridingUtil.OverrideCompatibilityInfo.Result resultM92737c = overridingUtilM92712i.m92728E(callableDescriptor, callableDescriptor2, null, !z3).m92737c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultM92737c == result && overridingUtilM92712i.m92728E(callableDescriptor2, callableDescriptor, null, z3 ^ true).m92737c() == result;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m92614j(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.m88377d(classDescriptor.mo89196l(), classDescriptor2.mo89196l());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m92615k(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return m92614j((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return m92611o(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return m92606f(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z, z2, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.m88377d(((PackageFragmentDescriptor) declarationDescriptor).mo89453d(), ((PackageFragmentDescriptor) declarationDescriptor2).mo89453d()) : Intrinsics.m88377d(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public final boolean m92616m(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, boolean z) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        return m92611o(this, typeParameterDescriptor, typeParameterDescriptor2, z, null, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public final boolean m92617n(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, boolean z, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        function2.getClass();
        if (Intrinsics.m88377d(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        return !Intrinsics.m88377d(typeParameterDescriptor.mo89190b(), typeParameterDescriptor2.mo89190b()) && m92618q(typeParameterDescriptor, typeParameterDescriptor2, function2, z) && typeParameterDescriptor.getIndex() == typeParameterDescriptor2.getIndex();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m92618q(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z) {
        DeclarationDescriptor declarationDescriptorMo89190b = declarationDescriptor.mo89190b();
        DeclarationDescriptor declarationDescriptorMo89190b2 = declarationDescriptor2.mo89190b();
        return ((declarationDescriptorMo89190b instanceof CallableMemberDescriptor) || (declarationDescriptorMo89190b2 instanceof CallableMemberDescriptor)) ? function2.invoke(declarationDescriptorMo89190b, declarationDescriptorMo89190b2).booleanValue() : m92610l(this, declarationDescriptorMo89190b, declarationDescriptorMo89190b2, z, false, 8, null);
    }

    /* JADX INFO: renamed from: r */
    public final SourceElement m92619r(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
            collectionMo89338e.getClass();
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(collectionMo89338e);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }
}
