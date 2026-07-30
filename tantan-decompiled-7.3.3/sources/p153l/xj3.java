package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.BusinessAnimView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xj3 {
    /* JADX INFO: renamed from: a */
    public static void m211194a(BusinessAnimView businessAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        businessAnimView.f29832a = (RelativeLayout) viewGroup.getChildAt(0);
        businessAnimView.f29833b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        businessAnimView.f29834c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        businessAnimView.f29835d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        businessAnimView.f29836e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        businessAnimView.f29837f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        businessAnimView.f29838g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        businessAnimView.f29839h = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        businessAnimView.f29840i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        businessAnimView.f29841j = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        businessAnimView.f29842k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        businessAnimView.f29843l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        businessAnimView.f29844m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        businessAnimView.f29845n = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        businessAnimView.f29846o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        businessAnimView.f29847p = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        businessAnimView.f29848q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        businessAnimView.f29849r = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        businessAnimView.f29850s = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(11);
        businessAnimView.f29851t = viewGroup.getChildAt(1);
        businessAnimView.f29852u = (VFrame) viewGroup.getChildAt(2);
        businessAnimView.f29853v = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
