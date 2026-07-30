package p153l;

import androidx.annotation.Nullable;
import com.android.volley.C0923e;
import com.android.volley.InterfaceC0919a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes.dex */
public class xml {
    /* JADX INFO: renamed from: a */
    public static List<yzk> m211732a(List<yzk> list, InterfaceC0919a.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<yzk> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m218023a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<yzk> list2 = aVar.f4151h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (yzk yzkVar : aVar.f4151h) {
                    if (!treeSet.contains(yzkVar.m218023a())) {
                        arrayList.add(yzkVar);
                    }
                }
            }
        } else if (!aVar.f4150g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f4150g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new yzk(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m211733b(long j) {
        return m211735d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, String> m211734c(InterfaceC0919a.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f4145b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j = aVar.f4147d;
        if (j > 0) {
            map.put("If-Modified-Since", m211733b(j));
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    private static SimpleDateFormat m211735d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static InterfaceC0919a.a m211736e(cl20 cl20Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = cl20Var.f82340c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jM211738g = str != null ? m211738g(str) : 0L;
        String str2 = map.get("Cache-Control");
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
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
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
        String str3 = map.get("Expires");
        long jM211738g2 = str3 != null ? m211738g(str3) : j;
        String str4 = map.get("Last-Modified");
        long jM211738g3 = str4 != null ? m211738g(str4) : j;
        String str5 = map.get("ETag");
        if (i != 0) {
            long j6 = jCurrentTimeMillis + (j2 * 1000);
            j5 = z ? j6 : (j3 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jM211738g <= j || jM211738g2 < jM211738g) ? j : jCurrentTimeMillis + (jM211738g2 - jM211738g);
            j5 = j4;
        }
        InterfaceC0919a.a aVar = new InterfaceC0919a.a();
        aVar.f4144a = cl20Var.f82339b;
        aVar.f4145b = str5;
        aVar.f4149f = j4;
        aVar.f4148e = j5;
        aVar.f4146c = jM211738g;
        aVar.f4147d = jM211738g3;
        aVar.f4150g = map;
        aVar.f4151h = cl20Var.f82341d;
        return aVar;
    }

    /* JADX INFO: renamed from: f */
    public static String m211737f(@Nullable Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(com.meituan.robust.Constants.PACKNAME_END, 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static long m211738g(String str) {
        try {
            return m211735d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || User.ID_TEAM_ACCOUNT.equals(str)) {
                C0923e.m5112e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            C0923e.m5111d(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    public static List<yzk> m211739h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new yzk(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, String> m211740i(List<yzk> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (yzk yzkVar : list) {
            treeMap.put(yzkVar.m218023a(), yzkVar.m218024b());
        }
        return treeMap;
    }
}
