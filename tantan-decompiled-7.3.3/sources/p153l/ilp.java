package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.VerificationLimit;

/* JADX INFO: loaded from: classes11.dex */
public class ilp extends ufp {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        CoreModule.m30933P().m143405a().mo34568pr(c19824a.f162788b.getAct(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.intl_advanced_filter);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        Counter counterM195852e = m195852e();
        VerificationLimit verificationLimit = counterM195852e == null ? null : counterM195852e.verification;
        return TextUtils.equals(c19824a.f162788b.f152896U, "certified") && joa.m146386f4() && verificationLimit != null && verificationLimit.tribeSwipeCount >= verificationLimit.tribeTotalCount;
    }
}
