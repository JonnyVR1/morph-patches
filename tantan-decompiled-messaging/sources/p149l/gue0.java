package p149l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.StateGuide;

/* JADX INFO: loaded from: classes12.dex */
public class gue0 extends AbstractC18619n4 {

    /* JADX INFO: renamed from: b */
    public StateGuide f104390b;

    public gue0() {
        this.f104390b = null;
        String str = sti.f166364h.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f104390b = (StateGuide) JSON.parseObject(str, StateGuide.class);
    }

    @Override // p149l.hsl
    /* JADX INFO: renamed from: a */
    public boolean mo128028a(Act act, String str, isl islVar) {
        boolean zM128029e = m128029e();
        if (zM128029e) {
            StateGuide stateGuide = this.f104390b;
            kyg.m147874i(act, stateGuide.title, str, stateGuide.defaultEmotionIndex, null, null, this);
        }
        return zM128029e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m128029e() {
        StateGuide stateGuide = this.f104390b;
        if (stateGuide == null || vqg.f182637a <= stateGuide.swipeMomentCount || FeedModule.f38855d.m209293I7() != null || mqi0.m155929D(sti.f166365i.get().longValue()) || w980.m202252h().m202261n()) {
            return false;
        }
        String str = this.f104390b.gender;
        User userMe_ = FeedModule.m60222H().me_();
        if (!TextUtils.equals(str, "both") && (userMe_ == null || !TEnum.equals(userMe_.gender, str))) {
            return false;
        }
        if (sti.f166366j.get().intValue() < this.f104390b.unClickCount) {
            return true;
        }
        if (a5i.m95026b(mqi0.m155944o(), sti.f166367k.get().longValue()) <= this.f104390b.guideShowInterval) {
            return false;
        }
        sti.f166366j.put(0);
        return true;
    }
}
