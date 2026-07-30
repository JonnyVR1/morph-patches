package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.p002ui.welcome.VText_Medium;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cwp0 {
    /* JADX INFO: renamed from: a */
    public static void m13682a(bwp0 bwp0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bwp0Var.f9168c = viewGroup.getChildAt(0);
        bwp0Var.f9169d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        bwp0Var.f9170e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bwp0Var.f9171f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bwp0Var.f9172g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bwp0Var.f9173h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        bwp0Var.f9174i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        bwp0Var.f9175j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        bwp0Var.f9176k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        bwp0Var.f9177l = (LinearLayout) viewGroup.getChildAt(1);
        bwp0Var.f9178m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bwp0Var.f9179n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bwp0Var.f9180o = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        bwp0Var.f9181p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        bwp0Var.f9182q = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        bwp0Var.f9183r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        bwp0Var.f9184s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        bwp0Var.f9185t = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        bwp0Var.f9186u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        bwp0Var.f9187v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        bwp0Var.f9188w = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        bwp0Var.f9189x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        bwp0Var.f9190y = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        bwp0Var.f9191z = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        bwp0Var.f9140A = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        bwp0Var.f9141B = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        bwp0Var.f9142C = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        bwp0Var.f9143D = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        bwp0Var.f9144E = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        bwp0Var.f9145F = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        bwp0Var.f9146G = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        bwp0Var.f9147H = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        bwp0Var.f9148I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        bwp0Var.f9149J = viewGroup.getChildAt(2);
        bwp0Var.f9150K = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bwp0Var.f9151L = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13683b(bwp0 bwp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9446o0, viewGroup, false);
        m13682a(bwp0Var, viewInflate);
        return viewInflate;
    }
}
