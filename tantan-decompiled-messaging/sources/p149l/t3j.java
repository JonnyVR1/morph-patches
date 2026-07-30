package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class t3j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomDefaultLayout) {
            CardBottomDefaultLayout cardBottomDefaultLayout = (CardBottomDefaultLayout) view;
            m203741k(cardBottomDefaultLayout.f23458c, c7870d, i);
            m203743m(cardBottomDefaultLayout.f23459d, c7870d, i);
            c7870d.f22037j.m37496a(cardBottomDefaultLayout.f23459d.m39122V());
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(110.0f);
        if (IntlCountryCodeController.m28126v()) {
            layoutParams.bottomMargin = t100.m186890d(10.0f);
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        o6j0.m162864h("e_card_default_information", "p_suggest_users_home_view", o6j0.C18854a.m162878h("receiver_user_id", c7870d.getUser().f56011id));
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c7870d.f22037j.f22040a != null) {
            return false;
        }
        if (u59.m191833i0()) {
            c7870d.m37494v(cardBottomFrame, t100.m186890d(85.0f));
            return true;
        }
        c7870d.m37494v(cardBottomFrame, t100.m186890d(130.0f));
        return true;
    }
}
