package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.tantanapp.common.data.DbObject;
import l.co5;
import l.q8p;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w3j extends wl2 {

    /* JADX INFO: renamed from: c */
    public static final int f21871c = t100.d(77.0f);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(final C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlComplimentReceivedLayout) {
            CardBottomIntlComplimentReceivedLayout cardBottomIntlComplimentReceivedLayout = (CardBottomIntlComplimentReceivedLayout) view;
            m24310k(cardBottomIntlComplimentReceivedLayout.f2251c, c0034d, i);
            cardBottomIntlComplimentReceivedLayout.m2921R(c0034d.getUser(), c0034d.getUserInfo() != null ? c0034d.getUserInfo().compliment : null, c0034d.mo1449f(), new Runnable() { // from class: l.v3j
                @Override // java.lang.Runnable
                public final void run() {
                    C0034d c0034d2 = c0034d;
                    ExpandedCardStyleHelper.m2064o().m2072m(c0034d2.getUser(), c0034d2.getUserInfo());
                }
            });
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = IntlCountryCodeController.v() ? f21871c : t100.d(16.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: g */
    public int mo11840g() {
        return t100.d(120.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: h */
    public int mo11841h() {
        return t100.d(120.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return false;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        if (c0034d.getUser() == null || !(rj4Var.m21680c() instanceof CardBottomIntlComplimentReceivedLayout)) {
            return;
        }
        co5.h("swipe", ((DbObject) c0034d.getUser()).id);
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return (c0034d == null || c0034d.getUser() == null || !c0034d.mo1450g() || c0034d.getUser().isMe() || c0034d.getUser().isTeamAccount() || c0034d.getUserInfo() == null || c0034d.getUserInfo().compliment == null || !"paid".equals(c0034d.getUserInfo().compliment.type) || q8p.Companion.m(c0034d.getUserInfo())) ? false : true;
    }
}
