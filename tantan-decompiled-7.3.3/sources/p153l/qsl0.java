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
public class qsl0 {
    /* JADX INFO: renamed from: a */
    public static void m177812a(psl0 psl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        psl0Var.f153930a = (VNavigationBar) viewGroup.getChildAt(0);
        psl0Var.f153931b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        psl0Var.f153932c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        psl0Var.f153933d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        psl0Var.f153934e = (VipLocationItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        psl0Var.f153935f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        psl0Var.f153936g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        psl0Var.f153937h = (VList) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        psl0Var.f153938i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        psl0Var.f153939j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m177813b(psl0 psl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125365Cf, viewGroup, false);
        m177812a(psl0Var, viewInflate);
        return viewInflate;
    }
}
