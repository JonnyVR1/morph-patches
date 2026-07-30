package p149l;

import android.annotation.SuppressLint;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.common.R$string;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class x8u {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f191548a = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: b */
    public static final DecimalFormat f191549b = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: a */
    public static boolean m207431a() {
        return Network.language().startsWith("zh") || Network.language().startsWith("ja") || Network.language().startsWith("ko");
    }

    /* JADX INFO: renamed from: b */
    public static String m207432b(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0" : m207433c(d);
    }

    @SuppressLint({"StringFormatInvalid"})
    /* JADX INFO: renamed from: c */
    public static String m207433c(double d) {
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            return m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17397Y), m207439i(fFloatValue)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), m207439i(fFloatValue * 100.0f));
        }
        if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            return m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17493r2), m207439i(fFloatValue2)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), m207439i(fFloatValue2 * 10.0f));
        }
        if (d <= 9999.0d) {
            return String.valueOf((int) d);
        }
        float fFloatValue3 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue();
        return m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17498s2), m207439i(fFloatValue3)) : String.format(Locale.US, App.f15369e.getString(R$string.f17310C0), m207439i(fFloatValue3 * 10.0f));
    }

    /* JADX INFO: renamed from: d */
    public static String m207434d(double d) {
        return d > 9999.0d ? String.format(Locale.US, "%sW", m207439i(new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue())) : String.valueOf((int) d);
    }

    /* JADX INFO: renamed from: e */
    public static String m207435e(double d) {
        return (d > 999.0d ? String.format(Locale.US, "%s Ribu", m207439i(new BigDecimal(String.valueOf(d / 1000.0d)).setScale(1, 1).floatValue())) : String.valueOf((int) d)).replace(Constants.SEPARATOR_COMMA, ".");
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    /* JADX INFO: renamed from: f */
    public static String m207436f(double d) {
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            return m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17397Y), Long.valueOf((long) fFloatValue)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), Long.valueOf((long) (fFloatValue * 100.0f)));
        }
        if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            return m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17493r2), Long.valueOf((long) fFloatValue2)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), Long.valueOf((long) (fFloatValue2 * 10.0f)));
        }
        if (d <= 9999.0d) {
            return String.valueOf((int) d);
        }
        float fFloatValue3 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue();
        if (m207431a()) {
            String strM207439i = m207439i(fFloatValue3);
            if (fFloatValue3 > 100.0f) {
                strM207439i = ((long) fFloatValue3) + "";
            }
            return String.format(Locale.US, App.f15369e.getString(R$string.f17498s2), strM207439i);
        }
        String strM207439i2 = m207439i(fFloatValue3);
        if (fFloatValue3 > 100.0f) {
            strM207439i2 = ((long) (fFloatValue3 * 10.0f)) + "";
        }
        return String.format(Locale.US, App.f15369e.getString(R$string.f17310C0), strM207439i2);
    }

    @SuppressLint({"StringFormatInvalid"})
    /* JADX INFO: renamed from: g */
    public static String m207437g(double d) {
        String strValueOf;
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            strValueOf = m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17397Y), m207439i(fFloatValue)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), m207439i(fFloatValue * 100.0f));
        } else if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            strValueOf = m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17493r2), m207439i(fFloatValue2)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), m207439i(fFloatValue2 * 10.0f));
        } else if (d > 999999.0d) {
            float fFloatValue3 = new BigDecimal(String.valueOf(d / 1000000.0d)).setScale(1, 1).floatValue();
            strValueOf = m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17498s2), m207439i(fFloatValue3 * 100.0f)) : String.format(Locale.US, App.f15369e.getString(R$string.f17530z0), m207439i(fFloatValue3));
        } else if (d > 9999.0d) {
            float fFloatValue4 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(2, 1).floatValue();
            strValueOf = m207431a() ? String.format(Locale.US, App.f15369e.getString(R$string.f17498s2), m207439i(fFloatValue4)) : String.format(Locale.US, App.f15369e.getString(R$string.f17310C0), m207439i(fFloatValue4 * 10.0f));
        } else if (d > 999.0d) {
            strValueOf = m207431a() ? String.valueOf((int) d) : String.format(Locale.US, App.f15369e.getString(R$string.f17310C0), m207439i(new BigDecimal(String.valueOf(d / 1000.0d)).setScale(1, 1).floatValue()));
        } else {
            strValueOf = String.valueOf((int) d);
        }
        return strValueOf.replace(Constants.SEPARATOR_COMMA, ".");
    }

    /* JADX INFO: renamed from: h */
    public static String m207438h(long j) {
        DecimalFormat decimalFormat = f191549b;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(j);
    }

    /* JADX INFO: renamed from: i */
    public static String m207439i(double d) {
        return new DecimalFormat("#.#").format(d);
    }

    /* JADX INFO: renamed from: j */
    public static String m207440j(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        return i < 1000000 ? String.format("%.1fK", Double.valueOf(Math.floor(((double) i) / 100.0d) / 10.0d)).replace(".0K", "K") : String.format("%.1fM", Double.valueOf(Math.floor(((double) i) / 100000.0d) / 10.0d)).replace(".0M", "M");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m207441k() {
        return !Network.language().startsWith("zh");
    }

    /* JADX INFO: renamed from: l */
    public static String m207442l(int i) {
        return f191548a.format(new Date(mqi0.m155944o() - (((long) i) * 86400000)));
    }

    /* JADX INFO: renamed from: m */
    public static String m207443m() {
        return f191548a.format(new Date(mqi0.m155944o()));
    }
}
