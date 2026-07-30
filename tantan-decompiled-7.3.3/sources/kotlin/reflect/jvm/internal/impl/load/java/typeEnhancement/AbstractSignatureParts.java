package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C15669a8;
import p153l.C15945b8;
import p153l.C16208c8;
import p153l.C21772z7;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a */
    public static final class C15328a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final KotlinTypeMarker f65628a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final JavaTypeQualifiersByElementType f65629b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final TypeParameterMarker f65630c;

        public C15328a(@Nullable KotlinTypeMarker kotlinTypeMarker, @Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @Nullable TypeParameterMarker typeParameterMarker) {
            this.f65628a = kotlinTypeMarker;
            this.f65629b = javaTypeQualifiersByElementType;
            this.f65630c = typeParameterMarker;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JavaTypeQualifiersByElementType m90835a() {
            return this.f65629b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final KotlinTypeMarker m90836b() {
            return this.f65628a;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final TypeParameterMarker m90837c() {
            return this.f65630c;
        }
    }

    /* JADX INFO: renamed from: M */
    public static final Iterable m90796M(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, C15328a c15328a) {
        KotlinTypeMarker kotlinTypeMarkerM90836b;
        TypeConstructorMarker typeConstructorMarkerMo91116O;
        List<TypeParameterMarker> listMo91113M0;
        KotlinTypeMarker kotlinTypeMarkerM90836b2;
        c15328a.getClass();
        if ((abstractSignatureParts.mo90808D() && (kotlinTypeMarkerM90836b2 = c15328a.m90836b()) != null && typeSystemContext.mo91168r(kotlinTypeMarkerM90836b2)) || (kotlinTypeMarkerM90836b = c15328a.m90836b()) == null || (typeConstructorMarkerMo91116O = typeSystemContext.mo91116O(kotlinTypeMarkerM90836b)) == null || (listMo91113M0 = typeSystemContext.mo91113M0(typeConstructorMarkerMo91116O)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = listMo91113M0;
        List<TypeArgumentMarker> listMo91169r0 = typeSystemContext.mo91169r0(c15328a.m90836b());
        Iterator<T> it = list.iterator();
        Iterator<T> it2 = listMo91169r0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list, 10), CollectionsKt.collectionSizeOrDefault(listMo91169r0, 10)));
        while (it.hasNext() && it2.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it.next();
            KotlinTypeMarker kotlinTypeMarkerMo91145f0 = typeSystemContext.mo91145f0((TypeArgumentMarker) it2.next());
            arrayList.add(kotlinTypeMarkerMo91145f0 == null ? new C15328a(null, c15328a.m90835a(), typeParameterMarker) : new C15328a(kotlinTypeMarkerMo91145f0, abstractSignatureParts.m90818i(kotlinTypeMarkerMo91145f0, c15328a.m90835a()), typeParameterMarker));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final List m90797a(List list, AbstractSignatureParts abstractSignatureParts) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinTypeMarker kotlinTypeMarkerMo90833y = abstractSignatureParts.mo90833y((KotlinTypeMarker) it.next());
            if (kotlinTypeMarkerMo90833y != null) {
                arrayList.add(kotlinTypeMarkerMo90833y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List<KotlinTypeMarker> m90798b(Lazy<? extends List<? extends KotlinTypeMarker>> lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final JavaTypeQualifiers m90803h(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i) {
        Map<Integer, JavaTypeQualifiers> mapM90995b;
        JavaTypeQualifiers javaTypeQualifiers;
        if (typeEnhancementInfo == null || (mapM90995b = typeEnhancementInfo.m90995b()) == null || (javaTypeQualifiers = mapM90995b.get(Integer.valueOf(i))) == null) {
            return (i < 0 || i >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.m90855a() : javaTypeQualifiersArr[i];
        }
        return javaTypeQualifiers;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m90804l(AbstractSignatureParts abstractSignatureParts, C15328a c15328a, Object obj) {
        obj.getClass();
        return abstractSignatureParts.mo90823o(obj, c15328a.m90836b());
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public abstract FqNameUnsafe mo90805A(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: B */
    public final NullabilityQualifier m90806B(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystemContextMo90809E = mo90809E();
        if (typeSystemContextMo90809E.mo91119P0(typeSystemContextMo90809E.mo91135a0(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystemContextMo90809E.mo91119P0(typeSystemContextMo90809E.mo91174u(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: C */
    public boolean m90807C(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return true;
    }

    /* JADX INFO: renamed from: D */
    public abstract boolean mo90808D();

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract TypeSystemContext mo90809E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo90810F(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: G */
    public abstract boolean mo90811G();

    /* JADX INFO: renamed from: H */
    public abstract boolean mo90812H(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    /* JADX INFO: renamed from: I */
    public abstract boolean mo90813I(@NotNull TypeParameterMarker typeParameterMarker);

    /* JADX INFO: renamed from: J */
    public boolean mo90814J(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final NullabilityQualifierWithMigrationStatus m90815K(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        return (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.m90869d() && !nullabilityQualifierWithMigrationStatus2.m90869d()) || ((nullabilityQualifierWithMigrationStatus.m90869d() || !nullabilityQualifierWithMigrationStatus2.m90869d()) && (nullabilityQualifierWithMigrationStatus.m90868c().compareTo(nullabilityQualifierWithMigrationStatus2.m90868c()) < 0 || nullabilityQualifierWithMigrationStatus.m90868c().compareTo(nullabilityQualifierWithMigrationStatus2.m90868c()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: renamed from: L */
    public final List<C15328a> m90816L(KotlinTypeMarker kotlinTypeMarker) {
        return m90821m(new C15328a(kotlinTypeMarker, m90818i(kotlinTypeMarker, mo90829u()), null), new C16208c8(this, mo90809E()));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Function1<Integer, JavaTypeQualifiers> m90817g(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> iterable, @Nullable TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        int size;
        KotlinTypeMarker kotlinTypeMarkerM90836b;
        kotlinTypeMarker.getClass();
        iterable.getClass();
        List<C15328a> listM90816L = m90816L(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends KotlinTypeMarker> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m90816L(it.next()));
        }
        if (m90834z()) {
            size = 1;
        } else {
            if (mo90811G() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!mo90812H(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listM90816L.size();
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i = 0;
        while (i < size) {
            JavaTypeQualifiers javaTypeQualifiersM90820k = m90820k(listM90816L.get(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C15328a c15328a = (C15328a) CollectionsKt.getOrNull((List) it3.next(), i);
                JavaTypeQualifiers javaTypeQualifiersM90819j = (c15328a == null || (kotlinTypeMarkerM90836b = c15328a.m90836b()) == null) ? null : m90819j(kotlinTypeMarkerM90836b);
                if (javaTypeQualifiersM90819j != null) {
                    arrayList2.add(javaTypeQualifiersM90819j);
                }
            }
            javaTypeQualifiersArr[i] = TypeEnhancementUtilsKt.m91005a(javaTypeQualifiersM90820k, arrayList2, i == 0 && mo90811G(), i == 0 && mo90830v(), z);
            i++;
        }
        return new C15945b8(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    /* JADX INFO: renamed from: i */
    public final JavaTypeQualifiersByElementType m90818i(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return mo90824p().m90209d(javaTypeQualifiersByElementType, mo90825q(kotlinTypeMarker));
    }

    /* JADX INFO: renamed from: j */
    public final JavaTypeQualifiers m90819j(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifierM90806B;
        NullabilityQualifier nullabilityQualifierM90806B2 = m90806B(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierM90806B2 == null) {
            KotlinTypeMarker kotlinTypeMarkerMo90833y = mo90833y(kotlinTypeMarker);
            nullabilityQualifierM90806B = kotlinTypeMarkerMo90833y != null ? m90806B(kotlinTypeMarkerMo90833y) : null;
        } else {
            nullabilityQualifierM90806B = nullabilityQualifierM90806B2;
        }
        TypeSystemContext typeSystemContextMo90809E = mo90809E();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.m89245l(mo90805A(typeSystemContextMo90809E.mo91135a0(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.m89244k(mo90805A(typeSystemContextMo90809E.mo91174u(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new JavaTypeQualifiers(nullabilityQualifierM90806B, mutabilityQualifier, mo90809E().mo91122R(kotlinTypeMarker) || mo90814J(kotlinTypeMarker), nullabilityQualifierM90806B != nullabilityQualifierM90806B2);
    }

    /* JADX INFO: renamed from: k */
    public final JavaTypeQualifiers m90820k(C15328a c15328a) {
        List listEmptyList;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90826r;
        KotlinTypeMarker kotlinTypeMarkerM90836b;
        TypeConstructorMarker typeConstructorMarkerMo91116O;
        if (c15328a.m90836b() == null) {
            TypeSystemContext typeSystemContextMo90809E = mo90809E();
            TypeParameterMarker typeParameterMarkerM90837c = c15328a.m90837c();
            if ((typeParameterMarkerM90837c != null ? typeSystemContextMo90809E.mo91165p0(typeParameterMarkerM90837c) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.m90855a();
            }
        }
        boolean z = false;
        boolean z2 = c15328a.m90837c() == null;
        KotlinTypeMarker kotlinTypeMarkerM90836b2 = c15328a.m90836b();
        if (kotlinTypeMarkerM90836b2 == null || (listEmptyList = mo90825q(kotlinTypeMarkerM90836b2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystemContextMo90809E2 = mo90809E();
        KotlinTypeMarker kotlinTypeMarkerM90836b3 = c15328a.m90836b();
        TypeParameterMarker typeParameterMarkerMo91161n0 = (kotlinTypeMarkerM90836b3 == null || (typeConstructorMarkerMo91116O = typeSystemContextMo90809E2.mo91116O(kotlinTypeMarkerM90836b3)) == null) ? null : typeSystemContextMo90809E2.mo91161n0(typeConstructorMarkerMo91116O);
        boolean z3 = mo90828t() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z2) {
            if (z3 || !mo90832x() || (kotlinTypeMarkerM90836b = c15328a.m90836b()) == null || !mo90810F(kotlinTypeMarkerM90836b)) {
                listEmptyList = CollectionsKt.plus((Iterable) mo90827s(), (Iterable) listEmptyList);
            } else {
                Iterable<TAnnotation> iterableMo90827s = mo90827s();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableMo90827s) {
                    if (!mo90824p().m90220p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listEmptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList);
            }
        }
        MutabilityQualifier mutabilityQualifierM90211g = mo90824p().m90211g(listEmptyList);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90212h = mo90824p().m90212h(listEmptyList, new C21772z7(this, c15328a));
        if (nullabilityQualifierWithMigrationStatusM90212h != null) {
            NullabilityQualifier nullabilityQualifierM90868c = nullabilityQualifierWithMigrationStatusM90212h.m90868c();
            if (nullabilityQualifierWithMigrationStatusM90212h.m90868c() == NullabilityQualifier.NOT_NULL && typeParameterMarkerMo91161n0 != null) {
                z = true;
            }
            return new JavaTypeQualifiers(nullabilityQualifierM90868c, mutabilityQualifierM90211g, z, nullabilityQualifierWithMigrationStatusM90212h.m90869d());
        }
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeMo90828t = (z2 || z3) ? mo90828t() : AnnotationQualifierApplicabilityType.TYPE_USE;
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementTypeM90835a = c15328a.m90835a();
        JavaDefaultQualifiers javaDefaultQualifiersM90314a = javaTypeQualifiersByElementTypeM90835a != null ? javaTypeQualifiersByElementTypeM90835a.m90314a(annotationQualifierApplicabilityTypeMo90828t) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90826r2 = typeParameterMarkerMo91161n0 != null ? m90826r(typeParameterMarkerMo91161n0) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusMo90831w = mo90831w(nullabilityQualifierWithMigrationStatusM90826r2, javaDefaultQualifiersM90314a);
        boolean z4 = (nullabilityQualifierWithMigrationStatusM90826r2 != null ? nullabilityQualifierWithMigrationStatusM90826r2.m90868c() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterMarkerMo91161n0 == null || javaDefaultQualifiersM90314a == null || !javaDefaultQualifiersM90314a.m90277c());
        TypeParameterMarker typeParameterMarkerM90837c2 = c15328a.m90837c();
        if (typeParameterMarkerM90837c2 == null || (nullabilityQualifierWithMigrationStatusM90826r = m90826r(typeParameterMarkerM90837c2)) == null) {
            nullabilityQualifierWithMigrationStatusM90826r = null;
        } else if (nullabilityQualifierWithMigrationStatusM90826r.m90868c() == NullabilityQualifier.NULLABLE) {
            nullabilityQualifierWithMigrationStatusM90826r = NullabilityQualifierWithMigrationStatus.m90866b(nullabilityQualifierWithMigrationStatusM90826r, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90815K = m90815K(nullabilityQualifierWithMigrationStatusM90826r, nullabilityQualifierWithMigrationStatusMo90831w);
        NullabilityQualifier nullabilityQualifierM90868c2 = nullabilityQualifierWithMigrationStatusM90815K != null ? nullabilityQualifierWithMigrationStatusM90815K.m90868c() : null;
        if (nullabilityQualifierWithMigrationStatusM90815K != null && nullabilityQualifierWithMigrationStatusM90815K.m90869d()) {
            z = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifierM90868c2, mutabilityQualifierM90211g, z4, z);
    }

    /* JADX INFO: renamed from: m */
    public final <T> List<T> m90821m(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m90822n(t, arrayList, function1);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final <T> void m90822n(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = function1.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                m90822n(it.next(), list, function1);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo90823o(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> mo90824p();

    @NotNull
    /* JADX INFO: renamed from: q */
    public abstract Iterable<TAnnotation> mo90825q(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: r */
    public final NullabilityQualifierWithMigrationStatus m90826r(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> listM90798b;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystemContextMo90809E = mo90809E();
        if (!mo90813I(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> listMo91094D = typeSystemContextMo90809E.mo91094D(typeParameterMarker);
        List<KotlinTypeMarker> list = listMo91094D;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!typeSystemContextMo90809E.mo91176v((KotlinTypeMarker) it.next())) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (m90806B((KotlinTypeMarker) obj) != null) {
                            arrayList.add(obj);
                        }
                    }
                    Lazy lazyM88117a = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new C15669a8(listMo91094D, this));
                    if (!arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            do {
                                if (it2.hasNext()) {
                                }
                            } while (!m90807C((KotlinTypeMarker) it2.next()));
                            listM90798b = listMo91094D;
                        }
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                    }
                    if (m90798b(lazyM88117a).isEmpty()) {
                        break;
                    }
                    List<KotlinTypeMarker> listM90798b2 = m90798b(lazyM88117a);
                    if (!(listM90798b2 instanceof Collection) || !listM90798b2.isEmpty()) {
                        Iterator<T> it3 = listM90798b2.iterator();
                        do {
                            if (it3.hasNext()) {
                            }
                        } while (!m90807C((KotlinTypeMarker) it3.next()));
                        listM90798b = m90798b(lazyM88117a);
                    }
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                    List<KotlinTypeMarker> list2 = listM90798b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            if (!typeSystemContextMo90809E.mo91183y0((KotlinTypeMarker) it4.next())) {
                                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                break;
                            }
                        }
                    } else {
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    }
                    return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, listM90798b != listMo91094D);
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public abstract Iterable<TAnnotation> mo90827s();

    @NotNull
    /* JADX INFO: renamed from: t */
    public abstract AnnotationQualifierApplicabilityType mo90828t();

    @Nullable
    /* JADX INFO: renamed from: u */
    public abstract JavaTypeQualifiersByElementType mo90829u();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo90830v();

    @Nullable
    /* JADX INFO: renamed from: w */
    public abstract NullabilityQualifierWithMigrationStatus mo90831w(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers);

    /* JADX INFO: renamed from: x */
    public abstract boolean mo90832x();

    @Nullable
    /* JADX INFO: renamed from: y */
    public abstract KotlinTypeMarker mo90833y(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: z */
    public boolean m90834z() {
        return false;
    }
}
