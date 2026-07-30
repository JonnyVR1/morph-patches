package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;

/* JADX INFO: loaded from: classes13.dex */
public class gtw {
    /* JADX INFO: renamed from: a */
    public static void m132258a(MakeUpMenuView makeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        makeUpMenuView.f40584a = viewGroup.getChildAt(0);
        makeUpMenuView.f40585b = (ViewPager2) viewGroup.getChildAt(1);
        makeUpMenuView.f40586c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        makeUpMenuView.f40587d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        makeUpMenuView.f40588e = (ViewPager2) viewGroup.getChildAt(3);
    }
}
