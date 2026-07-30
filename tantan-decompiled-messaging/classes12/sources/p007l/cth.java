package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cth {
    /* JADX INFO: renamed from: a */
    public static void m9243a(FeedPostGuideThreeView feedPostGuideThreeView, View view) {
        feedPostGuideThreeView.f3778c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideThreeView.f3779d = viewGroup.getChildAt(0);
        feedPostGuideThreeView.f3780e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9244b(FeedPostGuideThreeView feedPostGuideThreeView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11349z2, viewGroup, false);
        m9243a(feedPostGuideThreeView, viewInflate);
        return viewInflate;
    }
}
