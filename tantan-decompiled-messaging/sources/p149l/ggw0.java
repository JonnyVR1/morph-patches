package p149l;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.api.Api;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* JADX INFO: loaded from: classes6.dex */
public final class ggw0 {

    /* JADX INFO: renamed from: a */
    public static final int f102568a;

    /* JADX INFO: renamed from: b */
    public static final String f102569b;

    /* JADX INFO: renamed from: c */
    public static final String f102570c;

    /* JADX INFO: renamed from: d */
    public static final String f102571d;

    /* JADX INFO: renamed from: e */
    public static final String f102572e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f102573f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f102574g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f102575h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f102576i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f102577j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public static HashMap f102578k;

    /* JADX INFO: renamed from: l */
    public static final String[] f102579l;

    /* JADX INFO: renamed from: m */
    public static final String[] f102580m;

    /* JADX INFO: renamed from: n */
    public static final int[] f102581n;

    /* JADX INFO: renamed from: o */
    public static final int[] f102582o;

    static {
        int i = Build.VERSION.SDK_INT;
        f102568a = i;
        String str = Build.DEVICE;
        f102569b = str;
        String str2 = Build.MANUFACTURER;
        f102570c = str2;
        String str3 = Build.MODEL;
        f102571d = str3;
        f102572e = str + ", " + str3 + ", " + str2 + ", " + i;
        f102573f = new byte[0];
        f102574g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f102575h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f102576i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f102577j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f102579l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f102580m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f102581n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f102582o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 202, 205, 144, 151, 158, 153, 140, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 130, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 166, 161, 180, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, Opcodes.IFNONNULL, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 165, 162, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, MMConstants.ERR_WATERMARK_READ, 134, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 128, 149, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 177, 182, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 184, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 163, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 249, 254, 247, 240, 229, 226, 235, 236, 193, Opcodes.IFNULL, 207, 200, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 169, 160, 167, 178, 181, 188, 187, 150, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, 159, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 131, 222, 217, 208, 215, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 204, 203, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    /* JADX INFO: renamed from: A */
    public static int m126044A(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    x9g0.m207497a();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX INFO: renamed from: B */
    public static int m126045B(Uri uri) {
        int i;
        String scheme = uri.getScheme();
        if (scheme != null && qew0.m174259c("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (qew0.m174257a(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    i = 1;
                    break;
                case "mpd":
                    i = 0;
                    break;
                case "isml":
                    i = 1;
                    break;
                case "m3u8":
                    i = 2;
                    break;
                default:
                    i = 4;
                    break;
            }
            if (i != 4) {
                return i;
            }
        }
        Pattern pattern = f102577j;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
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

    /* JADX INFO: renamed from: C */
    public static long m126046C(long j, int i) {
        return m126051H(j, i, 1000000L, RoundingMode.CEILING);
    }

    /* JADX INFO: renamed from: D */
    public static long m126047D(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    /* JADX INFO: renamed from: E */
    public static long m126048E(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    /* JADX INFO: renamed from: F */
    public static long m126049F(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* JADX INFO: renamed from: G */
    public static long m126050G(long j, int i) {
        return m126051H(j, 1000000L, i, RoundingMode.FLOOR);
    }

    /* JADX INFO: renamed from: H */
    public static long m126051H(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return kkw0.m146355a(j, kkw0.m146355a(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return kkw0.m146357c(j, kkw0.m146355a(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? m126071m(j, j2, j3, roundingMode) : kkw0.m146357c(j2, kkw0.m146355a(j, j3, RoundingMode.UNNECESSARY));
        }
        return kkw0.m146355a(j2, kkw0.m146355a(j3, j, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX INFO: renamed from: I */
    public static long m126052I(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* JADX INFO: renamed from: J */
    public static Point m126053J(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m126068j(context)) {
            String strM126072n = f102568a < 28 ? m126072n("sys.display-size") : m126072n("vendor.display-size");
            if (!TextUtils.isEmpty(strM126072n)) {
                try {
                    String[] strArrSplit = strM126072n.trim().split(BaseSei.f13930X, -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                svv0.m186108c("Util", "Invalid display size: ".concat(String.valueOf(strM126072n)));
            }
            if ("Sony".equals(f102570c) && f102571d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f102568a < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: K */
    public static AudioFormat m126054K(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX INFO: renamed from: L */
    public static Handler m126055L(@Nullable Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        f5v0.m119531b(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    /* JADX INFO: renamed from: M */
    public static Looper m126056M() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: N */
    public static mhr0 m126057N(int i, int i2, int i3) {
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("audio/raw");
        ter0Var.m188605k0(i2);
        ter0Var.m188619x(i3);
        ter0Var.m188612q(i);
        return ter0Var.m188591D();
    }

    /* JADX INFO: renamed from: O */
    public static String m126058O(byte[] bArr) {
        return new String(bArr, wew0.f185990c);
    }

    /* JADX INFO: renamed from: a */
    public static String m126059a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, wew0.f185990c);
    }

    /* JADX INFO: renamed from: b */
    public static String m126060b(int i) {
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
            default:
                return "camera motion";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m126061c(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            str = strReplace;
        }
        String strM174257a = qew0.m174257a(str);
        int i = 0;
        String str2 = strM174257a.split("-", 2)[0];
        if (f102578k == null) {
            f102578k = m126073o();
        }
        String str3 = (String) f102578k.get(str2);
        if (str3 != null) {
            strM174257a = str3.concat(strM174257a.substring(str2.length()));
            str2 = str3;
        }
        if ("no".equals(str2) || RXScreenCaptureService.KEY_INDEX.equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = f102580m;
                int length = strArr.length;
                if (i >= 18) {
                    break;
                }
                if (strM174257a.startsWith(strArr[i])) {
                    String str4 = strArr[i + 1];
                    return String.valueOf(str4).concat(strM174257a.substring(strArr[i].length()));
                }
                i += 2;
            }
        }
        return strM174257a;
    }

    /* JADX INFO: renamed from: d */
    public static ExecutorService m126062d(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: l.ifw0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static void m126063e(long[] jArr, long j, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jM146355a = kkw0.m146355a(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = kkw0.m146355a(jArr[i], jM146355a, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jM146355a2 = kkw0.m146355a(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = kkw0.m146357c(jArr[i], jM146355a2);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < jArr.length) {
            long j4 = jArr[i2];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i2] = kkw0.m146355a(1000000L, kkw0.m146355a(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i2] = m126071m(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i2] = kkw0.m146357c(1000000L, kkw0.m146355a(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i2++;
            j2 = j3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m126064f(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m126065g(v6w0 v6w0Var, v6w0 v6w0Var2, @Nullable Inflater inflater) {
        boolean z = false;
        if (v6w0Var.m197268q() <= 0) {
            return false;
        }
        if (v6w0Var2.m197269r() < v6w0Var.m197268q()) {
            int iM197268q = v6w0Var.m197268q();
            v6w0Var2.m197256e(iM197268q + iM197268q);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(v6w0Var.m197264m(), v6w0Var.m197270s(), v6w0Var.m197268q());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(v6w0Var2.m197264m(), iInflate, v6w0Var2.m197269r() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == v6w0Var2.m197269r()) {
                        int iM197269r = v6w0Var2.m197269r();
                        v6w0Var2.m197256e(iM197269r + iM197269r);
                    }
                } else {
                    v6w0Var2.m197261j(iInflate);
                    z = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m126066h(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m126067i(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m126068j(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m126069k(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static Object[] m126070l(Object[] objArr, int i) {
        f5v0.m119533d(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* JADX INFO: renamed from: m */
    public static long m126071m(long j, long j2, long j3, RoundingMode roundingMode) {
        long jM146357c = kkw0.m146357c(j, j2);
        if (jM146357c != Long.MAX_VALUE && jM146357c != Long.MIN_VALUE) {
            return kkw0.m146355a(jM146357c, j3, roundingMode);
        }
        long jM146356b = kkw0.m146356b(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jM146355a = kkw0.m146355a(j2, jM146356b, roundingMode2);
        long jM146355a2 = kkw0.m146355a(j3, jM146356b, roundingMode2);
        long jM146356b2 = kkw0.m146356b(Math.abs(j), Math.abs(jM146355a2));
        long jM146355a3 = kkw0.m146355a(j, jM146356b2, roundingMode2);
        long jM146355a4 = kkw0.m146355a(jM146355a2, jM146356b2, roundingMode2);
        long jM146357c2 = kkw0.m146357c(jM146355a3, jM146355a);
        if (jM146357c2 != Long.MAX_VALUE && jM146357c2 != Long.MIN_VALUE) {
            return kkw0.m146355a(jM146357c2, jM146355a4, roundingMode);
        }
        double d = jM146355a3 * (jM146355a / jM146355a4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return fkw0.m121943a(d, roundingMode);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static String m126072n(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            svv0.m186109d("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static HashMap m126073o() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f102579l.length;
        HashMap map = new HashMap(length + 88);
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
            String[] strArr = f102579l;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m126074p(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return !z ? i : iBinarySearch;
    }

    /* JADX INFO: renamed from: q */
    public static int m126075q(int[] iArr, int i, boolean z, boolean z2) {
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

    /* JADX INFO: renamed from: r */
    public static int m126076r(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: s */
    public static int m126077s(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f102581n[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: t */
    public static int m126078t(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = f102582o[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: u */
    public static int m126079u(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: v */
    public static int m126080v(int i) {
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
                if (f102568a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m126081w(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* JADX INFO: renamed from: x */
    public static int m126082x(int i) {
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

    /* JADX INFO: renamed from: y */
    public static int m126083y(@Nullable String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i = Integer.parseInt(str2);
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m126084z(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }
}
