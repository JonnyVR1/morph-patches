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
import p149l.gud;
import p149l.hud;
import p149l.iud;
import p149l.jud;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m91715f(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.m91722e(callableDescriptor, callableDescriptor2, z, z4, z3, kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m91716g(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m91717h(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        typeConstructor.getClass();
        typeConstructor2.getClass();
        if (Intrinsics.m87488d(typeConstructor, typeConstructor2)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
        ClassifierDescriptor classifierDescriptorMo88316e2 = typeConstructor2.mo88316e();
        if ((classifierDescriptorMo88316e instanceof TypeParameterDescriptor) && (classifierDescriptorMo88316e2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.m91726n((TypeParameterDescriptor) classifierDescriptorMo88316e, (TypeParameterDescriptor) classifierDescriptorMo88316e2, z, new jud(callableDescriptor, callableDescriptor2));
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m91718i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return Intrinsics.m87488d(declarationDescriptor, callableDescriptor) && Intrinsics.m87488d(declarationDescriptor2, callableDescriptor2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m91719l(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.m91724k(declarationDescriptor, declarationDescriptor2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m91720o(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = gud.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.m91726n(typeParameterDescriptor, typeParameterDescriptor2, z, function2);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m91721p(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91722e(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        kotlinTypeRefiner.getClass();
        if (Intrinsics.m87488d(callableDescriptor, callableDescriptor2)) {
            return true;
        }
        if (!Intrinsics.m87488d(callableDescriptor.getName(), callableDescriptor2.getName())) {
            return false;
        }
        if (z2 && (callableDescriptor instanceof MemberDescriptor) && (callableDescriptor2 instanceof MemberDescriptor) && ((MemberDescriptor) callableDescriptor).mo88307n0() != ((MemberDescriptor) callableDescriptor2).mo88307n0()) {
            return false;
        }
        if ((Intrinsics.m87488d(callableDescriptor.mo88299b(), callableDescriptor2.mo88299b()) && (!z || !Intrinsics.m87488d(m91728r(callableDescriptor), m91728r(callableDescriptor2)))) || DescriptorUtils.m91751E(callableDescriptor) || DescriptorUtils.m91751E(callableDescriptor2) || !m91727q(callableDescriptor, callableDescriptor2, hud.INSTANCE, z)) {
            return false;
        }
        OverridingUtil overridingUtilM91821i = OverridingUtil.m91821i(kotlinTypeRefiner, new iud(z, callableDescriptor, callableDescriptor2));
        overridingUtilM91821i.getClass();
        OverridingUtil.OverrideCompatibilityInfo.Result resultM91846c = overridingUtilM91821i.m91837E(callableDescriptor, callableDescriptor2, null, !z3).m91846c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultM91846c == result && overridingUtilM91821i.m91837E(callableDescriptor2, callableDescriptor, null, z3 ^ true).m91846c() == result;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91723j(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.m87488d(classDescriptor.mo88305l(), classDescriptor2.mo88305l());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m91724k(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return m91723j((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return m91720o(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return m91715f(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z, z2, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.m87488d(((PackageFragmentDescriptor) declarationDescriptor).mo88562d(), ((PackageFragmentDescriptor) declarationDescriptor2).mo88562d()) : Intrinsics.m87488d(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: m */
    public final boolean m91725m(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, boolean z) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        return m91720o(this, typeParameterDescriptor, typeParameterDescriptor2, z, null, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: n */
    public final boolean m91726n(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeParameterDescriptor typeParameterDescriptor2, boolean z, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2) {
        typeParameterDescriptor.getClass();
        typeParameterDescriptor2.getClass();
        function2.getClass();
        if (Intrinsics.m87488d(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        return !Intrinsics.m87488d(typeParameterDescriptor.mo88299b(), typeParameterDescriptor2.mo88299b()) && m91727q(typeParameterDescriptor, typeParameterDescriptor2, function2, z) && typeParameterDescriptor.getIndex() == typeParameterDescriptor2.getIndex();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m91727q(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z) {
        DeclarationDescriptor declarationDescriptorMo88299b = declarationDescriptor.mo88299b();
        DeclarationDescriptor declarationDescriptorMo88299b2 = declarationDescriptor2.mo88299b();
        return ((declarationDescriptorMo88299b instanceof CallableMemberDescriptor) || (declarationDescriptorMo88299b2 instanceof CallableMemberDescriptor)) ? function2.invoke(declarationDescriptorMo88299b, declarationDescriptorMo88299b2).booleanValue() : m91719l(this, declarationDescriptorMo88299b, declarationDescriptorMo88299b2, z, false, 8, null);
    }

    /* JADX INFO: renamed from: r */
    public final SourceElement m91728r(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
            collectionMo88447e.getClass();
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(collectionMo88447e);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }
}
