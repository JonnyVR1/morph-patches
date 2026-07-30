package p149l;

import android.content.Context;
import com.momosec.mmuid.android.Native;
import java.util.HashMap;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class rek0 {

    /* JADX INFO: renamed from: a */
    public static String f159059a = ijw.m136753a(new byte[]{99, 37, 94, 89, 7, 15, 87});

    /* JADX INFO: renamed from: b */
    public static String f159060b = ijw.m136753a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7});

    /* JADX INFO: renamed from: c */
    public static String f159061c = ijw.m136753a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7, 3});

    /* JADX INFO: renamed from: d */
    public static String f159062d = null;

    /* JADX INFO: renamed from: a */
    public static String m179050a(Context context, String str) {
        hgw.m130928b(context);
        String strM98801b = ati0.m98801b();
        ij60.m136508a(context);
        String str2 = null;
        try {
            f159062d = str;
            String strM216204a = yve0.m216204a(f159059a, f159061c);
            String strM109279e = cyd.m109279e(context, strM98801b);
            str2 = e0g0.m114181b(strM216204a) ? null : new String(Native.doCommand(strM216204a.getBytes(), 107));
            if (e0g0.m114181b(str2) || str2.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                String strM96355a = agw.m96355a(Native.doCommand(strM109279e.getBytes(), 101));
                HashMap map = new HashMap();
                map.put(ijw.m136753a(new byte[]{93, 28, 88, 71}), strM96355a);
                String strM136753a = ijw.m136753a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 72, 69, 86, 15, 18, 81, 8, 80, 71, 17, 72, 83, 9, 92, 24, 23, 87, 31, 10, 94, 80, 78, 19, 64, 10, 94, 86, 5, 57, 89, 8, 87, 88, 78, 21, 69, 22, 65, 91, 4, 11, 85, 8, 69});
                for (int i = 0; i < 3; i++) {
                    try {
                        String strM209729a = xjl.m209729a(strM136753a, strM98801b, map);
                        if (e0g0.m114181b(strM209729a)) {
                            break;
                        }
                        if (strM209729a.contains(ijw.m136753a(new byte[]{75})) && strM209729a.contains(ijw.m136753a(new byte[]{77}))) {
                            if (new JSONObject(strM209729a).optInt(ijw.m136753a(new byte[]{85, 20, 67, 84, 14, 2, 85})) != 0) {
                                break;
                            }
                        } else {
                            String str3 = new String(Native.doCommand(strM209729a.getBytes(), 107));
                            try {
                                yve0.m216205b(f159059a, f159061c, strM209729a);
                                str2 = str3;
                                break;
                            } catch (Exception e) {
                                str2 = str3;
                                e = e;
                                mjw.m154917a(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            }
            String strM216204a2 = yve0.m216204a(f159059a, f159060b);
            String str4 = new String(Native.doCommand(strM109279e.getBytes(), 108));
            if (!e0g0.m114181b(strM216204a2)) {
                String str5 = new String(Native.doCommand(strM216204a2.getBytes(), 109));
                if ((e0g0.m114181b(str5) || str5.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) && !e0g0.m114181b(str4) && !str4.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                    yve0.m216205b(f159059a, f159060b, str4);
                }
            } else if (!e0g0.m114181b(str4) && !str4.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                yve0.m216205b(f159059a, f159060b, str4);
            }
            if (!e0g0.m114181b(str2) && !str2.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                return str2;
            }
            String str6 = new String(Native.doCommand(str4.getBytes(), 100));
            return (e0g0.m114181b(str6) && str6.equals(ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) ? str2 : str6;
        } catch (Exception e3) {
            mjw.m154917a(e3);
            return str2;
        }
    }
}
