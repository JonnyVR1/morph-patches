package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* JADX INFO: renamed from: N */
    void mo88451N(@NotNull Collection<? extends CallableMemberDescriptor> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    CallableMemberDescriptor mo88445a();

    @NotNull
    /* JADX INFO: renamed from: a0 */
    CallableMemberDescriptor mo88452a0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, Kind kind, boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<? extends CallableMemberDescriptor> mo88447e();

    @NotNull
    Kind getKind();
}
