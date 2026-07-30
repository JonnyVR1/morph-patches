package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cl2 {
    /* JADX INFO: renamed from: a */
    public static void m11103a(al2 al2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        al2Var.f7689e = viewGroup.getChildAt(0);
        al2Var.f7690f = (CustomClickConstraintLayout) viewGroup.getChildAt(1);
        al2Var.f7691g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        al2Var.f7692h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        al2Var.f7693i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        al2Var.f7694j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        al2Var.f7695k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        al2Var.f7696l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        al2Var.f7697m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        al2Var.f7698n = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        al2Var.f7699o = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        al2Var.f7700p = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        al2Var.f7701q = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        al2Var.f7702r = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        al2Var.f7703s = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        al2Var.f7704t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        al2Var.f7705u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        al2Var.f7706v = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(1);
        al2Var.f7707w = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(2);
        al2Var.f7708x = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(3);
        al2Var.f7709y = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11104b(al2 al2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19964p1, viewGroup, false);
        m11103a(al2Var, viewInflate);
        return viewInflate;
    }
}
