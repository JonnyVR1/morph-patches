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
import p153l.k3z0;
import p153l.mky0;
import p153l.tg3;
import p153l.wg3;

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
            k3z0 k3z0VarM148200c = k3z0.m148200c(mky0.m158852b('='));
            Iterator it = k3z0.m148200c(mky0.m158852b('&')).m148203b().m148204d(rawQuery).iterator();
            while (it.hasNext()) {
                List listM148205f = k3z0VarM148200c.m148205f((String) it.next());
                String strZza = null;
                if (listM148205f.isEmpty() || listM148205f.size() > 2) {
                    wg3.m206174a("bad parameter");
                    return null;
                }
                String strZza2 = zza((String) listM148205f.get(0), str);
                if (listM148205f.size() == 2) {
                    strZza = zza((String) listM148205f.get(1), str);
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
            tg3.m191013a(e);
            return null;
        }
    }
}
