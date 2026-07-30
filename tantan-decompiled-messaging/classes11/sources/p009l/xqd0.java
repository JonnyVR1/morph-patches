package p009l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xqd0 extends bqd0<UserSubscriptionSettings> {
    public xqd0(String str, UserSubscriptionSettings userSubscriptionSettings) {
        super(str, userSubscriptionSettings);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull UserSubscriptionSettings userSubscriptionSettings, UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings.equals(userSubscriptionSettings2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings copyed(UserSubscriptionSettings userSubscriptionSettings, @NonNull UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings2.clone();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string != null) {
            try {
                return (UserSubscriptionSettings) UserSubscriptionSettings.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(UserSubscriptionSettings userSubscriptionSettings) {
        return pref().edit().putString(((fpd0) this).id, userSubscriptionSettings.toJson());
    }
}
