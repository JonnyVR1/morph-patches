package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class ol4 {
    /* JADX INFO: renamed from: a */
    public static void m168101a(CardIntlPictureViewOpt cardIntlPictureViewOpt, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardIntlPictureViewOpt.f24366b = (VPager_SquaredRefactor) viewGroup.getChildAt(0);
        cardIntlPictureViewOpt.f24367c = (VFrame) viewGroup.getChildAt(1);
        cardIntlPictureViewOpt.f24368d = (FrameLayout) viewGroup.getChildAt(2);
        cardIntlPictureViewOpt.f24369e = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
