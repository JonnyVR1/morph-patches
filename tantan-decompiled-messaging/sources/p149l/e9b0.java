package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.result.VRectBottomArc;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e9b0 {
    /* JADX INFO: renamed from: a */
    public static void m115345a(d9b0 d9b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d9b0Var.f84952a = (Space) viewGroup.getChildAt(0);
        d9b0Var.f84953b = (FrameLayout) viewGroup.getChildAt(1);
        d9b0Var.f84954c = (FrameLayout) viewGroup.getChildAt(2);
        d9b0Var.f84955d = (VRectBottomArc) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        d9b0Var.f84956e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        d9b0Var.f84957f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        d9b0Var.f84958g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        d9b0Var.f84959h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        d9b0Var.f84960i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        d9b0Var.f84961j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        d9b0Var.f84962k = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        d9b0Var.f84963l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        d9b0Var.f84964m = (LinearLayout) viewGroup.getChildAt(3);
        d9b0Var.f84965n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        d9b0Var.f84966o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        d9b0Var.f84967p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        d9b0Var.f84968q = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        d9b0Var.f84969r = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m115346b(d9b0 d9b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131487H1, viewGroup, false);
        m115345a(d9b0Var, viewInflate);
        return viewInflate;
    }
}
