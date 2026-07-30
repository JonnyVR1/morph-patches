package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.Purchase;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p149l.dpm;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C2403p {

    /* JADX INFO: renamed from: a */
    public static final int f10369a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m14910a(Intent intent, String str) {
        if (intent != null) {
            return m14924o(intent.getExtras(), "ProxyBillingActivity");
        }
        m14920k("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m14911b(Bundle bundle, String str) {
        if (bundle == null) {
            m14920k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m14919j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m14920k(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m14912c(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m14913d(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        Bundle bundle = new Bundle();
        m14912c(bundle, str, j);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static C0871d m14914e(Intent intent, String str) {
        if (intent != null) {
            C0871d.a aVarM4962c = C0871d.m4962c();
            aVarM4962c.m4969c(m14911b(intent.getExtras(), str));
            aVarM4962c.m4968b(m14916g(intent.getExtras(), str));
            return aVarM4962c.m4967a();
        }
        m14920k("BillingHelper", "Got null intent!");
        C0871d.a aVarM4962c2 = C0871d.m4962c();
        aVarM4962c2.m4969c(6);
        aVarM4962c2.m4968b("An internal error occurred.");
        return aVarM4962c2.m4967a();
    }

    /* JADX INFO: renamed from: f */
    public static dpm m14915f(Bundle bundle, String str) {
        return bundle == null ? new dpm(0, null) : new dpm(m14924o(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    /* JADX INFO: renamed from: g */
    public static String m14916g(Bundle bundle, String str) {
        if (bundle == null) {
            m14920k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m14919j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m14920k(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: h */
    public static String m14917h(int i) {
        return zzd.zza(i).toString();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static List m14918i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM14925p = m14925p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM14925p == null) {
                m14919j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseM14925p);
            return arrayList;
        }
        m14919j("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            Purchase purchaseM14925p2 = m14925p(stringArrayList.get(i), stringArrayList2.get(i));
            if (purchaseM14925p2 != null) {
                arrayList.add(purchaseM14925p2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m14919j(String str, String str2) {
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
    public static void m14920k(String str, String str2) {
        Log.isLoggable(str, 5);
    }

    /* JADX INFO: renamed from: l */
    public static void m14921l(String str, String str2, @Nullable Throwable th) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m14922m(C0871d c0871d, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c0871d.m4966b());
        bundle.putString("DEBUG_MESSAGE", c0871d.m4965a());
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public static Bundle m14923n(C0871d c0871d, int i, @Nullable String str) {
        Bundle bundleM14922m = m14922m(c0871d, 5);
        if (str != null) {
            bundleM14922m.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleM14922m;
    }

    /* JADX INFO: renamed from: o */
    public static int m14924o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m14920k(str, "Unexpected null bundle received!");
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static Purchase m14925p(String str, String str2) {
        if (str == null || str2 == null) {
            m14919j("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m14920k("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
