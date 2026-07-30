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
import p149l.cn5;
import p149l.xzm;
import p149l.yzm;
import p149l.zzm;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a */
    @Nullable
    public KotlinType f66229a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinkedHashSet<KotlinType> f66230b;

    /* JADX INFO: renamed from: c */
    public final int f66231c;

    public IntersectionTypeConstructor(@NotNull Collection<? extends KotlinType> collection) {
        collection.getClass();
        collection.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(collection);
        this.f66230b = linkedHashSet;
        this.f66231c = linkedHashSet.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public static final SimpleType m92614m(IntersectionTypeConstructor intersectionTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return intersectionTypeConstructor.mo88677a(kotlinTypeRefiner).m92619l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m92615p(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = yzm.INSTANCE;
        }
        return intersectionTypeConstructor.m92621o(function1);
    }

    /* JADX INFO: renamed from: q */
    public static final String m92616q(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }

    /* JADX INFO: renamed from: r */
    public static final CharSequence m92617r(Function1 function1, KotlinType kotlinType) {
        kotlinType.getClass();
        return function1.invoke(kotlinType).toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo88678c() {
        return this.f66230b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo88316e() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.m87488d(this.f66230b, ((IntersectionTypeConstructor) obj).f66230b);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88679f() {
        KotlinBuiltIns kotlinBuiltInsMo88679f = this.f66230b.iterator().next().mo91890G0().mo88679f();
        kotlinBuiltInsMo88679f.getClass();
        return kotlinBuiltInsMo88679f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        return this.f66231c;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final MemberScope m92618k() {
        return TypeIntersectionScope.Companion.m92091a("member scope for intersection type", this.f66230b);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SimpleType m92619l() {
        return KotlinTypeFactory.m92637n(TypeAttributes.Companion.m92709k(), this, CollectionsKt.emptyList(), false, m92618k(), new zzm(this));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final KotlinType m92620n() {
        return this.f66229a;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final String m92621o(@NotNull final Function1<? super KotlinType, ? extends Object> function1) {
        function1.getClass();
        return CollectionsKt.joinToString$default(CollectionsKt.sortedWith(this.f66230b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
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
                return cn5.m107733d(string, function3.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new xzm(function1), 24, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public IntersectionTypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        Collection<KotlinType> collectionMo88678c = mo88678c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88678c, 10));
        Iterator<T> it = collectionMo88678c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).mo92486Q0(kotlinTypeRefiner));
            z = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructorM92623t = null;
        if (z) {
            KotlinType kotlinTypeM92620n = m92620n();
            intersectionTypeConstructorM92623t = new IntersectionTypeConstructor(arrayList).m92623t(kotlinTypeM92620n != null ? kotlinTypeM92620n.mo92486Q0(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructorM92623t == null ? this : intersectionTypeConstructorM92623t;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final IntersectionTypeConstructor m92623t(@Nullable KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.f66230b, kotlinType);
    }

    @NotNull
    public String toString() {
        return m92615p(this, null, 1, null);
    }

    public IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.f66229a = kotlinType;
    }
}
