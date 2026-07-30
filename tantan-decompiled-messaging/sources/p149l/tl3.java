package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tl3 {
    /* JADX INFO: renamed from: a */
    public static void m189614a(sl3 sl3Var, View view) {
        sl3Var.f165106a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sl3Var.f165107b = (VNavigationBar) viewGroup.getChildAt(0);
        sl3Var.f165108c = (FrameLayout) viewGroup.getChildAt(1);
        sl3Var.f165109d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sl3Var.f165110e = (PullFrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sl3Var.f165111f = (WebViewX) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sl3Var.f165112g = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sl3Var.f165113h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sl3Var.f165114i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        sl3Var.f165115j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m189615b(sl3 sl3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121377f, viewGroup, false);
        m189614a(sl3Var, viewInflate);
        return viewInflate;
    }
}
