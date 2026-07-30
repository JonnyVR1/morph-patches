package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.BusinessAnimView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hj3 {
    /* JADX INFO: renamed from: a */
    public static void m131353a(BusinessAnimView businessAnimView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        businessAnimView.f28984a = (RelativeLayout) viewGroup.getChildAt(0);
        businessAnimView.f28985b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        businessAnimView.f28986c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        businessAnimView.f28987d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        businessAnimView.f28988e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        businessAnimView.f28989f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        businessAnimView.f28990g = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        businessAnimView.f28991h = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        businessAnimView.f28992i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        businessAnimView.f28993j = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        businessAnimView.f28994k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        businessAnimView.f28995l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        businessAnimView.f28996m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        businessAnimView.f28997n = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        businessAnimView.f28998o = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        businessAnimView.f28999p = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(0);
        businessAnimView.f29000q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9)).getChildAt(1);
        businessAnimView.f29001r = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
        businessAnimView.f29002s = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(11);
        businessAnimView.f29003t = viewGroup.getChildAt(1);
        businessAnimView.f29004u = (VFrame) viewGroup.getChildAt(2);
        businessAnimView.f29005v = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
