package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlFriendPurposeLayout;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class x3j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlFriendPurposeLayout) {
            CardBottomIntlFriendPurposeLayout cardBottomIntlFriendPurposeLayout = (CardBottomIntlFriendPurposeLayout) view;
            m203741k(cardBottomIntlFriendPurposeLayout.f23481c, c7870d, i);
            cardBottomIntlFriendPurposeLayout.m38916Q(c7870d.getUser(), c7870d.mo37478f());
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
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        if (rj4Var.m179548c() instanceof CardBottomIntlFriendPurposeLayout) {
        }
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c7870d == null || c7870d.getUser() == null) {
            return false;
        }
        return !vwb.m200296J(c7870d.getUser().profile.extensions.basic.intlFriendPurposeV2);
    }
}
