package kotlin.text;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlin.text.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"", "", "c", "(C)I", "other", "", "ignoreCase", Constants.INAPP_DATA_TAG, "(CCZ)Z", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/text/CharsKt")
@SourceDebugExtension
public class C15490a extends CharsKt__CharJVMKt {
    @SinceKotlin
    /* JADX INFO: renamed from: c */
    public static int m94352c(char c) {
        int iM94222a = CharsKt__CharJVMKt.m94222a(c, 10);
        if (iM94222a >= 0) {
            return iM94222a;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m94353d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
