package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final FqName f65363a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final ClassId f65364b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ClassId f65365c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ClassId f65366d;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f65363a = fqName;
        ClassId.Companion companion = ClassId.Companion;
        f65364b = companion.m91936c(fqName);
        f65365c = companion.m91936c(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f65366d = ClassId.Companion.m91934b(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private JvmAbi() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m90322b(@NotNull String str) {
        str.getClass();
        if (m90326f(str)) {
            return str;
        }
        return "get" + CapitalizeDecapitalizeKt.m94061a(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m90323c(@NotNull String str) {
        str.getClass();
        return C15493d.m94374J(str, "get", false, 2, null) || C15493d.m94374J(str, "is", false, 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m90324d(@NotNull String str) {
        str.getClass();
        return C15493d.m94374J(str, "set", false, 2, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m90325e(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(m90326f(str) ? str.substring(2) : CapitalizeDecapitalizeKt.m94061a(str));
        return sb.toString();
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m90326f(@NotNull String str) {
        str.getClass();
        if (!C15493d.m94374J(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return Intrinsics.m88378e(97, cCharAt) > 0 || Intrinsics.m88378e(cCharAt, 122) > 0;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m90327a() {
        return f65366d;
    }
}
