package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import p149l.fej0;
import p149l.gej0;
import p149l.hej0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeIntersectionScope extends AbstractScopeAdapter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65927a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemberScope f65928b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberScope m92091a(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
            str.getClass();
            collection.getClass();
            Collection<? extends KotlinType> collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).mo89900n());
            }
            SmartList<MemberScope> smartListM93177b = ScopeUtilsKt.m93177b(arrayList);
            MemberScope memberScopeM92027b = ChainedMemberScope.Companion.m92027b(str, smartListM93177b);
            return smartListM93177b.size() <= 1 ? memberScopeM92027b : new TypeIntersectionScope(str, memberScopeM92027b, null);
        }

        private Companion() {
        }
    }

    public TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f65927a = str;
        this.f65928b = memberScope;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final MemberScope m92087m(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
        return Companion.m92091a(str, collection);
    }

    /* JADX INFO: renamed from: n */
    public static final CallableDescriptor m92088n(CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        return callableDescriptor;
    }

    /* JADX INFO: renamed from: o */
    public static final CallableDescriptor m92089o(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: p */
    public static final CallableDescriptor m92090p(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return OverridingUtilsKt.m91881b(super.mo88720b(name, lookupLocation), fej0.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return OverridingUtilsKt.m91881b(super.mo88721c(name, lookupLocation), gej0.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        Collection<DeclarationDescriptor> collectionMo88724g = super.mo88724g(descriptorKindFilter, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionMo88724g) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        list.getClass();
        return CollectionsKt.plus(OverridingUtilsKt.m91881b(list, hej0.INSTANCE), (Iterable) list2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public MemberScope mo92024i() {
        return this.f65928b;
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }
}
