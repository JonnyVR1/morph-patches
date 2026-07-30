package p009l;

import android.annotation.SuppressLint;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.common.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x8u {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f22472a = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: b */
    public static final DecimalFormat f22473b = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: a */
    public static boolean m24743a() {
        return Network.language().startsWith("zh") || Network.language().startsWith("ja") || Network.language().startsWith("ko");
    }

    /* JADX INFO: renamed from: b */
    public static String m24744b(double d) {
        return d == 0.0d ? "0" : m24745c(d);
    }

    @SuppressLint({"StringFormatInvalid"})
    /* JADX INFO: renamed from: c */
    public static String m24745c(double d) {
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            return m24743a() ? String.format(Locale.US, App.e.getString(R.string.Y), m24751i(fFloatValue)) : String.format(Locale.US, App.e.getString(R.string.z0), m24751i(fFloatValue * 100.0f));
        }
        if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            return m24743a() ? String.format(Locale.US, App.e.getString(R.string.r2), m24751i(fFloatValue2)) : String.format(Locale.US, App.e.getString(R.string.z0), m24751i(fFloatValue2 * 10.0f));
        }
        if (d <= 9999.0d) {
            return String.valueOf((int) d);
        }
        float fFloatValue3 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue();
        return m24743a() ? String.format(Locale.US, App.e.getString(R.string.s2), m24751i(fFloatValue3)) : String.format(Locale.US, App.e.getString(R.string.C0), m24751i(fFloatValue3 * 10.0f));
    }

    /* JADX INFO: renamed from: d */
    public static String m24746d(double d) {
        return d > 9999.0d ? String.format(Locale.US, "%sW", m24751i(new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue())) : String.valueOf((int) d);
    }

    /* JADX INFO: renamed from: e */
    public static String m24747e(double d) {
        return (d > 999.0d ? String.format(Locale.US, "%s Ribu", m24751i(new BigDecimal(String.valueOf(d / 1000.0d)).setScale(1, 1).floatValue())) : String.valueOf((int) d)).replace(",", ".");
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    /* JADX INFO: renamed from: f */
    public static String m24748f(double d) {
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            return m24743a() ? String.format(Locale.US, App.e.getString(R.string.Y), Long.valueOf((long) fFloatValue)) : String.format(Locale.US, App.e.getString(R.string.z0), Long.valueOf((long) (fFloatValue * 100.0f)));
        }
        if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            return m24743a() ? String.format(Locale.US, App.e.getString(R.string.r2), Long.valueOf((long) fFloatValue2)) : String.format(Locale.US, App.e.getString(R.string.z0), Long.valueOf((long) (fFloatValue2 * 10.0f)));
        }
        if (d <= 9999.0d) {
            return String.valueOf((int) d);
        }
        float fFloatValue3 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(1, 1).floatValue();
        if (m24743a()) {
            String strM24751i = m24751i(fFloatValue3);
            if (fFloatValue3 > 100.0f) {
                strM24751i = ((long) fFloatValue3) + "";
            }
            return String.format(Locale.US, App.e.getString(R.string.s2), strM24751i);
        }
        String strM24751i2 = m24751i(fFloatValue3);
        if (fFloatValue3 > 100.0f) {
            strM24751i2 = ((long) (fFloatValue3 * 10.0f)) + "";
        }
        return String.format(Locale.US, App.e.getString(R.string.C0), strM24751i2);
    }

    @SuppressLint({"StringFormatInvalid"})
    /* JADX INFO: renamed from: g */
    public static String m24749g(double d) {
        String strValueOf;
        if (d > 9.9999999E7d) {
            float fFloatValue = new BigDecimal(String.valueOf(d / 1.0E8d)).setScale(1, 1).floatValue();
            strValueOf = m24743a() ? String.format(Locale.US, App.e.getString(R.string.Y), m24751i(fFloatValue)) : String.format(Locale.US, App.e.getString(R.string.z0), m24751i(fFloatValue * 100.0f));
        } else if (d > 9999999.0d) {
            float fFloatValue2 = new BigDecimal(String.valueOf(d / 1.0E7d)).setScale(1, 1).floatValue();
            strValueOf = m24743a() ? String.format(Locale.US, App.e.getString(R.string.r2), m24751i(fFloatValue2)) : String.format(Locale.US, App.e.getString(R.string.z0), m24751i(fFloatValue2 * 10.0f));
        } else if (d > 999999.0d) {
            float fFloatValue3 = new BigDecimal(String.valueOf(d / 1000000.0d)).setScale(1, 1).floatValue();
            strValueOf = m24743a() ? String.format(Locale.US, App.e.getString(R.string.s2), m24751i(fFloatValue3 * 100.0f)) : String.format(Locale.US, App.e.getString(R.string.z0), m24751i(fFloatValue3));
        } else if (d > 9999.0d) {
            float fFloatValue4 = new BigDecimal(String.valueOf(d / 10000.0d)).setScale(2, 1).floatValue();
            strValueOf = m24743a() ? String.format(Locale.US, App.e.getString(R.string.s2), m24751i(fFloatValue4)) : String.format(Locale.US, App.e.getString(R.string.C0), m24751i(fFloatValue4 * 10.0f));
        } else if (d > 999.0d) {
            strValueOf = m24743a() ? String.valueOf((int) d) : String.format(Locale.US, App.e.getString(R.string.C0), m24751i(new BigDecimal(String.valueOf(d / 1000.0d)).setScale(1, 1).floatValue()));
        } else {
            strValueOf = String.valueOf((int) d);
        }
        return strValueOf.replace(",", ".");
    }

    /* JADX INFO: renamed from: h */
    public static String m24750h(long j) {
        DecimalFormat decimalFormat = f22473b;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(j);
    }

    /* JADX INFO: renamed from: i */
    public static String m24751i(double d) {
        return new DecimalFormat("#.#").format(d);
    }

    /* JADX INFO: renamed from: j */
    public static String m24752j(int i) {
        if (i < 1000) {
            return String.valueOf(i);
        }
        return i < 1000000 ? String.format("%.1fK", Double.valueOf(Math.floor(((double) i) / 100.0d) / 10.0d)).replace(".0K", "K") : String.format("%.1fM", Double.valueOf(Math.floor(((double) i) / 100000.0d) / 10.0d)).replace(".0M", "M");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m24753k() {
        return !Network.language().startsWith("zh");
    }

    /* JADX INFO: renamed from: l */
    public static String m24754l(int i) {
        return f22472a.format(new Date(mqi0.m18550o() - (((long) i) * 86400000)));
    }

    /* JADX INFO: renamed from: m */
    public static String m24755m() {
        return f22472a.format(new Date(mqi0.m18550o()));
    }
}
