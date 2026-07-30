package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.C13030a;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tuv {
    /* JADX INFO: renamed from: a */
    public static void m192760a(C13030a c13030a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c13030a.f51776L = (VText) viewGroup.getChildAt(1);
        c13030a.f51778M = (VImage) viewGroup.getChildAt(2);
        c13030a.f51780N = (VText) viewGroup.getChildAt(3);
        c13030a.f51781O = (VText) viewGroup.getChildAt(4);
        c13030a.f51782P = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        c13030a.f51783Q = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        c13030a.f51784R = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m192761b(C13030a c13030a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199005a1, viewGroup, false);
        m192760a(c13030a, viewInflate);
        return viewInflate;
    }
}
