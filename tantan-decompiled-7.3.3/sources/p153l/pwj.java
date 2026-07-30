package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftPanelTopBar;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pwj {
    /* JADX INFO: renamed from: a */
    public static void m174057a(owj owjVar, View view) {
        owjVar.f149498a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        owjVar.f149499b = (FrameLayout) viewGroup.getChildAt(0);
        owjVar.f149500c = (CoreGiftLayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        owjVar.f149501d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        owjVar.f149502e = (FrameLayout) viewGroup.getChildAt(1);
        owjVar.f149503f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        owjVar.f149504g = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        owjVar.f149505h = (GiftPanelTopBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        owjVar.f149506i = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174058b(owj owjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156916P, viewGroup, false);
        m174057a(owjVar, viewInflate);
        return viewInflate;
    }
}
