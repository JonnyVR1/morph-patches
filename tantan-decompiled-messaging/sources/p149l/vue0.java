package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vue0 {
    /* JADX INFO: renamed from: a */
    public static void m200068a(uue0 uue0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        uue0Var.f178348a = (ScrollView) viewGroup.getChildAt(0);
        uue0Var.f178349b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        uue0Var.f178350c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        uue0Var.f178351d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        uue0Var.f178352e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        uue0Var.f178353f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        uue0Var.f178354g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        uue0Var.f178355h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        uue0Var.f178356i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        uue0Var.f178357j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        uue0Var.f178358k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        uue0Var.f178359l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        uue0Var.f178360m = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        uue0Var.f178361n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        uue0Var.f178362o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        uue0Var.f178363p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        uue0Var.f178364q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        uue0Var.f178365r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        uue0Var.f178366s = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7);
        uue0Var.f178367t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        uue0Var.f178368u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        uue0Var.f178369v = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        uue0Var.f178370w = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        uue0Var.f178371x = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        uue0Var.f178372y = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        uue0Var.f178373z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m200069b(uue0 uue0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95566Sb, viewGroup, false);
        m200068a(uue0Var, viewInflate);
        return viewInflate;
    }
}
