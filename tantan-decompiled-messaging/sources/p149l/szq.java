package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import p147v.VButton_FakeShadow;
import p147v.VFrame;
import p147v.VList_Horizontal;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class szq {
    /* JADX INFO: renamed from: a */
    public static void m186796a(Keyboard keyboard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        keyboard.f31560f = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        keyboard.f31561g = (VPagerCircleIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        keyboard.f31562h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        keyboard.f31563i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        keyboard.f31564j = (VList_Horizontal) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        keyboard.f31565k = (VFrame) viewGroup.getChildAt(1);
        keyboard.f31566l = (VFrame) viewGroup.getChildAt(2);
        keyboard.f31567m = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
