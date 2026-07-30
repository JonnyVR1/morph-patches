package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PackageFragmentProvider f66008a;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        this.f66008a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassData mo90319a(@NotNull ClassId classId) {
        ClassData classDataMo90319a;
        classId.getClass();
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.m88573c(this.f66008a, classId.m91038f())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataMo90319a = ((DeserializedPackageFragment) packageFragmentDescriptor).mo92189B0().mo90319a(classId)) != null) {
                return classDataMo90319a;
            }
        }
        return null;
    }
}
