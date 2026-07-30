package p149l;

import android.content.Context;
import android.os.Environment;
import com.immomo.mdata.uitls.Coded;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class hlq0 {
    /* JADX INFO: renamed from: a */
    public static String m131688a() {
        String string;
        try {
            string = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory().toString() : null;
        } catch (Exception unused) {
        }
        return string == null ? "/sdcard" : string;
    }

    /* JADX INFO: renamed from: b */
    public static String m131689b(int i) {
        double dRandom;
        double d;
        String strValueOf;
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt != 0) {
                if (iNextInt == 1) {
                    dRandom = Math.random() * 25.0d;
                    d = 97.0d;
                } else if (iNextInt == 2) {
                    strValueOf = String.valueOf(new Random().nextInt(10));
                    stringBuffer.append(strValueOf);
                }
            } else {
                dRandom = Math.random() * 25.0d;
                d = 65.0d;
            }
            strValueOf = String.valueOf((char) Math.round(dRandom + d));
            stringBuffer.append(strValueOf);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m131690c(Context context) {
        HashMap map = new HashMap();
        try {
            map.put("androidid", qiq0.m174905b(context));
            map.put("model", qiq0.m174911h());
            map.put("cid", qiq0.m174913j());
            map.put("mac", qiq0.m174914k(context));
            map.put("screen", qiq0.m174918o(context));
            map.put(Device.IMEI, qiq0.m174907d(context));
        } catch (Exception unused) {
            map.put(BLivePkCategory.random, m131689b(64));
        }
        return map.toString();
    }

    /* JADX INFO: renamed from: d */
    private static String m131691d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "SHA1Error";
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m131692e(Context context, String str) {
        return e16.m114373a(context, str) == 0;
    }

    /* JADX INFO: renamed from: f */
    private static String m131693f(Context context, String str) {
        try {
            String strM131688a = m131688a();
            return (m131692e(context, "android.permission.WRITE_EXTERNAL_STORAGE") && m131692e(context, "android.permission.READ_EXTERNAL_STORAGE")) ? Coded.m18374m(context, strM131688a, str, 0) : Coded.m18374m(context, strM131688a, str, 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m131694g(Context context) {
        try {
            String strM131690c = m131690c(context);
            String strM131693f = m131693f(context, strM131690c);
            return (strM131693f.equals("invalid") || strM131693f.isEmpty()) ? m131691d(strM131690c) : strM131693f;
        } catch (Exception unused) {
            return "invalid";
        }
    }
}
