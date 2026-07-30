package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    /* JADX INFO: renamed from: e0 */
    boolean mo89192e0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    DescriptorVisibility getVisibility();

    @NotNull
    /* JADX INFO: renamed from: i */
    Modality mo89194i();

    boolean isExternal();

    /* JADX INFO: renamed from: n0 */
    boolean mo89198n0();
}
