package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xwh {
    /* JADX INFO: renamed from: a */
    public static void m16865a(FeedRoamGuideView feedRoamGuideView, View view) {
        feedRoamGuideView.f3922a = (FeedRoamGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedRoamGuideView.f3923b = (RelativeLayout) viewGroup.getChildAt(0);
        feedRoamGuideView.f3924c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedRoamGuideView.f3925d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedRoamGuideView.f3926e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedRoamGuideView.f3927f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedRoamGuideView.f3928g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        feedRoamGuideView.f3929h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
