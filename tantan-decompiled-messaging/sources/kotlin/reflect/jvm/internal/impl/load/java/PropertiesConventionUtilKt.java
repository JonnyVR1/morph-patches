package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PropertiesConventionUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<Name> m89457a(@NotNull Name name) {
        name.getClass();
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        if (JvmAbi.m89432c(strM91082b)) {
            return CollectionsKt.listOfNotNull(m89458b(name));
        }
        return JvmAbi.m89433d(strM91082b) ? m89462f(name) : BuiltinSpecialProperties.INSTANCE.m89356b(name);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Name m89458b(@NotNull Name name) {
        name.getClass();
        Name nameM89461e = m89461e(name, "get", false, null, 12, null);
        return nameM89461e == null ? m89461e(name, "is", false, null, 8, null) : nameM89461e;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Name m89459c(@NotNull Name name, boolean z) {
        name.getClass();
        return m89461e(name, "set", false, z ? "is" : null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Name m89460d(Name name, String str, boolean z, String str2) {
        if (name.m91085j()) {
            return null;
        }
        String strM91084g = name.m91084g();
        strM91084g.getClass();
        if (!C15386d.m93483J(strM91084g, str, false, 2, null) || strM91084g.length() == str.length()) {
            return null;
        }
        char cCharAt = strM91084g.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.m91079i(str2 + StringsKt.m93456w0(strM91084g, str));
        }
        if (!z) {
            return name;
        }
        String strM93172c = CapitalizeDecapitalizeKt.m93172c(StringsKt.m93456w0(strM91084g, str), true);
        if (Name.m91080m(strM93172c)) {
            return Name.m91079i(strM93172c);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Name m89461e(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m89460d(name, str, z, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<Name> m89462f(@NotNull Name name) {
        name.getClass();
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{m89459c(name, false), m89459c(name, true)});
    }
}
