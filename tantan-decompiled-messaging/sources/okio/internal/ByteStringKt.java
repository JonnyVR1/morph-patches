package okio.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.text.C15386d;
import okio.Base64;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.ox50;
import p149l.tq3;
import p149l.uq3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\tH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u0011H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0011H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0011H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\tH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u001b\u001a\u00020\u0019*\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cH\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0000\u001a\f\u0010 \u001a\u00020\u0007*\u00020\u0001H\u0000\u001a\f\u0010!\u001a\u00020\u0007*\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\u001c\u0010#\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0007H\u0000\u001a\f\u0010%\u001a\u00020\t*\u00020\u0001H\u0000\u001a\u001c\u0010&\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0007H\u0000\u001a,\u0010'\u001a\u00020\u0019*\u00020\u00012\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0000\u001a,\u0010'\u001a\u00020\u0019*\u00020\u00012\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0000\u001a\u0014\u0010+\u001a\u00020\u0019*\u00020\u00012\u0006\u0010,\u001a\u00020\tH\u0000\u001a\u0014\u0010+\u001a\u00020\u0019*\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0000\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0000\u001a\f\u00100\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u00101\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u00102\u001a\u00020\t*\u00020\u0001H\u0000\u001a\f\u00103\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\f\u00104\u001a\u00020\u0011*\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m87232d2 = {"COMMON_EMPTY", "Lokio/ByteString;", "getCOMMON_EMPTY", "()Lokio/ByteString;", "HEX_DIGITS", "", "codePointIndexToCharIndex", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "codePointCount", "commonOf", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", Constants.INAPP_POSITION, "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "otherOffset", "byteCount", "commonStartsWith", RequestParameters.PREFIX, "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToString", "commonUtf8", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
public final class ByteStringKt {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    @NotNull
    private static final ByteString COMMON_EMPTY = ByteString.INSTANCE.m221053of(new byte[0]);

