package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c3f0 {
    /* JADX INFO: renamed from: a */
    public static void m107788a(b3f0 b3f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b3f0Var.f74739a = (ScrollView) viewGroup.getChildAt(0);
        b3f0Var.f74740b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        b3f0Var.f74741c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        b3f0Var.f74742d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        b3f0Var.f74743e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        b3f0Var.f74744f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        b3f0Var.f74745g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        b3f0Var.f74746h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        b3f0Var.f74747i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        b3f0Var.f74748j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        b3f0Var.f74749k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        b3f0Var.f74750l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        b3f0Var.f74751m = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        b3f0Var.f74752n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        b3f0Var.f74753o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        b3f0Var.f74754p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        b3f0Var.f74755q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        b3f0Var.f74756r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        b3f0Var.f74757s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        b3f0Var.f74758t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        b3f0Var.f74759u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        b3f0Var.f74760v = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        b3f0Var.f74761w = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        b3f0Var.f74762x = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        b3f0Var.f74763y = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        b3f0Var.f74764z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m107789b(b3f0 b3f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125732Zb, viewGroup, false);
        m107788a(b3f0Var, viewInflate);
        return viewInflate;
    }
}
