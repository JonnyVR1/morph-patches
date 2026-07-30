package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a */
    private final String f3902a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f3903b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m4824a() {
        return this.f3903b.optString("productId");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m4825b() {
        return this.f3903b.optString("type");
    }

    /* JADX INFO: renamed from: c */
    public int m4826c() {
        return this.f3903b.optInt("offer_type");
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m4827d() {
        return this.f3903b.optString("offer_id");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m4828e() {
        String strOptString = this.f3903b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f3903b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f3902a, ((SkuDetails) obj).f3902a);
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final String m4829f() {
        return this.f3903b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m4830g() {
        return this.f3903b.optString("serializedDocid");
    }

    /* JADX INFO: renamed from: h */
    public final String m4831h() {
        return this.f3903b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f3902a.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f3902a));
    }
}
