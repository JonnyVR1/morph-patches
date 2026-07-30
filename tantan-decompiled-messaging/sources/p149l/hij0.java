package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hij0 {
    /* JADX INFO: renamed from: a */
    public static void m131259a(gij0 gij0Var, View view) {
        gij0Var.f102910f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gij0Var.f102911g = (VImage) viewGroup.getChildAt(0);
        gij0Var.f102912h = (VDraweeView) viewGroup.getChildAt(1);
        gij0Var.f102913i = (VText_Bold) viewGroup.getChildAt(2);
        gij0Var.f102914j = (VText) viewGroup.getChildAt(3);
        gij0Var.f102915k = (VLinear) viewGroup.getChildAt(4);
        gij0Var.f102916l = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        gij0Var.f102917m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        gij0Var.f102918n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        gij0Var.f102919o = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        gij0Var.f102920p = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        gij0Var.f102921q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1);
        gij0Var.f102922r = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        gij0Var.f102923s = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(0);
        gij0Var.f102924t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4)).getChildAt(1);
        gij0Var.f102925u = (VLinear) viewGroup.getChildAt(5);
        gij0Var.f102926v = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        gij0Var.f102927w = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        gij0Var.f102928x = (VText_Bold) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m131260b(gij0 gij0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95455Lc, viewGroup, false);
        m131259a(gij0Var, viewInflate);
        return viewInflate;
    }
}
