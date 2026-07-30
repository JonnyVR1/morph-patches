package p153l;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class d3e {
    /* JADX INFO: renamed from: a */
    private static String m113800a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(qmw.m177151a(new byte[]{125, 34, 4})).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format(qmw.m177151a(new byte[]{21, 86, 3, 79}), Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m113801b(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    sb.append(file2.getName());
                    sb.append(qmw.m177151a(new byte[]{10}));
                    sb.append(m113800a(file2.getName()));
                    sb.append(qmw.m177151a(new byte[]{28}));
                } else if (file2.isDirectory()) {
                    sb.append(file2.getName());
                    sb.append(qmw.m177151a(new byte[]{10}));
                    sb.append(m113801b(file2));
                    sb.append(qmw.m177151a(new byte[]{28}));
                }
            }
            return m113800a(sb.toString());
        } catch (Exception unused) {
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m113802c() {
        String[] strArrM113803d = m113803d();
        String[] strArrM113804e = m113804e();
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArrM113803d.length; i++) {
            try {
                File file = new File(strArrM113803d[i]);
                if (file.exists() && file.isDirectory() && file.listFiles() != null) {
                    jSONObject.put(strArrM113804e[i], m113801b(file));
                } else {
                    jSONObject.put(strArrM113804e[i], "");
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    private static String[] m113803d() {
        String[] strArr = {qmw.m177151a(new byte[]{124, 85, 107, 91, 3, 11, 98, Tnaf.POW_2_WIDTH, 82, 94, 88, 21, 81, 49, 120, 10}), qmw.m177151a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 11, 83, 11, 119, 67, HttpTokens.SEMI_COLON, 62, 84, Tnaf.POW_2_WIDTH, 82, 90, 18, 91}), qmw.m177151a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 11, 82, 84, 4, 7, 2, 17, HttpTokens.CARRIAGE_RETURN, 91}), qmw.m177151a(new byte[]{124, 85, 107, 91, 3, 11, 98, Tnaf.POW_2_WIDTH, 82, 94, 88, 11, 81, 62, 123, 67, 5, 84, 118, 31, 107, 102, 92, 91}), qmw.m177151a(new byte[]{124, 85, 127, 2, 2, 85, 98, 10, 83, 100, 88, 15, 81, 49, 5, 10}), qmw.m177151a(new byte[]{124, 84, 99, 95, 5, 33, 117, Tnaf.POW_2_WIDTH, 82, 4, HttpTokens.CARRIAGE_RETURN, 28, 84, 33, 103, 67})};
        String[] strArr2 = new String[6];
        for (int i = 0; i < 6; i++) {
            try {
                strArr2[i] = new String(zhw.m219701a(strArr[i].getBytes()));
            } catch (Exception unused) {
            }
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: e */
    private static String[] m113804e() {
        return new String[]{qmw.m177151a(new byte[]{70, 10, 83}), qmw.m177151a(new byte[]{67, 0, 90}), qmw.m177151a(new byte[]{67, 0, 66}), qmw.m177151a(new byte[]{70, 0, 84}), qmw.m177151a(new byte[]{67, 4, 95}), qmw.m177151a(new byte[]{84, 21, 92})};
    }
}
