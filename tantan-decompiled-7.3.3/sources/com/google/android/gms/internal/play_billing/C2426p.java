package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.Purchase;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p153l.frm;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C2426p {

    /* JADX INFO: renamed from: a */
    public static final int f10406a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m14964a(Intent intent, String str) {
        if (intent != null) {
            return m14978o(intent.getExtras(), "ProxyBillingActivity");
        }
        m14974k("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m14965b(Bundle bundle, String str) {
        if (bundle == null) {
            m14974k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m14973j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m14974k(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m14966c(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m14967d(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        Bundle bundle = new Bundle();
        m14966c(bundle, str, j);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static C0875d m14968e(Intent intent, String str) {
        if (intent != null) {
            C0875d.a aVarM4972c = C0875d.m4972c();
            aVarM4972c.m4979c(m14965b(intent.getExtras(), str));
            aVarM4972c.m4978b(m14970g(intent.getExtras(), str));
            return aVarM4972c.m4977a();
        }
        m14974k("BillingHelper", "Got null intent!");
        C0875d.a aVarM4972c2 = C0875d.m4972c();
        aVarM4972c2.m4979c(6);
        aVarM4972c2.m4978b("An internal error occurred.");
        return aVarM4972c2.m4977a();
    }

    /* JADX INFO: renamed from: f */
    public static frm m14969f(Bundle bundle, String str) {
        return bundle == null ? new frm(0, null) : new frm(m14978o(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    /* JADX INFO: renamed from: g */
    public static String m14970g(Bundle bundle, String str) {
        if (bundle == null) {
            m14974k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m14973j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m14974k(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: h */
    public static String m14971h(int i) {
        return zzd.zza(i).toString();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static List m14972i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM14979p = m14979p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM14979p == null) {
                m14973j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseM14979p);
            return arrayList;
        }
        m14973j("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            Purchase purchaseM14979p2 = m14979p(stringArrayList.get(i), stringArrayList2.get(i));
            if (purchaseM14979p2 != null) {
                arrayList.add(purchaseM14979p2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m14973j(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m14974k(String str, String str2) {
        Log.isLoggable(str, 5);
    }

    /* JADX INFO: renamed from: l */
    public static void m14975l(String str, String str2, @Nullable Throwable th) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m14976m(C0875d c0875d, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c0875d.m4976b());
        bundle.putString("DEBUG_MESSAGE", c0875d.m4975a());
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public static Bundle m14977n(C0875d c0875d, int i, @Nullable String str) {
        Bundle bundleM14976m = m14976m(c0875d, 5);
        if (str != null) {
            bundleM14976m.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleM14976m;
    }

    /* JADX INFO: renamed from: o */
    public static int m14978o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m14974k(str, "Unexpected null bundle received!");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static Purchase m14979p(String str, String str2) {
        if (str == null || str2 == null) {
            m14973j("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m14974k("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
