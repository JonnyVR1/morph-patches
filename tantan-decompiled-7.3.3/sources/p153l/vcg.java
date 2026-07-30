package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class vcg {
    /* JADX INFO: renamed from: a */
    public static void m200807a(ucg ucgVar, View view) {
        ucgVar.f178425k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ucgVar.f178426l = viewGroup.getChildAt(0);
        ucgVar.f178427m = (VDraweeView) viewGroup.getChildAt(1);
        ucgVar.f178428n = (TextView) viewGroup.getChildAt(2);
        ucgVar.f178429o = (TextView) viewGroup.getChildAt(3);
        ucgVar.f178430p = (TextView) viewGroup.getChildAt(4);
        ucgVar.f178431q = (VProgressBar) viewGroup.getChildAt(5);
        ucgVar.f178432r = (TextView) viewGroup.getChildAt(6);
    }
}
