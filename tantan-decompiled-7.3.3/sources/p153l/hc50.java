package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hc50 {
    /* JADX INFO: renamed from: a */
    public static void m134448a(gc50 gc50Var, View view) {
        gc50Var.f103528k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gc50Var.f103529l = viewGroup.getChildAt(0);
        gc50Var.f103530m = (VDraweeView) viewGroup.getChildAt(1);
        gc50Var.f103531n = (VDraweeView) viewGroup.getChildAt(2);
        gc50Var.f103532o = (VDraweeView) viewGroup.getChildAt(3);
        gc50Var.f103533p = (TextView) viewGroup.getChildAt(4);
        gc50Var.f103534q = (VFrame) viewGroup.getChildAt(5);
        gc50Var.f103535r = (VText) viewGroup.getChildAt(6);
        gc50Var.f103536s = (TextView) viewGroup.getChildAt(7);
        gc50Var.f103537t = (LiveBannerView) viewGroup.getChildAt(8);
        gc50Var.f103538u = (LinearLayout) viewGroup.getChildAt(9);
        gc50Var.f103539v = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        gc50Var.f103540w = (VText) viewGroup.getChildAt(10);
    }
}
