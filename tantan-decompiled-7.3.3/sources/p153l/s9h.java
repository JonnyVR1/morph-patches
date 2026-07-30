package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class s9h {
    /* JADX INFO: renamed from: a */
    public static void m185176a(FeedInteractionAct feedInteractionAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionAct.f42835c = (VNavigationBar) viewGroup.getChildAt(0);
        feedInteractionAct.f42836d = (TabLayout) viewGroup.getChildAt(1);
        feedInteractionAct.f42837e = (ViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185177b(FeedInteractionAct feedInteractionAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173726p, viewGroup, false);
        m185176a(feedInteractionAct, viewInflate);
        return viewInflate;
    }
}
