package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class oyj {
    /* JADX INFO: renamed from: a */
    public static void m166670a(byj byjVar, View view) {
        byjVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        byjVar._empty = viewGroup.getChildAt(0);
        byjVar._content = (ConstraintLayout) viewGroup.getChildAt(1);
        byjVar._title = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        byjVar._close_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        byjVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        byjVar._rules_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        byjVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
