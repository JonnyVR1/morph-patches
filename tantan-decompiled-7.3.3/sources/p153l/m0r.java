package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.p058ui.messages.view.KeyboardMediaLayout;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class m0r {
    /* JADX INFO: renamed from: a */
    public static void m156522a(KeyboardMediaLayout keyboardMediaLayout, View view) {
        keyboardMediaLayout.f33214a = (KeyboardMediaLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        keyboardMediaLayout.f33215b = (ViewPager) viewGroup.getChildAt(0);
        keyboardMediaLayout.f33216c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
