package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xq20 {
    /* JADX INFO: renamed from: a */
    public static void m210541a(wq20 wq20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wq20Var.f187612a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wq20Var.f187613b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        wq20Var.f187614c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        wq20Var.f187615d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wq20Var.f187616e = (NewFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        wq20Var.f187617f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        wq20Var.f187618g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        wq20Var.f187619h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        wq20Var.f187620i = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        wq20Var.f187621j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        wq20Var.f187622k = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        wq20Var.f187623l = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        wq20Var.f187624m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        wq20Var.f187625n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        wq20Var.f187626o = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9);
        wq20Var.f187627p = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wq20Var.f187628q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m210542b(wq20 wq20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137367n0, viewGroup, false);
        m210541a(wq20Var, viewInflate);
        return viewInflate;
    }
}
