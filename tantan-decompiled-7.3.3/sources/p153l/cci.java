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
public class cci {
    /* JADX INFO: renamed from: a */
    public static void m108708a(bci bciVar, View view) {
        bciVar.f76150a = (VLinear) view.findViewById(hdc0.f108832F0);
        ViewGroup viewGroup = (ViewGroup) view;
        bciVar.f76151b = (VNavigationBar) viewGroup.getChildAt(0);
        bciVar.f76152c = (FrameLayout) viewGroup.getChildAt(1);
        bciVar.f76153d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bciVar.f76154e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bciVar.f76155f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bciVar.f76156g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bciVar.f76157h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m108709b(bci bciVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173553O3, viewGroup, false);
        m108708a(bciVar, viewInflate);
        return viewInflate;
    }
}
