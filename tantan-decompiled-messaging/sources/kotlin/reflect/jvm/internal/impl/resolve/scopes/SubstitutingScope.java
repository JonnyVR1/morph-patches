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
import p149l.b0r;
import p149l.c5g0;
import p149l.d5g0;
import p149l.nnq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MemberScope f65922a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f65923b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeSubstitutor f65924c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Map<DeclarationDescriptor, DeclarationDescriptor> f65925d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f65926e;

    public SubstitutingScope(@NotNull MemberScope memberScope, @NotNull TypeSubstitutor typeSubstitutor) {
        memberScope.getClass();
        typeSubstitutor.getClass();
        this.f65922a = memberScope;
        this.f65923b = LazyKt__LazyJVMKt.m87229b(new c5g0(typeSubstitutor));
        TypeSubstitution typeSubstitutionM92778k = typeSubstitutor.m92778k();
        typeSubstitutionM92778k.getClass();
        this.f65924c = CapturedTypeConstructorKt.m91906h(typeSubstitutionM92778k, false, 1, null).m92757c();
        this.f65926e = LazyKt__LazyJVMKt.m87229b(new d5g0(this));
    }

    /* JADX INFO: renamed from: h */
    public static final Collection m92077h(SubstitutingScope substitutingScope) {
        return substitutingScope.m92082l(ResolutionScope.DefaultImpls.m92067a(substitutingScope.f65922a, null, null, 3, null));
    }

    /* JADX INFO: renamed from: n */
    public static final TypeSubstitutor m92080n(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.m92778k().m92757c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        return this.f65922a.mo88719a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<? extends SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m92082l(this.f65922a.mo88720b(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<? extends PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m92082l(this.f65922a.mo88721c(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        return this.f65922a.mo88722d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return this.f65922a.mo88723e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptorMo89642f = this.f65922a.mo89642f(name, lookupLocation);
        if (classifierDescriptorMo89642f != null) {
            return (ClassifierDescriptor) m92083m(classifierDescriptorMo89642f);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return m92081k();
    }

    /* JADX INFO: renamed from: k */
    public final Collection<DeclarationDescriptor> m92081k() {
        return (Collection) this.f65926e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final <D extends DeclarationDescriptor> Collection<D> m92082l(Collection<? extends D> collection) {
        if (this.f65924c.m92779l() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetM93184g = CollectionsKt.m93184g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetM93184g.add(m92083m((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetM93184g;
    }

    /* JADX INFO: renamed from: m */
    public final <D extends DeclarationDescriptor> D m92083m(D d) {
        if (this.f65924c.m92779l()) {
            return d;
        }
        if (this.f65925d == null) {
            this.f65925d = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.f65925d;
        map.getClass();
        DeclarationDescriptor declarationDescriptorMo88453c = map.get(d);
        if (declarationDescriptorMo88453c == null) {
            if (!(d instanceof Substitutable)) {
                nnq.m160357a("Unknown descriptor in scope: ", d);
                return null;
            }
            declarationDescriptorMo88453c = ((Substitutable) d).mo88453c(this.f65924c);
            if (declarationDescriptorMo88453c == null) {
                b0r.m99785a("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", d, " substitution fails");
                return null;
            }
            map.put(d, declarationDescriptorMo88453c);
        }
        return (D) declarationDescriptorMo88453c;
    }
}
