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
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
public interface ResolutionScope {

    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Collection m92958a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                pr3.m173429a("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
                return null;
            }
            if ((i & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.f66566n;
            }
            if ((i & 2) != 0) {
                function1 = MemberScope.Companion.m92956c();
            }
            return resolutionScope.mo89615g(descriptorKindFilter, function1);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* JADX INFO: renamed from: g */
    Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1);
}
