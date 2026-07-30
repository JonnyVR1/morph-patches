package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class w3j extends wl2 {

    /* JADX INFO: renamed from: c */
    public static final int f184397c = t100.m186890d(77.0f);

    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(final C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlComplimentReceivedLayout) {
            CardBottomIntlComplimentReceivedLayout cardBottomIntlComplimentReceivedLayout = (CardBottomIntlComplimentReceivedLayout) view;
            m203741k(cardBottomIntlComplimentReceivedLayout.f23473c, c7870d, i);
            cardBottomIntlComplimentReceivedLayout.m38914R(c7870d.getUser(), c7870d.getUserInfo() != null ? c7870d.getUserInfo().compliment : null, c7870d.mo37478f(), new Runnable() { // from class: l.v3j
                @Override // java.lang.Runnable
                public final void run() {
                    C7870d c7870d2 = c7870d;
                    ExpandedCardStyleHelper.m38090o().m38098m(c7870d2.getUser(), c7870d2.getUserInfo());
                }
            });
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = IntlCountryCodeController.m28126v() ? f184397c : t100.m186890d(16.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: g */
    public int mo100263g() {
        return t100.m186890d(120.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: h */
    public int mo100264h() {
        return t100.m186890d(120.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return false;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        if (c7870d.getUser() == null || !(rj4Var.m179548c() instanceof CardBottomIntlComplimentReceivedLayout)) {
            return;
        }
        co5.m107936h("swipe", c7870d.getUser().f56011id);
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return (c7870d == null || c7870d.getUser() == null || !c7870d.mo37479g() || c7870d.getUser().isMe() || c7870d.getUser().isTeamAccount() || c7870d.getUserInfo() == null || c7870d.getUserInfo().compliment == null || !"paid".equals(c7870d.getUserInfo().compliment.type) || q8p.INSTANCE.m173438m(c7870d.getUserInfo())) ? false : true;
    }
}
