package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bvg {
    /* JADX INFO: renamed from: a */
    public static void m104032a(FeedComicFacePropMenuView feedComicFacePropMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFacePropMenuView.f40205a = (VText) viewGroup.getChildAt(0);
        feedComicFacePropMenuView.f40206b = (FeedCircleProgressBar) viewGroup.getChildAt(1);
        feedComicFacePropMenuView.f40207c = (FeedCircleProgressBar) viewGroup.getChildAt(2);
        feedComicFacePropMenuView.f40208d = (ImageView) viewGroup.getChildAt(3);
        feedComicFacePropMenuView.f40209e = (ImageView) viewGroup.getChildAt(4);
        feedComicFacePropMenuView.f40210f = (ViewPager2) viewGroup.getChildAt(5);
        feedComicFacePropMenuView.f40211g = (RecyclerView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m104033b(FeedComicFacePropMenuView feedComicFacePropMenuView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142209i0, viewGroup, false);
        m104032a(feedComicFacePropMenuView, viewInflate);
        return viewInflate;
    }
}
