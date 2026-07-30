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
import p153l.jnj0;
import p153l.knj0;
import p153l.lnj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeIntersectionScope extends AbstractScopeAdapter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66601a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemberScope f66602b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberScope m92982a(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
            str.getClass();
            collection.getClass();
            Collection<? extends KotlinType> collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).mo90791n());
            }
            SmartList<MemberScope> smartListM94068b = ScopeUtilsKt.m94068b(arrayList);
            MemberScope memberScopeM92918b = ChainedMemberScope.Companion.m92918b(str, smartListM94068b);
            return smartListM94068b.size() <= 1 ? memberScopeM92918b : new TypeIntersectionScope(str, memberScopeM92918b, null);
        }

        private Companion() {
        }
    }

    public TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f66601a = str;
        this.f66602b = memberScope;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final MemberScope m92978m(@NotNull String str, @NotNull Collection<? extends KotlinType> collection) {
        return Companion.m92982a(str, collection);
    }

    /* JADX INFO: renamed from: n */
    public static final CallableDescriptor m92979n(CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        return callableDescriptor;
    }

    /* JADX INFO: renamed from: o */
    public static final CallableDescriptor m92980o(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: p */
    public static final CallableDescriptor m92981p(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return propertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return OverridingUtilsKt.m92772b(super.mo89611b(name, lookupLocation), jnj0.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return OverridingUtilsKt.m92772b(super.mo89612c(name, lookupLocation), knj0.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        Collection<DeclarationDescriptor> collectionMo89615g = super.mo89615g(descriptorKindFilter, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionMo89615g) {
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
        return CollectionsKt.plus(OverridingUtilsKt.m92772b(list, lnj0.INSTANCE), (Iterable) list2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public MemberScope mo92915i() {
        return this.f66602b;
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }
}
