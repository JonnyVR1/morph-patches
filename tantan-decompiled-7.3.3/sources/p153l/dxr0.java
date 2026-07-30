package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes6.dex */
public final class dxr0 {
    /* JADX INFO: renamed from: a */
    public static long m118508a(String str) {
        try {
            return m118511d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || User.ID_TEAM_ACCOUNT.equals(str)) {
                swr0.m188360d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            swr0.m188359c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static kvr0 m118509b(vvr0 vvr0Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = vvr0Var.f185981c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jM118508a = str != null ? m118508a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(Constants.SEPARATOR_COMMA, 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals(HttpHeaderValues.NO_CACHE) || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jM118508a2 = str3 != null ? m118508a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jM118508a3 = str4 != null ? m118508a(str4) : j;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j6 = (j3 * 1000) + jCurrentTimeMillis;
            j5 = z ? j6 : (j2 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jM118508a <= j || jM118508a2 < jM118508a) ? j : (jM118508a2 - jM118508a) + jCurrentTimeMillis;
            j5 = j4;
        }
        kvr0 kvr0Var = new kvr0();
        kvr0Var.f128986a = vvr0Var.f185980b;
        kvr0Var.f128987b = str5;
        kvr0Var.f128991f = j4;
        kvr0Var.f128990e = j5;
        kvr0Var.f128988c = jM118508a;
        kvr0Var.f128989d = jM118508a3;
        kvr0Var.f128992g = map;
        kvr0Var.f128993h = vvr0Var.f185982d;
        return kvr0Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m118510c(long j) {
        return m118511d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: renamed from: d */
    public static SimpleDateFormat m118511d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
