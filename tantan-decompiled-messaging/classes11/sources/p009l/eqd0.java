package p009l;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.UserFakeSettings;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.UserPushSettings;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.bqd0;
import l.fpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class eqd0 extends bqd0<SettingGroups> {
    public eqd0(String str, boolean z, String str2) {
        super(str, (Object) null, z, str2);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NonNull SettingGroups settingGroups, SettingGroups settingGroups2) {
        return settingGroups.equals(settingGroups2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SettingGroups copyed(SettingGroups settingGroups, @NonNull SettingGroups settingGroups2) {
        return settingGroups2.clone();
    }

    /* JADX INFO: renamed from: c */
    public final SettingGroups m14095c() {
        SettingGroups settingGroupsNew_ = SettingGroups.new_();
        UserFakeSettings userFakeSettings = settingGroupsNew_.fake;
        Boolean bool = Boolean.TRUE;
        userFakeSettings.momentPush = bool;
        UserPushSettings userPushSettings = settingGroupsNew_.push;
        userPushSettings.superLikePush = bool;
        userPushSettings.messagePush = bool;
        userPushSettings.newMatchPush = bool;
        userPushSettings.previewMessage = bool;
        userFakeSettings.weeklyReportPush = bool;
        userFakeSettings.dailyReportPush = bool;
        userPushSettings.officialPush = bool;
        userFakeSettings.syncMoment = bool;
        UserLiveSettings userLiveSettings = settingGroupsNew_.live;
        Boolean bool2 = Boolean.FALSE;
        userLiveSettings.closeSmallWindow = bool2;
        settingGroupsNew_.privacy.hideVIP = bool2;
        settingGroupsNew_.subscription.refuseSMS = bool2;
        return settingGroupsNew_;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SettingGroups retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string == null) {
            return m14095c();
        }
        try {
            return (SettingGroups) SettingGroups.JSON_ADAPTER.parse(string);
        } catch (IOException e) {
            CrashHelper.c(e);
            return m14095c();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(SettingGroups settingGroups) {
        return pref().edit().putString(((fpd0) this).id, settingGroups.toJson());
    }
}
