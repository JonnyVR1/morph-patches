package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class x3r {
    /* JADX INFO: renamed from: a */
    public static void m206945a(w3r w3rVar, View view) {
        w3rVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w3rVar._empty = viewGroup.getChildAt(0);
        w3rVar._content = (VLinear) viewGroup.getChildAt(1);
        w3rVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        w3rVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
