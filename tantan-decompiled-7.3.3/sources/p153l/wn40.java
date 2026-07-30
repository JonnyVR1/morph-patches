package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wn40 {
    /* JADX INFO: renamed from: a */
    public static void m207137a(vn40 vn40Var, View view) {
        vn40Var.f184805a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vn40Var.f184806b = viewGroup.getChildAt(0);
        vn40Var.f184807c = (VLinear) viewGroup.getChildAt(1);
        vn40Var.f184808d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vn40Var.f184809e = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vn40Var.f184810f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vn40Var.f184811g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vn40Var.f184812h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vn40Var.f184813i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        vn40Var.f184814j = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        vn40Var.f184815k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        vn40Var.f184816l = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m207138b(vn40 vn40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156999b4, viewGroup, false);
        m207137a(vn40Var, viewInflate);
        return viewInflate;
    }
}
