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
    public static final ClassifierDescriptor m89369a(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = declarationDescriptor.mo89190b();
        if (declarationDescriptorMo89190b != null && !(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!m89370b(declarationDescriptorMo89190b)) {
                return m89369a(declarationDescriptorMo89190b);
            }
            if (declarationDescriptorMo89190b instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) declarationDescriptorMo89190b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89370b(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.mo89190b() instanceof PackageFragmentDescriptor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m89371c(@NotNull FunctionDescriptor functionDescriptor) {
        SimpleType simpleTypeMo89349o;
        KotlinType kotlinTypeM93969D;
        KotlinType returnType;
        functionDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = functionDescriptor.mo89190b();
        ClassDescriptor classDescriptor = declarationDescriptorMo89190b instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89190b : null;
        if (classDescriptor != null) {
            ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.m92683g(classDescriptor) ? classDescriptor : null;
            if (classDescriptor2 != null && (simpleTypeMo89349o = classDescriptor2.mo89349o()) != null && (kotlinTypeM93969D = TypeUtilsKt.m93969D(simpleTypeMo89349o)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.m88377d(functionDescriptor.getName(), OperatorNameConventions.f67075d) && ((TypeUtilsKt.m93990s(returnType) || TypeUtilsKt.m93991t(returnType)) && functionDescriptor.mo89339g().size() == 1)) {
                KotlinType type = functionDescriptor.mo89339g().get(0).getType();
                type.getClass();
                if (Intrinsics.m88377d(TypeUtilsKt.m93969D(type), kotlinTypeM93969D) && functionDescriptor.mo89341x0().isEmpty() && functionDescriptor.mo89337b0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final ClassDescriptor m89372d(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        MemberScope memberScopeMo89345C;
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        if (fqName.m91939c()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo90533f = moduleDescriptor.mo89434I(fqName.m91940d()).mo89467n().mo90533f(fqName.m91942f(), lookupLocation);
        ClassDescriptor classDescriptor = classifierDescriptorMo90533f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor classDescriptorM89372d = m89372d(moduleDescriptor, fqName.m91940d(), lookupLocation);
        ClassifierDescriptor classifierDescriptorMo90533f2 = (classDescriptorM89372d == null || (memberScopeMo89345C = classDescriptorM89372d.mo89345C()) == null) ? null : memberScopeMo89345C.mo90533f(fqName.m91942f(), lookupLocation);
        if (classifierDescriptorMo90533f2 instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo90533f2;
        }
        return null;
    }
}
