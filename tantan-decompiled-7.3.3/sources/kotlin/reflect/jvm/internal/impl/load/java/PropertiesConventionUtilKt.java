package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PropertiesConventionUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<Name> m90348a(@NotNull Name name) {
        name.getClass();
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        if (JvmAbi.m90323c(strM91973b)) {
            return CollectionsKt.listOfNotNull(m90349b(name));
        }
        return JvmAbi.m90324d(strM91973b) ? m90353f(name) : BuiltinSpecialProperties.INSTANCE.m90247b(name);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Name m90349b(@NotNull Name name) {
        name.getClass();
        Name nameM90352e = m90352e(name, "get", false, null, 12, null);
        return nameM90352e == null ? m90352e(name, "is", false, null, 8, null) : nameM90352e;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Name m90350c(@NotNull Name name, boolean z) {
        name.getClass();
        return m90352e(name, "set", false, z ? "is" : null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Name m90351d(Name name, String str, boolean z, String str2) {
        if (name.m91976j()) {
            return null;
        }
        String strM91975g = name.m91975g();
        strM91975g.getClass();
        if (!C15493d.m94374J(strM91975g, str, false, 2, null) || strM91975g.length() == str.length()) {
            return null;
        }
        char cCharAt = strM91975g.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.m91970i(str2 + StringsKt.m94347w0(strM91975g, str));
        }
        if (!z) {
            return name;
        }
        String strM94063c = CapitalizeDecapitalizeKt.m94063c(StringsKt.m94347w0(strM91975g, str), true);
        if (Name.m91971m(strM94063c)) {
            return Name.m91970i(strM94063c);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Name m90352e(Name name, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m90351d(name, str, z, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<Name> m90353f(@NotNull Name name) {
        name.getClass();
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{m90350c(name, false), m90350c(name, true)});
    }
}
