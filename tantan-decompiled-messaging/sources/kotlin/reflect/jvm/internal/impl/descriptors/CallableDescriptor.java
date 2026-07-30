package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    public interface UserDataKey<V> {
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    <V> V mo88443J(UserDataKey<V> userDataKey);

    @Nullable
    /* JADX INFO: renamed from: Y */
    ReceiverParameterDescriptor mo88444Y();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    CallableDescriptor mo88445a();

    @Nullable
    /* JADX INFO: renamed from: b0 */
    ReceiverParameterDescriptor mo88446b0();

    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<? extends CallableDescriptor> mo88447e();

    @NotNull
    /* JADX INFO: renamed from: g */
    List<ValueParameterDescriptor> mo88448g();

    @Nullable
    KotlinType getReturnType();

    @NotNull
    List<TypeParameterDescriptor> getTypeParameters();

    /* JADX INFO: renamed from: k0 */
    boolean mo88449k0();

    @NotNull
    /* JADX INFO: renamed from: x0 */
    List<ReceiverParameterDescriptor> mo88450x0();
}
