package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class y020 {
    /* JADX INFO: renamed from: a */
    public static void m212028a(x020 x020Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        x020Var.f188907b = (VNavigationBar) viewGroup.getChildAt(0);
        x020Var.f188908c = (FrameLayout) viewGroup.getChildAt(1);
        x020Var.f188909d = (StateScrollVIew) viewGroup.getChildAt(2);
        x020Var.f188910e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        x020Var.f188911f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        x020Var.f188912g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m212029b(x020 x020Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95402I7, viewGroup, false);
        m212028a(x020Var, viewInflate);
        return viewInflate;
    }
}
