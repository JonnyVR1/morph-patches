package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class nem0 {
    /* JADX INFO: renamed from: a */
    public static void m159120a(mem0 mem0Var, View view) {
        mem0Var.f133453k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mem0Var.f133454l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mem0Var.f133455m = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mem0Var.f133456n = (VPagerNoPage) viewGroup.getChildAt(1);
    }
}
