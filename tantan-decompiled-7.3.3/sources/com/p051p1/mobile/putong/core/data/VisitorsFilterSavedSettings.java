package com.p051p1.mobile.putong.core.data;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p153l.afm0;
import p153l.dyd0;

/* JADX INFO: loaded from: classes10.dex */
public class VisitorsFilterSavedSettings extends dyd0<VisitorFilterSettings> {
    public VisitorsFilterSavedSettings(String str, boolean z, String str2) {
        super(str, null, z, str2);
    }

    @Override // p153l.hxd0
    public VisitorFilterSettings retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (string == null) {
            return afm0.m97510a();
        }
        try {
            return VisitorFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return afm0.m97510a();
        }
    }

    @Override // p153l.hxd0
    public SharedPreferences.Editor saveValue(VisitorFilterSettings visitorFilterSettings) {
        return pref().edit().putString(this.f111993id, visitorFilterSettings.toJson());
    }

    @Override // p153l.dyd0
    public boolean checkEquals(@NonNull VisitorFilterSettings visitorFilterSettings, VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings.equals(visitorFilterSettings2);
    }

    @Override // p153l.dyd0
    public VisitorFilterSettings copyed(VisitorFilterSettings visitorFilterSettings, @NonNull VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings2.mo225055clone();
    }
}
