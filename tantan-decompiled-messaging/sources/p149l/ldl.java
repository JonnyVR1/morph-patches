package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleMenuLayout;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class ldl {
    /* JADX INFO: renamed from: a */
    public static void m149445a(HomeTitleMenuLayout homeTitleMenuLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleMenuLayout.f23951c = (ViewStub) viewGroup.getChildAt(0);
        homeTitleMenuLayout.f23952d = (VFrame) viewGroup.getChildAt(1);
        homeTitleMenuLayout.f23953e = (BoostViewContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeTitleMenuLayout.f23954f = (VIcon) viewGroup.getChildAt(2);
        homeTitleMenuLayout.f23955g = (VFrame) viewGroup.getChildAt(3);
        homeTitleMenuLayout.f23956h = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeTitleMenuLayout.f23957i = (VFrame) viewGroup.getChildAt(4);
        homeTitleMenuLayout.f23958j = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeTitleMenuLayout.f23959k = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
