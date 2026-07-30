package com.appsflyer.internal;

import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.jfd0;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1bSDK {

    @Nullable
    public final AFh1fSDK getCurrencyIso4217Code;

    @Nullable
    public AFi1zSDK getMediationNetwork;

    @Nullable
    public final AFh1cSDK getMonetizationNetwork;

    public AFh1bSDK(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getRevenue(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFi1zSDK AFAdRevenueData(JSONObject jSONObject) {
        Object objM223820constructorimpl;
        AFi1zSDK aFi1zSDK;
        List listEmptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt(Counter.TYPE);
                String strOptString = mediationNetwork.optString(Constants.PARAM_APP_VER, "");
                String strOptString2 = mediationNetwork.optString(Constants.PARAM_SDK_VER, "");
                float fOptDouble = (float) mediationNetwork.optDouble(OMSSizeType.ratio, 1.0d);
                JSONArray jSONArrayOptJSONArray = mediationNetwork.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    listEmptyList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArrayOptJSONArray.getString(i2);
                        string.getClass();
                        listEmptyList.add(string);
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List list = listEmptyList;
                strOptString.getClass();
                strOptString2.getClass();
                aFi1zSDK = new AFi1zSDK(j, fOptDouble, list, i, strOptString, strOptString2);
            } else {
                aFi1zSDK = null;
            }
            objM223820constructorimpl = Result.m223820constructorimpl(aFi1zSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return (AFi1zSDK) (Result.m223826isFailureimpl(objM223820constructorimpl) ? null : objM223820constructorimpl);
    }

    private static AFh1cSDK getMediationNetwork(JSONObject jSONObject) {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            objM223820constructorimpl = Result.m223820constructorimpl(mediationNetwork != null ? new AFh1cSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return (AFh1cSDK) (Result.m223826isFailureimpl(objM223820constructorimpl) ? null : objM223820constructorimpl);
    }

    private static AFh1fSDK getRevenue(JSONObject jSONObject) {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            objM223820constructorimpl = Result.m223820constructorimpl(mediationNetwork != null ? new AFh1fSDK(mediationNetwork.getString(Constants.PARAM_SDK_VER), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return (AFh1fSDK) (Result.m223826isFailureimpl(objM223820constructorimpl) ? null : objM223820constructorimpl);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m87488d(AFh1bSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            AFh1bSDK aFh1bSDK = (AFh1bSDK) obj;
            return Intrinsics.m87488d(this.getCurrencyIso4217Code, aFh1bSDK.getCurrencyIso4217Code) && Intrinsics.m87488d(this.getMonetizationNetwork, aFh1bSDK.getMonetizationNetwork) && Intrinsics.m87488d(this.getMediationNetwork, aFh1bSDK.getMediationNetwork);
        }
        jfd0.m141176a("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
        return false;
    }

    public final int hashCode() {
        AFh1fSDK aFh1fSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1fSDK != null ? aFh1fSDK.hashCode() : 0) * 31;
        AFh1cSDK aFh1cSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0)) * 31;
        AFi1zSDK aFi1zSDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
