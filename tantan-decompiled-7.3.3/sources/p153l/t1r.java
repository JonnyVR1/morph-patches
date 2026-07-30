package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import p151v.VList_Horizontal;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class t1r {
    /* JADX INFO: renamed from: a */
    public static void m188931a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.f32403a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.f32404b = (VList_Horizontal) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        keyboard.f32405c = (AppBarLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        keyboard.f32406d = (TabLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        keyboard.f32407e = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
