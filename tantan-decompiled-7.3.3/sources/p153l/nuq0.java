package p153l;

import android.content.Context;
import android.os.Environment;
import com.immomo.mdata.uitls.Coded;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class nuq0 {
    /* JADX INFO: renamed from: a */
    public static String m164812a() {
        String string;
        try {
            string = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory().toString() : null;
        } catch (Exception unused) {
        }
        return string == null ? "/sdcard" : string;
    }

    /* JADX INFO: renamed from: b */
    public static String m164813b(int i) {
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
    private static String m164814c(Context context) {
        HashMap map = new HashMap();
        try {
            map.put("androidid", vrq0.m202519b(context));
            map.put("model", vrq0.m202525h());
            map.put("cid", vrq0.m202527j());
            map.put("mac", vrq0.m202528k(context));
            map.put("screen", vrq0.m202532o(context));
            map.put(Device.IMEI, vrq0.m202521d(context));
        } catch (Exception unused) {
            map.put(BLivePkCategory.random, m164813b(64));
        }
        return map.toString();
    }

    /* JADX INFO: renamed from: d */
    private static String m164815d(String str) {
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
    public static boolean m164816e(Context context, String str) {
        return j26.m143188a(context, str) == 0;
    }

    /* JADX INFO: renamed from: f */
    private static String m164817f(Context context, String str) {
        try {
            String strM164812a = m164812a();
            return (m164816e(context, "android.permission.WRITE_EXTERNAL_STORAGE") && m164816e(context, "android.permission.READ_EXTERNAL_STORAGE")) ? Coded.m19383m(context, strM164812a, str, 0) : Coded.m19383m(context, strM164812a, str, 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m164818g(Context context) {
        try {
            String strM164814c = m164814c(context);
            String strM164817f = m164817f(context, strM164814c);
            return (strM164817f.equals("invalid") || strM164817f.isEmpty()) ? m164815d(strM164814c) : strM164817f;
        } catch (Exception unused) {
            return "invalid";
        }
    }
}
