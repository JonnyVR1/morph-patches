package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p046p1.mobile.putong.core.newui.home.marrymode.C8030a;
import com.p046p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView;
import com.p046p1.mobile.putong.core.newui.home.marrymode.MarryModeEmptyView;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h1x {
    /* JADX INFO: renamed from: a */
    public static void m129086a(C8030a c8030a, View view) {
        c8030a.f23284a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8030a.f23285b = (VFrame) viewGroup.getChildAt(0);
        c8030a.f23286c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        c8030a.f23287d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8030a.f23288e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c8030a.f23289f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8030a.f23290g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8030a.f23291h = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c8030a.f23292i = (VFrame_Squared) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c8030a.f23293j = (RadarRipple) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8030a.f23294k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        c8030a.f23295l = (HomeErrorNetView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c8030a.f23296m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8030a.f23297n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8030a.f23298o = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8030a.f23299p = (MarryModeEmptyView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c8030a.f23300q = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        c8030a.f23301r = (MarrModeProfileCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        c8030a.f23302s = (MarrModeProfileCardView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        c8030a.f23303t = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8030a.f23304u = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8030a.f23305v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8030a.f23306w = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8030a.f23307x = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c8030a.f23308y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129087b(C8030a c8030a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95690a7, viewGroup, false);
        m129086a(c8030a, viewInflate);
        return viewInflate;
    }
}
