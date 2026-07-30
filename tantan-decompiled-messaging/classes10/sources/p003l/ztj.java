package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftPanelTopBar;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ztj {
    /* JADX INFO: renamed from: a */
    public static void m11455a(ytj ytjVar, View view) {
        ytjVar.f9122a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ytjVar.f9123b = (FrameLayout) viewGroup.getChildAt(0);
        ytjVar.f9124c = (CoreGiftLayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ytjVar.f9125d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ytjVar.f9126e = (FrameLayout) viewGroup.getChildAt(1);
        ytjVar.f9127f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ytjVar.f9128g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ytjVar.f9129h = (GiftPanelTopBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        ytjVar.f9130i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11456b(ytj ytjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5869P, viewGroup, false);
        m11455a(ytjVar, viewInflate);
        return viewInflate;
    }
}
