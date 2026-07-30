package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltInsSignatures {

    @NotNull
    public static final JvmBuiltInsSignatures INSTANCE;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<String> f64688a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f64689b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f64690c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<String> f64691d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<String> f64692e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<String> f64693f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Set<String> f64694g;

    static {
        JvmBuiltInsSignatures jvmBuiltInsSignatures = new JvmBuiltInsSignatures();
        INSTANCE = jvmBuiltInsSignatures;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        f64688a = SetsKt.plus(signatureBuildingComponents.m91281f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f64689b = SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus((Set) jvmBuiltInsSignatures.m89323b(), (Iterable) signatureBuildingComponents.m91281f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), (Iterable) signatureBuildingComponents.m91280e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (Iterable) signatureBuildingComponents.m91280e("Double", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.m91280e("Float", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.m91280e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), (Iterable) signatureBuildingComponents.m91280e("CharSequence", "isEmpty()Z"));
        f64690c = signatureBuildingComponents.m91281f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f64691d = SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus((Set) signatureBuildingComponents.m91280e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) signatureBuildingComponents.m91281f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) signatureBuildingComponents.m91280e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable) signatureBuildingComponents.m91280e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable) signatureBuildingComponents.m91281f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable) signatureBuildingComponents.m91281f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (Iterable) signatureBuildingComponents.m91281f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f64692e = SetsKt.plus(SetsKt.plus((Set) signatureBuildingComponents.m91281f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable) signatureBuildingComponents.m91281f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (Iterable) signatureBuildingComponents.m91281f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setM89322a = jvmBuiltInsSignatures.m89322a();
        String[] strArrM91277b = signatureBuildingComponents.m91277b("D");
        Set setPlus = SetsKt.plus((Set) setM89322a, (Iterable) signatureBuildingComponents.m91280e("Float", (String[]) Arrays.copyOf(strArrM91277b, strArrM91277b.length)));
        String[] strArrM91277b2 = signatureBuildingComponents.m91277b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f64693f = SetsKt.plus(setPlus, (Iterable) signatureBuildingComponents.m91280e("String", (String[]) Arrays.copyOf(strArrM91277b2, strArrM91277b2.length)));
        String[] strArrM91277b3 = signatureBuildingComponents.m91277b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f64694g = signatureBuildingComponents.m91280e("Throwable", (String[]) Arrays.copyOf(strArrM91277b3, strArrM91277b3.length));
    }

    private JvmBuiltInsSignatures() {
    }

    /* JADX INFO: renamed from: a */
    public final Set<String> m89322a() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List listListOf = CollectionsKt.listOf((Object[]) new JvmPrimitiveType[]{jvmPrimitiveType, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            String strM91973b = ((JvmPrimitiveType) it.next()).getWrapperFqName().m91942f().m91973b();
            strM91973b.getClass();
            String[] strArrM91277b = signatureBuildingComponents.m91277b("Ljava/lang/String;");
            CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.m91280e(strM91973b, (String[]) Arrays.copyOf(strArrM91277b, strArrM91277b.length)));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final Set<String> m89323b() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        List<JvmPrimitiveType> listListOf = CollectionsKt.listOf((Object[]) new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listListOf) {
            String strM91973b = jvmPrimitiveType.getWrapperFqName().m91942f().m91973b();
            strM91973b.getClass();
            CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents.m91280e(strM91973b, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m89324c() {
        return f64690c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m89325d() {
        return f64688a;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Set<String> m89326e() {
        return f64693f;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Set<String> m89327f() {
        return f64689b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Set<String> m89328g() {
        return f64692e;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Set<String> m89329h() {
        return f64694g;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Set<String> m89330i() {
        return f64691d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m89331j(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return Intrinsics.m88377d(fqNameUnsafe, StandardNames.FqNames.f64570h) || StandardNames.m89158e(fqNameUnsafe);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89332k(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        if (m89331j(fqNameUnsafe)) {
            return true;
        }
        ClassId classIdM89247n = JavaToKotlinClassMap.INSTANCE.m89247n(fqNameUnsafe);
        if (classIdM89247n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(classIdM89247n.m91925a().m91937a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
