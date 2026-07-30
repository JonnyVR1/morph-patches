package kotlin.text;

import com.meituan.robust.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"", "", "b", "(C)Z", Constants.CHAR, "", "radix", "a", "(CI)I", "checkRadix", "(I)I", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    /* JADX INFO: renamed from: a */
    public static final int m94222a(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m94223b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @PublishedApi
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }
}
