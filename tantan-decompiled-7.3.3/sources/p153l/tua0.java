package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VEditText;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class tua0 {
    /* JADX INFO: renamed from: a */
    public static void m192741a(sua0 sua0Var, View view) {
        sua0Var.f170661a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sua0Var.f170662b = (VText_Default_Bold) viewGroup.getChildAt(0);
        sua0Var.f170663c = (RelativeLayout) viewGroup.getChildAt(1);
        sua0Var.f170664d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sua0Var.f170665e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sua0Var.f170666f = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m192742b(sua0 sua0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167514H0, viewGroup, false);
        m192741a(sua0Var, viewInflate);
        return viewInflate;
    }
}
