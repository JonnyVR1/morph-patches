package p153l;

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
public class qtq0 {
    /* JADX INFO: renamed from: a */
    public static String m178072a(String str) {
        try {
            return String.valueOf(ptq0.m173777e(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e) {
            ouq0.m169395o("CloudCoder.hash4SHA1 ", e);
            wtq0.m207906a("failed to SHA1");
            return null;
        } catch (NoSuchAlgorithmException e2) {
            ouq0.m169395o("CloudCoder.hash4SHA1 ", e2);
            wtq0.m207906a("failed to SHA1");
            return null;
        } catch (Exception e3) {
            ouq0.m169395o("CloudCoder.hash4SHA1 ", e3);
            wtq0.m207906a("failed to SHA1");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m178073b(String str, String str2, Map<String, String> map, String str3) {
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
        return m178072a(sb.toString());
    }
}
