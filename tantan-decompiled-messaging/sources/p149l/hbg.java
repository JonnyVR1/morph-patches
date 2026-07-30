package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class hbg {
    /* JADX INFO: renamed from: a */
    public static void m130329a(gbg gbgVar, View view) {
        gbgVar.f101845k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gbgVar.f101846l = viewGroup.getChildAt(0);
        gbgVar.f101847m = (VDraweeView) viewGroup.getChildAt(1);
        gbgVar.f101848n = (TextView) viewGroup.getChildAt(2);
        gbgVar.f101849o = (TextView) viewGroup.getChildAt(3);
        gbgVar.f101850p = (TextView) viewGroup.getChildAt(4);
        gbgVar.f101851q = (VProgressBar) viewGroup.getChildAt(5);
        gbgVar.f101852r = (TextView) viewGroup.getChildAt(6);
    }
}
