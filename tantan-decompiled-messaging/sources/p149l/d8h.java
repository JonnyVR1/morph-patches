package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class d8h {
    /* JADX INFO: renamed from: a */
    public static void m110323a(FeedInteractionAct feedInteractionAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedInteractionAct.f41987c = (VNavigationBar) viewGroup.getChildAt(0);
        feedInteractionAct.f41988d = (TabLayout) viewGroup.getChildAt(1);
        feedInteractionAct.f41989e = (ViewPager) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m110324b(FeedInteractionAct feedInteractionAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142257p, viewGroup, false);
        m110323a(feedInteractionAct, viewInflate);
        return viewInflate;
    }
}
