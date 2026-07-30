package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a */
    private final String f3899a;

    /* JADX INFO: renamed from: b */
    private final String f3900b;

    /* JADX INFO: renamed from: c */
    private final JSONObject f3901c;

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f3899a = str;
        this.f3900b = str2;
        this.f3901c = new JSONObject(str);
    }

    /* JADX INFO: renamed from: g */
    private final ArrayList m4817g() {
        ArrayList arrayList = new ArrayList();
        boolean zHas = this.f3901c.has("productIds");
        JSONObject jSONObject = this.f3901c;
        if (zHas) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(this.f3901c.optString("productId"));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m4818a() {
        String strOptString = this.f3901c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m4819b() {
        return this.f3899a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public List<String> m4820c() {
        return m4817g();
    }

    /* JADX INFO: renamed from: d */
    public int m4821d() {
        return this.f3901c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m4822e() {
        JSONObject jSONObject = this.f3901c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3899a, purchase.m4819b()) && TextUtils.equals(this.f3900b, purchase.m4823f());
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public String m4823f() {
        return this.f3900b;
    }

    public int hashCode() {
        return this.f3899a.hashCode();
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3899a));
    }
}
