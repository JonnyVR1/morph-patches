package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class fhh {
    /* JADX INFO: renamed from: a */
    public static void m125553a(FeedMomentPostStatusView feedMomentPostStatusView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentPostStatusView.f41655d = (VFrame) viewGroup.getChildAt(0);
        feedMomentPostStatusView.f41656e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f41657f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedMomentPostStatusView.f41658g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedMomentPostStatusView.f41659h = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125554b(FeedMomentPostStatusView feedMomentPostStatusView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173763u1, viewGroup, false);
        m125553a(feedMomentPostStatusView, viewInflate);
        return viewInflate;
    }
}
