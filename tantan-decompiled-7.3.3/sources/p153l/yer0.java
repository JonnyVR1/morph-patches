package p153l;

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
public final class yer0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m215442a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return m215443b(context, str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static Bundle m215443b(Context context, String str) {
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
                dct0.m115294c("JSON parsing error", e);
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
                List listM117430f = dpw0.m117427c(bow0.m105711b('/')).m117430f(strOptString2);
                if (listM117430f.size() > 2 || listM117430f.isEmpty()) {
                    obj = null;
                } else {
                    if (listM117430f.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listM117430f.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listM117430f.get(0), 0);
                        str2 = (String) listM117430f.get(1);
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
    public static void m215444c(Context context) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            klw0 klw0VarM150399k = klw0.m150399k(context);
            llw0 llw0VarM154791j = llw0.m154791j(context);
            klw0VarM150399k.m150402l();
            klw0VarM150399k.m150403m();
            llw0VarM154791j.m154793k();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168098P2)).booleanValue()) {
                llw0VarM154791j.m154794l();
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168110Q2)).booleanValue()) {
                llw0VarM154791j.m154795m();
            }
        } catch (IOException e) {
            bxy0.m106933q().m120275w(e, "clearStorageOnIdlessMode");
        }
    }
}
