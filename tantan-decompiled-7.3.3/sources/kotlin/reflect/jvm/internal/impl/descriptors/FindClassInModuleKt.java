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
import p153l.goi;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FindClassInModuleKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ClassDescriptor m89398b(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor classifierDescriptorM89399c = m89399c(moduleDescriptor, classId);
        if (classifierDescriptorM89399c instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorM89399c;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final ClassifierDescriptor m89399c(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ModuleDescriptor moduleDescriptorM92775a = ResolutionAnchorProviderKt.m92775a(moduleDescriptor);
        if (moduleDescriptorM92775a == null) {
            PackageViewDescriptor packageViewDescriptorMo89434I = moduleDescriptor.mo89434I(classId.m91929f());
            List<Name> listM91941e = classId.m91930g().m91941e();
            ClassifierDescriptor classifierDescriptorMo90533f = packageViewDescriptorMo89434I.mo89467n().mo90533f((Name) CollectionsKt.first((List) listM91941e), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo90533f == null) {
                return null;
            }
            for (Name name : listM91941e.subList(1, listM91941e.size())) {
                if (!(classifierDescriptorMo90533f instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo90533f2 = ((ClassDescriptor) classifierDescriptorMo90533f).mo89345C().mo90533f(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo90533f = classifierDescriptorMo90533f2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f2 : null;
                if (classifierDescriptorMo90533f == null) {
                    return null;
                }
            }
            return classifierDescriptorMo90533f;
        }
        PackageViewDescriptor packageViewDescriptorMo89434I2 = moduleDescriptorM92775a.mo89434I(classId.m91929f());
        List<Name> listM91941e2 = classId.m91930g().m91941e();
        ClassifierDescriptor classifierDescriptorMo90533f3 = packageViewDescriptorMo89434I2.mo89467n().mo90533f((Name) CollectionsKt.first((List) listM91941e2), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo90533f3 == null) {
            classifierDescriptorMo90533f3 = null;
            break;
        }
        for (Name name2 : listM91941e2.subList(1, listM91941e2.size())) {
            if (classifierDescriptorMo90533f3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo90533f4 = ((ClassDescriptor) classifierDescriptorMo90533f3).mo89345C().mo90533f(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo90533f3 = classifierDescriptorMo90533f4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f4 : null;
                if (classifierDescriptorMo90533f3 != null) {
                }
            }
            classifierDescriptorMo90533f3 = null;
        }
        if (classifierDescriptorMo90533f3 != null) {
            return classifierDescriptorMo90533f3;
        }
        PackageViewDescriptor packageViewDescriptorMo89434I3 = moduleDescriptor.mo89434I(classId.m91929f());
        List<Name> listM91941e3 = classId.m91930g().m91941e();
        ClassifierDescriptor classifierDescriptorMo90533f5 = packageViewDescriptorMo89434I3.mo89467n().mo90533f((Name) CollectionsKt.first((List) listM91941e3), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo90533f5 == null) {
            return null;
        }
        for (Name name3 : listM91941e3.subList(1, listM91941e3.size())) {
            if (!(classifierDescriptorMo90533f5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo90533f6 = ((ClassDescriptor) classifierDescriptorMo90533f5).mo89345C().mo90533f(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo90533f5 = classifierDescriptorMo90533f6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f6 : null;
            if (classifierDescriptorMo90533f5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo90533f5;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ClassDescriptor m89400d(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        classId.getClass();
        notFoundClasses.getClass();
        ClassDescriptor classDescriptorM89398b = m89398b(moduleDescriptor, classId);
        return classDescriptorM89398b != null ? classDescriptorM89398b : notFoundClasses.m89447d(classId, SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94185N(SequencesKt__SequencesKt.m94165n(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).m91928e();
            }
        }), goi.INSTANCE)));
    }

    /* JADX INFO: renamed from: e */
    public static final int m89401e(ClassId classId) {
        classId.getClass();
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final TypeAliasDescriptor m89402f(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor classifierDescriptorM89399c = m89399c(moduleDescriptor, classId);
        if (classifierDescriptorM89399c instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorM89399c;
        }
        return null;
    }
}
