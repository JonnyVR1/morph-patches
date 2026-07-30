package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.C2426p;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.android.billingclient.api.m0 */
/* JADX INFO: loaded from: classes.dex */
final class C0894m0 {
    /* JADX INFO: renamed from: a */
    public static C0892l0 m5061a(Bundle bundle, String str, String str2) {
        C0875d c0875d = C0884h0.f4044k;
        if (bundle == null) {
            C2426p.m14974k("BillingClient", String.format("%s got null owned items list", str2));
            return new C0892l0(c0875d, 54);
        }
        int iM14965b = C2426p.m14965b(bundle, "BillingClient");
        String strM14970g = C2426p.m14970g(bundle, "BillingClient");
        C0875d.a aVarM4972c = C0875d.m4972c();
        aVarM4972c.m4979c(iM14965b);
        aVarM4972c.m4978b(strM14970g);
        C0875d c0875dM4977a = aVarM4972c.m4977a();
        if (iM14965b != 0) {
            C2426p.m14974k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iM14965b)));
            return new C0892l0(c0875dM4977a, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            C2426p.m14974k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new C0892l0(c0875d, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            C2426p.m14974k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new C0892l0(c0875d, 56);
        }
        if (stringArrayList2 == null) {
            C2426p.m14974k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new C0892l0(c0875d, 57);
        }
        if (stringArrayList3 != null) {
            return new C0892l0(C0884h0.f4045l, 1);
        }
        C2426p.m14974k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new C0892l0(c0875d, 58);
    }
}
