package p149l;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.fastjson.asm.Opcodes;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vck0 {

    /* JADX INFO: renamed from: a */
    public static final int f180948a;

    /* JADX INFO: renamed from: b */
    public static final String f180949b;

    /* JADX INFO: renamed from: c */
    public static final String f180950c;

    /* JADX INFO: renamed from: d */
    public static final String f180951d;

    /* JADX INFO: renamed from: e */
    public static final String f180952e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f180953f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f180954g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f180955h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f180956i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f180957j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public static HashMap<String, String> f180958k;

    /* JADX INFO: renamed from: l */
    public static final String[] f180959l;

    /* JADX INFO: renamed from: m */
    public static final String[] f180960m;

    /* JADX INFO: renamed from: n */
    public static final int[] f180961n;

    /* JADX INFO: renamed from: o */
    public static final int[] f180962o;

    /* JADX INFO: renamed from: l.vck0$a */
    @RequiresApi(21)
    public static final class C20614a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m197904a(Context context, Resources resources, @DrawableRes int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f180948a = i;
        String str = Build.DEVICE;
        f180949b = str;
        String str2 = Build.MANUFACTURER;
        f180950c = str2;
        String str3 = Build.MODEL;
        f180951d = str3;
        f180952e = str + ", " + str3 + ", " + str2 + ", " + i;
        f180953f = new byte[0];
        f180954g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f180955h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f180956i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f180957j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f180959l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f180960m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f180961n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f180962o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 202, 205, 144, 151, 158, 153, 140, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 130, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 166, 161, 180, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, Opcodes.IFNONNULL, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 165, 162, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, MMConstants.ERR_WATERMARK_READ, 134, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 128, 149, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 177, 182, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 184, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 163, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 249, 254, 247, 240, 229, 226, 235, 236, 193, Opcodes.IFNULL, 207, 200, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 169, 160, 167, 178, 181, 188, 187, 150, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, 159, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 131, 222, 217, 208, 215, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 204, 203, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    /* JADX INFO: renamed from: A */
    public static HashMap<String, String> m197787A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f180959l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f180959l;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m197788A0(Context context) {
        return f180948a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX INFO: renamed from: B */
    public static long m197789B(long j, int i) {
        return m197875m(j * ((long) i), 1000000L);
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m197790B0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* JADX INFO: renamed from: C */
    public static Uri m197791C(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f180957j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m197792C0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* JADX INFO: renamed from: D */
    public static String m197793D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m197794D0(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: E */
    public static String m197795E(byte[] bArr) {
        return new String(bArr, fs4.f99036c);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m197796E0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* JADX INFO: renamed from: F */
    public static String m197797F(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, fs4.f99036c);
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m197798F0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: G */
    public static int m197799G(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* JADX INFO: renamed from: G0 */
    public static int m197800G0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: H */
    public static int m197801H(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f180948a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static String m197802H0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f180960m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC2003t.b m197803I(InterfaceC2003t interfaceC2003t, InterfaceC2003t.b bVar) {
        boolean zIsPlayingAd = interfaceC2003t.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = interfaceC2003t.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = interfaceC2003t.hasPreviousMediaItem();
        boolean zHasNextMediaItem = interfaceC2003t.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = interfaceC2003t.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = interfaceC2003t.isCurrentMediaItemDynamic();
        boolean zM9722u = interfaceC2003t.getCurrentTimeline().m9722u();
        boolean z = false;
        InterfaceC2003t.b.a aVarM11749d = new InterfaceC2003t.b.a().m11747b(bVar).m11749d(4, !zIsPlayingAd).m11749d(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).m11749d(6, zHasPreviousMediaItem && !zIsPlayingAd).m11749d(7, !zM9722u && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).m11749d(8, zHasNextMediaItem && !zIsPlayingAd).m11749d(9, !zM9722u && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).m11749d(10, !zIsPlayingAd).m11749d(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z = true;
        }
        return aVarM11749d.m11749d(12, z).m11750e();
    }

    /* JADX INFO: renamed from: I0 */
    public static <T> void m197804I0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    /* JADX INFO: renamed from: J */
    public static int m197805J(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* JADX INFO: renamed from: J0 */
    public static long m197806J0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m197807K(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: K0 */
    public static ExecutorService m197808K0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: l.qck0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return vck0.m197839a(str, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static int m197809L(@Nullable String str, int i) {
        int i2 = 0;
        for (String str2 : m197847c1(str)) {
            if (i == n200.m157531m(str2)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: L0 */
    public static String m197810L0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            str = strReplace;
        }
        String strM99804e = b11.m99804e(str);
        String str2 = m197844b1(strM99804e, "-")[0];
        if (f180958k == null) {
            f180958k = m197787A();
        }
        String str3 = f180958k.get(str2);
        if (str3 != null) {
            strM99804e = str3.concat(strM99804e.substring(str2.length()));
            str2 = str3;
        }
        return ("no".equals(str2) || RXScreenCaptureService.KEY_INDEX.equals(str2) || "zh".equals(str2)) ? m197802H0(strM99804e) : strM99804e;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public static String m197811M(@Nullable String str, int i) {
        String[] strArrM197847c1 = m197847c1(str);
        if (strArrM197847c1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM197847c1) {
            if (i == n200.m157531m(str2)) {
                if (sb.length() > 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public static <T> T[] m197812M0(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) m197869k(objArrCopyOf);
    }

    /* JADX INFO: renamed from: N */
    public static String m197813N(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N0 */
    public static <T> T[] m197814N0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* JADX INFO: renamed from: O */
    public static String m197815O(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return b11.m99806g(networkCountryIso);
            }
        }
        return b11.m99806g(Locale.getDefault().getCountry());
    }

    /* JADX INFO: renamed from: O0 */
    public static <T> T[] m197816O0(T[] tArr, int i) {
        p11.m167007a(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* JADX INFO: renamed from: P */
    public static Point m197817P(Context context) {
        DisplayManager displayManager;
        Display display = (f180948a < 17 || (displayManager = (DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) p11.m167011e((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay();
        }
        return m197819Q(context, display);
    }

    /* JADX INFO: renamed from: P0 */
    public static <T> T[] m197818P0(T[] tArr, int i, int i2) {
        p11.m167007a(i >= 0);
        p11.m167007a(i2 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    /* JADX INFO: renamed from: Q */
    public static Point m197819Q(Context context, Display display) {
        if (display.getDisplayId() == 0 && m197798F0(context)) {
            String strM197881o0 = f180948a < 28 ? m197881o0("sys.display-size") : m197881o0("vendor.display-size");
            if (!TextUtils.isEmpty(strM197881o0)) {
                try {
                    String[] strArrM197841a1 = m197841a1(strM197881o0.trim(), BaseSei.f13930X);
                    if (strArrM197841a1.length == 2) {
                        int i = Integer.parseInt(strArrM197841a1[0]);
                        int i2 = Integer.parseInt(strArrM197841a1[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                jwv.m143683c("Util", "Invalid display size: " + strM197881o0);
            }
            if ("Sony".equals(f180950c) && f180951d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i3 = f180948a;
        if (i3 >= 23) {
            m197829V(display, point);
        } else if (i3 >= 17) {
            m197827U(display, point);
        } else {
            m197825T(display, point);
        }
        return point;
    }

    /* JADX INFO: renamed from: Q0 */
    public static long m197820Q0(String str) throws ParserException {
        Matcher matcher = f180954g.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * Constants.ONE_MIN_IN_MILLIS) : timeInMillis;
    }

    /* JADX INFO: renamed from: R */
    public static Looper m197821R() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: R0 */
    public static long m197822R0(String str) {
        Matcher matcher = f180955h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d = Double.parseDouble(strGroup6);
        }
        long j = (long) ((d6 + d) * 1000.0d);
        return !zIsEmpty ? -j : j;
    }

    /* JADX INFO: renamed from: S */
    public static Locale m197823S() {
        return f180948a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    /* JADX INFO: renamed from: S0 */
    public static boolean m197824S0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: renamed from: T */
    public static void m197825T(Display display, Point point) {
        display.getSize(point);
    }

    /* JADX INFO: renamed from: T0 */
    public static boolean m197826T0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @RequiresApi(17)
    /* JADX INFO: renamed from: U */
    public static void m197827U(Display display, Point point) {
        display.getRealSize(point);
    }

    /* JADX INFO: renamed from: U0 */
    public static <T> void m197828U0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            x9g0.m207497a();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: V */
    public static void m197829V(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* JADX INFO: renamed from: V0 */
    public static long m197830V0(long j, int i) {
        return (j * 1000000) / ((long) i);
    }

    /* JADX INFO: renamed from: W */
    public static Drawable m197831W(Context context, Resources resources, @DrawableRes int i) {
        return f180948a >= 21 ? C20614a.m197904a(context, resources, i) : resources.getDrawable(i);
    }

    /* JADX INFO: renamed from: W0 */
    public static long m197832W0(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    /* JADX INFO: renamed from: X */
    public static int m197833X(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static long[] m197834X0(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < size) {
                jArr[i] = list.get(i).longValue() / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d = j / j2;
            while (i < size) {
                jArr[i] = (long) (list.get(i).longValue() * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < size) {
                jArr[i] = list.get(i).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: Y */
    public static int m197835Y(@Nullable String str) {
        String[] strArrM197841a1;
        int length;
        int i = 0;
        if (str == null || (length = (strArrM197841a1 = m197841a1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrM197841a1[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrM197841a1[length - 2]);
        try {
            i = Integer.parseInt((String) p11.m167011e(str2));
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m197836Y0(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
            return;
        }
        if (j2 >= j || j % j2 != 0) {
            double d = j / j2;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j4 = j / j2;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j4;
            i++;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static String m197837Z(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        ohg0.m164364a();
        return null;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: Z0 */
    public static boolean m197838Z0(@Nullable InterfaceC2003t interfaceC2003t) {
        return interfaceC2003t == null || !interfaceC2003t.getPlayWhenReady() || interfaceC2003t.getPlaybackState() == 1 || interfaceC2003t.getPlaybackState() == 4;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m197839a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m197840a0(Locale locale) {
        return f180948a >= 21 ? m197843b0(locale) : locale.toString();
    }

    /* JADX INFO: renamed from: a1 */
    public static String[] m197841a1(String str, String str2) {
        return str.split(str2, -1);
    }

    /* JADX INFO: renamed from: b */
    public static long m197842b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: b0 */
    public static String m197843b0(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: b1 */
    public static String[] m197844b1(String str, String str2) {
        return str.split(str2, 2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m197845c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c0 */
    public static int m197846c0(Context context, String str, boolean z) {
        return (f180948a < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    /* JADX INFO: renamed from: c1 */
    public static String[] m197847c1(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m197841a1(str.trim(), "(\\s*,\\s*)");
    }

    /* JADX INFO: renamed from: d */
    public static <T extends Comparable<? super T>> int m197848d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i = iBinarySearch + 1;
                if (i >= size || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(list.size() - 1, i2) : i2;
    }

    /* JADX INFO: renamed from: d0 */
    public static long m197849d0(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    @Nullable
    /* JADX INFO: renamed from: d1 */
    public static ComponentName m197850d1(Context context, Intent intent) {
        return f180948a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    /* JADX INFO: renamed from: e */
    public static int m197851e(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            while (true) {
                i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    /* JADX INFO: renamed from: e0 */
    public static long m197852e0(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    /* JADX INFO: renamed from: e1 */
    public static long m197853e1(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* JADX INFO: renamed from: f */
    public static <T extends Comparable<? super T>> int m197854f(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m197855f0(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* JADX INFO: renamed from: f1 */
    public static byte[] m197856f1(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m197857g(jzv jzvVar, long j, boolean z, boolean z2) {
        int i;
        int iM143950c = jzvVar.m143950c() - 1;
        int i2 = 0;
        while (i2 <= iM143950c) {
            int i3 = (i2 + iM143950c) >>> 1;
            if (jzvVar.m143949b(i3) < j) {
                i2 = i3 + 1;
            } else {
                iM143950c = i3 - 1;
            }
        }
        if (z && (i = iM143950c + 1) < jzvVar.m143950c() && jzvVar.m143949b(i) == j) {
            return i;
        }
        if (z2 && iM143950c == -1) {
            return 0;
        }
        return iM143950c;
    }

    /* JADX INFO: renamed from: g0 */
    public static C1871k m197858g0(int i, int i2, int i3) {
        return new C1871k.b().m10346g0("audio/raw").m10323J(i2).m10347h0(i3).m10340a0(i).m10320G();
    }

    /* JADX INFO: renamed from: g1 */
    public static float m197859g1(byte[] bArr) {
        p11.m167007a(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    /* JADX INFO: renamed from: h */
    public static int m197860h(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m197861h0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        x9g0.m207497a();
                        return 0;
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* JADX INFO: renamed from: h1 */
    public static String m197862h1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m197863i(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* JADX INFO: renamed from: i0 */
    public static long m197864i0(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    /* JADX INFO: renamed from: i1 */
    public static int m197865i1(byte[] bArr) {
        p11.m167007a(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << Tnaf.POW_2_WIDTH) | (bArr[2] << 8);
    }

    /* JADX INFO: renamed from: j0 */
    public static int m197867j0(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static long m197868j1(int i, int i2) {
        return m197871k1(i2) | (m197871k1(i) << 32);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m197870k0(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    /* JADX INFO: renamed from: k1 */
    public static long m197871k1(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: l */
    public static int m197872l(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX INFO: renamed from: l0 */
    public static String[] m197873l0() {
        String[] strArrM197876m0 = m197876m0();
        for (int i = 0; i < strArrM197876m0.length; i++) {
            strArrM197876m0[i] = m197810L0(strArrM197876m0[i]);
        }
        return strArrM197876m0;
    }

    /* JADX INFO: renamed from: l1 */
    public static long m197874l1(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* JADX INFO: renamed from: m */
    public static long m197875m(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: m0 */
    public static String[] m197876m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f180948a >= 24 ? m197879n0(configuration) : new String[]{m197840a0(configuration.locale)};
    }

    /* JADX INFO: renamed from: m1 */
    public static void m197877m1(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m197878n(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: n0 */
    public static String[] m197879n0(Configuration configuration) {
        return m197841a1(configuration.getLocales().toLanguageTags(), Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: o */
    public static int m197880o(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public static String m197881o0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            jwv.m143684d("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static float m197882p(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* JADX INFO: renamed from: p0 */
    public static String m197883p0(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m197884q(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX INFO: renamed from: q0 */
    public static String m197885q0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.19.1";
    }

    /* JADX INFO: renamed from: r */
    public static long m197886r(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* JADX INFO: renamed from: r0 */
    public static byte[] m197887r0(String str) {
        return str.getBytes(fs4.f99036c);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m197888s(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (m197845c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m197889s0(@Nullable InterfaceC2003t interfaceC2003t) {
        if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(1)) {
            return false;
        }
        interfaceC2003t.pause();
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static int m197890t(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f180961n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    /* JADX INFO: renamed from: t0 */
    public static boolean m197891t0(@Nullable InterfaceC2003t interfaceC2003t) {
        boolean z = false;
        if (interfaceC2003t == null) {
            return false;
        }
        int playbackState = interfaceC2003t.getPlaybackState();
        if (playbackState != 1 || !interfaceC2003t.isCommandAvailable(2)) {
            if (playbackState == 4 && interfaceC2003t.isCommandAvailable(4)) {
                interfaceC2003t.seekToDefaultPosition();
            }
            if (interfaceC2003t.isCommandAvailable(1)) {
                return z;
            }
            interfaceC2003t.play();
            return true;
        }
        interfaceC2003t.prepare();
        z = true;
        if (interfaceC2003t.isCommandAvailable(1)) {
            return z;
        }
        interfaceC2003t.play();
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static int m197892u(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f180962o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m197893u0(@Nullable InterfaceC2003t interfaceC2003t) {
        return m197838Z0(interfaceC2003t) ? m197891t0(interfaceC2003t) : m197889s0(interfaceC2003t);
    }

    /* JADX INFO: renamed from: v */
    public static Handler m197894v(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* JADX INFO: renamed from: v0 */
    public static int m197895v0(Uri uri) {
        int iM197897w0;
        String scheme = uri.getScheme();
        if (scheme != null && b11.m99800a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iM197897w0 = m197897w0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iM197897w0;
        }
        Matcher matcher = f180957j.matcher((CharSequence) p11.m167011e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: w */
    public static Handler m197896w() {
        return m197898x(null);
    }

    /* JADX INFO: renamed from: w0 */
    public static int m197897w0(String str) {
        String strM99804e = b11.m99804e(str);
        strM99804e.getClass();
        switch (strM99804e) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: x */
    public static Handler m197898x(@Nullable Handler.Callback callback) {
        return m197894v((Looper) p11.m167015i(Looper.myLooper()), callback);
    }

    /* JADX INFO: renamed from: x0 */
    public static int m197899x0(Uri uri, @Nullable String str) {
        if (str == null) {
            return m197895v0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: y */
    public static Handler m197900y() {
        return m197902z(null);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m197901y0(d860 d860Var, d860 d860Var2, @Nullable Inflater inflater) {
        if (d860Var.m110295a() <= 0) {
            return false;
        }
        if (d860Var2.m110296b() < d860Var.m110295a()) {
            d860Var2.m110297c(d860Var.m110295a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(d860Var.m110299e(), d860Var.m110300f(), d860Var.m110295a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(d860Var2.m110299e(), iInflate, d860Var2.m110296b() - iInflate);
                if (inflater.finished()) {
                    d860Var2.m110291T(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == d860Var2.m110296b()) {
                        d860Var2.m110297c(d860Var2.m110296b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static Handler m197902z(@Nullable Handler.Callback callback) {
        return m197894v(m197821R(), callback);
    }

    /* JADX INFO: renamed from: z0 */
    public static String m197903z0(int i) {
        return Integer.toString(i, 36);
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: j */
    public static <T> T m197866j(@Nullable T t) {
        return t;
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: k */
    public static <T> T[] m197869k(T[] tArr) {
        return tArr;
    }
}
