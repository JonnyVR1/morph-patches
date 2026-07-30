package p007l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.LookingFor;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.StateGuide;
import com.p1.mobile.android.app.Act;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gue0 extends AbstractC2433n4 {

    /* JADX INFO: renamed from: b */
    public StateGuide f8516b;

    public gue0() {
        this.f8516b = null;
        String str = (String) sti.f13082h.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8516b = (StateGuide) JSON.parseObject(str, StateGuide.class);
    }

    @Override // p007l.hsl
    /* JADX INFO: renamed from: a */
    public boolean mo10498a(Act act, String str, isl islVar) {
        boolean zM10499e = m10499e();
        if (zM10499e) {
            StateGuide stateGuide = this.f8516b;
            kyg.m11540i(act, stateGuide.title, str, stateGuide.defaultEmotionIndex, null, null, this);
        }
        return zM10499e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10499e() {
        StateGuide stateGuide = this.f8516b;
        if (stateGuide == null || vqg.f14268a <= stateGuide.swipeMomentCount || FeedModule.f316d.m16474I7() != null || mqi0.D(((Long) sti.f13083i.get()).longValue()) || w980.m15748h().m15757n()) {
            return false;
        }
        String str = this.f8516b.gender;
        User userMe_ = FeedModule.m1140H().me_();
        if (!TextUtils.equals(str, LookingFor.both) && (userMe_ == null || !TEnum.equals(userMe_.gender, str))) {
            return false;
        }
        if (((Integer) sti.f13084j.get()).intValue() < this.f8516b.unClickCount) {
            return true;
        }
        if (a5i.m8402b(mqi0.o(), ((Long) sti.f13085k.get()).longValue()) <= this.f8516b.guideShowInterval) {
            return false;
        }
        sti.f13084j.put(0);
        return true;
    }
}
