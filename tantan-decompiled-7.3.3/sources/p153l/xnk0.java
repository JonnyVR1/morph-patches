package p153l;

import android.content.Context;
import com.momosec.mmuid.android.Native;
import java.util.HashMap;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class xnk0 {

    /* JADX INFO: renamed from: a */
    public static String f195404a = hmw.m136007a(new byte[]{99, 37, 94, 89, 7, 15, 87});

    /* JADX INFO: renamed from: b */
    public static String f195405b = hmw.m136007a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7});

    /* JADX INFO: renamed from: c */
    public static String f195406c = hmw.m136007a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7, 3});

    /* JADX INFO: renamed from: d */
    public static String f195407d = null;

    /* JADX INFO: renamed from: a */
    public static String m212214a(Context context, String str) {
        fiw.m125762b(context);
        String strM119088b = e2j0.m119088b();
        nr60.m164462a(context);
        String str2 = null;
        try {
            f195407d = str;
            String strM123987a = f4f0.m123987a(f195404a, f195406c);
            String strM174406e = pzd.m174406e(context, strM119088b);
            str2 = m8g0.m157377b(strM123987a) ? null : new String(Native.doCommand(strM123987a.getBytes(), 107));
            if (m8g0.m157377b(str2) || str2.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                String strM215997a = yhw.m215997a(Native.doCommand(strM174406e.getBytes(), 101));
                HashMap map = new HashMap();
                map.put(hmw.m136007a(new byte[]{93, 28, 88, 71}), strM215997a);
                String strM136007a = hmw.m136007a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 72, 69, 86, 15, 18, 81, 8, 80, 71, 17, 72, 83, 9, 92, 24, 23, 87, 31, 10, 94, 80, 78, 19, 64, 10, 94, 86, 5, 57, 89, 8, 87, 88, 78, 21, 69, 22, 65, 91, 4, 11, 85, 8, 69});
                for (int i = 0; i < 3; i++) {
                    try {
                        String strM154875a = lml.m154875a(strM136007a, strM119088b, map);
                        if (m8g0.m157377b(strM154875a)) {
                            break;
                        }
                        if (strM154875a.contains(hmw.m136007a(new byte[]{75})) && strM154875a.contains(hmw.m136007a(new byte[]{77}))) {
                            if (new JSONObject(strM154875a).optInt(hmw.m136007a(new byte[]{85, 20, 67, 84, 14, 2, 85})) != 0) {
                                break;
                            }
                        } else {
                            String str3 = new String(Native.doCommand(strM154875a.getBytes(), 107));
                            try {
                                f4f0.m123988b(f195404a, f195406c, strM154875a);
                                str2 = str3;
                                break;
                            } catch (Exception e) {
                                str2 = str3;
                                e = e;
                                lmw.m154891a(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            }
            String strM123987a2 = f4f0.m123987a(f195404a, f195405b);
            String str4 = new String(Native.doCommand(strM174406e.getBytes(), 108));
            if (!m8g0.m157377b(strM123987a2)) {
                String str5 = new String(Native.doCommand(strM123987a2.getBytes(), 109));
                if ((m8g0.m157377b(str5) || str5.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) && !m8g0.m157377b(str4) && !str4.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                    f4f0.m123988b(f195404a, f195405b, str4);
                }
            } else if (!m8g0.m157377b(str4) && !str4.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                f4f0.m123988b(f195404a, f195405b, str4);
            }
            if (!m8g0.m157377b(str2) && !str2.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) {
                return str2;
            }
            String str6 = new String(Native.doCommand(str4.getBytes(), 100));
            return (m8g0.m157377b(str6) && str6.equals(hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84}))) ? str2 : str6;
        } catch (Exception e3) {
            lmw.m154891a(e3);
            return str2;
        }
    }
}
