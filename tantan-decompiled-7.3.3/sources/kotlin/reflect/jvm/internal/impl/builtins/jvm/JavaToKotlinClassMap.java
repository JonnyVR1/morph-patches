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
import kotlin.text.C15493d;
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
    public static final String f64641a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f64642b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f64643c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f64644d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ClassId f64645e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName f64646f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final ClassId f64647g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final ClassId f64648h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final ClassId f64649i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f64650j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f64651k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f64652l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f64653m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final HashMap<ClassId, ClassId> f64654n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final HashMap<ClassId, ClassId> f64655o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final List<PlatformMutabilityMapping> f64656p;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f64657a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ClassId f64658b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final ClassId f64659c;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            classId.getClass();
            classId2.getClass();
            classId3.getClass();
            this.f64657a = classId;
            this.f64658b = classId2;
            this.f64659c = classId3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m89250a() {
            return this.f64657a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final ClassId m89251b() {
            return this.f64658b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final ClassId m89252c() {
            return this.f64659c;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final ClassId m89253d() {
            return this.f64657a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.m88377d(this.f64657a, platformMutabilityMapping.f64657a) && Intrinsics.m88377d(this.f64658b, platformMutabilityMapping.f64658b) && Intrinsics.m88377d(this.f64659c, platformMutabilityMapping.f64659c);
        }

        public int hashCode() {
            return (((this.f64657a.hashCode() * 31) + this.f64658b.hashCode()) * 31) + this.f64659c.hashCode();
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f64657a + ", kotlinReadOnly=" + this.f64658b + ", kotlinMutable=" + this.f64659c + ')';
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb.append(function.m89219b());
        sb.append('.');
        sb.append(function.m89218a());
        f64641a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb2.append(kFunction.m89219b());
        sb2.append('.');
        sb2.append(kFunction.m89218a());
        f64642b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb3.append(suspendFunction.m89219b());
        sb3.append('.');
        sb3.append(suspendFunction.m89218a());
        f64643c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb4.append(kSuspendFunction.m89219b());
        sb4.append('.');
        sb4.append(kSuspendFunction.m89218a());
        f64644d = sb4.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classIdM91936c = companion.m91936c(new FqName("kotlin.jvm.functions.FunctionN"));
        f64645e = classIdM91936c;
        f64646f = classIdM91936c.m91925a();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f64647g = standardClassIds.m91992l();
        f64648h = standardClassIds.m91991k();
        f64649i = javaToKotlinClassMap.m89240g(Class.class);
        f64650j = new HashMap<>();
        f64651k = new HashMap<>();
        f64652l = new HashMap<>();
        f64653m = new HashMap<>();
        f64654n = new HashMap<>();
        f64655o = new HashMap<>();
        ClassId classIdM91936c2 = companion.m91936c(StandardNames.FqNames.f64551V);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Iterable.class), classIdM91936c2, new ClassId(classIdM91936c2.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64563d0, classIdM91936c2.m91929f()), false));
        ClassId classIdM91936c3 = companion.m91936c(StandardNames.FqNames.f64549U);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Iterator.class), classIdM91936c3, new ClassId(classIdM91936c3.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64561c0, classIdM91936c3.m91929f()), false));
        ClassId classIdM91936c4 = companion.m91936c(StandardNames.FqNames.f64552W);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Collection.class), classIdM91936c4, new ClassId(classIdM91936c4.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64565e0, classIdM91936c4.m91929f()), false));
        ClassId classIdM91936c5 = companion.m91936c(StandardNames.FqNames.f64553X);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(List.class), classIdM91936c5, new ClassId(classIdM91936c5.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64567f0, classIdM91936c5.m91929f()), false));
        ClassId classIdM91936c6 = companion.m91936c(StandardNames.FqNames.f64555Z);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Set.class), classIdM91936c6, new ClassId(classIdM91936c6.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64571h0, classIdM91936c6.m91929f()), false));
        ClassId classIdM91936c7 = companion.m91936c(StandardNames.FqNames.f64554Y);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(ListIterator.class), classIdM91936c7, new ClassId(classIdM91936c7.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64569g0, classIdM91936c7.m91929f()), false));
        FqName fqName = StandardNames.FqNames.f64557a0;
        ClassId classIdM91936c8 = companion.m91936c(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Map.class), classIdM91936c8, new ClassId(classIdM91936c8.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64573i0, classIdM91936c8.m91929f()), false));
        ClassId classIdM91927d = companion.m91936c(fqName).m91927d(StandardNames.FqNames.f64559b0.m91942f());
        List<PlatformMutabilityMapping> listListOf = CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.m89240g(Map.Entry.class), classIdM91927d, new ClassId(classIdM91927d.m91929f(), FqNamesUtilKt.m91967g(StandardNames.FqNames.f64575j0, classIdM91927d.m91929f()), false))});
        f64656p = listListOf;
        javaToKotlinClassMap.m89239f(Object.class, StandardNames.FqNames.f64556a);
        javaToKotlinClassMap.m89239f(String.class, StandardNames.FqNames.f64568g);
        javaToKotlinClassMap.m89239f(CharSequence.class, StandardNames.FqNames.f64566f);
        javaToKotlinClassMap.m89238e(Throwable.class, StandardNames.FqNames.f64594t);
        javaToKotlinClassMap.m89239f(Cloneable.class, StandardNames.FqNames.f64560c);
        javaToKotlinClassMap.m89239f(Number.class, StandardNames.FqNames.f64588q);
        javaToKotlinClassMap.m89238e(Comparable.class, StandardNames.FqNames.f64596u);
        javaToKotlinClassMap.m89239f(Enum.class, StandardNames.FqNames.f64590r);
        javaToKotlinClassMap.m89238e(Annotation.class, StandardNames.FqNames.f64519F);
        Iterator<PlatformMutabilityMapping> it = listListOf.iterator();
        while (it.hasNext()) {
            INSTANCE.m89237d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            ClassId classIdM91936c9 = companion2.m91936c(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            javaToKotlinClassMap2.m89234a(classIdM91936c9, companion2.m91936c(StandardNames.m89156c(primitiveType)));
        }
        for (ClassId classId : CompanionObjectMapping.INSTANCE.m89028a()) {
            INSTANCE.m89234a(ClassId.Companion.m91936c(new FqName("kotlin.jvm.internal." + classId.m91931h().m91973b() + "CompanionObject")), classId.m91927d(SpecialNames.f66162c));
        }
        for (int i = 0; i < 23; i++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            javaToKotlinClassMap3.m89234a(ClassId.Companion.m91936c(new FqName("kotlin.jvm.functions.Function" + i)), StandardNames.m89154a(i));
            javaToKotlinClassMap3.m89236c(new FqName(f64642b + i), f64647g);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            INSTANCE.m89236c(new FqName((kSuspendFunction2.m89219b() + '.' + kSuspendFunction2.m89218a()) + i2), f64647g);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicInt"), javaToKotlinClassMap4.m89240g(AtomicInteger.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicLong"), javaToKotlinClassMap4.m89240g(AtomicLong.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), javaToKotlinClassMap4.m89240g(AtomicBoolean.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicReference"), javaToKotlinClassMap4.m89240g(AtomicReference.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), javaToKotlinClassMap4.m89240g(AtomicIntegerArray.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), javaToKotlinClassMap4.m89240g(AtomicLongArray.class));
        javaToKotlinClassMap4.m89236c(new FqName("kotlin.concurrent.atomics.AtomicArray"), javaToKotlinClassMap4.m89240g(AtomicReferenceArray.class));
        javaToKotlinClassMap4.m89236c(StandardNames.FqNames.f64558b.m91959m(), javaToKotlinClassMap4.m89240g(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    /* JADX INFO: renamed from: a */
    public final void m89234a(ClassId classId, ClassId classId2) {
        m89235b(classId, classId2);
        m89236c(classId2.m91925a(), classId);
    }

    /* JADX INFO: renamed from: b */
    public final void m89235b(ClassId classId, ClassId classId2) {
        f64650j.put(classId.m91925a().m91945i(), classId2);
    }

    /* JADX INFO: renamed from: c */
    public final void m89236c(FqName fqName, ClassId classId) {
        f64651k.put(fqName.m91945i(), classId);
    }

    /* JADX INFO: renamed from: d */
    public final void m89237d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdM89250a = platformMutabilityMapping.m89250a();
        ClassId classIdM89251b = platformMutabilityMapping.m89251b();
        ClassId classIdM89252c = platformMutabilityMapping.m89252c();
        m89234a(classIdM89250a, classIdM89251b);
        m89236c(classIdM89252c.m91925a(), classIdM89250a);
        f64654n.put(classIdM89252c, classIdM89251b);
        f64655o.put(classIdM89251b, classIdM89252c);
        FqName fqNameM91925a = classIdM89251b.m91925a();
        FqName fqNameM91925a2 = classIdM89252c.m91925a();
        f64652l.put(classIdM89252c.m91925a().m91945i(), fqNameM91925a);
        f64653m.put(fqNameM91925a.m91945i(), fqNameM91925a2);
    }

    /* JADX INFO: renamed from: e */
    public final void m89238e(Class<?> cls, FqName fqName) {
        m89234a(m89240g(cls), ClassId.Companion.m91936c(fqName));
    }

    /* JADX INFO: renamed from: f */
    public final void m89239f(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        m89238e(cls, fqNameUnsafe.m91959m());
    }

    /* JADX INFO: renamed from: g */
    public final ClassId m89240g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            return companion.m91936c(new FqName(canonicalName));
        }
        ClassId classIdM89240g = m89240g(declaringClass);
        Name nameM91970i = Name.m91970i(cls.getSimpleName());
        nameM91970i.getClass();
        return classIdM89240g.m91927d(nameM91970i);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final FqName m89241h() {
        return f64646f;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<PlatformMutabilityMapping> m89242i() {
        return f64656p;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m89243j(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strM91948a = fqNameUnsafe.m91948a();
        if (!C15493d.m94374J(strM91948a, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strM91948a.substring(str.length());
        return (StringsKt.m94290H0(strSubstring, '0', false, 2, null) || (intOrNull = StringsKt.toIntOrNull(strSubstring)) == null || intOrNull.intValue() < 23) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89244k(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f64652l.containsKey(fqNameUnsafe);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m89245l(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f64653m.containsKey(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final ClassId m89246m(@NotNull FqName fqName) {
        fqName.getClass();
        return f64650j.get(fqName.m91945i());
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final ClassId m89247n(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        if (m89243j(fqNameUnsafe, f64641a)) {
            return f64645e;
        }
        if (m89243j(fqNameUnsafe, f64643c)) {
            return f64645e;
        }
        if (m89243j(fqNameUnsafe, f64642b)) {
            return f64647g;
        }
        return m89243j(fqNameUnsafe, f64644d) ? f64647g : f64651k.get(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final FqName m89248o(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f64652l.get(fqNameUnsafe);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final FqName m89249p(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f64653m.get(fqNameUnsafe);
    }
}
