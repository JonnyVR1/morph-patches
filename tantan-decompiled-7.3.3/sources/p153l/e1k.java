package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class e1k {
    /* JADX INFO: renamed from: a */
    public static void m118983a(r0k r0kVar, View view) {
        r0kVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r0kVar._empty = viewGroup.getChildAt(0);
        r0kVar._content = (ConstraintLayout) viewGroup.getChildAt(1);
        r0kVar._title = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        r0kVar._close_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        r0kVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        r0kVar._rules_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        r0kVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
