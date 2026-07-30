package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class ocm0 {
    /* JADX INFO: renamed from: a */
    public static void m167233a(ncm0 ncm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ncm0Var.f141382k = viewGroup.getChildAt(0);
        ncm0Var.f141383l = (ConstraintLayout) viewGroup.getChildAt(1);
        ncm0Var.f141384m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ncm0Var.f141385n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ncm0Var.f141386o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ncm0Var.f141387p = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ncm0Var.f141388q = (Button) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
