package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.C0456a;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tsv {
    /* JADX INFO: renamed from: a */
    public static void m23162a(C0456a c0456a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c0456a.f6979S = (PayItemView) viewGroup.getChildAt(0);
        c0456a.f6980T = (PayItemView) viewGroup.getChildAt(1);
        c0456a.f6981U = viewGroup.getChildAt(2);
        c0456a.f6982V = viewGroup.getChildAt(3);
        c0456a.f6983W = viewGroup.getChildAt(4);
        c0456a.f6984X = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        c0456a.f6985Y = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        c0456a.f6986Z = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        c0456a.f6987k0 = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        c0456a.f6988p0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        c0456a.f6963E0 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m23163b(C0456a c0456a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19977q1, viewGroup, false);
        m23162a(c0456a, viewInflate);
        return viewInflate;
    }
}
