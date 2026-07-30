package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorUtilKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ClassifierDescriptor m88478a(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = declarationDescriptor.mo88299b();
        if (declarationDescriptorMo88299b != null && !(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!m88479b(declarationDescriptorMo88299b)) {
                return m88478a(declarationDescriptorMo88299b);
            }
            if (declarationDescriptorMo88299b instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) declarationDescriptorMo88299b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m88479b(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.mo88299b() instanceof PackageFragmentDescriptor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m88480c(@NotNull FunctionDescriptor functionDescriptor) {
        SimpleType simpleTypeMo88458o;
        KotlinType kotlinTypeM93078D;
        KotlinType returnType;
        functionDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptor.mo88299b();
        ClassDescriptor classDescriptor = declarationDescriptorMo88299b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo88299b : null;
        if (classDescriptor != null) {
            ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.m91792g(classDescriptor) ? classDescriptor : null;
            if (classDescriptor2 != null && (simpleTypeMo88458o = classDescriptor2.mo88458o()) != null && (kotlinTypeM93078D = TypeUtilsKt.m93078D(simpleTypeMo88458o)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.m87488d(functionDescriptor.getName(), OperatorNameConventions.f66401d) && ((TypeUtilsKt.m93099s(returnType) || TypeUtilsKt.m93100t(returnType)) && functionDescriptor.mo88448g().size() == 1)) {
                KotlinType type = functionDescriptor.mo88448g().get(0).getType();
                type.getClass();
                if (Intrinsics.m87488d(TypeUtilsKt.m93078D(type), kotlinTypeM93078D) && functionDescriptor.mo88450x0().isEmpty() && functionDescriptor.mo88446b0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final ClassDescriptor m88481d(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        MemberScope memberScopeMo88454C;
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        if (fqName.m91048c()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89642f = moduleDescriptor.mo88543I(fqName.m91049d()).mo88576n().mo89642f(fqName.m91051f(), lookupLocation);
        ClassDescriptor classDescriptor = classifierDescriptorMo89642f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor classDescriptorM88481d = m88481d(moduleDescriptor, fqName.m91049d(), lookupLocation);
        ClassifierDescriptor classifierDescriptorMo89642f2 = (classDescriptorM88481d == null || (memberScopeMo88454C = classDescriptorM88481d.mo88454C()) == null) ? null : memberScopeMo88454C.mo89642f(fqName.m91051f(), lookupLocation);
        if (classifierDescriptorMo89642f2 instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89642f2;
        }
        return null;
    }
}
