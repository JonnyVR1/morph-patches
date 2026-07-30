package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlFriendPurposeLayout;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class s6j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomIntlFriendPurposeLayout) {
            CardBottomIntlFriendPurposeLayout cardBottomIntlFriendPurposeLayout = (CardBottomIntlFriendPurposeLayout) view;
            m121321k(cardBottomIntlFriendPurposeLayout.f24223c, c8021d, i);
            cardBottomIntlFriendPurposeLayout.m39919Q(c8021d.getUser(), c8021d.mo38481f());
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
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        if (qk4Var.m176921c() instanceof CardBottomIntlFriendPurposeLayout) {
        }
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c8021d == null || c8021d.getUser() == null) {
            return false;
        }
        return !jyb.m147479J(c8021d.getUser().profile.extensions.basic.intlFriendPurposeV2);
    }
}
