package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bvg {
    /* JADX INFO: renamed from: a */
    public static void m9035a(FeedComicFacePropMenuView feedComicFacePropMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFacePropMenuView.f1666a = viewGroup.getChildAt(0);
        feedComicFacePropMenuView.f1667b = (FeedCircleProgressBar) viewGroup.getChildAt(1);
        feedComicFacePropMenuView.f1668c = (FeedCircleProgressBar) viewGroup.getChildAt(2);
        feedComicFacePropMenuView.f1669d = (ImageView) viewGroup.getChildAt(3);
        feedComicFacePropMenuView.f1670e = (ImageView) viewGroup.getChildAt(4);
        feedComicFacePropMenuView.f1671f = viewGroup.getChildAt(5);
        feedComicFacePropMenuView.f1672g = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m9036b(FeedComicFacePropMenuView feedComicFacePropMenuView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11228i0, viewGroup, false);
        m9035a(feedComicFacePropMenuView, viewInflate);
        return viewInflate;
    }
}
