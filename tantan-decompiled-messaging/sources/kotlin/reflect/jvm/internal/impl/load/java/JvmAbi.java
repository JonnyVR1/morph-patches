package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final FqName f64689a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final ClassId f64690b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ClassId f64691c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ClassId f64692d;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f64689a = fqName;
        ClassId.Companion companion = ClassId.Companion;
        f64690b = companion.m91045c(fqName);
        f64691c = companion.m91045c(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f64692d = ClassId.Companion.m91043b(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private JvmAbi() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m89431b(@NotNull String str) {
        str.getClass();
        if (m89435f(str)) {
            return str;
        }
        return "get" + CapitalizeDecapitalizeKt.m93170a(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m89432c(@NotNull String str) {
        str.getClass();
        return C15386d.m93483J(str, "get", false, 2, null) || C15386d.m93483J(str, "is", false, 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m89433d(@NotNull String str) {
        str.getClass();
        return C15386d.m93483J(str, "set", false, 2, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m89434e(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(m89435f(str) ? str.substring(2) : CapitalizeDecapitalizeKt.m93170a(str));
        return sb.toString();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m89435f(@NotNull String str) {
        str.getClass();
        if (!C15386d.m93483J(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return Intrinsics.m87489e(97, cCharAt) > 0 || Intrinsics.m87489e(cCharAt, 122) > 0;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m89436a() {
        return f64692d;
    }
}
