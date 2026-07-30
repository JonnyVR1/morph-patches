package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class o44 {
    /* JADX INFO: renamed from: a */
    public static void m165967a(n44 n44Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        n44Var.f140166a = viewGroup.getChildAt(0);
        n44Var.f140167b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        n44Var.f140168c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        n44Var.f140169d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        n44Var.f140170e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        n44Var.f140171f = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        n44Var.f140172g = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        n44Var.f140173h = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        n44Var.f140174i = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        n44Var.f140175j = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        n44Var.f140176k = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        n44Var.f140177l = (CallManageItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m165968b(n44 n44Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198811K, viewGroup, false);
        m165967a(n44Var, viewInflate);
        return viewInflate;
    }
}
