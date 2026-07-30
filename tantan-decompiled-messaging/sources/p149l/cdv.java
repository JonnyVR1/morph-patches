package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class cdv {
    /* JADX INFO: renamed from: a */
    public static void m106294a(hcv hcvVar, View view) {
        hcvVar.f107098a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hcvVar.f107099b = viewGroup.getChildAt(0);
        hcvVar.f107100c = (CardView) viewGroup.getChildAt(1);
        hcvVar.f107101d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hcvVar.f107102e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m106295b(hcv hcvVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168543ub, viewGroup, false);
        m106294a(hcvVar, viewInflate);
        return viewInflate;
    }
}
