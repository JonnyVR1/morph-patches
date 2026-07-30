package com.p046p1.mobile.putong.core.data;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p149l.bqd0;
import p149l.w5m0;

/* JADX INFO: loaded from: classes10.dex */
public class VisitorsFilterSavedSettings extends bqd0<VisitorFilterSettings> {
    public VisitorsFilterSavedSettings(String str, boolean z, String str2) {
        super(str, null, z, str2);
    }

    @Override // p149l.fpd0
    public VisitorFilterSettings retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (string == null) {
            return w5m0.m201647a();
        }
        try {
            return VisitorFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return w5m0.m201647a();
        }
    }

    @Override // p149l.fpd0
    public SharedPreferences.Editor saveValue(VisitorFilterSettings visitorFilterSettings) {
        return pref().edit().putString(this.f98687id, visitorFilterSettings.toJson());
    }

    @Override // p149l.bqd0
    public boolean checkEquals(@NonNull VisitorFilterSettings visitorFilterSettings, VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings.equals(visitorFilterSettings2);
    }

    @Override // p149l.bqd0
    public VisitorFilterSettings copyed(VisitorFilterSettings visitorFilterSettings, @NonNull VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings2.mo223809clone();
    }
}
