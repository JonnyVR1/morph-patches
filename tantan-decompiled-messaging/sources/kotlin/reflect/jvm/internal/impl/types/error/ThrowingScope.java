package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ThrowingScope extends ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(@NotNull ErrorScopeKind errorScopeKind, @NotNull String... strArr) {
        super(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        errorScopeKind.getClass();
        strArr.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        throw new IllegalStateException(m92993j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        throw new IllegalStateException(m92993j());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: h */
    public Set<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        throw new IllegalStateException(m92993j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: i */
    public Set<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        throw new IllegalStateException(m92993j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public String toString() {
        return "ThrowingScope{" + m92993j() + '}';
    }
}
