package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class InlineClassManglingRulesKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m92897a(ClassDescriptor classDescriptor) {
        return Intrinsics.m88377d(DescriptorUtilsKt.m92873o(classDescriptor), StandardNames.f64505w);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92898b(KotlinType kotlinType, boolean z) {
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo89207e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo89207e : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        return (z || !InlineClassesUtilsKt.m92680d(typeParameterDescriptor)) && m92901e(TypeUtilsKt.m93986o(typeParameterDescriptor));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m92899c(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return InlineClassesUtilsKt.m92683g(declarationDescriptor) && !m92897a((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m92900d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return classifierDescriptorMo89207e != null && ((InlineClassesUtilsKt.m92678b(classifierDescriptorMo89207e) && m92899c(classifierDescriptorMo89207e)) || InlineClassesUtilsKt.m92685i(kotlinType));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m92901e(KotlinType kotlinType) {
        return m92900d(kotlinType) || m92898b(kotlinType, true);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92902f(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ClassConstructorDescriptor classConstructorDescriptor = callableMemberDescriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableMemberDescriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.m89379g(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor classDescriptorMo89353F = classConstructorDescriptor.mo89353F();
        classDescriptorMo89353F.getClass();
        if (InlineClassesUtilsKt.m92683g(classDescriptorMo89353F) || DescriptorUtils.m92644G(classConstructorDescriptor.mo89353F())) {
            return false;
        }
        List<ValueParameterDescriptor> listMo89339g = classConstructorDescriptor.mo89339g();
        listMo89339g.getClass();
        List<ValueParameterDescriptor> list = listMo89339g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            type.getClass();
            if (m92901e(type)) {
                return true;
            }
        }
        return false;
    }
}
