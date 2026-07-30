package p149l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.UserSubscriptionSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class xqd0 extends bqd0<UserSubscriptionSettings> {
    public xqd0(String str, UserSubscriptionSettings userSubscriptionSettings) {
        super(str, userSubscriptionSettings);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull UserSubscriptionSettings userSubscriptionSettings, UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings.equals(userSubscriptionSettings2);
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings copyed(UserSubscriptionSettings userSubscriptionSettings, @NonNull UserSubscriptionSettings userSubscriptionSettings2) {
        return userSubscriptionSettings2.mo223809clone();
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public UserSubscriptionSettings retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (string != null) {
            try {
                return UserSubscriptionSettings.JSON_ADAPTER.parse(string);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        return null;
    }

    @Override // p149l.fpd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(UserSubscriptionSettings userSubscriptionSettings) {
        return pref().edit().putString(this.f98687id, userSubscriptionSettings.toJson());
    }
}
