package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel.FeedWriterLevelTipsView;

/* JADX INFO: loaded from: classes12.dex */
public class rai {
    /* JADX INFO: renamed from: a */
    public static void m178494a(FeedWriterLevelTipsView feedWriterLevelTipsView, View view) {
        feedWriterLevelTipsView.f41766a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelTipsView.f41767b = (TextView) viewGroup.getChildAt(0);
        feedWriterLevelTipsView.f41768c = (ImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m178495b(FeedWriterLevelTipsView feedWriterLevelTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142102R3, viewGroup, false);
        m178494a(feedWriterLevelTipsView, viewInflate);
        return viewInflate;
    }
}
