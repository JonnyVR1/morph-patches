package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class pt3 {

    /* JADX INFO: renamed from: a */
    final HashMap<String, CleverTapDisplayUnit> f151111a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public synchronized void m171278a() {
        this.f151111a.clear();
        Logger.m5866d(Constants.FEATURE_DISPLAY_UNIT, "Cleared Display Units Cache");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized ArrayList<CleverTapDisplayUnit> m171279b(JSONArray jSONArray) {
        try {
            m171278a();
            if (jSONArray == null || jSONArray.length() <= 0) {
                Logger.m5866d(Constants.FEATURE_DISPLAY_UNIT, "Null json array response can't parse Display Units ");
                return null;
            }
            ArrayList<CleverTapDisplayUnit> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    CleverTapDisplayUnit cleverTapDisplayUnitM5999d = CleverTapDisplayUnit.m5999d((JSONObject) jSONArray.get(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitM5999d.m6000a())) {
                        this.f151111a.put(cleverTapDisplayUnitM5999d.m6002c(), cleverTapDisplayUnitM5999d);
                        arrayList.add(cleverTapDisplayUnitM5999d);
                    } else {
                        Logger.m5866d(Constants.FEATURE_DISPLAY_UNIT, "Failed to convert JsonArray item at index:" + i + " to Display Unit");
                    }
                } catch (Exception e) {
                    Logger.m5866d(Constants.FEATURE_DISPLAY_UNIT, "Failed while parsing Display Unit:" + e.getLocalizedMessage());
                    return null;
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }
}
