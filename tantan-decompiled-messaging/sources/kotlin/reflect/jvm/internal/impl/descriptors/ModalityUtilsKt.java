package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ModalityUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m88542a(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return classDescriptor.mo88303i() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS;
    }
}
