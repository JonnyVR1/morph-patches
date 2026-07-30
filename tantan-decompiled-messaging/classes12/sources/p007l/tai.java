package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tai {
    /* JADX INFO: renamed from: a */
    public static void m14479a(FeedWriterLevelView feedWriterLevelView, View view) {
        feedWriterLevelView.f3148k = (FrameLayout) view;
        feedWriterLevelView.f3149l = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m14480b(FeedWriterLevelView feedWriterLevelView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11133T3, viewGroup, false);
        m14479a(feedWriterLevelView, viewInflate);
        return viewInflate;
    }
}
