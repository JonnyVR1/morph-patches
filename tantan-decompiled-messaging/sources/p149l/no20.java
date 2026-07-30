package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class no20 {
    /* JADX INFO: renamed from: a */
    public static void m160399a(mo20 mo20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mo20Var.f134823a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mo20Var.f134824b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mo20Var.f134825c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mo20Var.f134826d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mo20Var.f134827e = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mo20Var.f134828f = (NewUIAbFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mo20Var.f134829g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        mo20Var.f134830h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        mo20Var.f134831i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        mo20Var.f134832j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        mo20Var.f134833k = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        mo20Var.f134834l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        mo20Var.f134835m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        mo20Var.f134836n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m160400b(mo20 mo20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137365m0, viewGroup, false);
        m160399a(mo20Var, viewInflate);
        return viewInflate;
    }
}
