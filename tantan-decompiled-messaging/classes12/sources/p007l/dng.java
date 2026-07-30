package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dng {
    /* JADX INFO: renamed from: a */
    public static void m9520a(FeedAttitudeTipsView feedAttitudeTipsView, View view) {
        feedAttitudeTipsView.f3230a = (VFrame) view;
        feedAttitudeTipsView.f3231b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9521b(FeedAttitudeTipsView feedAttitudeTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11063I, viewGroup, false);
        m9520a(feedAttitudeTipsView, viewInflate);
        return viewInflate;
    }
}
