package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cl2 {
    /* JADX INFO: renamed from: a */
    public static void m107440a(al2 al2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        al2Var.f70377e = viewGroup.getChildAt(0);
        al2Var.f70378f = (CustomClickConstraintLayout) viewGroup.getChildAt(1);
        al2Var.f70379g = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        al2Var.f70380h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        al2Var.f70381i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        al2Var.f70382j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        al2Var.f70383k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        al2Var.f70384l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        al2Var.f70385m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        al2Var.f70386n = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        al2Var.f70387o = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        al2Var.f70388p = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        al2Var.f70389q = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        al2Var.f70390r = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        al2Var.f70391s = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        al2Var.f70392t = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        al2Var.f70393u = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        al2Var.f70394v = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(1);
        al2Var.f70395w = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(2);
        al2Var.f70396x = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(3);
        al2Var.f70397y = (VDraweeView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m107441b(al2 al2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168468p1, viewGroup, false);
        m107440a(al2Var, viewInflate);
        return viewInflate;
    }
}
