package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes2.dex */
public class Intrinsics {

    @SinceKotlin
    public static class Kotlin {
        private Kotlin() {
        }
    }

    private Intrinsics() {
    }

    @SinceKotlin
    /* JADX INFO: renamed from: a */
    public static boolean m88374a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @SinceKotlin
    /* JADX INFO: renamed from: b */
    public static boolean m88375b(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: c */
    public static boolean m88376c(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m88383j(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            m88387n(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m88377d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: e */
    public static int m88378e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m88379f(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static String m88380g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* JADX INFO: renamed from: h */
    public static void m88381h() {
        m88388o();
    }

    /* JADX INFO: renamed from: i */
    public static void m88382i(int i, String str) {
        m88388o();
    }

    /* JADX INFO: renamed from: j */
    public static <T extends Throwable> T m88383j(T t) {
        return (T) m88384k(t, Intrinsics.class.getName());
    }

    /* JADX INFO: renamed from: k */
    public static <T extends Throwable> T m88384k(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* JADX INFO: renamed from: l */
    public static String m88385l(String str, Object obj) {
        return str + obj;
    }

    /* JADX INFO: renamed from: m */
    public static void m88386m() {
        throw ((KotlinNullPointerException) m88383j(new KotlinNullPointerException()));
    }

    /* JADX INFO: renamed from: n */
    public static void m88387n(String str) {
        throw ((NullPointerException) m88383j(new NullPointerException(m88380g(str))));
    }

    /* JADX INFO: renamed from: o */
    public static void m88388o() {
        m88389p("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: p */
    public static void m88389p(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m88390q(String str) {
        throw ((UninitializedPropertyAccessException) m88383j(new UninitializedPropertyAccessException(str)));
    }

    /* JADX INFO: renamed from: r */
    public static void m88391r(String str) {
        m88390q("lateinit property " + str + " has not been initialized");
    }
}
