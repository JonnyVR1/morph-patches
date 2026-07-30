package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedActivitiesView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class hlg {
    /* JADX INFO: renamed from: a */
    public static void m131653a(FeedActivitiesView feedActivitiesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedActivitiesView.f42341d = (VRelative) viewGroup.getChildAt(0);
        feedActivitiesView.f42342e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedActivitiesView.f42343f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedActivitiesView.f42344g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m131654b(FeedActivitiesView feedActivitiesView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142215j, viewGroup, false);
        m131653a(feedActivitiesView, viewInflate);
        return viewInflate;
    }
}
