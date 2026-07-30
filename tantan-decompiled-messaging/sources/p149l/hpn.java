package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class hpn {
    /* JADX INFO: renamed from: a */
    public static void m132368a(gpn gpnVar, View view) {
        gpnVar.f103812a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gpnVar.f103813b = (FrameLayout) viewGroup.getChildAt(0);
        gpnVar.f103814c = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gpnVar.f103815d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gpnVar.f103816e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gpnVar.f103817f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gpnVar.f103818g = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gpnVar.f103819h = (VText_NoTopPadding) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m132369b(gpn gpnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121409n, viewGroup, false);
        m132368a(gpnVar, viewInflate);
        return viewInflate;
    }
}
