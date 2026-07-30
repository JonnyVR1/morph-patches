package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p051p1.mobile.putong.app.web.WebViewX;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class tup0 {
    /* JADX INFO: renamed from: a */
    public static void m192758a(sup0 sup0Var, View view) {
        sup0Var.f170712a = (VLinear) view.findViewById(ycc0.f198435R);
        ViewGroup viewGroup = (ViewGroup) view;
        sup0Var.f170713b = (VNavigationBar) viewGroup.getChildAt(0);
        sup0Var.f170714c = (FrameLayout) viewGroup.getChildAt(1);
        sup0Var.f170715d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sup0Var.f170716e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sup0Var.f170717f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sup0Var.f170718g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sup0Var.f170719h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m192759b(sup0 sup0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120452U, viewGroup, false);
        m192758a(sup0Var, viewInflate);
        return viewInflate;
    }
}
