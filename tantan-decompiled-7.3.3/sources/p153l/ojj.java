package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.vip.GPVipIntroPage;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ojj {
    /* JADX INFO: renamed from: a */
    public static void m167865a(GPVipIntroPage gPVipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPVipIntroPage.f37802a = (VText) viewGroup.getChildAt(0);
        gPVipIntroPage.f37803b = (TextView) viewGroup.getChildAt(1);
        gPVipIntroPage.f37804c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gPVipIntroPage.f37805d = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPVipIntroPage.f37806e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.f37807f = (GradientBgButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.f37808g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        gPVipIntroPage.f37809h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gPVipIntroPage.f37810i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gPVipIntroPage.f37811j = (VText) viewGroup.getChildAt(3);
        gPVipIntroPage.f37812k = (VText) viewGroup.getChildAt(4);
    }
}
