package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class jl8 {

    /* JADX INFO: renamed from: a */
    public boolean f121484a;

    /* JADX INFO: renamed from: b */
    public wyd0 f121485b = new wyd0("lastNewMainTab_" + FeedModule.m61405F().userId(), "");

    /* JADX INFO: renamed from: c */
    public byd0 f121486c = new byd0("lastDotShowTime_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public boolean m145953a() {
        if (this.f121484a) {
            return false;
        }
        if (cmg.m111241w()) {
            return TabName.Moment.toString().equals(this.f121485b.get());
        }
        return cmg.m111239v() || cmg.m111237u();
    }

    /* JADX INFO: renamed from: b */
    public void m145954b(Act act, String str, boolean z) {
        if (str == null) {
            return;
        }
        if ((cmg.m111239v() || cmg.m111241w()) && !this.f121484a) {
            TabName tabName = TabName.Card;
            if (!tabName.toString().equals(str) && m145956d() && !pzi0.m174439D(this.f121486c.get().longValue())) {
                FeedModule.m61406H().setTabDot(act, tabName, true);
                this.f121486c.put(Long.valueOf(pzi0.m174454o()));
            }
        }
        this.f121484a = true;
        this.f121485b.put(str);
        if (cmg.m111233s()) {
            t8c.m189652e().m189657f(str, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m145955c() {
        this.f121484a = false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m145956d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("default_explore_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getJSONObject("functionSetting").getBoolean(BLiveUnreadTypeEnum.redDot);
        } catch (Exception unused) {
            return false;
        }
    }
}
