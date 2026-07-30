package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamGuideView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class myh {
    /* JADX INFO: renamed from: a */
    public static void m160792a(FeedRoamGuideView feedRoamGuideView, View view) {
        feedRoamGuideView.f43309a = (FeedRoamGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedRoamGuideView.f43310b = (RelativeLayout) viewGroup.getChildAt(0);
        feedRoamGuideView.f43311c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedRoamGuideView.f43312d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedRoamGuideView.f43313e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedRoamGuideView.f43314f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedRoamGuideView.f43315g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        feedRoamGuideView.f43316h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
