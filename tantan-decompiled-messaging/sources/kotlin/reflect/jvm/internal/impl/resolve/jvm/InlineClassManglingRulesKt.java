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
    public static final boolean m92006a(ClassDescriptor classDescriptor) {
        return Intrinsics.m87488d(DescriptorUtilsKt.m91982o(classDescriptor), StandardNames.f63831w);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92007b(KotlinType kotlinType, boolean z) {
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo88316e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo88316e : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        return (z || !InlineClassesUtilsKt.m91789d(typeParameterDescriptor)) && m92010e(TypeUtilsKt.m93095o(typeParameterDescriptor));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m92008c(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return InlineClassesUtilsKt.m91792g(declarationDescriptor) && !m92006a((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m92009d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return classifierDescriptorMo88316e != null && ((InlineClassesUtilsKt.m91787b(classifierDescriptorMo88316e) && m92008c(classifierDescriptorMo88316e)) || InlineClassesUtilsKt.m91794i(kotlinType));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m92010e(KotlinType kotlinType) {
        return m92009d(kotlinType) || m92007b(kotlinType, true);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92011f(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ClassConstructorDescriptor classConstructorDescriptor = callableMemberDescriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableMemberDescriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.m88488g(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor classDescriptorMo88462F = classConstructorDescriptor.mo88462F();
        classDescriptorMo88462F.getClass();
        if (InlineClassesUtilsKt.m91792g(classDescriptorMo88462F) || DescriptorUtils.m91753G(classConstructorDescriptor.mo88462F())) {
            return false;
        }
        List<ValueParameterDescriptor> listMo88448g = classConstructorDescriptor.mo88448g();
        listMo88448g.getClass();
        List<ValueParameterDescriptor> list = listMo88448g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            type.getClass();
            if (m92010e(type)) {
                return true;
            }
        }
        return false;
    }
}
