package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.oef0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: renamed from: l */
    public static final CharSequence m90385l(String str) {
        str.getClass();
        return INSTANCE.m90387c(str);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String[] m90386b(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public final String m90387c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m90388d(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Set<String> m90389e(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return m90388d(m90392h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Set<String> m90390f(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return m90388d(m90393i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m90391g(@NotNull String str) {
        str.getClass();
        return "java/util/function/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m90392h(@NotNull String str) {
        str.getClass();
        return "java/lang/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m90393i(@NotNull String str) {
        str.getClass();
        return "java/util/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m90394j(@NotNull String str) {
        str.getClass();
        return "java/util/concurrent/atomic/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m90395k(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + CollectionsKt.joinToString$default(list, "", null, null, 0, null, oef0.INSTANCE, 30, null) + ')' + m90387c(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m90396m(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
