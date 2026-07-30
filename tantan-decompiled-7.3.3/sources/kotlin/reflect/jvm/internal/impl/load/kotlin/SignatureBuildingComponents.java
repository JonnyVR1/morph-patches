package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.vmf0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SignatureBuildingComponents {

    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: renamed from: l */
    public static final CharSequence m91276l(String str) {
        str.getClass();
        return INSTANCE.m91278c(str);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String[] m91277b(@NotNull String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public final String m91278c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m91279d(@NotNull String str, @NotNull String... strArr) {
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
    public final Set<String> m91280e(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return m91279d(m91283h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Set<String> m91281f(@NotNull String str, @NotNull String... strArr) {
        str.getClass();
        strArr.getClass();
        return m91279d(m91284i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m91282g(@NotNull String str) {
        str.getClass();
        return "java/util/function/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m91283h(@NotNull String str) {
        str.getClass();
        return "java/lang/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m91284i(@NotNull String str) {
        str.getClass();
        return "java/util/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m91285j(@NotNull String str) {
        str.getClass();
        return "java/util/concurrent/atomic/" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m91286k(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + CollectionsKt.joinToString$default(list, "", null, null, 0, null, vmf0.INSTANCE, 30, null) + ')' + m91278c(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m91287m(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
