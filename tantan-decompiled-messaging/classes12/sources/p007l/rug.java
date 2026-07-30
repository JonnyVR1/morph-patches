package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rug {
    /* JADX INFO: renamed from: a */
    public static void m13968a(FeedComicFaceCategoryView feedComicFaceCategoryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceCategoryView.f1656a = viewGroup.getChildAt(0);
        feedComicFaceCategoryView.f1657b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceCategoryView.f1658c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m13969b(FeedComicFaceCategoryView feedComicFaceCategoryView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11214g0, viewGroup, false);
        m13968a(feedComicFaceCategoryView, viewInflate);
        return viewInflate;
    }
}
