package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class lq90 {
    /* JADX INFO: renamed from: a */
    public static void m150961a(kq90 kq90Var, View view) {
        kq90Var.f124227a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kq90Var.f124228b = (VText) viewGroup.getChildAt(0);
        kq90Var.f124229c = (VLinear) viewGroup.getChildAt(1);
        kq90Var.f124230d = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kq90Var.f124231e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        kq90Var.f124232f = (VLinear) viewGroup.getChildAt(2);
        kq90Var.f124233g = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        kq90Var.f124234h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        kq90Var.f124235i = (VLinear) viewGroup.getChildAt(3);
        kq90Var.f124236j = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        kq90Var.f124237k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        kq90Var.f124238l = (VLinear) viewGroup.getChildAt(4);
        kq90Var.f124239m = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        kq90Var.f124240n = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        kq90Var.f124241o = (VLinear) viewGroup.getChildAt(5);
        kq90Var.f124242p = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        kq90Var.f124243q = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        kq90Var.f124244r = (VLinear) viewGroup.getChildAt(6);
        kq90Var.f124245s = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        kq90Var.f124246t = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        kq90Var.f124247u = (LinearLayout) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m150962b(kq90 kq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95293Ba, viewGroup, false);
        m150961a(kq90Var, viewInflate);
        return viewInflate;
    }
}
