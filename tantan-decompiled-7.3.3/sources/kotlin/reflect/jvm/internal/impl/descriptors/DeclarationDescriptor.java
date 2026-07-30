package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    /* JADX INFO: renamed from: S */
    <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d);

    @NotNull
    /* JADX INFO: renamed from: a */
    DeclarationDescriptor mo89336a();

    @Nullable
    /* JADX INFO: renamed from: b */
    DeclarationDescriptor mo89190b();
}
