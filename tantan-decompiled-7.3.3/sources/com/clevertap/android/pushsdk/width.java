package com.clevertap.android.pushsdk;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class width {
    public static String openContextMenu(Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
