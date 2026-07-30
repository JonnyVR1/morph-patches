package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import p151v.VFrame;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class laf0 {
    /* JADX INFO: renamed from: a */
    public static void m153473a(kaf0 kaf0Var, View view) {
        kaf0Var.f124653a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kaf0Var.f124654b = (LinearLayout) viewGroup.getChildAt(0);
        kaf0Var.f124655c = (SidesSlipHeadItemView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kaf0Var.f124656d = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        kaf0Var.f124657e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m153474b(kaf0 kaf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125680W7, viewGroup, false);
        m153473a(kaf0Var, viewInflate);
        return viewInflate;
    }
}
