package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class r6j extends em2 {

    /* JADX INFO: renamed from: c */
    public static final int f161476c = qa00.m175859d(77.0f);

    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(final C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlComplimentReceivedLayout) {
            CardBottomIntlComplimentReceivedLayout cardBottomIntlComplimentReceivedLayout = (CardBottomIntlComplimentReceivedLayout) view;
            m121321k(cardBottomIntlComplimentReceivedLayout.f24215c, c8021d, i);
            cardBottomIntlComplimentReceivedLayout.m39917R(c8021d.getUser(), c8021d.getUserInfo() != null ? c8021d.getUserInfo().compliment : null, c8021d.mo38481f(), new Runnable() { // from class: l.q6j
                @Override // java.lang.Runnable
                public final void run() {
                    C8021d c8021d2 = c8021d;
                    ExpandedCardStyleHelper.m39093o().m39101m(c8021d2.getUser(), c8021d2.getUserInfo());
                }
            });
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = IntlCountryCodeController.m29125v() ? f161476c : qa00.m175859d(16.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: g */
    public int mo121319g() {
        return qa00.m175859d(120.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: h */
    public int mo121320h() {
        return qa00.m175859d(120.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return false;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        if (c8021d.getUser() == null || !(qk4Var.m176921c() instanceof CardBottomIntlComplimentReceivedLayout)) {
            return;
        }
        gp5.m131234h("swipe", c8021d.getUser().f56859id);
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return (c8021d == null || c8021d.getUser() == null || !c8021d.mo38482g() || c8021d.getUser().isMe() || c8021d.getUser().isTeamAccount() || c8021d.getUserInfo() == null || c8021d.getUserInfo().compliment == null || !"paid".equals(c8021d.getUserInfo().compliment.type) || qap.INSTANCE.m175975m(c8021d.getUserInfo())) ? false : true;
    }
}
