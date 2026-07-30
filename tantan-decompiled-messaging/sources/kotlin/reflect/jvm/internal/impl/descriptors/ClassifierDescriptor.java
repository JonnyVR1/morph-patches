package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    ClassifierDescriptor mo88445a();

    @NotNull
    /* JADX INFO: renamed from: l */
    TypeConstructor mo88305l();

    @NotNull
    /* JADX INFO: renamed from: o */
    SimpleType mo88458o();
}
