package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierDescriptorWithTypeParameters extends ClassifierDescriptor, MemberDescriptor, Substitutable<ClassifierDescriptorWithTypeParameters> {
    @NotNull
    /* JADX INFO: renamed from: p */
    List<TypeParameterDescriptor> mo88309p();

    /* JADX INFO: renamed from: t */
    boolean mo88312t();
}
