package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.C0456a;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ssv {
    /* JADX INFO: renamed from: a */
    public static void m22636a(C0456a c0456a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c0456a.f6970L = viewGroup.getChildAt(1);
        c0456a.f6972M = viewGroup.getChildAt(2);
        c0456a.f6974N = viewGroup.getChildAt(3);
        c0456a.f6975O = viewGroup.getChildAt(4);
        c0456a.f6976P = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        c0456a.f6977Q = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        c0456a.f6978R = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m22637b(C0456a c0456a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19769a1, viewGroup, false);
        m22636a(c0456a, viewInflate);
        return viewInflate;
    }
}
