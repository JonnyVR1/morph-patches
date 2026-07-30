package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;
import p151v.VPager;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class inh {
    /* JADX INFO: renamed from: a */
    public static void m141129a(hnh hnhVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hnhVar.f110755o = (VNavigationBar) viewGroup.getChildAt(0);
        hnhVar.f110756p = (PhotoAlbumInterestedHeaderView) viewGroup.getChildAt(1);
        hnhVar.f110757q = (FeedActivitiesTabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hnhVar.f110758r = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hnhVar.f110759s = (VPager) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m141130b(hnh hnhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173611Y1, viewGroup, false);
        m141129a(hnhVar, viewInflate);
        return viewInflate;
    }
}
