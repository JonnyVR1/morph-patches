package p153l;

import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class skh {

    /* JADX INFO: renamed from: a */
    public static byd0 f169283a = new byd0("last_timestamp_show_personalize_suggest_guide_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static vxd0 f169284b = new vxd0("show_personalize_suggest_guide_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m186449a() {
        if (p6i.m170905n(f169283a.get().longValue())) {
            return false;
        }
        if (p6i.m170904m(f169283a.get().longValue())) {
            if (f169284b.get().intValue() >= 3) {
                return false;
            }
            if (!m186450b()) {
                f169283a.put(Long.valueOf(pzi0.m174454o()));
                f169284b.put(Integer.valueOf(f169284b.get().intValue() + 1));
                return true;
            }
        }
        if (m186450b()) {
            return false;
        }
        f169283a.put(Long.valueOf(pzi0.m174454o()));
        f169284b.put(1);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m186450b() {
        Settings settings;
        User userMe_ = FeedModule.m61406H().me_();
        if (userMe_ == null || (settings = userMe_.settings) == null || settings.settingGroups == null) {
            return false;
        }
        return settings.getSettingGroup().privacy.personalizeSuggest.booleanValue();
    }
}
