package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;

/* JADX INFO: loaded from: classes12.dex */
public class tai {
    /* JADX INFO: renamed from: a */
    public static void m187723a(FeedWriterLevelView feedWriterLevelView, View view) {
        feedWriterLevelView.f41687k = (FrameLayout) view;
        feedWriterLevelView.f41688l = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187724b(FeedWriterLevelView feedWriterLevelView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142114T3, viewGroup, false);
        m187723a(feedWriterLevelView, viewInflate);
        return viewInflate;
    }
}
