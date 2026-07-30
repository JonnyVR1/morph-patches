package p149l;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class p1e {
    /* JADX INFO: renamed from: a */
    private static String m167053a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(rjw.m179664a(new byte[]{125, 34, 4})).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format(rjw.m179664a(new byte[]{21, 86, 3, 79}), Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m167054b(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    sb.append(file2.getName());
                    sb.append(rjw.m179664a(new byte[]{10}));
                    sb.append(m167053a(file2.getName()));
                    sb.append(rjw.m179664a(new byte[]{28}));
                } else if (file2.isDirectory()) {
                    sb.append(file2.getName());
                    sb.append(rjw.m179664a(new byte[]{10}));
                    sb.append(m167054b(file2));
                    sb.append(rjw.m179664a(new byte[]{28}));
                }
            }
            return m167053a(sb.toString());
        } catch (Exception unused) {
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m167055c() {
        String[] strArrM167056d = m167056d();
        String[] strArrM167057e = m167057e();
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArrM167056d.length; i++) {
            try {
                File file = new File(strArrM167056d[i]);
                if (file.exists() && file.isDirectory() && file.listFiles() != null) {
                    jSONObject.put(strArrM167057e[i], m167054b(file));
                } else {
                    jSONObject.put(strArrM167057e[i], "");
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    private static String[] m167056d() {
        String[] strArr = {rjw.m179664a(new byte[]{124, 85, 107, 91, 3, 11, 98, Tnaf.POW_2_WIDTH, 82, 94, 88, 21, 81, 49, 120, 10}), rjw.m179664a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 11, 83, 11, 119, 67, HttpTokens.SEMI_COLON, 62, 84, Tnaf.POW_2_WIDTH, 82, 90, 18, 91}), rjw.m179664a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 11, 82, 84, 4, 7, 2, 17, HttpTokens.CARRIAGE_RETURN, 91}), rjw.m179664a(new byte[]{124, 85, 107, 91, 3, 11, 98, Tnaf.POW_2_WIDTH, 82, 94, 88, 11, 81, 62, 123, 67, 5, 84, 118, 31, 107, 102, 92, 91}), rjw.m179664a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 15, 81, 49, 5, 10}), rjw.m179664a(new byte[]{124, 84, 99, 95, 5, 33, 117, Tnaf.POW_2_WIDTH, 82, 4, HttpTokens.CARRIAGE_RETURN, 28, 84, 33, 103, 67})};
        String[] strArr2 = new String[6];
        for (int i = 0; i < 6; i++) {
            try {
                strArr2[i] = new String(bgw.m101749a(strArr[i].getBytes()));
            } catch (Exception unused) {
            }
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: e */
    private static String[] m167057e() {
        return new String[]{rjw.m179664a(new byte[]{70, 10, 83}), rjw.m179664a(new byte[]{67, 0, 90}), rjw.m179664a(new byte[]{67, 0, 66}), rjw.m179664a(new byte[]{70, 0, 84}), rjw.m179664a(new byte[]{67, 4, 95}), rjw.m179664a(new byte[]{84, 21, 92})};
    }
}
