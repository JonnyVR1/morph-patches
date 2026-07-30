package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class pk4 {
    /* JADX INFO: renamed from: a */
    public static void m169969a(CardIntlPictureViewOpt cardIntlPictureViewOpt, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardIntlPictureViewOpt.f23624b = (VPager_SquaredRefactor) viewGroup.getChildAt(0);
        cardIntlPictureViewOpt.f23625c = (VFrame) viewGroup.getChildAt(1);
        cardIntlPictureViewOpt.f23626d = (FrameLayout) viewGroup.getChildAt(2);
        cardIntlPictureViewOpt.f23627e = (NewPictureContainerIndicator) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
