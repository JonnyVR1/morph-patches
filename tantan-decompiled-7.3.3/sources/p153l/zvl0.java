package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import p151v.VImage;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class zvl0 {
    /* JADX INFO: renamed from: a */
    public static void m221785a(yvl0 yvl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yvl0Var.f201731a = (VNavigationBar) viewGroup.getChildAt(0);
        yvl0Var.f201732b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yvl0Var.f201733c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        yvl0Var.f201734d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        yvl0Var.f201735e = (VipLocationItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yvl0Var.f201736f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        yvl0Var.f201737g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        yvl0Var.f201738h = (VList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        yvl0Var.f201739i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m221786b(yvl0 yvl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125685Wc, viewGroup, false);
        m221785a(yvl0Var, viewInflate);
        return viewInflate;
    }
}
