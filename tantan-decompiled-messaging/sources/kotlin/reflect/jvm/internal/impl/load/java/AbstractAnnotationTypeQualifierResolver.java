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
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C20584v6;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    @NotNull
    private static final C15210a Companion = new C15210a(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, AnnotationQualifierApplicabilityType> f64640c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaTypeEnhancementState f64641a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ConcurrentHashMap<Object, TAnnotation> f64642b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$a */
    public static final class C15210a {
        public /* synthetic */ C15210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15210a() {
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
        f64640c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        javaTypeEnhancementState.getClass();
        this.f64641a = javaTypeEnhancementState;
        this.f64642b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m89315f(Object obj) {
        obj.getClass();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Set<AnnotationQualifierApplicabilityType> m89316b(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.TYPE_USE) ? SetsKt.plus(SetsKt.minus((Set<? extends AnnotationQualifierApplicabilityType>) ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) set) : set;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract Iterable<String> mo89317c(@NotNull TAnnotation tannotation, boolean z);

    @Nullable
    /* JADX INFO: renamed from: d */
    public final JavaTypeQualifiersByElementType m89318d(@Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @NotNull Iterable<? extends TAnnotation> iterable) {
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMapM89424b;
        iterable.getClass();
        if (!this.f64641a.m89417a()) {
            ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                JavaDefaultQualifiers javaDefaultQualifiersM89319e = m89319e(it.next());
                if (javaDefaultQualifiersM89319e != null) {
                    arrayList.add(javaDefaultQualifiersM89319e);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (JavaDefaultQualifiers javaDefaultQualifiers : arrayList) {
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : javaDefaultQualifiers.m89388e()) {
                        if (enumMap.containsKey(annotationQualifierApplicabilityType) && mo89328o()) {
                            JavaDefaultQualifiers javaDefaultQualifiers2 = (JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType);
                            if (javaDefaultQualifiers2 != null) {
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89387d = javaDefaultQualifiers2.m89387d();
                                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89387d2 = javaDefaultQualifiers.m89387d();
                                if (!Intrinsics.m87488d(nullabilityQualifierWithMigrationStatusM89387d2, nullabilityQualifierWithMigrationStatusM89387d) && (!nullabilityQualifierWithMigrationStatusM89387d2.m89978d() || nullabilityQualifierWithMigrationStatusM89387d.m89978d())) {
                                    javaDefaultQualifiers2 = (nullabilityQualifierWithMigrationStatusM89387d2.m89978d() || !nullabilityQualifierWithMigrationStatusM89387d.m89978d()) ? null : javaDefaultQualifiers;
                                }
                                enumMap.put(annotationQualifierApplicabilityType, javaDefaultQualifiers2);
                            }
                        } else {
                            enumMap.put(annotationQualifierApplicabilityType, javaDefaultQualifiers);
                        }
                    }
                }
                EnumMap enumMap2 = (javaTypeQualifiersByElementType == null || (enumMapM89424b = javaTypeQualifiersByElementType.m89424b()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapM89424b);
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
    public final JavaDefaultQualifiers m89319e(TAnnotation tannotation) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89322i;
        JavaDefaultQualifiers javaDefaultQualifiersM89334u = m89334u(tannotation);
        if (javaDefaultQualifiersM89334u != null) {
            return javaDefaultQualifiersM89334u;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> pairM89336w = m89336w(tannotation);
        if (pairM89336w == null) {
            return null;
        }
        TAnnotation tannotationComponent1 = pairM89336w.component1();
        Set<AnnotationQualifierApplicabilityType> setComponent2 = pairM89336w.component2();
        ReportLevel reportLevelM89333t = m89333t(tannotation);
        if (reportLevelM89333t == null) {
            reportLevelM89333t = m89332s(tannotationComponent1);
        }
        if (reportLevelM89333t.isIgnore() || (nullabilityQualifierWithMigrationStatusM89322i = m89322i(tannotationComponent1, C20584v6.INSTANCE)) == null) {
            return null;
        }
        return new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.m89975b(nullabilityQualifierWithMigrationStatusM89322i, null, reportLevelM89333t.isWarning(), 1, null), setComponent2, false, false, 12, null);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final MutabilityQualifier m89320g(@NotNull Iterable<? extends TAnnotation> iterable) {
        MutabilityQualifier mutabilityQualifier;
        iterable.getClass();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            FqName fqNameMo89324k = mo89324k(it.next());
            if (CollectionsKt.contains(JvmAnnotationNamesKt.m89451o(), fqNameMo89324k)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (CollectionsKt.contains(JvmAnnotationNamesKt.m89448l(), fqNameMo89324k)) {
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
    public final NullabilityQualifierWithMigrationStatus m89321h(@NotNull Iterable<? extends TAnnotation> iterable, @NotNull Function1<? super TAnnotation, Boolean> function1) {
        iterable.getClass();
        function1.getClass();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        while (it.hasNext()) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89322i = m89322i(it.next(), function1);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (nullabilityQualifierWithMigrationStatusM89322i != null && !Intrinsics.m87488d(nullabilityQualifierWithMigrationStatusM89322i, nullabilityQualifierWithMigrationStatus) && (!nullabilityQualifierWithMigrationStatusM89322i.m89978d() || nullabilityQualifierWithMigrationStatus.m89978d())) {
                    if (nullabilityQualifierWithMigrationStatusM89322i.m89978d() || !nullabilityQualifierWithMigrationStatus.m89978d()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusM89322i;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: renamed from: i */
    public final NullabilityQualifierWithMigrationStatus m89322i(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89330q;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusM89330q2 = m89330q(tannotation, function1.invoke(tannotation).booleanValue());
        if (nullabilityQualifierWithMigrationStatusM89330q2 != null) {
            return nullabilityQualifierWithMigrationStatusM89330q2;
        }
        TAnnotation tannotationM89335v = m89335v(tannotation);
        if (tannotationM89335v == null) {
            return null;
        }
        ReportLevel reportLevelM89332s = m89332s(tannotation);
        if (reportLevelM89332s.isIgnore() || (nullabilityQualifierWithMigrationStatusM89330q = m89330q(tannotationM89335v, function1.invoke(tannotationM89335v).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.m89975b(nullabilityQualifierWithMigrationStatusM89330q, null, reportLevelM89332s.isWarning(), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final TAnnotation m89323j(TAnnotation tannotation, FqName fqName) {
        for (TAnnotation tannotation2 : mo89326m(tannotation)) {
            if (Intrinsics.m87488d(mo89324k(tannotation2), fqName)) {
                return tannotation2;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract FqName mo89324k(@NotNull TAnnotation tannotation);

    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract Object mo89325l(@NotNull TAnnotation tannotation);

    @NotNull
    /* JADX INFO: renamed from: m */
    public abstract Iterable<TAnnotation> mo89326m(@NotNull TAnnotation tannotation);

    /* JADX INFO: renamed from: n */
    public final boolean m89327n(TAnnotation tannotation, FqName fqName) {
        Iterable<TAnnotation> iterableMo89326m = mo89326m(tannotation);
        if ((iterableMo89326m instanceof Collection) && ((Collection) iterableMo89326m).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableMo89326m.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m87488d(mo89324k(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo89328o();

    /* JADX INFO: renamed from: p */
    public final boolean m89329p(@NotNull TAnnotation tannotation) {
        tannotation.getClass();
        TAnnotation tannotationM89323j = m89323j(tannotation, StandardNames.FqNames.f63847G);
        if (tannotationM89323j == null) {
            return false;
        }
        Iterable<String> iterableMo89317c = mo89317c(tannotationM89323j, false);
        if ((iterableMo89317c instanceof Collection) && ((Collection) iterableMo89317c).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableMo89317c.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m87488d(it.next(), "TYPE")) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus m89330q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r5.mo89324k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r2 = r5.f64641a
            kotlin.jvm.functions.Function1 r2 = r2.m89418b()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m89449m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m89450n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m89438b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L43:
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.m89439c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.m87488d(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r5 = r5.mo89317c(r6, r4)
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L8b
            int r6 = r5.hashCode()
            switch(r6) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r6 = "ALWAYS"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r6 = "UNKNOWN"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L73
            goto L87
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r6 = "NEVER"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r6 = "MAYBE"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L88
        L87:
            return r1
        L88:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L8b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
        L8d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            boolean r0 = r2.isWarning()
            if (r0 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r6.<init>(r5, r4)
            return r6
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.m89330q(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    /* JADX INFO: renamed from: r */
    public final ReportLevel m89331r(TAnnotation tannotation) {
        FqName fqNameMo89324k = mo89324k(tannotation);
        return (fqNameMo89324k == null || !JavaDefaultQualifiersKt.m89390b().containsKey(fqNameMo89324k)) ? m89332s(tannotation) : this.f64641a.m89418b().invoke(fqNameMo89324k);
    }

    /* JADX INFO: renamed from: s */
    public final ReportLevel m89332s(TAnnotation tannotation) {
        ReportLevel reportLevelM89333t = m89333t(tannotation);
        return reportLevelM89333t != null ? reportLevelM89333t : this.f64641a.m89419c().m89427c();
    }

    /* JADX INFO: renamed from: t */
    public final ReportLevel m89333t(TAnnotation tannotation) {
        Iterable<String> iterableMo89317c;
        String str;
        ReportLevel reportLevel = this.f64641a.m89419c().m89429e().get(mo89324k(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationM89323j = m89323j(tannotation, JvmAnnotationNamesKt.m89452p());
        if (tannotationM89323j == null || (iterableMo89317c = mo89317c(tannotationM89323j, false)) == null || (str = (String) CollectionsKt.firstOrNull(iterableMo89317c)) == null) {
            return null;
        }
        ReportLevel reportLevelM89428d = this.f64641a.m89419c().m89428d();
        if (reportLevelM89428d != null) {
            return reportLevelM89428d;
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
    public final JavaDefaultQualifiers m89334u(TAnnotation tannotation) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        if (this.f64641a.m89417a() || (javaDefaultQualifiers = JavaDefaultQualifiersKt.m89389a().get(mo89324k(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelM89331r = m89331r(tannotation);
        if (reportLevelM89331r == ReportLevel.IGNORE) {
            reportLevelM89331r = null;
        }
        if (reportLevelM89331r == null) {
            return null;
        }
        return JavaDefaultQualifiers.m89384b(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.m89975b(javaDefaultQualifiers.m89387d(), null, reportLevelM89331r.isWarning(), 1, null), null, false, false, 14, null);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final TAnnotation m89335v(@NotNull TAnnotation tannotation) {
        TAnnotation tannotationM89335v;
        tannotation.getClass();
        if (this.f64641a.m89419c().m89430f()) {
            return null;
        }
        if (CollectionsKt.contains(JvmAnnotationNamesKt.m89437a(), mo89324k(tannotation)) || m89327n(tannotation, JvmAnnotationNamesKt.m89442f())) {
            return tannotation;
        }
        if (!m89327n(tannotation, JvmAnnotationNamesKt.m89444h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f64642b;
        Object objMo89325l = mo89325l(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(objMo89325l);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = mo89326m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                tannotationM89335v = null;
                break;
            }
            tannotationM89335v = m89335v(it.next());
        } while (tannotationM89335v == null);
        if (tannotationM89335v == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objMo89325l, tannotationM89335v);
        return tannotationPutIfAbsent == null ? tannotationM89335v : tannotationPutIfAbsent;
    }

    /* JADX INFO: renamed from: w */
    public final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> m89336w(TAnnotation tannotation) {
        TAnnotation tannotationM89323j;
        TAnnotation next;
        if (this.f64641a.m89419c().m89430f() || (tannotationM89323j = m89323j(tannotation, JvmAnnotationNamesKt.m89443g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo89326m(tannotation).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (m89335v(next) == null);
        if (next == null) {
            return null;
        }
        Iterable<String> iterableMo89317c = mo89317c(tannotationM89323j, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableMo89317c.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f64640c.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(next, m89316b(linkedHashSet));
    }
}
