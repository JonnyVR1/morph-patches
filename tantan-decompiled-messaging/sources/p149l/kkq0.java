package p149l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class kkq0 {
    /* JADX INFO: renamed from: a */
    public static String m146351a(String str) {
        try {
            return String.valueOf(jkq0.m141911e(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e) {
            ilq0.m137042o("CloudCoder.hash4SHA1 ", e);
            qkq0.m175383a("failed to SHA1");
            return null;
        } catch (NoSuchAlgorithmException e2) {
            ilq0.m137042o("CloudCoder.hash4SHA1 ", e2);
            qkq0.m175383a("failed to SHA1");
            return null;
        } catch (Exception e3) {
            ilq0.m137042o("CloudCoder.hash4SHA1 ", e3);
            qkq0.m175383a("failed to SHA1");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m146352b(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str4 : arrayList) {
            if (!z) {
                sb.append('&');
            }
            sb.append(str4);
            z = false;
        }
        return m146351a(sb.toString());
    }
}
