package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;

/* JADX INFO: loaded from: classes12.dex */
public class hqw {
    /* JADX INFO: renamed from: a */
    public static void m132609a(MakeUpMenuView makeUpMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        makeUpMenuView.f39736a = viewGroup.getChildAt(0);
        makeUpMenuView.f39737b = (ViewPager2) viewGroup.getChildAt(1);
        makeUpMenuView.f39738c = (TabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        makeUpMenuView.f39739d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        makeUpMenuView.f39740e = (ViewPager2) viewGroup.getChildAt(3);
    }
}
