package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class fk8 {

    /* JADX INFO: renamed from: a */
    public boolean f98045a;

    /* JADX INFO: renamed from: b */
    public uqd0 f98046b = new uqd0("lastNewMainTab_" + FeedModule.m60221F().userId(), "");

    /* JADX INFO: renamed from: c */
    public zpd0 f98047c = new zpd0("lastDotShowTime_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public boolean m121845a() {
        if (this.f98045a) {
            return false;
        }
        if (nkg.m159912w()) {
            return TabName.Moment.toString().equals(this.f98046b.get());
        }
        return nkg.m159910v() || nkg.m159908u();
    }

    /* JADX INFO: renamed from: b */
    public void m121846b(Act act, String str, boolean z) {
        if (str == null) {
            return;
        }
        if ((nkg.m159910v() || nkg.m159912w()) && !this.f98045a) {
            TabName tabName = TabName.Card;
            if (!tabName.toString().equals(str) && m121848d() && !mqi0.m155929D(this.f98047c.get().longValue())) {
                FeedModule.m60222H().setTabDot(act, tabName, true);
                this.f98047c.put(Long.valueOf(mqi0.m155944o()));
            }
        }
        this.f98045a = true;
        this.f98046b.put(str);
        if (nkg.m159904s()) {
            n7c.m158118e().m158123f(str, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m121847c() {
        this.f98045a = false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m121848d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("default_explore_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getJSONObject("functionSetting").getBoolean(BLiveUnreadTypeEnum.redDot);
        } catch (Exception unused) {
            return false;
        }
    }
}
