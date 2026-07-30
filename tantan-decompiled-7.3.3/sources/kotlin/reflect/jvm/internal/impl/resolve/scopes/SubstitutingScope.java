package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c2r;
import p153l.kdg0;
import p153l.ldg0;
import p153l.mpq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MemberScope f66596a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f66597b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeSubstitutor f66598c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Map<DeclarationDescriptor, DeclarationDescriptor> f66599d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f66600e;

    public SubstitutingScope(@NotNull MemberScope memberScope, @NotNull TypeSubstitutor typeSubstitutor) {
        memberScope.getClass();
        typeSubstitutor.getClass();
        this.f66596a = memberScope;
        this.f66597b = LazyKt__LazyJVMKt.m88118b(new kdg0(typeSubstitutor));
        TypeSubstitution typeSubstitutionM93669k = typeSubstitutor.m93669k();
        typeSubstitutionM93669k.getClass();
        this.f66598c = CapturedTypeConstructorKt.m92797h(typeSubstitutionM93669k, false, 1, null).m93648c();
        this.f66600e = LazyKt__LazyJVMKt.m88118b(new ldg0(this));
    }

    /* JADX INFO: renamed from: h */
    public static final Collection m92968h(SubstitutingScope substitutingScope) {
        return substitutingScope.m92973l(ResolutionScope.DefaultImpls.m92958a(substitutingScope.f66596a, null, null, 3, null));
    }

    /* JADX INFO: renamed from: n */
    public static final TypeSubstitutor m92971n(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.m93669k().m93648c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        return this.f66596a.mo89610a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<? extends SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m92973l(this.f66596a.mo89611b(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<? extends PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m92973l(this.f66596a.mo89612c(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        return this.f66596a.mo89613d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return this.f66596a.mo89614e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptorMo90533f = this.f66596a.mo90533f(name, lookupLocation);
        if (classifierDescriptorMo90533f != null) {
            return (ClassifierDescriptor) m92974m(classifierDescriptorMo90533f);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return m92972k();
    }

    /* JADX INFO: renamed from: k */
    public final Collection<DeclarationDescriptor> m92972k() {
        return (Collection) this.f66600e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final <D extends DeclarationDescriptor> Collection<D> m92973l(Collection<? extends D> collection) {
        if (this.f66598c.m93670l() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetM94075g = CollectionsKt.m94075g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetM94075g.add(m92974m((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetM94075g;
    }

    /* JADX INFO: renamed from: m */
    public final <D extends DeclarationDescriptor> D m92974m(D d) {
        if (this.f66598c.m93670l()) {
            return d;
        }
        if (this.f66599d == null) {
            this.f66599d = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.f66599d;
        map.getClass();
        DeclarationDescriptor declarationDescriptorMo89344c = map.get(d);
        if (declarationDescriptorMo89344c == null) {
            if (!(d instanceof Substitutable)) {
                mpq.m159379a("Unknown descriptor in scope: ", d);
                return null;
            }
            declarationDescriptorMo89344c = ((Substitutable) d).mo89344c(this.f66598c);
            if (declarationDescriptorMo89344c == null) {
                c2r.m107723a("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", d, " substitution fails");
                return null;
            }
            map.put(d, declarationDescriptorMo89344c);
        }
        return (D) declarationDescriptorMo89344c;
    }
}
