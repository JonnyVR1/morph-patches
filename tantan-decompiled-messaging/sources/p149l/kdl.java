package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class kdl {
    /* JADX INFO: renamed from: a */
    public static void m145646a(HomeTitleLayout homeTitleLayout, View view) {
        homeTitleLayout.f23927a = (HomeTitleLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleLayout.f23928b = (LinearLayoutCompat) viewGroup.getChildAt(0);
        homeTitleLayout.f23929c = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeTitleLayout.f23930d = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeTitleLayout.f23931e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeTitleLayout.f23932f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeTitleLayout.f23933g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        homeTitleLayout.f23934h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeTitleLayout.f23935i = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeTitleLayout.f23936j = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeTitleLayout.f23937k = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        homeTitleLayout.f23938l = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        homeTitleLayout.f23939m = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        homeTitleLayout.f23940n = (BoostViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        homeTitleLayout.f23941o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        homeTitleLayout.f23942p = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        homeTitleLayout.f23943q = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        homeTitleLayout.f23944r = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        homeTitleLayout.f23945s = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        homeTitleLayout.f23946t = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        homeTitleLayout.f23947u = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(0);
        homeTitleLayout.f23948v = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1);
        homeTitleLayout.f23949w = (ViewStub) viewGroup.getChildAt(1);
        homeTitleLayout.f23950x = (ViewStub) viewGroup.getChildAt(2);
    }
}
