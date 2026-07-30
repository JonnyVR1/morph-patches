package p007l;

import android.content.Context;
import com.momosec.mmuid.android.Native;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class rek0 {

    /* JADX INFO: renamed from: a */
    public static String f4074a = ijw.m9418a(new byte[]{99, 37, 94, 89, 7, 15, 87});

    /* JADX INFO: renamed from: b */
    public static String f4075b = ijw.m9418a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7});

    /* JADX INFO: renamed from: c */
    public static String f4076c = ijw.m9418a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7, 3});

    /* JADX INFO: renamed from: d */
    public static String f4077d = null;

    /* JADX INFO: renamed from: a */
    public static String m10557a(Context context, String str) {
        hgw.m9334b(context);
        String strM8583b = ati0.m8583b();
        ij60.m9415a(context);
        String str2 = null;
        try {
            f4077d = str;
            String strM11959a = yve0.m11959a(f4074a, f4076c);
            String strM8826e = cyd.m8826e(context, strM8583b);
            str2 = e0g0.m9017b(strM11959a) ? null : new String(Native.doCommand(strM11959a.getBytes(), 107));
            if (e0g0.m9017b(str2) || str2.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) {
                String strM8549a = agw.m8549a(Native.doCommand(strM8826e.getBytes(), 101));
                HashMap map = new HashMap();
                map.put(ijw.m9418a(new byte[]{93, 28, 88, 71}), strM8549a);
                String strM9418a = ijw.m9418a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, 13, 7, 82, 72, 69, 86, 15, 18, 81, 8, 80, 71, 17, 72, 83, 9, 92, 24, 23, 87, 31, 10, 94, 80, 78, 19, 64, 10, 94, 86, 5, 57, 89, 8, 87, 88, 78, 21, 69, 22, 65, 91, 4, 11, 85, 8, 69});
                for (int i = 0; i < 3; i++) {
                    try {
                        String strM11835a = xjl.m11835a(strM9418a, strM8583b, map);
                        if (e0g0.m9017b(strM11835a)) {
                            break;
                        }
                        if (strM11835a.contains(ijw.m9418a(new byte[]{75})) && strM11835a.contains(ijw.m9418a(new byte[]{77}))) {
                            if (new JSONObject(strM11835a).optInt(ijw.m9418a(new byte[]{85, 20, 67, 84, 14, 2, 85})) != 0) {
                                break;
                            }
                        } else {
                            String str3 = new String(Native.doCommand(strM11835a.getBytes(), 107));
                            try {
                                yve0.m11960b(f4074a, f4076c, strM11835a);
                                str2 = str3;
                                break;
                            } catch (Exception e) {
                                str2 = str3;
                                e = e;
                                mjw.m9867a(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            }
            String strM11959a2 = yve0.m11959a(f4074a, f4075b);
            String str4 = new String(Native.doCommand(strM8826e.getBytes(), 108));
            if (!e0g0.m9017b(strM11959a2)) {
                String str5 = new String(Native.doCommand(strM11959a2.getBytes(), 109));
                if ((e0g0.m9017b(str5) || str5.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) && !e0g0.m9017b(str4) && !str4.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) {
                    yve0.m11960b(f4074a, f4075b, str4);
                }
            } else if (!e0g0.m9017b(str4) && !str4.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) {
                yve0.m11960b(f4074a, f4075b, str4);
            }
            if (!e0g0.m9017b(str2) && !str2.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) {
                return str2;
            }
            String str6 = new String(Native.doCommand(str4.getBytes(), 100));
            return (e0g0.m9017b(str6) && str6.equals(ijw.m9418a(new byte[]{89, 8, 71, 86, 13, 15, 84}))) ? str2 : str6;
        } catch (Exception e3) {
            mjw.m9867a(e3);
            return str2;
        }
    }
}
