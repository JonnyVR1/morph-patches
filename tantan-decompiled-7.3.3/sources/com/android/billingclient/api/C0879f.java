package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.wg3;

/* JADX INFO: renamed from: com.android.billingclient.api.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0879f {

    /* JADX INFO: renamed from: a */
    private final String f3985a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f3986b;

    /* JADX INFO: renamed from: c */
    private final String f3987c;

    /* JADX INFO: renamed from: d */
    private final String f3988d;

    /* JADX INFO: renamed from: e */
    private final String f3989e;

    /* JADX INFO: renamed from: f */
    private final String f3990f;

    /* JADX INFO: renamed from: g */
    private final String f3991g;

    /* JADX INFO: renamed from: h */
    private final String f3992h;

    /* JADX INFO: renamed from: i */
    @Nullable
    private final String f3993i;

    /* JADX INFO: renamed from: j */
    @Nullable
    private final List f3994j;

    /* JADX INFO: renamed from: k */
    @Nullable
    private final List f3995k;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f3996a;

        /* JADX INFO: renamed from: b */
        private final int f3997b;

        public a(JSONObject jSONObject) throws JSONException {
            this.f3996a = jSONObject.getInt("commitmentPaymentsCount");
            this.f3997b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f3998a;

        /* JADX INFO: renamed from: b */
        private final long f3999b;

        /* JADX INFO: renamed from: c */
        private final String f4000c;

        /* JADX INFO: renamed from: d */
        @Nullable
        private final String f4001d;

        /* JADX INFO: renamed from: e */
        @Nullable
        private final String f4002e;

        /* JADX INFO: renamed from: f */
        @Nullable
        private final C0890k0 f4003f;

        public b(JSONObject jSONObject) throws JSONException {
            this.f3998a = jSONObject.optString("formattedPrice");
            this.f3999b = jSONObject.optLong("priceAmountMicros");
            this.f4000c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f4001d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f4002e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f4003f = jSONObjectOptJSONObject6 != null ? new C0890k0(jSONObjectOptJSONObject6) : null;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m5018a() {
            return this.f3998a;
        }

        /* JADX INFO: renamed from: b */
        public long m5019b() {
            return this.f3999b;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public String m5020c() {
            return this.f4000c;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final C0890k0 m5021d() {
            return this.f4003f;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final String m5022e() {
            return this.f4001d;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final String m5023f() {
            return this.f4002e;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f4004a;

        /* JADX INFO: renamed from: b */
        private final long f4005b;

        /* JADX INFO: renamed from: c */
        private final String f4006c;

        /* JADX INFO: renamed from: d */
        private final String f4007d;

        /* JADX INFO: renamed from: e */
        private final int f4008e;

        /* JADX INFO: renamed from: f */
        private final int f4009f;

        public c(JSONObject jSONObject) {
            this.f4007d = jSONObject.optString("billingPeriod");
            this.f4006c = jSONObject.optString("priceCurrencyCode");
            this.f4004a = jSONObject.optString("formattedPrice");
            this.f4005b = jSONObject.optLong("priceAmountMicros");
            this.f4009f = jSONObject.optInt("recurrenceMode");
            this.f4008e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m5024a() {
            return this.f4004a;
        }

        /* JADX INFO: renamed from: b */
        public long m5025b() {
            return this.f4005b;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public String m5026c() {
            return this.f4006c;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final List f4010a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f4010a = arrayList;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public List<c> m5027a() {
            return this.f4010a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        private final String f4011a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private final String f4012b;

        /* JADX INFO: renamed from: c */
        private final String f4013c;

        /* JADX INFO: renamed from: d */
        private final d f4014d;

        /* JADX INFO: renamed from: e */
        private final List f4015e;

        /* JADX INFO: renamed from: f */
        @Nullable
        private final a f4016f;

        public e(JSONObject jSONObject) throws JSONException {
            this.f4011a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f4012b = true == strOptString.isEmpty() ? null : strOptString;
            this.f4013c = jSONObject.getString("offerIdToken");
            this.f4014d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f4016f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.f4015e = arrayList;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m5028a() {
            return this.f4011a;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public String m5029b() {
            return this.f4012b;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public String m5030c() {
            return this.f4013c;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public d m5031d() {
            return this.f4014d;
        }
    }

    public C0879f(String str) throws JSONException {
        this.f3985a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3986b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f3987c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f3988d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            wg3.m206174a("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            wg3.m206174a("Product type cannot be empty.");
            throw null;
        }
        this.f3989e = jSONObject.optString("title");
        this.f3990f = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.f3991g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f3992h = jSONObject.optString("skuDetailsToken");
        this.f3993i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f3994j = arrayList;
        } else {
            this.f3994j = (strOptString2.equals(SubSampleInformationBox.TYPE) || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f3986b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f3986b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f3995k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f3995k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f3995k = arrayList2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m5008a() {
        return this.f3991g;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public b m5009b() {
        List list = this.f3995k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f3995k.get(0);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m5010c() {
        return this.f3987c;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m5011d() {
        return this.f3988d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public List<e> m5012e() {
        return this.f3994j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0879f) {
            return TextUtils.equals(this.f3985a, ((C0879f) obj).f3985a);
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public String m5013f() {
        return this.f3989e;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final String m5014g() {
        return this.f3986b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    /* JADX INFO: renamed from: h */
    public final String m5015h() {
        return this.f3992h;
    }

    public int hashCode() {
        return this.f3985a.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public String m5016i() {
        return this.f3993i;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final List m5017j() {
        return this.f3995k;
    }

    @NonNull
    public String toString() {
        List list = this.f3994j;
        return "ProductDetails{jsonString='" + this.f3985a + "', parsedJson=" + this.f3986b.toString() + ", productId='" + this.f3987c + "', productType='" + this.f3988d + "', title='" + this.f3989e + "', productDetailsToken='" + this.f3992h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
