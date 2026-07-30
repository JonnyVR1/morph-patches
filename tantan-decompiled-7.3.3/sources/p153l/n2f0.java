package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.StateGuide;

/* JADX INFO: loaded from: classes13.dex */
public class n2f0 extends AbstractC18534m4 {

    /* JADX INFO: renamed from: b */
    public StateGuide f139859b;

    public n2f0() {
        this.f139859b = null;
        String str = owi.f149489h.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f139859b = (StateGuide) JSON.parseObject(str, StateGuide.class);
    }

    @Override // p153l.vul
    /* JADX INFO: renamed from: a */
    public boolean mo137075a(Act act, String str, wul wulVar) {
        boolean zM161231e = m161231e();
        if (zM161231e) {
            StateGuide stateGuide = this.f139859b;
            zzg.m222257i(act, stateGuide.title, str, stateGuide.defaultEmotionIndex, null, null, this);
        }
        return zM161231e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m161231e() {
        StateGuide stateGuide = this.f139859b;
        if (stateGuide == null || ksg.f128560a <= stateGuide.swipeMomentCount || FeedModule.f39703d.m145534I7() != null || pzi0.m174439D(owi.f149490i.get().longValue()) || ci80.m109858h().m109867n()) {
            return false;
        }
        String str = this.f139859b.gender;
        User userMe_ = FeedModule.m61406H().me_();
        if (!TextUtils.equals(str, "both") && (userMe_ == null || !TEnum.equals(userMe_.gender, str))) {
            return false;
        }
        if (owi.f149491j.get().intValue() < this.f139859b.unClickCount) {
            return true;
        }
        if (p6i.m170893b(pzi0.m174454o(), owi.f149492k.get().longValue()) <= this.f139859b.guideShowInterval) {
            return false;
        }
        owi.f149491j.put(0);
        return true;
    }
}
