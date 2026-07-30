package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;

/* JADX INFO: loaded from: classes12.dex */
public class rug {
    /* JADX INFO: renamed from: a */
    public static void m180869a(FeedComicFaceCategoryView feedComicFaceCategoryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceCategoryView.f40195a = viewGroup.getChildAt(0);
        feedComicFaceCategoryView.f40196b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceCategoryView.f40197c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m180870b(FeedComicFaceCategoryView feedComicFaceCategoryView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142195g0, viewGroup, false);
        m180869a(feedComicFaceCategoryView, viewInflate);
        return viewInflate;
    }
}
