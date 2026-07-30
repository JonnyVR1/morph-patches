package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class rnm0 {
    /* JADX INFO: renamed from: a */
    public static void m182319a(qnm0 qnm0Var, View view) {
        qnm0Var.f158498k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qnm0Var.f158499l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qnm0Var.f158500m = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qnm0Var.f158501n = (VPagerNoPage) viewGroup.getChildAt(1);
    }
}
