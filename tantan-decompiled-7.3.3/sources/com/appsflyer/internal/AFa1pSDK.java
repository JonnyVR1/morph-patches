package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1pSDK {
    public static Map<String, Object> AFAdRevenueData(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objAFAdRevenueData = jSONObject.get(next);
            if (objAFAdRevenueData instanceof JSONArray) {
                objAFAdRevenueData = getCurrencyIso4217Code((JSONArray) objAFAdRevenueData);
            } else if (objAFAdRevenueData instanceof JSONObject) {
                objAFAdRevenueData = AFAdRevenueData((JSONObject) objAFAdRevenueData);
            }
            map.put(next, objAFAdRevenueData);
        }
        return map;
    }

    private static List<Object> getCurrencyIso4217Code(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objAFAdRevenueData = jSONArray.get(i);
            if (objAFAdRevenueData instanceof JSONArray) {
                objAFAdRevenueData = getCurrencyIso4217Code((JSONArray) objAFAdRevenueData);
            } else if (objAFAdRevenueData instanceof JSONObject) {
                objAFAdRevenueData = AFAdRevenueData((JSONObject) objAFAdRevenueData);
            }
            arrayList.add(objAFAdRevenueData);
        }
        return arrayList;
    }

    @Nullable
    public static JSONObject getMediationNetwork(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static AFh1uSDK getMonetizationNetwork(Context context) {
        if (context instanceof Activity) {
            return AFh1uSDK.activity;
        }
        return context instanceof Application ? AFh1uSDK.application : AFh1uSDK.other;
    }

    private static Object getRevenue(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getRevenue(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                if (obj instanceof Map) {
                    return getRevenue((Map<String, ?>) obj);
                }
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(getRevenue(Array.get(obj, i)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject getRevenue(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getRevenue(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
