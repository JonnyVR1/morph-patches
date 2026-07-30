package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class j7o0 {
    /* JADX INFO: renamed from: a */
    public static void m143787a(i7o0 i7o0Var, View view) {
        i7o0Var.f113280k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        i7o0Var.f113281l = (TabLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        i7o0Var.f113282m = (VPagerNoPage) viewGroup.getChildAt(1);
    }
}
