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
    public final StorageManager f66009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        super(moduleDescriptor, fqName);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f66009g = storageManager;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public abstract ClassDataFinder mo92189B0();

    /* JADX INFO: renamed from: D0 */
    public boolean m92190D0(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeMo88425n = mo88425n();
        return (memberScopeMo88425n instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScopeMo88425n).m92360t().contains(name);
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo92191E0(@NotNull DeserializationComponents deserializationComponents);
}
