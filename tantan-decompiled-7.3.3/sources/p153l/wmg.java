package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedActivitiesView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wmg {
    /* JADX INFO: renamed from: a */
    public static void m207107a(FeedActivitiesView feedActivitiesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedActivitiesView.f43189d = (VRelative) viewGroup.getChildAt(0);
        feedActivitiesView.f43190e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedActivitiesView.f43191f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        feedActivitiesView.f43192g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m207108b(FeedActivitiesView feedActivitiesView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173684j, viewGroup, false);
        m207107a(feedActivitiesView, viewInflate);
        return viewInflate;
    }
}
