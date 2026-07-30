package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.app.web.WebViewX;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class plp0 {
    /* JADX INFO: renamed from: a */
    public static void m170239a(olp0 olp0Var, View view) {
        olp0Var.f144527a = (VLinear) view.findViewById(s4c0.f162314R);
        ViewGroup viewGroup = (ViewGroup) view;
        olp0Var.f144528b = (VNavigationBar) viewGroup.getChildAt(0);
        olp0Var.f144529c = (FrameLayout) viewGroup.getChildAt(1);
        olp0Var.f144530d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        olp0Var.f144531e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        olp0Var.f144532f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        olp0Var.f144533g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        olp0Var.f144534h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m170240b(olp0 olp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89539U, viewGroup, false);
        m170239a(olp0Var, viewInflate);
        return viewInflate;
    }
}
