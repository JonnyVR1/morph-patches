package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;
import p147v.VPager;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class tlh {
    /* JADX INFO: renamed from: a */
    public static void m189619a(slh slhVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        slhVar.f165213o = (VNavigationBar) viewGroup.getChildAt(0);
        slhVar.f165214p = (PhotoAlbumInterestedHeaderView) viewGroup.getChildAt(1);
        slhVar.f165215q = (FeedActivitiesTabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        slhVar.f165216r = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        slhVar.f165217s = (VPager) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m189620b(slh slhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142142Y1, viewGroup, false);
        m189619a(slhVar, viewInflate);
        return viewInflate;
    }
}
