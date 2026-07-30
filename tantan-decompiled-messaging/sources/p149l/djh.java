package p149l;

import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes12.dex */
public class djh {

    /* JADX INFO: renamed from: a */
    public static zpd0 f86538a = new zpd0("last_timestamp_show_personalize_suggest_guide_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f86539b = new tpd0("show_personalize_suggest_guide_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m112036a() {
        if (a5i.m95038n(f86538a.get().longValue())) {
            return false;
        }
        if (a5i.m95037m(f86538a.get().longValue())) {
            if (f86539b.get().intValue() >= 3) {
                return false;
            }
            if (!m112037b()) {
                f86538a.put(Long.valueOf(mqi0.m155944o()));
                f86539b.put(Integer.valueOf(f86539b.get().intValue() + 1));
                return true;
            }
        }
        if (m112037b()) {
            return false;
        }
        f86538a.put(Long.valueOf(mqi0.m155944o()));
        f86539b.put(1);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m112037b() {
        Settings settings;
        User userMe_ = FeedModule.m60222H().me_();
        if (userMe_ == null || (settings = userMe_.settings) == null || settings.settingGroups == null) {
            return false;
        }
        return settings.getSettingGroup().privacy.personalizeSuggest.booleanValue();
    }
}
