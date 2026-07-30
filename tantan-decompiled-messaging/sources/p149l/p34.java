package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class p34 {
    /* JADX INFO: renamed from: a */
    public static void m167241a(o34 o34Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o34Var.f141610a = viewGroup.getChildAt(0);
        o34Var.f141611b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        o34Var.f141612c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        o34Var.f141613d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        o34Var.f141614e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        o34Var.f141615f = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        o34Var.f141616g = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        o34Var.f141617h = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        o34Var.f141618i = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        o34Var.f141619j = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        o34Var.f141620k = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        o34Var.f141621l = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m167242b(o34 o34Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168079K, viewGroup, false);
        m167241a(o34Var, viewInflate);
        return viewInflate;
    }
}
