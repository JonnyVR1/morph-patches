package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclarationDescriptorWithVisibility extends DeclarationDescriptor {
    @NotNull
    DescriptorVisibility getVisibility();
}
