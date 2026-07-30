package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.kli;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FindClassInModuleKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ClassDescriptor m88507b(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor classifierDescriptorM88508c = m88508c(moduleDescriptor, classId);
        if (classifierDescriptorM88508c instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorM88508c;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final ClassifierDescriptor m88508c(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ModuleDescriptor moduleDescriptorM91884a = ResolutionAnchorProviderKt.m91884a(moduleDescriptor);
        if (moduleDescriptorM91884a == null) {
            PackageViewDescriptor packageViewDescriptorMo88543I = moduleDescriptor.mo88543I(classId.m91038f());
            List<Name> listM91050e = classId.m91039g().m91050e();
            ClassifierDescriptor classifierDescriptorMo89642f = packageViewDescriptorMo88543I.mo88576n().mo89642f((Name) CollectionsKt.first((List) listM91050e), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo89642f == null) {
                return null;
            }
            for (Name name : listM91050e.subList(1, listM91050e.size())) {
                if (!(classifierDescriptorMo89642f instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo89642f2 = ((ClassDescriptor) classifierDescriptorMo89642f).mo88454C().mo89642f(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo89642f = classifierDescriptorMo89642f2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f2 : null;
                if (classifierDescriptorMo89642f == null) {
                    return null;
                }
            }
            return classifierDescriptorMo89642f;
        }
        PackageViewDescriptor packageViewDescriptorMo88543I2 = moduleDescriptorM91884a.mo88543I(classId.m91038f());
        List<Name> listM91050e2 = classId.m91039g().m91050e();
        ClassifierDescriptor classifierDescriptorMo89642f3 = packageViewDescriptorMo88543I2.mo88576n().mo89642f((Name) CollectionsKt.first((List) listM91050e2), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo89642f3 == null) {
            classifierDescriptorMo89642f3 = null;
            break;
        }
        for (Name name2 : listM91050e2.subList(1, listM91050e2.size())) {
            if (classifierDescriptorMo89642f3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo89642f4 = ((ClassDescriptor) classifierDescriptorMo89642f3).mo88454C().mo89642f(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo89642f3 = classifierDescriptorMo89642f4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f4 : null;
                if (classifierDescriptorMo89642f3 != null) {
                }
            }
            classifierDescriptorMo89642f3 = null;
        }
        if (classifierDescriptorMo89642f3 != null) {
            return classifierDescriptorMo89642f3;
        }
        PackageViewDescriptor packageViewDescriptorMo88543I3 = moduleDescriptor.mo88543I(classId.m91038f());
        List<Name> listM91050e3 = classId.m91039g().m91050e();
        ClassifierDescriptor classifierDescriptorMo89642f5 = packageViewDescriptorMo88543I3.mo88576n().mo89642f((Name) CollectionsKt.first((List) listM91050e3), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo89642f5 == null) {
            return null;
        }
        for (Name name3 : listM91050e3.subList(1, listM91050e3.size())) {
            if (!(classifierDescriptorMo89642f5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo89642f6 = ((ClassDescriptor) classifierDescriptorMo89642f5).mo88454C().mo89642f(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo89642f5 = classifierDescriptorMo89642f6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f6 : null;
            if (classifierDescriptorMo89642f5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo89642f5;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ClassDescriptor m88509d(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        classId.getClass();
        notFoundClasses.getClass();
        ClassDescriptor classDescriptorM88507b = m88507b(moduleDescriptor, classId);
        return classDescriptorM88507b != null ? classDescriptorM88507b : notFoundClasses.m88556d(classId, SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93294N(SequencesKt__SequencesKt.m93274n(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).m91037e();
            }
        }), kli.INSTANCE)));
    }

    /* JADX INFO: renamed from: e */
    public static final int m88510e(ClassId classId) {
        classId.getClass();
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final TypeAliasDescriptor m88511f(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor classifierDescriptorM88508c = m88508c(moduleDescriptor, classId);
        if (classifierDescriptorM88508c instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorM88508c;
        }
        return null;
    }
}
