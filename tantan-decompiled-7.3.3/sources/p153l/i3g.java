package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VScroll_Horizontal;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i3g {
    /* JADX INFO: renamed from: a */
    public static void m138285a(h3g h3gVar, View view) {
        h3gVar.f107639a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h3gVar.f107640b = viewGroup.getChildAt(0);
        h3gVar.f107641c = viewGroup.getChildAt(1);
        h3gVar.f107642d = viewGroup.getChildAt(2);
        h3gVar.f107643e = (VDraweeView) viewGroup.getChildAt(3);
        h3gVar.f107644f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        h3gVar.f107645g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        h3gVar.f107646h = (VLinear_FillerMeasure) viewGroup.getChildAt(5);
        h3gVar.f107647i = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        h3gVar.f107648j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        h3gVar.f107649k = (VText) viewGroup.getChildAt(6);
        h3gVar.f107650l = (LinearLayout) viewGroup.getChildAt(7);
        h3gVar.f107651m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        h3gVar.f107652n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        h3gVar.f107653o = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        h3gVar.f107654p = (LinearLayout) viewGroup.getChildAt(8);
        h3gVar.f107655q = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        h3gVar.f107656r = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        h3gVar.f107657s = (VScroll_Horizontal) viewGroup.getChildAt(9);
        h3gVar.f107658t = (VLinear) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        h3gVar.f107659u = (FrameLayout) viewGroup.getChildAt(10);
        h3gVar.f107660v = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m138286b(h3g h3gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152020n2, viewGroup, false);
        m138285a(h3gVar, viewInflate);
        return viewInflate;
    }
}
