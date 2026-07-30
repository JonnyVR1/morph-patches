package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.vip.VipIntroPage;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tql0 {
    /* JADX INFO: renamed from: a */
    public static void m192316a(VipIntroPage vipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipIntroPage.f37843a = (VText) viewGroup.getChildAt(0);
        vipIntroPage.f37844b = (TextView) viewGroup.getChildAt(1);
        vipIntroPage.f37845c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vipIntroPage.f37846d = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipIntroPage.f37847e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipIntroPage.f37848f = (GradientBgButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        vipIntroPage.f37849g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        vipIntroPage.f37850h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vipIntroPage.f37851i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vipIntroPage.f37852j = (VText) viewGroup.getChildAt(3);
        vipIntroPage.f37853k = (VText) viewGroup.getChildAt(4);
    }
}
