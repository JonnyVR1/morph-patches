package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class sug {
    /* JADX INFO: renamed from: a */
    public static void m186012a(FeedComicFaceItemView feedComicFaceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceItemView.f40198a = (VDraweeView) viewGroup.getChildAt(0);
        feedComicFaceItemView.f40199b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceItemView.f40200c = viewGroup.getChildAt(2);
        feedComicFaceItemView.f40201d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m186013b(FeedComicFaceItemView feedComicFaceItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142202h0, viewGroup, false);
        m186012a(feedComicFaceItemView, viewInflate);
        return viewInflate;
    }
}
