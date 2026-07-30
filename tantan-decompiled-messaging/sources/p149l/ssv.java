package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.C12867a;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ssv {
    /* JADX INFO: renamed from: a */
    public static void m185774a(C12867a c12867a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c12867a.f50928L = (VText) viewGroup.getChildAt(1);
        c12867a.f50930M = (VImage) viewGroup.getChildAt(2);
        c12867a.f50932N = (VText) viewGroup.getChildAt(3);
        c12867a.f50933O = (VText) viewGroup.getChildAt(4);
        c12867a.f50934P = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        c12867a.f50935Q = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        c12867a.f50936R = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185775b(C12867a c12867a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168273a1, viewGroup, false);
        m185774a(c12867a, viewInflate);
        return viewInflate;
    }
}
