package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class o6j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomDefaultLayout) {
            CardBottomDefaultLayout cardBottomDefaultLayout = (CardBottomDefaultLayout) view;
            m121321k(cardBottomDefaultLayout.f24200c, c8021d, i);
            m121323m(cardBottomDefaultLayout.f24201d, c8021d, i);
            c8021d.f22779j.m38499a(cardBottomDefaultLayout.f24201d.m40125V());
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(110.0f);
        if (IntlCountryCodeController.m29125v()) {
            layoutParams.bottomMargin = qa00.m175859d(10.0f);
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        sfj0.m185601h("e_card_default_information", "p_suggest_users_home_view", sfj0.C20032a.m185615h("receiver_user_id", c8021d.getUser().f56859id));
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c8021d.f22779j.f22782a != null) {
            return false;
        }
        if (d79.m114691m0()) {
            c8021d.m38497v(cardBottomFrame, qa00.m175859d(85.0f));
            return true;
        }
        c8021d.m38497v(cardBottomFrame, qa00.m175859d(130.0f));
        return true;
    }
}
