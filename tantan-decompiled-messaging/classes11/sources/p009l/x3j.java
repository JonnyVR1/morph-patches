package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlFriendPurposeLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x3j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlFriendPurposeLayout) {
            CardBottomIntlFriendPurposeLayout cardBottomIntlFriendPurposeLayout = (CardBottomIntlFriendPurposeLayout) view;
            m24310k(cardBottomIntlFriendPurposeLayout.f2259c, c0034d, i);
            cardBottomIntlFriendPurposeLayout.m2923Q(c0034d.getUser(), c0034d.mo1449f());
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(110.0f);
        if (IntlCountryCodeController.v()) {
            layoutParams.bottomMargin = t100.d(10.0f);
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        if (rj4Var.m21680c() instanceof CardBottomIntlFriendPurposeLayout) {
        }
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c0034d == null || c0034d.getUser() == null) {
            return false;
        }
        return !vwb.J(c0034d.getUser().profile.extensions.basic.intlFriendPurposeV2);
    }
}
