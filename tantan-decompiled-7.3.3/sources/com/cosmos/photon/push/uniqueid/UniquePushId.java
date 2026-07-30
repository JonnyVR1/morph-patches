package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class UniquePushId {
    public String getPushId(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(SPKeyConstants.SP_UNIQUE_ID, 0);
                String string = sharedPreferences.getString(SPKeyConstants.SP_UNIQUE_PUSHID, "");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(SPKeyConstants.SP_UNIQUE_PUSHID, str);
                editorEdit.apply();
                return str;
            } catch (Exception unused) {
            }
        }
        return str;
    }
}
