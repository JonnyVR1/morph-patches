package p009l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k4j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentCardTwoView) {
            CardBottomMomentCardTwoView cardBottomMomentCardTwoView = (CardBottomMomentCardTwoView) view;
            m24310k(cardBottomMomentCardTwoView.f2311c, c0034d, i);
            m24312m(cardBottomMomentCardTwoView.f2312d, c0034d, i);
            CardBottomBaseInfoView cardBottomBaseInfoView = cardBottomMomentCardTwoView.f2311c;
            CardBottomFrame cardBottomFrame = c0034d.f815j.f818a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.MOMENT_CARD;
            xdl0.M(cardBottomBaseInfoView, cardBottomFrame == cardBottomFrame2);
            xdl0.M(cardBottomMomentCardTwoView.f2312d, c0034d.f815j.f818a == cardBottomFrame2);
            cardBottomMomentCardTwoView.m2944S(c0034d);
            c0034d.f815j.m1467a(true);
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(110.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c0034d.m1453j() || c0034d.mo1448e();
    }
}
