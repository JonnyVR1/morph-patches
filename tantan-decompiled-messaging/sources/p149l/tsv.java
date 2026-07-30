package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.C12867a;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tsv {
    /* JADX INFO: renamed from: a */
    public static void m190573a(C12867a c12867a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c12867a.f50937S = (PayItemView) viewGroup.getChildAt(0);
        c12867a.f50938T = (PayItemView) viewGroup.getChildAt(1);
        c12867a.f50939U = (VText) viewGroup.getChildAt(2);
        c12867a.f50940V = (Group) viewGroup.getChildAt(3);
        c12867a.f50941W = (ConstraintLayout) viewGroup.getChildAt(4);
        c12867a.f50942X = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        c12867a.f50943Y = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        c12867a.f50944Z = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        c12867a.f50945k0 = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        c12867a.f50946p0 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        c12867a.f50921E0 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m190574b(C12867a c12867a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168481q1, viewGroup, false);
        m190573a(c12867a, viewInflate);
        return viewInflate;
    }
}
