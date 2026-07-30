package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeSubGiftItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kl2 {
    /* JADX INFO: renamed from: a */
    public static void m150340a(il2 il2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        il2Var.f115495e = viewGroup.getChildAt(0);
        il2Var.f115496f = (CustomClickConstraintLayout) viewGroup.getChildAt(1);
        il2Var.f115497g = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        il2Var.f115498h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        il2Var.f115499i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        il2Var.f115500j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        il2Var.f115501k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        il2Var.f115502l = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        il2Var.f115503m = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        il2Var.f115504n = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        il2Var.f115505o = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        il2Var.f115506p = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        il2Var.f115507q = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        il2Var.f115508r = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        il2Var.f115509s = (LiveFastRechargeItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        il2Var.f115510t = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        il2Var.f115511u = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        il2Var.f115512v = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(1);
        il2Var.f115513w = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(2);
        il2Var.f115514x = (LocalNewFirstRechargeSubGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12)).getChildAt(3);
        il2Var.f115515y = (VDraweeView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m150341b(il2 il2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199200p1, viewGroup, false);
        m150340a(il2Var, viewInflate);
        return viewInflate;
    }
}
