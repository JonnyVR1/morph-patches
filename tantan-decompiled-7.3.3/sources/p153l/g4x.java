package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p051p1.mobile.putong.core.newui.home.marrymode.C8181a;
import com.p051p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView;
import com.p051p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g4x {
    /* JADX INFO: renamed from: a */
    public static void m128912a(C8181a c8181a, View view) {
        c8181a.f24026a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8181a.f24027b = (VFrame) viewGroup.getChildAt(0);
        c8181a.f24028c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8181a.f24029d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8181a.f24030e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8181a.f24031f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8181a.f24032g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8181a.f24033h = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8181a.f24034i = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c8181a.f24035j = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8181a.f24036k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8181a.f24037l = (HomeErrorNetView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c8181a.f24038m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8181a.f24039n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8181a.f24040o = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8181a.f24041p = (MarryModeEmptyView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c8181a.f24042q = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        c8181a.f24043r = (MarrModeProfileCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        c8181a.f24044s = (MarrModeProfileCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        c8181a.f24045t = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8181a.f24046u = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8181a.f24047v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8181a.f24048w = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8181a.f24049x = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8181a.f24050y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m128913b(C8181a c8181a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125761b7, viewGroup, false);
        m128912a(c8181a, viewInflate);
        return viewInflate;
    }
}
