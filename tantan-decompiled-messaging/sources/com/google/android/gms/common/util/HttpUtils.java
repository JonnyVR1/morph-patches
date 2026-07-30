package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p149l.euy0;
import p149l.fg3;
import p149l.gby0;
import p149l.ig3;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    @NonNull
    @KeepForSdk
    public static Map<String, String> parse(@NonNull URI uri, @NonNull String str) {
        Map<String, String> map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap<>();
            euy0 euy0VarM118226c = euy0.m118226c(gby0.m125349b('='));
            Iterator it = euy0.m118226c(gby0.m125349b('&')).m118229b().m118230d(rawQuery).iterator();
            while (it.hasNext()) {
                List listM118231f = euy0VarM118226c.m118231f((String) it.next());
                String strZza = null;
                if (listM118231f.isEmpty() || listM118231f.size() > 2) {
                    ig3.m135964a("bad parameter");
                    return null;
                }
                String strZza2 = zza((String) listM118231f.get(0), str);
                if (listM118231f.size() == 2) {
                    strZza = zza((String) listM118231f.get(1), str);
                }
                map.put(strZza2, strZza);
            }
        }
        return map;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            fg3.m121203a(e);
            return null;
        }
    }
}
