package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.VerificationLimit;

/* JADX INFO: loaded from: classes11.dex */
public class ijp extends udp {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        CoreModule.m29935P().m94651a().mo33565pr(c17710a.f116600b.getAct(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.intl_advanced_filter);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        Counter counterM193147e = m193147e();
        VerificationLimit verificationLimit = counterM193147e == null ? null : counterM193147e.verification;
        return TextUtils.equals(c17710a.f116600b.f149629U, "certified") && xma.m210071e4() && verificationLimit != null && verificationLimit.tribeSwipeCount >= verificationLimit.tribeTotalCount;
    }
}
