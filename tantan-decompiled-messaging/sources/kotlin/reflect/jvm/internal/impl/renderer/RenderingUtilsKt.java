package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hrc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RenderingUtilsKt {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91700b(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return m91705g(fqNameUnsafe.m91064h());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m91701c(@NotNull Name name) {
        name.getClass();
        boolean zM91707i = m91707i(name);
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        if (!zM91707i) {
            return strM91082b;
        }
        return ("`" + strM91082b).concat("`");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m91702d(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function1<? super String, String> function2) {
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        String strInvoke = function0.invoke();
        String strM91706h = m91706h(str, strInvoke + "Mutable", str2, strInvoke, strInvoke + "(Mutable)");
        if (strM91706h != null) {
            return strM91706h;
        }
        String strM91706h2 = m91706h(str, strInvoke + "MutableMap.MutableEntry", str2, strInvoke + "Map.Entry", strInvoke + "(Mutable)Map.(Mutable)Entry");
        if (strM91706h2 != null) {
            return strM91706h2;
        }
        String strInvoke2 = function1.invoke();
        String strM91706h3 = m91706h(str, strInvoke2 + function2.invoke("Array<"), str2, strInvoke2 + function2.invoke("Array<out "), strInvoke2 + function2.invoke("Array<(out) "));
        if (strM91706h3 != null) {
            return strM91706h3;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m91703e(String str, String str2, Function0 function0, Function0 function1, Function1 function2, int i, Object obj) {
        if ((i & 16) != 0) {
            function2 = hrc0.INSTANCE;
        }
        return m91702d(str, str2, function0, function1, function2);
    }

    /* JADX INFO: renamed from: f */
    public static final String m91704f(String str) {
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m91705g(@NotNull List<Name> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m91701c(name));
        }
        return sb.toString();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m91706h(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (C15386d.m93483J(str, str2, false, 2, null) && C15386d.m93483J(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            String strSubstring2 = str3.substring(str4.length());
            String str6 = str5 + strSubstring;
            if (Intrinsics.m87488d(strSubstring, strSubstring2)) {
                return str6;
            }
            if (m91708j(strSubstring, strSubstring2)) {
                return str6.concat("!");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m91707i(Name name) {
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        if (KeywordStringsGenerated.f65808a.contains(strM91082b)) {
            return true;
        }
        for (int i = 0; i < strM91082b.length(); i++) {
            char cCharAt = strM91082b.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strM91082b.length() == 0 || !Character.isJavaIdentifierStart(strM91082b.codePointAt(0));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m91708j(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (Intrinsics.m87488d(str, C15386d.m93479F(str2, "?", "", false, 4, null))) {
            return true;
        }
        if (C15386d.m93489w(str2, "?", false, 2, null)) {
            if (Intrinsics.m87488d(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return Intrinsics.m87488d(sb.toString(), str2);
    }
}
