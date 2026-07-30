package kotlin.text;

import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import p153l.npj0;
import p153l.uke0;

/* JADX INFO: renamed from: kotlin.text.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m88121d2 = {"", "", "c1", "(Ljava/lang/CharSequence;)C", "Lkotlin/random/Random;", BLivePkCategory.random, "d1", "(Ljava/lang/CharSequence;Lkotlin/random/Random;)C", "", "", "n", "a1", "(Ljava/lang/String;I)Ljava/lang/String;", "b1", "e1", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/text/StringsKt")
@SourceDebugExtension
public class C15497h extends C15496g {
    @NotNull
    /* JADX INFO: renamed from: a1 */
    public static final String m94384a1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return str.substring(C15274a.m88489e(i, str.length()));
        }
        uke0.m196486a("Requested character count ", i, " is less than zero.");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public static String m94385b1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return m94388e1(str, C15274a.m88486b(str.length() - i, 0));
        }
        uke0.m196486a("Requested character count ", i, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public static char m94386c1(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.m94317W(charSequence));
        }
        npj0.m164229a("Char sequence is empty.");
        return (char) 0;
    }

    @SinceKotlin
    /* JADX INFO: renamed from: d1 */
    public static char m94387d1(@NotNull CharSequence charSequence, @NotNull Random random) {
        charSequence.getClass();
        random.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        npj0.m164229a("Char sequence is empty.");
        return (char) 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public static String m94388e1(@NotNull String str, int i) {
        str.getClass();
        if (i >= 0) {
            return str.substring(0, C15274a.m88489e(i, str.length()));
        }
        uke0.m196486a("Requested character count ", i, " is less than zero.");
        return null;
    }
}
