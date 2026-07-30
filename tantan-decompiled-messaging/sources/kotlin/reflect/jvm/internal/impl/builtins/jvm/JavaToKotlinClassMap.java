package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaToKotlinClassMap {

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f63967a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f63968b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f63969c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f63970d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ClassId f63971e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName f63972f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final ClassId f63973g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final ClassId f63974h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final ClassId f63975i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f63976j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f63977k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f63978l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f63979m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final HashMap<ClassId, ClassId> f63980n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final HashMap<ClassId, ClassId> f63981o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final List<PlatformMutabilityMapping> f63982p;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f63983a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ClassId f63984b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final ClassId f63985c;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            classId.getClass();
            classId2.getClass();
            classId3.getClass();
            this.f63983a = classId;
            this.f63984b = classId2;
            this.f63985c = classId3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m88359a() {
            return this.f63983a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ClassId m88360b() {
            return this.f63984b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final ClassId m88361c() {
            return this.f63985c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final ClassId m88362d() {
            return this.f63983a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.m87488d(this.f63983a, platformMutabilityMapping.f63983a) && Intrinsics.m87488d(this.f63984b, platformMutabilityMapping.f63984b) && Intrinsics.m87488d(this.f63985c, platformMutabilityMapping.f63985c);
        }

        public int hashCode() {
            return (((this.f63983a.hashCode() * 31) + this.f63984b.hashCode()) * 31) + this.f63985c.hashCode();
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f63983a + ", kotlinReadOnly=" + this.f63984b + ", kotlinMutable=" + this.f63985c + ')';
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb.append(function.m88328b());
        sb.append('.');
        sb.append(function.m88327a());
        f63967a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb2.append(kFunction.m88328b());
        sb2.append('.');
        sb2.append(kFunction.m88327a());
        f63968b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb3.append(suspendFunction.m88328b());
        sb3.append('.');
        sb3.append(suspendFunction.m88327a());
        f63969c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb4.append(kSuspendFunction.m88328b());
        sb4.append('.');
        sb4.append(kSuspendFunction.m88327a());
        f63970d = sb4.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classIdM91045c = companion.m91045c(new FqName("kotlin.jvm.functions.FunctionN"));
        f63971e = classIdM91045c;
        f63972f = classIdM91045c.m91034a();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f63973g = standardClassIds.m91101l();
        f63974h = standardClassIds.m91100k();
        f63975i = javaToKotlinClassMap.m88349g(Class.class);
        f63976j = new HashMap<>();
        f63977k = new HashMap<>();
        f63978l = new HashMap<>();
        f63979m = new HashMap<>();
        f63980n = new HashMap<>();
        f63981o = new HashMap<>();
        ClassId classIdM91045c2 = companion.m91045c(StandardNames.FqNames.f63877V);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Iterable.class), classIdM91045c2, new ClassId(classIdM91045c2.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63889d0, classIdM91045c2.m91038f()), false));
        ClassId classIdM91045c3 = companion.m91045c(StandardNames.FqNames.f63875U);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Iterator.class), classIdM91045c3, new ClassId(classIdM91045c3.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63887c0, classIdM91045c3.m91038f()), false));
        ClassId classIdM91045c4 = companion.m91045c(StandardNames.FqNames.f63878W);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Collection.class), classIdM91045c4, new ClassId(classIdM91045c4.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63891e0, classIdM91045c4.m91038f()), false));
        ClassId classIdM91045c5 = companion.m91045c(StandardNames.FqNames.f63879X);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(List.class), classIdM91045c5, new ClassId(classIdM91045c5.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63893f0, classIdM91045c5.m91038f()), false));
        ClassId classIdM91045c6 = companion.m91045c(StandardNames.FqNames.f63881Z);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Set.class), classIdM91045c6, new ClassId(classIdM91045c6.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63897h0, classIdM91045c6.m91038f()), false));
        ClassId classIdM91045c7 = companion.m91045c(StandardNames.FqNames.f63880Y);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(ListIterator.class), classIdM91045c7, new ClassId(classIdM91045c7.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63895g0, classIdM91045c7.m91038f()), false));
        FqName fqName = StandardNames.FqNames.f63883a0;
        ClassId classIdM91045c8 = companion.m91045c(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Map.class), classIdM91045c8, new ClassId(classIdM91045c8.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63899i0, classIdM91045c8.m91038f()), false));
        ClassId classIdM91036d = companion.m91045c(fqName).m91036d(StandardNames.FqNames.f63885b0.m91051f());
        List<PlatformMutabilityMapping> listListOf = CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.m88349g(Map.Entry.class), classIdM91036d, new ClassId(classIdM91036d.m91038f(), FqNamesUtilKt.m91076g(StandardNames.FqNames.f63901j0, classIdM91036d.m91038f()), false))});
        f63982p = listListOf;
        javaToKotlinClassMap.m88348f(Object.class, StandardNames.FqNames.f63882a);
        javaToKotlinClassMap.m88348f(String.class, StandardNames.FqNames.f63894g);
        javaToKotlinClassMap.m88348f(CharSequence.class, StandardNames.FqNames.f63892f);
        javaToKotlinClassMap.m88347e(Throwable.class, StandardNames.FqNames.f63920t);
        javaToKotlinClassMap.m88348f(Cloneable.class, StandardNames.FqNames.f63886c);
        javaToKotlinClassMap.m88348f(Number.class, StandardNames.FqNames.f63914q);
        javaToKotlinClassMap.m88347e(Comparable.class, StandardNames.FqNames.f63922u);
        javaToKotlinClassMap.m88348f(Enum.class, StandardNames.FqNames.f63916r);
        javaToKotlinClassMap.m88347e(Annotation.class, StandardNames.FqNames.f63845F);
        Iterator<PlatformMutabilityMapping> it = listListOf.iterator();
        while (it.hasNext()) {
            INSTANCE.m88346d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            ClassId classIdM91045c9 = companion2.m91045c(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            javaToKotlinClassMap2.m88343a(classIdM91045c9, companion2.m91045c(StandardNames.m88265c(primitiveType)));
        }
        for (ClassId classId : CompanionObjectMapping.INSTANCE.m88137a()) {
            INSTANCE.m88343a(ClassId.Companion.m91045c(new FqName("kotlin.jvm.internal." + classId.m91040h().m91082b() + "CompanionObject")), classId.m91036d(SpecialNames.f65488c));
        }
        for (int i = 0; i < 23; i++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            javaToKotlinClassMap3.m88343a(ClassId.Companion.m91045c(new FqName("kotlin.jvm.functions.Function" + i)), StandardNames.m88263a(i));
            javaToKotlinClassMap3.m88345c(new FqName(f63968b + i), f63973g);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            INSTANCE.m88345c(new FqName((kSuspendFunction2.m88328b() + '.' + kSuspendFunction2.m88327a()) + i2), f63973g);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicInt"), javaToKotlinClassMap4.m88349g(AtomicInteger.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicLong"), javaToKotlinClassMap4.m88349g(AtomicLong.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), javaToKotlinClassMap4.m88349g(AtomicBoolean.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicReference"), javaToKotlinClassMap4.m88349g(AtomicReference.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), javaToKotlinClassMap4.m88349g(AtomicIntegerArray.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), javaToKotlinClassMap4.m88349g(AtomicLongArray.class));
        javaToKotlinClassMap4.m88345c(new FqName("kotlin.concurrent.atomics.AtomicArray"), javaToKotlinClassMap4.m88349g(AtomicReferenceArray.class));
        javaToKotlinClassMap4.m88345c(StandardNames.FqNames.f63884b.m91068m(), javaToKotlinClassMap4.m88349g(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    /* JADX INFO: renamed from: a */
    public final void m88343a(ClassId classId, ClassId classId2) {
        m88344b(classId, classId2);
        m88345c(classId2.m91034a(), classId);
    }

    /* JADX INFO: renamed from: b */
    public final void m88344b(ClassId classId, ClassId classId2) {
        f63976j.put(classId.m91034a().m91054i(), classId2);
    }

    /* JADX INFO: renamed from: c */
    public final void m88345c(FqName fqName, ClassId classId) {
        f63977k.put(fqName.m91054i(), classId);
    }

    /* JADX INFO: renamed from: d */
    public final void m88346d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdM88359a = platformMutabilityMapping.m88359a();
        ClassId classIdM88360b = platformMutabilityMapping.m88360b();
        ClassId classIdM88361c = platformMutabilityMapping.m88361c();
        m88343a(classIdM88359a, classIdM88360b);
        m88345c(classIdM88361c.m91034a(), classIdM88359a);
        f63980n.put(classIdM88361c, classIdM88360b);
        f63981o.put(classIdM88360b, classIdM88361c);
        FqName fqNameM91034a = classIdM88360b.m91034a();
        FqName fqNameM91034a2 = classIdM88361c.m91034a();
        f63978l.put(classIdM88361c.m91034a().m91054i(), fqNameM91034a);
        f63979m.put(fqNameM91034a.m91054i(), fqNameM91034a2);
    }

    /* JADX INFO: renamed from: e */
    public final void m88347e(Class<?> cls, FqName fqName) {
        m88343a(m88349g(cls), ClassId.Companion.m91045c(fqName));
    }

    /* JADX INFO: renamed from: f */
    public final void m88348f(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        m88347e(cls, fqNameUnsafe.m91068m());
    }

    /* JADX INFO: renamed from: g */
    public final ClassId m88349g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            return companion.m91045c(new FqName(canonicalName));
        }
        ClassId classIdM88349g = m88349g(declaringClass);
        Name nameM91079i = Name.m91079i(cls.getSimpleName());
        nameM91079i.getClass();
        return classIdM88349g.m91036d(nameM91079i);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final FqName m88350h() {
        return f63972f;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<PlatformMutabilityMapping> m88351i() {
        return f63982p;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m88352j(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strM91057a = fqNameUnsafe.m91057a();
        if (!C15386d.m93483J(strM91057a, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strM91057a.substring(str.length());
        return (StringsKt.m93399H0(strSubstring, '0', false, 2, null) || (intOrNull = StringsKt.toIntOrNull(strSubstring)) == null || intOrNull.intValue() < 23) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m88353k(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f63978l.containsKey(fqNameUnsafe);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m88354l(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f63979m.containsKey(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final ClassId m88355m(@NotNull FqName fqName) {
        fqName.getClass();
        return f63976j.get(fqName.m91054i());
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ClassId m88356n(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        if (m88352j(fqNameUnsafe, f63967a)) {
            return f63971e;
        }
        if (m88352j(fqNameUnsafe, f63969c)) {
            return f63971e;
        }
        if (m88352j(fqNameUnsafe, f63968b)) {
            return f63973g;
        }
        return m88352j(fqNameUnsafe, f63970d) ? f63973g : f63977k.get(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final FqName m88357o(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f63978l.get(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final FqName m88358p(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f63979m.get(fqNameUnsafe);
    }
}
