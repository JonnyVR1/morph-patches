package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.C13030a;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalNewFirstRechargeGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uuv {
    /* JADX INFO: renamed from: a */
    public static void m198215a(C13030a c13030a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c13030a.f51785S = (PayItemView) viewGroup.getChildAt(0);
        c13030a.f51786T = (PayItemView) viewGroup.getChildAt(1);
        c13030a.f51787U = (VText) viewGroup.getChildAt(2);
        c13030a.f51788V = (Group) viewGroup.getChildAt(3);
        c13030a.f51789W = (ConstraintLayout) viewGroup.getChildAt(4);
        c13030a.f51790X = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        c13030a.f51791Y = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        c13030a.f51792Z = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        c13030a.f51793k0 = (LocalNewFirstRechargeGiftItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        c13030a.f51794p0 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        c13030a.f51769E0 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m198216b(C13030a c13030a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199213q1, viewGroup, false);
        m198215a(c13030a, viewInflate);
        return viewInflate;
    }
}
