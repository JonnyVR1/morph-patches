package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.p053ui.messages.view.KeyboardMediaLayout;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class myq {
    /* JADX INFO: renamed from: a */
    public static void m157090a(KeyboardMediaLayout keyboardMediaLayout, View view) {
        keyboardMediaLayout.f32366a = (KeyboardMediaLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        keyboardMediaLayout.f32367b = (ViewPager) viewGroup.getChildAt(0);
        keyboardMediaLayout.f32368c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
