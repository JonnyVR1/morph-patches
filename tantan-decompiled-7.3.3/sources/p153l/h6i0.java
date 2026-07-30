package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.app.web.WebViewX;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class h6i0 {
    /* JADX INFO: renamed from: a */
    public static void m133708a(g6i0 g6i0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        g6i0Var.f102441a = (CardView) viewGroup.getChildAt(0);
        g6i0Var.f102442b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g6i0Var.f102443c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        g6i0Var.f102444d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g6i0Var.f102445e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        g6i0Var.f102446f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        g6i0Var.f102447g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        g6i0Var.f102448h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m133709b(g6i0 g6i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162584n2, viewGroup, false);
        m133708a(g6i0Var, viewInflate);
        return viewInflate;
    }
}
