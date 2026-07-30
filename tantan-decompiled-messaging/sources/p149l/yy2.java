package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VButton;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yy2 {
    /* JADX INFO: renamed from: a */
    public static void m216511a(xy2 xy2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xy2Var.f194998a = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xy2Var.f194999b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xy2Var.f195000c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        xy2Var.f195001d = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        xy2Var.f195002e = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        xy2Var.f195003f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        xy2Var.f195004g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        xy2Var.f195005h = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        xy2Var.f195006i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        xy2Var.f195007j = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        xy2Var.f195008k = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m216512b(xy2 xy2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95975r4, viewGroup, false);
        m216511a(xy2Var, viewInflate);
        return viewInflate;
    }
}
