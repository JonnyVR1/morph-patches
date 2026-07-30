package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedRoamGuideView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xwh {
    /* JADX INFO: renamed from: a */
    public static void m211336a(FeedRoamGuideView feedRoamGuideView, View view) {
        feedRoamGuideView.f42461a = (FeedRoamGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedRoamGuideView.f42462b = (RelativeLayout) viewGroup.getChildAt(0);
        feedRoamGuideView.f42463c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedRoamGuideView.f42464d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedRoamGuideView.f42465e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedRoamGuideView.f42466f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedRoamGuideView.f42467g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        feedRoamGuideView.f42468h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }
}
