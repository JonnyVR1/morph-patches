package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s5r0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m182371a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return m182372b(context, str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static Bundle m182372b(Context context, String str) {
        JSONArray jSONArray;
        int i;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                x2t0.m206865c("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i = 1;
            } else if (iOptInt != 1) {
                i = iOptInt != 2 ? 0 : 3;
            } else {
                i = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i != 0) {
                List listM208619f = xfw0.m208616c(vew0.m198261b('/')).m208619f(strOptString2);
                if (listM208619f.size() > 2 || listM208619f.isEmpty()) {
                    obj = null;
                } else {
                    if (listM208619f.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listM208619f.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listM208619f.get(0), 0);
                        str2 = (String) listM208619f.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i3 = i - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static void m182373c(Context context) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            ecw0 ecw0VarM115755k = ecw0.m115755k(context);
            fcw0 fcw0VarM120480j = fcw0.m120480j(context);
            ecw0VarM115755k.m115758l();
            ecw0VarM115755k.m115759m();
            fcw0VarM120480j.m120482k();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132027P2)).booleanValue()) {
                fcw0VarM120480j.m120483l();
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132039Q2)).booleanValue()) {
                fcw0VarM120480j.m120484m();
            }
        } catch (IOException e) {
            vny0.m199079q().m212290w(e, "clearStorageOnIdlessMode");
        }
    }
}
