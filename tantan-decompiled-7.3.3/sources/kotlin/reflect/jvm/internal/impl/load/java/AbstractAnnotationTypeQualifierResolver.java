package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C19995s6;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    @NotNull
    private static final C15317a Companion = new C15317a(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, AnnotationQualifierApplicabilityType> f65314c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaTypeEnhancementState f65315a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ConcurrentHashMap<Object, TAnnotation> f65316b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$a */
    public static final class C15317a {
        public /* synthetic */ C15317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15317a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f65314c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        javaTypeEnhancementState.getClass();
        this.f65315a = javaTypeEnhancementState;
        this.f65316b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m90206f(Object obj) {
        obj.getClass();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Set<AnnotationQualifierApplicabilityType> m90207b(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.TYPE_USE) ? SetsKt.plus(SetsKt.minus((Set<? extends AnnotationQualifierApplicabilityType>) ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) set) : set;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract Iterable<String> mo90208c(@NotNull TAnnotation tannotation, boolean z);

    @Nullable
    /* JADX INFO: renamed from: d */
    public final JavaTypeQualifiersByElementType m90209d(@Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @NotNull Iterable<? extends TAnnotation> iterable) {
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMapM90315b;
        iterable.getClass();
        if (!this.f65315a.m90308a()) {
            ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                JavaDefaultQualifiers javaDefaultQualifiersM90210e = m90210e(it.next());
                if (javaDefaultQualifiersM90210e != null) {
                    arrayList.add(javaDefaultQualifiersM90210e);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (JavaDefaultQualifiers javaDefaultQualifiers : arrayList) {
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : javaDefaultQualifiers.m90279e()) {
                        if (enumMap.containsKey(annotationQualifierApplicabilityType) && mo90219o()) {
                            JavaDefaultQualifiers javaDefaultQualifiers2 = (JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType);
                            if (javaDefaultQualifiers2 != null) {
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90278d = javaDefaultQualifiers2.m90278d();
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90278d2 = javaDefaultQualifiers.m90278d();
                                if (!Intrinsics.m88377d(nullabilityQualifierWithMigrationStatusM90278d2, nullabilityQualifierWithMigrationStatusM90278d) && (!nullabilityQualifierWithMigrationStatusM90278d2.m90869d() || nullabilityQualifierWithMigrationStatusM90278d.m90869d())) {
                                    javaDefaultQualifiers2 = (nullabilityQualifierWithMigrationStatusM90278d2.m90869d() || !nullabilityQualifierWithMigrationStatusM90278d.m90869d()) ? null : javaDefaultQualifiers;
                                }
                                enumMap.put(annotationQualifierApplicabilityType, javaDefaultQualifiers2);
                            }
                        } else {
                            enumMap.put(annotationQualifierApplicabilityType, javaDefaultQualifiers);
                        }
                    }
                }
                EnumMap enumMap2 = (javaTypeQualifiersByElementType == null || (enumMapM90315b = javaTypeQualifiersByElementType.m90315b()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapM90315b);
                boolean z = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = (AnnotationQualifierApplicabilityType) entry.getKey();
                    JavaDefaultQualifiers javaDefaultQualifiers3 = (JavaDefaultQualifiers) entry.getValue();
                    if (javaDefaultQualifiers3 != null) {
                        enumMap2.put(annotationQualifierApplicabilityType2, javaDefaultQualifiers3);
                        z = true;
                    }
                }
                if (z) {
                    return new JavaTypeQualifiersByElementType(enumMap2);
                }
            }
        }
        return javaTypeQualifiersByElementType;
    }

    /* JADX INFO: renamed from: e */
    public final JavaDefaultQualifiers m90210e(TAnnotation tannotation) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90213i;
        JavaDefaultQualifiers javaDefaultQualifiersM90225u = m90225u(tannotation);
        if (javaDefaultQualifiersM90225u != null) {
            return javaDefaultQualifiersM90225u;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> pairM90227w = m90227w(tannotation);
        if (pairM90227w == null) {
            return null;
        }
        TAnnotation tannotationComponent1 = pairM90227w.component1();
        Set<AnnotationQualifierApplicabilityType> setComponent2 = pairM90227w.component2();
        ReportLevel reportLevelM90224t = m90224t(tannotation);
        if (reportLevelM90224t == null) {
            reportLevelM90224t = m90223s(tannotationComponent1);
        }
        if (reportLevelM90224t.isIgnore() || (nullabilityQualifierWithMigrationStatusM90213i = m90213i(tannotationComponent1, C19995s6.INSTANCE)) == null) {
            return null;
        }
        return new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.m90866b(nullabilityQualifierWithMigrationStatusM90213i, null, reportLevelM90224t.isWarning(), 1, null), setComponent2, false, false, 12, null);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final MutabilityQualifier m90211g(@NotNull Iterable<? extends TAnnotation> iterable) {
        MutabilityQualifier mutabilityQualifier;
        iterable.getClass();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqNameMo90215k = mo90215k(it.next());
            if (CollectionsKt.contains(JvmAnnotationNamesKt.m90342o(), fqNameMo90215k)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (CollectionsKt.contains(JvmAnnotationNamesKt.m90339l(), fqNameMo90215k)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final NullabilityQualifierWithMigrationStatus m90212h(@NotNull Iterable<? extends TAnnotation> iterable, @NotNull Function1<? super TAnnotation, Boolean> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (it.hasNext()) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90213i = m90213i(it.next(), function1);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (nullabilityQualifierWithMigrationStatusM90213i != null && !Intrinsics.m88377d(nullabilityQualifierWithMigrationStatusM90213i, nullabilityQualifierWithMigrationStatus) && (!nullabilityQualifierWithMigrationStatusM90213i.m90869d() || nullabilityQualifierWithMigrationStatus.m90869d())) {
                    if (nullabilityQualifierWithMigrationStatusM90213i.m90869d() || !nullabilityQualifierWithMigrationStatus.m90869d()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusM90213i;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: renamed from: i */
    public final NullabilityQualifierWithMigrationStatus m90213i(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90221q;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM90221q2 = m90221q(tannotation, function1.invoke(tannotation).booleanValue());
        if (nullabilityQualifierWithMigrationStatusM90221q2 != null) {
            return nullabilityQualifierWithMigrationStatusM90221q2;
        }
        TAnnotation tannotationM90226v = m90226v(tannotation);
        if (tannotationM90226v == null) {
            return null;
        }
        ReportLevel reportLevelM90223s = m90223s(tannotation);
        if (reportLevelM90223s.isIgnore() || (nullabilityQualifierWithMigrationStatusM90221q = m90221q(tannotationM90226v, function1.invoke(tannotationM90226v).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.m90866b(nullabilityQualifierWithMigrationStatusM90221q, null, reportLevelM90223s.isWarning(), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final TAnnotation m90214j(TAnnotation tannotation, FqName fqName) {
        for (TAnnotation tannotation2 : mo90217m(tannotation)) {
            if (Intrinsics.m88377d(mo90215k(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract FqName mo90215k(@NotNull TAnnotation tannotation);

    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract Object mo90216l(@NotNull TAnnotation tannotation);

    @NotNull
    /* JADX INFO: renamed from: m */
    public abstract Iterable<TAnnotation> mo90217m(@NotNull TAnnotation tannotation);

    /* JADX INFO: renamed from: n */
    public final boolean m90218n(TAnnotation tannotation, FqName fqName) {
        Iterable<TAnnotation> iterableMo90217m = mo90217m(tannotation);
        if ((iterableMo90217m instanceof Collection) && ((Collection) iterableMo90217m).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableMo90217m.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m88377d(mo90215k(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo90219o();

    /* JADX INFO: renamed from: p */
    public final boolean m90220p(@NotNull TAnnotation tannotation) {
        tannotation.getClass();
        TAnnotation tannotationM90214j = m90214j(tannotation, StandardNames.FqNames.f64521G);
        if (tannotationM90214j == null) {
            return false;
        }
        Iterable<String> iterableMo90208c = mo90208c(tannotationM90214j, false);
        if ((iterableMo90208c instanceof Collection) && ((Collection) iterableMo90208c).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableMo90208c.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m88377d(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r5.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r5.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r5.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NullabilityQualifierWithMigrationStatus m90221q(TAnnotation tannotation, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        FqName fqNameMo90215k = mo90215k(tannotation);
        if (fqNameMo90215k == null) {
            return null;
        }
        ReportLevel reportLevelInvoke = this.f65315a.m90309b().invoke(fqNameMo90215k);
        if (reportLevelInvoke.isIgnore()) {
            return null;
        }
        if (JvmAnnotationNamesKt.m90340m().contains(fqNameMo90215k)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (JvmAnnotationNamesKt.m90341n().contains(fqNameMo90215k)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (JvmAnnotationNamesKt.m90329b().contains(fqNameMo90215k)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!Intrinsics.m88377d(fqNameMo90215k, JvmAnnotationNamesKt.m90330c())) {
                return null;
            }
            String str = (String) CollectionsKt.firstOrNull(mo90208c(tannotation, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                            break;
                        }
                        return null;
                    case 1933739535:
                        break;
                    default:
                        return null;
                }
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, reportLevelInvoke.isWarning() || z);
    }

    /* JADX INFO: renamed from: r */
    public final ReportLevel m90222r(TAnnotation tannotation) {
        FqName fqNameMo90215k = mo90215k(tannotation);
        return (fqNameMo90215k == null || !JavaDefaultQualifiersKt.m90281b().containsKey(fqNameMo90215k)) ? m90223s(tannotation) : this.f65315a.m90309b().invoke(fqNameMo90215k);
    }

    /* JADX INFO: renamed from: s */
    public final ReportLevel m90223s(TAnnotation tannotation) {
        ReportLevel reportLevelM90224t = m90224t(tannotation);
        return reportLevelM90224t != null ? reportLevelM90224t : this.f65315a.m90310c().m90318c();
    }

    /* JADX INFO: renamed from: t */
    public final ReportLevel m90224t(TAnnotation tannotation) {
        Iterable<String> iterableMo90208c;
        String str;
        ReportLevel reportLevel = this.f65315a.m90310c().m90320e().get(mo90215k(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationM90214j = m90214j(tannotation, JvmAnnotationNamesKt.m90343p());
        if (tannotationM90214j == null || (iterableMo90208c = mo90208c(tannotationM90214j, false)) == null || (str = (String) CollectionsKt.firstOrNull(iterableMo90208c)) == null) {
            return null;
        }
        ReportLevel reportLevelM90319d = this.f65315a.m90310c().m90319d();
        if (reportLevelM90319d != null) {
            return reportLevelM90319d;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
            } else if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.IGNORE;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final JavaDefaultQualifiers m90225u(TAnnotation tannotation) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        if (this.f65315a.m90308a() || (javaDefaultQualifiers = JavaDefaultQualifiersKt.m90280a().get(mo90215k(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelM90222r = m90222r(tannotation);
        if (reportLevelM90222r == ReportLevel.IGNORE) {
            reportLevelM90222r = null;
        }
        if (reportLevelM90222r == null) {
            return null;
        }
        return JavaDefaultQualifiers.m90275b(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.m90866b(javaDefaultQualifiers.m90278d(), null, reportLevelM90222r.isWarning(), 1, null), null, false, false, 14, null);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final TAnnotation m90226v(@NotNull TAnnotation tannotation) {
        TAnnotation tannotationM90226v;
        tannotation.getClass();
        if (this.f65315a.m90310c().m90321f()) {
            return null;
        }
        if (CollectionsKt.contains(JvmAnnotationNamesKt.m90328a(), mo90215k(tannotation)) || m90218n(tannotation, JvmAnnotationNamesKt.m90333f())) {
            return tannotation;
        }
        if (!m90218n(tannotation, JvmAnnotationNamesKt.m90335h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f65316b;
        Object objMo90216l = mo90216l(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(objMo90216l);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = mo90217m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationM90226v = null;
                break;
            }
            tannotationM90226v = m90226v(it.next());
        } while (tannotationM90226v == null);
        if (tannotationM90226v == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objMo90216l, tannotationM90226v);
        return tannotationPutIfAbsent == null ? tannotationM90226v : tannotationPutIfAbsent;
    }

    /* JADX INFO: renamed from: w */
    public final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> m90227w(TAnnotation tannotation) {
        TAnnotation tannotationM90214j;
        TAnnotation next;
        if (this.f65315a.m90310c().m90321f() || (tannotationM90214j = m90214j(tannotation, JvmAnnotationNamesKt.m90334g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo90217m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (m90226v(next) == null);
        if (next == null) {
            return null;
        }
        Iterable<String> iterableMo90208c = mo90208c(tannotationM90214j, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableMo90208c.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f65314c.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(next, m90207b(linkedHashSet));
    }
}
