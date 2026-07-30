package kotlin.text;

import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import p149l.kgj0;
import p149l.pce0;

/* JADX INFO: renamed from: kotlin.text.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m87232d2 = {"", "", "c1", "(Ljava/lang/CharSequence;)C", "Lkotlin/random/Random;", BLivePkCategory.random, "d1", "(Ljava/lang/CharSequence;Lkotlin/random/Random;)C", "", "", "n", "a1", "(Ljava/lang/String;I)Ljava/lang/String;", "b1", "e1", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/text/StringsKt")
@SourceDebugExtension
public class C15390h extends C15389g {
    @NotNull
    /* JADX INFO: renamed from: a1 */
    public static final String m93493a1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return str.substring(C15167a.m87599e(i, str.length()));
        }
        pce0.m168340a("Requested character count ", i, " is less than zero.");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public static String m93494b1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return m93497e1(str, C15167a.m87596b(str.length() - i, 0));
        }
        pce0.m168340a("Requested character count ", i, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public static char m93495c1(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.m93426W(charSequence));
        }
        kgj0.m145892a("Char sequence is empty.");
        return (char) 0;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: d1 */
    public static char m93496d1(@NotNull CharSequence charSequence, @NotNull Random random) {
        charSequence.getClass();
        random.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        kgj0.m145892a("Char sequence is empty.");
        return (char) 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public static String m93497e1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return str.substring(0, C15167a.m87599e(i, str.length()));
        }
        pce0.m168340a("Requested character count ", i, " is less than zero.");
        return null;
    }
}
