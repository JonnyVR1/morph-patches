package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;

/* JADX INFO: loaded from: classes13.dex */
public class gwg {
    /* JADX INFO: renamed from: a */
    public static void m132681a(FeedComicFaceCategoryView feedComicFaceCategoryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceCategoryView.f41043a = viewGroup.getChildAt(0);
        feedComicFaceCategoryView.f41044b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceCategoryView.f41045c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m132682b(FeedComicFaceCategoryView feedComicFaceCategoryView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173664g0, viewGroup, false);
        m132681a(feedComicFaceCategoryView, viewInflate);
        return viewInflate;
    }
}
