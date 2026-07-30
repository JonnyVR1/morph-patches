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
    public final PackageFragmentProvider f66682a;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        this.f66682a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassData mo91210a(@NotNull ClassId classId) {
        ClassData classDataMo91210a;
        classId.getClass();
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.m89464c(this.f66682a, classId.m91929f())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataMo91210a = ((DeserializedPackageFragment) packageFragmentDescriptor).mo93080B0().mo91210a(classId)) != null) {
                return classDataMo91210a;
            }
        }
        return null;
    }
}
