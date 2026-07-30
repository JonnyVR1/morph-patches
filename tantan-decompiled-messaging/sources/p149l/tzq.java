package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import p147v.VList_Horizontal;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class tzq {
    /* JADX INFO: renamed from: a */
    public static void m191213a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.f31555a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.f31556b = (VList_Horizontal) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        keyboard.f31557c = (AppBarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        keyboard.f31558d = (TabLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        keyboard.f31559e = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
