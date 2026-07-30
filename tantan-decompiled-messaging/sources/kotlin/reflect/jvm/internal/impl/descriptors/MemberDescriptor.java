package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    /* JADX INFO: renamed from: e0 */
    boolean mo88301e0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    DescriptorVisibility getVisibility();

    @NotNull
    /* JADX INFO: renamed from: i */
    Modality mo88303i();

    boolean isExternal();

    /* JADX INFO: renamed from: n0 */
    boolean mo88307n0();
}
