package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lvd0 {
    /* JADX INFO: renamed from: a */
    public static void m155991a(jvd0 jvd0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jvd0Var.f122782a = (ConstraintLayout) viewGroup.getChildAt(0);
        jvd0Var.f122783b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jvd0Var.f122784c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jvd0Var.f122785d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jvd0Var.f122786e = (FrameLayout) viewGroup.getChildAt(1);
        jvd0Var.f122787f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jvd0Var.f122788g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        jvd0Var.f122789h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        jvd0Var.f122790i = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m155992b(jvd0 jvd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162534c2, viewGroup, false);
        m155991a(jvd0Var, viewInflate);
        return viewInflate;
    }
}
