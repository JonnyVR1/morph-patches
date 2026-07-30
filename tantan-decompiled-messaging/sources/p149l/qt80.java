package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qt80 {
    /* JADX INFO: renamed from: a */
    public static void m176409a(pt80 pt80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pt80Var.f151125a = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pt80Var.f151126b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pt80Var.f151127c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        pt80Var.f151128d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        pt80Var.f151129e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pt80Var.f151130f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pt80Var.f151131g = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        pt80Var.f151132h = (VPagerCircleIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        pt80Var.f151133i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
