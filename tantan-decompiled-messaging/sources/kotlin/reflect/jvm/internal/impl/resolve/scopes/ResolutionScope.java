package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public interface ResolutionScope {

    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Collection m92067a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
                return null;
            }
            if ((i & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.f65892n;
            }
            if ((i & 2) != 0) {
                function1 = MemberScope.Companion.m92065c();
            }
            return resolutionScope.mo88724g(descriptorKindFilter, function1);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* JADX INFO: renamed from: g */
    Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1);
}
