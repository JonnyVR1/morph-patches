package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xw20 {
    /* JADX INFO: renamed from: a */
    public static void m213285a(ww20 ww20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ww20Var.f191133a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ww20Var.f191134b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ww20Var.f191135c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ww20Var.f191136d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ww20Var.f191137e = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ww20Var.f191138f = (NewUIAbFilterBaseSetting) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ww20Var.f191139g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ww20Var.f191140h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        ww20Var.f191141i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        ww20Var.f191142j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        ww20Var.f191143k = (TagContainerLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        ww20Var.f191144l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        ww20Var.f191145m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        ww20Var.f191146n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m213286b(ww20 ww20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167579m0, viewGroup, false);
        m213285a(ww20Var, viewInflate);
        return viewInflate;
    }
}
