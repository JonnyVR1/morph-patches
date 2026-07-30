package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes4.dex */
public class tay {
    /* JADX INFO: renamed from: a */
    public static void m187784a(fay fayVar, View view) {
        fayVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fayVar._empty = viewGroup.getChildAt(0);
        fayVar._content = (VLinear) viewGroup.getChildAt(1);
        fayVar._tabLayout = (TabLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fayVar._viewpager = (VPagerNoPage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
