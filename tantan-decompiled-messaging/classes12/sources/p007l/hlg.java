package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedActivitiesView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hlg {
    /* JADX INFO: renamed from: a */
    public static void m10647a(FeedActivitiesView feedActivitiesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedActivitiesView.f3802d = viewGroup.getChildAt(0);
        feedActivitiesView.f3803e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedActivitiesView.f3804f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedActivitiesView.f3805g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10648b(FeedActivitiesView feedActivitiesView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11234j, viewGroup, false);
        m10647a(feedActivitiesView, viewInflate);
        return viewInflate;
    }
}
