package kotlin.text;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.jym;
import p153l.sr3;

/* JADX INFO: renamed from: kotlin.text.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0005\u001a#\u0010 \u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0005\u001a;\u0010$\u001a\u00020\u0002*\u00020\u00002\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010(\u001a\u00020\u0000*\u00020&2\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)¨\u0006*"}, m88121d2 = {"", "other", "", "ignoreCase", BaseSei.f14624X, "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", c4s.C_ZONE, "(Ljava/lang/String;CCZ)Ljava/lang/String;", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "D", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "G", "", "r", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", BLiveStormDanmakuGiftResourceType.f45294s, "([CII)Ljava/lang/String;", "", Constants.KEY_T, "([B)Ljava/lang/String;", "u", "(Ljava/lang/String;)[B", RequestParameters.PREFIX, "I", "suffix", ResourceDirection.f39656v, "thisOffset", "otherOffset", "length", BaseSei.f14626Z, "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "", "n", "B", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/text/StringsKt")
@SourceDebugExtension
public class C15493d extends StringsKt__StringNumberConversionsKt {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m94365A(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return m94383z(str, i, str2, i2, i3, z);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static String m94366B(@NotNull CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            sr3.m187590a("Count 'n' must be non-negative, but was ", i, 46);
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(charSequence.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append(charSequence);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = charSequence.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m94367C(@NotNull String str, char c, char c2, boolean z) {
        str.getClass();
        if (!z) {
            String strReplace = str.replace(c, c2);
            strReplace.getClass();
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (C15490a.m94353d(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final String m94368D(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int i = 0;
        int iM94321Y = StringsKt__StringsKt.m94321Y(str, str2, 0, z);
        if (iM94321Y < 0) {
            return str;
        }
        int length = str2.length();
        int iM88486b = C15274a.m88486b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            jym.m147603a();
            return null;
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iM94321Y);
            sb.append(str3);
            i = iM94321Y + length;
            if (iM94321Y >= str.length()) {
                break;
            }
            iM94321Y = StringsKt__StringsKt.m94321Y(str, str2, iM94321Y + iM88486b, z);
        } while (iM94321Y > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m94369E(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m94367C(str, c, c2, z);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m94370F(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m94368D(str, str2, str3, z);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static final String m94371G(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM94327c0 = StringsKt__StringsKt.m94327c0(str, str2, 0, z, 2, null);
        return iM94327c0 < 0 ? str : StringsKt__StringsKt.m94350z0(str, iM94327c0, str2.length() + iM94327c0, str3).toString();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ String m94372H(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m94371G(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m94373I(@NotNull String str, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : m94383z(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m94374J(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m94373I(str, str2, z);
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: r */
    public static String m94375r(@NotNull char[] cArr) {
        cArr.getClass();
        return new String(cArr);
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: s */
    public static String m94376s(@NotNull char[] cArr, int i, int i2) {
        cArr.getClass();
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: t */
    public static String m94377t(@NotNull byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: u */
    public static byte[] m94378u(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m94379v(@NotNull String str, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : m94383z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m94380w(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m94379v(str, str2, z);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m94381x(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m94382y(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m94381x(str, str2, z);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m94383z(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
