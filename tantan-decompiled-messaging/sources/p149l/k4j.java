package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;

/* JADX INFO: loaded from: classes11.dex */
public class k4j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentCardTwoView) {
            CardBottomMomentCardTwoView cardBottomMomentCardTwoView = (CardBottomMomentCardTwoView) view;
            m203741k(cardBottomMomentCardTwoView.f23533c, c7870d, i);
            m203743m(cardBottomMomentCardTwoView.f23534d, c7870d, i);
            CardBottomBaseInfoView cardBottomBaseInfoView = cardBottomMomentCardTwoView.f23533c;
            CardBottomFrame cardBottomFrame = c7870d.f22037j.f22040a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.MOMENT_CARD;
            xdl0.m208344M(cardBottomBaseInfoView, cardBottomFrame == cardBottomFrame2);
            xdl0.m208344M(cardBottomMomentCardTwoView.f23534d, c7870d.f22037j.f22040a == cardBottomFrame2);
            cardBottomMomentCardTwoView.m38937S(c7870d);
            c7870d.f22037j.m37496a(true);
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(110.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return c7870d.m37482j() || c7870d.mo37477e();
    }
}
