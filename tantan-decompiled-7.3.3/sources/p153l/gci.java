package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel.FeedWriterLevelTipsView;

/* JADX INFO: loaded from: classes13.dex */
public class gci {
    /* JADX INFO: renamed from: a */
    public static void m129888a(FeedWriterLevelTipsView feedWriterLevelTipsView, View view) {
        feedWriterLevelTipsView.f42614a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelTipsView.f42615b = (TextView) viewGroup.getChildAt(0);
        feedWriterLevelTipsView.f42616c = (ImageView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129889b(FeedWriterLevelTipsView feedWriterLevelTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173571R3, viewGroup, false);
        m129888a(feedWriterLevelTipsView, viewInflate);
        return viewInflate;
    }
}
