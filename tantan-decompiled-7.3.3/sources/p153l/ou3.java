package p153l;

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
public class ou3 {

    /* JADX INFO: renamed from: a */
    final HashMap<String, CleverTapDisplayUnit> f149049a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public synchronized void m169218a() {
        this.f149049a.clear();
        Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Cleared Display Units Cache");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized ArrayList<CleverTapDisplayUnit> m169219b(JSONArray jSONArray) {
        try {
            m169218a();
            if (jSONArray == null || jSONArray.length() <= 0) {
                Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Null json array response can't parse Display Units ");
                return null;
            }
            ArrayList<CleverTapDisplayUnit> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    CleverTapDisplayUnit cleverTapDisplayUnitM6053d = CleverTapDisplayUnit.m6053d((JSONObject) jSONArray.get(i));
                    if (TextUtils.isEmpty(cleverTapDisplayUnitM6053d.m6054a())) {
                        this.f149049a.put(cleverTapDisplayUnitM6053d.m6056c(), cleverTapDisplayUnitM6053d);
                        arrayList.add(cleverTapDisplayUnitM6053d);
                    } else {
                        Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Failed to convert JsonArray item at index:" + i + " to Display Unit");
                    }
                } catch (Exception e) {
                    Logger.m5920d(Constants.FEATURE_DISPLAY_UNIT, "Failed while parsing Display Unit:" + e.getLocalizedMessage());
                    return null;
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }
}
