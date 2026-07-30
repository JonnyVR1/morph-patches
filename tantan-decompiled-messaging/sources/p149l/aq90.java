package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aq90 {
    /* JADX INFO: renamed from: a */
    public static void m98235a(zp90 zp90Var, View view) {
        zp90Var.f204234u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zp90Var.f204235v = (VText) viewGroup.getChildAt(0);
        zp90Var.f204236w = (VText) viewGroup.getChildAt(1);
        zp90Var.f204237x = (VText) viewGroup.getChildAt(2);
        zp90Var.f204238y = (VText) viewGroup.getChildAt(3);
        zp90Var.f204239z = (VText) viewGroup.getChildAt(4);
        zp90Var.f204216A = (VText) viewGroup.getChildAt(5);
        zp90Var.f204217B = (VText) viewGroup.getChildAt(6);
        zp90Var.f204218C = (VText) viewGroup.getChildAt(7);
        zp90Var.f204219D = (VText) viewGroup.getChildAt(8);
        zp90Var.f204220E = (VText) viewGroup.getChildAt(9);
        zp90Var.f204221F = (VText) viewGroup.getChildAt(10);
        zp90Var.f204222G = (VText) viewGroup.getChildAt(11);
        zp90Var.f204223H = (VText) viewGroup.getChildAt(12);
        zp90Var.f204224I = (VText) viewGroup.getChildAt(13);
        zp90Var.f204225J = (VText) viewGroup.getChildAt(14);
        zp90Var.f204226K = (VText) viewGroup.getChildAt(15);
        zp90Var.f204227L = (VText) viewGroup.getChildAt(16);
        zp90Var.f204228M = (VText) viewGroup.getChildAt(17);
        zp90Var.f204229N = (VText) viewGroup.getChildAt(18);
        zp90Var.f204230O = (VText) viewGroup.getChildAt(19);
        zp90Var.f204231P = (VText) viewGroup.getChildAt(20);
        zp90Var.f204232Q = (VText) viewGroup.getChildAt(21);
    }

    /* JADX INFO: renamed from: b */
    public static View m98236b(zp90 zp90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95628W9, viewGroup, false);
        m98235a(zp90Var, viewInflate);
        return viewInflate;
    }
}
