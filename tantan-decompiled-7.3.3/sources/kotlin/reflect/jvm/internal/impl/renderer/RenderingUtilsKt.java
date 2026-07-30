package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mzc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RenderingUtilsKt {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m92591b(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return m92596g(fqNameUnsafe.m91955h());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m92592c(@NotNull Name name) {
        name.getClass();
        boolean zM92598i = m92598i(name);
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        if (!zM92598i) {
            return strM91973b;
        }
        return ("`" + strM91973b).concat("`");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m92593d(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function1<? super String, String> function2) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        String strInvoke = function0.invoke();
        String strM92597h = m92597h(str, strInvoke + "Mutable", str2, strInvoke, strInvoke + "(Mutable)");
        if (strM92597h != null) {
            return strM92597h;
        }
        String strM92597h2 = m92597h(str, strInvoke + "MutableMap.MutableEntry", str2, strInvoke + "Map.Entry", strInvoke + "(Mutable)Map.(Mutable)Entry");
        if (strM92597h2 != null) {
            return strM92597h2;
        }
        String strInvoke2 = function1.invoke();
        String strM92597h3 = m92597h(str, strInvoke2 + function2.invoke("Array<"), str2, strInvoke2 + function2.invoke("Array<out "), strInvoke2 + function2.invoke("Array<(out) "));
        if (strM92597h3 != null) {
            return strM92597h3;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m92594e(String str, String str2, Function0 function0, Function0 function1, Function1 function2, int i, Object obj) {
        if ((i & 16) != 0) {
            function2 = mzc0.INSTANCE;
        }
        return m92593d(str, str2, function0, function1, function2);
    }

    /* JADX INFO: renamed from: f */
    public static final String m92595f(String str) {
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m92596g(@NotNull List<Name> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m92592c(name));
        }
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m92597h(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (C15493d.m94374J(str, str2, false, 2, null) && C15493d.m94374J(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            String strSubstring2 = str3.substring(str4.length());
            String str6 = str5 + strSubstring;
            if (Intrinsics.m88377d(strSubstring, strSubstring2)) {
                return str6;
            }
            if (m92599j(strSubstring, strSubstring2)) {
                return str6.concat("!");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m92598i(Name name) {
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        if (KeywordStringsGenerated.f66482a.contains(strM91973b)) {
            return true;
        }
        for (int i = 0; i < strM91973b.length(); i++) {
            char cCharAt = strM91973b.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strM91973b.length() == 0 || !Character.isJavaIdentifierStart(strM91973b.codePointAt(0));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m92599j(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (Intrinsics.m88377d(str, C15493d.m94370F(str2, "?", "", false, 4, null))) {
            return true;
        }
        if (C15493d.m94380w(str2, "?", false, 2, null)) {
            if (Intrinsics.m88377d(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return Intrinsics.m88377d(sb.toString(), str2);
    }
}
