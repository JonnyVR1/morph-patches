package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import l.mqi0;
import l.uqd0;
import l.zpd0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fk8 {

    /* JADX INFO: renamed from: a */
    public boolean f8121a;

    /* JADX INFO: renamed from: b */
    public uqd0 f8122b = new uqd0("lastNewMainTab_" + FeedModule.m1139F().userId(), "");

    /* JADX INFO: renamed from: c */
    public zpd0 f8123c = new zpd0("lastDotShowTime_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public boolean m10115a() {
        if (this.f8121a) {
            return false;
        }
        if (nkg.m12271w()) {
            return TabName.Moment.toString().equals(this.f8122b.get());
        }
        return nkg.m12269v() || nkg.m12267u();
    }

    /* JADX INFO: renamed from: b */
    public void m10116b(Act act, String str, boolean z) {
        if (str == null) {
            return;
        }
        if ((nkg.m12269v() || nkg.m12271w()) && !this.f8121a) {
            TabName tabName = TabName.Card;
            if (!tabName.toString().equals(str) && m10118d() && !mqi0.D(((Long) this.f8123c.get()).longValue())) {
                FeedModule.m1140H().setTabDot(act, tabName, true);
                this.f8123c.put(Long.valueOf(mqi0.o()));
            }
        }
        this.f8121a = true;
        this.f8122b.put(str);
        if (nkg.m12263s()) {
            n7c.m12098e().m12103f(str, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10117c() {
        this.f8121a = false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10118d() {
        try {
            String strF = RemoteConfig.x().F("default_explore_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getJSONObject("functionSetting").getBoolean("redDot");
        } catch (Exception unused) {
            return false;
        }
    }
}
