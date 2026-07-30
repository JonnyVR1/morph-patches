package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeclarationDescriptor f65322a;

    public DeprecationCausedByFunctionNInfo(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        this.f65322a = declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeprecationLevelValue mo90259b() {
        return DeprecationLevelValue.ERROR;
    }
}