    private static final int codePointIndexToCharIndex(byte[] bArr, int i) {
        byte b;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && 31 >= b2) || (127 <= b2 && 159 >= b2))) || b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 >= length || (b = bArr[i3]) < 0) {
                        break;
                    }
                    i3++;
                    i6 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if ((b != 10 && b != 13 && ((b >= 0 && 31 >= b) || (127 <= b && 159 >= b))) || b == 65533) {
                        return -1;
                    }
                    i4 += b < 65536 ? 1 : 2;
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b3 = bArr[i7];
                if ((b3 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                int i8 = (b2 << 6) ^ (b3 ^ 3968);
                if (i8 < 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                int i9 = i5 + 1;
                if (i5 == i) {
                    break;
                }
                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && 31 >= i8) || (127 <= i8 && 159 >= i8))) || i8 == 65533) {
                    return -1;
                }
                i4 += i8 < 65536 ? 1 : 2;
                i3 += 2;
                i5 = i9;
            } else if ((b2 >> 4) == -2) {
                int i10 = i3 + 2;
                if (length <= i10) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b4 = bArr[i3 + 1];
                if ((b4 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b5 = bArr[i10];
                if ((b5 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                int i11 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                if (i11 < 2048) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i11 && 57343 >= i11) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    break;
                }
                if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && 31 >= i11) || (127 <= i11 && 159 >= i11))) || i11 == 65533) {
                    return -1;
                }
                i4 += i11 < 65536 ? 1 : 2;
                i3 += 3;
                i5 = i2;
            } else {
                if ((b2 >> 3) != -2) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                int i12 = i3 + 3;
                if (length <= i12) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b6 = bArr[i3 + 1];
                if ((b6 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b7 = bArr[i3 + 2];
                if ((b7 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                byte b8 = bArr[i12];
                if ((b8 & 192) != 128) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                int i13 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                if (i13 > 1114111) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i13 && 57343 >= i13) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                if (i13 < 65536) {
                    if (i5 == i) {
                        break;
                    }
                    return -1;
                }
                i2 = i5 + 1;
                if (i5 == i) {
                    break;
                }
                if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && 31 >= i13) || (127 <= i13 && 159 >= i13))) || i13 == 65533) {
                    return -1;
                }
                i4 += i13 < 65536 ? 1 : 2;
                i3 += 4;
                i5 = i2;
            }
        }
        return i4;
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString byteString) {
        byteString.getClass();
        return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString byteString) {
        byteString.getClass();
        return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        int size = byteString.size();
        int size2 = byteString2.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = byteString2.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String str) {
        str.getClass();
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String str) {
        str.getClass();
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new ByteString(bArr);
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String str) {
        str.getClass();
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$jvm(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(@NotNull ByteString byteString, @Nullable Object obj) {
        byteString.getClass();
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull ByteString byteString, int i) {
        byteString.getClass();
        return byteString.getData()[i];
    }

    public static final int commonGetSize(@NotNull ByteString byteString) {
        byteString.getClass();
        return byteString.getData().length;
    }

    public static final int commonHashCode(@NotNull ByteString byteString) {
        byteString.getClass();
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        byteString.setHashCode$jvm(Arrays.hashCode(byteString.getData()));
        return byteString.getHashCode();
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString byteString) {
        byteString.getClass();
        char[] cArr = new char[byteString.getData().length * 2];
        int i = 0;
        for (byte b : byteString.getData()) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i) {
        byteString.getClass();
        bArr.getClass();
        int length = byteString.getData().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(byteString.getData(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString byteString) {
        byteString.getClass();
        return byteString.getData();
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString, @NotNull byte[] bArr, int i) {
        byteString.getClass();
        bArr.getClass();
        for (int iMin = Math.min(i, byteString.getData().length - bArr.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(byteString.getData(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] bArr) {
        bArr.getClass();
        return new ByteString(Arrays.copyOf(bArr, bArr.length));
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i, @NotNull byte[] bArr, int i2, int i3) {
        byteString.getClass();
        bArr.getClass();
        return i >= 0 && i <= byteString.getData().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(byteString.getData(), i, bArr, i2, i3);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString byteString, int i, int i2) {
        byteString.getClass();
        if (i < 0) {
            ig3.m135964a("beginIndex < 0");
            return null;
        }
        if (i2 > byteString.getData().length) {
            tq3.m190083a("endIndex > length(", byteString.getData().length, 41);
            return null;
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            ig3.m135964a("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == byteString.getData().length) {
            return byteString;
        }
        byte[] bArr = new byte[i3];
        Platform.arraycopy(byteString.getData(), i, bArr, 0, i3);
        return new ByteString(bArr);
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString byteString) {
        byteString.getClass();
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                bArrCopyOf[i] = (byte) (b + HttpTokens.SPACE);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + HttpTokens.SPACE);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString byteString) {
        byteString.getClass();
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 97 && b <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                bArrCopyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArrCopyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString byteString) {
        byteString.getClass();
        byte[] data = byteString.getData();
        return Arrays.copyOf(data, data.length);
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString) {
        byteString.getClass();
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex == -1) {
            if (byteString.getData().length <= 64) {
                return "[hex=" + byteString.hex() + ']';
            }
            return "[size=" + byteString.getData().length + " hex=" + commonSubstring(byteString, 0, 64).hex() + "…]";
        }
        String strUtf8 = byteString.utf8();
        if (strUtf8 == null) {
            ox50.m166495a("null cannot be cast to non-null type java.lang.String");
            return null;
        }
        String strM93479F = C15386d.m93479F(C15386d.m93479F(C15386d.m93479F(strUtf8.substring(0, iCodePointIndexToCharIndex), "\\", "\\\\", false, 4, null), SignParameters.NEW_LINE, "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (iCodePointIndexToCharIndex >= strUtf8.length()) {
            return "[text=" + strM93479F + ']';
        }
        return "[size=" + byteString.getData().length + " text=" + strM93479F + "…]";
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString byteString) {
        byteString.getClass();
        String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = Platform.toUtf8String(byteString.internalArray$jvm());
        byteString.setUtf8$jvm(utf8String);
        return utf8String;
    }

    private static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        if ('a' <= c && 'f' >= c) {
            return c - 'W';
        }
        if ('A' <= c && 'F' >= c) {
            return c - '7';
        }
        uq3.m194950a("Unexpected hex digit: ", c);
        return 0;
    }

    @NotNull
    public static final ByteString getCOMMON_EMPTY() {
        return COMMON_EMPTY;
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        byteString.getClass();
        bArr.getClass();
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString, @NotNull byte[] bArr) {
        byteString.getClass();
        bArr.getClass();
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString, int i, @NotNull ByteString byteString2, int i2, int i3) {
        byteString.getClass();
        byteString2.getClass();
        return byteString2.rangeEquals(i2, byteString.getData(), i, i3);
    }
}
