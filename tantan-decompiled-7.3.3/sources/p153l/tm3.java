package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class tm3 {
    /* JADX INFO: renamed from: a */
    public static void m191720a(sm3 sm3Var, View view) {
        sm3Var.f169492a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sm3Var.f169493b = (VNavigationBar) viewGroup.getChildAt(0);
        sm3Var.f169494c = (FrameLayout) viewGroup.getChildAt(1);
        sm3Var.f169495d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sm3Var.f169496e = (PullFrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sm3Var.f169497f = (WebViewX) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sm3Var.f169498g = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sm3Var.f169499h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        sm3Var.f169500i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        sm3Var.f169501j = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m191721b(sm3 sm3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151985f, viewGroup, false);
        m191720a(sm3Var, viewInflate);
        return viewInflate;
    }
}
