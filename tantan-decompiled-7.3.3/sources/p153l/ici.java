package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;

/* JADX INFO: loaded from: classes13.dex */
public class ici {
    /* JADX INFO: renamed from: a */
    public static void m139440a(FeedWriterLevelView feedWriterLevelView, View view) {
        feedWriterLevelView.f42535k = (FrameLayout) view;
        feedWriterLevelView.f42536l = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m139441b(FeedWriterLevelView feedWriterLevelView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173583T3, viewGroup, false);
        m139440a(feedWriterLevelView, viewInflate);
        return viewInflate;
    }
}
