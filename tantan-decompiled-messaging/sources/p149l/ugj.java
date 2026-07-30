package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.vip.GPVipIntroPage;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ugj {
    /* JADX INFO: renamed from: a */
    public static void m193564a(GPVipIntroPage gPVipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPVipIntroPage.f36954a = (VText) viewGroup.getChildAt(0);
        gPVipIntroPage.f36955b = (TextView) viewGroup.getChildAt(1);
        gPVipIntroPage.f36956c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gPVipIntroPage.f36957d = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPVipIntroPage.f36958e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.f36959f = (GradientBgButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.f36960g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        gPVipIntroPage.f36961h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gPVipIntroPage.f36962i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gPVipIntroPage.f36963j = (VText) viewGroup.getChildAt(3);
        gPVipIntroPage.f36964k = (VText) viewGroup.getChildAt(4);
    }
}
