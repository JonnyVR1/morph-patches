package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VOnlineIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class agl {
    /* JADX INFO: renamed from: a */
    public static void m97702a(HomeTitleLayout homeTitleLayout, View view) {
        homeTitleLayout.f24669a = (HomeTitleLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeTitleLayout.f24670b = (LinearLayoutCompat) viewGroup.getChildAt(0);
        homeTitleLayout.f24671c = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeTitleLayout.f24672d = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeTitleLayout.f24673e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeTitleLayout.f24674f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeTitleLayout.f24675g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        homeTitleLayout.f24676h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeTitleLayout.f24677i = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeTitleLayout.f24678j = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeTitleLayout.f24679k = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        homeTitleLayout.f24680l = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        homeTitleLayout.f24681m = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        homeTitleLayout.f24682n = (BoostViewContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6)).getChildAt(0);
        homeTitleLayout.f24683o = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        homeTitleLayout.f24684p = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7)).getChildAt(0);
        homeTitleLayout.f24685q = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        homeTitleLayout.f24686r = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        homeTitleLayout.f24687s = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        homeTitleLayout.f24688t = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        homeTitleLayout.f24689u = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(0);
        homeTitleLayout.f24690v = (VOnlineIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10)).getChildAt(1);
        homeTitleLayout.f24691w = (ViewStub) viewGroup.getChildAt(1);
        homeTitleLayout.f24692x = (ViewStub) viewGroup.getChildAt(2);
    }
}
