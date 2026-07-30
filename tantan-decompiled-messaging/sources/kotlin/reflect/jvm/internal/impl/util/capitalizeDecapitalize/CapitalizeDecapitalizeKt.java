package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CapitalizeDecapitalizeKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m93170a(@NotNull String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m93171b(@NotNull String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        return Character.toLowerCase(cCharAt) + str.substring(1);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m93172c(@NotNull String str, boolean z) {
        Integer next;
        str.getClass();
        if (str.length() == 0 || !m93173d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !m93173d(str, 1, z)) {
            if (z) {
                return m93171b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            return Character.toLowerCase(str.charAt(0)) + str.substring(1);
        }
        Iterator<Integer> it = StringsKt.m93424V(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (m93173d(str, next.intValue(), z));
        Integer num = next;
        if (num == null) {
            return m93174e(str, z);
        }
        int iIntValue = num.intValue() - 1;
        return m93174e(str.substring(0, iIntValue), z) + str.substring(iIntValue);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m93173d(String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        if (z) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    /* JADX INFO: renamed from: e */
    public static final String m93174e(String str, boolean z) {
        if (z) {
            return m93175f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m93175f(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
