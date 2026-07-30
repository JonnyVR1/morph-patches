package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class y5r {
    /* JADX INFO: renamed from: a */
    public static void m214314a(x5r x5rVar, View view) {
        x5rVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        x5rVar._empty = viewGroup.getChildAt(0);
        x5rVar._content = (VLinear) viewGroup.getChildAt(1);
        x5rVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        x5rVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
