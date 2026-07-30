package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class g920 {
    /* JADX INFO: renamed from: a */
    public static void m129512a(f920 f920Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f920Var.f97800b = (VNavigationBar) viewGroup.getChildAt(0);
        f920Var.f97801c = (FrameLayout) viewGroup.getChildAt(1);
        f920Var.f97802d = (StateScrollVIew) viewGroup.getChildAt(2);
        f920Var.f97803e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        f920Var.f97804f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        f920Var.f97805g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129513b(f920 f920Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125568P7, viewGroup, false);
        m129512a(f920Var, viewInflate);
        return viewInflate;
    }
}
