package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MemberScope f66587a;

    public InnerClassesScopeWrapper(@NotNull MemberScope memberScope) {
        memberScope.getClass();
        this.f66587a = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        return this.f66587a.mo89610a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        return this.f66587a.mo89613d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return this.f66587a.mo89614e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptorMo90533f = this.f66587a.mo90533f(name, lookupLocation);
        if (classifierDescriptorMo90533f != null) {
            ClassDescriptor classDescriptor = classifierDescriptorMo90533f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorMo90533f instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorMo90533f;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<ClassifierDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        DescriptorKindFilter descriptorKindFilterM92933n = descriptorKindFilter.m92933n(DescriptorKindFilter.Companion.m92936c());
        if (descriptorKindFilterM92933n == null) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionMo89615g = this.f66587a.mo89615g(descriptorKindFilterM92933n, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo89615g) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "Classes from " + this.f66587a;
    }
}
