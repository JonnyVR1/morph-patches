package p153l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.UserSubscriptionSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class zyd0 extends dyd0<UserSubscriptionSettings> {
    public zyd0(String str, UserSubscriptionSettings userSubscriptionSettings) {
        super(str, userSubscriptionSettings);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull UserSubscriptionSettings userSubscriptionSettings, UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings.equals(userSubscriptionSettings2);
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings copyed(UserSubscriptionSettings userSubscriptionSettings, @NonNull UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings2.mo225055clone();
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (string != null) {
            try {
                return UserSubscriptionSettings.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return null;
    }

    @Override // p153l.hxd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(UserSubscriptionSettings userSubscriptionSettings) {
        return pref().edit().putString(this.f111993id, userSubscriptionSettings.toJson());
    }
}
