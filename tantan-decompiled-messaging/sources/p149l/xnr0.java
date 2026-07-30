package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes6.dex */
public final class xnr0 {
    /* JADX INFO: renamed from: a */
    public static long m210206a(String str) {
        try {
            return m210209d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || User.ID_TEAM_ACCOUNT.equals(str)) {
                mnr0.m155560d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            mnr0.m155559c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static emr0 m210207b(pmr0 pmr0Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = pmr0Var.f150286c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jM210206a = str != null ? m210206a(str) : 0L;
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
        long jM210206a2 = str3 != null ? m210206a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jM210206a3 = str4 != null ? m210206a(str4) : j;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j6 = (j3 * 1000) + jCurrentTimeMillis;
            j5 = z ? j6 : (j2 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jM210206a <= j || jM210206a2 < jM210206a) ? j : (jM210206a2 - jM210206a) + jCurrentTimeMillis;
            j5 = j4;
        }
        emr0 emr0Var = new emr0();
        emr0Var.f92236a = pmr0Var.f150285b;
        emr0Var.f92237b = str5;
        emr0Var.f92241f = j4;
        emr0Var.f92240e = j5;
        emr0Var.f92238c = jM210206a;
        emr0Var.f92239d = jM210206a3;
        emr0Var.f92242g = map;
        emr0Var.f92243h = pmr0Var.f150287d;
        return emr0Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m210208c(long j) {
        return m210209d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: renamed from: d */
    public static SimpleDateFormat m210209d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
