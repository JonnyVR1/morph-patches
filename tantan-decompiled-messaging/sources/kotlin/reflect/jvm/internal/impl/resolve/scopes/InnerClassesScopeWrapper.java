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
    public final MemberScope f65913a;

    public InnerClassesScopeWrapper(@NotNull MemberScope memberScope) {
        memberScope.getClass();
        this.f65913a = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        return this.f65913a.mo88719a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        return this.f65913a.mo88722d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return this.f65913a.mo88723e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptorMo89642f = this.f65913a.mo89642f(name, lookupLocation);
        if (classifierDescriptorMo89642f != null) {
            ClassDescriptor classDescriptor = classifierDescriptorMo89642f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorMo89642f instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorMo89642f;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<ClassifierDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        DescriptorKindFilter descriptorKindFilterM92042n = descriptorKindFilter.m92042n(DescriptorKindFilter.Companion.m92045c());
        if (descriptorKindFilterM92042n == null) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionMo88724g = this.f65913a.mo88724g(descriptorKindFilterM92042n, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo88724g) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "Classes from " + this.f65913a;
    }
}
