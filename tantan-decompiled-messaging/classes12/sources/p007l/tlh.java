package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumInterestedHeaderView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedActivitiesTabLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tlh {
    /* JADX INFO: renamed from: a */
    public static void m14564a(slh slhVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        slhVar.f12981o = viewGroup.getChildAt(0);
        slhVar.f12982p = (PhotoAlbumInterestedHeaderView) viewGroup.getChildAt(1);
        slhVar.f12983q = (FeedActivitiesTabLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        slhVar.f12984r = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        slhVar.f12985s = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m14565b(slh slhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11161Y1, viewGroup, false);
        m14564a(slhVar, viewInflate);
        return viewInflate;
    }
}
