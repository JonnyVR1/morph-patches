package com.p000p1.mobile.putong.core.data;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.bqd0;
import l.fpd0;
import p003l.w5m0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VisitorsFilterSavedSettings extends bqd0<VisitorFilterSettings> {
    public VisitorsFilterSavedSettings(String str, boolean z, String str2) {
        super(str, (Object) null, z, str2);
    }

    /* JADX INFO: renamed from: retrieveValue, reason: merged with bridge method [inline-methods] */
    public VisitorFilterSettings m16256retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string == null) {
            return w5m0.m10438a();
        }
        try {
            return (VisitorFilterSettings) VisitorFilterSettings.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.c(e);
            return w5m0.m10438a();
        }
    }

    public SharedPreferences.Editor saveValue(VisitorFilterSettings visitorFilterSettings) {
        return pref().edit().putString(((fpd0) this).id, visitorFilterSettings.toJson());
    }

    public boolean checkEquals(@NonNull VisitorFilterSettings visitorFilterSettings, VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings.equals(visitorFilterSettings2);
    }

    public VisitorFilterSettings copyed(VisitorFilterSettings visitorFilterSettings, @NonNull VisitorFilterSettings visitorFilterSettings2) {
        return visitorFilterSettings2.m16239clone();
    }
}
