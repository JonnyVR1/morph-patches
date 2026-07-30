package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"", "", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "o", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "p", "(Ljava/lang/String;)Ljava/lang/Long;", "q", "(Ljava/lang/String;I)Ljava/lang/Long;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/text/StringsKt")
public class StringsKt__StringNumberConversionsKt extends C15385c {
    @SinceKotlin
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final Integer m93389o(@NotNull String str, int i) {
        boolean z;
        int i2;
        int i3;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.m87489e(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iM93331a = CharsKt__CharJVMKt.m93331a(str.charAt(i2), i);
            if (iM93331a < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iM93331a) {
                return null;
            }
            i4 = i3 - iM93331a;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    @SinceKotlin
    @Nullable
    /* JADX INFO: renamed from: p */
    public static Long m93390p(@NotNull String str) {
        str.getClass();
        return m93391q(str, 10);
    }

    @SinceKotlin
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final Long m93391q(@NotNull String str, int i) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        Long l2 = null;
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.m87489e(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int iM93331a = CharsKt__CharJVMKt.m93331a(str.charAt(i2), i);
            if (iM93331a < 0) {
                return l2;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return l2;
                }
                j3 = j / ((long) i);
                if (j2 < j3) {
                    return l2;
                }
            }
            Long l3 = l2;
            int i3 = i2;
            long j4 = j2 * ((long) i);
            long j5 = iM93331a;
            if (j4 < j + j5) {
                return l3;
            }
            j2 = j4 - j5;
            i2 = i3 + 1;
            l2 = l3;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    @SinceKotlin
    @Nullable
    public static Integer toIntOrNull(@NotNull String str) {
        str.getClass();
        return m93389o(str, 10);
    }
}
