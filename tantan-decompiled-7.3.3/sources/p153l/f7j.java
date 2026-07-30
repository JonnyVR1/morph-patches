package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;

/* JADX INFO: loaded from: classes11.dex */
public class f7j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentCardTwoView) {
            CardBottomMomentCardTwoView cardBottomMomentCardTwoView = (CardBottomMomentCardTwoView) view;
            m121321k(cardBottomMomentCardTwoView.f24275c, c8021d, i);
            m121323m(cardBottomMomentCardTwoView.f24276d, c8021d, i);
            CardBottomBaseInfoView cardBottomBaseInfoView = cardBottomMomentCardTwoView.f24275c;
            CardBottomFrame cardBottomFrame = c8021d.f22779j.f22782a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.MOMENT_CARD;
            bnl0.m105524M(cardBottomBaseInfoView, cardBottomFrame == cardBottomFrame2);
            bnl0.m105524M(cardBottomMomentCardTwoView.f24276d, c8021d.f22779j.f22782a == cardBottomFrame2);
            cardBottomMomentCardTwoView.m39940S(c8021d);
            c8021d.f22779j.m38499a(true);
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(110.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c8021d.m38485j() || c8021d.mo38480e();
    }
}
