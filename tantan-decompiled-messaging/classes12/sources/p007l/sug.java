package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sug {
    /* JADX INFO: renamed from: a */
    public static void m14318a(FeedComicFaceItemView feedComicFaceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceItemView.f1659a = viewGroup.getChildAt(0);
        feedComicFaceItemView.f1660b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceItemView.f1661c = viewGroup.getChildAt(2);
        feedComicFaceItemView.f1662d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m14319b(FeedComicFaceItemView feedComicFaceItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11221h0, viewGroup, false);
        m14318a(feedComicFaceItemView, viewInflate);
        return viewInflate;
    }
}
