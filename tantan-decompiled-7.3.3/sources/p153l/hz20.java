package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hz20 {
    /* JADX INFO: renamed from: a */
    public static void m137802a(gz20 gz20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gz20Var.f107138a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gz20Var.f107139b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gz20Var.f107140c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        gz20Var.f107141d = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gz20Var.f107142e = (NewFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gz20Var.f107143f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gz20Var.f107144g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        gz20Var.f107145h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        gz20Var.f107146i = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        gz20Var.f107147j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        gz20Var.f107148k = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6);
        gz20Var.f107149l = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        gz20Var.f107150m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        gz20Var.f107151n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(8);
        gz20Var.f107152o = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(9);
        gz20Var.f107153p = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gz20Var.f107154q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m137803b(gz20 gz20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167581n0, viewGroup, false);
        m137802a(gz20Var, viewInflate);
        return viewInflate;
    }
}
