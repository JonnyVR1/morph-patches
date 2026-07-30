package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    public int f66882a;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract ClassifierDescriptor mo89207e();

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = mo89207e();
        ClassifierDescriptor classifierDescriptorMo89207e2 = typeConstructor.mo89207e();
        if (classifierDescriptorMo89207e2 != null && m93461i(classifierDescriptorMo89207e) && m93461i(classifierDescriptorMo89207e2)) {
            return mo89581j(classifierDescriptorMo89207e2);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m93460h(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull ClassifierDescriptor classifierDescriptor2) {
        classifierDescriptor.getClass();
        classifierDescriptor2.getClass();
        if (!Intrinsics.m88377d(classifierDescriptor.getName(), classifierDescriptor2.getName())) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = classifierDescriptor.mo89190b();
        for (DeclarationDescriptor declarationDescriptorMo89190b2 = classifierDescriptor2.mo89190b(); declarationDescriptorMo89190b != null && declarationDescriptorMo89190b2 != null; declarationDescriptorMo89190b2 = declarationDescriptorMo89190b2.mo89190b()) {
            if (declarationDescriptorMo89190b instanceof ModuleDescriptor) {
                return declarationDescriptorMo89190b2 instanceof ModuleDescriptor;
            }
            if (declarationDescriptorMo89190b2 instanceof ModuleDescriptor) {
                return false;
            }
            if (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) {
                return (declarationDescriptorMo89190b2 instanceof PackageFragmentDescriptor) && Intrinsics.m88377d(((PackageFragmentDescriptor) declarationDescriptorMo89190b).mo89453d(), ((PackageFragmentDescriptor) declarationDescriptorMo89190b2).mo89453d());
            }
            if ((declarationDescriptorMo89190b2 instanceof PackageFragmentDescriptor) || !Intrinsics.m88377d(declarationDescriptorMo89190b.getName(), declarationDescriptorMo89190b2.getName())) {
                return false;
            }
            declarationDescriptorMo89190b = declarationDescriptorMo89190b.mo89190b();
        }
        return true;
    }

    public int hashCode() {
        int i = this.f66882a;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = mo89207e();
        int iHashCode = m93461i(classifierDescriptorMo89207e) ? DescriptorUtils.m92663m(classifierDescriptorMo89207e).hashCode() : System.identityHashCode(this);
        this.f66882a = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m93461i(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.m93894m(classifierDescriptor) || DescriptorUtils.m92642E(classifierDescriptor)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo89581j(@NotNull ClassifierDescriptor classifierDescriptor);
}
