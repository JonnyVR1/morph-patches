package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.C2403p;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.android.billingclient.api.m0 */
/* JADX INFO: loaded from: classes.dex */
final class C0890m0 {
    /* JADX INFO: renamed from: a */
    public static C0888l0 m5051a(Bundle bundle, String str, String str2) {
        C0871d c0871d = C0880h0.f4044k;
        if (bundle == null) {
            C2403p.m14920k("BillingClient", String.format("%s got null owned items list", str2));
            return new C0888l0(c0871d, 54);
        }
        int iM14911b = C2403p.m14911b(bundle, "BillingClient");
        String strM14916g = C2403p.m14916g(bundle, "BillingClient");
        C0871d.a aVarM4962c = C0871d.m4962c();
        aVarM4962c.m4969c(iM14911b);
        aVarM4962c.m4968b(strM14916g);
        C0871d c0871dM4967a = aVarM4962c.m4967a();
        if (iM14911b != 0) {
            C2403p.m14920k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iM14911b)));
            return new C0888l0(c0871dM4967a, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            C2403p.m14920k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new C0888l0(c0871d, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            C2403p.m14920k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new C0888l0(c0871d, 56);
        }
        if (stringArrayList2 == null) {
            C2403p.m14920k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new C0888l0(c0871d, 57);
        }
        if (stringArrayList3 != null) {
            return new C0888l0(C0880h0.f4045l, 1);
        }
        C2403p.m14920k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new C0888l0(c0871d, 58);
    }
}
