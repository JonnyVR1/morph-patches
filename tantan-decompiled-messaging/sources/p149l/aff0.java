package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class aff0 {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static int m96214a(Context context) {
        if (!jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 96, 46, 126, 121, 36, 57, 99, 50, 112, 99, 36}))) {
            return -1;
        }
        try {
            SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(context);
            if (subscriptionManagerFrom != null) {
                return subscriptionManagerFrom.getActiveSubscriptionInfoCount();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m96215b(int i) {
        TelephonyManager telephonyManagerM96218e;
        String str;
        if (Build.VERSION.SDK_INT >= 29 || (telephonyManagerM96218e = m96218e()) == null) {
            return "";
        }
        try {
            Method method = Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 69, 82, HttpTokens.CARRIAGE_RETURN, 3, 64, 14, 94, 89, 24, 72, 100, 3, 93, 82, 17, 14, 95, 8, 72, 122, 0, 8, 81, 1, 84, 69})).getMethod(sgw.m184137a(new byte[]{87, 3, 69, 100, 20, 4, 67, 5, 67, 94, 3, 3, 66, 47, 85}), Integer.TYPE);
            str = method != null ? (String) method.invoke(telephonyManagerM96218e, Integer.valueOf(i)) : "";
        } catch (Exception unused) {
        }
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m96216c(Context context) {
        JSONObject jSONObject = new JSONObject();
        int iM96214a = m96214a(context);
        m96219f(jSONObject, sgw.m184137a(new byte[]{67, 15, 92, 116, 14, 19, 94, 18}), Integer.valueOf(iM96214a));
        if (iM96214a <= 0) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(sgw.m184137a(new byte[]{68, 3, 93, 82, 17, 14, 95, 8, 72, 104, 18, 19, 82, 21, 82, 69, 8, 22, 68, 15, 94, 89, 62, 21, 85, 20, 71, 94, 2, 3}));
        if (subscriptionManager != null) {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                    m96219f(jSONObject, sgw.m184137a(new byte[]{87, 3, 69, 100, 40, 43, 83, 7, 67, 83, 18, 35, 66, 20, 94, 69}), sgw.m184137a(new byte[]{126, 9, 17, 86, 2, 18, 89, Tnaf.POW_2_WIDTH, 84, 23, 50, 47, 125, 70, 82, 86, 19, 2, 67, 70, 87, 88, 20, 8, 84}));
                } else {
                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(m96217d(it.next(), context));
                    }
                }
            } catch (Exception e) {
                m96219f(jSONObject, sgw.m184137a(new byte[]{87, 3, 69, 100, 40, 43, 83, 7, 67, 83, 18, 35, 66, 20, 94, 69}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 87, 3, 69, 67, 8, 8, 87, 70, 80, 84, 21, 15, 70, 3, 17, 68, 20, 4, 67, 5, 67, 94, 17, 18, 89, 9, 95, 23, 8, 8, 86, 9, 17, 91, 8, 21, 68, 92, 17}) + e.getMessage());
            }
        } else {
            m96219f(jSONObject, sgw.m184137a(new byte[]{87, 3, 69, 100, 40, 43, 83, 7, 67, 83, 18, 35, 66, 20, 94, 69}), sgw.m184137a(new byte[]{99, 19, 83, 68, 2, 20, 89, 22, 69, 94, 14, 8, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93}));
        }
        m96219f(jSONObject, sgw.m184137a(new byte[]{67, 15, 92, 116, 0, 20, 84, 21}), jSONArray);
        return jSONObject;
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: d */
    private static JSONObject m96217d(SubscriptionInfo subscriptionInfo, Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
            String strM96215b = m96215b(simSlotIndex);
            String countryIso = subscriptionInfo.getCountryIso();
            String iccId = subscriptionInfo.getIccId();
            String number = subscriptionInfo.getNumber();
            m96219f(jSONObject, sgw.m184137a(new byte[]{67, 15, 92, 100, HttpTokens.CARRIAGE_RETURN, 9, 68, 47, 95, 83, 4, 30}), Integer.valueOf(simSlotIndex));
            m96219f(jSONObject, sgw.m184137a(new byte[]{89, 11, 66, 94}), strM96215b);
            m96219f(jSONObject, sgw.m184137a(new byte[]{83, 9, 68, 89, 21, 20, 73, 47, 66, 88}), countryIso);
            m96219f(jSONObject, sgw.m184137a(new byte[]{89, 5, 82, 126, 5}), iccId);
            m96219f(jSONObject, sgw.m184137a(new byte[]{94, 19, 92, 85, 4, 20}), number);
            return jSONObject;
        } catch (Exception e) {
            m96219f(jSONObject, sgw.m184137a(new byte[]{87, 3, 69, 100, 40, 43, 83, 7, 67, 83, 18, 35, 66, 20, 94, 69}), sgw.m184137a(new byte[]{117, 20, 67, 88, 19, 70, 83, 20, 84, 86, 21, 15, 94, 1, 17, 125, 50, 41, 126, 70, 94, 85, 11, 3, 83, 18, 17, 81, 14, 20, Tnaf.POW_2_WIDTH, 53, 120, 122, 65, 5, 81, 20, 85, 23, 8, 8, 86, 9, 11, 23}) + e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: e */
    private static TelephonyManager m96218e() {
        return (TelephonyManager) ygw.m214775a().getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
    }

    /* JADX INFO: renamed from: f */
    private static void m96219f(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}
