package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel.FeedWriterLevelTipsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rai {
    /* JADX INFO: renamed from: a */
    public static void m13890a(FeedWriterLevelTipsView feedWriterLevelTipsView, View view) {
        feedWriterLevelTipsView.f3227a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelTipsView.f3228b = (TextView) viewGroup.getChildAt(0);
        feedWriterLevelTipsView.f3229c = (ImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13891b(FeedWriterLevelTipsView feedWriterLevelTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11121R3, viewGroup, false);
        m13890a(feedWriterLevelTipsView, viewInflate);
        return viewInflate;
    }
}
