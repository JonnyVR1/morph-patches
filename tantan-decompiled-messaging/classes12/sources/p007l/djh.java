package p007l;

import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import l.mqi0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class djh {

    /* JADX INFO: renamed from: a */
    public static zpd0 f6964a = new zpd0("last_timestamp_show_personalize_suggest_guide_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f6965b = new tpd0("show_personalize_suggest_guide_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m9419a() {
        if (a5i.m8414n(((Long) f6964a.get()).longValue())) {
            return false;
        }
        if (a5i.m8413m(((Long) f6964a.get()).longValue())) {
            if (((Integer) f6965b.get()).intValue() >= 3) {
                return false;
            }
            if (!m9420b()) {
                f6964a.put(Long.valueOf(mqi0.o()));
                f6965b.put(Integer.valueOf(((Integer) f6965b.get()).intValue() + 1));
                return true;
            }
        }
        if (m9420b()) {
            return false;
        }
        f6964a.put(Long.valueOf(mqi0.o()));
        f6965b.put(1);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9420b() {
        Settings settings;
        User userMe_ = FeedModule.m1140H().me_();
        if (userMe_ == null || (settings = userMe_.settings) == null || settings.settingGroups == null) {
            return false;
        }
        return settings.getSettingGroup().privacy.personalizeSuggest.booleanValue();
    }
}
