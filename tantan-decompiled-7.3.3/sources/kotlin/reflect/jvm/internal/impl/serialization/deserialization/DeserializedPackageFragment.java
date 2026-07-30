package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final StorageManager f66683g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f66683g = storageManager;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public abstract ClassDataFinder mo93080B0();

    /* JADX INFO: renamed from: D0 */
    public boolean m93081D0(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeMo89316n = mo89316n();
        return (memberScopeMo89316n instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScopeMo89316n).m93251t().contains(name);
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo93082E0(@NotNull DeserializationComponents deserializationComponents);
}
