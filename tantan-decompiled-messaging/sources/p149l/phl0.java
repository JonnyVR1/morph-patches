package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.vip.VipIntroPage;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class phl0 {
    /* JADX INFO: renamed from: a */
    public static void m168976a(VipIntroPage vipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipIntroPage.f36995a = (VText) viewGroup.getChildAt(0);
        vipIntroPage.f36996b = (TextView) viewGroup.getChildAt(1);
        vipIntroPage.f36997c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vipIntroPage.f36998d = (AutoVDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipIntroPage.f36999e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipIntroPage.f37000f = (GradientBgButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        vipIntroPage.f37001g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        vipIntroPage.f37002h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vipIntroPage.f37003i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vipIntroPage.f37004j = (VText) viewGroup.getChildAt(3);
        vipIntroPage.f37005k = (VText) viewGroup.getChildAt(4);
    }
}
