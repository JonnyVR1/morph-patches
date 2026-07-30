package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleMenuLayout;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class bgl {
    /* JADX INFO: renamed from: a */
    public static void m104227a(HomeTitleMenuLayout homeTitleMenuLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleMenuLayout.f24693c = (ViewStub) viewGroup.getChildAt(0);
        homeTitleMenuLayout.f24694d = (VFrame) viewGroup.getChildAt(1);
        homeTitleMenuLayout.f24695e = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeTitleMenuLayout.f24696f = (VIcon) viewGroup.getChildAt(2);
        homeTitleMenuLayout.f24697g = (VFrame) viewGroup.getChildAt(3);
        homeTitleMenuLayout.f24698h = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeTitleMenuLayout.f24699i = (VFrame) viewGroup.getChildAt(4);
        homeTitleMenuLayout.f24700j = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeTitleMenuLayout.f24701k = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
