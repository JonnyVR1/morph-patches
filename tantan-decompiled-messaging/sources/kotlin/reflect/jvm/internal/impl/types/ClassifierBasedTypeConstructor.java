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
    public int f66208a;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract ClassifierDescriptor mo88316e();

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
        ClassifierDescriptor classifierDescriptorMo88316e = mo88316e();
        ClassifierDescriptor classifierDescriptorMo88316e2 = typeConstructor.mo88316e();
        if (classifierDescriptorMo88316e2 != null && m92570i(classifierDescriptorMo88316e) && m92570i(classifierDescriptorMo88316e2)) {
            return mo88690j(classifierDescriptorMo88316e2);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m92569h(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull ClassifierDescriptor classifierDescriptor2) {
        classifierDescriptor.getClass();
        classifierDescriptor2.getClass();
        if (!Intrinsics.m87488d(classifierDescriptor.getName(), classifierDescriptor2.getName())) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = classifierDescriptor.mo88299b();
        for (DeclarationDescriptor declarationDescriptorMo88299b2 = classifierDescriptor2.mo88299b(); declarationDescriptorMo88299b != null && declarationDescriptorMo88299b2 != null; declarationDescriptorMo88299b2 = declarationDescriptorMo88299b2.mo88299b()) {
            if (declarationDescriptorMo88299b instanceof ModuleDescriptor) {
                return declarationDescriptorMo88299b2 instanceof ModuleDescriptor;
            }
            if (declarationDescriptorMo88299b2 instanceof ModuleDescriptor) {
                return false;
            }
            if (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) {
                return (declarationDescriptorMo88299b2 instanceof PackageFragmentDescriptor) && Intrinsics.m87488d(((PackageFragmentDescriptor) declarationDescriptorMo88299b).mo88562d(), ((PackageFragmentDescriptor) declarationDescriptorMo88299b2).mo88562d());
            }
            if ((declarationDescriptorMo88299b2 instanceof PackageFragmentDescriptor) || !Intrinsics.m87488d(declarationDescriptorMo88299b.getName(), declarationDescriptorMo88299b2.getName())) {
                return false;
            }
            declarationDescriptorMo88299b = declarationDescriptorMo88299b.mo88299b();
        }
        return true;
    }

    public int hashCode() {
        int i = this.f66208a;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = mo88316e();
        int iHashCode = m92570i(classifierDescriptorMo88316e) ? DescriptorUtils.m91772m(classifierDescriptorMo88316e).hashCode() : System.identityHashCode(this);
        this.f66208a = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m92570i(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.m93003m(classifierDescriptor) || DescriptorUtils.m91751E(classifierDescriptor)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo88690j(@NotNull ClassifierDescriptor classifierDescriptor);
}
