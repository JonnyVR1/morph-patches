package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class qjy {
    /* JADX INFO: renamed from: a */
    public static void m176905a(cjy cjyVar, View view) {
        cjyVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cjyVar._empty = viewGroup.getChildAt(0);
        cjyVar._content = (VLinear) viewGroup.getChildAt(1);
        cjyVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        cjyVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
