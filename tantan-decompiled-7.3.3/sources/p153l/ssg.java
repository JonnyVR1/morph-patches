package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedCanVoteContentView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;

/* JADX INFO: loaded from: classes13.dex */
public class ssg {
    /* JADX INFO: renamed from: a */
    public static void m187708a(FeedCanVoteContentView feedCanVoteContentView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCanVoteContentView.f43196a = (TextView) viewGroup.getChildAt(0);
        feedCanVoteContentView.f43197b = (TextView) viewGroup.getChildAt(1);
        feedCanVoteContentView.f43198c = (FeedVoteContainer) viewGroup.getChildAt(2);
        feedCanVoteContentView.f43199d = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m187709b(FeedCanVoteContentView feedCanVoteContentView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173541M3, viewGroup, false);
        m187708a(feedCanVoteContentView, viewInflate);
        return viewInflate;
    }
}
