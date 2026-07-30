package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.app.web.WebViewX;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class zxh0 {
    /* JADX INFO: renamed from: a */
    public static void m220824a(yxh0 yxh0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yxh0Var.f200601a = (CardView) viewGroup.getChildAt(0);
        yxh0Var.f200602b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yxh0Var.f200603c = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yxh0Var.f200604d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yxh0Var.f200605e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yxh0Var.f200606f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        yxh0Var.f200607g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        yxh0Var.f200608h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m220825b(yxh0 yxh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131624n2, viewGroup, false);
        m220824a(yxh0Var, viewInflate);
        return viewInflate;
    }
}
