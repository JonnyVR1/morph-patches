package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"", "v1", "v2", "a", "(II)I", "", "b", "(JJ)I", "value", "base", "", "c", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
public final class UnsignedKt {
    @PublishedApi
    /* JADX INFO: renamed from: a */
    public static final int m87333a(int i, int i2) {
        return Intrinsics.m87489e(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final int m87334b(long j, long j2) {
        return Intrinsics.m87490f(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m87335c(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(i));
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt.checkRadix(i));
        string2.getClass();
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt.checkRadix(i));
        string3.getClass();
        sb.append(string3);
        return sb.toString();
    }
}
