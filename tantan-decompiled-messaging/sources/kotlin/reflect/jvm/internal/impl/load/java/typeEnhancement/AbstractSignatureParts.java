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
import p149l.C16560e8;
import p149l.C16772f8;
import p149l.C17022g8;
import p149l.C17243h8;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a */
    public static final class C15221a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final KotlinTypeMarker f64954a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final JavaTypeQualifiersByElementType f64955b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final TypeParameterMarker f64956c;

        public C15221a(@Nullable KotlinTypeMarker kotlinTypeMarker, @Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @Nullable TypeParameterMarker typeParameterMarker) {
            this.f64954a = kotlinTypeMarker;
            this.f64955b = javaTypeQualifiersByElementType;
            this.f64956c = typeParameterMarker;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JavaTypeQualifiersByElementType m89944a() {
            return this.f64955b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final KotlinTypeMarker m89945b() {
            return this.f64954a;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final TypeParameterMarker m89946c() {
            return this.f64956c;
        }
    }

    /* JADX INFO: renamed from: M */
    public static final Iterable m89905M(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, C15221a c15221a) {
        KotlinTypeMarker kotlinTypeMarkerM89945b;
        TypeConstructorMarker typeConstructorMarkerMo90225O;
        List<TypeParameterMarker> listMo90222M0;
        KotlinTypeMarker kotlinTypeMarkerM89945b2;
        c15221a.getClass();
        if ((abstractSignatureParts.mo89917D() && (kotlinTypeMarkerM89945b2 = c15221a.m89945b()) != null && typeSystemContext.mo90277r(kotlinTypeMarkerM89945b2)) || (kotlinTypeMarkerM89945b = c15221a.m89945b()) == null || (typeConstructorMarkerMo90225O = typeSystemContext.mo90225O(kotlinTypeMarkerM89945b)) == null || (listMo90222M0 = typeSystemContext.mo90222M0(typeConstructorMarkerMo90225O)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = listMo90222M0;
        List<TypeArgumentMarker> listMo90278r0 = typeSystemContext.mo90278r0(c15221a.m89945b());
        Iterator<T> it = list.iterator();
        Iterator<T> it2 = listMo90278r0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list, 10), CollectionsKt.collectionSizeOrDefault(listMo90278r0, 10)));
        while (it.hasNext() && it2.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it.next();
            KotlinTypeMarker kotlinTypeMarkerMo90254f0 = typeSystemContext.mo90254f0((TypeArgumentMarker) it2.next());
            arrayList.add(kotlinTypeMarkerMo90254f0 == null ? new C15221a(null, c15221a.m89944a(), typeParameterMarker) : new C15221a(kotlinTypeMarkerMo90254f0, abstractSignatureParts.m89927i(kotlinTypeMarkerMo90254f0, c15221a.m89944a()), typeParameterMarker));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final List m89906a(List list, AbstractSignatureParts abstractSignatureParts) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinTypeMarker kotlinTypeMarkerMo89942y = abstractSignatureParts.mo89942y((KotlinTypeMarker) it.next());
            if (kotlinTypeMarkerMo89942y != null) {
                arrayList.add(kotlinTypeMarkerMo89942y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List<KotlinTypeMarker> m89907b(Lazy<? extends List<? extends KotlinTypeMarker>> lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final JavaTypeQualifiers m89912h(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i) {
        Map<Integer, JavaTypeQualifiers> mapM90104b;
        JavaTypeQualifiers javaTypeQualifiers;
        if (typeEnhancementInfo == null || (mapM90104b = typeEnhancementInfo.m90104b()) == null || (javaTypeQualifiers = mapM90104b.get(Integer.valueOf(i))) == null) {
            return (i < 0 || i >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.m89964a() : javaTypeQualifiersArr[i];
        }
        return javaTypeQualifiers;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m89913l(AbstractSignatureParts abstractSignatureParts, C15221a c15221a, Object obj) {
        obj.getClass();
        return abstractSignatureParts.mo89932o(obj, c15221a.m89945b());
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public abstract FqNameUnsafe mo89914A(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: B */
    public final NullabilityQualifier m89915B(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystemContextMo89918E = mo89918E();
        if (typeSystemContextMo89918E.mo90228P0(typeSystemContextMo89918E.mo90244a0(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystemContextMo89918E.mo90228P0(typeSystemContextMo89918E.mo90283u(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    /* JADX INFO: renamed from: C */
    public boolean m89916C(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return true;
    }

    /* JADX INFO: renamed from: D */
    public abstract boolean mo89917D();

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract TypeSystemContext mo89918E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo89919F(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: G */
    public abstract boolean mo89920G();

    /* JADX INFO: renamed from: H */
    public abstract boolean mo89921H(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    /* JADX INFO: renamed from: I */
    public abstract boolean mo89922I(@NotNull TypeParameterMarker typeParameterMarker);

    /* JADX INFO: renamed from: J */
    public boolean mo89923J(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final NullabilityQualifierWithMigrationStatus m89924K(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        return (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.m89978d() && !nullabilityQualifierWithMigrationStatus2.m89978d()) || ((nullabilityQualifierWithMigrationStatus.m89978d() || !nullabilityQualifierWithMigrationStatus2.m89978d()) && (nullabilityQualifierWithMigrationStatus.m89977c().compareTo(nullabilityQualifierWithMigrationStatus2.m89977c()) < 0 || nullabilityQualifierWithMigrationStatus.m89977c().compareTo(nullabilityQualifierWithMigrationStatus2.m89977c()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: renamed from: L */
    public final List<C15221a> m89925L(KotlinTypeMarker kotlinTypeMarker) {
        return m89930m(new C15221a(kotlinTypeMarker, m89927i(kotlinTypeMarker, mo89938u()), null), new C17243h8(this, mo89918E()));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Function1<Integer, JavaTypeQualifiers> m89926g(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> iterable, @Nullable TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        int size;
        KotlinTypeMarker kotlinTypeMarkerM89945b;
        kotlinTypeMarker.getClass();
        iterable.getClass();
        List<C15221a> listM89925L = m89925L(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends KotlinTypeMarker> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m89925L(it.next()));
        }
        if (m89943z()) {
            size = 1;
        } else {
            if (mo89920G() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!mo89921H(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listM89925L.size();
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i = 0;
        while (i < size) {
            JavaTypeQualifiers javaTypeQualifiersM89929k = m89929k(listM89925L.get(i));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C15221a c15221a = (C15221a) CollectionsKt.getOrNull((List) it3.next(), i);
                JavaTypeQualifiers javaTypeQualifiersM89928j = (c15221a == null || (kotlinTypeMarkerM89945b = c15221a.m89945b()) == null) ? null : m89928j(kotlinTypeMarkerM89945b);
                if (javaTypeQualifiersM89928j != null) {
                    arrayList2.add(javaTypeQualifiersM89928j);
                }
            }
            javaTypeQualifiersArr[i] = TypeEnhancementUtilsKt.m90114a(javaTypeQualifiersM89929k, arrayList2, i == 0 && mo89920G(), i == 0 && mo89939v(), z);
            i++;
        }
        return new C17022g8(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    /* JADX INFO: renamed from: i */
    public final JavaTypeQualifiersByElementType m89927i(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return mo89933p().m89318d(javaTypeQualifiersByElementType, mo89934q(kotlinTypeMarker));
    }

    /* JADX INFO: renamed from: j */
    public final JavaTypeQualifiers m89928j(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifierM89915B;
        NullabilityQualifier nullabilityQualifierM89915B2 = m89915B(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierM89915B2 == null) {
            KotlinTypeMarker kotlinTypeMarkerMo89942y = mo89942y(kotlinTypeMarker);
            nullabilityQualifierM89915B = kotlinTypeMarkerMo89942y != null ? m89915B(kotlinTypeMarkerMo89942y) : null;
        } else {
            nullabilityQualifierM89915B = nullabilityQualifierM89915B2;
        }
        TypeSystemContext typeSystemContextMo89918E = mo89918E();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.m88354l(mo89914A(typeSystemContextMo89918E.mo90244a0(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.m88353k(mo89914A(typeSystemContextMo89918E.mo90283u(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new JavaTypeQualifiers(nullabilityQualifierM89915B, mutabilityQualifier, mo89918E().mo90231R(kotlinTypeMarker) || mo89923J(kotlinTypeMarker), nullabilityQualifierM89915B != nullabilityQualifierM89915B2);
    }

    /* JADX INFO: renamed from: k */
    public final JavaTypeQualifiers m89929k(C15221a c15221a) {
        List listEmptyList;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89935r;
        KotlinTypeMarker kotlinTypeMarkerM89945b;
        TypeConstructorMarker typeConstructorMarkerMo90225O;
        if (c15221a.m89945b() == null) {
            TypeSystemContext typeSystemContextMo89918E = mo89918E();
            TypeParameterMarker typeParameterMarkerM89946c = c15221a.m89946c();
            if ((typeParameterMarkerM89946c != null ? typeSystemContextMo89918E.mo90274p0(typeParameterMarkerM89946c) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.m89964a();
            }
        }
        boolean z = false;
        boolean z2 = c15221a.m89946c() == null;
        KotlinTypeMarker kotlinTypeMarkerM89945b2 = c15221a.m89945b();
        if (kotlinTypeMarkerM89945b2 == null || (listEmptyList = mo89934q(kotlinTypeMarkerM89945b2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystemContextMo89918E2 = mo89918E();
        KotlinTypeMarker kotlinTypeMarkerM89945b3 = c15221a.m89945b();
        TypeParameterMarker typeParameterMarkerMo90270n0 = (kotlinTypeMarkerM89945b3 == null || (typeConstructorMarkerMo90225O = typeSystemContextMo89918E2.mo90225O(kotlinTypeMarkerM89945b3)) == null) ? null : typeSystemContextMo89918E2.mo90270n0(typeConstructorMarkerMo90225O);
        boolean z3 = mo89937t() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z2) {
            if (z3 || !mo89941x() || (kotlinTypeMarkerM89945b = c15221a.m89945b()) == null || !mo89919F(kotlinTypeMarkerM89945b)) {
                listEmptyList = CollectionsKt.plus((Iterable) mo89936s(), (Iterable) listEmptyList);
            } else {
                Iterable<TAnnotation> iterableMo89936s = mo89936s();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableMo89936s) {
                    if (!mo89933p().m89329p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listEmptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList);
            }
        }
        MutabilityQualifier mutabilityQualifierM89320g = mo89933p().m89320g(listEmptyList);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89321h = mo89933p().m89321h(listEmptyList, new C16560e8(this, c15221a));
        if (nullabilityQualifierWithMigrationStatusM89321h != null) {
            NullabilityQualifier nullabilityQualifierM89977c = nullabilityQualifierWithMigrationStatusM89321h.m89977c();
            if (nullabilityQualifierWithMigrationStatusM89321h.m89977c() == NullabilityQualifier.NOT_NULL && typeParameterMarkerMo90270n0 != null) {
                z = true;
            }
            return new JavaTypeQualifiers(nullabilityQualifierM89977c, mutabilityQualifierM89320g, z, nullabilityQualifierWithMigrationStatusM89321h.m89978d());
        }
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeMo89937t = (z2 || z3) ? mo89937t() : AnnotationQualifierApplicabilityType.TYPE_USE;
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementTypeM89944a = c15221a.m89944a();
        JavaDefaultQualifiers javaDefaultQualifiersM89423a = javaTypeQualifiersByElementTypeM89944a != null ? javaTypeQualifiersByElementTypeM89944a.m89423a(annotationQualifierApplicabilityTypeMo89937t) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89935r2 = typeParameterMarkerMo90270n0 != null ? m89935r(typeParameterMarkerMo90270n0) : null;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusMo89940w = mo89940w(nullabilityQualifierWithMigrationStatusM89935r2, javaDefaultQualifiersM89423a);
        boolean z4 = (nullabilityQualifierWithMigrationStatusM89935r2 != null ? nullabilityQualifierWithMigrationStatusM89935r2.m89977c() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterMarkerMo90270n0 == null || javaDefaultQualifiersM89423a == null || !javaDefaultQualifiersM89423a.m89386c());
        TypeParameterMarker typeParameterMarkerM89946c2 = c15221a.m89946c();
        if (typeParameterMarkerM89946c2 == null || (nullabilityQualifierWithMigrationStatusM89935r = m89935r(typeParameterMarkerM89946c2)) == null) {
            nullabilityQualifierWithMigrationStatusM89935r = null;
        } else if (nullabilityQualifierWithMigrationStatusM89935r.m89977c() == NullabilityQualifier.NULLABLE) {
            nullabilityQualifierWithMigrationStatusM89935r = NullabilityQualifierWithMigrationStatus.m89975b(nullabilityQualifierWithMigrationStatusM89935r, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89924K = m89924K(nullabilityQualifierWithMigrationStatusM89935r, nullabilityQualifierWithMigrationStatusMo89940w);
        NullabilityQualifier nullabilityQualifierM89977c2 = nullabilityQualifierWithMigrationStatusM89924K != null ? nullabilityQualifierWithMigrationStatusM89924K.m89977c() : null;
        if (nullabilityQualifierWithMigrationStatusM89924K != null && nullabilityQualifierWithMigrationStatusM89924K.m89978d()) {
            z = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifierM89977c2, mutabilityQualifierM89320g, z4, z);
    }

    /* JADX INFO: renamed from: m */
    public final <T> List<T> m89930m(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m89931n(t, arrayList, function1);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final <T> void m89931n(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = function1.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                m89931n(it.next(), list, function1);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo89932o(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> mo89933p();

    @NotNull
    /* JADX INFO: renamed from: q */
    public abstract Iterable<TAnnotation> mo89934q(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: r */
    public final NullabilityQualifierWithMigrationStatus m89935r(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> listM89907b;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystemContextMo89918E = mo89918E();
        if (!mo89922I(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> listMo90203D = typeSystemContextMo89918E.mo90203D(typeParameterMarker);
        List<KotlinTypeMarker> list = listMo90203D;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!typeSystemContextMo89918E.mo90285v((KotlinTypeMarker) it.next())) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (m89915B((KotlinTypeMarker) obj) != null) {
                            arrayList.add(obj);
                        }
                    }
                    Lazy lazyM87228a = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new C16772f8(listMo90203D, this));
                    if (!arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            do {
                                if (it2.hasNext()) {
                                }
                            } while (!m89916C((KotlinTypeMarker) it2.next()));
                            listM89907b = listMo90203D;
                        }
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                    }
                    if (m89907b(lazyM87228a).isEmpty()) {
                        break;
                    }
                    List<KotlinTypeMarker> listM89907b2 = m89907b(lazyM87228a);
                    if (!(listM89907b2 instanceof Collection) || !listM89907b2.isEmpty()) {
                        Iterator<T> it3 = listM89907b2.iterator();
                        do {
                            if (it3.hasNext()) {
                            }
                        } while (!m89916C((KotlinTypeMarker) it3.next()));
                        listM89907b = m89907b(lazyM87228a);
                    }
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                    List<KotlinTypeMarker> list2 = listM89907b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            if (!typeSystemContextMo89918E.mo90292y0((KotlinTypeMarker) it4.next())) {
                                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                break;
                            }
                        }
                    } else {
                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                        break;
                    }
                    return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, listM89907b != listMo90203D);
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public abstract Iterable<TAnnotation> mo89936s();

    @NotNull
    /* JADX INFO: renamed from: t */
    public abstract AnnotationQualifierApplicabilityType mo89937t();

    @Nullable
    /* JADX INFO: renamed from: u */
    public abstract JavaTypeQualifiersByElementType mo89938u();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo89939v();

    @Nullable
    /* JADX INFO: renamed from: w */
    public abstract NullabilityQualifierWithMigrationStatus mo89940w(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers);

    /* JADX INFO: renamed from: x */
    public abstract boolean mo89941x();

    @Nullable
    /* JADX INFO: renamed from: y */
    public abstract KotlinTypeMarker mo89942y(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: z */
    public boolean m89943z() {
        return false;
    }
}
