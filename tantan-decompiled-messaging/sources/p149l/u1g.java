package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VScroll_Horizontal;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u1g {
    /* JADX INFO: renamed from: a */
    public static void m191414a(t1g t1gVar, View view) {
        t1gVar.f167316a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        t1gVar.f167317b = viewGroup.getChildAt(0);
        t1gVar.f167318c = viewGroup.getChildAt(1);
        t1gVar.f167319d = viewGroup.getChildAt(2);
        t1gVar.f167320e = (VDraweeView) viewGroup.getChildAt(3);
        t1gVar.f167321f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        t1gVar.f167322g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        t1gVar.f167323h = (VLinear_FillerMeasure) viewGroup.getChildAt(5);
        t1gVar.f167324i = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        t1gVar.f167325j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        t1gVar.f167326k = (VText) viewGroup.getChildAt(6);
        t1gVar.f167327l = (LinearLayout) viewGroup.getChildAt(7);
        t1gVar.f167328m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        t1gVar.f167329n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        t1gVar.f167330o = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        t1gVar.f167331p = (LinearLayout) viewGroup.getChildAt(8);
        t1gVar.f167332q = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        t1gVar.f167333r = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        t1gVar.f167334s = (VScroll_Horizontal) viewGroup.getChildAt(9);
        t1gVar.f167335t = (VLinear) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        t1gVar.f167336u = (FrameLayout) viewGroup.getChildAt(10);
        t1gVar.f167337v = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m191415b(t1g t1gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121412n2, viewGroup, false);
        m191414a(t1gVar, viewInflate);
        return viewInflate;
    }
}
