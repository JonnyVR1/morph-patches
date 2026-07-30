package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.go5;
import p153l.x1n;
import p153l.y1n;
import p153l.z1n;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a */
    @Nullable
    public KotlinType f66903a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinkedHashSet<KotlinType> f66904b;

    /* JADX INFO: renamed from: c */
    public final int f66905c;

    public IntersectionTypeConstructor(@NotNull Collection<? extends KotlinType> collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(collection);
        this.f66904b = linkedHashSet;
        this.f66905c = linkedHashSet.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public static final SimpleType m93505m(IntersectionTypeConstructor intersectionTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return intersectionTypeConstructor.mo89568a(kotlinTypeRefiner).m93510l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m93506p(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = y1n.INSTANCE;
        }
        return intersectionTypeConstructor.m93512o(function1);
    }

    /* JADX INFO: renamed from: q */
    public static final String m93507q(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }

    /* JADX INFO: renamed from: r */
    public static final CharSequence m93508r(Function1 function1, KotlinType kotlinType) {
        kotlinType.getClass();
        return function1.invoke(kotlinType).toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89569c() {
        return this.f66904b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo89207e() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.m88377d(this.f66904b, ((IntersectionTypeConstructor) obj).f66904b);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        KotlinBuiltIns kotlinBuiltInsMo89570f = this.f66904b.iterator().next().mo92781G0().mo89570f();
        kotlinBuiltInsMo89570f.getClass();
        return kotlinBuiltInsMo89570f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo89208g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        return this.f66905c;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final MemberScope m93509k() {
        return TypeIntersectionScope.Companion.m92982a("member scope for intersection type", this.f66904b);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SimpleType m93510l() {
        return KotlinTypeFactory.m93528n(TypeAttributes.Companion.m93600k(), this, CollectionsKt.emptyList(), false, m93509k(), new z1n(this));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final KotlinType m93511n() {
        return this.f66903a;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m93512o(@NotNull final Function1<? super KotlinType, ? extends Object> function1) {
        function1.getClass();
        return CollectionsKt.joinToString$default(CollectionsKt.sortedWith(this.f66904b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                KotlinType kotlinType = (KotlinType) t;
                Function1 function2 = function1;
                kotlinType.getClass();
                String string = function2.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t2;
                Function1 function3 = function1;
                kotlinType2.getClass();
                return go5.m131087d(string, function3.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new x1n(function1), 24, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public IntersectionTypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        Collection<KotlinType> collectionMo89569c = mo89569c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89569c, 10));
        Iterator<T> it = collectionMo89569c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).mo93377Q0(kotlinTypeRefiner));
            z = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructorM93514t = null;
        if (z) {
            KotlinType kotlinTypeM93511n = m93511n();
            intersectionTypeConstructorM93514t = new IntersectionTypeConstructor(arrayList).m93514t(kotlinTypeM93511n != null ? kotlinTypeM93511n.mo93377Q0(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructorM93514t == null ? this : intersectionTypeConstructorM93514t;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final IntersectionTypeConstructor m93514t(@Nullable KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.f66904b, kotlinType);
    }

    @NotNull
    public String toString() {
        return m93506p(this, null, 1, null);
    }

    public IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.f66903a = kotlinType;
    }
}
